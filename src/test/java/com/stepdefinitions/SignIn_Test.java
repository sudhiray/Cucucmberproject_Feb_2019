package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.application.pages.SignIn;
import com.genericmethods.Genericmethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn_Test extends Genericmethods
{
	
	public static SignIn sign;
	
	@Given("^launch the chrome browser and Navigate to the Application$")
	public void launch_the_chrome_browser_and_Navigate_to_the_Application(String browser, String url)  
	{
	    System.out.println("This step launches the browser and navigates to the application URL");
	    launchBrowser(browser, url);
	}

	@When("^user clicks on SignIn button on Home page$")
	public void user_clicks_on_SignIn_button_on_Home_page()  
	{
	   System.out.println("This step clicks on the Sign In button on the home page");
	   sign = PageFactory.initElements(driver, SignIn.class);
	   sign.click_Signin();
	   
	}

	@Then("^verify that the Authentication tab is displayed successfully$")
	public void verify_that_the_Authentication_tab_is_displayed_successfully()  
	{
		System.out.println("This step verifies the availability of Signin Page components");
		sign.authentication_Visibility();
	}
}
