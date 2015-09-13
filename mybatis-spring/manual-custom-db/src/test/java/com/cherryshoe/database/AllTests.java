package com.cherryshoe.database;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cherryshoe.database.dao.LogsHsqlDbUnitTest;

@RunWith(Suite.class)
@Suite.SuiteClasses
	({
		LogsHsqlDbUnitTest.class
	})
public class AllTests {}
