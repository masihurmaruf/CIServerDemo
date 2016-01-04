/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.WebDriver;

/**
 * @author Masihur
 * 
 * wrepper class
 *
 */
public class Application {
	
	
	private WebDriver driver = null;
	
	private PageHeaderController pageHeader = null;
	
	private PageFooterController pageFooter = null;

	private HomePageController homePage = null;

	private LogInPageController logInPage = null;
	
	private RegisterPageController registerPage = null;
	
	public Application(WebDriver driver){
		this.driver = driver;
	}
	public HomePageController homePage(){
		if(homePage == null){
			homePage = new HomePageController(driver);
		}
		return homePage;
	}
	public LogInPageController signInPage(){
		if(logInPage == null){
			logInPage = new LogInPageController(driver);
		}
		return logInPage;
	}
	public PageHeaderController pageHeader(){
		if(pageHeader == null){
			pageHeader = new PageHeaderController(driver);
		}
		return pageHeader;
	}
	public PageFooterController pageFooter(){
		if(pageFooter == null){
			pageFooter = new PageFooterController(driver);
		}
		return pageFooter;
	}
	public RegisterPageController registerPage(){
		if(registerPage == null){
			registerPage = new RegisterPageController(driver);
		}
		return registerPage;
	}
	
}
