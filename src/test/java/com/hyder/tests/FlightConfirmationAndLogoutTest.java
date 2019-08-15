package com.hyder.tests;

import org.testng.annotations.Test;

import com.hyder.pages.BookAFlightPage;
import com.hyder.pages.FindAFlightPage;
import com.hyder.pages.FlightConfirmationPage;
import com.hyder.pages.HomePage;
import com.hyder.pages.SelectAFlightPage;
import com.hyder.pages.SignOnPage;

public class FlightConfirmationAndLogoutTest extends BaseTest {
	
	@Test
	public void confirmFlightTest() {
		HomePage hp = new HomePage(driver);
		hp.goToNewTours();
		hp.goToSignOnPage();
		
		SignOnPage sop = new SignOnPage(driver);
		sop.signInToNewTours();
		
		FindAFlightPage fafp = new FindAFlightPage(driver);
		fafp.findAFlight();
		
		SelectAFlightPage safp = new SelectAFlightPage(driver);
		safp.selectAFlight();
		
		BookAFlightPage bafp = new BookAFlightPage(driver);
		bafp.bookAFlight();
		
		FlightConfirmationPage fcp = new FlightConfirmationPage(driver);
		fcp.confirmAndLogout();
		System.out.println("Test Ends, bye bye newtours.");
		
		
	}

}

