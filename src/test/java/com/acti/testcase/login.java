package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login extends Basetest {
	@Test(enabled =true)
	public void testLoginFunction() {
		
		 lp.enterusername("admin");
		 lp.enterpassword("manager");
		 lp.clickLoginButton();
		 String actual=ep.getUserLoggedIn();
		 System.out.println(actual);
		 Assert.assertTrue(actual.contains("John Doe"));
		ep.clickLogOut();

}
}
