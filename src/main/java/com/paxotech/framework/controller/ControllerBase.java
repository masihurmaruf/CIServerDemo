/**
 * 
 */
package com.paxotech.framework.controller;

import org.openqa.selenium.WebDriver;

/**
 * @author Masihur
 *
 */
public class ControllerBase {
	
	protected WebDriver driver = null;
	
	public  ControllerBase(WebDriver driver){
		this.driver = driver;
		
	}

	

}
