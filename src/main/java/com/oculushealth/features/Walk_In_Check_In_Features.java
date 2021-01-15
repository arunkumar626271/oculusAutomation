package com.oculushealth.features;

import org.openqa.selenium.WebDriver;

import com.oculushealth.pom.Walk_In_Check_In_ChoicePage;

public class Walk_In_Check_In_Features 
{
	WebDriver driver;
	Walk_In_Check_In_ChoicePage wicicp;
	
	public Walk_In_Check_In_Features(WebDriver driver) 
	{
		this.driver = driver;
		this.wicicp = new Walk_In_Check_In_ChoicePage(driver);
	}
	
	public void clickOnWalkInButton()
	{
		wicicp.getWalkInBtn().click();
	}
}
