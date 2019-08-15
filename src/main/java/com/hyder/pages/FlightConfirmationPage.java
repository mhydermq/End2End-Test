package com.hyder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightConfirmationPage extends BasePage{
	
	public FlightConfirmationPage(WebDriver driver) {
		super(driver);
		
	}
	
	//page elements
	//page methods
	public void confirmAndLogout() {
		click(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td"
				+ "/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
	}

}
