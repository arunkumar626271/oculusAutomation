package com.oculushealth.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CovidScreeningPage {
	
	@FindBy(xpath="//h1[text()='COVID Screening']")
	private WebElement pageHeading;
	
	@FindBys(@FindBy(xpath="//div[text()='No']"))
	private List<WebElement> allNoBtns;
	
	@FindBys(@FindBy(xpath="//div[text()='Yes']"))
	private List<WebElement> allYesBtns;
	
	@FindBy(xpath="//button[text()='Next step']")
	private WebElement nextStepBtn;
	
	public CovidScreeningPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageHeading() {
		return pageHeading;
	}

	public List<WebElement> getAllNoBtns() {
		return allNoBtns;
	}

	public List<WebElement> getAllYesBtns() {
		return allYesBtns;
	}
	public WebElement getNextStepBtn() {
		return nextStepBtn;
	}
	
}
