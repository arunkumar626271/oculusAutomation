package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Walk_In_Check_In_ChoicePage {
	
	@FindBy(xpath = "//h4/nobr[text()='WALK-IN']")
	private WebElement walkInBtn;

	@FindBy(xpath = "//h4/nobr[text()='CHECK IN']")
	private WebElement checkInBtn;

	public Walk_In_Check_In_ChoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWalkInBtn() {
		return walkInBtn;
	}

	public WebElement getCheckInBtn() {
		return checkInBtn;
	}
}
