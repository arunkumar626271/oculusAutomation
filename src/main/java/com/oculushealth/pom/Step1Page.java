package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step1Page 
{
	@FindBy(xpath="//h1[text()='What type of appointment do you want?']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//div[text()='In Person']")
	private WebElement inPersonBtn;
	
	@FindBy(xpath="//div[text()='Video Consult']")
	private WebElement videoConsultBtn;
	
	@FindBy(xpath="//div[text()='Telephone Consult']")
	private WebElement telephoneConsultBtn;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;
	
	public Step1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getInPersonBtn() {
		return inPersonBtn;
	}

	public WebElement getVideoConsultBtn() {
		return videoConsultBtn;
	}

	public WebElement getTelephoneConsultBtn() {
		return telephoneConsultBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
}
