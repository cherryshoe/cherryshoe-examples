package com.cherryshoe.database.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
 * is set to hsqldb. There's nothing really different about these three different integration test classes
 * except the data it assumes you have on each of the three dbs.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=
{
	"/spring/spring-custom-database-test.xml"
})

public class LogsHsqlDbUnitTest extends BaseTestCase {

	@Autowired
	LogsDao service;
	
	@Test
	public void getByLogsId_hsqldb() {
		
		Integer logsId = 0;
		Logs logs = service.getLogsById(logsId);
		assertEquals(logs, null);
		// this only tests the sql statement is correct, no data inserted, so can't find any data
	}
	
	@Test
	public void getBySentDateRange_hsqldb() {
		String fromTimestamp = "19/08/2015 00:00:00";
		String toTimestamp = "19/08/2015 23:59:59";
		
		List<Logs> logs = service.getLogsSentDateRange(fromTimestamp, toTimestamp);
		assertEquals(logs.size(), 0);
		// this only tests the sql statement is correct, no data inserted, so can't find any data
	}
}
