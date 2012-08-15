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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.tests;

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
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration;
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

public class StrepPneumoCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static StrepPneumoFactory SP = StrepPneumoFactory.eINSTANCE;
	
	public static String TIME_STAMP_SYMPTOMS = "20120220000000-0500";
	public static String TIME_STAMP_ENCOUNTER = "20120222080000-0500";
	public static String TIME_STAMP_REPORT = "20120226151500-0500";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-239-555-5401";
	public static String TEST_CITY = "Fort Myers";
	public static String TEST_STATE = "FL";
	public static String TEST_POSTALCODE = "06475";	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		StrepPneumoCaseReport document = SP.createStrepPneumoCaseReport().init();
		
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
			System.out.println("PHCR document is valid");
		} else {
			System.out.println("PHCR document is invalid");
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

		
		II patientId = Datatypes.createII(TEST_ROOT, "FL214365");
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("31 Sunfire Circle");
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode("33908");
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-229-555-5887");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Jenson");
		patientName.addGiven("Allen");
		
		CE patientGender = Datatypes.createCE("F", "2.16.840.1.113883.5.1", "HL7", "Female");
		TS patientBirthTime = Datatypes.createTS("19480115000000-0500");
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2186-5", "2.16.840.1.113883.6.238", "Ethnicity Group", "Not Hispanic or Latino");
		
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
		
		II reporterId = Datatypes.createII(NullFlavor.NI);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("175 Coral Drive");
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		reporterAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL reporterTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Nicholls");
		reporterName.addGiven("Nathan");
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
	public static void setCustodian(PublicHealthCaseReport document) throws Exception {
		
		II custodianOrgId = Datatypes.createII(NullFlavor.NI);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Florida Health Data Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("552 Cape Way");
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		custodianOrgAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-239-555-7253");
		
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
		
		II verifierId = Datatypes.createII(NullFlavor.NI);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine("175 Coral Drive");
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		verifierAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL verifierTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Nicholls");
		personName.addGiven("Nathan");
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
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		StrepPneumoSocialHistorySection socialHistorySection = SP.createStrepPneumoSocialHistorySection().init();
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
		
		// Occupation observation (SHOULD) 0..* - if exists, must have a value (CD occupationCode)
		// ValueSet 2.16.840.1.114222.4.11.887
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=56D34BBC-617F-DD11-B38D-00188B398520
		// Industry (NAICS) Value Set 2.16.840.1.114222.4.11.1100
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=3ED34BBC-617F-DD11-B38D-00188B398520
		
		boolean hasOccupation = true;
		
		String occupationSectionText1 = "Occupation - Executive Secretaries and Administrative Assistants";
		String occupationSectionText2 = "Occupation Location - Unknown"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS();
			IVXB_TS occupationLowTime = Datatypes.createIVXB_TS();
			occupationLowTime.setNullFlavor(NullFlavor.UNK);
			occupationEffectiveTime.setLow(occupationLowTime);
			CD occupationCode = Datatypes.createCD("43-6011", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Executive Secretaries and Administrative Assistants");

			AD locationAddress = Datatypes.createAD();
			locationAddress.setNullFlavor(NullFlavor.UNK);

			TEL locationTelecom = Datatypes.createTEL();
			locationTelecom.setNullFlavor(NullFlavor.UNK);

			PN locationName = Datatypes.createPN();
			locationName.setNullFlavor(NullFlavor.UNK);

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

			hasSocialHistory = true;
		}
		
		boolean hasExposureLocation = true;
		String locationTypeCode = "285202004";
		String locationTypeDisplayName = "Community environment";
		
		String exposureLocationSectionText = "Possible Exposure Location - Community Environment, Fort Meyers, FL";
		
		if (hasExposureLocation) {
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS();
			IVXB_TS exposureLocationTimeLow = Datatypes.createIVXB_TS();
			exposureLocationTimeLow.setNullFlavor(NullFlavor.UNK);
			exposureLocationTime.setLow(exposureLocationTimeLow);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addCity(TEST_CITY);
			exposureLocationAddress.addState(TEST_STATE);

			TEL exposureLocationTelecom = Datatypes.createTEL();
			exposureLocationTelecom.setNullFlavor(NullFlavor.UNK);

			CE exposureLocationTypeCode = Datatypes.createCE(locationTypeCode, SNOMED_OID, SNOMED_SYSTEM_NAME, locationTypeDisplayName);

			StrepPneumoPossibleExposureLocationAct locationAndTypeAct = SP.createStrepPneumoPossibleExposureLocationAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("TBD", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Streptococcus pneumoniae exposure");

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

			socialHistorySection.addAct(locationAndTypeAct);
			((Entry) locationAndTypeAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
			hasSocialHistory = true;
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
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			
			// Exposure location act
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
		StrepPneumoPHCRClinicalInformationSection clinicalInformationSection = SP.createStrepPneumoPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > PHCR Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("186379002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Gp A streptococcal septicemia");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_REPORT);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Group A streptococcal septicemia";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Nathan Nicholls"; 
		
		StrepPneumoCaseObservation caseObservation = SP.createStrepPneumoCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// Case Observation > Author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II authorId = Datatypes.createII(NullFlavor.NI);
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addStreetAddressLine("175 Coral Drive");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Nicholls");
		authorName.addGiven("Nathan");
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
		
		II informantId = Datatypes.createII(NullFlavor.NI);
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("Nicholls");
		informantName.addGiven("Nathan");
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
		
		boolean symptomCoughWithFever = true;
		boolean symptomShivering = true;
		boolean symptomFeverWithChills = true;
		boolean symptomFeverOver100 = true;
		boolean symptomRustySputum = true;
		boolean symptomHeadache = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Cough with Fever (135883003 - SNOMEDCT)
		if (symptomCoughWithFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("135883003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Cough with Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomCoughWithFever);
			items.add("Signs and Symptoms - Cough with Fever " + (symptomCoughWithFever ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Shivering or Rigors (248456009 - SNOMEDCT)
		if (symptomShivering || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("248456009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Shivering or Rigors"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomShivering);
			items.add("Signs and Symptoms - Shivering or Rigors " + (symptomShivering ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fever with Chills (274640006 - SNOMEDCT)
		if (symptomFeverWithChills || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("274640006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever with Chills"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFeverWithChills);
			items.add("Signs and Symptoms - Fever with Chills " + (symptomFeverWithChills ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fever over 100.4 (426000000 - SNOMEDCT)
		if (symptomFeverOver100 || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("426000000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever over 100.4 Fahrenheit"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFeverOver100);
			items.add("Signs and Symptoms - Fever over 100.4 Fahrenheit " + (symptomFeverOver100 ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Rusty sputum (24816000 - SNOMEDCT)
		if (symptomRustySputum || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("24816000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Rusty sputum"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomRustySputum);
			items.add("Signs and Symptoms - Rusty sputum " + (symptomRustySputum ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Headache (25064002 - SNOMEDCT)
		if (symptomHeadache || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("25064002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Headache"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomHeadache);
			items.add("Signs and Symptoms - Headache " + (symptomHeadache ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}

		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			StrepPneumoSignsAndSymptomsObservation symptomsObservation = SP.createStrepPneumoSignsAndSymptomsObservation().init();
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
		

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Clinical Information Section" + "</caption>");
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
		StrepPneumoPHCRTreatmentInformationSection treatmentInformationSection = SP.createStrepPneumoPHCRTreatmentInformationSection().init();
		boolean hasTreatmentInformation = false;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "FL214365");
		CD caseCode = Datatypes.createCD("406617004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Invasive Streptococcus pneumoniae disease");
		
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
			
			StrepPneumoTherapeuticRegimenAct regimenAct = SP.createStrepPneumoTherapeuticRegimenAct().init();
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
			IVXB_TS timeLow = Datatypes.createIVXB_TS();
			timeLow.setValue(TIME_STAMP_ENCOUNTER);
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue(TIME_STAMP_REPORT);
			subsAdminTime.setLow(timeLow);
			subsAdminTime.setHigh(timeHigh);
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			//IVL_PQ rate = Datatypes.createIVL_PQ();
			//rate.setUnit("H");
			//rate.setValue(Double.parseDouble("24"));
			//IVL_PQ dose = Datatypes.createIVL_PQ();
			//dose.setValue(BigDecimal.ONE);
			CE materialCode = Datatypes.createCE("18631", "2.16.840.1.113883.6.88", "RxNorm", "Azithromycin");
			EN materialName = Datatypes.createEN();
			materialName.addText("Azithromycin");
			
			String treatmentGivenSectionText1 = "Prescribed " + materialCode.getDisplayName() + ".";
				
			if (!negationInd) {
				StrepPneumoTreatmentGivenSubstanceAdministration treatmentGivenSBADM = SP.createStrepPneumoTreatmentGivenSubstanceAdministration().init();
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
				//if (rate != null) treatmentGivenSBADM.setRateQuantity(rate);
				//if (dose != null) treatmentGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
				((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			} else {
				StrepPneumoTreatmentNotGivenSubstanceAdministration treatmentNotGivenSBADM = SP.createStrepPneumoTreatmentNotGivenSubstanceAdministration().init();
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
				//if (rate != null) treatmentNotGivenSBADM.setRateQuantity(rate);
				//if (dose != null) treatmentNotGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentNotGivenSBADM);
				((EntryRelationship) treatmentNotGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			}
			
			negationInd = false;
			
			subsAdminStatus = Datatypes.createCS("completed");
			subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS lowTime = Datatypes.createIVXB_TS();
			lowTime.setValue(TIME_STAMP_ENCOUNTER);
			IVXB_TS highTime = Datatypes.createIVXB_TS();
			highTime.setValue(TIME_STAMP_REPORT);
			subsAdminTime.setLow(lowTime);
			subsAdminTime.setHigh(highTime);
			routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			//rate = null;
			//dose = null;
			materialCode = Datatypes.createCE("82122", "2.16.840.1.113883.6.88", "RxNorm", "Levofloxacin");
			materialName = Datatypes.createEN();
			materialName.addText("Levofloxacin");
			
			String treatmentGivenSectionText2 = "Prescribed " + materialCode.getDisplayName() + ".";
				
			if (!negationInd) {
				StrepPneumoTreatmentGivenSubstanceAdministration treatmentGivenSBADM = SP.createStrepPneumoTreatmentGivenSubstanceAdministration().init();
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
				//if (rate != null) treatmentGivenSBADM.setRateQuantity(rate);
				//if (dose != null) treatmentGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
				((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			} else {
				StrepPneumoTreatmentNotGivenSubstanceAdministration treatmentNotGivenSBADM = SP.createStrepPneumoTreatmentNotGivenSubstanceAdministration().init();
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
				//if (rate != null) treatmentNotGivenSBADM.setRateQuantity(rate);
				//if (dose != null) treatmentNotGivenSBADM.setDoseQuantity(dose);
				if (materialCode != null) material.setCode(materialCode);
				if (materialName != null) material.setName(materialName);
				
				regimenAct.addSubstanceAdministration(treatmentNotGivenSBADM);
				((EntryRelationship) treatmentNotGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			}
			
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
			
			// treatments given
			items.add(treatmentGivenSectionText1);
			
			// treatments given
			items.add(treatmentGivenSectionText2);

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
		
		II encounterId = Datatypes.createII(NullFlavor.NI);
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS();
		IVXB_TS encounterLow = Datatypes.createIVXB_TS();
		encounterLow.setValue(TIME_STAMP_ENCOUNTER);
		IVXB_TS encounterHigh = Datatypes.createIVXB_TS();
		encounterHigh.setValue(TIME_STAMP_REPORT);
		encounterEffectiveTime.setLow(encounterLow);
		encounterEffectiveTime.setHigh(encounterHigh);
		CD encounterType = Datatypes.createCD("INP", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Inpatient");
		
		String encounterSectionText = timeStampFormat(TIME_STAMP_ENCOUNTER, TEST_DATE_FORMAT) + " at Fort Myers Hospital, 175 Coral Drive, Fort Myers, FL 06475 (tel:+1-239-555-5401)";
		String encounterPerformerSectionText = encounterType.getDisplayName() + " encounter with Dr. Nathan Nicholls MD";	
		
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
			idPerformerList.add(Datatypes.createII(NullFlavor.NI));
			List<AD> adPerformerList = new ArrayList<AD>();
			AD performerAddress = Datatypes.createAD();
			performerAddress.addStreetAddressLine("175 Coral Drive");
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			performerAddress.addPostalCode(TEST_POSTALCODE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("Nicholls");
			performerPN.addGiven("Nathan");
			performerPN.addPrefix("Dr");
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
			idParticipantList.add(Datatypes.createII(NullFlavor.NI));
			List<AD> adParticipantList = new ArrayList<AD>();
			AD participantAddress = Datatypes.createAD();
			participantAddress.addStreetAddressLine("175 Coral Drive");
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			participantAddress.addPostalCode(TEST_POSTALCODE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addText("Fort Myers Hospital");
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
			
			// encounter
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
		StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection dxTestsSection = SP.createStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection().init();
		document.addSection(dxTestsSection);
		
		// Result Organizer
		List<II> organizerIdList = new ArrayList<II>();
		organizerIdList.add(Datatypes.createII(NullFlavor.NI));
		CD organizerCode = Datatypes.createCD("6460-0", LOINC_OID, LOINC_SYSTEM_NAME, "Bacteria Spt Cult");
		IVL_TS organizerEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER);
		CE organizerSpecimenType = Datatypes.createCE("119335007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Coughed Sputum");
		
		ResultOrganizer organizer = PHCR.createResultOrganizer().init();
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
		organizerOrganizationName.addText("Fort Myers Hospital");	
		
		AD organizerOrganizationAddress = Datatypes.createAD();
		organizerOrganizationAddress.addStreetAddressLine("175 Coral Drive");
		organizerOrganizationAddress.addCity(TEST_CITY);
		organizerOrganizationAddress.addState(TEST_STATE);
		organizerOrganizationAddress.addPostalCode(TEST_POSTALCODE);	
		
		TEL organizerOrganizationTelecom = Datatypes.createTEL(TEST_TELECOM);
		
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
		
		
		// Result Observation
		List<II> stainObservationIdList = new ArrayList<II>();
		stainObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD stainObservationCode = Datatypes.createCD("664-3", LOINC_OID, LOINC_SYSTEM_NAME, "Gram Stain");
		IVL_TS stainObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER);
		ANY stainValue = Datatypes.createCD("11471007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Gram-positive diplococcus");
		
		String stainObservationSectionText1 = "Collected " + timeStampFormat(TIME_STAMP_ENCOUNTER, TEST_DATE_FORMAT) + " " + organizerSpecimenType.getDisplayName() + " - " + stainObservationCode.getDisplayName() + ", Gram-positive diplococcus";
		String stainObservationSectionText2 = "Fort Myers Hospital Laboratory, 175 Coral Drive, Fort Myers, FL 06475 (tel:+1-239-555-5401)";
		
		StrepPneumoResultObservation stainObservation = SP.createStrepPneumoResultObservation().init();
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
		stainObservationOrganizationName.addText("Fort Myers Hospital Laboratory");	
		
		AD stainObservationOrganizationAddress = Datatypes.createAD();
		stainObservationOrganizationAddress.addStreetAddressLine("175 Coral Drive");
		stainObservationOrganizationAddress.addCity(TEST_CITY);
		stainObservationOrganizationAddress.addState(TEST_STATE);
		stainObservationOrganizationAddress.addPostalCode(TEST_POSTALCODE);	
		
		TEL stainObservationOrganizationTelecom = Datatypes.createTEL(TEST_TELECOM);
		
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
		
		// Result Observation
		List<II> idObservationIdList = new ArrayList<II>();
		idObservationIdList.add(Datatypes.createII(NullFlavor.NI));
		CD idObservationCode = Datatypes.createCD("45335-7", LOINC_OID, LOINC_SYSTEM_NAME, "Bacteria ID test Islt Ql Cult");
		IVL_TS idObservationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER);
		ANY idValue = Datatypes.createCD("9861002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Streptococcus pneumoniae");
		
		String idObservationSectionText1 = "Collected " + timeStampFormat(TIME_STAMP_ENCOUNTER, TEST_DATE_FORMAT) + " " + organizerSpecimenType.getDisplayName() + " - " + idObservationCode.getDisplayName() + ", Streptococcus pneumoniae";
	
		StrepPneumoResultObservation idObservation = SP.createStrepPneumoResultObservation().init();
		organizer.addObservation(idObservation);
		
		for (int i=0; i < idObservationIdList.size(); i++) {
			idObservation.getIds().add(idObservationIdList.get(i));
		}
		if (idObservationCode != null) idObservation.setCode(idObservationCode);
		if (idObservationEffectiveTime != null) idObservation.setEffectiveTime(idObservationEffectiveTime);
		if (idValue != null) idObservation.getValues().add(idValue);
		
		// Result Observation Informant (required)
		II idObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON idObservationOrganizationName = Datatypes.createON();
		idObservationOrganizationName.addText("Fort Myers Hospital Laboratory");	
		
		AD idObservationOrganizationAddress = Datatypes.createAD();
		idObservationOrganizationAddress.addStreetAddressLine("175 Coral Drive");
		idObservationOrganizationAddress.addCity(TEST_CITY); 
		idObservationOrganizationAddress.addState(TEST_STATE);
		idObservationOrganizationAddress.addPostalCode(TEST_POSTALCODE);	
		
		TEL idObservationOrganizationTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		Informant12 idObservationInformant = CDA.createInformant12();
		AssignedEntity idObservationInformantEntity = CDA.createAssignedEntity();
		Organization idObservationOrganization = CDA.createOrganization();
		idObservationInformantEntity.getIds().add(idObservationInformantId);
		idObservationInformantEntity.getAddrs().add(idObservationOrganizationAddress);
		idObservationInformantEntity.getTelecoms().add(idObservationOrganizationTelecom);
		idObservationOrganization.getNames().add(idObservationOrganizationName);
		idObservationInformantEntity.getRepresentedOrganizations().add(idObservationOrganization);
		idObservationInformant.setAssignedEntity(idObservationInformantEntity);
		idObservation.getInformants().add(idObservationInformant);
		
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Relevant Diagnostic Tests and/or Laboratory Data Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab observation 1
		items.add(stainObservationSectionText1);
		 
		// lab observation 2
		items.add(idObservationSectionText1);
		
		// laboratory
		items.add(stainObservationSectionText2);


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
