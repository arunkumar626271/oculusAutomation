package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.CheckInfoAboutAppointmentPage;

public class CheckInfoAboutAppointmentPageFeatures {
	WebDriver driver;
	CheckInfoAboutAppointmentPage ciaap;
	WebDriverUtils wdu;
	FileLib fl;
	public CheckInfoAboutAppointmentPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.ciaap = new CheckInfoAboutAppointmentPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	
	public void verifyConfirmAppointmentPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(ciaap.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("ConfirmAppointmentPage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void confirmAppointment()
	{
		ciaap.getConfirmAppointmentBtn().click();
	}
}
