package com.hyder.tests;

import org.testng.annotations.Test;

import com.hyder.pages.BookAFlightPage;
import com.hyder.pages.FindAFlightPage;
import com.hyder.pages.HomePage;
import com.hyder.pages.SelectAFlightPage;
import com.hyder.pages.SignOnPage;

public class BookAFlightTest extends BaseTest {
	
	@Test
	public void bookAFlight() {
		
		HomePage homepage = new HomePage(driver);
		homepage.goToNewTours();
		homepage.goToSignOnPage();
		
		SignOnPage sop = new SignOnPage(driver);
		sop.signInToNewTours();
		
		FindAFlightPage fafp = new FindAFlightPage(driver);
		fafp.findAFlight();
		
		SelectAFlightPage safp = new SelectAFlightPage(driver);
		safp.selectAFlight();
		
		BookAFlightPage bafp = new BookAFlightPage(driver);
		bafp.bookAFlight();
		
		
		
	}

}
