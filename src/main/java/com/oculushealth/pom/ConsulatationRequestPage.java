package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsulatationRequestPage {
	@FindBy(xpath = "//label[text()='Select a provider *']")
	private WebElement providerDropdown;

	@FindBy(xpath = "//label[text()='Select a provider *']/following-sibling::div/input")
	private WebElement selectProviderTextField;

	@FindBy(xpath = "//input[@id='duration-simple']/parent::div")
	private WebElement durationField;

	@FindBy(xpath = "//li[text()='15 min']")
	private WebElement durationValue;

	@FindBy(name = "date")
	private WebElement dateField;

	@FindBy(xpath = "//span[text()='Request']")
	private WebElement requestBtn;

	@FindBy(xpath = "//input[@id='type-simple']/parent::div")
	private WebElement typeField;

	@FindBy(xpath = "//li[text()='In person']")
	private WebElement typeFieldValue;

	@FindBy(name = "visitReason")
	private WebElement visitReasonField;

	@FindBy(xpath = "//input[@id='genderLabel']/parent::div")
	private WebElement genderFiled;

	@FindBy(xpath = "//li[text()='Male']")
	private WebElement genderFieldValue;

	@FindBy(name = "firstName")
	private WebElement firstNameField;

	@FindBy(name = "lastName")
	private WebElement lastNameField;

	@FindBy(name = "lineOne")
	private WebElement addressLine1Field;

	@FindBy(name = "lineTwo")
	private WebElement addressLine2Field;
	
	@FindBy(name="city")
	private WebElement cityField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateField;
	
	@FindBy(name="zipCode")
	private WebElement zipCodeField;
	
	@FindBy(name="birthdate")
	private WebElement birthDateField;
	
	@FindBy(name="cellPhone")
	private WebElement cellPhoneField;
	
	@FindBy(name="email")
	private WebElement emailField;
	
	@FindBy(xpath="//span[@class='MuiIconButton-label']/input")
	private WebElement selfPayCheckbox;
	
	public ConsulatationRequestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTypeField() {
		return typeField;
	}

	public WebElement getTypeFieldValue() {
		return typeFieldValue;
	}

	public WebElement getDurationField() {
		return durationField;
	}

	public WebElement getDurationValue() {
		return durationValue;
	}

	public WebElement getProviderDropdown() {
		return providerDropdown;
	}

	public WebElement getSelectProviderTextField() {
		return selectProviderTextField;
	}

	public WebElement getDateField() {
		return dateField;
	}

	public WebElement getRequestBtn() {
		return requestBtn;
	}

	public WebElement getVisitReasonField() {
		return visitReasonField;
	}

	public WebElement getGenderFiled() {
		return genderFiled;
	}

	public WebElement getGenderFieldValue() {
		return genderFieldValue;
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
}
