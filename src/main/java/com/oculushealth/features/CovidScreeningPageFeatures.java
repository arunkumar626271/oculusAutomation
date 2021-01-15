package com.oculushealth.features;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.CovidScreeningPage;

public class CovidScreeningPageFeatures 
{
	WebDriver driver;
	CovidScreeningPage csp;
	WebDriverUtils wdu;
	FileLib fl;
	public CovidScreeningPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.csp = new CovidScreeningPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyCovidScreeningPage() throws EncryptedDocumentException, IOException
	{
		String actual = wdu.waitForElementVisibility(csp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("CovidScreeningPage", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void clickingAllNoBtns()
	{
		 List<WebElement> allNoBtns = csp.getAllNoBtns();
		 for (WebElement noBtn : allNoBtns) {
			noBtn.click();
		}
		 csp.getNextStepBtn().click();
	}
}
