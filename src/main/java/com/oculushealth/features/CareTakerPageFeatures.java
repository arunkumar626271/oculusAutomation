package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.CareTakerPage;

public class CareTakerPageFeatures 
{
	WebDriver driver;
	CareTakerPage ctp;
	WebDriverUtils wdu;
	FileLib fl;
	public CareTakerPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.ctp = new CareTakerPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyCareTakerPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(ctp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("CareTakerPage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void enterCareTakerData() throws EncryptedDocumentException, IOException
	{
		ctp.getCareTakerFirstNameField().sendKeys(fl.getExcelData("CareTakerPage", 2, 1));
		ctp.getCareTakerLastNameField().sendKeys(fl.getExcelData("CareTakerPage", 3, 1));
		ctp.getCareTakerBirthDayField().sendKeys(fl.getExcelData("CareTakerPage", 4, 1));
		ctp.getCareTakerPhoneNumberField().sendKeys(fl.getExcelData("CareTakerPage", 5, 1));
		ctp.getCareTakerEmailField().sendKeys(fl.getExcelData("CareTakerPage", 6, 1));
		ctp.getNextStepBtn().click();
	}
}
