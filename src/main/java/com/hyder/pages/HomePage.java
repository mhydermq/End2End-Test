package com.hyder.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author hyder
 * creating our page classes. The first one is HomePage.java class. 
 * In this class we will declare:

    Constructor 
    Page Variables
    Web Elements
    Page Methods
    
  * We will have two methods, one of them opens the homepage
  * and the other one opens login page. 
  *
  */

public class HomePage extends BasePage {

	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//page variable
	String baseUrl = "http://newtours.demoaut.com/";
	
	//page element
	 String  signInButton = "login";
	 //String UserName = "userName";
	 //String Password = "password";
	
	
	//go to home page
	public void goToNewTours() {
		driver.get(baseUrl);
	}
	
	// go to signin page
	public  void goToSignOnPage() {
		//writeText(By.name(UserName),"tutorial");
		//writeText(By.name(Password),"tutorial");
		
		click(By.name("login"));		
	}
}

