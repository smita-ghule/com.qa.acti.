package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.page.Loginpage;


public class LoginpageTest extends Basetest{
	
	Loginpage lp ;
	@Test
	public void testLoginpageTitle()
	{
		
		String expected="actiTIME - Login";
		String actual=lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
		
	}
	@Test
	public void testActiImgDisplayed() {

		
		 boolean flag = lp.verifyActiImg();
		Assert.assertTrue(flag);
	
	}
	@Test
	public void testForgotpasswordDispalyed() {
		
		 boolean flag = lp.verifyForgotPasswordLink();
		Assert.assertTrue(flag);;
		
	}
	@Test
	public void testLoginFunction() {
		
		 lp.enterusername("admin");
		 lp.enterpassword("manager");
		 lp.clickLoginButton();
		
	}
	@Test
	public void testLoginInvalid() throws InterruptedException {
		
		 lp.enterusername("admin");
		 lp.clickLoginButton();
		 Thread.sleep(3000);
		
		 String errmsg=lp.getErrormsgtext();
		 Assert.assertTrue(errmsg.contains("user and password invalid"));
		 
		 
	}
}
