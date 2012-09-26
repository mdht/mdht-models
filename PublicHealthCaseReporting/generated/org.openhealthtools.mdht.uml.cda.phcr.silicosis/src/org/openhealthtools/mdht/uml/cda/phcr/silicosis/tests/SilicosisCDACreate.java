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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
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
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class SilicosisCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static SilicosisFactory SILI = SilicosisFactory.eINSTANCE;
	
	public static String PATIENT_ID = "TX11221122";
	
	public static String TIME_STAMP_DOB        = "19540601000000-0800"; 
	public static String TIME_STAMP_SYMPTOMS   = "19880409000000-0800";
	public static String TIME_STAMP_SYMPTOMS2  = "19870615000000-0800";
	public static String TIME_STAMP_ENCOUNTER1 = "19881014080000-0800";	
	public static String TIME_STAMP_ENCOUNTER2 = "19881017094500-0800";
	public static String TIME_STAMP_ENCOUNTER3 = "19881104094500-0800";	
	public static String TIME_STAMP_REPORT     = "19881109094500-0800";	
	
	public static String TEST_CITY = "Odessa";
	public static String TEST_STATE = "TX";
	public static String TEST_POSTALCODE = "79761";
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		SilicosisCaseReport document = SILI.createSilicosisCaseReport().init();
		
		setHeader(document);
		
		setPatient(document);
		setReporter(document);
		setCustodian(document);
		setVerifier(document);
		
		setSocialHistorySection(document);
		setClinicalInformationSection(document);
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
			System.out.println("Silicosis document is valid");
		} else {
			System.out.println("Silicosis document is invalid");
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
	public static void setHeader(SilicosisCaseReport document) throws Exception {
		
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
	public static void setPatient(SilicosisCaseReport document) throws Exception {

		
		II patientId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("2600 Santa Cruz, Apt. #201");
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-432-123-4567");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Perez");
		patientName.addGiven("Juan");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2135-2", "2.16.840.1.113883.6.238", "Ethnicity Group", "Hispanic");
		CE patientMaritalStatus = Datatypes.createCE("S", "2.16.840.1.113883.5.2", "HL7", "Single");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("US");
		
		CS patientLanguageCode = Datatypes.createCS("es");
		
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
			
			// patientRole > patient > languageCommunication
			LanguageCommunication patientLanguage = CDA.createLanguageCommunication();
			patientLanguage.setLanguageCode(patientLanguageCode);
			patientLanguage.setPreferenceInd(Datatypes.createBL(true));
			patient.getLanguageCommunications().add(patientLanguage);
		}
	}
	
	/**
	 * Public Health Case Report Header - Reporter
	 *  ClinicalDocument > Author > AssignedAuthor > AssignedPerson 
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setReporter(SilicosisCaseReport document) throws Exception {
		
		TS reporterEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("500 4th Street");
		reporterAddress.addCity(TEST_CITY);	
		reporterAddress.addState(TEST_STATE);
		reporterAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Gomez");
		reporterName.addGiven("Janelle");
		reporterName.addPrefix("Dr");
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
	public static void setCustodian(SilicosisCaseReport document) throws Exception {
		
		II custodianOrgId = Datatypes.createII(NullFlavor.UNK);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Medical Center Hospital ");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("500 4th Street");
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		custodianOrgAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
		
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
	public static void setVerifier(SilicosisCaseReport document) throws Exception {
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(NullFlavor.UNK);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine("500 4th Street");
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		verifierAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Gomez");
		personName.addGiven("Janelle");
		personName.addPrefix("Dr");
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
	 *   Silicosis possible exposure location (SHOULD) 0..*
	 *   Silicosis socio-behavioral boolean risk factor (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(SilicosisCaseReport document) throws Exception {
		
		// Social History Section (optional)
		SilicosisPHCRSocialHistorySection socialHistorySection = SILI.createSilicosisPHCRSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2079-2", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "White");
		
		String raceCodeSectionText1 = "Race - White";
		
		List<CD> raceCodes = new ArrayList<CD>();
		raceCodes.add(raceCode1);
		int count = raceCodes.size();
		
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
		
		String occupationSectionText1 = "Occupation - Oil and Gas Extraction, Extraction Worker started on " + timeStampFormat("19841101000000-0700", TEST_DATE_FORMAT);
		String occupationSectionText2 = "Occupation Location - Texas Oil Plant, 212 Oil Plant Road, Odessa, Ector County, Texas 79762"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS("19841101000000-0700");
			CD occupationCode = Datatypes.createCD("47-5000", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Extraction Worker");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addState(TEST_STATE);

			TEL locationTelecom = Datatypes.createTEL();
			locationTelecom.setNullFlavor(NullFlavor.UNK);

			PN locationName = Datatypes.createPN();
			locationName.setNullFlavor(NullFlavor.UNK);
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS("19841101000000-0700");
			CD occupationHistoryCode = Datatypes.createCD("21111", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Oil and Gas Extraction");

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
		
		//Silicosis possible exposure location (SHOULD) 0..*
		// Value Set
		// http://
		
		boolean hasExposureLocation = true;
		
		IVL_TS exposureLocationTime = Datatypes.createIVL_TS();
		IVXB_TS locationTimeLow = Datatypes.createIVXB_TS();
		locationTimeLow.setValue("19841101000000-0700");
		IVXB_TS locationTimeHigh = Datatypes.createIVXB_TS();
		locationTimeHigh.setValue("19881015000000-0700");
		exposureLocationTime.setLow(locationTimeLow);
		exposureLocationTime.setHigh(locationTimeHigh);

		AD exposureLocationAddress = Datatypes.createAD();
		exposureLocationAddress.addCountry("USA");

		TEL exposureLocationTelecom = Datatypes.createTEL();
		exposureLocationTelecom.setNullFlavor(NullFlavor.UNK);

		CE exposureLocationTypeCode = Datatypes.createCE("285141008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Work Environment");
		
		PN exposureLocationName = Datatypes.createPN();
		exposureLocationName.setNullFlavor(NullFlavor.UNK);
		
		String exposureLocationSectionText = "Possible Exposure Location - Work Environment, " + 
			timeStampFormat(locationTimeLow.getValue(), TEST_DATE_FORMAT) + "-" + timeStampFormat(locationTimeHigh.getValue(), TEST_DATE_FORMAT);
		
		if (hasExposureLocation) {
			SilicosisPossibleExposureLocationAndTypeAct locationAndTypeAct = SILI.createSilicosisPossibleExposureLocationAndTypeAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("102445001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Exposure to toxic dust");

			CV qualifierValue2 = Datatypes.createCV();
			qualifierValue2.setCode("47429007");
			qualifierValue2.setCodeSystem(SNOMED_OID);
			qualifierValue2.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue2.setDisplayName("Associated with");

			CD qualifierCode2 = Datatypes.createCD("311429008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Silica dust");

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
			ParticipantRole exposureParticipantRole = CDA.createParticipantRole();
			exposureParticipantRole.setClassCode(RoleClassRoot.LOCE);
			PlayingEntity exposurePlayingEntity = CDA.createPlayingEntity();
			exposurePlayingEntity.setClassCode(EntityClassRoot.PLC);
			exposureParticipantRole.setPlayingEntity(exposurePlayingEntity);
			exposureLocationParticipant.setParticipantRole(exposureParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureLocationParticipant);

			exposureLocationParticipant.setTime(exposureLocationTime);
			if (exposureLocationAddress != null) {
				exposureParticipantRole.getAddrs().add(exposureLocationAddress);
			}
			if (exposureLocationTelecom != null) {
				exposureParticipantRole.getTelecoms().add(exposureLocationTelecom);
			}
			if (exposureLocationTypeCode != null) {
				exposurePlayingEntity.setCode(exposureLocationTypeCode);
			}
			if (exposureLocationName != null) {
				exposurePlayingEntity.getNames().add(exposureLocationName);
			}

			socialHistorySection.addAct(locationAndTypeAct);
			((Entry) locationAndTypeAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			hasSocialHistory = true;
		}
		
		
		// Silicosis socio-behavioral boolean risk factor (SHOULD) 0..*
		// Value Set 2.16.840.1.114222.4.11.3228
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=AEE75E17-176B-DE11-9B52-0015173D1785
		
		boolean hasSocioBehavioralRiskFactor = true;
		
		II toxicDustRiskFactorId = Datatypes.createII(NullFlavor.NI);
		IVL_TS toxicDustRiskFactorTime = Datatypes.createIVL_TS();
		IVXB_TS toxicDustRiskTimeLow = Datatypes.createIVXB_TS();
		toxicDustRiskTimeLow.setValue("19840210000000-0700");
		IVXB_TS toxicDustRiskTimeHigh = Datatypes.createIVXB_TS();
		toxicDustRiskTimeHigh.setValue("19881015000000-0700");
		toxicDustRiskFactorTime.setLow(toxicDustRiskTimeLow);
		toxicDustRiskFactorTime.setHigh(toxicDustRiskTimeHigh);
		CD toxicDustRiskFactorCode = Datatypes.createCD("102445001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Exposure to toxic dust");
		
		String behaviorRiskFactorSectionText1 = "Socio-behavioral Risk Factor - " + toxicDustRiskFactorCode.getDisplayName();
		
		if (hasSocioBehavioralRiskFactor) {
		
			SilicosisSocioBehavioralBooleanRiskFactorObservation riskFactor1 = SILI.createSilicosisSocioBehavioralBooleanRiskFactorObservation().init();
			riskFactor1.getIds().add(toxicDustRiskFactorId);
			riskFactor1.setEffectiveTime(toxicDustRiskFactorTime);
			riskFactor1.getValues().add(toxicDustRiskFactorCode);
			riskFactor1.setNegationInd(false);
		
			socialHistorySection.addObservation(riskFactor1);
			((Entry) riskFactor1.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
						
			hasSocialHistory = true;
		}
				
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Silicosis Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			
			// Race observation
			items.add(raceCodeSectionText1);
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			
			// Silicosis possible exposure location act
			items.add(exposureLocationSectionText);
			
			// Socio-behavioral risk factor observation
			items.add(behaviorRiskFactorSectionText1);
			
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
	 *   Silicosis Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Silicosis Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		SilicosisPHCRClinicalInformationSection clinicalInformationSection = SILI.createSilicosisPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Silicosis Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("233760007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Acute silicosis");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_REPORT);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - " + reportableCode.getDisplayName();
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Janelle Gomez, MD";
		
		SilicosisCaseObservation caseObservation = SILI.createSilicosisCaseObservation().init();
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
		authorAddress.addStreetAddressLine("500 4th Street");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Gomez");
		authorName.addGiven("Janelle");
		authorName.addPrefix("Dr");
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
		informantName.addFamily("Gomez");
		informantName.addGiven("Janelle");
		informantName.addPrefix("Dr");
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
		
		boolean symptomChestPain = false;
		boolean symptomCorPulmonale = false;
		boolean symptomCough = false;
		boolean symptomCyanosis  = false;
		boolean symptomDyspnea  = true;
		boolean symptomFatigue  = true;
		boolean symptomFever = false;
		boolean symptomLossOfAppetite  = false;
		boolean symptomPersistentCough = true;
		boolean symptomRespiratoryInsufficiency = false;
		boolean symptomTachypnea = false;
		boolean symptomWeightLoss = true;
				
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Chest pain (29857009 - SNOMEDCT)
		if (symptomChestPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("29857009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chest pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomChestPain);
			items.add("Signs and Symptoms - Chest pain " + (symptomChestPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		// Signs and Symptom Cor Pulmonale  (83291003 - SNOMEDCT)
		if (symptomCorPulmonale || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("83291003", SNOMED_OID, SNOMED_SYSTEM_NAME, "CorPulmonale"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomCorPulmonale);
			items.add("Signs and Symptoms - CorPulmonale " + (symptomCorPulmonale ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Cough (49727002 - SNOMEDCT)
		if (symptomCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("49727002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS2));
			signsSymptomsNegInd.add(!symptomCough);
			items.add("Signs and Symptoms - Cough " + (symptomCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}

		// Signs and Symptom Cyanosis (3415004 - SNOMEDCT)
		if (symptomCyanosis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("3415004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cyanosis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomCyanosis);
			items.add("Signs and Symptoms - Cyanosis " + (symptomCyanosis ? "REPORTED" : "not reported"));
		}

		
		// Signs and Symptom Dyspnea - shortness of breath (267036007 - SNOMEDCT)
		if (symptomDyspnea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("267036007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Dyspnea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPersistentCough);
			items.add("Signs and Symptoms - Dyspnea " + (symptomDyspnea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fatigue (84229001 - SNOMEDCT)
		if (symptomFatigue || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84229001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fatigue"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS2));
			signsSymptomsNegInd.add(!symptomFatigue);
			items.add("Signs and Symptoms - Fatigue " + (symptomFatigue ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Loss Of Appetite (79890006 - SNOMEDCT)
		if (symptomLossOfAppetite || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("79890006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Loss Of Appetite"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomLossOfAppetite);
			items.add("Signs and Symptoms - Loss Of Appetite " + (symptomLossOfAppetite ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Persistent Cough (284523002 - SNOMEDCT)
		if (symptomPersistentCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("284523002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Persistent Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPersistentCough);
			items.add("Signs and Symptoms - Persistent Cough " + (symptomPersistentCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Respiratory Insufficiency  (409623005 - SNOMEDCT)
		if (symptomRespiratoryInsufficiency  || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("409623005", SNOMED_OID, SNOMED_SYSTEM_NAME, "RespiratoryInsufficiency "));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomRespiratoryInsufficiency );
			items.add("Signs and Symptoms - RespiratoryInsufficiency  " + (symptomRespiratoryInsufficiency  ? "REPORTED" : "not reported"));
		}

		// Signs and Symptom Tachypnea (271823003 - SNOMEDCT)
		if (symptomTachypnea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("271823003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Tachypnea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomTachypnea);
			items.add("Signs and Symptoms - Tachypnea " + (symptomTachypnea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
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
			
			SilicosisSignsAndSymptomsObservation symptomsObservation = SILI.createSilicosisSignsAndSymptomsObservation().init();
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

		// patient alive
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
		buffer.append("            " + "            " + "<caption>" + "Silicosis Clinical Information Section" + "</caption>");
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
		document.addSection(encountersSection);
		
		// First Encounter
		II encounter1Id = Datatypes.createII(TEST_ROOT, "TX28932881-1");
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD encounter1Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
				
		String encounter1SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " at Medical Center Hospital, 500 4th Street, Seattle, WA (tel:432-621-8411)";
		String encounter1PerformerSectionText = "Encounter with Dr. Janelle Gomez MD";
		
		// Second Encounter
		II encounter2Id = Datatypes.createII(TEST_ROOT, "TX28932881-2");
		List<II> activity2IdList = new ArrayList<II>();
		activity2IdList.add(encounter2Id);
		IVL_TS encounter2EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD encounter2Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter2SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " at Medical Center Hospital, 500 4th Street, Seattle, WA (tel:432-621-8411)";
		String encounter2PerformerSectionText = "Encounter with Dr. Janelle Gomez MD";
		
		// Third Encounter
		II encounter3Id = Datatypes.createII(TEST_ROOT, "TX28932881-3");
		List<II> activity3IdList = new ArrayList<II>();
		activity3IdList.add(encounter3Id);
		IVL_TS encounter3EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER3);
		CD encounter3Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter3SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT) + " at Medical Center Hospital, 500 4th Street, Seattle, WA (tel:432-621-8411)";
		String encounter3PerformerSectionText = "Encounter with Dr. Janelle Gomez MD";
		
		
		EncountersActivity encounters1Activity = createEncountersActivity(activity1IdList, encounter1EffectiveTime, encounter1Type);
		encountersSection.addEncounter(encounters1Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		EncountersActivity encounters2Activity = createEncountersActivity(activity2IdList, encounter2EffectiveTime, encounter2Type);
		encountersSection.addEncounter(encounters2Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
		EncountersActivity encounters3Activity = createEncountersActivity(activity3IdList, encounter3EffectiveTime, encounter3Type);
		encountersSection.addEncounter(encounters3Activity);
		((Entry) encounters3Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Encounters Section" + "</caption>");
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

		// encounter 3
		items.add(encounter3SectionText);
		items.add(encounter3PerformerSectionText);

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
	 *   > Result Organizer
	 *   > Result Observation
	 *   > Imaging Observation
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		SilicosisPHCRRelevantDxTestsSection dxTestsSection = SILI.createSilicosisPHCRRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
//		// CCD Result Observation - Skin Test
//		List<II> skinTestIdList = new ArrayList<II>();
//		skinTestIdList.add(Datatypes.createII(NullFlavor.UNK));
//		CD skinTestCode = Datatypes.createCD("1648-5", "2.16.840.1.113883.6.1", "LOINC", "TB Wheal 3D p 5 TU Diam Qn");
//		IVL_TS skinTestEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
//		CS skinTestStatus = Datatypes.createCS("completed");
//		ANY skinTestValue = Datatypes.createCD("260385009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Negative");
//		
//		String skinTestObservationSectionText1 = skinTestCode.getDisplayName() + " performed on " +
//			timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " , read on " + 
//			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", result: Positive";
//		String skinTestObservationSectionText2 = "Medical Center Hospital, 500 4th Street, Seattle, WA  (tel:432-621-8411)";
//			
//		ResultObservation skinTestObservation = PHCR.createResultObservation().init();
//		dxTestsSection.addObservation(skinTestObservation);
//		((Entry) skinTestObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
//		
//		for (int i=0; i < skinTestIdList.size(); i++) {
//			skinTestObservation.getIds().add(skinTestIdList.get(i));
//		}
//		if (skinTestCode != null) skinTestObservation.setCode(skinTestCode);
//		if (skinTestEffectiveTime != null) skinTestObservation.setEffectiveTime(skinTestEffectiveTime);
//		if (skinTestStatus != null) skinTestObservation.setStatusCode(skinTestStatus);
//		if (skinTestValue != null) skinTestObservation.getValues().add(skinTestValue);
//		
//		II skinTestInformantId = Datatypes.createII(NullFlavor.UNK);
//		
//		ON skinTestOrganizationName = Datatypes.createON();
//		skinTestOrganizationName.addText("Medical Center Hospital");
//		
//		AD skinTestOrganizationAddress = Datatypes.createAD();
//		skinTestOrganizationAddress.addStreetAddressLine("500 4th Street");
//		skinTestOrganizationAddress.addCity(TEST_CITY);
//		skinTestOrganizationAddress.addState(TEST_STATE);
//		skinTestOrganizationAddress.addPostalCode(TEST_POSTALCODE);
//		
//		TEL skinTestOrganizationTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
//		
//		Informant12 skinTestInformant = CDA.createInformant12();
//		AssignedEntity skinTestInformantEntity = CDA.createAssignedEntity();
//		Organization skinTestOrganization = CDA.createOrganization();
//		skinTestInformantEntity.getIds().add(skinTestInformantId);
//		skinTestInformantEntity.getAddrs().add(skinTestOrganizationAddress);
//		skinTestInformantEntity.getTelecoms().add(skinTestOrganizationTelecom);
//		skinTestOrganization.getNames().add(skinTestOrganizationName);
//		skinTestInformantEntity.getRepresentedOrganizations().add(skinTestOrganization);
//		skinTestInformant.setAssignedEntity(skinTestInformantEntity);
//		skinTestObservation.getInformants().add(skinTestInformant);
//		
//		
//		
//		// Result Observation - Sputum AFB
//		List<II> sputumAFStainIdList = new ArrayList<II>();
//		sputumAFStainIdList.add(Datatypes.createII(NullFlavor.UNK));
//		CD sputumAFStainCode = Datatypes.createCD("64327005", "2.16.840.1.113883.6.1", "LOINC", "Acid Fast Stain");
//		IVL_TS sputumAFStainEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
//		CS sputumAFStainStatus = Datatypes.createCS("completed");
//		CD sputumAFStainValue = Datatypes.createCD("243365003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Acid-fast bacillus");
//		CE sputumSpecimenType = Datatypes.createCE("119335007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Coughed Sputum");
//		CE sputumAFStainMethodCode = Datatypes.createCE("0144", "2.16.840.1.113883.5.84", "ObservationMethod", "Acid fast stain, fluorochrome");
//		
//		CV qualifierValue = Datatypes.createCV();
//		qualifierValue.setCode("408729009");
//		qualifierValue.setCodeSystem(SNOMED_OID);
//		qualifierValue.setCodeSystemName(SNOMED_SYSTEM_NAME);
//		qualifierValue.setDisplayName("Finding context");
//
//		CD qualifierCode = Datatypes.createCD("260349009", SNOMED_OID, SNOMED_SYSTEM_NAME, "+++");
//
//		CR sputumAFStainQualifier = Datatypes.createCR();
//		sputumAFStainQualifier.setName(qualifierValue);
//		sputumAFStainQualifier.setValue(qualifierCode);
//
//		sputumAFStainValue.getQualifiers().add(sputumAFStainQualifier);
//		
//		String sputumAFStainObservationSectionText1 = sputumSpecimenType.getDisplayName() + " collected on " +
//		timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + ", " + sputumAFStainCode.getDisplayName() + " result: Negative";
//		String sputumAFStainObservationSectionText2 = "Medical Center Hospital Laboratory, 500 4th Street, Seattle, WA  (tel:432-621-8411)";
//				
//		ResultObservation sputumAFStainObservation = PHCR.createResultObservation().init();
//		dxTestsSection.addObservation(sputumAFStainObservation);
//		((Entry) sputumAFStainObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
//		
//		for (int i=0; i < sputumAFStainIdList.size(); i++) {
//			sputumAFStainObservation.getIds().add(sputumAFStainIdList.get(i));
//		}
//		if (sputumAFStainCode != null) sputumAFStainObservation.setCode(sputumAFStainCode);
//		if (sputumAFStainEffectiveTime != null) sputumAFStainObservation.setEffectiveTime(sputumAFStainEffectiveTime);
//		if (sputumAFStainStatus != null) sputumAFStainObservation.setStatusCode(sputumAFStainStatus);
//		if (sputumAFStainValue != null) sputumAFStainObservation.getValues().add(sputumAFStainValue);
//		if (sputumAFStainMethodCode != null) sputumAFStainObservation.getMethodCodes().add(sputumAFStainMethodCode);
//		
//		II sputumAFStainInformantId = Datatypes.createII(NullFlavor.UNK);
//		
//		ON sputumAFStainOrganizationName = Datatypes.createON();
//		sputumAFStainOrganizationName.addText("Medical Center Hospital Laboratory");
//		
//		AD sputumAFStainOrganizationAddress = Datatypes.createAD();
//		sputumAFStainOrganizationAddress.addStreetAddressLine("500 4th Street");
//		sputumAFStainOrganizationAddress.addCity(TEST_CITY);
//		sputumAFStainOrganizationAddress.addState(TEST_STATE);
//		sputumAFStainOrganizationAddress.addPostalCode(TEST_POSTALCODE);
//		
//		TEL sputumAFStainOrganizationTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
//		
//		Informant12 sputumAFStainInformant = CDA.createInformant12();
//		AssignedEntity sputumAFStainInformantEntity = CDA.createAssignedEntity();
//		Organization sputumAFStainOrganization = CDA.createOrganization();
//		sputumAFStainInformantEntity.getIds().add(sputumAFStainInformantId);
//		sputumAFStainInformantEntity.getAddrs().add(sputumAFStainOrganizationAddress);
//		sputumAFStainInformantEntity.getTelecoms().add(sputumAFStainOrganizationTelecom);
//		sputumAFStainOrganization.getNames().add(sputumAFStainOrganizationName);
//		sputumAFStainInformantEntity.getRepresentedOrganizations().add(sputumAFStainOrganization);
//		sputumAFStainInformant.setAssignedEntity(sputumAFStainInformantEntity);
//		sputumAFStainObservation.getInformants().add(sputumAFStainInformant);
//		
//		
//		// Imaging Observation
//		List<II> imageIds = new ArrayList<II>();
//		imageIds.add(Datatypes.createII(TEST_ROOT, "333"));
//		CD imageCode = Datatypes.createCD();
//		imageCode.setCode("ASSERTION");
//		imageCode.setCodeSystem("2.16.840.1.113883.5.4");
//		imageCode.setCodeSystemName("HL7ActCode");
//		IVL_TS imageEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
//		ANY imageValue = Datatypes.createED("Chest X-Ray findings: Diffuse interstitial disease with multiple small rounded opacities in most lung fields");
//		CE imageMethodType = Datatypes.createCE("168731009", "2.16.840.1.113883.6.96", "SNOMED-CT", "Standard chest X-ray");
//		
//		String imageObservationSectionText = imageMethodType.getDisplayName() + " - Chest X-Ray findings: Diffuse interstitial disease with multiple small rounded opacities in most lung fields";
//		
//		File imageMediaFile = new File("samples/Silicosis_simple.JPG");
//		String imageMediaId = "ABC";
//		String imageMediaType = "image/jpeg";
//			
//		ImagingObservation imageObservation = PHCR.createImagingObservation().init();
//		dxTestsSection.addObservation(imageObservation);
//		((Entry) imageObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
//		
//		for (int i=0; i < imageIds.size(); i++) {
//			imageObservation.getIds().add(imageIds.get(i));
//		}
//		if (imageCode != null) imageObservation.setCode(imageCode);
//		if (imageEffectiveTime != null) imageObservation.setEffectiveTime(imageEffectiveTime);
//		if (imageValue != null) imageObservation.getValues().add(imageValue);
//		if (imageMethodType != null) imageObservation.getMethodCodes().add(imageMethodType);
//		
//		ObservationMedia obMedia = createMediaObservation(imageMediaFile, imageMediaId, imageMediaType);
//		imageObservation.addObservationMedia(obMedia);
//		((EntryRelationship) obMedia.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
//		
//		// Image Observation Informant
//		II imageInformantId = Datatypes.createII(TEST_ROOT, "2872927");
//		
//		ON imageOrganizationName = Datatypes.createON();
//		imageOrganizationName.addText("Radiology Clinic");		
//		
//		Informant12 imageInformant = CDA.createInformant12();
//		AssignedEntity imageInformantEntity = CDA.createAssignedEntity();
//		Organization imageOrganization = CDA.createOrganization();
//		imageInformantEntity.getIds().add(imageInformantId);
//		imageOrganization.getNames().add(imageOrganizationName);
//		imageInformantEntity.getRepresentedOrganizations().add(imageOrganization);
//		imageInformant.setAssignedEntity(imageInformantEntity);
//		imageObservation.getInformants().add(imageInformant);			
//		
//		// CCD Result Observation - Lung biopsy
//		
//		List<II> LungBiopsyTestIdList = new ArrayList<II>();
//		LungBiopsyTestIdList.add(Datatypes.createII(NullFlavor.UNK));
//		CD LungBiopsyTestCode = Datatypes.createCD("66107", LOINC_OID, LOINC_SYSTEM_NAME, "Lung Pathology biopsy report");
//		IVL_TS lungBiopsyEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER3);
//		CS LungBiopsyTestStatus = Datatypes.createCS("completed");
//		ANY LungBiopsyTestValue = Datatypes.createCD("233760007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Acute silicosis");
//		CE lungBiopsySpecimenType = Datatypes.createCE("119376003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Tissue");
//		
//		String LungBiopsyTestObservationSectionText1 = lungBiopsySpecimenType.getDisplayName() + " collected on " +
//		timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT) + ", " + LungBiopsyTestCode.getDisplayName() + " result: Acute silicosis";
//		String LungBiopsyTestObservationSectionText2 = "Medical Center Hospital Laboratory, 500 4th Street, Seattle, WA  (tel:432-621-8411)";
//			
//		ResultObservation LungBiopsyTestObservation = PHCR.createResultObservation().init();
//		dxTestsSection.addObservation(LungBiopsyTestObservation);
//		((Entry) LungBiopsyTestObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
//		
//		for (int i=0; i < LungBiopsyTestIdList.size(); i++) {
//			LungBiopsyTestObservation.getIds().add(LungBiopsyTestIdList.get(i));
//		}
//		if (LungBiopsyTestCode != null) LungBiopsyTestObservation.setCode(LungBiopsyTestCode);
//		if (lungBiopsyEffectiveTime != null) LungBiopsyTestObservation.setEffectiveTime(lungBiopsyEffectiveTime);
//		if (LungBiopsyTestStatus != null) LungBiopsyTestObservation.setStatusCode(LungBiopsyTestStatus);
//		if (LungBiopsyTestValue != null) LungBiopsyTestObservation.getValues().add(LungBiopsyTestValue);
//		
//		II LungBiopsyTestInformantId = Datatypes.createII(NullFlavor.UNK);
//		
//		ON LungBiopsyTestOrganizationName = Datatypes.createON();
//		LungBiopsyTestOrganizationName.addText("Medical Center Hospital Laboratory");
//		
//		AD LungBiopsyTestOrganizationAddress = Datatypes.createAD();
//		LungBiopsyTestOrganizationAddress.addStreetAddressLine("500 4th Street");
//		LungBiopsyTestOrganizationAddress.addCity(TEST_CITY);
//		LungBiopsyTestOrganizationAddress.addState(TEST_STATE);
//		LungBiopsyTestOrganizationAddress.addPostalCode(TEST_POSTALCODE);
//		
//		TEL LungBiopsyTestOrganizationTelecom = Datatypes.createTEL("tel:+1-432-621-8411");
//		
//		Informant12 LungBiopsyTestInformant = CDA.createInformant12();
//		AssignedEntity LungBiopsyTestInformantEntity = CDA.createAssignedEntity();
//		Organization LungBiopsyTestOrganization = CDA.createOrganization();
//		LungBiopsyTestInformantEntity.getIds().add(LungBiopsyTestInformantId);
//		LungBiopsyTestInformantEntity.getAddrs().add(LungBiopsyTestOrganizationAddress);
//		LungBiopsyTestInformantEntity.getTelecoms().add(LungBiopsyTestOrganizationTelecom);
//		LungBiopsyTestOrganization.getNames().add(LungBiopsyTestOrganizationName);
//		LungBiopsyTestInformantEntity.getRepresentedOrganizations().add(LungBiopsyTestOrganization);
//		LungBiopsyTestInformant.setAssignedEntity(LungBiopsyTestInformantEntity);
//		LungBiopsyTestObservation.getInformants().add(LungBiopsyTestInformant);
				
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Silicosis Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
//		// tb skin test
//		items.add(skinTestObservationSectionText1);
//		items.add(skinTestObservationSectionText2);
//		 
//		// sputum AF stain
//		items.add(sputumAFStainObservationSectionText1);
//		items.add(sputumAFStainObservationSectionText2);
//		
//		// chest x-ray image observation
//		items.add(imageObservationSectionText);
//
//		// Lung biopsy
//		items.add(LungBiopsyTestObservationSectionText1);
//		items.add(LungBiopsyTestObservationSectionText2);
		
		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		StringBuffer buffer2 = new StringBuffer();
		buffer2.append("<renderMultiMedia referencedObject=");
//		buffer2.append("\"" + imageMediaId + "\"");
		buffer2.append("/>");
		
		dxTestsSection.createStrucDocText(listOpen + listItems + listClose + buffer2.toString());
	
	}
	
	
	
	private static String timeStampFormat(String stringDate, String format) throws Exception {
		
		Date date;
		SimpleDateFormat cdaDateFormat = new SimpleDateFormat("yyyyMMddHHmmssZ");
		date = cdaDateFormat.parse(stringDate);
		SimpleDateFormat newDateFormat = new SimpleDateFormat(format);
		return newDateFormat.format(date);
	}
	
	
	private static ObservationMedia createMediaObservation(File mediaObservation, String mediaID, String mediaType) throws Exception {

		InputStream inStream = new FileInputStream(mediaObservation);
		long length = mediaObservation.length();
		byte[] bytes = new byte[(int)length];
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length && (numRead=inStream.read(bytes, offset, bytes.length-offset)) >= 0) {
			offset += numRead;
		}
		inStream.close();
		String b64 = Base64.encode(bytes);

		ObservationMedia obMedia = CDA.createObservationMedia();
		obMedia.setClassCode(ActClassObservation.OBS);
		obMedia.setMoodCode(ActMood.EVN);

		obMedia.setObservationMediaId(mediaID);
		ED value = Datatypes.createED();
		value.setMediaType(mediaType);
		value.setRepresentation(BinaryDataEncoding.B64);
		////FeatureMapUtil.addText(value.getMixed(), b64);
		////obMedia.setValue(value);
		value.setReference(Datatypes.createTEL(b64));
		obMedia.setValue(value);
		
		return obMedia;		
	}
	
	
	private static EncountersActivity createEncountersActivity(List<II> idList, IVL_TS effectiveTime, CD encounterType) throws Exception {
		
		EncountersActivity encountersActivity = CCD.createEncountersActivity().init();
		
		for (int i=0; i < idList.size(); i++) {
			encountersActivity.getIds().add(idList.get(i));
		}
		if (effectiveTime != null) {
			encountersActivity.setEffectiveTime(effectiveTime);
		}
		if (encounterType != null) {
			encountersActivity.setCode(encounterType);
		}
		
		// Encounter Performer (optional - but must have one source) - if exists, must have ii (id)
		List<II> idPerformerList = new ArrayList<II>();
		idPerformerList.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adPerformerList = new ArrayList<AD>();
		AD performerAddress = Datatypes.createAD();
		performerAddress.addStreetAddressLine("500 4th Street");
		performerAddress.addCity(TEST_CITY);
		performerAddress.addState(TEST_STATE);
		performerAddress.addPostalCode(TEST_POSTALCODE);
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+1-432-621-8411"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Gomez");
		performerPN.addGiven("Janelle");
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
		idParticipantList.add(Datatypes.createII(NullFlavor.UNK));
		List<AD> adParticipantList = new ArrayList<AD>();
		AD participantAddress = Datatypes.createAD();
		participantAddress.addStreetAddressLine("500 4th Street");
		participantAddress.addCity(TEST_CITY);
		participantAddress.addState(TEST_STATE);
		participantAddress.addPostalCode(TEST_POSTALCODE);
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-432-621-8411"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("Medical Center Hospital");
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
		
		return encountersActivity;
	}

}
