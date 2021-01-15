package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareTakerPage 
{
	@FindBy(xpath="//h1[text()='Enter the caretaker / account holder’s information']")
	private WebElement pageHeading;
	
	@FindBy(name="careTakerFirstName")
	private WebElement careTakerFirstNameField;
	
	@FindBy(name="careTakerLastName")
	private WebElement careTakerLastNameField;
	
	@FindBy(name="careTakerBirthDate")
	private WebElement careTakerBirthDayField;
	
	@FindBy(name="phoneNumber")
	private WebElement careTakerPhoneNumberField;
	
	@FindBy(name="careTakerEmail")
	private WebElement careTakerEmailField;
	
	@FindBy(xpath="//button[text()='Next step']")
	private WebElement nextStepBtn;
	
	public CareTakerPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getCareTakerFirstNameField() {
		return careTakerFirstNameField;
	}

	public WebElement getCareTakerLastNameField() {
		return careTakerLastNameField;
	}

	public WebElement getCareTakerBirthDayField() {
		return careTakerBirthDayField;
	}

	public WebElement getCareTakerPhoneNumberField() {
		return careTakerPhoneNumberField;
	}

	public WebElement getCareTakerEmailField() {
		return careTakerEmailField;
	}

	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}
	
	
}
