package com.hyder.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;



/** 
 * BaseTest class contains all common functionalities and variables 
 * of test classes and all test classes extend this BaseTest class. 
 * This is one of the main features of Object Oriented Design (OOD) “Inheritance“. 
 * 
 * @author hyder
 *
 */

public class BaseTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static  void setUp() {
		WebDriverManager.firefoxdriver().setup();
	   //Create a firefox driver. All test classes use this.
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}


