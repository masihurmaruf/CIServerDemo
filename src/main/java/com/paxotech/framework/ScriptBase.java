/**
 * 
 */
package com.paxotech.framework;

import java.io.File

;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import com.paxotech.framework.controller.Application;




/**
 * @author Masihur
 *
 */
public class ScriptBase {
	protected WebDriver driver = null;
	protected Application heatClinic = null;

	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(@Optional("ff") String browser) throws Exception {
		 

		if (browser.contentEquals("ff")) {
			driver = new FirefoxDriver();
		}

		else if (browser.contentEquals("ch")) {
			File chromeDriverFile = new File(System.getProperty("user.dir") + "/driver/32/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
			driver = new ChromeDriver();
		} else if (browser.contentEquals("ie")) {

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("internet explorer");
			capabilities.setCapability("ignoreZoomSetting", true);
			capabilities.setCapability("requireWindowFocus", true);

			File driverFile = new File(System.getProperty("user.dir") + "/driver/32/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", driverFile.getAbsolutePath());
			driver = new InternetExplorerDriver(capabilities);

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.navigate().to("http://qa1.paxotech.com/heatclinic/");

	}

	public Application heatClinic() {
		if (heatClinic == null) {
			heatClinic = new Application(driver);
		}
		return heatClinic;
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		System.out.println(result.getName());
		driver.close();
		driver.quit();
		heatClinic = null;
	}

}
