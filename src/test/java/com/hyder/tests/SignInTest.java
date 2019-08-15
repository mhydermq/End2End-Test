package com.hyder.tests;

import org.testng.annotations.Test;

import com.hyder.pages.HomePage;
import com.hyder.pages.SignOnPage;

public class SignInTest extends BaseTest {
	
	// valid username valid password
	@Test
	public void validSignInTest(){
		System.out.println("Starting signin test");
		
		HomePage homepage = new HomePage(driver);
		SignOnPage signOnpage = new SignOnPage(driver);
		
		homepage.goToNewTours();
		homepage.goToSignOnPage();
		signOnpage.signInToNewTours();
		
	}
	

}
