package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.PatientTypePage;
import com.oculushealth.pom.Step1Page;

public class PatientTypePageFeatures 
{
	WebDriver driver;
	PatientTypePage ptp;
	WebDriverUtils wdu;
	FileLib fl;
	public static boolean gender;
	public PatientTypePageFeatures(WebDriver driver) {
		this.driver = driver;
		this.ptp= new PatientTypePage(driver);
		this.wdu=new WebDriverUtils();
		this.fl = new FileLib();
	}
	
	public void verifyPatientTypePage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(ptp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("PatientTypePage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	
	public void selectPatientTypeMySelfAndProceed()
	{
		ptp.getPatientTypeMyselfBtn().click();
		gender=false;
		ptp.getContinueBtn().click();
	}
	public void selectPatientTypeMyChildAndProceed()
	{
		ptp.getPatientTypeMyChildBtn().click();
		gender=false;
		ptp.getContinueBtn().click();
	}
	public void selectPatientTypeMySpouseAndProceed()
	{
		ptp.getPatientTypeMySpouseBtn().click();
		gender=true;
		ptp.getContinueBtn().click();
	}
	public void selectPatientTypeOtherAndProceed()
	{
		ptp.getPatientTypeOtherBtn().click();
		gender=false;
		ptp.getContinueBtn().click();
	}
	
}
