package com.oculushealth.features;

import org.openqa.selenium.WebDriver;

import com.oculushealth.generics.WebDriverUtils;
import com.oculushealth.pom.DoctorListPage;

public class DoctorListPageFeatures 
{
	WebDriver driver;
	DoctorListPage dlp;
	WebDriverUtils wdu;
	public DoctorListPageFeatures(WebDriver driver) {
		this.driver = driver;
		this.dlp = new DoctorListPage(driver);
		this.wdu = new WebDriverUtils();
	}
	
	public void navigateToDoctorAppointment()
	{
		wdu.waitForElementToBeClickable(dlp.getViewAvailabilityBtn(), driver).click();
		
	}
	
	
}
