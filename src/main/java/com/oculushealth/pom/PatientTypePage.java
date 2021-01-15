package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientTypePage 
{
	@FindBy(xpath="//h1[text()='Who is the appointment for']")
	private WebElement pageHeading;
	
	@FindBy(xpath="//div[@class='patient']//span[text()='Myself']")
	private WebElement patientTypeMyselfBtn;
	
	@FindBy(xpath="//div[@class='patient']//span[text()='My Child']")
	private WebElement patientTypeMyChildBtn;
	
	@FindBy(xpath="//div[@class='patient']//span[text()='My Spouse']")
	private WebElement patientTypeMySpouseBtn;
	
	@FindBy(xpath="//div[@class='patient']//span[text()='Other']")
	private WebElement patientTypeOtherBtn;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBtn;
	
	public PatientTypePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getPatientTypeMyselfBtn() {
		return patientTypeMyselfBtn;
	}

	public WebElement getPatientTypeMyChildBtn() {
		return patientTypeMyChildBtn;
	}

	public WebElement getPatientTypeMySpouseBtn() {
		return patientTypeMySpouseBtn;
	}

	public WebElement getPatientTypeOtherBtn() {
		return patientTypeOtherBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	
}
