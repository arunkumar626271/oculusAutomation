package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientInfoPage {
	@FindBy(xpath = "//h1[text()='Enter patient’s Information']")
	private WebElement pageHeading;

	@FindBy(name = "firstName")
	private WebElement firstNameField;

	@FindBy(name = "lastName")
	private WebElement lastNameField;

	@FindBy(name = "birthDate")
	private WebElement birthDateField;

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement genderMaleBtn;

	@FindBy(xpath = "//div[text()='Female']")
	private WebElement genderFemaleBtn;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueBtn;

	public PatientInfoPage(WebDriver driver) {
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

	public WebElement getGenderMaleBtn() {
		return genderMaleBtn;
	}

	public WebElement getGenderFemaleBtn() {
		return genderFemaleBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
