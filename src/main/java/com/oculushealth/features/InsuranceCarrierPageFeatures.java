package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.InsuranceCarrierPage;

public class InsuranceCarrierPageFeatures 
{
	WebDriver driver;
	InsuranceCarrierPage icp;
	WebDriverUtils wdu;
	FileLib fl;
	public InsuranceCarrierPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.icp = new InsuranceCarrierPage(driver);
		this.wdu = new WebDriverUtils();
		this.fl = new FileLib();
	}
	public void verifyInsuranceCarrierPage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		String actual = wdu.waitForElementVisibility(icp.getPageHeading(), driver).getText();
		String expected = fl.getExcelData("Step3Page", 1, 1);
		Assert.assertEquals(actual, expected);
	}
	public void selectPayMyself()
	{
		icp.getPayForMyselfBtn().click();
	}
	public void selectCreditCardAndProceed()
	{
		wdu.waitForElementVisibility(icp.getCreditCardBtn(), driver).click();
		icp.getContinueBtn().click();
		
	}
	public void selectCheckAndProceed()
	{
		wdu.waitForElementVisibility(icp.getCheckBtn(), driver).click();
		icp.getContinueBtn().click();
	}
	public void selectCashAndProceed()
	{
		wdu.waitForElementVisibility(icp.getCashBtn(), driver).click();
		icp.getContinueBtn().click();
	}
}
