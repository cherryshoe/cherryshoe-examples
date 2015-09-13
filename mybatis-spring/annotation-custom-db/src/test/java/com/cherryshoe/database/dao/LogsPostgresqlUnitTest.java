package com.cherryshoe.database.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cherryshoe.database.BaseTestCase;
import com.cherryshoe.database.dao.LogsDao;
import com.cherryshoe.database.domain.Logs;

/*
 * This unit test class can be run when the spring-custom-database-test.xml defaultDataSource
 * is set to postgresql. There's nothing really different about these three different integration test classes
 * except the data it assumes you have on each of the three dbs.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=
{
	"/spring/spring-custom-database-test.xml"
})
@Ignore // comment this out if you want it to run
public class LogsPostgresqlUnitTest extends BaseTestCase {

	@Autowired
	LogsDao service;
	
	@Test
	public void getByLogsId_postgresql() {
		Integer logsId = 100;
		Logs logs = service.getLogsById(logsId);
		System.out.println(logs.toString());
		assertEquals(logsId, logs.getLogsId());
	}
	
	@Test
	public void getBySentDateRange_postgresql() {
		String fromTimestamp = "19/08/2015 00:00:00";
		String toTimestamp = "19/08/2015 23:59:59";
		List<Logs> logs = service.getLogsSentDateRange(fromTimestamp, toTimestamp);
		assertTrue(logs.size() > 0);
		
		for (Logs curr: logs) {
			System.out.println(curr.toString());
		}
	}
}
