package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.Driverscript;
import com.acti.page.Loginpage;

public class Basetest extends Driverscript {
	 
	Loginpage lp ;
		
		@BeforeMethod
		public void pretest() {
			initApplication();
			lp = new Loginpage();
		}
		
		@AfterMethod
		public void teardown() {
			quitDriver();
		}
}
