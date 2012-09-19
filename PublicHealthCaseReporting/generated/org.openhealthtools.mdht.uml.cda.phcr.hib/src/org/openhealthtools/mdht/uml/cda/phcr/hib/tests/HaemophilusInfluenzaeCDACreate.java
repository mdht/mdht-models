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
package org.openhealthtools.mdht.uml.cda.phcr.hib.tests;

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
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
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
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

public class HaemophilusInfluenzaeCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static HibFactory HIB = HibFactory.eINSTANCE;
	
	public static String TIME_STAMP = "20120313110000-0500";
	public static String BIRTH_TIME_STAMP = "20111110702500-0500";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-440-997-2262";
	public static String TEST_CITY = "Ashtabula";
	public static String TEST_STATE = "OH";
	public static String TEST_POSTALCODE = "44004";	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		HIBCaseReport document = HIB.createHIBCaseReport().init();
		
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
			System.out.println("Haemophilus influenzae case report is valid");
		} else {
			System.out.println("Haemophilus influenzae case report is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "HaemophilusInfluenzaeReport.xml");
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
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Doe");
		patientName.addGiven("John");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(BIRTH_TIME_STAMP);
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("CAN");
		
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
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		
		TEL reporterTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Brown");
		reporterName.addGiven("Mike");
		
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
		custodianOrgName.addText("Ashtabula County Medical Center");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL(TEST_TELECOM);
		
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
		personName.addFamily("Brown");
		personName.addGiven("Mike");
		
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
			buffer.append("            " + "            " + "<caption>" + "Haemophilus Influenzae PHCR Social History Section" + "</caption>");
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
		HibPhcrClinicalInformationSection clinicalInformationSection = HIB.createHibPhcrClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
//		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > PHCR Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("44470000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Haemophilus influenzae");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Haemophilus influenzae";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Mike Brown";
		
		HibCaseObservation caseObservation = HIB.createHibCaseObservation().init();
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
		authorName.addFamily("Brown");
		authorName.addGiven("Mike");
		
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
		informantName.addFamily("Doe");
		informantName.addGiven("Ely");
		
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

		// Case Observation > Signs and Symptoms (SHOULD) 0..* - if exists, must have a value (CD signSymptom)
		
		// patient is lethargy (negation indicator = false)
		CD signsSymptoms1Code = Datatypes.createCD("214264003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Lethargy");
		IVL_TS signsSymptoms1Time = Datatypes.createIVL_TS(TIME_STAMP);
		boolean signsSymptoms1Negation = false;
		String signsAndSymptomsSectionText1 = "Signs and Symptoms - Lethargy";
		
		// patient has fever (negation indicator = false)
		CD signsSymptoms2Code = Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever");
		IVL_TS signsSymptoms2Time = Datatypes.createIVL_TS(TIME_STAMP);
		boolean signsSymptoms2Negation = false;
		String signsAndSymptomsSectionText2 = "Signs and Symptoms - Fever";
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		signsSymptomsCD.add(signsSymptoms1Code);
		signsSymptomsTS.add(signsSymptoms1Time);
		signsSymptomsNegInd.add(signsSymptoms1Negation);
		
		signsSymptomsCD.add(signsSymptoms2Code);
		signsSymptomsTS.add(signsSymptoms2Time);
		signsSymptomsNegInd.add(signsSymptoms2Negation);
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			SignsAndSymptomsObservation symptomsObservation = PHCR.createSignsAndSymptomsObservation().init();
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
		
		String patientConditionSectionText = "Patient alive " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);

			PatientConditionAliveObservation aliveObservation = PHCR.createPatientConditionAliveObservation().init();
			CD aliveValueCode = Datatypes.createCD("438949009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Alive");
			aliveObservation.getValues().add(aliveValueCode);
			clinicalInformationSection.addObservation(aliveObservation);
			((Entry) aliveObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (patientConditionTS != null) {
				aliveObservation.setEffectiveTime(patientConditionTS);
			}
			

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Haemophilus Influenzae PHCR Clinical Information Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// case observation
		items.add(caseObservationReportableSectionText);
		items.add(caseObservationDateOfDiagnosisSectionText);
		
		// case observation > author
		items.add(caseObservationDiagnosingClinicianSectionText);
		
		// case observation > ccd problem status observation
		items.add(problemStatusSectionText);
		
		// case observation > signs and symptoms
		items.add(signsAndSymptomsSectionText1);
		items.add(signsAndSymptomsSectionText2);
		
		// patient condition alive / deceased (deceased cause)
		items.add(patientConditionSectionText);

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
		CD caseCode = Datatypes.createCD("44470000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Haemophilus influenzae");
		
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
			
			CS subsAdminStatus = Datatypes.createCS("completed");
			IVL_TS subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue(TIME_STAMP);
			subsAdminTime.setHigh(timeHigh);
			CE routeCode = Datatypes.createCE("C42945", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Injectable solution");
			IVL_PQ rate = Datatypes.createIVL_PQ();
			rate.setUnit("H");
			rate.setValue(Double.parseDouble("24"));
			IVL_PQ dose = Datatypes.createIVL_PQ();
			dose.setValue(BigDecimal.ONE);
			CE materialCode = Datatypes.createCE("105174", "2.16.840.1.113883.6.88", "RxNorm", "Cefotaxime 200 MG/ML");
			EN materialName = Datatypes.createEN();
			
			String treatmentGivenSectionText1 = materialCode.getDisplayName() + " given.";
				
			if (!negationInd) {
				TreatmentGivenSubstanceAdministration treatmentGivenSBADM = PHCR.createTreatmentGivenSubstanceAdministration().init();
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
				TreatmentNotGivenSubstanceAdministration treatmentNotGivenSBADM = PHCR.createTreatmentNotGivenSubstanceAdministration().init();
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
			buffer.append("            " + "            " + "<caption>" + "Haemophilus Influenzae PHCR Treatment Information Section" + "</caption>");
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
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		CD encounterType = Datatypes.createCD("ANB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounterDateSectionText = "Encounter Date " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String encounterTypeSectionText = "Encounter Type " + encounterType.getDisplayName();
		
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
			performerAddress.addStreetAddressLine("2420 Lake Avenue");
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("Brown");
			performerPN.addGiven("Mike");
			namePerformerList.add(performerPN);
			
			String encounterPerformerSectionText = "Encounter with Dr. Mike Brown";

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
			participantAddress.addStreetAddressLine("2420 Lake Avenue");
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addText("Ashtabula County Medical Center");
			nameParticipantList.add(participantPN);
			
			String encounterParticipantSectionText = "Encounter source location - Ashtabula County Medical Center" + TEST_CITY + ", " + TEST_STATE + ", " + TEST_TELECOM ;

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
			buffer.append("            " + "            " + "<caption>" + "Haemophilus Influenzae PHCR Encounters Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// encounter date
			items.add(encounterDateSectionText);
			
			// encounter type
			items.add(encounterTypeSectionText);
			
			// encounter participant
			items.add(encounterParticipantSectionText);
			
			// encounter performer
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
		HibPhcrRelevantDxTestsSection dxTestsSection = HIB.createHibPhcrRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);		
		
		// Result Observation (optional - but must have one result) - if exists, must have (II observationId), (CD observationCode), (ANY value)
		List<II> observationIdList = new ArrayList<II>();
		observationIdList.add(Datatypes.createII(TEST_ROOT, "7839"));
		CD observationCode = Datatypes.createCD("14321-4", "2.16.840.1.113883.6.1", "LOINC", "Haem influ B Ag CSF Q1 LA");
		IVL_TS observationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		ANY value = Datatypes.createCD("10828004", "2.16.840.1.113883.6.96", "SNOMED-CT", "Positive");
		CE observationSpecimenType = Datatypes.createCE("258450006", "2.16.840.1.113883.6.96", "SNOMED-CT", "Spinal Fluid Specimen");
		
		String labObservationSectionText = observationCode.getDisplayName() + " for " + observationSpecimenType.getDisplayName() + " result: Positive";

		HibResultObservation observation = HIB.createHibResultObservation().init();
		dxTestsSection.addObservation(observation);
		((Entry) observation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < observationIdList.size(); i++) {
			observation.getIds().add(observationIdList.get(i));
		}
		if (observationCode != null) observation.setCode(observationCode);
		if (observationEffectiveTime != null) observation.setEffectiveTime(observationEffectiveTime);
		if (value != null) observation.getValues().add(value);
		
		if (observationSpecimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			observation.getSpecimens().add(specimen);
			playingEntity.setCode(observationSpecimenType);
		}
		
		// Result Observation Informant
		II labObservationInformantId = Datatypes.createII(TEST_ROOT, "27364276");
		
		ON labObservationOrganizationName = Datatypes.createON();
		labObservationOrganizationName.addText("Reference Laboratory");		
		
		Informant12 labObservationInformant = CDA.createInformant12();
		AssignedEntity labObservationInformantEntity = CDA.createAssignedEntity();
		Organization labObservationOrganization = CDA.createOrganization();
		labObservationInformantEntity.getIds().add(labObservationInformantId);
		labObservationOrganization.getNames().add(labObservationOrganizationName);
		labObservationInformantEntity.getRepresentedOrganizations().add(labObservationOrganization);
		labObservationInformant.setAssignedEntity(labObservationInformantEntity);
		observation.getInformants().add(labObservationInformant);
				
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Haemophilus Influenzae PHCR Relevant Diagnostic Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab observation
		items.add(labObservationSectionText);
		
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
