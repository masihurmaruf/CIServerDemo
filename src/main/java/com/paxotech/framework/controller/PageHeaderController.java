/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.paxotech.framework.model.PageHeaderModel;

/**
 * @author Masihur
 *
 */
public class PageHeaderController extends ControllerBase{

	private PageHeaderModel pageHeader;
	public PageHeaderController(WebDriver driver) {
		super(driver);
		pageHeader = new PageHeaderModel(driver);
		
	}
	public void homePageTabHover(){
		pageHeader.hoverItemEx(By.xpath("//*[@id='content']//li/a[text() = 'Home']"));
	}
	public void homePageTab(){
		pageHeader.getHomePageTab().click();
		pageHeader.verifyPageTitle("Broadleaf Demo - Heat Clinic");
	}
	public void hotSaucesPageTabHover(){
		pageHeader.hoverItemEx(By.xpath("//*[@id='content']//li/a[text() = 'Hot Sauces']"));
		
	}
	public void hotSaucesPageTab(){
		pageHeader.getHotSaucesPageTab().click();
		pageHeader.verifyPageTitle("Hot Sauces - Broadleaf Demo - Heat Clinic");
	}
	public void merchandisePageTabHover(){
		pageHeader.hoverItem(By.xpath("//*[@id='content']//li/a[text() = 'Merchandise']"));
	}
	public void merchandisePageTab(){
		pageHeader.getMerchandisePageTab().click();
		pageHeader.verifyPageTitle("Merchandise - Broadleaf Demo - Heat Clinic");
	}
	public void clearancePageTabHover(){
		pageHeader.hoverItem(By.xpath("//*[@id='content']//li/a[text() = 'Clearance']"));
	}
	public void clearancePageTab(){
		pageHeader.getClearancePageTab().click();
		pageHeader.verifyPageTitle("Clearance - Broadleaf Demo - Heat Clinic");
	}
	public void newToHpotSaucePageTAbHover(){
		pageHeader.hoverItemEx(By.xpath("//*[@id='content']//li/a[text() = 'New to Hot Sauce?']"));
	}
	public void newToHotSaucePageTab(){
		pageHeader.getNewToHotsaucePageTab().click();
		pageHeader.verifyPageTitle("New to Hot Sauce - Broadleaf Demo - Heat Clinic");
	}
	public void faqsPageTabHover(){
		pageHeader.hoverItemEx(By.xpath("//*[@id='content']//li/a[text() = 'FAQs'"));
	}
	public void faqsPageTab(){
		pageHeader.getFAQsPageTab().click();
		pageHeader.verifyPageTitle("FAQ - Broadleaf Demo - Heat Clinic");
	}
	public void heatclinicRegisterPage(){
		pageHeader.getHeatclinicRegister().click();
		pageHeader.verifyPageTitle("Register - Broadleaf Demo - Heat Clinic");
	}
	public void heatclinicLoginPage(){
		pageHeader.getHeatclinicLogin().click();
		pageHeader.verifyPageTitle("Login - Broadleaf Demo - Heat Clinic");
	}

}
