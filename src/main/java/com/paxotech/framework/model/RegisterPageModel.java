/**
 * 
 */
package com.paxotech.framework.model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Masihur
 *
 */
public class RegisterPageModel extends PageHeaderModel{

	public RegisterPageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, driver);
	}
	@FindBy(how = How.XPATH, using = "//*[@id='customer.emailAddress']")
	private WebElement emailInputBox;
	@FindBy(how = How.XPATH, using = "//*[@id='customer.firstName']")
	private WebElement firstnameInputBox;
	@FindBy(how = How.XPATH, using = "//*[@id='customer.lastName']")
	private WebElement lastNameInputBox;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private WebElement passwordInputBox;
	@FindBy(how = How.XPATH, using = "//*[@id='passwordConfirm']")
	private WebElement confirmpasswordInputBox;
	@FindBy(how = How.XPATH, using = "//*[@id='registrationForm']//input[@value='Register']")
	private WebElement registerButton;
	
	public WebElement getEmailInputBox() {
		return emailInputBox;
	}
	public WebElement getFirstNameInputBox() {
		return firstnameInputBox;
	}
	public WebElement getLastNameInputBox() {
		return lastNameInputBox;
	}
	public WebElement getPasswordInputBox() {
		return passwordInputBox;
	}
	public WebElement getConfirmPasswordInputBox() {
		return confirmpasswordInputBox;
	}
	public WebElement getRegisterButton(){
		return registerButton;
	}
	
	
	
	

}
