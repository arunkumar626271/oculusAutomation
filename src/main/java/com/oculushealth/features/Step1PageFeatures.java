package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.Step1Page;

public class Step1PageFeatures 
{
	WebDriver driver;
	Step1Page sp;
	WebDriverUtils wdu;
	FileLib fl;
	public Step1PageFeatures(WebDriver driver) {
		this.driver = driver;
		this.sp=new Step1Page(driver);
		this.wdu=new WebDriverUtils();
		this.fl = new FileLib();
	}
	
	public void verifyStep1Page() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(sp.getPageHeading(), driver).getText();
		String expected= fl.getExcelData("Step1Page", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void selectVideoConsultAndContinue()
	{
		sp.getVideoConsultBtn().click();
		sp.getContinueBtn().click();
	}
	public void selectInPersonAndContinue()
	{
		sp.getInPersonBtn().click();
		sp.getContinueBtn().click();
	}
	public void selectTelephoneCallAndContinue()
	{
		sp.getTelephoneConsultBtn().click();
		sp.getContinueBtn().click();
	}
	
}
