package com.hyder.tests;

import org.testng.annotations.Test;

import com.hyder.pages.FindAFlightPage;
import com.hyder.pages.HomePage;
import com.hyder.pages.SelectAFlightPage;
import com.hyder.pages.SignOnPage;

public class SelectAFlightTest extends BaseTest {
	
	@Test
	public void selectAFlightTest() {
		HomePage homepage = new HomePage(driver);
		SignOnPage signOnpage = new SignOnPage(driver);
		FindAFlightPage findaflightpage = new FindAFlightPage(driver);
		SelectAFlightPage selectaflightpage = new SelectAFlightPage(driver);
		
		homepage.goToNewTours();
		homepage.goToSignOnPage();
		signOnpage.signInToNewTours();
		findaflightpage.findAFlight();				
		selectaflightpage.selectAFlight();
	}
}

