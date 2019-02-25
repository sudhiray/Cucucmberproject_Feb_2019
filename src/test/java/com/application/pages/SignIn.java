package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericmethods.Genericmethods;

public class SignIn extends Genericmethods

{
	//**************************SignIn Page************************//
	
	@FindBy(how=How.XPATH, using="//a[normalize-space(text())='Sign in']")
	public static WebElement Signin_link;
	
	//*****************AUTHENTICATION*****************************//
	
	@FindBy(how=How.XPATH, using="//h1[text()='Authentication']")
	public static WebElement header_auth;
	
	//*********************CREATE NEW ACCOUNT****************//
	
	@FindBy(how=How.XPATH,using="//h3[text()='Create an account']")
	public static WebElement create_user_header;

	@FindBy(how=How.XPATH,using="//input[@id='email_create']")
	public static WebElement create_user_email;

	@FindBy(how=How.XPATH,using="//button[@name='SubmitCreate']")
	public static WebElement create_btn;
	
	//***********************Existing User - Login************************//
	
	@FindBy(how=How.XPATH,using="//h3[text()='Already registered?']")
	public static WebElement login_header;

	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public static WebElement login_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	public static WebElement login_pswd;
	
	@FindBy(how=How.XPATH,using="//button[@id='SubmitLogin']")
	public static WebElement login;
	
	@FindBy(how=How.XPATH,using="//a[text()='Forgot your password?']")
	public static WebElement lnk_forgot_pswd;
	
	//*********************************************************//
	/*
	 * Method Name := click_Signin()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=sudhira
	 * 
	 * Sprint #:=
	 */
	// ***
	public static void click_Signin()
	{
		boolean status=true;
		
		try
		{
			status=hoverAndClick(Signin_link);
			
			if(status = true)
			{
				System.out.println("able to click on SignIn link");
							
			}
			else
			{
				System.out.println("Unable to click on Signin link");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//*********************************************************//
		/*
		 * Method Name := authentication_Visibility()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=sudhira
		 * 
		 * Sprint #:=
		 */
		
	public static void authentication_Visibility()
	{
		
		try
		{
			verifyElementExist("Auterntication Section Header_Signin",header_auth);		
			//method with (string elementname_pagename,WebElement) 
			
			verifyElementExist("Create An Account_Signin",create_user_header);
			verifyElementExist("Create An Account_Signin",create_user_email);
			verifyElementExist("Create An Account_Signin",create_btn);
			verifyElementExist("Already Registered_Signin",login_header);
			verifyElementExist("Already Registered_Signin",login_email);
			verifyElementExist("Already Registered_Signin",login_pswd);
			verifyElementExist("Already Registered_Signin",login);
			verifyElementExist("Already Registered_Signin",lnk_forgot_pswd);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
