package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.page.Loginpage;


public class LoginpageTest extends Basetest{
	
	
	@Test(enabled =false)
	public void testLoginpageTitle()
	{
		
		String expected="actiTIME - Login";
		String actual=lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
		
	}
	@Test(enabled =false)
	public void testActiImgDisplayed() {

		
		 boolean flag = lp.verifyActiImg();
		Assert.assertTrue(flag);
	
	}
	@Test(enabled =false)
	public void testForgotpasswordDispalyed() {
		
		 boolean flag = lp.verifyForgotPasswordLink();
		Assert.assertTrue(flag);;
		
	}
	@Test(enabled =true)
	public void testLoginFunction() {
		
		 lp.enterusername("admin");
		 lp.enterpassword("manager");
		 lp.clickLoginButton();
		 String actual=ep.getUserLoggedIn();
		 Assert.assertTrue(actual.contains("John Doe"));
		ep.clickLogOut();
	}
	@Test(enabled =false)
	public void testLoginInvalid() throws InterruptedException {
		
		 lp.enterusername("admin");
		 lp.clickLoginButton();
		 Thread.sleep(3000);
		
		 String errmsg=lp.getErrormsgtext();
		 Assert.assertTrue(errmsg.contains("user and password invalid"));
		 
		 
	}
}
