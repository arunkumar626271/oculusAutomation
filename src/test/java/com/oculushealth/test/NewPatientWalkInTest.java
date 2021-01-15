package com.oculushealth.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.oculushealth.features.WalkInDemoGraphicsFeatures;
import com.oculushealth.features.WalkInFormFeatures;
import com.oculushealth.features.Walk_In_Check_In_Features;
import com.oculushealth.generics.BaseTest;
public class NewPatientWalkInTest extends BaseTest
{
	
  @Test
  public void fillWalkInPage() throws EncryptedDocumentException, IOException 
  {
	  Walk_In_Check_In_Features wicif = new Walk_In_Check_In_Features(driver);
	  wicif.clickOnWalkInButton();
	  WalkInFormFeatures wiff = new WalkInFormFeatures(driver);
	  wiff.verifyWalkInPage();
	  wiff.fillWalkInForm();
	  WalkInDemoGraphicsFeatures widgf = new WalkInDemoGraphicsFeatures(driver);
	  widgf.verifyDemographicsPage();
	  
  }
}
