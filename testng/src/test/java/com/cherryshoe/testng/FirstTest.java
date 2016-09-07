package com.cherryshoe.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest 
{
	private String status;
	
    @BeforeMethod
    public void setUp() throws Exception {
    	status = "setup";
    	System.out.println("status[" + status + "]");
    }

    @Test
    public void firstTest() throws Exception {
    	status = "firstTest";
    	System.out.println("status[" + status + "]");
    }
   
    @Test
    public void secondTest() throws Exception {
    	status = "secondTest";
    	System.out.println("status[" + status + "]");
    }
}