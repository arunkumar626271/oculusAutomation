package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.AddYourCreditCardPage;

public class AddYourCreditCardPageFeatures 
{
	WebDriver driver;
	AddYourCreditCardPage ayccp;;
	WebDriverUtils wdu;
	FileLib fl;
	public AddYourCreditCardPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.ayccp= new AddYourCreditCardPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyAddYourCreditCardPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(ayccp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("AddCreditCardPage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void enterCreditCardInfoAndContinue() throws EncryptedDocumentException, IOException, InterruptedException
	{	
		//Thread.sleep(2000);
		wdu.switchToIframe(driver, ayccp.getCcnIframe());
		(wdu.waitForElementToBeClickable(ayccp.getCreditCardNumField(), driver)).sendKeys(fl.getExcelData("AddCreditCardPage", 2, 1));
		wdu.switchToParentFrame(driver);
		
		wdu.switchToIframe(driver, ayccp.getExpirationDateIFrame());
		ayccp.getExpiryDateField().sendKeys(fl.getExcelData("AddCreditCardPage", 3, 1));
		wdu.switchToParentFrame(driver);
		
		wdu.switchToIframe(driver, ayccp.getCvcIFrame());
		ayccp.getCvcField().sendKeys(fl.getExcelData("AddCreditCardPage", 4, 1));
		wdu.switchToParentFrame(driver);
		
		ayccp.getZipCodeField().sendKeys(fl.getExcelData("AddCreditCardPage", 5, 1));
		ayccp.getNextStepBtn().click();
	}
	public void skipCreditCardInfoAndContinue()
	{
		ayccp.getSkipLink().click();
	}
}
