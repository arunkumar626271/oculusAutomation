package com.oculushealth.features;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.oculushealth.generics.FileLib;
import com.oculushealth.pom.ConsultationRequestSuccessPage;

public class ConsultationRequestSuccessFeature 
{
	ConsultationRequestSuccessPage crsp;
	WebDriver driver;
	FileLib fl;
	public ConsultationRequestSuccessFeature(WebDriver driver) 
	{
		this.driver =driver;
		this.crsp=new ConsultationRequestSuccessPage(driver);
		this.fl = new FileLib();
	}
	
	public void verifyConsultationSuccessMessage() throws EncryptedDocumentException, IOException
	{
		String actual = crsp.getRequestSuccessMessage().getText();
		String expected = fl.getExcelData("Consultation Request", 14, 1);
		Assert.assertEquals(actual, expected);
	}
	
}
