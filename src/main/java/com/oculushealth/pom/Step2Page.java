package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step2Page 
{
	@FindBy(xpath="//h1[text()='What brings you in?']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//div[contains(@class,'AutoComplete__Wrapper')]")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[text()='Next step']")
	private WebElement nextStepBtn;
	
	@FindBy(id="react-select-2-option-2")
	private WebElement backPainOption;
	
	public Step2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}
	public WebElement getBackPainOption() {
		return backPainOption;
	}
	
}
