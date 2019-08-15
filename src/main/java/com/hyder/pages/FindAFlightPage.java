package com.hyder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindAFlightPage extends BasePage {
	
	//constructor
	public FindAFlightPage(WebDriver driver) {
		super(driver);		
	}
	
	//page elements	
	//String roundTrip_radioButton="roundTrip_radioButton";
	//String oneWay_rarioButton="oneWay_radioButton";
	//String dropDownListBoxPassCount = "dropDownListBoxPassCount";
	String btnContinue = "findFlights";
	
	//page methods
	
	//click on continue button
	public void findAFlight() {
	click(By.name("findFlights"));
	}
}
