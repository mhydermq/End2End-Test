package com.hyder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectAFlightPage extends BasePage {
	
	public SelectAFlightPage(WebDriver driver) {
		super(driver);
		
	}
	
	//page elements
	//page methods
	public void selectAFlight() {
		click(By.name("reserveFlights"));
	}

}