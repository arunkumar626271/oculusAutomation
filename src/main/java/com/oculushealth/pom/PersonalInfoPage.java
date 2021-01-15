package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage 
{
	@FindBy(xpath="//h1[text()='Enter your personal information']")
	private WebElement pageHeading;
	
	@FindBy(name="firstName")
	private WebElement firstNameField;
	
	@FindBy(name="lastName")
	private WebElement lastNameField;
	
	@FindBy(name="birthDate")
	private WebElement birthDateField;
	
	@FindBy(name="phoneNumber")
	private WebElement phoneNumberField;
	
	@FindBy(name="email")
	private WebElement emailField;
	
	@FindBy(xpath="//div[text()='Male']")
	private WebElement genderMaleBtn;
	
	@FindBy(xpath="//button[text()='Next Step']")
	private WebElement nextStepBtn;
	
	public PersonalInfoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getBirthDateField() {
		return birthDateField;
	}

	public WebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getGenderMaleBtn() {
		return genderMaleBtn;
	}

	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}
	
	
	
}
