/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.paxotech.framework.model.PageFooterModel;

/**
 * @author Masihur
 *
 */
public class PageFooterController extends ControllerBase{
	
	private PageFooterModel pageFooter = null;

	public PageFooterController(WebDriver driver) {
		super(driver);
		pageFooter = new PageFooterModel(driver);
	}
	public void privacyPolicyHover(){
		pageFooter.hoverItemEx(By.xpath("//*[@id='left_content']/a/span[text() ='Privacy Policy']"));
	}
	public void privacyPolicy(){
		pageFooter.getPrivacyPolicyLink().click();
	}
	public void customerServiceHover(){
		pageFooter.hoverItemEx(By.xpath("//span[text() ='Customer Service']"));
	}
	public void customerService(){
		pageFooter.getCustomerServiceLink().click();
	}
	public void broadleafCommerceLinkHover(){
		pageFooter.hoverItemEx(By.xpath("//*[@id='blc_brand']//img"));
	}
	public void broadleafCommerceLink(){
		pageFooter.getBroadleafCommerceLink().click();
	}
	

}
