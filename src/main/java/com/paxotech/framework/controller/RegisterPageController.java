/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.framework.model.RegisterPageModel;

/**
 * @author Masihur
 *
 */
public class RegisterPageController extends PageHeaderController{
	
	private RegisterPageModel registerPage = null;
	
	public RegisterPageController(WebDriver driver) {
		super(driver);
		registerPage = new RegisterPageModel(driver);
	}
	
	public RegisterPageModel registerPage(String email, String fName, String lName, String password, String confirmPassword){
		registerPage.getEmailInputBox().sendKeys(email);
		registerPage.getFirstNameInputBox().sendKeys(fName);
		registerPage.getLastNameInputBox().sendKeys(lName);
		registerPage.getPasswordInputBox().sendKeys(password);
		registerPage.getConfirmPasswordInputBox().sendKeys(confirmPassword);
		return registerPage;
	}
	public RegisterPageModel registerPageSubmit(){
		registerPage.getRegisterButton().click();
		return registerPage;
	}
	

}
