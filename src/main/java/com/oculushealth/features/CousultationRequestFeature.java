package com.oculushealth.features;

import java.io.IOException;
import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	public String randomTimeGenerator()
	{
		final Random random = new Random();
		final int millisInDay = 24*60*60*1000;
		Time time = new Time((long)random.nextInt(millisInDay));
		String ts = time.toString();
		String[] arr = ts.split(":");
		//System.out.println(Arrays.toString(arr));
		ts = arr[0]+arr[1];
		return ts;
	}
	public void enterData() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
	
	public void validateDateField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		//crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		
		String actual = crp.getInvalidDateErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 15, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();

	}
	public void validateVisitReasonField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
		crp.getDurationField().click();
		crp.getDurationValue().click();
		crp.getTypeField().click();
		crp.getTypeFieldValue().click();
		//crp.getVisitReasonField().sendKeys(fl.getExcelData("Consultation Request", 3, 1));
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
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	
	public void validateFirstNameField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
		crp.getDurationField().click();
		crp.getDurationValue().click();
		crp.getTypeField().click();
		crp.getTypeFieldValue().click();
		crp.getVisitReasonField().sendKeys(fl.getExcelData("Consultation Request", 3, 1));
		crp.getGenderFiled().click();
		crp.getGenderFieldValue().click();
		//crp.getFirstNameField().sendKeys(fl.getExcelData("Consultation Request", 4, 2));
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
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateLastNameField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
		crp.getDurationField().click();
		crp.getDurationValue().click();
		crp.getTypeField().click();
		crp.getTypeFieldValue().click();
		crp.getVisitReasonField().sendKeys(fl.getExcelData("Consultation Request", 3, 1));
		crp.getGenderFiled().click();
		crp.getGenderFieldValue().click();
		crp.getFirstNameField().sendKeys(fl.getExcelData("Consultation Request", 4, 2));
		//crp.getLastNameField().sendKeys(fl.getExcelData("Consultation Request", 5, 2));
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
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateAddressLine1Field() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
		crp.getDurationField().click();
		crp.getDurationValue().click();
		crp.getTypeField().click();
		crp.getTypeFieldValue().click();
		crp.getVisitReasonField().sendKeys(fl.getExcelData("Consultation Request", 3, 1));
		crp.getGenderFiled().click();
		crp.getGenderFieldValue().click();
		crp.getFirstNameField().sendKeys(fl.getExcelData("Consultation Request", 4, 2));
		crp.getLastNameField().sendKeys(fl.getExcelData("Consultation Request", 5, 2));
		//crp.getAddressLine1Field().sendKeys(fl.getExcelData("Consultation Request", 6, 1));
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
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateCityField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		//crp.getCityField().sendKeys(fl.getExcelData("Consultation Request", 8, 1));
		crp.getStateField().sendKeys(fl.getExcelData("Consultation Request", 9, 1));
		crp.getStateField().sendKeys(Keys.ARROW_DOWN);
		crp.getStateField().sendKeys(Keys.ENTER);
		crp.getZipCodeField().sendKeys(fl.getExcelData("Consultation Request", 10, 1));
		crp.getBirthDateField().sendKeys(fl.getExcelData("Consultation Request", 11, 1));
		crp.getCellPhoneField().sendKeys(fl.getExcelData("Consultation Request", 12, 1));
		crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateZipCodeField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		//crp.getZipCodeField().sendKeys(fl.getExcelData("Consultation Request", 10, 1));
		crp.getBirthDateField().sendKeys(fl.getExcelData("Consultation Request", 11, 1));
		crp.getCellPhoneField().sendKeys(fl.getExcelData("Consultation Request", 12, 1));
		crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateBirthdateField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		//crp.getBirthDateField().sendKeys(fl.getExcelData("Consultation Request", 11, 1));
		crp.getCellPhoneField().sendKeys(fl.getExcelData("Consultation Request", 12, 1));
		crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
		
		String actual = crp.getInvalidDateErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 17, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateCellPhoneField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		//crp.getCellPhoneField().sendKeys(fl.getExcelData("Consultation Request", 12, 1));
		crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	public void validateEmailField() throws EncryptedDocumentException, IOException
	{
		crp.getSelectProviderTextField().sendKeys(fl.getExcelData("Consultation Request", 1, 2));
		crp.getSelectProviderTextField().sendKeys(Keys.ARROW_DOWN);
		crp.getSelectProviderTextField().sendKeys(Keys.ENTER);
		crp.getDateField().sendKeys(fl.getExcelData("Consultation Request", 2, 1)+randomTimeGenerator());
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
		//crp.getEmailField().sendKeys(fl.getExcelData("Consultation Request", 13, 1));
		crp.getSelfPayCheckbox().click();
		crp.getRequestBtn().click();
		
		String actual = crp.getFieldIsRequiredErrMsg().getText();
		String expected = fl.getExcelData("Consultation Request", 16, 1);
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
	}
	
	
}
