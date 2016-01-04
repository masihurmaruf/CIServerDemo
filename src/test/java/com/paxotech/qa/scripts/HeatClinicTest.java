/**
 * 
 */
package com.paxotech.qa.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paxotech.framework.ScriptBase;






/**
 * @author Masihur
 * 
 *
 */

public class HeatClinicTest extends ScriptBase{

	
	@Test
	public void fillInRegiterFormTest(){
		heatClinic().pageHeader().heatclinicRegisterPage();
		heatClinic().registerPage().registerPage("marufrahamn1349@yahoo.com", "Masihur", "Maruf", "maruf", "maruf");
		heatClinic().registerPage().registerPageSubmit();
		
	}
	@Test
	public void broadleafCommerceLinkTest(){
		heatClinic().pageFooter().broadleafCommerceLinkHover();
		heatClinic().pageFooter().broadleafCommerceLink();
		
	}
	
	
	
}
