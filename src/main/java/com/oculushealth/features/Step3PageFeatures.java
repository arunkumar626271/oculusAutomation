package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.Step3Page;

public class Step3PageFeatures {
	WebDriver driver;
	Step3Page sp;
	WebDriverUtils wdu;
	FileLib fl;
	public Step3PageFeatures(WebDriver driver) {
		this.driver = driver;
		this.sp = new Step3Page(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	
	public void verifyStep3Page() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(sp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("Step3Page", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void clickOnContinueAndProceed()
	{
		sp.getContinueBtn().click();
	}
}
