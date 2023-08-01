/* Name Driverscript
Description= manage driver and browser related configuration
developed by:-
reviewed by:-
*/
package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 constructor is responsibble for getting the details file from properties
*/
public class Driverscript {

	public static WebDriver driver;
	Properties popes;
	
	public Driverscript() {
	
	try
	{
		File file = new File("./src/test/resources/config/config.properties");
		FileInputStream fs = new FileInputStream(file);
		popes =new Properties();
		popes.load(fs);
	}
	catch (Exception e) {

	System.out.println("unable to load config.properties"+e.getMessage());
	e.printStackTrace();
	}
	}

	
	/* initapllication will get the browser details from the properties file and launch the application*/ 
	@Test
	public void initApplication() 
	{
		
		String browser= popes.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.out.println(browser+ "In use ");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		   else if (browser.equalsIgnoreCase("firefox"))
		   {
			   System.out.println(browser+ "In use ");
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
		   }
		   else if (browser.equalsIgnoreCase("edge"))
		   {
		System.out.println(browser+ "In use ");
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		}
		   else
		   {
			   System.out.println(browser+ "browser is not support config.properties");
		   }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		lauchURL();
	}	
		//popes.getProperty("url");
		//driver.get(browser);
		
	/* load the url from properties file and pass it to the initapplication file*/
		public void lauchURL ()
		{
			String url=popes.getProperty("url");
			driver.get(url);
		}
		
		/*quit the browser*/
		public void quitDriver() 
		{
			driver.quit();
		}
	

	}


