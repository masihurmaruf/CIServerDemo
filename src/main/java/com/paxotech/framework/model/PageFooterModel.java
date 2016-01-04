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
public class PageFooterModel extends ModelBase{

	public PageFooterModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(how = How.XPATH, using = "//*[@id='left_content']/a/span[text() ='Privacy Policy']")
	private WebElement privacyPolicyLink;
	@FindBy(how = How.XPATH, using = "//span[text()='Customer Service']")
	private WebElement customerServiceLink;
	@FindBy(how = How.XPATH, using ="//*[@id='blc_brand']//img")
	private WebElement broadleafCommerceLink;

	public WebElement getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}
	public WebElement getCustomerServiceLink() {
		return customerServiceLink;
	}
	public WebElement getBroadleafCommerceLink() {
		return broadleafCommerceLink;
	}
	
}
