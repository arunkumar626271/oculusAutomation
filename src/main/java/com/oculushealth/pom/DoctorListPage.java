package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorListPage
{
	@FindBy(xpath="(//span[text()='View all upcoming availability'])[1]")
	private WebElement viewAvailabilityBtn;
	
	public DoctorListPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getViewAvailabilityBtn() {
		return viewAvailabilityBtn;
	}
}
