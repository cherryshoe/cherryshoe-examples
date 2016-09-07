package com.cherryshoe.database.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cherryshoe.database.BaseTestCase;
import com.cherryshoe.database.dao.CherryShoeStatusDao;
import com.cherryshoe.database.domain.Status;
import com.cherryshoe.database.domain.StatusEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=
{
	"/spring/spring-custom-database-test.xml"
})

public class CherryshoeStatusDaoTest extends BaseTestCase {

	@Autowired
	CherryShoeStatusDao service;
	
	@Test
	public void createStatus_notProcessed() {
		String id = UUID.randomUUID().toString();
		Integer statusStatus = StatusEnum.NOT_PROCESSED.getStatus();
		String statusRequest = "statusRequestTestCreateStatus";
		
		Status status = createStatus(id, statusStatus, statusRequest);
		String statusId = status.getStatusId();

		// test that it was created in DB
		Status retStatus = service.getStatus(statusId);
		System.out.println(retStatus.toString());
		
		assertEquals(status, retStatus);
	}
	
	@Test
	public void updateStatus_inProcess() {
		String statusId = UUID.randomUUID().toString();
		Integer statusStatus = StatusEnum.NOT_PROCESSED.getStatus();
		String statusRequest = "statusRequestTestUpdateStatus";
		
		Status status = createStatus(statusId, statusStatus, statusRequest);
		String retStatusId = status.getStatusId();

		Integer updateStatusStatus = StatusEnum.IN_PROCESS.getStatus();
		String updateStatusRequest = "statusRequestTestUpdateStatus2";
		status.setStatusStatus(updateStatusStatus);
		status.setStatusRequest(updateStatusRequest);
		
		// new timestamp
		Date now = Calendar.getInstance().getTime();
		Timestamp modifyTimestamp = new Timestamp(now.getTime());
		status.setStatusModifiedDate(modifyTimestamp);
		
		// test that it was created in DB
		service.updateStatus(status);
		
		Status retStatus = service.getStatus(retStatusId);
		System.out.println(retStatus.toString());
		
		assertEquals(retStatus.getStatusStatus(), updateStatusStatus);
		assertEquals(retStatus.getStatusRequest(), updateStatusRequest);
	}
	
	@Test
	public void createStatus_andupdate_processed() {
		String statusId = UUID.randomUUID().toString();
		Integer statusStatus = StatusEnum.IN_PROCESS.getStatus();
		String statusRequest = "statusRequestTestCreateStatus";
		
		Status status = createStatus(statusId, statusStatus, statusRequest);
		String retStatusId = status.getStatusId();

		// test that it was created in DB
		Status retStatus = service.getStatus(statusId);
		assertEquals(status, retStatus);
		
		// update
		status.setStatusStatus(StatusEnum.PROCESSED.getStatus());
		// new timestamp
		Date now = Calendar.getInstance().getTime();
		Timestamp modifyTimestamp = new Timestamp(now.getTime());
		status.setStatusModifiedDate(modifyTimestamp);
		
		service.updateStatus(status);
		retStatus = service.getStatus(retStatusId);
		System.out.println(retStatus.toString());
		
		assertEquals(status, retStatus);
		
	}
	
	protected Status createStatus(String statusId, Integer statusStatus, String statusRequest) {	
		Status status = new Status();
		status.setStatusId(statusId);
		status.setStatusRequest(statusRequest);
		status.setStatusStatus(statusStatus);
		
		Date now = Calendar.getInstance().getTime();
		Timestamp timestamp = new Timestamp(now.getTime());
		status.setStatusCreateDate(timestamp);
		status.setStatusModifiedDate(timestamp);
		
		service.insertStatus(status);
		return status;
	}
	
	
}
