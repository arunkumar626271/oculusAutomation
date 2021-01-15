package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.PatientInfoPage;

public class PatientInfoPageFeatures 
{
	WebDriver driver;
	PatientInfoPage pip;
	WebDriverUtils wdu;
	FileLib fl;
	public PatientInfoPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.pip = new PatientInfoPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyPatientInfoPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(pip.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("PersonalInfoPage", 7, 1);
		Assert.assertEquals(actual, expected);
	}
	public void enterPatientDataAndProceed() throws EncryptedDocumentException, IOException
	{
		pip.getFirstNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 2, 1));
		pip.getLastNameField().sendKeys(fl.getExcelData("PersonalInfoPage", 3, 1));
		pip.getBirthDateField().sendKeys(fl.getExcelData("PersonalInfoPage", 4, 1));
		if(PatientTypePageFeatures.gender)
		{
			pip.getGenderFemaleBtn().click();
		}
		else
		{
			pip.getGenderMaleBtn().click();
		}
		pip.getContinueBtn().click();
	}
}
