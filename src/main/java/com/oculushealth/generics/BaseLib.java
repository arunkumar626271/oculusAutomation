package com.oculushealth.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseLib {
	public WebDriver driver;
	public FileLib fl = new FileLib();
	WebDriverUtils wdu = new WebDriverUtils();

	@BeforeTest
	public void setup() throws IOException {
		driver = BrowserFactory.launchBrowser(fl.getPropertyKeyValue("browser", "commons.properties"));
		driver.manage().window().maximize();
		wdu.waitForElements(driver);
		driver.get(fl.getPropertyKeyValue("url", "commons.properties"));
	}

	@BeforeClass
	public void preCondition() {
		Reporter.log("Login Page is not yet defined", true);
	}

	@AfterClass
	public void postCondition() {
		Reporter.log("Logout Feature is not yet introduced");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
