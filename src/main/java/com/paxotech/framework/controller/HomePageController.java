/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.framework.model.HomePageModel;

/**
 * @author Masihur
 *
 */
public class HomePageController extends PageHeaderController{
	
	private HomePageModel homePageModel;
	
	public HomePageController(WebDriver driver) {
		super(driver);
		homePageModel = new HomePageModel(driver);
	}
	public void showLogInPage (){
		homePageModel.getElementLogIn().click();
	}
	
	public void searchText(String textToSearch){
		homePageModel.getElementSearch().clear();
		homePageModel.getElementSearch().sendKeys(textToSearch);
		homePageModel.getElementSearchButton().submit();
		
	}

}
