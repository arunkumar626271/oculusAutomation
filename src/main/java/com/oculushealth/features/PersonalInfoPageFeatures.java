package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.PersonalInfoPage;

public class PersonalInfoPageFeatures 
{
	WebDriver driver;
	PersonalInfoPage pip;
	WebDriverUtils wdu;
	FileLib fl;
	public PersonalInfoPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.pip = new PersonalInfoPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyPersonalInfoPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(pip.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("PersonalInfoPage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void enterPersonalDataAndProceed() throws EncryptedDocumentException, IOException
	{
		pip.getFirstNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 2, 1));
		pip.getLastNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 3, 1));
		pip.getBirthDateField().sendKeys(fl.getExcelData("PersonalInfoPage", 4, 1));
		pip.getPhoneNumberField().sendKeys(fl.getExcelData("PersonalInfoPage", 5, 1));
		pip.getEmailField().sendKeys(fl.getExcelData("PersonalInfoPage", 6, 1));
		pip.getGenderMaleBtn().click();
		pip.getNextStepBtn().click();
	}
	public void enterPersonalDataForChildAndProceed() throws EncryptedDocumentException, IOException
	{
		pip.getFirstNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 2, 1));
		pip.getLastNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 3, 1));
		pip.getBirthDateField().sendKeys(fl.getExcelData("PersonalInfoPage", 4, 1));
		pip.getGenderMaleBtn().click();
		pip.getNextStepBtn().click();
	}
	
}
