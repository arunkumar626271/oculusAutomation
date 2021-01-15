package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalkInFormPage {
	@FindBy(xpath = "//h4[text()='Walk-In']")
	private WebElement pageHeading;
	@FindBy(name = "visitReason")
	private WebElement visitReasonField;
	@FindBy(xpath = "//label[@id='genderLabel']/parent::div")
	private WebElement genderField;
	@FindBy(xpath = "//li[text()='Male']")
	private WebElement genderValue;
	@FindBy(name = "firstName")
	private WebElement firstNameField;
	@FindBy(name = "lastName")
	private WebElement lastNameField;
	@FindBy(name = "lineOne")
	private WebElement addressLine1Field;
	@FindBy(name = "lineTwo")
	private WebElement addressLine2Field;
	@FindBy(name = "city")
	private WebElement cityField;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement stateField;
	@FindBy(name = "zipCode")
	private WebElement zipCodeField;
	@FindBy(name = "birthdate")
	private WebElement birthDateField;
	@FindBy(name = "cellPhone")
	private WebElement cellPhoneField;
	@FindBy(name = "email")
	private WebElement emailField;
	@FindBy(xpath = "//span[@class='MuiIconButton-label']/input")
	private WebElement selfPayCheckbox;
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueBtn;
	public WalkInFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVisitReasonField() {
		return visitReasonField;
	}

	public WebElement getGenderField() {
		return genderField;
	}

	public WebElement getGenderValue() {
		return genderValue;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getAddressLine1Field() {
		return addressLine1Field;
	}

	public WebElement getAddressLine2Field() {
		return addressLine2Field;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getStateField() {
		return stateField;
	}

	public WebElement getZipCodeField() {
		return zipCodeField;
	}

	public WebElement getBirthDateField() {
		return birthDateField;
	}

	public WebElement getCellPhoneField() {
		return cellPhoneField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getSelfPayCheckbox() {
		return selfPayCheckbox;
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
