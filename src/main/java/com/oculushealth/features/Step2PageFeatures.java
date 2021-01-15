package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.Step2Page;

public class Step2PageFeatures {
	WebDriver driver;
	Step2Page sp;
	WebDriverUtils wdu;
	FileLib fl;
	public Step2PageFeatures(WebDriver driver) {
		this.driver = driver;
		this.sp = new Step2Page(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	
	public void verifyStep2Page() throws EncryptedDocumentException, IOException
	{
		String actual = sp.getPageHeading().getText();
		String expected = fl.getExcelData("Step2Page", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void selectSymptomAndProceed()
	{
		sp.getSearchBox().click();
		//sp.getSearchBox().sendKeys(Keys.ARROW_DOWN);
		wdu.waitForElementToBeClickable(sp.getBackPainOption(), driver);
		sp.getBackPainOption().click();
		sp.getNextStepBtn().click();
	}
}
