package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceCarrierPage
{
	@FindBy(xpath="//h1[text()='Let’s talk Insurance!']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//div[contains(text(),'pay for myself')]")
	private WebElement payForMyselfBtn;
	
	@FindBy(xpath="//div[text()='Insurance']")
	private WebElement insuranceBtn;
	
	@FindBy(xpath="//div[text()='Credit Card']")
	private WebElement creditCardBtn;
	
	@FindBy(xpath="//div[text()='Check']")
	private WebElement checkBtn;
	
	@FindBy(xpath="//div[text()='Cash']")
	private WebElement cashBtn;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;
	
	public InsuranceCarrierPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getPayForMyselfBtn() {
		return payForMyselfBtn;
	}

	public WebElement getInsuranceBtn() {
		return insuranceBtn;
	}

	public WebElement getCreditCardBtn() {
		return creditCardBtn;
	}

	public WebElement getCheckBtn() {
		return checkBtn;
	}

	public WebElement getCashBtn() {
		return cashBtn;
	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
}
