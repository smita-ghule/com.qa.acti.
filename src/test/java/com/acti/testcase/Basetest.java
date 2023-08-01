package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.Driverscript;
import com.acti.page.Enterpage;
import com.acti.page.Loginpage;

public class Basetest extends Driverscript {
	 
	Loginpage lp ;
	Enterpage ep ;
		
		@BeforeMethod
		public void pretest() {
			initApplication();
			lp = new Loginpage();
			ep=new Enterpage();
		}
		
		@AfterMethod
		public void teardown() {
			quitDriver();
		}
}
