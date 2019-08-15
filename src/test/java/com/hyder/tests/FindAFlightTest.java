package com.hyder.tests;

import org.testng.annotations.Test;

import com.hyder.pages.FindAFlightPage;
import com.hyder.pages.HomePage;
import com.hyder.pages.SignOnPage;

public class FindAFlightTest extends BaseTest {
	
	@Test
	public void findAFlightTest() {
		
		HomePage homepage = new HomePage(driver);
		SignOnPage signOnpage = new SignOnPage(driver);
		FindAFlightPage findAFlightpage = new FindAFlightPage(driver);
		homepage.goToNewTours();
		homepage.goToSignOnPage();
		signOnpage.signInToNewTours();
		findAFlightpage.findAFlight();
		
	}

}

