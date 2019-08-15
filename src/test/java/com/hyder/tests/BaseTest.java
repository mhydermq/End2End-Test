package com.hyder.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



/** 
 * BaseTest class contains all common functionalities and variables 
 * of test classes and all test classes extend this BaseTest class. 
 * This is one of the main features of Object Oriented Design (OOD) “Inheritance“. 
 * 
 * @author hyder
 *
 */

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		//path to the driver executeable
		System.setProperty("webdriver.gecko.driver", 
		"C:\\Users\\hyder\\Downloads\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	   //Create a Chrome driver. All test classes use this.
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

