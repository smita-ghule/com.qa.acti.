package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.Driverscript;

/* Name Login
Description= manage the locator and methods of login page
developed by:-
reviewed by:-
*/

public class Loginpage extends Driverscript{

	
	//**************************page Locator**********************//
	
	@FindBy(id= "username")WebElement usernametextbox;
	@FindBy(name= "pwd")WebElement passwordtextbox1;
	@FindBy(xpath= "//div[text()='Login ']")WebElement loginbutton;
	@FindBy(className ="errormsg")WebElement errormsgtext;
	@FindBy(linkText="Forgot your password?")WebElement Forgotpasswordlink;
	@FindBy(className="atLogoImg")WebElement atLogoImage;
	//**************************page Initalization**********************//
	public Loginpage() {
		PageFactory.initElements(driver, this);
	
	}
	
	//**************************page Method**********************//
	public void enterusername(String username) {
	 usernametextbox.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		 usernametextbox.sendKeys(password);
		}
	public void clickLoginButton() {
		loginbutton.click();
	}
	public String getErrormsgtext() {
		return errormsgtext.getText();
		
	}
	public  boolean verifyActiImg() {
		return atLogoImage.isDisplayed();
	}
	public String getLoginPageTitle(){
		return driver.getTitle();
		
		}

	public boolean verifyForgotPasswordLink() {
		return true;
	}
}
