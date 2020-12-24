package com.oculushealth.generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenerImpl implements ITestListener {
	public static int passCount, failCount, skipCount, executionCount;

	public void onTestStart(ITestResult result) {
		executionCount++;
		Reporter.log(result.getName() + " script started " + new Date(), true);

	}

	public void onTestSuccess(ITestResult result) {
		passCount++;
		Reporter.log(result.getName() + " executed successfully " + new Date(), true);

	}

	public void onTestFailure(ITestResult result) {
		failCount++;
		BaseLib bl  = (BaseLib) result.getInstance();
		WebDriver driver = bl.getDriver();
		Reporter.log(result.getName() + "  has failed " + new Date(), true);
		File destFile = new File(System.getProperty("user.dir")+File.separator+"screenshot"+File.separator+ result.getName() +".jpg");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		skipCount++;
		Reporter.log(result.getName() + " is skipped " + new Date(), true);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		Reporter.log(context.getName() + " Framework Execution started " + new Date(), true);

	}

	public void onFinish(ITestContext context) {
		Reporter.log(context.getName() + " Framework Execution finished " + new Date(), true);

	}

}
