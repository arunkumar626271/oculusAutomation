package com.oculushealth.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.oculushealth.features.AddYourCreditCardPageFeatures;
import com.oculushealth.features.CareTakerPageFeatures;
import com.oculushealth.features.CheckInfoAboutAppointmentPageFeatures;
import com.oculushealth.features.ConfirmedAppointmentPageFeatures;
import com.oculushealth.features.CovidScreeningPageFeatures;
import com.oculushealth.features.Date_TimePageFeatures;
import com.oculushealth.features.DoctorListPageFeatures;
import com.oculushealth.features.InsuranceCarrierPageFeatures;
import com.oculushealth.features.PatientInfoPageFeatures;
import com.oculushealth.features.PatientTypePageFeatures;
import com.oculushealth.features.PersonalInfoPageFeatures;
import com.oculushealth.features.Step1PageFeatures;
import com.oculushealth.features.Step2PageFeatures;
import com.oculushealth.features.Step3PageFeatures;
import com.oculushealth.generics.BaseTest;

public class BookAppointmentOculusCreditCardTest extends BaseTest {
	@Test(priority = 1, enabled = true)
	public void bookVideoAppointmentForMyself() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMySelfAndProceed();
		// Input Personal Info
		PersonalInfoPageFeatures pipf = new PersonalInfoPageFeatures(driver);
		pipf.verifyPersonalInfoPage();
		pipf.enterPersonalDataAndProceed();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	@Test(priority = 2, enabled = true)
	public void bookInPersonAppointmentForMySelf()
			throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select In Person Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectInPersonAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMySelfAndProceed();
		// Input Personal Info
		PersonalInfoPageFeatures pipf = new PersonalInfoPageFeatures(driver);
		pipf.verifyPersonalInfoPage();
		pipf.enterPersonalDataAndProceed();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	

	@Test(priority = 3, enabled = true)
	public void bookVideoAppointmentForChild() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMyChildAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	@Test(priority = 4, enabled = true)
	public void bookInPersonAppointmentForChild() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select InPerson Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectInPersonAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMyChildAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	
	@Test(priority = 5, enabled = true)
	public void bookVideoAppointmentForSpouse() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMySpouseAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	@Test(priority = 6, enabled = true)
	public void bookInPersonAppointmentForSpouse()
			throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeMySpouseAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	@Test(priority = 7, enabled = true)
	public void bookVideoAppointmentForOther() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeOtherAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

	@Test(priority = 8, enabled = true)
	public void bookInPersonAppointmentForOther() throws EncryptedDocumentException, IOException, InterruptedException {
		// Click on Doctor
		DoctorListPageFeatures dlpf = new DoctorListPageFeatures(driver);
		dlpf.navigateToDoctorAppointment();
		// Select time slot and appointment date
		Date_TimePageFeatures dtpf = new Date_TimePageFeatures(driver);
		dtpf.verifyDateTimePage();
		dtpf.selectDate();
		dtpf.selectTimeSlotAndProceed();
		// Select video Consult and proceed
		Step1PageFeatures spf1 = new Step1PageFeatures(driver);
		spf1.verifyStep1Page();
		spf1.selectVideoConsultAndContinue();
		// select Patient type as Myself and proceed
		PatientTypePageFeatures ptpf = new PatientTypePageFeatures(driver);
		ptpf.verifyPatientTypePage();
		ptpf.selectPatientTypeOtherAndProceed();
		// Input Patient Info
		PatientInfoPageFeatures pipf = new PatientInfoPageFeatures(driver);
		pipf.verifyPatientInfoPage();
		pipf.enterPatientDataAndProceed();
		// Input Care Taker Info
		CareTakerPageFeatures ctpf = new CareTakerPageFeatures(driver);
		ctpf.verifyCareTakerPage();
		ctpf.enterCareTakerData();
		// Symptoms selection
		Step2PageFeatures spf2 = new Step2PageFeatures(driver);
		spf2.verifyStep2Page();
		spf2.selectSymptomAndProceed();
		// Proceed with Insurance
		Step3PageFeatures spf3 = new Step3PageFeatures(driver);
		spf3.verifyStep3Page();
		spf3.clickOnContinueAndProceed();
		// select Pay by myself and proceed
		InsuranceCarrierPageFeatures icpf = new InsuranceCarrierPageFeatures(driver);
		icpf.verifyInsuranceCarrierPage();
		icpf.selectPayMyself();
		icpf.selectCreditCardAndProceed();
		// Add Your credit card details
		AddYourCreditCardPageFeatures ayccpf = new AddYourCreditCardPageFeatures(driver);
		ayccpf.verifyAddYourCreditCardPage();
		ayccpf.enterCreditCardInfoAndContinue();
		// Filling In Covid Form
		CovidScreeningPageFeatures cspf = new CovidScreeningPageFeatures(driver);
		cspf.verifyCovidScreeningPage();
		cspf.clickingAllNoBtns();
		// Confirm Appointment
		CheckInfoAboutAppointmentPageFeatures ciaapf = new CheckInfoAboutAppointmentPageFeatures(driver);
		ciaapf.verifyConfirmAppointmentPage();
		ciaapf.confirmAppointment();
		// Verify The Confirmed Appointment
		ConfirmedAppointmentPageFeatures capf = new ConfirmedAppointmentPageFeatures(driver);
		capf.verifyAppointmentMessage();
	}

}
