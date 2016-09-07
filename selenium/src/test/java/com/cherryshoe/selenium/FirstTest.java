package com.cherryshoe.selenium;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest 
{
	private WebDriver driver;
	
    @Before
    public void setUp() throws Exception {
    	// chromedriver path is in the $PATH already
    	driver = new ChromeDriver();
    }

    @Test
    public void firstTest() throws Exception {
    	driver.get("http://www.google.com");
    	
    	// sleep to let DOM load
    	Thread.sleep(5000);
    	// find the search box by name
    	WebElement searchTextBox = driver.findElement(By.name("q"));
    	assertNotNull(searchTextBox);

    	// enter in a search term and see results
    	searchTextBox.sendKeys("codified selenium");
    	searchTextBox.submit();
    	Thread.sleep(5000);
    }
    
    @After
    public void tearDown() throws Exception {
    	System.out.println("Tearing down");
    	// close driver (and browser)
    	driver.quit();
    }
}