package com.hyder.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAFlightPage extends BasePage {
	
	public BookAFlightPage(WebDriver driver) {
		super(driver);
	}
	
	//code goes here		
    //page elements
	//page methods
		
	//method for click on buyFlights button
	public void bookAFlight() {
			click(By.name("buyFlights"));			
		}				
	} 

