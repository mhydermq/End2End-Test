package com.hyder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SignOnPage extends BasePage {
	
	//constructor
	public SignOnPage(WebDriver driver) {
		super(driver);
	}
	
	//page element	
		String UserName = "userName";
		String Password = "password";
		String submitButton= "login";
			
		
		/*// go to SignInPage page
		public SignInPage signIn() {
			click(signInButtonBy);
			return new SignInPage(driver);
		}*/
		
		//page methods
		public void signInToNewTours() {
			//Enter Username
	        writeText(By.name(UserName),"tutorial");
	        
	        //Enter Password
	        writeText(By.name(Password), "tutorial");
	        
	        //Click submitButton 
	        click(By.name("login"));        
	       
		}
	

}
