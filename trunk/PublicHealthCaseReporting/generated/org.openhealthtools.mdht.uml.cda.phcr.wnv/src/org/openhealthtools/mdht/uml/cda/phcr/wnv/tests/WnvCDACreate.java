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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;

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
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
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

public class WnvCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static WnvFactory WNV = WnvFactory.eINSTANCE;
	
	public static String TIME_STAMP = "19990823150000-0400";
	public static String SYMPTOM_TIME_STAMP1 = "19990820150000-0400";
	public static String SYMPTOM_TIME_STAMP2 = "19990822150000-0400";
	public static String SYMPTOM_TIME_STAMP3 = "19990823150000-0400";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-718-206-6919";
	public static String TEST_STREET = "8900 Van Nyck Expy";
	public static String TEST_CITY = "Jamaica Fields";
	public static String TEST_STATE = "NY";
	public static String TEST_POSTALCODE = "11571";	
	public static String SPECIMEN_TIME_STAMP = "19990823190000-0400";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	public static String LAB_NAME = "City Hospital Laboratory";
	public static String LAB_STREET = "8908 Van Nyck Expy";
	public static String LAB_CITY = "Jamaica Fields";
	public static String LAB_STATE = "NY";
	public static String LAB_POSTALCODE = "11571";
	public static String LAB_TELECOM = "718-206-5678";
	
	
	public static String PAT_BIRTH_TIME_STAMP = "19200101101500-0500";
	public static String PAT_TEST_TELECOM = "tel:+1-718-456-1234";
	public static String PAT_TEST_STREET = "678 Yankee Street";
	public static String PAT_TEST_CITY = "Queens";
	public static String PAT_TEST_STATE = "NY";
	public static String PAT_TEST_POSTALCODE = "11451";	
	public static String TS_PAT_VISIT = "19990823022500-0400";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		WestNileVirusCaseReport document = WNV.createWestNileVirusCaseReport().init();	
		
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
			System.out.println("West nile virus document is valid");
		} else {
			System.out.println("West nile virus document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "SampleWNV.xml");
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


		TS documentEffectiveTime = Datatypes.createTS(TIME_STAMP);
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
		patientAddress.addStreetAddressLine(PAT_TEST_STREET);
		patientAddress.addCity(PAT_TEST_CITY);
		patientAddress.addState(PAT_TEST_STATE);
		patientAddress.addPostalCode(PAT_TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL(PAT_TEST_TELECOM);
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("JONES");
		patientName.addGiven("ROBERT");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(PAT_BIRTH_TIME_STAMP);
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
		
		TS reporterEffectiveTime = Datatypes.createTS(TIME_STAMP);
		
		II reporterId = Datatypes.createII(TEST_ROOT, "999");
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine(TEST_STREET);
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		
		TEL reporterTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("WINDEL");
		reporterName.addGiven("ALBERT");
		reporterName.addPrefix("DR");
		
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
		custodianOrgName.addText("New York City Department of Health");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-212-123-1234");
		
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
		personName.addFamily("WINDEL");
		personName.addGiven("ALBERT");
		
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
	//TODO Sarah: please remove all social history observations except race.
	
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		PhcrSocialHistorySection socialHistorySection = PHCR.createPhcrSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2106-3", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "White");
		
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
				
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Race observation
			items.add(raceCodeSectionText1);
			
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
		WnvPhcrClinicalInformationSection clinicalInformationSection = WNV.createWnvPhcrClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > PHCR Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("397420007", SNOMED_OID, SNOMED_SYSTEM_NAME, "West Nile Virus nonneuroinvasive disease");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - West Nile Virus nonneuroinvasive disease";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Albert Windel";
		
		WnvCaseObservation caseObservation = WNV.createWnvCaseObservation().init();
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
		authorName.addFamily("WINDEL");
		authorName.addGiven("ALBERT");
		authorName.addPrefix("DR");
		
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
		informantName.addFamily("WINDEL");
		informantName.addGiven("ALBERT");
		informantName.addPrefix("DR");
		
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
		
		boolean symptomFever = true;
		boolean symptomEncephalitis = true;
		boolean symptomWeakness = true;
		boolean symptomDisoriented = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM_TIME_STAMP1));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(SYMPTOM_TIME_STAMP1, TEST_DATE_FORMAT)  : "not reported"));
		}

		// Signs and Symptom Weakness (127378008  - SNOMEDCT)
		if (symptomWeakness || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("127378008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Paresis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM_TIME_STAMP2));
			signsSymptomsNegInd.add(!symptomWeakness);
			items.add("Signs and Symptoms - Paresis " + (symptomWeakness ? "REPORTED starting on " + timeStampFormat(SYMPTOM_TIME_STAMP2, TEST_DATE_FORMAT) : "not reported"));
		}
				
		// Signs and Symptom Encephalitis (45170000 - SNOMEDCT)
		if (symptomEncephalitis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("45170000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Encephalitis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM_TIME_STAMP3));
			signsSymptomsNegInd.add(!symptomEncephalitis);
			items.add("Signs and Symptoms - Encephalitis " + (symptomEncephalitis ? "REPORTED starting on " + timeStampFormat(SYMPTOM_TIME_STAMP3, TEST_DATE_FORMAT)  : "not reported"));
		}

		// Signs and Symptom Disoriented (62476001  - SNOMEDCT)
		if (symptomDisoriented || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("62476001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Disoriented"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(SYMPTOM_TIME_STAMP3));
			signsSymptomsNegInd.add(!symptomDisoriented);
			items.add("Signs and Symptoms - Disorientation " + (symptomDisoriented ? "REPORTED starting on " + timeStampFormat(SYMPTOM_TIME_STAMP3, TEST_DATE_FORMAT) : "not reported"));
		}
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			WnvSignsAndSymptomsObservation symptomsObservation = WNV.createWnvSignsAndSymptomsObservation().init();
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
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP);
		String patientConditionSectionText = "Patient is alive " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
			
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
		buffer.append("            " + "            " + "<caption>" + "West Nile Virus Clinical Information Section" + "</caption>");
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
		PhcrTreatmentInformationSection treatmentInformationSection = PHCR.createPhcrTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "9999");
		CD caseCode = Datatypes.createCD("397420007", SNOMED_OID, SNOMED_SYSTEM_NAME, "West Nile Virus nonneuroinvasive disease");
		
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
			
			TherapeuticRegimenAct regimenAct = PHCR.createTherapeuticRegimenAct().init();
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
			
			//1044196|313819|SBD|Ampicillin 250 MG/ML Injectable Solution [Polyflex] 25 mg/kg IV EVERY 6 HOURS
			//105212|204871|SBD|Ceftriaxone 350 MG/ML Injectable Solution [Rocephin] 2 g EVERY 12 HOURS
			
			//treatment1 - ampicilin
			CS ampicillinSubsAdminStatus = Datatypes.createCS("completed");
			IVL_TS ampicillinSubsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS ampicillinTimeLow = Datatypes.createIVXB_TS();
			ampicillinTimeLow.setValue(TIME_STAMP);
			ampicillinSubsAdminTime.setLow(ampicillinTimeLow);
			CE ampicillinRouteCode = Datatypes.createCE("C38276", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "INTRAVENOUS");
			IVL_PQ ampicillinRate = Datatypes.createIVL_PQ();
			ampicillinRate.setUnit("H");
			ampicillinRate.setValue(Double.parseDouble("6"));
			IVL_PQ ampicillinDose = Datatypes.createIVL_PQ();
			ampicillinDose.setValue(BigDecimal.ONE);
			CE ampicillinMaterialCode = Datatypes.createCE("1044196", "2.16.840.1.113883.6.88", "RxNorm", "Ampicillin 250 MG/ML Injectable Solution");
			EN ampicillinMaterialName = Datatypes.createEN();
			ampicillinMaterialName.addText("Polyflex");
			
			String ampicillinTreatmentGivenSectionText1 = "Prescribed " + ampicillinMaterialCode.getDisplayName() + " every 6 hours.";
				
			TreatmentGivenSubstanceAdministration treatmentGivenSBADM = PHCR.createTreatmentGivenSubstanceAdministration().init();
			treatmentGivenSBADM.setNegationInd(negationInd);

			Consumable consumable = CDA.createConsumable();
			ManufacturedProduct product = CDA.createManufacturedProduct();
			Material material = CDA.createMaterial();
			product.setManufacturedMaterial(material);
			consumable.setManufacturedProduct(product);
			treatmentGivenSBADM.setConsumable(consumable);

			if (ampicillinSubsAdminStatus != null) treatmentGivenSBADM.setStatusCode(ampicillinSubsAdminStatus);
			if (ampicillinSubsAdminTime != null) treatmentGivenSBADM.getEffectiveTimes().add(ampicillinSubsAdminTime);
			if (ampicillinRouteCode != null) treatmentGivenSBADM.setRouteCode(ampicillinRouteCode);
			if (ampicillinRate != null) treatmentGivenSBADM.setRateQuantity(ampicillinRate);
			if (ampicillinDose != null) treatmentGivenSBADM.setDoseQuantity(ampicillinDose);
			if (ampicillinMaterialCode != null) material.setCode(ampicillinMaterialCode);
			if (ampicillinMaterialName != null) material.setName(ampicillinMaterialName);

			regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
			((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						
			//treatment2 - Cetriaxone
			CS ceftriaxoneSubsAdminStatus = Datatypes.createCS("completed");
			IVL_TS ceftriaxoneSubsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS ceftriaxoneTimeLow = Datatypes.createIVXB_TS();
			ceftriaxoneTimeLow.setValue(TIME_STAMP);
			ceftriaxoneSubsAdminTime.setLow(ceftriaxoneTimeLow);
			CE ceftriaxoneRouteCode = Datatypes.createCE("C38276", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "INTRAVENOUS");
			IVL_PQ ceftriaxoneRate = Datatypes.createIVL_PQ();
			ceftriaxoneRate.setUnit("H");
			ceftriaxoneRate.setValue(Double.parseDouble("12"));
			IVL_PQ ceftriaxoneDose = Datatypes.createIVL_PQ();
			ceftriaxoneDose.setValue(BigDecimal.valueOf(Double.valueOf("2")));
			CE ceftriaxoneMaterialCode = Datatypes.createCE("105212|204871", "2.16.840.1.113883.6.88", "RxNorm", "Ceftriaxone 350 MG/ML Injectable Solution");
			EN ceftriaxoneMaterialName = Datatypes.createEN();
			ceftriaxoneMaterialName.addText("Rocephin");

			String ceftriaxoneTreatmentGivenSectionText1 = "Prescribed " + ceftriaxoneMaterialCode.getDisplayName() + " every 12 hours.";

			TreatmentGivenSubstanceAdministration treatment2GivenSBADM = PHCR.createTreatmentGivenSubstanceAdministration().init();
			treatment2GivenSBADM.setNegationInd(negationInd);

			Consumable consumable2 = CDA.createConsumable();
			ManufacturedProduct product2 = CDA.createManufacturedProduct();
			Material material2 = CDA.createMaterial();
			product2.setManufacturedMaterial(material2);
			consumable2.setManufacturedProduct(product2);
			treatment2GivenSBADM.setConsumable(consumable2);

			if (ceftriaxoneSubsAdminStatus != null) treatment2GivenSBADM.setStatusCode(ceftriaxoneSubsAdminStatus);
			if (ceftriaxoneSubsAdminTime != null) treatment2GivenSBADM.getEffectiveTimes().add(ceftriaxoneSubsAdminTime);
			if (ceftriaxoneRouteCode != null) treatment2GivenSBADM.setRouteCode(ceftriaxoneRouteCode);
			if (ceftriaxoneRate != null) treatment2GivenSBADM.setRateQuantity(ceftriaxoneRate);
			if (ceftriaxoneDose != null) treatment2GivenSBADM.setDoseQuantity(ceftriaxoneDose);
			if (ceftriaxoneMaterialCode != null) material2.setCode(ceftriaxoneMaterialCode);
			if (ceftriaxoneMaterialName != null) material2.setName(ceftriaxoneMaterialName);

			regimenAct.addSubstanceAdministration(treatment2GivenSBADM);
			((EntryRelationship) treatment2GivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);

				
				// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Treatment Information Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// therapy condition id
			items.add(conditionIdSectionText);
			
			// treatments given - ampicillin
			items.add(ampicillinTreatmentGivenSectionText1);
			
			// treatments given - ceftriaxone
			items.add(ceftriaxoneTreatmentGivenSectionText1);

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
		II encounterId = Datatypes.createII(TEST_ROOT, "111");
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		CD encounterType = Datatypes.createCD("IMP", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Inpatient");
		
		String encounterSectionText = timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT) + " at City Hospital, 8908 Van Nyck Expy, Jamacia Fields, NY 11571  (tel:718-206-5678)";
		String encounterPerformerSectionText = encounterType.getDisplayName() + " encounter with Dr. Albert Windel MD";

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
		
			// Encounter Performer (optional - but must have one source) - if exists, must have ii (id)
			List<II> idPerformerList = new ArrayList<II>();
			idPerformerList.add(Datatypes.createII(TEST_ROOT, "123"));
			List<AD> adPerformerList = new ArrayList<AD>();
			AD performerAddress = Datatypes.createAD();
			performerAddress.addStreetAddressLine("8908 Van Nyck Expy");
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			performerAddress.addPostalCode(TEST_POSTALCODE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("WINDEL");
			performerPN.addGiven("ALBERT");
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
			participantAddress.addStreetAddressLine("8908 Van Nyck Expy");
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			participantAddress.addPostalCode(TEST_POSTALCODE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addFamily("WINDEL");
			participantPN.addGiven("ALBERT");
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
			buffer.append("            " + "            " + "<caption>" + "Encounters Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// encounter date
			items.add(encounterSectionText);
			items.add(encounterPerformerSectionText);

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
		WnvPhcrRelevantDxTestsSection dxTestsSection = WNV.createWnvPhcrRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		
		// wnvIgGAntibody Result Observation
		List<II> wnvIgGAntibodyIdList = new ArrayList<II>();
		wnvIgGAntibodyIdList.add(Datatypes.createII(NullFlavor.NI));
		CD wnvIgGAntibodyCode = Datatypes.createCD("29537-8", LOINC_OID, LOINC_SYSTEM_NAME, "West Nile Virus IgG Antibody");
		IVL_TS wnvIgGAntibodyEffectiveTime = Datatypes.createIVL_TS(SPECIMEN_TIME_STAMP);
		CS wnvIgGAntibodyStatus = Datatypes.createCS("completed");
		CE wnvIgGAntibodySpecimenType = Datatypes.createCE("65216001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Spinal Fluid");
		ANY wnvIgGAntibodyValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String wnvIgGAntibodyLabObservationSectionText1 = wnvIgGAntibodySpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(SPECIMEN_TIME_STAMP, TEST_DATE_FORMAT) + ", " + wnvIgGAntibodyCode.getDisplayName() + " result: positive";
		String wnvIgGAntibodyLabObservationSectionText2 = "City Hospital Laboratory, 8908 Van Nyck Expy, Jamacia Fields, NY 11571  (tel:718-206-5678)";

		ResultObservation wnvIgGAntibodyObservation = CCD.createResultObservation().init();
		dxTestsSection.addObservation(wnvIgGAntibodyObservation);
		((Entry) wnvIgGAntibodyObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < wnvIgGAntibodyIdList.size(); i++) {
			wnvIgGAntibodyObservation.getIds().add(wnvIgGAntibodyIdList.get(i));
		}
		if (wnvIgGAntibodyCode != null) wnvIgGAntibodyObservation.setCode(wnvIgGAntibodyCode);
		if (wnvIgGAntibodyEffectiveTime != null) wnvIgGAntibodyObservation.setEffectiveTime(wnvIgGAntibodyEffectiveTime);
		if (wnvIgGAntibodyStatus != null) wnvIgGAntibodyObservation.setStatusCode(wnvIgGAntibodyStatus);
		if (wnvIgGAntibodyValue != null) wnvIgGAntibodyObservation.getValues().add(wnvIgGAntibodyValue);
		
		// Result Observation Informant (required)
		II wnvIgGAntibodyInformantId = Datatypes.createII(NullFlavor.UNK);
		
		ON wnvIgGAntibodyOrganizationName = Datatypes.createON();
		wnvIgGAntibodyOrganizationName.addText(LAB_NAME);
		
		AD wnvIgGAntibodyOrganizationAddress = Datatypes.createAD();
		wnvIgGAntibodyOrganizationAddress.addStreetAddressLine(LAB_STREET);
		wnvIgGAntibodyOrganizationAddress.addCity(LAB_CITY);
		wnvIgGAntibodyOrganizationAddress.addState(LAB_STATE);
		wnvIgGAntibodyOrganizationAddress.addPostalCode(LAB_POSTALCODE);
		
		TEL wnvIgGAntibodyOrganizationTelecom = Datatypes.createTEL(LAB_TELECOM);
		
		Informant12 wnvIgGAntibodyInformant = CDA.createInformant12();
		AssignedEntity wnvIgGAntibodyInformantEntity = CDA.createAssignedEntity();
		Organization wnvIgGAntibodyOrganization = CDA.createOrganization();
		wnvIgGAntibodyInformantEntity.getIds().add(wnvIgGAntibodyInformantId);
		wnvIgGAntibodyInformantEntity.getAddrs().add(wnvIgGAntibodyOrganizationAddress);
		wnvIgGAntibodyInformantEntity.getTelecoms().add(wnvIgGAntibodyOrganizationTelecom);
		wnvIgGAntibodyOrganization.getNames().add(wnvIgGAntibodyOrganizationName);
		wnvIgGAntibodyInformantEntity.getRepresentedOrganizations().add(wnvIgGAntibodyOrganization);
		wnvIgGAntibodyInformant.setAssignedEntity(wnvIgGAntibodyInformantEntity);
		wnvIgGAntibodyObservation.getInformants().add(wnvIgGAntibodyInformant);

		// Result Observation - CSF Leukocyte Count
		List<II> wrightStainIdList = new ArrayList<II>();
		wrightStainIdList.add(Datatypes.createII(NullFlavor.NI));
		CD wrightStainCode = Datatypes.createCD("10328-3", LOINC_OID, LOINC_SYSTEM_NAME, "Lymphocytes/100 leukocytes in Cerebral spinal fluid by Manual count");
		IVL_TS wrightStainEffectiveTime = Datatypes.createIVL_TS(SPECIMEN_TIME_STAMP);
		CS wrightStainStatus = Datatypes.createCS("completed");
		IVL_PQ wrightStainValue = Datatypes.createIVL_PQ();
		wrightStainValue.setValue(BigDecimal.valueOf(Double.parseDouble("56")));
		CE wrightStainSpecimenType = Datatypes.createCE("65216001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Spinal Fluid");
		
		String wrightStainLabObservationSectionText1 = wrightStainSpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(SPECIMEN_TIME_STAMP, TEST_DATE_FORMAT) + ", " + wrightStainCode.getDisplayName() + " result: 56";
		String wrightStainLabObservationSectionText2 = "City Hospital Laboratory, 8908 Van Nyck Expy, Jamacia Fields, NY 11571  (tel:718-206-5678)";

		ResultObservation wrightStainObservation = CCD.createResultObservation().init();
		dxTestsSection.addObservation(wrightStainObservation);
		((Entry) wrightStainObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < wrightStainIdList.size(); i++) {
			wrightStainObservation.getIds().add(wrightStainIdList.get(i));
		}
		if (wrightStainCode != null) wrightStainObservation.setCode(wrightStainCode);
		if (wrightStainEffectiveTime != null) wrightStainObservation.setEffectiveTime(wrightStainEffectiveTime);
		if (wrightStainStatus != null) wrightStainObservation.setStatusCode(wrightStainStatus);
		if (wrightStainValue != null) wrightStainObservation.getValues().add(wrightStainValue);
		
		// Result Observation Informant (required)
		II wrightStainInformantId = Datatypes.createII(NullFlavor.UNK);
		
		ON wrightStainOrganizationName = Datatypes.createON();
		wrightStainOrganizationName.addText(LAB_NAME);
		
		AD wrightStainOrganizationAddress = Datatypes.createAD();
		wrightStainOrganizationAddress.addStreetAddressLine(LAB_STREET);
		wrightStainOrganizationAddress.addCity(LAB_CITY);
		wrightStainOrganizationAddress.addState(LAB_STATE);
		wrightStainOrganizationAddress.addPostalCode(LAB_POSTALCODE);
		
		TEL wrightStainOrganizationTelecom = Datatypes.createTEL(LAB_TELECOM);
		
		Informant12 wrightStainInformant = CDA.createInformant12();
		AssignedEntity wrightStainInformantEntity = CDA.createAssignedEntity();
		Organization wrightStainOrganization = CDA.createOrganization();
		wrightStainInformantEntity.getIds().add(wrightStainInformantId);
		wrightStainInformantEntity.getAddrs().add(wrightStainOrganizationAddress);
		wrightStainInformantEntity.getTelecoms().add(wrightStainOrganizationTelecom);
		wrightStainOrganization.getNames().add(wrightStainOrganizationName);
		wrightStainInformantEntity.getRepresentedOrganizations().add(wrightStainOrganization);
		wrightStainInformant.setAssignedEntity(wrightStainInformantEntity);
		wrightStainObservation.getInformants().add(wrightStainInformant);
	
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "West Nile Virus Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();

		// WNV IgG Antibody
		items.add(wnvIgGAntibodyLabObservationSectionText1);
		items.add(wnvIgGAntibodyLabObservationSectionText2);
		
		// Wright Stain
		items.add(wrightStainLabObservationSectionText1);
		items.add(wrightStainLabObservationSectionText2);

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
