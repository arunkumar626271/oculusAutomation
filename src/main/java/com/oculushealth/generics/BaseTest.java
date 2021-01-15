package com.oculushealth.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	public FileLib fl = new FileLib();
	WebDriverUtils wdu = new WebDriverUtils();

	@BeforeMethod
	public void setup() throws IOException {
		driver = BrowserFactory.launchBrowser(fl.getPropertyKeyValue("browser", "commons.properties"));
		driver.manage().window().maximize();
		wdu.waitForElements(driver);
		//driver.get(fl.getPropertyKeyValue("url", "commons.properties"));
		//driver.get(fl.getPropertyKeyValue("url1", "commons.properties"));
		driver.get(fl.getPropertyKeyValue("url2", "commons.properties"));
	}

	@BeforeClass
	public void preCondition() {
		Reporter.log("Login Page is not yet defined", true);
	}

	@AfterClass
	public void postCondition() {
		Reporter.log("Logout Feature is not yet introduced");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
