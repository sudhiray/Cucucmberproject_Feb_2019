package com.genericmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Genericmethods 

{
	public static WebDriver driver;
	
	//**********************GENERIC METHODS******************//
	
	// **************************************************************//
		/*
		 * Method Name := launchBrowser()
		 * 
		 * Input Parameter := WebElement
		 * 
		 * OutPut Parameter :=
		 * 
		 * Designer #:= Sudhira
		 * 
		 * Sprint #:=
		 */

	public static boolean launchBrowser(String browser, String url) 
	
	{

		try {
			
			switch (browser.toLowerCase())
			
			{
			
			case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

			case "firefox":
			driver = new FirefoxDriver();
			break;

			default:
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			
			return true;
		} 
		
		catch (Exception e) 
		{
			
			e.printStackTrace();
			
			return false;
		}

	}
	
	// **************************************************************//
	/*
	 * Method Name := wait_VisibilityOfElement()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= Sudhira
	 * 
	 * Sprint #:=
	 */
	
	public static boolean wait_VisibilityOfElement(WebElement element)
	{
		try
		{
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}
	
	// **************************************************************//
		/*
		 * Method Name := hoverAndclick()
		 * 
		 * Input Parameter := WebElement
		 * 
		 * OutPut Parameter :=
		 * 
		 * Designer #:= Sudhira
		 * 
		 * Sprint #:=
		 */
	
	public static boolean hoverAndClick(WebElement element)
	{
		try
		{
			wait_VisibilityOfElement(element);
			Actions a1 = new Actions(driver);
			a1.moveToElement(element).click();
			a1.build().perform();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	// **************************************************************//
	/*
	 * Method Name := verifyElementExist()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= Sudhira
	 * 
	 * Sprint #:=
	 */
	public static boolean verifyElementExist(String elementname_Page,WebElement element) 
	
	{
		try {

			wait_VisibilityOfElement(element);
			
			//splitting the elementname_Page with _
			
			String[] arr=elementname_Page.split("_");
			
			
			if (element.isDisplayed()) 
			{
				System.out.println(arr[0] + " is Displayed in " + arr[1]);
						
			} 
			else
			{
				System.out.println(arr[0] + " is not Displayed in " + arr[1]);
			}
			
			return true;
						
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Method Name := quitBrowser()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := Quit Browser
	 * 
	 * Designer #:= Sudhira
	 * 
	 * Sprint #:=
	 */

	public static boolean quitBrowser() 
	{
		try
		{
			driver.quit();
			return true;
		}
		
		catch(Exception e)
		{
			return false;
		}
	}

	/*
	 * Method Name := verifyElementColour()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	public static boolean verifyelementcolour(WebElement element) 
	{
		try {
			String colour = element.getCssValue("colour");
			String elementname = driver.getCurrentUrl();
			if (colour != null) 
			{
				System.out.println(colour + "having colour name" + elementname);
			} 
			else 
			{
				System.out.println(colour + "colour name is not present"
						+ elementname);
			}
			
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		
		}
	}

	
	/*
	 * Method Name := Getlinkurl()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	public static boolean getlinkurl(WebElement element) 
	{
		String linkurl = null;
		try 
		{
			linkurl = element.getAttribute("href");
			
			if (linkurl.equals(null)) 
			{
				System.out.println(linkurl);
			}
			
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}

	}
	
}
