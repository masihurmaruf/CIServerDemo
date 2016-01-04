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
public class HomePageModel extends PageHeaderModel{
	
	public HomePageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	

	
	@FindBy(how = How.CSS, using = "#cart_info>#anonymous-customer-header>a:first-child")
	private WebElement elementLogIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search']//input[@name = 'q']")
	private WebElement elementSearch;
	
	@FindBy(how = How.XPATH, using = "//input[@id='search_button']")
	private WebElement elementSearchButton;
	
	public WebElement getElementLogIn() {
		return elementLogIn;
	}

	public WebElement getElementSearch() {
		return elementSearch;
	}

	public WebElement getElementSearchButton() {
		return elementSearchButton;
	}
	

}
