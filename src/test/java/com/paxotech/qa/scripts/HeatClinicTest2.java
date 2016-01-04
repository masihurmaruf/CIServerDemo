package com.paxotech.qa.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paxotech.framework.ScriptBase;

public class HeatClinicTest2 extends ScriptBase{
	

	@Test
	public void test() {
		String title = driver.getTitle();

		WebElement elementLogIn = driver
				.findElement(By.xpath("//span[text()='Login']"));

		elementLogIn.click();
		WebElement email = driver.findElement(By.name("j_username"));
		email.sendKeys("marufrahman1349@gmail.com");
		WebElement password = driver.findElement(By.name("j_password"));
		password.sendKeys("12345678");
		WebElement register = driver.findElement(By.cssSelector(".login_button.big.red"));
		register.click();

	}
	@Test
	public void tab(){
		WebElement register = driver.findElement(By.xpath("//*[@id='cart_info']//span[text()='Register']"));
		register.click();
		
		WebElement emailTextBox = driver.findElement(By.id("customer.emailAddress"));
		slowTyper("MARUF", emailTextBox);		
	}
	public void slowTyper(String toBeTyped, WebElement element){

		int len = toBeTyped.length();
		
		for(int i = 0; i < len; i++){
			char chars = toBeTyped.charAt(i);
			String charSeq = String.valueOf(chars);
			element.sendKeys(charSeq);
		}
	}

	

}
