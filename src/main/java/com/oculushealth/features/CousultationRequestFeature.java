package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.oculushealth.generics.FileLib;
import com.oculushealth.pom.ConsulatationRequestPage;

public class CousultationRequestFeature 
{
	ConsulatationRequestPage crp;
	
	WebDriver driver;
	FileLib fl ;
	public CousultationRequestFeature(WebDriver driver) {
		this.driver = driver;
		this.crp = new ConsulatationRequestPage(driver);
		this.fl = new FileLib();
		
	}
	
	public void enterData() throws EncryptedDocumentException, IOException
	{
		//crp.getProviderDropdown().click();
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+fl.getExcelData("Consultation Request", 2, 3));
		crp.getDurationField().click();
		crp.getDurationValue().click();
		crp.getTypeField().click();
		crp.getTypeFieldValue().click();
		crp.getVisitReasonField().sendKeys(fl.getExcelData("Consultation Request", 3, 1));
		crp.getGenderFiled().click();
		crp.getGenderFieldValue().click();
		crp.getFirstNameField().sendKeys(fl.getExcelData("Consultation Request", 4, 2));
		crp.getLastNameField().sendKeys(fl.getExcelData("Consultation Request", 5, 2));
		crp.getAddressLine1Field().sendKeys(fl.getExcelData("Consultation Request", 6, 1));
		crp.getAddressLine2Field().sendKeys(fl.getExcelData("Consultation Request", 7, 1));
		crp.getCityField().sendKeys(fl.getExcelData("Consultation Request", 8, 1));
		crp.getStateField().sendKeys(fl.getExcelData("Consultation Request", 9, 1));
		crp.getStateField().sendKeys(Keys.ARROW_DOWN);
		crp.getStateField().sendKeys(Keys.ENTER);
		crp.getZipCodeField().sendKeys(fl.getExcelData("Consultation Request", 10, 1));
		crp.getBirthDateField().sendKeys(fl.getExcelData("Consultation Request", 11, 1));
		crp.getCellPhoneField().sendKeys(fl.getExcelData("Consultation Request", 12, 1));
		crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
	}
	
	
}
