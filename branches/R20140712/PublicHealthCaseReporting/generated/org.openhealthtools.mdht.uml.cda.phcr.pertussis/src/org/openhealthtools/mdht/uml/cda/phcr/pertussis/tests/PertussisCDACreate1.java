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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import org.openhealthtools.mdht.uml.cda.Guardian;
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
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
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

public class PertussisCDACreate1 {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static PertussisFactory PERTUSSIS = PertussisFactory.eINSTANCE;
	
	public static String TIME_STAMP_ENCOUNTER1 = "20111205090000-0500";
	public static String TIME_STAMP_ENCOUNTER2 = "20111215103000-0500";
	public static String TIME_STAMP_REPORT = "20111215103000-0500";
	
	public static String PATIENT_ID = "NY214365";

	public static String TEST_CITY = "Middletown";
	public static String TEST_STATE = "NY";
	public static String TEST_POSTALCODE = "10940";	
	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static String PERTUSSIS_CODE = "27836007";
	public static String PERTUSSIS_DISPLAY_NAME = "Pertussis";
	
	public static String UUID = "ccbcad11-ac40-4948-a19b-d6bae604ae14";
	
	
	public static void main(String[] args) throws Exception {
		
		PertussisCaseReport document = PERTUSSIS.createPertussisCaseReport().init();
		
		setHeader(document);
		
		setPatient(document);
		setReporter(document);
		setCustodian(document);
		setVerifier(document);
		
		setSocialHistorySection(document);
		setClinicalInformationSection(document);
		setTreatmentInformationSection(document);
		setEncountersSection(document);
		//setDxTestsSection(document);  //ccd does not support RQO mood code on observation
		setImmunizationsSection(document);
		
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
			System.out.println("Pertussis document is valid");
		} else {
			System.out.println("Pertussis document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "SamplePertussisCDA1.xml");
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
		II documentId = Datatypes.createII(UUID);
		TS documentEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS documentLanguageCode = Datatypes.createCS("en-US");
		CE documentConfidentialityCode = Datatypes.createCE("N", "2.16.840.1.113883.5.25");
		INT documentVersion = Datatypes.createINT();
		documentVersion.setValue(1);
		
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
		patientAddress.addStreetAddressLine("12 W Main Street");
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-845-555-5555");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Trenton");
		patientName.addGiven("Taylor");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS("20010627000000-0500");
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		
		AD patientBirthPlaceAddress = Datatypes.createAD();
		patientBirthPlaceAddress.addCountry("USA");
		
		boolean hasGuardian = true;
		II guardianId = Datatypes.createII(NullFlavor.UNK);
		
		AD guardianAddress = Datatypes.createAD();
		guardianAddress.addStreetAddressLine("12 W Main Street");
		guardianAddress.addCity(TEST_CITY);
		guardianAddress.addState(TEST_STATE);
		guardianAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL guardianTelecom = Datatypes.createTEL("tel:+1-845-555-5555");
		
		PN guardianName = Datatypes.createPN();
		guardianName.addFamily("Trenton");
		guardianName.addGiven("Lisa");
		
		CE guardianRoleCode = Datatypes.createCE("MTH", "2.16.840.1.113883.5.111", "HL7 Role Code", "Mother");
		
		
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
			
			// patientRole > patient > guardian
			if (hasGuardian) {
				Guardian patientGuardian = CDA.createGuardian();
				Person guardianPerson = CDA.createPerson();
				if (guardianId != null) patientGuardian.getIds().add(guardianId);
				if (guardianAddress != null) patientGuardian.getAddrs().add(guardianAddress);
				if (guardianTelecom != null) patientGuardian.getTelecoms().add(guardianTelecom);
				if (guardianRoleCode != null) patientGuardian.setCode(guardianRoleCode);
				if (guardianName != null) guardianPerson.getNames().add(guardianName);
				patientGuardian.setGuardianPerson(guardianPerson);
				patient.getGuardians().add(patientGuardian);
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
		reporterAddress.addStreetAddressLine("14 Grove Street");
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		reporterAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-845-344-2273");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Smith");
		reporterName.addGiven("Barry");
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
		custodianOrgName.addText("Taconic Health Information Network and Community");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("300 Westage Business Center Drive, Suite 320");
		custodianOrgAddress.addCity("Fishkill");
		custodianOrgAddress.addState(TEST_STATE);
		custodianOrgAddress.addPostalCode("12524");
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-845-896-4726");
		
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
		verifierAddress.addStreetAddressLine("14 Grove Street");
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		verifierAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-845-344-2273");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Smith");
		personName.addGiven("Barry");
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
	 *     
	 *   Pertussis Possible Exposure Location (SHOULD) 0..*
	 *   Pertussis Possible Case Contact Location (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		PertussisSocialHistorySection socialHistorySection = PERTUSSIS.createPertussisSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode = Datatypes.createCD("2106-3", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "White");
		String raceCodeSectionText = "Race - White";
		
		List<CD> raceCodes = new ArrayList<CD>();
		raceCodes.add(raceCode);
		int count = raceCodes.size();
		
		for (int i=0; i < count; i++) {
			CD code = raceCodes.get(i);
			if (code != null) {
				RaceObservation raceObservation = PHCR.createRaceObservation().init();
				raceObservation.getValues().add(code);
				socialHistorySection.addObservation(raceObservation);
				((Entry) raceObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

				hasSocialHistory = true;
			}
		}
		
		// Pertussis Possible Exposure Location (SHOULD) 0..*
		// Transmission Setting Value Set 2.16.840.1.114222.4.11.1052
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=89D34BBC-617F-DD11-B38D-00188B398520
		
		boolean hasExposureLocation = true;
		String locationStreetAddress = "491 County Road";
		String locationTelephone = "tel:+1-845-326-1740";
		String locationTypeCode = "257698009";
		String locationTypeDisplayName = "School";
		String locationName = "Maple Hill Elementary School";
		
		String exposureLocationSectionText = "Possible Exposure Location - Maple Hill Elementary School, 491 County Road, " + TEST_CITY + ", " + TEST_STATE + " (tel:845-326-1740)";
		
		if (hasExposureLocation) {
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addStreetAddressLine(locationStreetAddress);
			exposureLocationAddress.addCity(TEST_CITY);
			exposureLocationAddress.addState(TEST_STATE);
			exposureLocationAddress.addPostalCode(TEST_POSTALCODE);

			TEL exposureLocationTelecom = Datatypes.createTEL(locationTelephone);

			CE exposureLocationTypeCode = Datatypes.createCE(locationTypeCode, SNOMED_OID, SNOMED_SYSTEM_NAME, locationTypeDisplayName);
			
			PN exposureLocationName = Datatypes.createPN();
			exposureLocationName.addText(locationName);

			PertussisPossibleExposureLocationAct locationAndTypeAct = PERTUSSIS.createPertussisPossibleExposureLocationAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("444387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Exposure to Bordetella pertussis");

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
		
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Pertussis Social History Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Race observation
			items.add(raceCodeSectionText);
			
			// Pertussis possible exposure location act
			items.add(exposureLocationSectionText);
			
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
	 *   Pertussis Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Pertussis Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		PertussisClinicalInformationSection clinicalInformationSection = PERTUSSIS.createPertussisClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Pertussis Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD(PERTUSSIS_CODE, SNOMED_OID, SNOMED_SYSTEM_NAME, PERTUSSIS_DISPLAY_NAME);
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_ENCOUNTER2);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Pertussis";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Condition diagnosed by Dr Barry Smith";
		
		PertussisCaseObservation caseObservation = PERTUSSIS.createPertussisCaseObservation().init();
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
		authorAddress.addStreetAddressLine("14 Grove Street");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL("tel:+1-845-344-2273");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Smith");
		authorName.addGiven("Barry");
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
		informantName.addFamily("Smith");
		informantName.addGiven("Barry");
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
		
		boolean symptomCough = false;
		boolean symptomPersistentCough = true;
		boolean symptomWhoopingRespiration = false;
		boolean symptomParoxysmsOfCoughing = true;
		boolean symptomPosttussiveVomiting = false;
		boolean symptomApnea = false;
		boolean symptomCyanosis = false;
		boolean symptomPneumonia = false;
		boolean symptomPulmonaryHypertension = false;
		boolean symptomSeizures = false;
		boolean symptomAcuteEncephalopathy = false;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Cough (49727002 - SNOMEDCT)
		if (symptomCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("49727002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomCough);
			items.add("Signs and Symptoms - Cough " + (symptomCough ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Persistent Cough (284523002 - SNOMEDCT)
		if (symptomPersistentCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("284523002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Persistent Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomPersistentCough);
			items.add("Signs and Symptoms - Persistent Cough " + (symptomPersistentCough ? "REPORTED starting on " + timeStampFormat("20111105000000-0500", TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Whooping Respiration (60537006  - SNOMEDCT)
		//if (symptomWhoopingRespiration || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("60537006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Whooping Respiration"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomWhoopingRespiration);
			items.add("Signs and Symptoms - Whooping Respiration " + (symptomWhoopingRespiration ? "REPORTED" : "not reported"));
		//}
		
		// Signs and Symptom Paroxysms Of Coughing (43025008  - SNOMEDCT)
		if (symptomParoxysmsOfCoughing || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("43025008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Paroxysms Of Coughing"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomParoxysmsOfCoughing);
			items.add("Signs and Symptoms - Paroxysms Of Coughing " + (symptomParoxysmsOfCoughing ? "REPORTED starting on " + timeStampFormat("20111214000000-0500", TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Post-tussive vomiting (424580008  - SNOMEDCT)
		//if (symptomPosttussiveVomiting || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("424580008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Post-tussive vomiting"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomPosttussiveVomiting);
			items.add("Signs and Symptoms - Post-tussive vomiting " + (symptomPosttussiveVomiting ? "REPORTED" : "not reported"));
		//}
		
		// Signs and Symptom Apnea (1023001  - SNOMEDCT)
		if (symptomApnea || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("1023001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Apnea"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomApnea);
			items.add("Signs and Symptoms - Apnea " + (symptomApnea ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Cyanosis (3415004  - SNOMEDCT)
		if (symptomCyanosis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("3415004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cyanosis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomCyanosis);
			items.add("Signs and Symptoms - Cyanosis " + (symptomCyanosis ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Pneumonia (233604007 - SNOMEDCT)
		if (symptomPneumonia || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("233604007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pneumonia"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomPneumonia);
			items.add("Signs and Symptoms - Pneumonia " + (symptomPneumonia ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Pulmonary Hypertension  (70995007  - SNOMEDCT)
		if (symptomPulmonaryHypertension || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("70995007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pulmonary Hypertension"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomPulmonaryHypertension);
			items.add("Signs and Symptoms - Pulmonary Hypertension " + (symptomPulmonaryHypertension  ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Seizures  (91175000  - SNOMEDCT)
		if (symptomSeizures || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("91175000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Seizures"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomSeizures);
			items.add("Signs and Symptoms - Seizures " + (symptomSeizures  ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Acute Encephalopathy  (??  - SNOMEDCT)
		if (symptomAcuteEncephalopathy || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("??", SNOMED_OID, SNOMED_SYSTEM_NAME, "Acute Encephalopathy"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomAcuteEncephalopathy);
			items.add("Signs and Symptoms - Acute Encephalopathy " + (symptomAcuteEncephalopathy  ? "REPORTED" : "not reported"));
		}
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			PertussisSignsAndSymptomsObservation symptomsObservation = PERTUSSIS.createPertussisSignsAndSymptomsObservation().init();
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
		String patientConditionSectionText = "Patient is alive " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		
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
		buffer.append("            " + "            " + "<caption>" + "Pertussis Clinical Information Section" + "</caption>");
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
	 *   Pertussis Therapeutic Regimen Act (SHALL) 1..1
	 *     > Condition Observation (SHALL) 1..1
	 *     > Pertussis Treatment Given Substance Administration (SHOULD) 0..*
	 *     > Pertussis Treatment Not Given Substance Administration (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setTreatmentInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Treatment Information Section (optional)
		PertussisTreatmentInformationSection treatmentInformationSection = PERTUSSIS.createPertussisTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "NY214365");
		CD caseCode = Datatypes.createCD(PERTUSSIS_CODE, SNOMED_OID, SNOMED_SYSTEM_NAME, PERTUSSIS_DISPLAY_NAME);
		
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
			
			PertussisTherapeuticRegimenAct regimenAct = PERTUSSIS.createPertussisTherapeuticRegimenAct().init();
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
			
			CS subsAdminStatus = Datatypes.createCS("active");
			IVL_TS subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS timeLow = Datatypes.createIVXB_TS();
			timeLow.setValue(TIME_STAMP_ENCOUNTER2);
			subsAdminTime.setLow(timeLow);
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue("20111220000000-0500");
			subsAdminTime.setHigh(timeHigh);
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			CE materialCode = Datatypes.createCE("18631", "2.16.840.1.113883.6.88", "RxNorm", "Azithromycin");
			EN materialName = Datatypes.createEN();
			materialName.addText("Azithromycin 100 MG/ML [Zithromax]");
			
			String treatmentGivenSectionText1 = "Prescribed " + materialCode.getDisplayName() + " on " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " for 5 days";
				
			PertussisTreatmentGivenSubstanceAdministration treatmentGivenSBADM = PERTUSSIS.createPertussisTreatmentGivenSubstanceAdministration().init();
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
			if (materialCode != null) material.setCode(materialCode);
			if (materialName != null) material.setName(materialName);

			regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
			((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Pertussis Treatment Information Section" + "</caption>");
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
		document.addSection(encountersSection);
		
		// First Encounter
		II encounter1Id = Datatypes.createII(TEST_ROOT, "NY214365-1");
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD encounter1Type = Datatypes.createCD("PED", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Pediatrics");
		
		String encounter1SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " at Middletown Community Health Center, 14 Grove Street, Middletown, NY (tel:845-344-2273)";
		String encounter1PerformerSectionText = encounter1Type.getDisplayName() + " encounter with Dr. Barry Smith MD";
		
		// Second Encounter
		II encounter2Id = Datatypes.createII(TEST_ROOT, "NY214365-2");
		List<II> activity2IdList = new ArrayList<II>();
		activity2IdList.add(encounter2Id);
		IVL_TS encounter2EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD encounter2Type = Datatypes.createCD("PED", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Pediatrics");
		
		String encounter2SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " at Middletown Community Health Center, 14 Grove Street, Middletown, NY (tel:845-344-2273)";
		String encounter2PerformerSectionText = encounter2Type.getDisplayName() + " encounter with Dr. Barry Smith MD";
		
		
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
	 *   > Pertussis Result Organizer (MAY) 0..*
	 *   > Pertussis Result Observation (SHOULD) 0..*
	 *   > Imaging Observation (MAY) 0..*
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		PertussisRelevantDxTestsSection dxTestsSection = PERTUSSIS.createPertussisRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		// B pert DNA Nph Ql PCR Result Observation
		List<II> pcrIdList = new ArrayList<II>();
		pcrIdList.add(Datatypes.createII(NullFlavor.NI));
		CD pcrCode = Datatypes.createCD("43913-3", LOINC_OID, LOINC_SYSTEM_NAME, "B pert DNA Nph Ql PCR");
		IVL_TS pcrEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY pcrValue = Datatypes.createCD();
		pcrValue.setNullFlavor(NullFlavor.UNK);
		CE pcrSpecimenType = Datatypes.createCE("258500001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");

		CD pcrCollectionProcedureCode = Datatypes.createCD("313273004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pertussis swab");
		IVL_TS pcrCollectionTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CE pcrCollectionTargetSiteCode = Datatypes.createCE("71836000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal structure");
		
		II pcrCollectionOrganizationId = Datatypes.createII(NullFlavor.NI);
		ON pcrCollectionOrganizationName = Datatypes.createON();
		pcrCollectionOrganizationName.addText("Middletown Community Health Center");
		CE pcrCollectionSpecimenTypeCode = Datatypes.createCE("258500001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");
		
		//String pcrLabObservationSectionText1 = pcrCode.getDisplayName() + " for " + pcrSpecimenType.getDisplayName() + " result: (pending)";
		String pcrLabObservationSectionText1 = pcrSpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + pcrCode.getDisplayName() + " result: (pending)";
		String pcrLabObservationSectionText2 = "Middletown Medical Laboratories, 210 East Main Street, Middletown, NY  (tel:845-344-4594)";
	
		
		// B pert Nph Ql Cult Result Observation
		List<II> cultIdList = new ArrayList<II>();
		cultIdList.add(Datatypes.createII(NullFlavor.NI));
		CD cultCode = Datatypes.createCD("48741-3", LOINC_OID, LOINC_SYSTEM_NAME, "B pert Nph Ql Cult");
		IVL_TS cultEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY cultValue = Datatypes.createCD();
		cultValue.setNullFlavor(NullFlavor.UNK);
		CE cultSpecimenType = Datatypes.createCE("258500001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");

		CD cultCollectionProcedureCode = Datatypes.createCD("313273004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pertussis swab");
		IVL_TS cultCollectionTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CE cultCollectionTargetSiteCode = Datatypes.createCE("71836000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal structure");
		
		II cultCollectionOrganizationId = Datatypes.createII(NullFlavor.NI);
		ON cultCollectionOrganizationName = Datatypes.createON();
		cultCollectionOrganizationName.addText("Middletown Community Health Center");
		CE cultCollectionSpecimenTypeCode = Datatypes.createCE("258500001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Nasopharyngeal Swab");
		
		//String cultLabObservationSectionText1 = cultCode.getDisplayName() + " for " + cultSpecimenType.getDisplayName() + " result: (pending)";
		String cultLabObservationSectionText1 = cultSpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + cultCode.getDisplayName() + " result: (pending)";
		String cultLabObservationSectionText2 = "Middletown Medical Laboratories, 210 East Main Street, Middletown, NY  (tel:845-344-4594)";
		
		
		PertussisResultObservation pcrObservation = createPertussisResultObservation(pcrIdList, pcrCode, pcrEffectiveTime, pcrValue, pcrSpecimenType,
				pcrCollectionProcedureCode, pcrCollectionTime, pcrCollectionTargetSiteCode, pcrCollectionOrganizationId,
				pcrCollectionOrganizationName, pcrCollectionSpecimenTypeCode);
		pcrObservation.setMoodCode(x_ActMoodDocumentObservation.RQO);
		dxTestsSection.addObservation(pcrObservation);
		((Entry) pcrObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		PertussisResultObservation cultObservation = createPertussisResultObservation(cultIdList, cultCode, cultEffectiveTime, cultValue, cultSpecimenType,
				cultCollectionProcedureCode, cultCollectionTime, cultCollectionTargetSiteCode, cultCollectionOrganizationId,
				cultCollectionOrganizationName, cultCollectionSpecimenTypeCode);
		cultObservation.setMoodCode(x_ActMoodDocumentObservation.RQO);
		dxTestsSection.addObservation(cultObservation);
		((Entry) cultObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
	
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Pertussis Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		 
		// lab observation
		items.add(pcrLabObservationSectionText1);
		items.add(pcrLabObservationSectionText2);
		items.add(cultLabObservationSectionText1);
		items.add(cultLabObservationSectionText2);

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		dxTestsSection.createStrucDocText(listOpen + listItems + listClose);
	
	}
	
	
	/**
	 * Public Health Case Report - Immunizations Section (SHOULD)
	 * Defines a patient’s current immunization status and pertinent immunization history.
	 * 
	 *  Clinical Statement Templates:
	 *    > Medication Activity
	 *    
	 * @param document
	 * @throws Exception
	 */
	public static void setImmunizationsSection(PublicHealthCaseReport document) throws Exception {
		
		// Immunizations Section (SHOULD)
		PertussisImmunizationsSection immunizationsSection = PERTUSSIS.createPertussisImmunizationsSection().init();
		immunizationsSection.setTitle(Datatypes.createST("Pertussis Immunizations"));
		document.addSection(immunizationsSection);
		
		// Pentacel (DTaP/IPV/HIB)
		String pentacelMaterialCode = "120";
		String pentacelMaterialDisplayName = "DTap-IPV-Hib";
		
		// Infanrix (DTaP)
		String infanrixMaterialCode = "20";
		String infanrixMaterialDisplayName = "DTaP";
		
		// Pentacel (DTaP/IPV/HiB) Dose 1
		String series1_timeStamp = "20000827000000-0500";
		String series1_manufacturerName = "Aventis";
		String series1_materialLot = "C3923AA";
		String series1_immunizationSectionText = "DTaP/IPV/HiB - Aventis lot C3923AA given on " + timeStampFormat(series1_timeStamp, TEST_DATE_FORMAT);
		
		// Pentacel (DTaP/IPV/HiB) Dose 2 
		String series2_timeStamp = "20001030000000-0500";
		String series2_manufacturerName = "Aventis";
		String series2_materialLot = "C3923AA";
		String series2_immunizationSectionText = "DTaP/IPV/HiB - Aventis lot C3923AA given on " + timeStampFormat(series2_timeStamp, TEST_DATE_FORMAT);
		
		// Pentacel (DTaP/IPV/HiB) Dose 3 
		String series3_timeStamp = "20010102000000-0500";
		String series3_manufacturerName = "Aventis";
		String series3_materialLot = "C3923AA";
		String series3_immunizationSectionText = "DTaP/IPV/HiB - Aventis lot C3923AA given on " + timeStampFormat(series3_timeStamp, TEST_DATE_FORMAT);
		
		// Pentacel (DTaP/IPV/HiB) Dose 4 
		String series4_timeStamp = "20011222000000-0500";
		String series4_manufacturerName = "Aventis";
		String series4_materialLot = "C3923AA";
		String series4_immunizationSectionText = "DTaP/IPV/HiB - Aventis lot C3923AA given on " + timeStampFormat(series4_timeStamp, TEST_DATE_FORMAT);
		
		// Infanrix (DTaP) Booster 
		String booster_timeStamp = "20040715000000-0500";
		String booster_manufacturerName = "Infanrix";
		String booster_materialLot = "SKB-AC14B136BB";
		String booster_immunizationSectionText = "DTaP - Infanrix lot SKB-AC14B136BB given on " + timeStampFormat(booster_timeStamp, TEST_DATE_FORMAT);
		
		
		PertussisImmunizationActivity medicationActivity1 = createImmunization(series1_timeStamp, pentacelMaterialCode, 
				pentacelMaterialDisplayName, series1_manufacturerName, series1_materialLot, 1);
		immunizationsSection.addSubstanceAdministration(medicationActivity1);
		((Entry) medicationActivity1.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		PertussisImmunizationActivity medicationActivity2 = createImmunization(series2_timeStamp, pentacelMaterialCode, 
				pentacelMaterialDisplayName, series2_manufacturerName, series2_materialLot, 2);
		immunizationsSection.addSubstanceAdministration(medicationActivity2);
		((Entry) medicationActivity2.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		PertussisImmunizationActivity medicationActivity3 = createImmunization(series3_timeStamp, pentacelMaterialCode, 
				pentacelMaterialDisplayName, series3_manufacturerName, series3_materialLot, 3);
		immunizationsSection.addSubstanceAdministration(medicationActivity3);
		((Entry) medicationActivity3.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		PertussisImmunizationActivity medicationActivity4 = createImmunization(series4_timeStamp, pentacelMaterialCode, 
				pentacelMaterialDisplayName, series4_manufacturerName, series4_materialLot, 4);
		immunizationsSection.addSubstanceAdministration(medicationActivity4);
		((Entry) medicationActivity4.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		PertussisImmunizationActivity medicationActivity5 = createImmunization(booster_timeStamp, infanrixMaterialCode, 
				infanrixMaterialDisplayName, booster_manufacturerName, booster_materialLot, 0);
		immunizationsSection.addSubstanceAdministration(medicationActivity5);
		((Entry) medicationActivity5.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Pertussis Immunizations Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// immunization
		items.add(series1_immunizationSectionText);
		items.add(series2_immunizationSectionText);
		items.add(series3_immunizationSectionText);
		items.add(series4_immunizationSectionText);
		items.add(booster_immunizationSectionText);

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		immunizationsSection.createStrucDocText(listOpen + listItems + listClose);
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
		performerAddress.addStreetAddressLine("14 Grove Street");
		performerAddress.addCity(TEST_CITY);
		performerAddress.addState(TEST_STATE);
		performerAddress.addPostalCode(TEST_POSTALCODE);
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+1-845-344-2273"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Smith");
		performerPN.addGiven("Barry");
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
		participantAddress.addStreetAddressLine("14 Grove Street");
		participantAddress.addCity(TEST_CITY);
		participantAddress.addState(TEST_STATE);
		participantAddress.addPostalCode(TEST_POSTALCODE);
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-845-344-2273"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("Middletown Community Health Center");
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
	
	private static PertussisResultObservation createPertussisResultObservation(List<II> idList, CD code, IVL_TS effectiveTime, ANY value, 
			CE specimenType, CD collectionProcedureCode, IVL_TS collectionTime, CE collectionTargetSiteCode, 
			II collectionOrganizationId, ON collectionOrganizationName, CE collectionSpecimenTypeCode) throws Exception {
		
		// Result Observation
		PertussisResultObservation observation = PERTUSSIS.createPertussisResultObservation().init();
		
		for (int i=0; i < idList.size(); i++) {
			observation.getIds().add(idList.get(i));
		}
		if (code != null) observation.setCode(code);
		if (effectiveTime != null) observation.setEffectiveTime(effectiveTime);
		if (value != null) observation.getValues().add(value);
		
		if (specimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			observation.getSpecimens().add(specimen);
			playingEntity.setCode(specimenType);
		}
		
		// Informant
		II labObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON labObservationOrganizationName = Datatypes.createON();
		labObservationOrganizationName.addText("Middletown Medical Laboratories");		
		
		AD labObservationOrganizationAddress = Datatypes.createAD();
		labObservationOrganizationAddress.addStreetAddressLine("210 East Main Street");
		labObservationOrganizationAddress.addCity(TEST_CITY);
		labObservationOrganizationAddress.addState(TEST_STATE);
		labObservationOrganizationAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL labObservationOrganizationTel = Datatypes.createTEL("tel:+1-845-344-4594");
		
		Informant12 labObservationInformant = CDA.createInformant12();
		AssignedEntity labObservationInformantEntity = CDA.createAssignedEntity();
		Organization labObservationOrganization = CDA.createOrganization();
		labObservationInformantEntity.getIds().add(labObservationInformantId);
		labObservationInformantEntity.getAddrs().add(labObservationOrganizationAddress);
		labObservationInformantEntity.getTelecoms().add(labObservationOrganizationTel);
		labObservationOrganization.getNames().add(labObservationOrganizationName);
		labObservationInformantEntity.getRepresentedOrganizations().add(labObservationOrganization);
		labObservationInformant.setAssignedEntity(labObservationInformantEntity);
		observation.getInformants().add(labObservationInformant);
		
		// Specimen Collection Procedure
		SpecimenCollectionProcedure observationCollectionProcedure = PHCR.createSpecimenCollectionProcedure().init();
		observationCollectionProcedure.setCode(collectionProcedureCode);
		observationCollectionProcedure.setEffectiveTime(collectionTime);
		observationCollectionProcedure.getTargetSiteCodes().add(collectionTargetSiteCode);
		observation.addProcedure(observationCollectionProcedure);
		((EntryRelationship) observationCollectionProcedure.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		
		Performer2 observationCollectionPerformer = CDA.createPerformer2();
		AssignedEntity observationCollectionPerformerAssignedEntity = CDA.createAssignedEntity();
		observationCollectionPerformerAssignedEntity.getIds().add(collectionOrganizationId);
		Organization observationCollectionPerformerRepresentedOrganization = CDA.createOrganization();
		observationCollectionPerformerRepresentedOrganization.getNames().add(collectionOrganizationName);
		observationCollectionPerformerAssignedEntity.getRepresentedOrganizations().add(observationCollectionPerformerRepresentedOrganization);
		observationCollectionPerformer.setAssignedEntity(observationCollectionPerformerAssignedEntity);
		observationCollectionProcedure.getPerformers().add(observationCollectionPerformer);
		
		Participant2 observationCollectionParticipant = CDA.createParticipant2();
		observationCollectionParticipant.setTypeCode(ParticipationType.PRD);
		ParticipantRole observationCollectionParticipantRole = CDA.createParticipantRole();
		observationCollectionParticipantRole.setClassCode(RoleClassRoot.SPEC);
		observationCollectionParticipantRole.getIds().add(Datatypes.createII(NullFlavor.NI));
		PlayingEntity observationCollectionPlayingEntity = CDA.createPlayingEntity();
		observationCollectionPlayingEntity.setCode(collectionSpecimenTypeCode);
		observationCollectionParticipantRole.setPlayingEntity(observationCollectionPlayingEntity);
		observationCollectionParticipant.setParticipantRole(observationCollectionParticipantRole);
		observationCollectionProcedure.getParticipants().add(observationCollectionParticipant);
		
		return observation;
	}
	
	private static PertussisImmunizationActivity createImmunization(String timeStamp, String vaccineCode, String vaccineDisplayName, String vaccineManufacturer, String vaccineLot, int seriesNumber) throws Exception {
		
		List<II> activityId = new ArrayList<II>();
		activityId.add(Datatypes.createII(NullFlavor.NI));
		CS subsAdminStatus = Datatypes.createCS("completed");
		IVL_TS subsAdminTime = Datatypes.createIVL_TS(timeStamp);
		CE routeCode = Datatypes.createCE("IM", "2.16.840.1.113883.5.112", "RouteOfAdministration", "Intramuscular injection");
		CE materialCode = Datatypes.createCE(vaccineCode, "2.16.840.1.113883.6.59", "CVX", vaccineDisplayName);
		ED materialOriginalText = Datatypes.createED(vaccineDisplayName);
		EN materialName = Datatypes.createEN();
		materialName.addText(vaccineDisplayName);
		ST materialLot = Datatypes.createST(vaccineLot);
		ON manufacturerName = Datatypes.createON();
		manufacturerName.addText(vaccineManufacturer);

		// Medication Activity	(required) - if exists, must have an (II activityId)
		PertussisImmunizationActivity medicationActivity = PERTUSSIS.createPertussisImmunizationActivity().init();
		medicationActivity.setMoodCode(x_DocumentSubstanceMood.EVN);
		Consumable consumable = CDA.createConsumable();
		PertussisImmunizationProduct product = PERTUSSIS.createPertussisImmunizationProduct().init();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		Organization manufacturer = CDA.createOrganization();
		product.setManufacturerOrganization(manufacturer);
		consumable.setManufacturedProduct(product);
		medicationActivity.setConsumable(consumable);
		
//		// Medication Series Number Observation
//		if (seriesNumber > 0) {
//			INT immunizationSeries = Datatypes.createINT();
//			immunizationSeries.setValue(seriesNumber);
//			MedicationSeriesNumberObservation medicationNumberObservation = CCD.createMedicationSeriesNumberObservation().init();
//			medicationNumberObservation.getValues().add(immunizationSeries);
//			medicationNumberObservation.setStatusCode(Datatypes.createCS("completed"));
//			medicationActivity.addObservation(medicationNumberObservation);
//			((EntryRelationship) medicationNumberObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
//		}
		
		for (int i=0; i < activityId.size(); i++) {
			medicationActivity.getIds().add(activityId.get(i));
		}
		if (subsAdminStatus != null) medicationActivity.setStatusCode(subsAdminStatus);
		if (subsAdminTime != null) medicationActivity.getEffectiveTimes().add(subsAdminTime);
		if (routeCode != null) medicationActivity.setRouteCode(routeCode);
		if (materialCode != null) material.setCode(materialCode);
		material.getCode().setOriginalText(materialOriginalText);
		if (materialName != null) material.setName(materialName);
		material.setLotNumberText(materialLot);
		manufacturer.getNames().add(manufacturerName);
		
		// Activity Information Source (physician)
		II providerId = Datatypes.createII(NullFlavor.UNK);
		
		PN providerName = Datatypes.createPN();
		providerName.addFamily("Smith");
		providerName.addGiven("Barry");		
		providerName.addPrefix("Dr.");
		providerName.addSuffix("MD");
		
		Informant12 providerInformant = CDA.createInformant12();
		AssignedEntity providerEntity = CDA.createAssignedEntity();
		Person person = CDA.createPerson();
		providerEntity.getIds().add(providerId);
		person.getNames().add(providerName);
		providerEntity.setAssignedPerson(person);
		providerInformant.setAssignedEntity(providerEntity);
		medicationActivity.getInformants().add(providerInformant);
		
		return medicationActivity;
	}

}
