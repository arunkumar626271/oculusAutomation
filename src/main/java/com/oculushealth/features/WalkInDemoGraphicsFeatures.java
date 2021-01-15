package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.WalkInDemographicsPage;

public class WalkInDemoGraphicsFeatures {
	WebDriver driver;
	WalkInDemographicsPage wdp;
	FileLib fl;
	WebDriverUtils wdu;
	public WalkInDemoGraphicsFeatures(WebDriver driver) {
		this.driver = driver;
		this.wdp = new WalkInDemographicsPage(driver);
		fl = new FileLib();
		wdu = new WebDriverUtils();
	}
	
	public void verifyDemographicsPage() throws EncryptedDocumentException, IOException
	{
		String actual = (wdu.waitForElementVisibility(wdp.getDemographicsPageHeading(), driver)).getText();
		String expected = fl.getExcelData("Walk_In Request", 13, 1);
		Assert.assertEquals(actual, expected);
	}
	
	
}
