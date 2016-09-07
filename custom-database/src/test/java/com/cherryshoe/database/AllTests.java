package com.cherryshoe.database;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cherryshoe.database.dao.CherryshoeStatusDaoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses
	({
		CherryshoeStatusDaoTest.class
	})
public class AllTests {}
