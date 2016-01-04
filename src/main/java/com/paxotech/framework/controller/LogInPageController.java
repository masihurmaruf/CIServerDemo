/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.framework.model.LogInPageModel;

/**
 * @author Masihur
 *
 */
public class LogInPageController extends ControllerBase{
	
	private LogInPageModel logInPageModel;

	public LogInPageController(WebDriver driver) {
		super(driver);
		logInPageModel = new LogInPageModel(driver);
		
	}
	public void signIn(String email, String password){
		logInPageModel.getEmail().sendKeys(email);
		logInPageModel.getPassword().sendKeys(password);
		logInPageModel.getLoginButton().click();
	}

}
