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
public class PageHeaderModel extends ModelBase{
	
	
	
	public PageHeaderModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'Home']")
	private WebElement homePageTab;
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'Hot Sauces']")
	private WebElement hotSaucesPageTab;
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'Merchandise']")
	private WebElement merchandisePageTab;
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'Clearance']")
	private WebElement clearancePageTab;
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'New to Hot Sauce?']")
	private WebElement newToHotsaucePageTab;
	@FindBy(how = How.XPATH, using="//*[@id='content']//li/a[text() = 'FAQs']")
	private WebElement FAQsPageTab;
	
	@FindBy(how = How.XPATH, using="//*[@id='logo']//a")
	private WebElement heatclinicLogo;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='en_US']")
	private WebElement usFlag;
	@FindBy(how = How.XPATH, using = "//*[@id='en_GB']")
	private WebElement ukFlag;
	@FindBy(how = How.XPATH, using = "//*[@id='es_MX']")
	private WebElement mexicoFlag;
	@FindBy(how = How.XPATH, using = "//*[@id='es_ES']")
	private WebElement spainFlag;
	@FindBy(how = How.XPATH, using = "//*[@id='fr_FR']")
	private WebElement frenchFlag;
	
	@FindBy(how = How.XPATH, using="//*[@id='search']//input[@name = 'q']")
	private WebElement heatclinicSearchBox;
	@FindBy(how = How.XPATH, using="//*[@id='search_button']")
	private WebElement heatclinicSearchButton;
	
	
	@FindBy(how = How.XPATH, using="//*[@id='cart_info']//span[text() = 'Login']")
	private WebElement heatclinicLogin;
	
	@FindBy(how = How.XPATH, using="//*[@id='cart_info']//span[text() = 'Register']")
	private WebElement heatclinicRegister;
	@FindBy(how = How.XPATH, using="//*[@id='cartLink']/img")
	private WebElement heatclinicItemCartLogo;
	@FindBy(how = How.XPATH, using="//*[@id='cartLink']/span[@class='headerCartItemsCount']")
	private WebElement heatclinicItemCount;
	@FindBy(how = How.XPATH, using="//*[@id='cartLink']/span[@class='headerCartItemsCountWord']")
	private WebElement heatclinicShoppingCart;
	
	
	
	
	public WebElement getHomePageTab() {
		return homePageTab;
	}
	public WebElement getHotSaucesPageTab() {
		return hotSaucesPageTab;
	}
	public WebElement getMerchandisePageTab() {
		return merchandisePageTab;
	}
	public WebElement getClearancePageTab() {
		return clearancePageTab;
	}
	public WebElement getNewToHotsaucePageTab() {
		return newToHotsaucePageTab;
	}
	public WebElement getFAQsPageTab() {
		return FAQsPageTab;
	}
	public WebElement getHeatclinicLogo() {
		return heatclinicLogo;
	}
	public WebElement getUsFlag() {
		return usFlag;
	}
	public WebElement getUkFlag() {
		return ukFlag;
	}
	public WebElement getMexicoFlag() {
		return mexicoFlag;
	}
	public WebElement getSpainFlag() {
		return spainFlag;
	}
	public WebElement getFrenchFlag() {
		return frenchFlag;
	}
	public WebElement getHeatclinicSearchBox() {
		return heatclinicSearchBox;
	}
	public WebElement getHeatclinicSearchButton() {
		return heatclinicSearchButton;
	}
	public WebElement getHeatclinicLogin() {
		return heatclinicLogin;
	}
	public WebElement getHeatclinicRegister() {
		return heatclinicRegister;
	}
	public WebElement getHeatclinicItemCartLogo() {
		return heatclinicItemCartLogo;
	}
	public WebElement getHeatclinicItemCount() {
		return heatclinicItemCount;
	}
	public WebElement getHeatclinicShoppingCart() {
		return heatclinicShoppingCart;
	}
	
	
	public void verifyPageTitle(String expected){
		String actual = driver.getTitle();
	}
	
	
	
	
	
}
