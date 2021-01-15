package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddYourCreditCardPage {
	@FindBy(xpath = "//h1[text()='Let’s add your credit card']")
	private WebElement pageHeading;

	@FindBy(xpath = "//label[text()='Card number']//iframe")
	private WebElement ccnIframe;

	@FindBy(xpath = "//div[@class='CardNumberField-input-wrapper']//input[@name='cardnumber']")
	private WebElement creditCardNumField;

	@FindBy(xpath = "//iframe[@title='Secure expiration date input frame']")
	private WebElement expirationDateIFrame;

	@FindBy(name = "exp-date")
	private WebElement expiryDateField;

	@FindBy(xpath = "//iframe[@title='Secure CVC input frame']")
	private WebElement cvcIFrame;

	@FindBy(name = "cvc")
	private WebElement cvcField;

	@FindBy(name = "zipCode")
	private WebElement zipCodeField;

	@FindBy(xpath = "//button[text()='Next step']")
	private WebElement nextStepBtn;

	@FindBy(xpath = "//a[text()='Skip']")
	private WebElement skipLink;

	public AddYourCreditCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getCcnIframe() {
		return ccnIframe;
	}

	public WebElement getCreditCardNumField() {
		return creditCardNumField;
	}

	public WebElement getExpirationDateIFrame() {
		return expirationDateIFrame;
	}

	public WebElement getCvcIFrame() {
		return cvcIFrame;
	}

	public WebElement getExpiryDateField() {
		return expiryDateField;
	}

	public WebElement getCvcField() {
		return cvcField;
	}

	public WebElement getZipCodeField() {
		return zipCodeField;
	}

	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}

	public WebElement getSkipLink() {
		return skipLink;
	}

}
