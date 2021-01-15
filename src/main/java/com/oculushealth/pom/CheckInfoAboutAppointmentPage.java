package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInfoAboutAppointmentPage 
{
	@FindBy(xpath="//h1[text()='Check the details of the appointment']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//button[text()='Confirm Appointment']")
	private WebElement confirmAppointmentBtn;
	
	public CheckInfoAboutAppointmentPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getPageHeading() {
		return pageHeading;
	}
	public WebElement getConfirmAppointmentBtn() {
		return confirmAppointmentBtn;
	}
}
