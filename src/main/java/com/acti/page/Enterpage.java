package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.Driverscript;

/* Name Enter page
Description= manage the locator and methods of enter page
developed by:-
reviewed by:-
*/

public class Enterpage extends Driverscript{
	//**************************page Locator**********************//
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(xpath="//a[class='userProfileLink username']") WebElement userloggedText;
	@FindBy(xpath="//div[@id='container_tasks']')") WebElement menuText;
	@FindBy(xpath="//div[@id='container_reports']") WebElement menuReport;
	@FindBy(xpath="//div[@id='container_users']") WebElement menuUser;
	
	//**************************page Initalization**********************//
	
	public Enterpage() {
		PageFactory.initElements(driver, this);
	
	}

	//**************************page Method**********************//
		
		public void clickLogOut() {
			logoutLink.click();
	
}
		public String getUserLoggedIn() {
			return userloggedText.getText();
		}
		
		public void clickTaskMenu() {
			menuText.click();
			
		}
}