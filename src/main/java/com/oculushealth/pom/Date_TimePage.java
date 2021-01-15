package com.oculushealth.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Date_TimePage {
	@FindBy(xpath = "//h1[text()='Please pick Date and Time']")
	private WebElement pageHeading;

	@FindBy(xpath = "//input[@name='date']/following-sibling::input[@name='month']")
	private WebElement dateField;

	@FindBy(xpath = "//button[contains(@class,'navigation__next-button')]")
	private WebElement navigateToNextMonthBtn;

	@FindBy(xpath = "(//button/abbr[text()='1'])[1]")
	private WebElement selectedDate;

	@FindBy(xpath = "(//div[@class='radioItem '])[1]")
	private WebElement timeSlot;

	@FindBy(xpath = "//button[text()='Next step']")
	private WebElement nextStepBtn;

	public Date_TimePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public WebElement getDateField() {
		return dateField;
	}

	public WebElement getNavigateToNextMonthBtn() {
		return navigateToNextMonthBtn;
	}

	public WebElement getSelectedDate() {
		return selectedDate;
	}

	public WebElement getTimeSlot() {
		return timeSlot;
	}

	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}
}
