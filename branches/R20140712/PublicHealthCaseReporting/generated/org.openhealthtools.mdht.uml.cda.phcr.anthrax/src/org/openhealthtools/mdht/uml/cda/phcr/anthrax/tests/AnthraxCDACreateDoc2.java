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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;

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
import org.openhealthtools.mdht.uml.cda.ParentDocument;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.RelatedDocument;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentGivenSubstanceAdministration;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
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
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class AnthraxCDACreateDoc2 {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static AnthraxFactory ANTHRAX = AnthraxFactory.eINSTANCE;
	
	public static String OCC1_TIME_STAMP = "19920101000000-0500";
	public static String OCC2_TIME_STAMP = "20020101000000-0500";
	public static String PAT_BIRTH_TIME_STAMP = "19720101000000+0200";
	public static String TS_EXPOSURE = "20070722150000-0400";
	public static String TS_PAT_VISIT = "20070828090000-0400";
	public static String TIME_STAMP = "20070830100000-0400";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-203-536-8789";
	public static String TEST_STREET = "24 Hospital Avenue";
	public static String TEST_CITY = "Danbury";
	public static String TEST_STATE = "CT";
	public static String TEST_POSTALCODE = "06810";	
	public static String PAT_TEST_TELECOM = "tel:+1-203-234-0965";
	public static String PAT_TEST_STREET = "123 Rythm Road";
	public static String PAT_TEST_CITY = "Wilton";
	public static String PAT_TEST_STATE = "CT";
	public static String PAT_TEST_POSTALCODE = "06811";	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	public static String UUID_RPLC = "998613c8-6d4f-4722-b3ab-d8652daaf726";
	public static int VERSION = 2;
	
	public static void main(String[] args) throws Exception {
		
		AnthraxCaseReport document = ANTHRAX.createAnthraxCaseReport().init();
		
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
			
			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}		
		};
		boolean valid = CDAUtil.validate(document, handler);
		if (valid) {
			System.out.println("PHCR document is valid");
		} else {
			System.out.println("PHCR document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "AnthraxCaseReport2.xml");
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
		INT documentVersion = Datatypes.createINT();
		documentVersion.setValue(VERSION);
		
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
		
		// document version number
		document.setVersionNumber(documentVersion);
		  
		// document RPLC
		II relatedDocumentId = Datatypes.createII(UUID_RPLC);
		
		RelatedDocument relatedDocument = CDA.createRelatedDocument();
		ParentDocument parentDocument = CDA.createParentDocument();
		parentDocument.getIds().add(relatedDocumentId);
		relatedDocument.setTypeCode(x_ActRelationshipDocument.RPLC);
		relatedDocument.setParentDocument(parentDocument);
		document.getRelatedDocuments().add(relatedDocument);
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
		patientName.addFamily("JAMIBE");
		patientName.addGiven("KENSUKI");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(PAT_BIRTH_TIME_STAMP);
		CE patientRace = Datatypes.createCE("2060-2", "2.16.840.1.113883.1.11.14914", "Race Value Set", "African");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("CPV");
		
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
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine(TEST_STREET);
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		
		TEL reporterTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("STRATIDIS");
		reporterName.addGiven("JAY");
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
		
		II custodianOrgId = Datatypes.createII(NullFlavor.UNK);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("HITE-CT");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addCity("Hartford");
		custodianOrgAddress.addState("CT");
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-860-509-8000");
		
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
		
		II verifierId = Datatypes.createII(NullFlavor.UNK);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine(TEST_STREET);
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		
		TEL verifierTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN personName = Datatypes.createPN();
		personName.addFamily("STRATIDIS");
		personName.addGiven("JAY");
		personName.addPrefix("DR");
		
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
	 *   Anthrax possible exposure location and type (MAY) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		AnthraxPhcrSocialHistorySection socialHistorySection = ANTHRAX.createAnthraxPhcrSocialHistorySection().init();
		boolean hasSocialHistory = false;
		int count;
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2060-2", "2.16.840.1.113883.1.11.14914", "Race Value Set", "African");
		CD raceCode2 = Datatypes.createCD("2106-3", "2.16.840.1.113883.1.11.14914", "Race Value Set", "White");
		
		String raceCodeSectionText1 = "Race - African";
		String raceCodeSectionText2 = "Race - White";
		
		List<CD> raceCodes = new ArrayList<CD>();
		raceCodes.add(raceCode1);
		raceCodes.add(raceCode2);
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

		String occupationSectionText1 = "Occupation Musical Instrument Repairs and Tuners:  Musical Instrument Manufacturing Industry";
		String occupationSectionText2 = "Occupation Location - Home Studio, " + PAT_TEST_STREET + PAT_TEST_CITY + " " + PAT_TEST_STATE; 
		String occupationSectionText3 = "Occupation Start Date: " + timeStampFormat(OCC1_TIME_STAMP, TEST_DATE_FORMAT);
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;

			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS();
			IVXB_TS occupationStartTime = Datatypes.createIVXB_TS();
			occupationStartTime.setValue(OCC1_TIME_STAMP);
			occupationEffectiveTime.setLow(occupationStartTime);
			
			CD occupationCode = Datatypes.createCD("49-9063", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Musical Instrument Repairers and Tuners");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addStreetAddressLine(PAT_TEST_STREET);
			locationAddress.addCity(PAT_TEST_CITY);
			locationAddress.addState(PAT_TEST_STATE);
			locationAddress.addPostalCode(PAT_TEST_POSTALCODE);

			TEL locationTelecom = Datatypes.createTEL(PAT_TEST_TELECOM);

			PN locationName = Datatypes.createPN();
			locationName.addText("Home Studio");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS(OCC1_TIME_STAMP);
			CD occupationHistoryCode = Datatypes.createCD("339992", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Musical Instrument Manufacturing");

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
		
		String occupationSectionText4 = "Occupation Chefs and Head Cooks:  Full Service Restaurants Industry";
		String occupationSectionText5 = "Occupation Location - Dave's Fine Dining, Wilton CT";
		String occupationSectionText6 = "Occupation Start Date: " + timeStampFormat(OCC2_TIME_STAMP, TEST_DATE_FORMAT);
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;

			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS();
			IVXB_TS occupationStartTime = Datatypes.createIVXB_TS();
			occupationStartTime.setValue(OCC2_TIME_STAMP);
			occupationEffectiveTime.setLow(occupationStartTime);			
			
			CD occupationCode = Datatypes.createCD("35-1011", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Chefs and Head Cooks");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addCity("Smithfield");
			locationAddress.addState("CT");
			locationAddress.addPostalCode("02681");

			TEL locationTelecom = Datatypes.createTEL();
			locationTelecom.setNullFlavor(NullFlavor.UNK);

			PN locationName = Datatypes.createPN();
			locationName.addText("Dave's Fine Dining");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS(OCC2_TIME_STAMP);
			CD occupationHistoryCode = Datatypes.createCD("7221", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Full Service Restaurants");

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

		// Anthrax Possible Exposure Location and Type Act (MAY) 0..*
		// The location place code has no Value Set specified
		// Animal Value Set 2.16.840.1.114222.4.11.1074
		// https://phinvads.cdc.gov/vads/SearchAllVocab_search.action;jsessionid=K35WPwwTPhFB8v11Zb8wqTGlhvsxDkhp1dnQz1WpZJ5NX8dwGK9J!-1677443257?searchOptions.searchText=2.16.840.1.114222.4.11.1074
		// Material Exposure Type Value Set 2.16.840.1.114222.4.11.3211
		// https://phinvads.cdc.gov/vads/SearchAllVocab_search.action?searchOptions.searchText=2.16.840.1.114222.4.11.3211
		
		boolean hasAnthraxExposure = true;
		String exposureLocationSectionText = "Possible Exposure Location - Home environment, " + PAT_TEST_STREET + PAT_TEST_CITY + " " + PAT_TEST_STATE;
		String exposureAnimalSectionText = "Exposure to Animal - Domestic Goat";
		String exposureMaterialSectionText = "Exposure to Material - Animal Hide";
		
		if (hasAnthraxExposure) {
		
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS(TS_EXPOSURE);
			IVL_TS exposureAnimalTime = Datatypes.createIVL_TS(TS_EXPOSURE);
			IVL_TS exposureMaterialTime = Datatypes.createIVL_TS(TS_EXPOSURE);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addStreetAddressLine(PAT_TEST_STREET);
			exposureLocationAddress.addCity(PAT_TEST_CITY);
			exposureLocationAddress.addState(PAT_TEST_STATE);
			exposureLocationAddress.addPostalCode(PAT_TEST_POSTALCODE);

			TEL exposureLocationTelecom = Datatypes.createTEL(PAT_TEST_TELECOM);

			CE exposureLocationTypeCode = Datatypes.createCE("264362003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Home environment");
			CE exposureAnimalTypeCode = Datatypes.createCE("125097000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Domestic Goat");
			CE exposureMaterialTypeCode = Datatypes.createCE("421332005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Animal hide");

			AnthraxPossibleExpossureLocationAndTypeAct locationAndTypeAct = ANTHRAX.createAnthraxPossibleExpossureLocationAndTypeAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("170475009", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Anthrax exposure");

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
			Entity exposureAnimalEntity = CDA.createEntity();
			exposureAnimalEntity.setClassCode(EntityClassRoot.ANM);
			exposureAnimalParticipantRole.setScopingEntity(exposureAnimalEntity);
			exposureAnimalParticipant.setParticipantRole(exposureAnimalParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureAnimalParticipant);

			exposureAnimalParticipant.setTime(exposureAnimalTime);
			if (exposureAnimalTypeCode != null) {
				exposureAnimalEntity.setCode(exposureAnimalTypeCode);
			}

			Participant2 exposureMaterialParticipant = CDA.createParticipant2();
			exposureMaterialParticipant.setTypeCode(ParticipationType.DIR);
			ParticipantRole exposureMaterialParticipantRole = CDA.createParticipantRole();
			exposureMaterialParticipantRole.setClassCode(RoleClassRoot.EXPR);
			Entity exposureMaterialEntity = CDA.createEntity();
			exposureMaterialEntity.setClassCode(EntityClassRoot.MAT);
			exposureMaterialParticipantRole.setScopingEntity(exposureMaterialEntity);
			exposureMaterialParticipant.setParticipantRole(exposureMaterialParticipantRole);
			locationAndTypeAct.getParticipants().add(exposureMaterialParticipant);

			exposureMaterialParticipant.setTime(exposureMaterialTime);
			if (exposureMaterialTypeCode != null) {
				exposureMaterialEntity.setCode(exposureMaterialTypeCode);
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
			buffer.append("            " + "<caption>" + "Anthrax Social History Section" + "</caption>");
			buffer.append("</list>" + System.getProperty("line.separator"));
			buffer.append("            " + "<list>" + System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Race observation
			items.add(raceCodeSectionText1);
			items.add(raceCodeSectionText2);
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			items.add(occupationSectionText3);
			items.add(occupationSectionText4);
			items.add(occupationSectionText5);
			items.add(occupationSectionText6);
			
			// Anthrax possible exposure location and type act
			items.add(exposureLocationSectionText);
			items.add(exposureAnimalSectionText);
			items.add(exposureMaterialSectionText);
			

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
	 *   Anthrax Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Anthrax Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		AnthraxPhcrClinicalInformationSection clinicalInformationSection = ANTHRAX.createAnthraxPhcrClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Anthrax Signs and Symptoms (SHOULD) 0..*
		
		// Use the most specific code known at the time of submission.
		CD reportableCode = Datatypes.createCD("84980006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cutaneous Anthrax");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Cutaneous Anthrax";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Reported by Dr Jay Stratidis";
		
		AnthraxCaseObservation caseObservation = ANTHRAX.createAnthraxCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// Case Observation > Author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP);
		
		II authorId = Datatypes.createII(NullFlavor.UNK);
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addStreetAddressLine(TEST_STREET);
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		
		TEL authorTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("STRATIDIS");
		authorName.addGiven("JAY");
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
		
		II informantId = Datatypes.createII(NullFlavor.UNK);
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("STRATIDIS");
		informantName.addGiven("JAY");
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

		// Case Observation > Signs and Symptoms (SHOULD) 0..* - if exists, must have a value (CD signSymptom)
		
		// patient has Cutaneous ulcer with edema and black eschar
		CD signsSymptoms1Code = Datatypes.createCD("PHC819", "2.16.840.1.114222.4.5.274", "PHIN VS (CDC Local Coding System)", "Cutaneous ulcer with edema and black eschar");
		IVL_TS signsSymptoms1Time = Datatypes.createIVL_TS(TS_PAT_VISIT);
		boolean signsSymptoms1Negation = false;
		String signsAndSymptomsSectionText1 = "Signs and Symptoms - Cutaneous ulcer with edema and black eschar";
		
		// patient has Lymphadenopathy
		CD signsSymptoms2Code = Datatypes.createCD("30746006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Lymphadenopathy (disorder)");
		IVL_TS signsSymptoms2Time = Datatypes.createIVL_TS(TS_PAT_VISIT);
		boolean signsSymptoms2Negation = false;
		String signsAndSymptomsSectionText2 = "Signs and Symptoms - Lymphadenopathy (disorder)";
		
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
			
			AnthraxSignsAndSymptomsObservation symptomsObservation = ANTHRAX.createAnthraxSignsAndSymptomsObservation().init();
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
		// Use this boolean to control the status 
		// If they are dead, the deceasedCauseOfDeath needs to be changed.
		
		boolean isPatientStatusAlive = true;
		
		// If patient alive
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP);
		
		// If patient deceased
		IVL_TS deceasedTime = Datatypes.createIVL_TS();
		IVXB_TS deceasedTimeLow = Datatypes.createIVXB_TS();
		deceasedTimeLow.setValue(TIME_STAMP);
		deceasedTime.setLow(deceasedTimeLow);
		II deceasedCaseId = Datatypes.createII(TEST_ROOT, "222");
		CD deceasedCauseOfDeath = Datatypes.createCD("84980006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cutaneous Anthrax");
		
		//A negationIndicator of false means the condition caused the death. 
		//A negationIndicator of true means the condition did not cause the death.
		boolean deceasedCauseIsReportable = false;
		
		String patientConditionSectionText = "Patient alive " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		//String patientConditionSectionText = "Patient deceased, cause Cutaneous Anthrax";
		
		if (isPatientStatusAlive) {
			
			PatientConditionAliveObservation aliveObservation = PHCR.createPatientConditionAliveObservation().init();
			CD aliveValueCode = Datatypes.createCD("438949009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Alive");
			aliveObservation.getValues().add(aliveValueCode);
			clinicalInformationSection.addObservation(aliveObservation);
			((Entry) aliveObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (patientConditionTS != null) {
				aliveObservation.setEffectiveTime(patientConditionTS);
			}
			
		} else {
			
			PatientConditionDeceasedObservation deceasedObservation = PHCR.createPatientConditionDeceasedObservation().init();
			CD deceasedValueCode = Datatypes.createCD("419099009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Dead");
			deceasedObservation.getValues().add(deceasedValueCode);
			clinicalInformationSection.addObservation(deceasedObservation);
			((Entry) deceasedObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			// Deceased Cause Observation
			Observation causeObservation = CDA.createObservation();
			causeObservation.setClassCode(ActClassObservation.OBS);
			causeObservation.setMoodCode(x_ActMoodDocumentObservation.EVN);
			CD causeCode = Datatypes.createCD();
			causeCode.setCode("ASSERTION");
			causeCode.setCodeSystem("2.16.840.1.113883.5.4");
			causeCode.setCodeSystemName("HL7ActCode");
			causeObservation.setCode(causeCode);
			causeObservation.setStatusCode(Datatypes.createCS("completed"));
			deceasedObservation.addObservation(causeObservation);
			((EntryRelationship) causeObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
			
			if (deceasedCaseId != null) {
				causeObservation.getIds().add(deceasedCaseId);
			}
			if (patientConditionTS != null) {
				causeObservation.setEffectiveTime(patientConditionTS);
			}
			if (deceasedCauseOfDeath != null) {
				causeObservation.getValues().add(deceasedCauseOfDeath);
			}			
			((EntryRelationship) causeObservation.eContainer()).setNegationInd(deceasedCauseIsReportable);
		}

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<caption>" + "Anthrax Clinical Information Section" + "</caption>");
		buffer.append("</list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<list>" + System.getProperty("line.separator"));
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
	 * Anthrax Public Health Case Report - Treatment Information Section (SHOULD)
	 * 
	 * Clinical Statement Templates:
	 *   Anthrax Therapeutic Regimen Act (SHALL) 1..1
	 *     > Condition Observation (SHALL) 1..1
	 *     > Anthrax Treatment Given Substance Administration (SHOULD) 0..*
	 *     > Anthrax Treatment Not Given Substance Administration (MAY) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setTreatmentInformationSection(PublicHealthCaseReport document) throws Exception {
		
		
		
		// Treatment Information Section (optional)
		AnthraxPhcrTreatmentInformationSection treatmentInformationSection = ANTHRAX.createAnthraxPhcrTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "214365");
		CD caseCode = Datatypes.createCD("84980006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cutaneous Anthrax");
		
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
			

			AnthraxTherapeuticRegimenAct regimenAct = ANTHRAX.createAnthraxTherapeuticRegimenAct().init();
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
			
			CS subsAdminStatus = Datatypes.createCS("completed");
			IVL_TS subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS timeLow = Datatypes.createIVXB_TS();
			timeLow.setValue(TIME_STAMP);
			subsAdminTime.setLow(timeLow);
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue("20071026000000-0400");
			subsAdminTime.setHigh(timeHigh);
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			IVL_PQ rate = Datatypes.createIVL_PQ();
			rate.setUnit("H");
			rate.setValue(Double.parseDouble("12"));
			IVL_PQ dose = Datatypes.createIVL_PQ();
			dose.setValue(BigDecimal.ONE);
			CE materialCode = Datatypes.createCE("205770", "2.16.840.1.113883.6.88", "RxNorm", "Ciprofloxacin 500 MG Oral Tablet [Cipro]");
			EN materialName = Datatypes.createEN();
			materialName.addText("Ciprofloxacin 500 MG Oral Tablet");
			
			String treatmentGivenSectionText1 = materialCode.getDisplayName() + " ONE TABLET EVERY 12 HOURS FOR 60 DAYS.";
				
	
			AnthraxTreatmentGivenSubstanceAdministration treatmentGivenSBADM = ANTHRAX.createAnthraxTreatmentGivenSubstanceAdministration().init();
			treatmentGivenSBADM.setNegationInd(false);

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
			buffer.append("            " + "<caption>" + "Anthrax Treatment Information Section" + "</caption>");
			buffer.append("</list>" + System.getProperty("line.separator"));
			buffer.append("            " + "<list>" + System.getProperty("line.separator"));
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
		
		II encounterId = Datatypes.createII(NullFlavor.UNK);
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS(TS_PAT_VISIT);
		CD encounterType = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounterDateSectionText = "Encounter Date " + timeStampFormat(TS_PAT_VISIT, TEST_DATE_FORMAT);
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
			idPerformerList.add(Datatypes.createII(NullFlavor.UNK));
			List<AD> adPerformerList = new ArrayList<AD>();
			AD performerAddress = Datatypes.createAD();
			performerAddress.addStreetAddressLine(TEST_STREET);
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("STRATIDIS");
			performerPN.addGiven("JAY");
			performerPN.addPrefix("DR");
			namePerformerList.add(performerPN);
			
			String encounterPerformerSectionText = "Encounter source performer - Dr Jay Stratidis";

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
			performerAddress.addStreetAddressLine(TEST_STREET);
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addText("Danbury Hospital");
			nameParticipantList.add(participantPN);
			
			String encounterParticipantSectionText = "Encounter source location - Danbury Hospital " + TEST_STREET + TEST_CITY + ", " + TEST_STATE;

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
			buffer.append("            " + "<caption>" + "Encounters Section" + "</caption>");
			buffer.append("</list>" + System.getProperty("line.separator"));
			buffer.append("            " + "<list>" + System.getProperty("line.separator"));
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
	 * Anthrax Public Health Case Report - Relevant diagnostic tests and/or laboratory data Section (SHOULD)
	 * Results of observations generated by laboratories, imaging procedures, and other procedures

	 * Clinical Statement Templates:
	 *   > Anthrax Result Organizer
	 *   > Anthrax Result Observation
	 *   > Imaging Observation
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		AnthraxPhcrRelevantDxTestsSection dxTestsSection = ANTHRAX.createAnthraxPhcrRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		// Result Observation (optional - but must have one result) - if exists, must have (II observationId), (CD observationCode), (ANY value)
		List<II> observationIdList = new ArrayList<II>();
		observationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD observationCode = Datatypes.createCD("41622-2", "2.16.840.1.113883.6.1", "LOINC", "B anthracis DNA XXX PCR");
		IVL_TS observationEffectiveTime = Datatypes.createIVL_TS(TS_PAT_VISIT);
		ANY value = Datatypes.createCD("21927003", "2.16.840.1.113883.6.96", "SNOMED-CT", "Bacillus anthracis");
		CE observationSpecimenType = Datatypes.createCE("258505006", "2.16.840.1.113883.6.96", "SNOMED-CT", "Skin ulcer swab (specimen)");
		
		String labObservationSectionText = observationCode.getDisplayName() + " for " + observationSpecimenType.getDisplayName() + " result: Bacillus anthracis";

		AnthraxResultObservation observation = ANTHRAX.createAnthraxResultObservation().init();
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
		II labObservationInformantId = Datatypes.createII(NullFlavor.UNK);
		
		ON labObservationOrganizationName = Datatypes.createON();
		labObservationOrganizationName.addText("Danbury Hospital Laboratory");		
		
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
		buffer.append("            " + "<caption>" + "Anthrax Relevant Diagnostic Tests and/or Laboratory Data Section" + "</caption>");
		buffer.append("</list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<list>" + System.getProperty("line.separator"));
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
