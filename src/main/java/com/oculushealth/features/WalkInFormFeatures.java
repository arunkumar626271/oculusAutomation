package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.pom.WalkInFormPage;

public class WalkInFormFeatures 
{
	WebDriver driver;
	WalkInFormPage wifp;
	FileLib fl;
	public WalkInFormFeatures(WebDriver driver) {
		this.driver = driver;
		this.wifp= new WalkInFormPage(driver);
		this.fl = new FileLib();
	}
	
	public void verifyWalkInPage() throws EncryptedDocumentException, IOException
	{
		String expected = fl.getExcelData("Walk_In Request", 1, 1);
		String actual = wifp.getPageHeading().getText();
		Assert.assertEquals(actual, expected);
	}
	
	public void fillWalkInForm() throws EncryptedDocumentException, IOException
	{
		wifp.getVisitReasonField().sendKeys(fl.getExcelData("Walk_In Request", 2, 1));
		wifp.getGenderField().click();
		wifp.getGenderValue().click();
		wifp.getFirstNameField().sendKeys(fl.getExcelData("Walk_In Request", 3, 3));
		wifp.getLastNameField().sendKeys(fl.getExcelData("Walk_In Request", 4, 3));
		wifp.getAddressLine1Field().sendKeys(fl.getExcelData("Walk_In Request", 5, 1));
		wifp.getAddressLine2Field().sendKeys(fl.getExcelData("Walk_In Request", 6, 1));
		wifp.getCityField().sendKeys(fl.getExcelData("Walk_In Request", 7, 1));
		wifp.getStateField().sendKeys(fl.getExcelData("Walk_In Request", 8, 1));
		wifp.getStateField().sendKeys(Keys.ARROW_DOWN);
		wifp.getStateField().sendKeys(Keys.ENTER);
		wifp.getZipCodeField().sendKeys(fl.getExcelData("Walk_In Request", 9, 1));
		wifp.getBirthDateField().sendKeys(fl.getExcelData("Walk_In Request", 10, 1));
		wifp.getCellPhoneField().sendKeys(fl.getExcelData("Walk_In Request", 11, 1));
		wifp.getEmailField().sendKeys(fl.getExcelData("Walk_In Request", 12, 1));
		wifp.getSelfPayCheckbox().click();
		wifp.getContinueBtn().click();
	}
	
	
}
