package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step3Page 
{
	@FindBy(xpath="//h1[text()='Let’s talk Insurance!']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;
	
	public Step3Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
}
