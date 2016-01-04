/**
 * 
 */
package com.paxotech.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Masihur
 *
 */
public class LogInPageModel extends PageHeaderModel{

	public LogInPageModel(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(how = How.NAME, using = "j_username")
	private WebElement email;
	
	@FindBy(how = How.NAME, using = "j_password")
	private WebElement password;
	
	@FindBy(how = How.CSS, using = ".login_button.big.red")
	private WebElement loginButton ;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton(){
		return loginButton;
	}

//	public WebElement getRegister() {
//		register = waitForElementDisplayed(By.cssSelector(".login_button.big.red"), 60);
//		if(register == null){
//			throw new RuntimeException("Register button not found");
//		}
//		return register;
//	}
//	
	

}
