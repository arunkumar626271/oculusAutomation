package com.oculushealth.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.oculushealth.features.ConsultationRequestSuccessFeature;
import com.oculushealth.features.CousultationRequestFeature;
import com.oculushealth.generics.BaseLib;

public class BookAppointmentTest extends BaseLib{
	
  @Test
  public void bookAppointment() throws EncryptedDocumentException, IOException 
  {
	  //Reporter.log("Framework setup is fine", true);
	  CousultationRequestFeature crf = new CousultationRequestFeature(driver);
	  ConsultationRequestSuccessFeature crsf = new ConsultationRequestSuccessFeature(driver);
	  crf.validateDateField();
	  crf.validateVisitReasonField();
	  crf.validateFirstNameField();
	  crf.validateLastNameField();
	  crf.validateAddressLine1Field();
	  crf.validateCityField();
	  crf.validateZipCodeField();
	  crf.validateBirthdateField();
	  crf.validateCellPhoneField();
	  crf.validateEmailField();
	  crf.enterData();
	  crsf.verifyConsultationSuccessMessage();
  }
}
