package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalkInDemographicsPage 
{
	@FindBy(xpath="//h4[text()='Demographics']")
	private WebElement demographicsPageHeading;
	public WalkInDemographicsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDemographicsPageHeading() {
		return demographicsPageHeading;
	}
}
