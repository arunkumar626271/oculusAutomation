package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.Date_TimePage;

public class Date_TimePageFeatures {
	WebDriver driver;
	Date_TimePage dtp;
	FileLib fl;
	WebDriverUtils wdu;

	public Date_TimePageFeatures(WebDriver driver) {
		this.driver = driver;
		this.dtp = new Date_TimePage(driver);
		this.fl = new FileLib();
		this.wdu = new WebDriverUtils();
	}

	public void verifyDateTimePage() throws EncryptedDocumentException, IOException {
		// wdu.waitForElementVisibility(dtp.getDateField(), driver);
		String actual = wdu.waitForElementVisibility(dtp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("OculusDateTimePage", 1, 1);
		Assert.assertEquals(actual, expected);
	}

	public void selectDate() {
		dtp.getDateField().click();
		dtp.getNavigateToNextMonthBtn().click();
		dtp.getSelectedDate().click();

	}

	public void selectTimeSlotAndProceed() {
		dtp.getTimeSlot().click();
		dtp.getNextStepBtn().click();
	}
	

}
