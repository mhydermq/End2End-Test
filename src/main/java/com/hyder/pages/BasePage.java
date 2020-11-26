package com.hyder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



/**
 * 
 * @author hyder
 * BasePage class. BasePage class contains the common methods 
 * of all page classes such as click, writeText, readText, 
 * assertEquals etc.
 *
 */

public class BasePage {
	
	public  WebDriver driver;
	private BasePage Assert; 
	
	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//write text method
	public void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);		
		
	}
	
	//read text method
	public String readText(By elementLocation) {
		return ((WebElement) driver.findElement(elementLocation)).getText();
		
		
	}
	
	//click method
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}
	
	//selecting radio button
	
	// selecting dropdown list
	public void select(By elementLocation) {
		driver.findElement(elementLocation).click();
		
	}
	
	//Assert
	public void assertEquals(String elementLocation, String expectedText) {
		Assert.assertEquals(readText(elementLocation),expectedText);
		
	}

	private String readText(String elementLocation) {
		return null;
	}
	
		
	}

