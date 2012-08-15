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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;

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
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration;
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

public class TularemiaCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static TularemiaFactory TUL = TularemiaFactory.eINSTANCE;
	
	public static String PATIENT_ID = "ID80214365";
	
	public static String TIME_STAMP_DOB = "19730920000000-0600";           // 0600 - Central Daylight Savings Time (CDT)
	public static String TIME_STAMP_SYMPTOMS = "20110719000000-0600";
	public static String TIME_STAMP_ENCOUNTER1 = "20110724110000-0600";	
	public static String TIME_STAMP_ENCOUNTER2 = "20110726102500-0600";
	public static String TIME_STAMP_REPORT = "20110802081400-0600";	
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		TularemiaCaseReport document = TUL.createTularemiaCaseReport().init();
		
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
			System.out.println("Tularemia document is valid");
		} else {
			System.out.println("Tularemia document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "SampleCDA.xml");
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
		TS documentEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
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

		
		II patientId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("2485 E Floating Feather Rd.");
		patientAddress.addCity("Eagle");
		patientAddress.addState("ID");
		patientAddress.addPostalCode("83616");
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-208-555-5555");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Trenton");
		patientName.addGiven("Michael");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		CE patientMaritalStatus = Datatypes.createCE("M", "2.16.840.1.113883.5.2", "HL7", "Married");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("USA");
		
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
		
		// patientRole > patient > marital status
		if (patientMaritalStatus != null) {
			patient.setMaritalStatusCode(patientMaritalStatus);
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
		
		TS reporterEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("190 East Bannock Street");
		reporterAddress.addCity("Boise");
		reporterAddress.addState("ID");
		reporterAddress.addPostalCode("83712");
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-208-381-2222");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Johnson");
		reporterName.addGiven("Matthew");
		reporterName.addPrefix("Dr.");
		reporterName.addSuffix("MD");
		
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
		
		II custodianOrgId = Datatypes.createII(NullFlavor.UNK);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Idaho Health Data Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("450 West State Street");
		custodianOrgAddress.addStreetAddressLine("P.O. Box 6978");
		custodianOrgAddress.addCity("Boise");
		custodianOrgAddress.addState("ID");
		custodianOrgAddress.addPostalCode("83707");
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-208-332-7253");
		
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
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(NullFlavor.UNK);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine("190 East Bannock Street");
		verifierAddress.addCity("Boise");
		verifierAddress.addState("ID");
		verifierAddress.addPostalCode("83712");
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-208-381-2222");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Johnson");
		personName.addGiven("Matthew");
		personName.addPrefix("Dr.");
		personName.addSuffix("MD");
		
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
	 *   Tularemia possible exposure location and type (MAY) 0..*
	 *   
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		TularemiaPHCRSocialHistorySection socialHistorySection = TUL.createTularemiaPHCRSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		// Geotemporal history observation (SHOULD) 0..* - if exists, must have a value (CD locationCode)
		// ValueSet 2.16.840.1.114222.4.11.3201
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=9CE75E17-176B-DE11-9B52-0015173D1785
		
		CD locationCode1 = Datatypes.createCD("29", "2.16.840.1.113883.6.92", "FIPS 5-2 (State)", "Missouri");
		IVL_TS locationTime1 = Datatypes.createIVL_TS();
		IVXB_TS locationTimeLow = Datatypes.createIVXB_TS();
		locationTimeLow.setValue("20110715000000-0600");
		locationTime1.setLow(locationTimeLow);
		IVXB_TS locationTimeHigh = Datatypes.createIVXB_TS();
		locationTimeHigh.setValue("20110717000000-0600");
		locationTime1.setHigh(locationTimeHigh);
		
		String geotemporalHistorySectionText1 = "Geotemporal history - Missouri, July 15,2011 - July 17,2011";
		
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
		
		// Occupation observation (SHOULD) 0..* - if exists, must have a value (CD occupationCode)
		// ValueSet 2.16.840.1.114222.4.11.887
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=56D34BBC-617F-DD11-B38D-00188B398520
		// Industry (NAICS) Value Set 2.16.840.1.114222.4.11.1100
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=3ED34BBC-617F-DD11-B38D-00188B398520
		
		boolean hasOccupation = true;
		
		String occupationSectionText1 = "Occupation - Advertising, Marketing, Promotion, March 2006 - present";
		String occupationSectionText2 = "Occupation Location - Sysco Food Services, Food Manufacturing 5710 Pan Am Ave, Boise, ID (tel:208-345-9500)"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS("20060300000000-0600");
			CD occupationCode = Datatypes.createCD("11-2000", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Advertising, Marketing, Promotions, Public Relations, and Sales Managers");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addStreetAddressLine("5710 Pan Am Ave");
			locationAddress.addCity("Boise");
			locationAddress.addState("ID");
			locationAddress.addPostalCode("83716");

			TEL locationTelecom = Datatypes.createTEL("tel:+1-208-345-9500");

			PN locationName = Datatypes.createPN();
			locationName.addText("Sysco Food Services");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS("20060301000000-0600");
			CD occupationHistoryCode = Datatypes.createCD("311", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Food Manufacturing");

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
		
		// Tularemia possible exposure location and type (MAY) 0..* - if exists, must have an exposure location
		
		boolean hasExposureLocation = true;
		
		String exposureLocationSectionText = "Possible Exposure Location - Wooded Area in Van Buren, MO  63965";
		String exposureAnimalSectionText = "Possible Exposure to Tick";
		
		if (hasExposureLocation) {
		
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS();
			IVXB_TS exposureLocationTimeLow = Datatypes.createIVXB_TS();
			exposureLocationTimeLow.setValue("20110715000000-0600");
			exposureLocationTime.setLow(exposureLocationTimeLow);
			IVXB_TS exposureLocationTimeHigh = Datatypes.createIVXB_TS();
			exposureLocationTimeHigh.setValue("20110717000000-0600");
			exposureLocationTime.setHigh(exposureLocationTimeHigh);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addCity("Van Buren");
			exposureLocationAddress.addState("MO");
			exposureLocationAddress.addPostalCode("63965");

			TEL exposureLocationTelecom = Datatypes.createTEL();
			exposureLocationTelecom.setNullFlavor(NullFlavor.NASK);

			CE exposureLocationTypeCode = Datatypes.createCE("272500005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Wooded area");

			CE exposureAnimalTypeCode = Datatypes.createCE("106832007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Ixodes Tick");


			TularemiaPossibleExposureLocationAndTypeAct locationAndTypeAct = TUL.createTularemiaPossibleExposureLocationAndTypeAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("PHC818", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Tularemia exposure");

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
			if (exposureLocationAddress != null) {
				exposureLocationParticipantRole.getAddrs().add(exposureLocationAddress);
			}
			if (exposureLocationTelecom != null) {
				exposureLocationParticipantRole.getTelecoms().add(exposureLocationTelecom);
			}
			if (exposureLocationTypeCode != null) {
				exposureLocationPlayingEntity.setCode(exposureLocationTypeCode);
			}


			Participant2 exposureAnimalParticipant = CDA.createParticipant2();
			exposureAnimalParticipant.setTypeCode(ParticipationType.DIR);
			ParticipantRole exposureAnimalParticipantRole = CDA.createParticipantRole();
			exposureAnimalParticipantRole.setClassCode(RoleClassRoot.EXPR);
			Entity exposureAnimalPlayingEntity = CDA.createEntity();
			exposureAnimalPlayingEntity.setClassCode(EntityClassRoot.ANM);
			exposureAnimalParticipantRole.setScopingEntity(exposureAnimalPlayingEntity);
			exposureAnimalParticipant.setParticipantRole(exposureAnimalParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureAnimalParticipant);

			if (exposureAnimalTypeCode != null) {
				exposureAnimalPlayingEntity.setCode(exposureAnimalTypeCode);
			}

			socialHistorySection.addAct(locationAndTypeAct);
			((Entry) locationAndTypeAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			hasSocialHistory = true;
		}
		
		
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Tularemia Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Geotemporal history observation
			items.add(geotemporalHistorySectionText1);
			
			// Race observation
			items.add(raceCodeSectionText1);
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			
			// Tularemia possible exposure and location act
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
	 *   Tularemia Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > Informant (SHALL) 1..*
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Tularemia Signs and Symptoms Observation (SHOULD) 0..*
	 *     > Location of lesion observation (MAY) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		TularemiaPHCRClinicalInformationSection clinicalInformationSection = TUL.createTularemiaPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		CD reportableCode = Datatypes.createCD("19265001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Tularemia");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_ENCOUNTER2);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Tularemia";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Condition diagnosed by Dr Matthew Johnson, MD";
		
		TularemiaCaseObservation caseObservation = TUL.createTularemiaCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// Case Observation > Author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II authorId = Datatypes.createII(NullFlavor.UNK);
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addStreetAddressLine("190 East Bannock Street");
		authorAddress.addCity("Boise");
		authorAddress.addState("ID");
		authorAddress.addPostalCode("83712");
		
		TEL authorTelecom = Datatypes.createTEL("tel:+1-208-381-2222");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Johnson");
		authorName.addGiven("Matthew");
		authorName.addPrefix("Dr.");
		authorName.addSuffix("MD");
		
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
		
		II informantId = Datatypes.createII(NullFlavor.UNK);
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("Johnson");
		informantName.addGiven("Matthew");
		informantName.addPrefix("Dr.");
		informantName.addSuffix("MD");
		
		Informant12 caseInformant = CDA.createInformant12();
		AssignedEntity caseInformantEntity = CDA.createAssignedEntity();
		Person caseInformantPerson = CDA.createPerson();
		caseInformantEntity.setAssignedPerson(caseInformantPerson);
		caseInformant.setAssignedEntity(caseInformantEntity);
		caseObservation.getInformants().add(caseInformant);
		
		caseInformantEntity.getIds().add(informantId);
		caseInformantPerson.getNames().add(informantName);
		
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		
		CE problemStatus = Datatypes.createCE("55561003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Active");
		String problemStatusSectionText = "Problem remains active at time of report";
		
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
		
		boolean symptomAsypmtomatic = false;
		boolean symptomAbdominalPain = false;
		boolean symptomChestPain = false;
		boolean symptomChill = false;
		boolean symptomConjunctivitis = false;
		boolean symptomCough = false;
		boolean symptomDiarrhea = false;
		boolean symptomDyspnea = false;
		boolean symptomFever = true;
		boolean symptomHeadache = false;
		boolean symptomJointPain = false;	
		boolean symptomLymphadenopathy = true;
		boolean symptomMalaise = false;
		boolean symptomMeningitis = false;
		boolean symptomMusclePain = false;
		boolean symptomNausea = false;
		boolean symptomPainInThroat = false;
		boolean symptomPharyngitis = false;
		boolean symptomPneumonia = false;
		boolean symptomSkinUlcer = true;
		boolean symptomSputumContainsBlood = false;
		boolean symptomSystemicInfection = false;
		boolean symptomVomiting = false;
		boolean symptomWeightLoss = false;

		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Asymptomatic (84387000 - SNOMEDCT)
		if (symptomAsypmtomatic || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asymptomatic"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAsypmtomatic);
			items.add("Signs and Symptoms - Asymptomatic " + (symptomAsypmtomatic ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Abdominal Pain (21522001 - SNOMEDCT)
		if (symptomAbdominalPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("21522001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Abdominal pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAbdominalPain);
			items.add("Signs and Symptoms - Abdominal pain " + (symptomAbdominalPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Chest Pain (29857009 - SNOMEDCT)
		if (symptomChestPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("29857009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chest Pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomChestPain);
			items.add("Signs and Symptoms - Chest Pain " + (symptomChestPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Chill (43724002 - SNOMEDCT)
		if (symptomChill || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("43724002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chill"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomChill);
			items.add("Signs and Symptoms - Chill " + (symptomChill ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Conjunctivitis (9826008 - SNOMEDCT)
		if (symptomConjunctivitis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("9826008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Conjunctivitis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomConjunctivitis);
			items.add("Signs and Symptoms - Conjunctivitis " + (symptomConjunctivitis ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Cough (49727002 - SNOMEDCT)
		if (symptomCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("49727002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomCough);
			items.add("Signs and Symptoms - Cough " + (symptomCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Diarrhea (62315008 - SNOMEDCT)
		if (symptomDiarrhea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("62315008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Diarrhea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomDiarrhea);
			items.add("Signs and Symptoms - Diarrhea " + (symptomDiarrhea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Dyspnea (267036007 - SNOMEDCT)
		if (symptomDyspnea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("267036007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Dyspnea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomDyspnea);
			items.add("Signs and Symptoms - Dyspnea " + (symptomDyspnea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Headache (25064002 - SNOMEDCT)
		if (symptomHeadache || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("25064002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Headache"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomHeadache);
			items.add("Signs and Symptoms - Headache " + (symptomHeadache ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Joint Pain (57676002 - SNOMEDCT)
		if (symptomJointPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("57676002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Joint Pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomJointPain);
			items.add("Signs and Symptoms - Joint Pain " + (symptomJointPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Lymphadenopathy (30746006 - SNOMEDCT)
		if (symptomLymphadenopathy || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("30746006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Lymphadenopathy"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomLymphadenopathy);
			items.add("Signs and Symptoms - Lymphadenopathy " + (symptomLymphadenopathy ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Malaise (367391008 - SNOMEDCT)
		if (symptomMalaise || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("367391008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Malaise"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomMalaise);
			items.add("Signs and Symptoms - Malaise " + (symptomMalaise ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Meningitis (7180009 - SNOMEDCT)
		if (symptomMeningitis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("7180009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Meningitis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomMeningitis);
			items.add("Signs and Symptoms - Meningitis " + (symptomMeningitis ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Muscle pain (68962001 - SNOMEDCT)
		if (symptomMusclePain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("68962001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Muscle pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomMusclePain);
			items.add("Signs and Symptoms - Muscle pain " + (symptomMusclePain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Nausea (422587007 - SNOMEDCT)
		if (symptomNausea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("422587007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nausea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomNausea);
			items.add("Signs and Symptoms - Nausea " + (symptomNausea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Pain in throat (162397003 - SNOMEDCT)
		if (symptomPainInThroat || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("162397003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pain in throat"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPainInThroat);
			items.add("Signs and Symptoms - Pain in throat " + (symptomPainInThroat ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Pharyngitis (405737000 - SNOMEDCT)
		if (symptomPharyngitis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("405737000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pharyngitis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPharyngitis);
			items.add("Signs and Symptoms - Pharyngitis " + (symptomPharyngitis ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Pneumonia (233604007 - SNOMEDCT)
		if (symptomPneumonia || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("233604007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pneumonia"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPneumonia);
			items.add("Signs and Symptoms - Pneumonia " + (symptomPneumonia ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Skin ulcer (46742003 - SNOMEDCT)
		if (symptomSkinUlcer || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("46742003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Skin ulcer"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomSkinUlcer);
			items.add("Signs and Symptoms - Skin ulcer " + (symptomSkinUlcer ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Sputum contains blood (270031000 - SNOMEDCT)
		if (symptomSputumContainsBlood || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("270031000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Sputum contains blood"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomSputumContainsBlood);
			items.add("Signs and Symptoms - Sputum contains blood " + (symptomSputumContainsBlood ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Systemic infection (91302008 - SNOMEDCT)
		if (symptomSystemicInfection || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("91302008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Systemic infection"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomSystemicInfection);
			items.add("Signs and Symptoms - Systemic infection " + (symptomSystemicInfection ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Vomiting (422400008 - SNOMEDCT)
		if (symptomVomiting || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("422400008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Vomiting"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomVomiting);
			items.add("Signs and Symptoms - Vomiting " + (symptomVomiting ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Weight loss (89362005 - SNOMEDCT)
		if (symptomWeightLoss || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("89362005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Weight loss"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomWeightLoss);
			items.add("Signs and Symptoms - Weight loss " + (symptomWeightLoss ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}		

		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			TularemiaSignsAndSymptomsObservation symptomsObservation = TUL.createTularemiaSignsAndSymptomsObservation().init();
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
		
		// Location of Lesion Observation
		IVL_TS lesionEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS);
		CD lesionCode = Datatypes.createCD("46742003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Skin ulcer");
		CD lesionSiteCode = Datatypes.createCD("32696007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Right Lower Leg");
		
		LocationOfLesionObservation lesionObservation = TUL.createLocationOfLesionObservation().init();
		lesionObservation.setEffectiveTime(lesionEffectiveTime);
		lesionObservation.getValues().add(lesionCode);
		lesionObservation.getTargetSiteCodes().add(lesionSiteCode);
		clinicalInformationSection.addObservation(lesionObservation);
		
		String caseObservationLesionObservationSectionText = "Lesion Location - Right Lower Leg starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT);
		items.add(caseObservationLesionObservationSectionText);
		
		// Patient Condition (Alive or Dead) Observation (MAY) 0..1 - if exists and deceased, must have both (Id caseId) and (CD cause)
		
		// If patient alive
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		String patientConditionSectionText = "Patient alive " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		
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
		buffer.append("            " + "            " + "<caption>" + "Tularemia Clinical Information Section" + "</caption>");
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
		TularemiaPHCRTreatmentInformationSection treatmentInformationSection = TUL.createTularemiaPHCRTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		CD caseCode = Datatypes.createCD("19265001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Tularemia");
		
		List<II> caseIdList = new ArrayList<II>();
		caseIdList.add(caseId);
		
		if (caseIdList != null && caseIdList.size() > 0) {
			hasTreatmentInformation = true;
		}
		if (caseCode != null) {
			hasTreatmentInformation = true;
		}
		
		String conditionIdSectionText = "Condition ID - " + caseId.getExtension();
		String conditionCodeText = "Condition Type - " + caseCode.getDisplayName();
		
		if (hasTreatmentInformation) {
			
			TularemiaTherapeuticRegimenAct regimenAct = TUL.createTularemiaTherapeuticRegimenAct().init();
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
			
			CS subsAdminStatus = Datatypes.createCS("active");
			IVL_TS subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS timeLow = Datatypes.createIVXB_TS();
			timeLow.setValue(TIME_STAMP_ENCOUNTER2);
			subsAdminTime.setLow(timeLow);
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue("20110808000000-0600");       // 2 weeks
			subsAdminTime.setHigh(timeHigh);		
			
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			IVL_PQ rate = Datatypes.createIVL_PQ();
			rate.setUnit("H");
			rate.setValue(Double.parseDouble("24"));
			IVL_PQ dose = Datatypes.createIVL_PQ();
			dose.setValue(BigDecimal.valueOf(Double.valueOf("2")));
			CE materialCode = Datatypes.createCE("197633", "2.16.840.1.113883.6.88", "RxNorm", "Doxycycline 100mg Oral Tablet");
			EN materialName = Datatypes.createEN();
			materialName.addText("Doxycycline 100mg Oral Tablet");
			
			String treatmentGivenSectionText1 = "Prescribed " + materialCode.getDisplayName() + " twice daily for 14 days prescribed on " + timeStampFormat("20110726000000-0600", TEST_DATE_FORMAT);
				
			if (!negationInd) {
				TularemiaTreatmentGivenSubstanceAdministration treatmentGivenSBADM = TUL.createTularemiaTreatmentGivenSubstanceAdministration().init();
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
			} else {
				TularemiaTreatmentNotGivenSubstanceAdministration treatmentNotGivenSBADM = TUL.createTularemiaTreatmentNotGivenSubstanceAdministration().init();
				treatmentNotGivenSBADM.setNegationInd(negationInd);
				
				Consumable consumable = CDA.createConsumable();
				ManufacturedProduct product = CDA.createManufacturedProduct();
				Material material = CDA.createMaterial();
				product.setManufacturedMaterial(material);
				consumable.setManufacturedProduct(product);
				treatmentNotGivenSBADM.setConsumable(consumable);
				
				if (subsAdminStatus != null) treatmentNotGivenSBADM.setStatusCode(subsAdminStatus);
				if (subsAdminTime != null) treatmentNotGivenSBADM.getEffectiveTimes().add(subsAdminTime);
				if (routeCode != null) treatmentNotGivenSBADM.setRouteCode(routeCode);
				if (rate != null) treatmentNotGivenSBADM.setRateQuantity(rate);
				if (dose != null) treatmentNotGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentNotGivenSBADM);
				((EntryRelationship) treatmentNotGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			}

			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Tularemia Treatment Information Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// therapy condition id and code
			items.add(conditionIdSectionText);
			items.add(conditionCodeText);
			
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
		
		// First Encounter
		II encounter1Id = Datatypes.createII(TEST_ROOT, "ID80214365-1");
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD encounter1Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter1SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " at St. Luke's Eagle Urgent Care Center, 3101 East State Street, Eagle, Idaho (tel:208-473-3100)";
		String encounter1PerformerSectionText = encounter1Type.getDisplayName() + " encounter with Dr. Lisa Miller MD";
		
		// Second Encounter
		II encounter2Id = Datatypes.createII(TEST_ROOT, "ID80214365-2");
		IVL_TS encounter2EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD encounter2Type = Datatypes.createCD("EMER", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Emergency");
		
		String encounter2SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " at St. Luke's Boise Medical Center Emergency Department, 190 East Bannock Street, Boise, Idaho (tel:208-381-2222)";
		String encounter2PerformerSectionText = encounter2Type.getDisplayName() + " encounter with Dr. Matthew Johnson MD";
		
			
		// Encounter Activity (required)
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		
		EncountersActivity encounters1Activity = CCD.createEncountersActivity().init();
		encountersSection.addEncounter(encounters1Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

		for (int i=0; i < activity1IdList.size(); i++) {
			encounters1Activity.getIds().add(activity1IdList.get(i));
		}
		if (encounter1EffectiveTime != null) {
			encounters1Activity.setEffectiveTime(encounter1EffectiveTime);
		}
		if (encounter1Type != null) {
			encounters1Activity.setCode(encounter1Type);
		}
		
		List<II> activity2IdList = new ArrayList<II>();
		activity2IdList.add(encounter2Id);
		
		EncountersActivity encounters2Activity = CCD.createEncountersActivity().init();
		encountersSection.addEncounter(encounters2Activity);
		((Entry) encounters2Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

		for (int i=0; i < activity2IdList.size(); i++) {
			encounters2Activity.getIds().add(activity2IdList.get(i));
		}
		if (encounter2EffectiveTime != null) {
			encounters2Activity.setEffectiveTime(encounter2EffectiveTime);
		}
		if (encounter2Type != null) {
			encounters2Activity.setCode(encounter2Type);
		}
		
		// Encounter Performer (optional - but must have one source) - if exists, must have ii (id)
		List<II> idPerformerList = new ArrayList<II>();
		idPerformerList.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adPerformerList = new ArrayList<AD>();
		AD performerAddress = Datatypes.createAD();
		performerAddress.addStreetAddressLine("3101 East State Street");
		performerAddress.addCity("Eagle");
		performerAddress.addState("ID");
		performerAddress.addPostalCode("83616");
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+1-208-473-3100"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Miller");
		performerPN.addGiven("Lisa");
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
		encounters1Activity.getPerformers().add(encounterPerformer);

		// Encounter Participant (optional - but must have one source) - if exists, must have ii (id)
		List<II> idParticipantList = new ArrayList<II>();
		idParticipantList.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adParticipantList = new ArrayList<AD>();
		AD participantAddress = Datatypes.createAD();
		participantAddress.addStreetAddressLine("3101 East State Street");
		participantAddress.addCity("Eagle");
		participantAddress.addState("ID");
		participantAddress.addPostalCode("83616");
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-208-473-3100"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("St. Luke's Eagle Urgent Care Center");
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
		encounters1Activity.getParticipants().add(encounterParticipant);
		
		
		// Encounter Performer (optional - but must have one source) - if exists, must have ii (id)
		List<II> idPerformer2List = new ArrayList<II>();
		idPerformer2List.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adPerformer2List = new ArrayList<AD>();
		AD performer2Address = Datatypes.createAD();
		performer2Address.addStreetAddressLine("190 East Bannock Street");
		performer2Address.addCity("Boise");
		performer2Address.addState("ID");
		performer2Address.addPostalCode("83712");
		adPerformer2List.add(performer2Address);
		List<TEL> telPerformer2List = new ArrayList<TEL>();
		telPerformer2List.add(Datatypes.createTEL("tel:+1-208-381-2222"));
		List<PN> namePerformer2List = new ArrayList<PN>();
		PN performer2PN = Datatypes.createPN();
		performer2PN.addFamily("Johnson");
		performer2PN.addGiven("Matthew");
		performer2PN.addPrefix("Dr.");
		performer2PN.addSuffix("MD");
		namePerformer2List.add(performer2PN);
			
		Performer2 encounter2Performer = CDA.createPerformer2();
		encounter2Performer.setTypeCode(ParticipationPhysicalPerformer.PRF);
		AssignedEntity entity2 = CDA.createAssignedEntity();
		entity2.setClassCode(RoleClassAssignedEntity.ASSIGNED);
		encounter2Performer.setAssignedEntity(entity2);

		for (int k=0; k < idPerformer2List.size(); k++) {
			entity2.getIds().add(idPerformer2List.get(k));
		}
		for (int k=0; k < adPerformer2List.size(); k++) {
			entity2.getAddrs().add(adPerformer2List.get(k));
		}
		for (int k=0; k < telPerformerList.size(); k++) {
			entity2.getTelecoms().add(telPerformer2List.get(k));
		}
		Person person2 = CDA.createPerson();
		if (namePerformer2List.size() > 0) {
			entity2.setAssignedPerson(person2);
			for (int k=0; k < namePerformer2List.size(); k++) {
				person2.getNames().add(namePerformer2List.get(k));
			}
		}
		encounters2Activity.getPerformers().add(encounter2Performer);

		// Encounter Participant (optional - but must have one source) - if exists, must have ii (id)
		List<II> idParticipant2List = new ArrayList<II>();
		idParticipant2List.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adParticipant2List = new ArrayList<AD>();
		AD participant2Address = Datatypes.createAD();
		participant2Address.addStreetAddressLine("190 East Bannock Street");
		participant2Address.addCity("Boise");
		participant2Address.addState("ID");
		participant2Address.addPostalCode("83712");
		adParticipant2List.add(participant2Address);
		List<TEL> telParticipant2List = new ArrayList<TEL>();
		telParticipant2List.add(Datatypes.createTEL("tel:+1-208-381-2222"));
		List<PN> nameParticipant2List = new ArrayList<PN>();
		PN participant2PN = Datatypes.createPN();
		participant2PN.addText("St. Luke's Boise Medical Center Emergency Department");
		nameParticipant2List.add(participant2PN);

		Participant2 encounter2Participant = CDA.createParticipant2();
		encounter2Participant.setTypeCode(ParticipationType.LOC);
		ParticipantRole role2 = CDA.createParticipantRole();
		role2.setClassCode(RoleClassRoot.SDLOC);
		encounter2Participant.setParticipantRole(role2);

		for (int k=0; k < idParticipant2List.size(); k++) {
			role2.getIds().add(idParticipant2List.get(k));
		}
		for (int k=0; k < adParticipant2List.size(); k++) {
			role2.getAddrs().add(adParticipant2List.get(k));
		}
		for (int k=0; k < telParticipant2List.size(); k++) {
			role2.getTelecoms().add(telParticipant2List.get(k));
		}
		PlayingEntity playingEntity2 = CDA.createPlayingEntity();
		playingEntity2.setClassCode(EntityClassRoot.PLC);
		if (nameParticipant2List.size() > 0) {
			role2.setPlayingEntity(playingEntity2);
			for (int k=0; k < nameParticipant2List.size(); k++) {
				playingEntity2.getNames().add(nameParticipant2List.get(k));
			}
		}
		encounters2Activity.getParticipants().add(encounter2Participant);
			
			
		document.addSection(encountersSection);

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Tularemia Encounters Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();

		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();

		List<String> items = new ArrayList<String>();

		// encounter 1
		items.add(encounter1SectionText);
		items.add(encounter1PerformerSectionText);
		
		// encounter 2
		items.add(encounter2SectionText);
		items.add(encounter2PerformerSectionText);

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();

		encountersSection.createStrucDocText(listOpen + listItems + listClose);

	}
	
	/**
	 * Public Health Case Report - Relevant diagnostic tests and/or laboratory data Section (SHOULD)
	 * Results of observations generated by laboratories, imaging procedures, and other procedures

	 * Clinical Statement Templates:
	 *   > Tularemia Result Organizer (MAY) 0..*
	 *   > Tularemia Result Observation (SHOULD) 0..*
	 *   > Imaging Observation (MAY) 0..*
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		TularemiaPHCRRelevantDxTestsSection dxTestsSection = TUL.createTularemiaPHCRRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		// Tularemia Result Organizer
		List<II> organizerIdList = new ArrayList<II>();
		organizerIdList.add(Datatypes.createII(NullFlavor.NI));
		CD organizerCode = Datatypes.createCD("17928-3", LOINC_OID, LOINC_SYSTEM_NAME, "Bacteria Bld Aerobe Cult");
		IVL_TS organizerEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CE organizerSpecimenType = Datatypes.createCE("258580003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Whole Blood");
		
		TularemiaResultOrganizer organizer = TUL.createTularemiaResultOrganizer().init();
		dxTestsSection.addOrganizer(organizer);
		((Entry) organizer.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < organizerIdList.size(); i++) {
			organizer.getIds().add(organizerIdList.get(i));
		}
		if (organizerCode != null) organizer.setCode(organizerCode);
		if (organizerEffectiveTime != null) organizer.setEffectiveTime(organizerEffectiveTime);
		
		if (organizerSpecimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			organizer.getSpecimens().add(specimen);
			playingEntity.setCode(organizerSpecimenType);
		}
		
		// Result Organizer Informant (required)
		II organizerInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON organizerOrganizationName = Datatypes.createON();
		organizerOrganizationName.addText("St. Luke's Boise Medical Center");	
		
		AD organizerOrganizationAddress = Datatypes.createAD();
		organizerOrganizationAddress.addCity("Boise");
		organizerOrganizationAddress.addState("ID");
		organizerOrganizationAddress.addPostalCode("83712");	
		
		TEL organizerOrganizationTelecom = Datatypes.createTEL("tel:+1-208-381-2222");
		
		Informant12 organizerInformant = CDA.createInformant12();
		AssignedEntity organizerInformantEntity = CDA.createAssignedEntity();
		Organization organizerOrganization = CDA.createOrganization();
		organizerInformantEntity.getIds().add(organizerInformantId);
		organizerInformantEntity.getAddrs().add(organizerOrganizationAddress);
		organizerInformantEntity.getTelecoms().add(organizerOrganizationTelecom);
		organizerOrganization.getNames().add(organizerOrganizationName);
		organizerInformantEntity.getRepresentedOrganizations().add(organizerOrganization);
		organizerInformant.setAssignedEntity(organizerInformantEntity);
		organizer.getInformants().add(organizerInformant);
		
		
		// Tularemia Result Observation
		List<II> stainObservationIdList = new ArrayList<II>();
		stainObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD stainObservationCode = Datatypes.createCD("664-3", LOINC_OID, LOINC_SYSTEM_NAME, "Gram Stain");
		IVL_TS stainObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY stainValue = Datatypes.createCD("53932007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Gram-negative coccobacillus");
		
		String stainObservationSectionText1 = "Collected " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " " + organizerSpecimenType.getDisplayName() + " - " + stainObservationCode.getDisplayName() + ", Gram-negative coccobacillus";
		String stainObservationSectionText2 = "St. Luke's Boise Medical Center, Boise, ID 83712 (tel: 208-381-2222)";
		
		TularemiaResultObservation stainObservation = TUL.createTularemiaResultObservation().init();
		organizer.addObservation(stainObservation);
		
		for (int i=0; i < stainObservationIdList.size(); i++) {
			stainObservation.getIds().add(stainObservationIdList.get(i));
		}
		if (stainObservationCode != null) stainObservation.setCode(stainObservationCode);
		if (stainObservationEffectiveTime != null) stainObservation.setEffectiveTime(stainObservationEffectiveTime);
		if (stainValue != null) stainObservation.getValues().add(stainValue);
		
		// Result Observation Informant (required)
		II stainObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON stainObservationOrganizationName = Datatypes.createON();
		stainObservationOrganizationName.addText("St. Luke's Boise Medical Center");	
		
		AD stainObservationOrganizationAddress = Datatypes.createAD();
		stainObservationOrganizationAddress.addCity("Boise");
		stainObservationOrganizationAddress.addState("ID");
		stainObservationOrganizationAddress.addPostalCode("83712");	
		
		TEL stainObservationOrganizationTelecom = Datatypes.createTEL("tel:+1-208-381-2222");
		
		Informant12 stainObservationInformant = CDA.createInformant12();
		AssignedEntity stainObservationInformantEntity = CDA.createAssignedEntity();
		Organization stainObservationOrganization = CDA.createOrganization();
		stainObservationInformantEntity.getIds().add(stainObservationInformantId);
		stainObservationInformantEntity.getAddrs().add(stainObservationOrganizationAddress);
		stainObservationInformantEntity.getTelecoms().add(stainObservationOrganizationTelecom);
		stainObservationOrganization.getNames().add(stainObservationOrganizationName);
		stainObservationInformantEntity.getRepresentedOrganizations().add(stainObservationOrganization);
		stainObservationInformant.setAssignedEntity(stainObservationInformantEntity);
		stainObservation.getInformants().add(stainObservationInformant);
		
		// Tularemia Result Observation
		List<II> serologyObservationIdList = new ArrayList<II>();
		serologyObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD serologyObservationCode = Datatypes.createCD("33679-2", LOINC_OID, LOINC_SYSTEM_NAME, "F tular DNA XXX Ql PCR");
		IVL_TS serologyObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY serologyValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		CE serologyObservationMethodCode = Datatypes.createCE("258066000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Polymerase chain reaction");
		
		String serologyObservationSectionText1 = "Collected " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " " + organizerSpecimenType.getDisplayName() + " - " + serologyObservationCode.getDisplayName() + ", Positive";
		String serologyObservationSectionText2 = "Idaho Bureau of Laboratories, Boise, ID 83712 (tel: 208-334-2235)";
		
		TularemiaResultObservation serologyObservation = TUL.createTularemiaResultObservation().init();
		organizer.addObservation(serologyObservation);
		
		for (int i=0; i < serologyObservationIdList.size(); i++) {
			serologyObservation.getIds().add(serologyObservationIdList.get(i));
		}
		if (serologyObservationCode != null) serologyObservation.setCode(serologyObservationCode);
		if (serologyObservationEffectiveTime != null) serologyObservation.setEffectiveTime(serologyObservationEffectiveTime);
		if (serologyValue != null) serologyObservation.getValues().add(serologyValue);
		if (serologyObservationMethodCode != null) serologyObservation.getMethodCodes().add(serologyObservationMethodCode);
		
		// Result Observation Informant (required)
		II serologyObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON serologyObservationOrganizationName = Datatypes.createON();
		serologyObservationOrganizationName.addText("Idaho Bureau of Laboratories");	
		
		AD serologyObservationOrganizationAddress = Datatypes.createAD();
		serologyObservationOrganizationAddress.addCity("Boise"); 
		serologyObservationOrganizationAddress.addState("ID");
		serologyObservationOrganizationAddress.addPostalCode("83712");	
		
		TEL serologyObservationOrganizationTelecom = Datatypes.createTEL("tel:+1-208-334-2235");
		
		Informant12 serologyObservationInformant = CDA.createInformant12();
		AssignedEntity serologyObservationInformantEntity = CDA.createAssignedEntity();
		Organization serologyObservationOrganization = CDA.createOrganization();
		serologyObservationInformantEntity.getIds().add(serologyObservationInformantId);
		serologyObservationInformantEntity.getAddrs().add(serologyObservationOrganizationAddress);
		serologyObservationInformantEntity.getTelecoms().add(serologyObservationOrganizationTelecom);
		serologyObservationOrganization.getNames().add(serologyObservationOrganizationName);
		serologyObservationInformantEntity.getRepresentedOrganizations().add(serologyObservationOrganization);
		serologyObservationInformant.setAssignedEntity(serologyObservationInformantEntity);
		serologyObservation.getInformants().add(serologyObservationInformant);
		
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Tularemia Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab observation
		items.add(stainObservationSectionText1);
		items.add(stainObservationSectionText2);
		items.add(serologyObservationSectionText1);
		items.add(serologyObservationSectionText2);

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
