package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultationRequestSuccessPage {
	
	@FindBy(tagName="h3")
	private WebElement requestSuccessMessage;
	
	public ConsultationRequestSuccessPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getRequestSuccessMessage() {
		return requestSuccessMessage;
	}

}
