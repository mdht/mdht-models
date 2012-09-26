/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.flu.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluFactory;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class InfluenzaCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static fluFactory FLU = fluFactory.eINSTANCE;
	
	public static String TIME_STAMP = "20110913102500-0500";
	public static String REPORT_TIME_STAMP = "20110915102500-0500";
	public static String TIME_STAMP_ENCOUNTER = "20110913000000-0700";
	public static String SYMPTOM1_TIME_STAMP = "20110911102500-0500";
	public static String SYMPTOM2_TIME_STAMP = "20110913102500-0500";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-203-555-5401";
	public static String TEST_CITY = "Hartford";
	public static String TEST_STATE = "CT";
	public static String TEST_POSTALCODE = "06475";	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		//PublicHealthCaseReport document = PHCR.createPublicHealthCaseReport().init();
		InfluenzaCaseReport document = FLU.createInfluenzaCaseReport().init();
		
		setHeader(document);
		
		setPatient(document);
		setReporter(document);
		setCustodian(document);
		setVerifier(document);
		
		setSocialHistorySection(document);
		setClinicalInformationSection(document);
		setTreatmentInformationSection(document);
		setEncountersSection(document);
		setDxTestsSection(document);
		
		// Output document to console
		CDAUtil.save(document, System.out);
		System.out.println();

		// Validate CDA
		ValidationHandler handler = new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			
			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
			
//			@Override
//			public void handleInfo(Diagnostic diagnostic) {
//				System.out.println("INFO: " + diagnostic.getMessage());
//			}		
		};
		boolean valid = CDAUtil.validate(document, handler);
		if (valid) {
			System.out.println("Influenza document is valid");
		} else {
			System.out.println("Influenza document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "SampleFLUCDA.xml");
		FileWriter fw = new FileWriter(fileOut);
		PrintWriter pw = new PrintWriter(fw);
		CDAUtil.save(document, pw);
	}
	
	
	/**
	 * Public Health Case Report Header
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setHeader(PublicHealthCaseReport document) throws Exception {
		
		String documentTypeIdRoot = "2.16.840.1.113883.1.3";
		String documentTypeIdExtension = "POCD_HD000040";
		II documentId = Datatypes.createII(UUID.randomUUID().toString());
		TS documentEffectiveTime = Datatypes.createTS(REPORT_TIME_STAMP);
		CS documentLanguageCode = Datatypes.createCS("en-US");
		CE documentConfidentialityCode = Datatypes.createCE("N", "2.16.840.1.113883.5.25");
		
		// document typeId
		InfrastructureRootTypeId documentTypeId = CDA.createInfrastructureRootTypeId();
		documentTypeId.setRoot(documentTypeIdRoot);
		documentTypeId.setExtension(documentTypeIdExtension);
		document.setTypeId(documentTypeId);
		
		// unique documentId (generated)
		document.setId(documentId);
		
		// document effectiveTime
		document.setEffectiveTime(documentEffectiveTime);
		
		// document languageCode
		document.setLanguageCode(documentLanguageCode);
		
		// document confidentialityCode
		document.setConfidentialityCode(documentConfidentialityCode);
	}
	
	
	/**
	 * Public Health Case Report Header - Patient
	 *  ClinicalDocument > RecordTarget > PatientRole > Patient
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setPatient(PublicHealthCaseReport document) throws Exception {

		
		II patientId = Datatypes.createII(TEST_ROOT, "214365");
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("17 Cromwell Avenue");
		patientAddress.addCity("Rocky Hill");
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode("06487");
		
		TEL patientTelecom = Datatypes.createTEL("tel: +1203-555-5787");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Jenson");
		patientName.addGiven("Alyssa");
		
		CE patientGender = Datatypes.createCE("F", "2.16.840.1.113883.5.1", "HL7", "Female");
		TS patientBirthTime = Datatypes.createTS("19910623102500-0500");
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("US");
		
		PatientRole patientRole = CDA.createPatientRole();
		document.addPatientRole(patientRole);
		
		// patientRole > Id
		List<II> idList = new ArrayList<II>();
		idList.add(patientId);
		for (int i=0; i < idList.size(); i++) {
			patientRole.getIds().add(idList.get(i));
		}
		
		// patientRole > address
		List<AD> addressList = new ArrayList<AD>();
		addressList.add(patientAddress);
		for (int i=0; i < addressList.size(); i++) {
			patientRole.getAddrs().add(addressList.get(i));
		}
		
		// patientRole > telecom
		List<TEL> telecomList = new ArrayList<TEL>();
		telecomList.add(patientTelecom);
		for (int i=0; i < telecomList.size(); i++) {
			patientRole.getTelecoms().add(telecomList.get(i));
		}
	
		boolean hasPatient = false;
		Patient patient = CDA.createPatient();	
		
		// patientRole > patient > name
		List<PN> nameList = new ArrayList<PN>();
		nameList.add(patientName);
		for (int i=0; i < nameList.size(); i++) {
			patient.getNames().add(nameList.get(i));
			hasPatient = true;
		}
		
		// patientRole > patient > gender
		if (patientGender != null) {
			patient.setAdministrativeGenderCode(patientGender);
			hasPatient = true;
		}
		
		// patientRole > patient > birthTime
		if (patientBirthTime != null) {
			patient.setBirthTime(patientBirthTime);
			hasPatient = true;
		}
		
		// patientRole > patient > race
		if (patientRace != null) {
			patient.setRaceCode(patientRace);
			hasPatient = true;
		}
		
		// patientRole > patient > ethnicity
		if (patientEthnicity != null) {
			patient.setEthnicGroupCode(patientEthnicity);
			hasPatient = true;
		}		
		
		if (hasPatient) {
			patientRole.setPatient(patient);
			
			// patientRole > patient > birthPlace > place > address
			if (patientBirthPlaceAddress != null) {
				Birthplace patientBirthPlace = CDA.createBirthplace();
				Place place = CDA.createPlace();
				patientBirthPlace.setPlace(place);
				patient.setBirthplace(patientBirthPlace);				
				place.setAddr(patientBirthPlaceAddress);
			}
		}
	}
	
	/**
	 * Public Health Case Report Header - Reporter
	 *  ClinicalDocument > Author > AssignedAuthor > AssignedPerson 
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setReporter(PublicHealthCaseReport document) throws Exception {
		
		TS reporterEffectiveTime = Datatypes.createTS(REPORT_TIME_STAMP);
		
		II reporterId = Datatypes.createII(TEST_ROOT, "999");
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("31 New Britain Avenue");
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-203-555-5401");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Matthews");
		reporterName.addGiven("Michael");
		
		Author author = CDA.createAuthor();
		document.getAuthors().add(author);
		
		// author time
		if (reporterEffectiveTime != null) {
			author.setTime(reporterEffectiveTime);
		}
		
		AssignedAuthor assignedAuthor = CDA.createAssignedAuthor();
		author.setAssignedAuthor(assignedAuthor);
		
		// assignedAuthor > id
		List<II> authorIdList = new ArrayList<II>();
		authorIdList.add(reporterId);
		for (int i=0; i < authorIdList.size(); i++) {
			assignedAuthor.getIds().add(authorIdList.get(i));
		}
		
		// assignedAuthor > address
		List<AD> authorAdList = new ArrayList<AD>();
		authorAdList.add(reporterAddress);
		for (int i=0; i < authorAdList.size(); i++) {
			assignedAuthor.getAddrs().add(authorAdList.get(i));
		}
		
		// assignedAuthor > telecom
		List<TEL> authorTelList = new ArrayList<TEL>();
		authorTelList.add(reporterTelecom);
		for (int i=0; i < authorTelList.size(); i++) {
			assignedAuthor.getTelecoms().add(authorTelList.get(i));
		}
		
		Person person = CDA.createPerson();
		assignedAuthor.setAssignedPerson(person);
		
		// assignedAuthor > assignedPerson > name
		List<PN> providerNameList = new ArrayList<PN>();
		providerNameList.add(reporterName);
		for (int i=0; i < providerNameList.size(); i++) {
			person.getNames().add(providerNameList.get(i));
		}
	}
	
	/**
	 * Public Health Case Report Header - Custodian
	 *  ClinicalDocument > Custodian > AssignedCustodian > CustodianOrganization
	 *  
	 * @param document
	 * @throws Exception
	 */
	public static void setCustodian(PublicHealthCaseReport document) throws Exception {
		
		II custodianOrgId = Datatypes.createII(TEST_ROOT, "3902");
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Connecticut Health Data Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("55 Capitol Avenue");
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel: +1203-555-7253");
		
		Custodian custodian = CDA.createCustodian();
		AssignedCustodian assignedCust = CDA.createAssignedCustodian();
		CustodianOrganization custOrg = CDA.createCustodianOrganization();
		assignedCust.setRepresentedCustodianOrganization(custOrg);
		custodian.setAssignedCustodian(assignedCust);
		document.setCustodian(custodian);
		
		// assignedCustodian > custodianOrganization > id
		List<II> custodianIdList = new ArrayList<II>();
		custodianIdList.add(custodianOrgId);
		for (int i=0; i < custodianIdList.size(); i++) {
			custOrg.getIds().add(custodianIdList.get(i));
		}
		
		// assignedCustodian > custodianOrganization > name
		if (custodianOrgName != null) {
			custOrg.setName(custodianOrgName);
		}
		
		// assignedCustodian > custodianOrganization > address
		if (custodianOrgAddress != null) {
			custOrg.setAddr(custodianOrgAddress);
		}
		
		// assignedCustodian > custodianOrganization > telecom
		if (custodianOrgTelecom != null) {
			custOrg.setTelecom(custodianOrgTelecom);	
		}
	}
	
	/**
	 * Public Health Case Report Header - Verifier
	 *  ClinicalDocument > LegalAuthenticator > AssignedEntity > AssignedPerson
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setVerifier(PublicHealthCaseReport document) throws Exception {
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(TEST_ROOT, "5555");
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		
		TEL verifierTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Matthews");
		personName.addGiven("Michael");
		
		LegalAuthenticator authenticator = CDA.createLegalAuthenticator();
		document.setLegalAuthenticator(authenticator);
		
		// legalAuthenticator > effectiveTime
		if (verifierEffectiveTime != null) {
			authenticator.setTime(verifierEffectiveTime);
		}
		
		// legalAuthenticator > signatureCode
		if (signatureCode != null) {
			authenticator.setSignatureCode(signatureCode);
		}
		
		AssignedEntity entity = CDA.createAssignedEntity();
		authenticator.setAssignedEntity(entity);
		
		// legalAuthenticator > assignedEntity > id
		List<II> entityIdList = new ArrayList<II>();
		entityIdList.add(verifierId);
		for (int i=0; i < entityIdList.size(); i++) {
			entity.getIds().add(entityIdList.get(i));
		}
		
		// legalAuthenticator > assignedEntity > address
		List<AD> entityAdList = new ArrayList<AD>();
		entityAdList.add(verifierAddress);
		for (int i=0; i < entityAdList.size(); i++) {
			entity.getAddrs().add(entityAdList.get(i));
		}
		
		// legalAuthenticator > assignedEntity > telecom
		List<TEL> entityTelList = new ArrayList<TEL>();
		entityTelList.add(verifierTelecom);
		for (int i=0; i < entityTelList.size(); i++) {
			entity.getTelecoms().add(entityTelList.get(i));
		}
		
		Person person = CDA.createPerson();
		entity.setAssignedPerson(person);
		
		// legalAuthenticator > assignedEntity > assignedPerson > name
		if (personName != null) {
			person.getNames().add(personName);
		}
	}
	
	/**
	 * Public Health Case Report - Social History Section (SHOULD)
	 * Contains data defining the patients occupational, personal (e.g., lifestyle), social, 
	 * and environmental history and health risk factors, as well as administrative data such as race.
	 * 
	 * Clinical Statement Templates:
	 *   Geotemporal history observation (SHOULD) 0..*
	 *   Most recent time arrived in USA observation (SHOULD) 0..1
	 *   Race observation (SHOULD) 0..*
	 *   Occupation observation (SHOULD) 0..*
	 *   Pregnancy observation (SHOULD) 0..*
	 *     > Estimated Date of Delivery (MAY) 0..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		InfluenzaPHCRSocialHistorySection socialHistorySection = FLU.createInfluenzaPHCRSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		// Geotemporal history observation (SHOULD) 0..* - if exists, must have a value (CD locationCode)
		// ValueSet 2.16.840.1.114222.4.11.3201
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=9CE75E17-176B-DE11-9B52-0015173D1785
		
		CD locationCode1 = Datatypes.createCD("JAP", "1.0.3166.1", "ISO 3166-1", "JAPAN");
		IVL_TS locationTime1 = Datatypes.createIVL_TS("20110901000000-0600");
		IVXB_TS locationTimeLow = Datatypes.createIVXB_TS();
		locationTimeLow.setValue("20110901000000-0600");
		locationTime1.setLow(locationTimeLow);
		IVXB_TS locationTimeHigh = Datatypes.createIVXB_TS();
		locationTimeHigh.setValue("20110910000000-0600");
		locationTime1.setHigh(locationTimeHigh);
		
		String geotemporalHistorySectionText1 = "Geotemporal history - Japan, 9/1/2011 through 9/10/2011";
		
		List<CD> geotemporalHistoryCodes = new ArrayList<CD>();
		List<IVL_TS> geotemporalHistoryEffectiveTimes = new ArrayList<IVL_TS>();
		geotemporalHistoryCodes.add(locationCode1);
		geotemporalHistoryEffectiveTimes.add(locationTime1);

		int count = geotemporalHistoryCodes.size();
		for (int i=0; i < count; i++) {
			CD locationCode = geotemporalHistoryCodes.get(i);
			if (locationCode != null) {
				GeotemporalHistoryObservation geotemporalHistoryObservation = PHCR.createGeotemporalHistoryObservation().init();
				if (geotemporalHistoryEffectiveTimes.size() > i && geotemporalHistoryEffectiveTimes.get(i) != null) {
					geotemporalHistoryObservation.setEffectiveTime(geotemporalHistoryEffectiveTimes.get(i));
				}
				geotemporalHistoryObservation.getValues().add(locationCode);
				socialHistorySection.addObservation(geotemporalHistoryObservation);
				((Entry) geotemporalHistoryObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
				
				hasSocialHistory = true;
			}
		}
		
		//Most recent time arrived in USA observation (SHOULD) 0..1 - if exists, must have a value (TS arrivalTime)
		
		TS arrivalTime = Datatypes.createTS("20110910000000-0600");
		
		String mostRecentTimeArrivedSectionText = "Most Recent Time Arrived in USA - " + timeStampFormat(arrivalTime.getValue(), TEST_DATE_FORMAT);
		
		if (arrivalTime != null) {
			MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation = PHCR.createMostRecentTimeArrivedInUSAObservation().init();
			mostRecentTimeArrivedInUSAObservation.getValues().add(arrivalTime);
			socialHistorySection.addObservation(mostRecentTimeArrivedInUSAObservation);
			((Entry) mostRecentTimeArrivedInUSAObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			hasSocialHistory = true;
		}
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2106-3", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "White");
		
		String raceCodeSectionText1 = "Race - White";
		
		List<CD> raceCodes = new ArrayList<CD>();
		raceCodes.add(raceCode1);
		count = raceCodes.size();
		
		for (int i=0; i < count; i++) {
			CD raceCode = raceCodes.get(i);
			if (raceCode != null) {
				RaceObservation raceObservation = PHCR.createRaceObservation().init();
				raceObservation.getValues().add(raceCode);
				socialHistorySection.addObservation(raceObservation);
				((Entry) raceObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

				hasSocialHistory = true;
			}
		}
		
		boolean hasOccupation = true;
		
		String occupationSectionText1 = "Occupation - Child Care Worker";
		String occupationSectionText2 = "Occupation Location - ABCs Learning Center, 54 Farmington Avenue, Hartford, CT 06427 (tel: 203-555-9320)"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
			CD occupationCode = Datatypes.createCD("39-9010", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Child Care Worker");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addStreetAddressLine("54 Farmington Avenue");
			locationAddress.addCity(TEST_CITY);
			locationAddress.addState(TEST_STATE);
			locationAddress.addPostalCode("06427");

			TEL locationTelecom = Datatypes.createTEL(TEST_TELECOM);

			PN locationName = Datatypes.createPN();
			locationName.addText("ABCs Learning Center");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
			CD occupationHistoryCode = Datatypes.createCD("6244", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Child Day Care Services");

			// occupation observation
			OccupationObservation occupationObservation = PHCR.createOccupationObservation().init();
			socialHistorySection.addObservation(occupationObservation);
			((Entry) occupationObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			if (occupationNegationIndicator == true) {
				occupationObservation.setNegationInd(occupationNegationIndicator);
			}
			if (occupationEffectiveTime != null) {
				occupationObservation.setEffectiveTime(occupationEffectiveTime);
			}
			if (occupationCode != null) {
				occupationObservation.getValues().add(occupationCode);
			}
			
			// occupation location participant
			Participant2 occupationParticipant = CDA.createParticipant2();
			occupationParticipant.setTypeCode(ParticipationType.LOC);
			ParticipantRole occupationParticipantRole = CDA.createParticipantRole();
			occupationParticipantRole.setClassCode(RoleClassRoot.LOCE);
			PlayingEntity occupationPlayingEntity = CDA.createPlayingEntity();
			occupationPlayingEntity.setClassCode(EntityClassRoot.PLC);
			occupationParticipantRole.setPlayingEntity(occupationPlayingEntity);
			occupationParticipant.setParticipantRole(occupationParticipantRole);
			occupationObservation.getParticipants().add(occupationParticipant);
			
			if (locationAddress != null) {
				occupationParticipantRole.getAddrs().add(locationAddress);
			}
			if (locationTelecom != null) {
				occupationParticipantRole.getTelecoms().add(locationTelecom);
			}
			if (locationName != null) {
				occupationPlayingEntity.getNames().add(locationName);
			}
			
			// occupation industry history observation
			Observation occupationIndustryHxObservation = CDA.createObservation();
			occupationIndustryHxObservation.setClassCode(ActClassObservation.OBS);
			occupationIndustryHxObservation.setMoodCode(x_ActMoodDocumentObservation.EVN);
			occupationIndustryHxObservation.setCode(Datatypes.createCD("21844-6", LOINC_OID, LOINC_SYSTEM_NAME, "Industry Hx"));
			occupationIndustryHxObservation.setStatusCode(Datatypes.createCS("completed"));
			occupationObservation.addObservation(occupationIndustryHxObservation);
			((EntryRelationship) occupationIndustryHxObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
			
			if (occupationHistoryEffectiveTime != null) {
				occupationIndustryHxObservation.setEffectiveTime(occupationHistoryEffectiveTime);
			}
			if (occupationHistoryCode != null) {
				occupationIndustryHxObservation.getValues().add(occupationHistoryCode);
			}

			hasSocialHistory = true;
		}

		// Employment Status observation (SHOULD) 0..1 - if exists, must have a value (CD employmentStatusCode)
		// ValueSet 2.16.840.1.114222.4.11.3254
		
		CD employmentStatusCode = Datatypes.createCD("406156006", SNOMED_OID, SNOMED_SYSTEM_NAME, "In paid employment");
		
		String employmentStatusCodeSectionText = "Employment status - In paid employment";
		
			if (employmentStatusCode != null) {
				InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation = FLU.createInfluenzaEmploymentStatusObservation().init();
				influenzaEmploymentStatusObservation.getValues().add(employmentStatusCode);
				socialHistorySection.addObservation(influenzaEmploymentStatusObservation);
				((Entry) influenzaEmploymentStatusObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

				hasSocialHistory = true;
			}
		
			// Influenza possible exposure location and type (MAY) 0..* - if exists, must have an exposure location
			// ADD Possible Exposure Location: International [PHVS_DiseaseAcquiredJurisdiction_NND, 2.16.840.1.114222.4.11.3030, C1512888, International]
			
			boolean hasExposureLocation = true;
			
			String exposureLocationSectionText = "Possible Exposure Location - International";
			String exposureAnimalSectionText = "Possible Exposure to Influenza";
			
			if (hasExposureLocation) {
			
				IVL_TS exposureLocationTime = Datatypes.createIVL_TS();
				IVXB_TS exposureLocationTimeLow = Datatypes.createIVXB_TS();
				exposureLocationTimeLow.setValue("20110820000000-0600");
				exposureLocationTime.setLow(exposureLocationTimeLow);
				IVXB_TS exposureLocationTimeHigh = Datatypes.createIVXB_TS();
				exposureLocationTimeHigh.setValue("20110831000000-0600");
				exposureLocationTime.setHigh(exposureLocationTimeHigh);

				InfluenzaPossibleExposureLocationAct locationAndTypeAct = FLU.createInfluenzaPossibleExposureLocationAct().init();

				CD actCode = locationAndTypeAct.getCode();

				CV qualifierValue1 = Datatypes.createCV();
				qualifierValue1.setCode("246090004");
				qualifierValue1.setCodeSystem(SNOMED_OID);
				qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
				qualifierValue1.setDisplayName("Associated finding");

				CD qualifierCode1 = Datatypes.createCD("???", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Lori exposure");

				CV qualifierValue2 = Datatypes.createCV();
				qualifierValue2.setCode("408729009");
				qualifierValue2.setCodeSystem(SNOMED_OID);
				qualifierValue2.setCodeSystemName(SNOMED_SYSTEM_NAME);
				qualifierValue2.setDisplayName("Finding context");

				CD qualifierCode2 = Datatypes.createCD("410590009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Known possible");

				CR actCodeQualifier1 = Datatypes.createCR();
				actCodeQualifier1.setName(qualifierValue1);
				actCodeQualifier1.setValue(qualifierCode1);

				CR actCodeQualifier2 = Datatypes.createCR();
				actCodeQualifier2.setName(qualifierValue2);
				actCodeQualifier2.setValue(qualifierCode2);

				actCode.getQualifiers().add(actCodeQualifier1);
				actCode.getQualifiers().add(actCodeQualifier2);

				Participant2 exposureLocationParticipant = CDA.createParticipant2();
				exposureLocationParticipant.setTypeCode(ParticipationType.LOC);
				ParticipantRole exposureLocationParticipantRole = CDA.createParticipantRole();
				exposureLocationParticipantRole.setClassCode(RoleClassRoot.LOCE);
				PlayingEntity exposureLocationPlayingEntity = CDA.createPlayingEntity();
				exposureLocationPlayingEntity.setClassCode(EntityClassRoot.PLC);
				exposureLocationParticipantRole.setPlayingEntity(exposureLocationPlayingEntity);
				exposureLocationParticipant.setParticipantRole(exposureLocationParticipantRole);
				locationAndTypeAct.getParticipants().add(exposureLocationParticipant);

				exposureLocationParticipant.setTime(exposureLocationTime);

				Participant2 exposureAnimalParticipant = CDA.createParticipant2();
				exposureAnimalParticipant.setTypeCode(ParticipationType.DIR);
				ParticipantRole exposureAnimalParticipantRole = CDA.createParticipantRole();
				exposureAnimalParticipantRole.setClassCode(RoleClassRoot.EXPR);
				Entity exposureAnimalPlayingEntity = CDA.createEntity();
				exposureAnimalPlayingEntity.setClassCode(EntityClassRoot.ANM);
				exposureAnimalParticipantRole.setScopingEntity(exposureAnimalPlayingEntity);
				exposureAnimalParticipant.setParticipantRole(exposureAnimalParticipantRole);
				locationAndTypeAct.getParticipants().add(exposureAnimalParticipant);

				socialHistorySection.addAct(locationAndTypeAct);
				((Entry) locationAndTypeAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

				hasSocialHistory = true;
			}

			
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Influenza Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Geotemporal history observation
			items.add(geotemporalHistorySectionText1);
			
			// Most recent time arrived in USA observation
			items.add(mostRecentTimeArrivedSectionText);
			
			// Race observation
			items.add(raceCodeSectionText1);
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			
			// Employment Status observation
			items.add(employmentStatusCodeSectionText);

			// Influenza possible exposure and location act
			items.add(exposureLocationSectionText);
			items.add(exposureAnimalSectionText);

			buffer = new StringBuffer();
			for (int i=0; i < items.size(); i++) {
				buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
			}
			String listItems = buffer.toString();
			
			socialHistorySection.createStrucDocText(listOpen + listItems + listClose);
		}
	}
	
	/**
	 * Public Health Case Report - Clinical Information Section (SHALL)
	 * 
	 * Clinical Statement Templates:
	 *   Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > PHCR Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		InfluenzaPHCRClinicalInformationSection clinicalInformationSection = FLU.createInfluenzaPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > PHCR Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("442696006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Influenza due to Influenza A virus subtype H1N1 ");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Influenza due to Influenza A virus subtype H1N1 ";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Michael Matthews";
		
		InfluenzaCaseObservation caseObservation = FLU.createInfluenzaCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// Case Observation > Author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP);
		
		II authorId = Datatypes.createII(TEST_ROOT, "999");
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		
		TEL authorTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("MATTHEWS");
		authorName.addGiven("MICHAEL");
		
		Author caseAuthor = CDA.createAuthor();
		caseObservation.getAuthors().add(caseAuthor);
		
		// case observation > author > time
		caseAuthor.setTime(authorEffectiveTime);
		
		AssignedAuthor caseAssignedAuthor = CDA.createAssignedAuthor();
		caseAuthor.setAssignedAuthor(caseAssignedAuthor);
		
		// case observation > author > assignedAuthor > id
		caseAssignedAuthor.getIds().add(authorId);
		
		// case observation > author > assignedAuthor > address
		caseAssignedAuthor.getAddrs().add(authorAddress);
		
		// case observation > author > assignedAuthor > telecom
		caseAssignedAuthor.getTelecoms().add(authorTelecom);
		
		Person caseAssignedPerson = CDA.createPerson();
		caseAssignedAuthor.setAssignedPerson(caseAssignedPerson);
		
		// case observation > author > assignedAuthor > assignedPerson > name
		caseAssignedPerson.getNames().add(authorName);
		
		// Case Observation > Informant (SHALL) 1..*
		
		II informantId = Datatypes.createII(TEST_ROOT, "999");
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("MATTHEWS");
		informantName.addGiven("MICHAEL");
		
		Informant12 caseInformant = CDA.createInformant12();
		AssignedEntity caseInformantEntity = CDA.createAssignedEntity();
		Person caseInformantPerson = CDA.createPerson();
		caseInformantEntity.setAssignedPerson(caseInformantPerson);
		caseInformant.setAssignedEntity(caseInformantEntity);
		caseObservation.getInformants().add(caseInformant);
		
		caseInformantEntity.getIds().add(informantId);
		caseInformantPerson.getNames().add(informantName);
		
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		
		CE problemStatus = Datatypes.createCE("413322009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Resolved");
		String problemStatusSectionText = "Problem resolved";
		
		ProblemStatusObservation problemStatusObservation = CCD.createProblemStatusObservation().init();
		caseObservation.addObservation(problemStatusObservation);
		((EntryRelationship) problemStatusObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		
		// case observation > ccd problem status observation > problem status code
		problemStatusObservation.getValues().add(problemStatus);

		// populate <text> block prior to SignsAndSymptoms
		List<String> items = new ArrayList<String>();
		
		// case observation
		items.add(caseObservationReportableSectionText);
		items.add(caseObservationDateOfDiagnosisSectionText);
		
		// case observation > author
		items.add(caseObservationDiagnosingClinicianSectionText);
		
		// case observation > ccd problem status observation
		items.add(problemStatusSectionText);		

		// Case Observation > Signs and Symptoms (SHOULD) 0..* - if exists, must have a value (CD signSymptom)
		// 68962001,Muscle pain (finding)] effectiveTime [Low] 9/11/2011]; 
		// 386661006, Fever (finding)] effectiveTime [Low] 9/13/2011]; 
		// 49727002, Cough (finding)] effectiveTime [Low] 9/13/2011]; 
		// 84946008, Extreme exhaustion (finding)] effectiveTime [Low] 9/13/2011]; 
				
		boolean symptomMusclePain = true;
		boolean symptomFever = true;
		boolean symptomCough = true;
		boolean symptomExtremeExhaustion = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Muscle pain (68962001 - SNOMEDCT)
		if (symptomMusclePain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("68962001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Muscle pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM1_TIME_STAMP));
			signsSymptomsNegInd.add(!symptomMusclePain);
			items.add("Signs and Symptoms - Muscle pain " + (symptomMusclePain ? "REPORTED starting on " + timeStampFormat(SYMPTOM1_TIME_STAMP, TEST_DATE_FORMAT) : "not reported"));
		}

		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM1_TIME_STAMP));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(SYMPTOM1_TIME_STAMP, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Cough (49727002 - SNOMEDCT)
		if (symptomCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("49727002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM2_TIME_STAMP));
			signsSymptomsNegInd.add(!symptomCough);
			items.add("Signs and Symptoms - Cough " + (symptomCough ? "REPORTED starting on " + timeStampFormat(SYMPTOM2_TIME_STAMP, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Extreme Exhaustion (84946008 - SNOMEDCT)
		if (symptomExtremeExhaustion || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84946008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Extreme Exhaustion"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM2_TIME_STAMP));
			signsSymptomsNegInd.add(!symptomExtremeExhaustion);
			items.add("Signs and Symptoms - Extreme Exhaustion " + (symptomExtremeExhaustion ? "REPORTED starting on " + timeStampFormat(SYMPTOM2_TIME_STAMP, TEST_DATE_FORMAT) : "not reported"));
		}
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			InfluenzaSignsAndSymptomsObservation symptomsObservation = FLU.createInfluenzaSignsAndSymptomsObservation().init();
			caseObservation.addObservation(symptomsObservation);
			((EntryRelationship) symptomsObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.MFST);
			((EntryRelationship) symptomsObservation.eContainer()).setInversionInd(true);
			
			// case observation > signs and symptoms observation > time
			if (effectiveTime != null) {
				symptomsObservation.setEffectiveTime(effectiveTime);
			}
			// case observation > signs and symptoms observation > code
			if (signSymptomCD != null) {
				symptomsObservation.getValues().add(signSymptomCD);
			}
			// case observation > signs and symptoms observation > negation indicator
			symptomsObservation.setNegationInd(signSymptomNegation);
		}
		
		// Patient Condition (Alive or Dead) Observation (MAY) 0..1 - if exists and deceased, must have both (Id caseId) and (CD cause)
		
		// Patient alive
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP);
		String patientConditionSectionText = "Patient alive " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);

			PatientConditionAliveObservation aliveObservation = PHCR.createPatientConditionAliveObservation().init();
			CD aliveValueCode = Datatypes.createCD("438949009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Alive");
			aliveObservation.getValues().add(aliveValueCode);
			clinicalInformationSection.addObservation(aliveObservation);
			((Entry) aliveObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (patientConditionTS != null) {
				aliveObservation.setEffectiveTime(patientConditionTS);
			}
			
		items.add(patientConditionSectionText);

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Influenza Clinical Information Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		clinicalInformationSection.createStrucDocText(listOpen + listItems + listClose);
	}
	
	/**
	 * Public Health Case Report - Treatment Information Section (SHOULD)
	 * 
	 * Clinical Statement Templates:
	 *   Therapeutic Regimen Act (SHALL) 1..1
	 *     > Condition Observation (SHALL) 1..1
	 *     > Treatment Given Substance Administration (SHOULD) 0..*
	 *     > Treatment Not Given Substance Administration (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setTreatmentInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Treatment Information Section (optional)
		InfluenzaPHCRTreatmentInformationSection treatmentInformationSection = FLU.createInfluenzaPHCRTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "9999");
		CD caseCode = Datatypes.createCD("55555", SNOMED_OID, SNOMED_SYSTEM_NAME, "Influenza Reportable Condition");
		
		List<II> caseIdList = new ArrayList<II>();
		caseIdList.add(caseId);
		
		if (caseIdList != null && caseIdList.size() > 0) {
			hasTreatmentInformation = true;
		}
		if (caseCode != null) {
			hasTreatmentInformation = true;
		}
		
		String conditionIdSectionText = "Condition ID - " + caseId.getExtension();
		
		if (hasTreatmentInformation) {
			
			InfluenzaTherapeuticRegimenAct regimenAct = FLU.createInfluenzaTherapeuticRegimenAct().init();
			regimenAct.setNegationInd(false);
			Observation regimenActObservation = CDA.createObservation();
			regimenActObservation.setClassCode(ActClassObservation.OBS);
			regimenActObservation.setMoodCode(x_ActMoodDocumentObservation.EVN);
			regimenActObservation.setNegationInd(false);
			regimenActObservation.getIds().add(caseId);
			CD actCode = Datatypes.createCD();
			actCode.setCode("ASSERTION");
			actCode.setCodeSystem("2.16.840.1.113883.5.4");
			actCode.setCodeSystemName("HL7ActCode");
			regimenActObservation.setCode(actCode);
			regimenActObservation.getValues().add(caseCode);
			regimenAct.addObservation(regimenActObservation);
			((EntryRelationship) regimenActObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);	
			
			treatmentInformationSection.addAct(regimenAct);
			((Entry) regimenAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			document.addSection(treatmentInformationSection);

			// Treatments Given (optional) - if exists, must have code (materialCode)
			// Treatments Not Given (optional) - if exists, must have code (materialCode) and negationInd (true)
			
			Boolean negationInd = false;
			
			// MedicationTreatmentInfluenza - code: [PHVS_MedicationTreatment_Flu, 2.16.840.1.114222.4.11.3244, 260101, OSELTAMIVIR]
			CS subsAdminStatus = Datatypes.createCS("completed");
			IVL_TS subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue(TIME_STAMP);
			subsAdminTime.setHigh(timeHigh);
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			IVL_PQ rate = Datatypes.createIVL_PQ();
			rate.setUnit("H");
			rate.setValue(Double.parseDouble("24"));
			IVL_PQ dose = Datatypes.createIVL_PQ();
			dose.setValue(BigDecimal.ONE);
			CE materialCode = Datatypes.createCE("260101", "2.16.840.1.113883.6.88", "RxNorm", "OSELTAMIVIR");
			EN materialName = Datatypes.createEN();
			materialName.addText("");
			
			String treatmentGivenSectionText1 = materialCode.getDisplayName() + " given.";
				
			InfluenzaTreatmentGivenSubstanceAdministration treatmentGivenSBADM = FLU.createInfluenzaTreatmentGivenSubstanceAdministration().init();
			treatmentGivenSBADM.setNegationInd(negationInd);
				
				Consumable consumable = CDA.createConsumable();
				ManufacturedProduct product = CDA.createManufacturedProduct();
				Material material = CDA.createMaterial();
				product.setManufacturedMaterial(material);
				consumable.setManufacturedProduct(product);
				treatmentGivenSBADM.setConsumable(consumable);
				
				if (subsAdminStatus != null) treatmentGivenSBADM.setStatusCode(subsAdminStatus);
				if (subsAdminTime != null) treatmentGivenSBADM.getEffectiveTimes().add(subsAdminTime);
				if (routeCode != null) treatmentGivenSBADM.setRouteCode(routeCode);
				if (rate != null) treatmentGivenSBADM.setRateQuantity(rate);
				if (dose != null) treatmentGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
				((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			
				// create <text> block
				StringBuffer buffer = new StringBuffer();
				buffer.append("<list>" + System.getProperty("line.separator"));
				buffer.append("            " + "            " + "<caption>" + "Influenza Treatment Information Section" + "</caption>");
				buffer.append(System.getProperty("line.separator"));
				String listOpen = buffer.toString();
				
				buffer = new StringBuffer();
				buffer.append("            " + "</list>");		
				String listClose = buffer.toString();
				
				List<String> items = new ArrayList<String>();
				
				// therapy condition id
				items.add(conditionIdSectionText);
				
				// treatments given
				items.add(treatmentGivenSectionText1);

				buffer = new StringBuffer();
				for (int i=0; i < items.size(); i++) {
					buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
				}
				String listItems = buffer.toString();
				
				treatmentInformationSection.createStrucDocText(listOpen + listItems + listClose);
			}
		}
	
	/**
	 * Public Health Case Report - Encounters Section (SHOULD)
	 * 
	 * Clinical Statement Templates:
	 *   > Encounter Performer
	 *   > Encounter Participant
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setEncountersSection(PublicHealthCaseReport document) throws Exception {
		
		// Encounters Section (optional)
		PhcrEncountersSection encountersSection = PHCR.createPhcrEncountersSection().init();
		boolean hasEncounter = false;
		
		II encounterId = Datatypes.createII(TEST_ROOT, "111");
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS("20110913000000-0700");
		CD encounterType = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounterSectionText = timeStampFormat("20110913000000-0700", TEST_DATE_FORMAT) + " at Mathews Family Practice, 31 New Britain Avenue, Hartford, CT 06475  (tel: 203-555-5401)";
		String encounterPerformerSectionText = encounterType.getDisplayName() + " encounter with Dr. Michael Matthews MD";
		
		// Encounter Activity (required) - must have (II activityId) and (CD encounterType)
		List<II> activityIdList = new ArrayList<II>();
		activityIdList.add(encounterId);
		
		EncountersActivity encountersActivity = CCD.createEncountersActivity().init();
		encountersSection.addEncounter(encountersActivity);
		((Entry) encountersActivity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

		for (int i=0; i < activityIdList.size(); i++) {
			encountersActivity.getIds().add(activityIdList.get(i));
		}
		if (encounterEffectiveTime != null) {
			encountersActivity.setEffectiveTime(encounterEffectiveTime);
		}
		if (encounterType != null) {
			encountersActivity.setCode(encounterType);
		}
		
		hasEncounter = true;
			
		if (hasEncounter) {
			
			// Encounter Performer (optional - but must have one source) - if exists, must have ii (id)
			List<II> idPerformerList = new ArrayList<II>();
			idPerformerList.add(Datatypes.createII(TEST_ROOT, "123"));
			List<AD> adPerformerList = new ArrayList<AD>();
			AD performerAddress = Datatypes.createAD();
			performerAddress.addStreetAddressLine("31 New Britain Avenue");
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL("tel: +1203-555-5401"));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("MATTHEWS");
			performerPN.addGiven("MICHAEL");
			performerPN.addPrefix("Dr.");
			performerPN.addSuffix("MD");
			namePerformerList.add(performerPN);
			

			Performer2 encounterPerformer = CDA.createPerformer2();
			encounterPerformer.setTypeCode(ParticipationPhysicalPerformer.PRF);
			AssignedEntity entity = CDA.createAssignedEntity();
			entity.setClassCode(RoleClassAssignedEntity.ASSIGNED);
			encounterPerformer.setAssignedEntity(entity);
			
			for (int k=0; k < idPerformerList.size(); k++) {
				entity.getIds().add(idPerformerList.get(k));
			}
			for (int k=0; k < adPerformerList.size(); k++) {
				entity.getAddrs().add(adPerformerList.get(k));
			}
			for (int k=0; k < telPerformerList.size(); k++) {
				entity.getTelecoms().add(telPerformerList.get(k));
			}
			Person person = CDA.createPerson();
			if (namePerformerList.size() > 0) {
				entity.setAssignedPerson(person);
				for (int k=0; k < namePerformerList.size(); k++) {
					person.getNames().add(namePerformerList.get(k));
				}
			}
			encountersActivity.getPerformers().add(encounterPerformer);

			// Encounter Participant (optional - but must have one source) - if exists, must have ii (id)
			List<II> idParticipantList = new ArrayList<II>();
			idParticipantList.add(Datatypes.createII(TEST_ROOT, "555"));
			List<AD> adParticipantList = new ArrayList<AD>();
			AD participantAddress = Datatypes.createAD();
			participantAddress.addStreetAddressLine("31 New Britain Avenue");
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			participantAddress.addPostalCode(TEST_POSTALCODE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addText("Mathews Family Practice");
			nameParticipantList.add(participantPN);
			
			Participant2 encounterParticipant = CDA.createParticipant2();
			encounterParticipant.setTypeCode(ParticipationType.LOC);
			ParticipantRole role = CDA.createParticipantRole();
			role.setClassCode(RoleClassRoot.SDLOC);
			encounterParticipant.setParticipantRole(role);
			
			for (int k=0; k < idParticipantList.size(); k++) {
				role.getIds().add(idParticipantList.get(k));
			}
			for (int k=0; k < adParticipantList.size(); k++) {
				role.getAddrs().add(adParticipantList.get(k));
			}
			for (int k=0; k < telParticipantList.size(); k++) {
				role.getTelecoms().add(telParticipantList.get(k));
			}
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			playingEntity.setClassCode(EntityClassRoot.PLC);
			if (nameParticipantList.size() > 0) {
				role.setPlayingEntity(playingEntity);
				for (int k=0; k < nameParticipantList.size(); k++) {
					playingEntity.getNames().add(nameParticipantList.get(k));
				}
			}
			encountersActivity.getParticipants().add(encounterParticipant);
			
			
			document.addSection(encountersSection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Influenza Encounters Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();

			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();

			List<String> items = new ArrayList<String>();

			// encounter 1
			items.add(encounterSectionText);
			items.add(encounterPerformerSectionText);
			
			buffer = new StringBuffer();
			for (int i=0; i < items.size(); i++) {
				buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
			}
			String listItems = buffer.toString();

			encountersSection.createStrucDocText(listOpen + listItems + listClose);

		}
	}
	
	/**
	 * Public Health Case Report - Relevant diagnostic tests and/or laboratory data Section (SHOULD)
	 * Results of observations generated by laboratories, imaging procedures, and other procedures

	 * Clinical Statement Templates:
	 *   > Result Organizer
	 *   > Result Observation
	 *   > Imaging Observation
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection dxTestsSection = FLU.createInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection().init();
		document.addSection(dxTestsSection);

		// Test1 - Virus Nose Cult Result Observation
		List<II> test1ObservationIdList = new ArrayList<II>();
		test1ObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD test1ObservationCode = Datatypes.createCD("14454-3", LOINC_OID, LOINC_SYSTEM_NAME, "Virus Nose Cult");
		IVL_TS test1ObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER);
		ANY test1Value = Datatypes.createCD("407479009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Influenza A virus");
		CE test1SpecimenType = Datatypes.createCE("22827-0", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");
		
		CD test1CollectionProcedureCode = Datatypes.createCD("35849006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Microbial identification, rapid kit method");
		IVL_TS test1CollectionTime = Datatypes.createIVL_TS(TIME_STAMP);
		CE test1CollectionTargetSiteCode = Datatypes.createCE("71836000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal structure");

		String test1ObservationSectionText1 = test1SpecimenType.getDisplayName() + " collected on " +
		timeStampFormat(TIME_STAMP_ENCOUNTER, TEST_DATE_FORMAT) + ", " + test1ObservationCode.getDisplayName() + " result: Influenza A virus";
		String test1ObservationSectionText2 = "Quest Diagnostics Laboratory, 42 Culpepper Ave, New Britain, CT 06488 (tel: 203-555-4549)";
		
		InfluenzaResultObservation test1Observation = FLU.createInfluenzaResultObservation().init();
		
		for (int i=0; i < test1ObservationIdList.size(); i++) {
			test1Observation.getIds().add(test1ObservationIdList.get(i));
		}
		if (test1ObservationCode != null) test1Observation.setCode(test1ObservationCode);
		if (test1ObservationEffectiveTime != null) test1Observation.setEffectiveTime(test1ObservationEffectiveTime);
		if (test1Value != null) test1Observation.getValues().add(test1Value);
		
		// Result Observation Informant (required)
		II test1ObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON test1ObservationOrganizationName = Datatypes.createON();
		test1ObservationOrganizationName.addText("Quest Diagnostics Laboratory");	
		
		AD test1ObservationOrganizationAddress = Datatypes.createAD();
		test1ObservationOrganizationAddress.addStreetAddressLine("42 Culpepper Ave");
		test1ObservationOrganizationAddress.addCity("New Britain");
		test1ObservationOrganizationAddress.addState(TEST_STATE);
		test1ObservationOrganizationAddress.addPostalCode("06488");	
		
		TEL test1ObservationOrganizationTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		Informant12 test1ObservationInformant = CDA.createInformant12();
		AssignedEntity test1ObservationInformantEntity = CDA.createAssignedEntity();
		Organization test1ObservationOrganization = CDA.createOrganization();
		test1ObservationInformantEntity.getIds().add(test1ObservationInformantId);
		test1ObservationInformantEntity.getAddrs().add(test1ObservationOrganizationAddress);
		test1ObservationInformantEntity.getTelecoms().add(test1ObservationOrganizationTelecom);
		test1ObservationOrganization.getNames().add(test1ObservationOrganizationName);
		test1ObservationInformantEntity.getRepresentedOrganizations().add(test1ObservationOrganization);
		test1ObservationInformant.setAssignedEntity(test1ObservationInformantEntity);
		test1Observation.getInformants().add(test1ObservationInformant);
		
		dxTestsSection.addObservation(test1Observation);
		
	
		// Test2 - FLUAV Subtyp Result Observation
		List<II> test2ObservationIdList = new ArrayList<II>();
		test2ObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD test2ObservationCode = Datatypes.createCD("22827-0", LOINC_OID, LOINC_SYSTEM_NAME, "FLUAV Subtyp XXX PCR");
		IVL_TS test2ObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER);
		ANY test2Value = Datatypes.createCD("442352004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Influenza A virus subtype H1N1");
		CE test2SpecimenType = Datatypes.createCE("258500001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");

		CD test2CollectionProcedureCode = Datatypes.createCD("9718006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Polymerase chain reaction analysis");
		IVL_TS test2CollectionTime = Datatypes.createIVL_TS(TIME_STAMP);
		CE test2CollectionTargetSiteCode = Datatypes.createCE("71836000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal structure");

		String test2ObservationSectionText1 = test2SpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER, TEST_DATE_FORMAT) + ", " + test2ObservationCode.getDisplayName() + " result: Influenza A virus subtype H1N1";
	
		InfluenzaResultObservation test2Observation = FLU.createInfluenzaResultObservation().init();
		
		for (int i=0; i < test2ObservationIdList.size(); i++) {
			test2Observation.getIds().add(test2ObservationIdList.get(i));
		}
		if (test2ObservationCode != null) test2Observation.setCode(test2ObservationCode);
		if (test2ObservationEffectiveTime != null) test2Observation.setEffectiveTime(test2ObservationEffectiveTime);
		if (test2Value != null) test2Observation.getValues().add(test2Value);
		
		// Result Observation Informant (required)
		II test2ObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON test2ObservationOrganizationName = Datatypes.createON();
		test2ObservationOrganizationName.addText("Fort Myers Hospital Laboratory");	
		
		AD test2ObservationOrganizationAddress = Datatypes.createAD();
		test2ObservationOrganizationAddress.addStreetAddressLine("175 Coral Drive");
		test2ObservationOrganizationAddress.addCity(TEST_CITY); 
		test2ObservationOrganizationAddress.addState(TEST_STATE);
		test2ObservationOrganizationAddress.addPostalCode(TEST_POSTALCODE);	
		
		TEL test2ObservationOrganizationTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		Informant12 test2ObservationInformant = CDA.createInformant12();
		AssignedEntity test2ObservationInformantEntity = CDA.createAssignedEntity();
		Organization test2ObservationOrganization = CDA.createOrganization();
		test2ObservationInformantEntity.getIds().add(test2ObservationInformantId);
		test2ObservationInformantEntity.getAddrs().add(test2ObservationOrganizationAddress);
		test2ObservationInformantEntity.getTelecoms().add(test2ObservationOrganizationTelecom);
		test2ObservationOrganization.getNames().add(test2ObservationOrganizationName);
		test2ObservationInformantEntity.getRepresentedOrganizations().add(test2ObservationOrganization);
		test2ObservationInformant.setAssignedEntity(test2ObservationInformantEntity);
		test2Observation.getInformants().add(test2ObservationInformant);

		dxTestsSection.addObservation(test2Observation);

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Influenza Relevant Diagnostic Tests and/or Laboratory Data Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab observation 1
		items.add(test1ObservationSectionText1);
		 
		// lab observation 2
		items.add(test2ObservationSectionText1);
		
		// laboratory
		items.add(test1ObservationSectionText2);

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		dxTestsSection.createStrucDocText(listOpen + listItems + listClose);
	
	}

	private static String timeStampFormat(String stringDate, String format) throws Exception {
		
		Date date;
		SimpleDateFormat cdaDateFormat = new SimpleDateFormat("yyyyMMddHHmmssZ");
		date = cdaDateFormat.parse(stringDate);
		SimpleDateFormat newDateFormat = new SimpleDateFormat(format);
		return newDateFormat.format(date);
	}
	
		
}