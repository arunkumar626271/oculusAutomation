package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.ConfirmedAppointmentPage;

public class ConfirmedAppointmentPageFeatures 
{
	WebDriver driver;
	ConfirmedAppointmentPage cap;
	WebDriverUtils wdu;
	FileLib fl;
	public ConfirmedAppointmentPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.cap = new ConfirmedAppointmentPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyAppointmentMessage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(cap.getHeading(), driver).getText();
		String expected = fl.getExcelData("ConfirmAppointmentPage", 2, 1);
		boolean flag = actual.contains(expected);
		Assert.assertTrue(flag);
		
	}
	
}
