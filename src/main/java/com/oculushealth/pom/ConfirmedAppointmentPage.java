package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmedAppointmentPage {
	@FindBy(xpath="//h3[contains(text(),'Hi')]")
	private WebElement heading;
	public ConfirmedAppointmentPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getHeading() {
		return heading;
	}
}
