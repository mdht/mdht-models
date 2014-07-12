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
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
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
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class SalmonellosisCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static SalmonellosisFactory SALM = SalmonellosisFactory.eINSTANCE;
	
	public static String PATIENT_ID = "HI11221122";
	
	public static String TIME_STAMP_DOB        = "19970201000000-0700"; 
	public static String TIME_STAMP_SYMPTOMS   = "20071104000000-0700";
	public static String TIME_STAMP_ENCOUNTER1 = "20071105000000-0700";
	public static String TIME_STAMP_ENCOUNTER2 = "20071107094500-0700";
	public static String TIME_STAMP_REPORT     = "20071107094500-0700";	
	
	public static String TEST_CITY = "Wahiawa";
	public static String TEST_STATE = "HI";
	public static String TEST_POSTALCODE = "96786";
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		SalmonellosisCaseReport document = SALM.createSalmonellosisCaseReport().init();
		
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
			System.out.println("Salmonellosis document is valid");
		} else {
			System.out.println("Salmonellosis document is invalid");
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
	public static void setHeader(SalmonellosisCaseReport document) throws Exception {
		
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
	public static void setPatient(SalmonellosisCaseReport document) throws Exception {

		
		II patientId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("98-299A Moanalua Road");
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-808-123-4567");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Fong");
		patientName.addGiven("Noah");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
		CE patientRace = Datatypes.createCE("2079-2", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "Native Hawaiian");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		CE patientMaritalStatus = Datatypes.createCE("S", "2.16.840.1.113883.5.2", "HL7", "Single");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("US");
		
		CS patientLanguageCode = Datatypes.createCS("en");
		
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
	public static void setReporter(SalmonellosisCaseReport document) throws Exception {
		
		TS reporterEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("128 Lehua Street");
		reporterAddress.addCity(TEST_CITY);	
		reporterAddress.addState(TEST_STATE);
		reporterAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-808-621-8411");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Thomas");
		reporterName.addGiven("Kosasa");
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
	public static void setCustodian(SalmonellosisCaseReport document) throws Exception {
		
		II custodianOrgId = Datatypes.createII(NullFlavor.UNK);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Hawaii Health Information Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("900 Fort Street Mall, Suite 1300");
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		custodianOrgAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-808-111-2222");
		
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
	public static void setVerifier(SalmonellosisCaseReport document) throws Exception {
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(NullFlavor.UNK);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine("128 Lehua Street");
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		verifierAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-808-621-8411");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Thomas");
		personName.addGiven("Kosasa");
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
	 *   Salmonellosis possible exposure location (SHOULD) 0..*
	 *   HIV status observation (SHOULD) 0..1
	 *   Salmonellosis socio-behavioral boolean risk factor (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(SalmonellosisCaseReport document) throws Exception {
		
		// Social History Section (optional)
		SalmonellosisPHCRSocialHistorySection socialHistorySection = SALM.createSalmonellosisPHCRSocialHistorySection().init();
		boolean hasSocialHistory = false;
		

		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2079-2", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "Native Hawaiian");
		
		String raceCodeSectionText1 = "Race - Native Hawaiian";
		
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
		
		
		// Salmonellosis possible exposure location and type (MAY) 0..* - if exists, must have an exposure location
		
		boolean hasExposureLocation = true;
		
		String exposureLocationSectionText = "Possible Exposure Location - Home";
		String exposureAnimal1SectionText = "Possible Exposure to chicken";
		String exposureAnimal2SectionText = "Possible Exposure to cat";
		String exposureAnimal3SectionText = "Possible Exposure to dog";
		
		if (hasExposureLocation) {
		
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS();
			IVXB_TS exposureLocationTimeLow = Datatypes.createIVXB_TS();
			exposureLocationTimeLow.setValue("20071101000000-0600");
			exposureLocationTime.setLow(exposureLocationTimeLow);
			IVXB_TS exposureLocationTimeHigh = Datatypes.createIVXB_TS();
			exposureLocationTimeHigh.setValue("20071104000000-0600");
			exposureLocationTime.setHigh(exposureLocationTimeHigh);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addCity("Wahiawa");
			exposureLocationAddress.addState("HI");
			exposureLocationAddress.addPostalCode("96786");

			TEL exposureLocationTelecom = Datatypes.createTEL();
			exposureLocationTelecom.setNullFlavor(NullFlavor.NASK);

		CE exposureLocationTypeCode = Datatypes.createCE("264362003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Home");
		CE exposureAnimal1TypeCode = Datatypes.createCE("132834009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chicken");
		CE exposureAnimal2TypeCode = Datatypes.createCE("33384004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cat");
		CE exposureAnimal3TypeCode = Datatypes.createCE("68014009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Dog");


			SalmonellosisPossibleExposureLocationAndTypeAct locationAndTypeAct = SALM.createSalmonellosisPossibleExposureLocationAndTypeAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("444493007", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Salmonellosis contact");

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

//chicken exposure
			Participant2 exposureAnimal1Participant = CDA.createParticipant2();
			exposureAnimal1Participant.setTypeCode(ParticipationType.DIR);
			ParticipantRole exposureAnimal1ParticipantRole = CDA.createParticipantRole();
			exposureAnimal1ParticipantRole.setClassCode(RoleClassRoot.EXPR);
			Entity exposureAnimal1PlayingEntity = CDA.createEntity();
			exposureAnimal1PlayingEntity.setClassCode(EntityClassRoot.ANM);
			exposureAnimal1ParticipantRole.setScopingEntity(exposureAnimal1PlayingEntity);
			exposureAnimal1Participant.setParticipantRole(exposureAnimal1ParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureAnimal1Participant);

			if (exposureAnimal1TypeCode != null) {
				exposureAnimal1PlayingEntity.setCode(exposureAnimal1TypeCode);
			}

			// dog exposure
			Participant2 exposureAnimal2Participant = CDA.createParticipant2();
			exposureAnimal2Participant.setTypeCode(ParticipationType.DIR);
			ParticipantRole exposureAnimal2ParticipantRole = CDA.createParticipantRole();
			exposureAnimal2ParticipantRole.setClassCode(RoleClassRoot.EXPR);
			Entity exposureAnimal2PlayingEntity = CDA.createEntity();
			exposureAnimal2PlayingEntity.setClassCode(EntityClassRoot.ANM);
			exposureAnimal2ParticipantRole.setScopingEntity(exposureAnimal2PlayingEntity);
			exposureAnimal2Participant.setParticipantRole(exposureAnimal2ParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureAnimal2Participant);

			if (exposureAnimal2TypeCode != null) {
				exposureAnimal2PlayingEntity.setCode(exposureAnimal2TypeCode);
			}

// cat exposure
			Participant2 exposureAnimal3Participant = CDA.createParticipant2();
			exposureAnimal3Participant.setTypeCode(ParticipationType.DIR);
			ParticipantRole exposureAnimal3ParticipantRole = CDA.createParticipantRole();
			exposureAnimal3ParticipantRole.setClassCode(RoleClassRoot.EXPR);
			Entity exposureAnimal3PlayingEntity = CDA.createEntity();
			exposureAnimal3PlayingEntity.setClassCode(EntityClassRoot.ANM);
			exposureAnimal3ParticipantRole.setScopingEntity(exposureAnimal3PlayingEntity);
			exposureAnimal3Participant.setParticipantRole(exposureAnimal3ParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureAnimal3Participant);

			if (exposureAnimal3TypeCode != null) {
				exposureAnimal3PlayingEntity.setCode(exposureAnimal3TypeCode);
			}

			socialHistorySection.addAct(locationAndTypeAct);
			((Entry) locationAndTypeAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			hasSocialHistory = true;
		}
		
		// HIV status observation (SHOULD) 0..*
		// Value Set 2.16.840.1.114222.4.11.3232
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=9DE75E17-176B-DE11-9B52-0015173D1785
		
		boolean hasHIVStatus = true;
		
		String hivStatusSectionText = "Patient HIV negative";
		
		IVL_TS hivStatusEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		CD hivStatusCode = Datatypes.createCD("165815009", SNOMED_OID, SNOMED_SYSTEM_NAME, "HIV negative");
		
		if (hasHIVStatus) {
		
			HIVStatusObservation hivStatusObservation = SALM.createHIVStatusObservation().init();
			socialHistorySection.addObservation(hivStatusObservation);
			((Entry) hivStatusObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			hivStatusObservation.setEffectiveTime(hivStatusEffectiveTime);
			hivStatusObservation.getValues().add(hivStatusCode);
			
			hasSocialHistory = true;
		}
		
		
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Salmonellosis Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Race observation
			items.add(raceCodeSectionText1);
			
			// Salmonellosis possible exposure location act
			items.add(exposureLocationSectionText);
			items.add(exposureAnimal1SectionText);
			items.add(exposureAnimal2SectionText);
			items.add(exposureAnimal3SectionText);
			
			// HIV status observation
			items.add(hivStatusSectionText);

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
	 *   Salmonellosis Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Salmonellosis Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(SalmonellosisCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		SalmonellosisPHCRClinicalInformationSection clinicalInformationSection = SALM.createSalmonellosisPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Salmonellosis Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("57322006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Active Salmonellosis");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_REPORT);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - " + reportableCode.getDisplayName();
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Kosasa Thomas, MD";
		
		SalmonellosisCaseObservation caseObservation = SALM.createSalmonellosisCaseObservation().init();
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
		authorAddress.addStreetAddressLine("128 Lehua Street");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL("tel:+808-621-8411");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Thomas");
		authorName.addGiven("Kosasa");
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
		informantName.addFamily("Thomas");
		informantName.addGiven("Kosasa");
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
				
		boolean symptomAbdominalPain = false;
		boolean symptomAsthenia = true;
		boolean symptomAsymptomatic = false;
		boolean symptomBackache = true;
		boolean symptomBloodyDiarrhea = true;
		boolean symptomDiarrhea = true;
		boolean symptomFatigue = true;
		boolean symptomFever = true;
		boolean symptomHeadache = true;
		boolean symptomHighTemperature = false;
		boolean symptomNausea = true;
		boolean symptomOther = false;
		boolean symptomStomachCramps = true;
		boolean symptomVomitting = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Abdominal Pain (21522001 - SNOMEDCT)
		if (symptomAbdominalPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("21522001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Abdominal Pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAbdominalPain);
			items.add("Signs and Symptoms - AbdominalPain " + (symptomAbdominalPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Asthenia (weakness) (13791008 - SNOMEDCT)
		if (symptomAsthenia || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("13791008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asthenia"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAsthenia);
			items.add("Signs and Symptoms - Asthenia " + (symptomAsthenia ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Asymptomatic (84387000 - SNOMEDCT)
		if (symptomAsymptomatic || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asymptomatic"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAsymptomatic);
			items.add("Signs and Symptoms - Asymptomatic " + (symptomAsymptomatic ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Backache (161891005 - SNOMEDCT)
		if (symptomBackache || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("161891005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Backache"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomBackache);
			items.add("Signs and Symptoms - Backache " + (symptomBackache ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Bloody Diarrhea (95545007 - SNOMEDCT)
		if (symptomBloodyDiarrhea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("95545007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Bloody Diarrhea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomBloodyDiarrhea);
			items.add("Signs and Symptoms - BloodyDiarrhea " + (symptomBloodyDiarrhea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Diarrhea (62315008 - SNOMEDCT)
		if (symptomDiarrhea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("62315008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Diarrhea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomDiarrhea);
			items.add("Signs and Symptoms - Diarrhea " + (symptomDiarrhea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
				
		// Signs and Symptom Fatigue (84229001 - SNOMEDCT)
		if (symptomFatigue || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84229001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fatigue"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
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
		
		// Signs and Symptom Headache (25064002 - SNOMEDCT)
		if (symptomHeadache || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("25064002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Headache"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomHeadache);
			items.add("Signs and Symptoms - Headache " + (symptomHeadache ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom High Temperature - Body temperature above reference range   (43724002 - SNOMEDCT)
		if (symptomHighTemperature || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("43724002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Body temperature above reference range  "));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomHighTemperature);
			items.add("Signs and Symptoms - Body temperature above reference range   " + (symptomHighTemperature ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Nausea (422587007 - SNOMEDCT)
		if (symptomNausea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("422587007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nausea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomNausea);
			items.add("Signs and Symptoms -  Nausea " + (symptomNausea ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Other (OTH - SNOMEDCT)
		if (symptomOther || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("OTH", SNOMED_OID, SNOMED_SYSTEM_NAME, "Other"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomOther);
			items.add("Signs and Symptoms - Other " + (symptomOther ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Stomach cramps (51197009 - SNOMEDCT)
		if (symptomStomachCramps || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("51197009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Stomach cramps"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomStomachCramps);
			items.add("Signs and Symptoms - Stomach cramps " + (symptomStomachCramps ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Vomitting (422400008 - SNOMEDCT)
		if (symptomVomitting || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("422400008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Vomitting"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomVomitting);
			items.add("Signs and Symptoms - Vomitting " + (symptomVomitting ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			SalmonellosisSignsAndSymptomsObservation symptomsObservation = SALM.createSalmonellosisSignsAndSymptomsObservation().init();
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
		buffer.append("            " + "            " + "<caption>" + "Salmonellosis Clinical Information Section" + "</caption>");
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
	public static void setEncountersSection(SalmonellosisCaseReport document) throws Exception {
		
		// Encounters Section (optional)
		PhcrEncountersSection encountersSection = PHCR.createPhcrEncountersSection().init();
		document.addSection(encountersSection);
		
		// First Encounter
		II encounter1Id = Datatypes.createII(TEST_ROOT, "WA28932881-1");
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD encounter1Type = Datatypes.createCD("IMP", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Inpatient encounter");
		
		String encounter1SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " at Wahiawa General Hospital, 128 Lehua Street, Seattle, WA (tel:206-367-0150)";
		String encounter1PerformerSectionText = encounter1Type.getDisplayName() + " encounter with Dr. Kosasa Thomas MD";
		
		// Second Encounter
		II encounter2Id = Datatypes.createII(TEST_ROOT, "WA28932881-2");
		List<II> activity2IdList = new ArrayList<II>();
		activity2IdList.add(encounter2Id);
		IVL_TS encounter2EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD encounter2Type = Datatypes.createCD("IMP", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Inpatient encounter");
		
		String encounter2SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " at Wahiawa General Hospital, 128 Lehua Street, Seattle, WA (tel:206-367-0150)";
		String encounter2PerformerSectionText = encounter2Type.getDisplayName() + " encounter with Dr. Kosasa Thomas MD";
		
		
		EncountersActivity encounters1Activity = createEncountersActivity(activity1IdList, encounter1EffectiveTime, encounter1Type);
		encountersSection.addEncounter(encounters1Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		EncountersActivity encounters2Activity = createEncountersActivity(activity2IdList, encounter2EffectiveTime, encounter2Type);
		encountersSection.addEncounter(encounters2Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			

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
	public static void setDxTestsSection(SalmonellosisCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		SalmonellosisPHCRRelevantDxTestsSection dxTestsSection = SALM.createSalmonellosisPHCRRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		// Salmonellosis Result Observation - stoolSerotyping
		List<II> stoolSerotypingIdList = new ArrayList<II>();
		stoolSerotypingIdList.add(Datatypes.createII(NullFlavor.UNK));
		CD stoolSerotypingCode = Datatypes.createCD("34423-4", LOINC_OID, LOINC_SYSTEM_NAME, "S enteritid H Ab Titr Ser");
		IVL_TS stoolSerotypingEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD stoolSerotypingValue = Datatypes.createCD("73525009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Salmonella Enteritidis");
		CE stoolSerotypingSpecimenType = Datatypes.createCE("225105004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Stool");
		CE stoolSerotypingMethodCode = Datatypes.createCE("0278", "2.16.840.1.113883.5.84", "ObservationMethod", "Agar screen");
		
		CV qualifierValue = Datatypes.createCV();
		qualifierValue.setCode("408729009");
		qualifierValue.setCodeSystem(SNOMED_OID);
		qualifierValue.setCodeSystemName(SNOMED_SYSTEM_NAME);
		qualifierValue.setDisplayName("Finding context");

		CD qualifierCode = Datatypes.createCD("260373001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Detected");

		CR stoolSerotypingQualifier = Datatypes.createCR();
		stoolSerotypingQualifier.setName(qualifierValue);
		stoolSerotypingQualifier.setValue(qualifierCode);

		stoolSerotypingValue.getQualifiers().add(stoolSerotypingQualifier);
		
		String stoolSerotypingObservationSectionText1 = stoolSerotypingSpecimenType.getDisplayName() + " collected on " +
		timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + ", " + stoolSerotypingCode.getDisplayName() + " result: Salmonella enteritidis Detected";
		String stoolSerotypingObservationSectionText2 = "Wahiawa General Hospital Laboratory, 128 Lehua Street, Wahiawa, Hawaii 96786  (tel:808-621-8411)";
				
		SalmonellosisResultObservation stoolSerotypingObservation = SALM.createSalmonellosisResultObservation().init();
		dxTestsSection.addObservation(stoolSerotypingObservation);
		((Entry) stoolSerotypingObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < stoolSerotypingIdList.size(); i++) {
			stoolSerotypingObservation.getIds().add(stoolSerotypingIdList.get(i));
		}
		if (stoolSerotypingCode != null) stoolSerotypingObservation.setCode(stoolSerotypingCode);
		if (stoolSerotypingEffectiveTime != null) stoolSerotypingObservation.setEffectiveTime(stoolSerotypingEffectiveTime);
		if (stoolSerotypingValue != null) stoolSerotypingObservation.getValues().add(stoolSerotypingValue);
		if (stoolSerotypingMethodCode != null) stoolSerotypingObservation.getMethodCodes().add(stoolSerotypingMethodCode);
		
		II stoolSerotypingInformantId = Datatypes.createII(NullFlavor.UNK);
		
		ON stoolSerotypingOrganizationName = Datatypes.createON();
		stoolSerotypingOrganizationName.addText("Wahiawa General Hospital Laboratory");
		
		AD stoolSerotypingOrganizationAddress = Datatypes.createAD();
		stoolSerotypingOrganizationAddress.addStreetAddressLine("128 Lehua Street");
		stoolSerotypingOrganizationAddress.addCity(TEST_CITY);
		stoolSerotypingOrganizationAddress.addState(TEST_STATE);
		stoolSerotypingOrganizationAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL stoolSerotypingOrganizationTelecom = Datatypes.createTEL("tel:+1-206-367-0150");
		
		Informant12 stoolSerotypingInformant = CDA.createInformant12();
		AssignedEntity stoolSerotypingInformantEntity = CDA.createAssignedEntity();
		Organization stoolSerotypingOrganization = CDA.createOrganization();
		stoolSerotypingInformantEntity.getIds().add(stoolSerotypingInformantId);
		stoolSerotypingInformantEntity.getAddrs().add(stoolSerotypingOrganizationAddress);
		stoolSerotypingInformantEntity.getTelecoms().add(stoolSerotypingOrganizationTelecom);
		stoolSerotypingOrganization.getNames().add(stoolSerotypingOrganizationName);
		stoolSerotypingInformantEntity.getRepresentedOrganizations().add(stoolSerotypingOrganization);
		stoolSerotypingInformant.setAssignedEntity(stoolSerotypingInformantEntity);
		stoolSerotypingObservation.getInformants().add(stoolSerotypingInformant);
		
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Salmonellosis Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// stool Serotyping
		items.add(stoolSerotypingObservationSectionText1);
		items.add(stoolSerotypingObservationSectionText2);
		
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
		performerAddress.addStreetAddressLine("128 Lehua Street");
		performerAddress.addCity(TEST_CITY);
		performerAddress.addState(TEST_STATE);
		performerAddress.addPostalCode(TEST_POSTALCODE);
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+1-808-621-8411"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Thomas");
		performerPN.addGiven("Kososa");
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
		participantAddress.addStreetAddressLine("128 Lehua Street");
		participantAddress.addCity(TEST_CITY);
		participantAddress.addState(TEST_STATE);
		participantAddress.addPostalCode(TEST_POSTALCODE);
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-808-621-8411"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("Wahiawa General Hospital");
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
