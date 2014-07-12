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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;

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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;
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

public class AcuteHepatitisBCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static HepbFactory HEPB = HepbFactory.eINSTANCE;
	
	public static String PATIENT_ID = "MA28932881";
	
	public static String TIME_STAMP_DOB = "19650308000000-0500"; 
	public static String TIME_STAMP_REPORT = "20110501094500-0500";	
	
	public static String TEST_TELECOM = "tel:+1-617-555-4209";
	public static String TEST_CITY = "Boston";
	public static String TEST_STATE = "MA";
	public static String TEST_POSTALCODE = "01577";	
	public static String HEPB_CODE = "76795007";
	public static String HEPB_DISPLAY_NAME = "Acute type B viral hepatitis";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";	
	
	public static void main(String[] args) throws Exception {
		
		AcuteHepatitisBCaseReport document = HEPB.createAcuteHepatitisBCaseReport().init();
		
		setHeader(document);
		
		setPatient(document);
		setReporter(document);
		setCustodian(document);
		setVerifier(document);
		
		setSocialHistorySection(document);
		setClinicalInformationSection(document);
		setEncountersSection(document);
		setDxTestsSection(document);
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
			System.out.println("Hepatitis B document is valid");
		} else {
			System.out.println("Hepatitis B document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "SampleHepatitisBCDA.xml");
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
		patientName.addFamily("Harvey");
		patientName.addGiven("Hellen");
		
		CE patientGender = Datatypes.createCE("F", "2.16.840.1.113883.5.1", "HL7", "Female");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
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
		
		II reporterId = Datatypes.createII(TEST_ROOT, "999");
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addCity(TEST_CITY);
		reporterAddress.addState(TEST_STATE);
		
		TEL reporterTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Welby");
		reporterName.addGiven("Warren");
		
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
		custodianOrgName.addText("Massachusetts Health Data Exchange");		
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
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(TEST_ROOT, "5555");
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		
		TEL verifierTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Welby");
		personName.addGiven("Warren");
		
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
	 *   Acute HepatitisB Possible Exposure Location (SHOULD) 0..*
	 *   Acute HepatitisB Actual Blood And Or Body Fluid Exposure observation (SHOULD) 0..* 
	 *   Acute HepatitisB Job Related Body Fluid Exposure Risk Frequency observation (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		AcuteHepatitisBSocialHistorySection socialHistorySection = HEPB.createAcuteHepatitisBSocialHistorySection().init();
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
			CD code = raceCodes.get(i);
			if (code != null) {
				RaceObservation raceObservation = PHCR.createRaceObservation().init();
				raceObservation.getValues().add(code);
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
		
		String occupationSectionText1 = "Occupation - Healthcare Support Occupation, September 2010 - present";
		String occupationSectionText2 = "Occupation Location - Good Health Hospital, 54 Storrow Drive, Boston MA 01592 (tel:+1-617-555-9320)"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS();
			IVXB_TS occupationLowTime = Datatypes.createIVXB_TS();
			occupationLowTime.setValue("20100901000000-0500");
			occupationEffectiveTime.setLow(occupationLowTime);
			CD occupationCode = Datatypes.createCD("31-0000", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Healthcare Support Occupations");

			AD locationAddress = Datatypes.createAD(); 
			locationAddress.addStreetAddressLine("54 Storrow Drive");
			locationAddress.addCity(TEST_CITY);
			locationAddress.addState(TEST_STATE);
			locationAddress.addPostalCode("01592");

			TEL locationTelecom = Datatypes.createTEL("tel:+1-617-555-9320");

			PN locationName = Datatypes.createPN();
			locationName.addText("Good Health Hospital");
			
			IVL_TS industryHistoryEffectiveTime = Datatypes.createIVL_TS(); 
			IVXB_TS industryHistoryLowTime = Datatypes.createIVXB_TS();
			industryHistoryLowTime.setValue("20100901000000-0500");
			industryHistoryEffectiveTime.setLow(industryHistoryLowTime);
			CD industryHistoryCode = Datatypes.createCD("62", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Health Care and Social Assistance");

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
			
			if (industryHistoryEffectiveTime != null) {
				occupationIndustryHxObservation.setEffectiveTime(industryHistoryEffectiveTime);
			}
			if (industryHistoryCode != null) {
				occupationIndustryHxObservation.getValues().add(industryHistoryCode);
			}

			hasSocialHistory = true;
		}

		
		// Acute Hepatitis B Actual Blood And Or Body Fluid Exposure observation (SHOULD) 0..* 
		// - if exists, must have a code (VS) and value
		
		boolean hasExposure = true;
		
		II bodyFluidExposureId = Datatypes.createII(NullFlavor.NI);
		CD bodyFluidExposureCode = Datatypes.createCD("55218-2", LOINC_OID, LOINC_SYSTEM_NAME, "Date of actual exposure to blood and or body fluid");
		TS bodyFluidExposureValue = Datatypes.createTS("20110222000000-0500");
		String bloodOrBodyFluidExposureSectionText = "Actual blood and/or body fluid exposure date - " + timeStampFormat(bodyFluidExposureValue.getValue(), TEST_DATE_FORMAT);
		
		if (hasExposure) {

			AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation bodyFluidExposure = HEPB.createAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation().init();
			socialHistorySection.addObservation(bodyFluidExposure);
			((Entry) bodyFluidExposure.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (bodyFluidExposureId != null) {
				bodyFluidExposure.getIds().add(bodyFluidExposureId);
			}
			if (bodyFluidExposureCode != null) {
				bodyFluidExposure.setCode(bodyFluidExposureCode);
			}
			if (bodyFluidExposureValue != null) {
				bodyFluidExposure.getValues().add(bodyFluidExposureValue);
			}

			hasSocialHistory = true;
		}
		
		// Acute HepatitisB Job Related Body Fluid Exposure Risk Frequency observation (SHOULD) 0..* 
		// - if exists, must have a value 
		
		boolean hasJobRelatedBodyFluidExposureRiskFactor = true;
		
		CD jobRelatedBodyFluidExposureRiskFactorValue = Datatypes.createCD("70232002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Frequent");
		String jobRelatedBodyFluidExposureRiskFactorSectionText1 = "Job Related Body Fluid Exposure Risk Factor - Frequent";
		
		if (hasJobRelatedBodyFluidExposureRiskFactor) {
		
			JobRelatedBodyFluidExposureRiskFrequencyObservation riskFactor = HEPB.createJobRelatedBodyFluidExposureRiskFrequencyObservation().init();
			socialHistorySection.addObservation(riskFactor);
			((Entry) riskFactor.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (jobRelatedBodyFluidExposureRiskFactorValue != null) {
				riskFactor.getValues().add(jobRelatedBodyFluidExposureRiskFactorValue);
			}
			
			hasSocialHistory = true;
		}
		
		// Acute Hepatitis B socio-behavioral boolean risk factor (SHOULD) 0..*
		// Value Set 2.16.840.1.114222.4.11.3228
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?oid=2.16.840.1.114222.4.11.3228
		
		boolean hasSocioBehavioralRiskFactor = true;
		
		II sharedRazorRiskFactorId = Datatypes.createII(NullFlavor.NI);
		IVL_TS sharedRazorRiskFactorTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		CD sharedRazorRiskFactorCode = Datatypes.createCD("55211-7", SNOMED_OID, SNOMED_SYSTEM_NAME, "Shared razor, toothbrushes or nail care items");
		
		II drugUserRiskFactorId = Datatypes.createII(NullFlavor.NI);
		IVL_TS drugUserRiskFactorTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		CD drugUserRiskFactorCode = Datatypes.createCD("226034001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Injecting drug user");
		
		String behaviorRiskFactorSectionText1 = "Socio-behavioral Risk Factor - " + sharedRazorRiskFactorCode.getDisplayName();
		String behaviorRiskFactorSectionText2 = "Socio-behavioral Risk Factor - NOT " + drugUserRiskFactorCode.getDisplayName();
		
		if (hasSocioBehavioralRiskFactor) {
		
			AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation riskFactor1 = HEPB.createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation().init();
			socialHistorySection.addObservation(riskFactor1);
			((Entry) riskFactor1.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (sharedRazorRiskFactorId != null) {
				riskFactor1.getIds().add(sharedRazorRiskFactorId);
			}
			if (sharedRazorRiskFactorTime != null) {
				riskFactor1.setEffectiveTime(sharedRazorRiskFactorTime);
			}
			if (sharedRazorRiskFactorCode != null) {
				riskFactor1.getValues().add(sharedRazorRiskFactorCode);
			}
			riskFactor1.setNegationInd(false);
		
			
			AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation riskFactor2 = HEPB.createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation().init();
			socialHistorySection.addObservation(riskFactor2);
			((Entry) riskFactor2.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			if (drugUserRiskFactorId != null) {
				riskFactor2.getIds().add(drugUserRiskFactorId);
			}
			if (drugUserRiskFactorTime != null) {
				riskFactor2.setEffectiveTime(drugUserRiskFactorTime);
			}
			if (drugUserRiskFactorCode != null) {
				riskFactor2.getValues().add(drugUserRiskFactorCode);
			}
			riskFactor2.setNegationInd(true);
		
			hasSocialHistory = true;
		}

		// Hepatitis B Possible Exposure Location (SHOULD) 0..*
		// Transmission Setting Value Set 2.16.840.1.114222.4.11.1052
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?oid=2.16.840.1.114222.4.11.1052
		
		boolean hasExposureLocation = true;
		String locationStreetAddress = "2525 South Street";
		String locationCity = "Cambridge";
		String locationPostalcode = "01573";
		String locationTelephone = "tel:+1-617-555-4387";
		String locationTypeCode = "264362003";
		String locationTypeDisplayName = "Home (environment)";
		String locationName = "Home (environment)";
		
		String exposureLocationSectionText = "Possible Exposure Location - Home (environment) " + locationStreetAddress + ", " + locationCity + ", " 
			+ TEST_STATE + " " + locationPostalcode + " (" + locationTelephone + ")";
		
		if (hasExposureLocation) {
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS("20110222000000-0500");

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addStreetAddressLine(locationStreetAddress);
			exposureLocationAddress.addCity(locationCity);
			exposureLocationAddress.addState(TEST_STATE);
			exposureLocationAddress.addPostalCode(locationPostalcode);

			TEL exposureLocationTelecom = Datatypes.createTEL(locationTelephone);

			CE exposureLocationTypeCode = Datatypes.createCE(locationTypeCode, SNOMED_OID, SNOMED_SYSTEM_NAME, locationTypeDisplayName);
			
			PN exposureLocationName = Datatypes.createPN();
			exposureLocationName.addText(locationName);

			AcuteHepatitisBPossibleExposureLocationAndTypeAct locationAndTypeAct = HEPB.createAcuteHepatitisBPossibleExposureLocationAndTypeAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("281638009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Hepatitis B contact");

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

			locationAndTypeAct.setStatusCode(Datatypes.createCS("completed"));
			
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
			buffer.append("            " + "            " + "<caption>" + "Acute Hepatitis B Social History Section" + "</caption>");
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
			
			// blood or body fluid exposure
			items.add(bloodOrBodyFluidExposureSectionText);
			
			// job related body fluid exposure risk frequency
			items.add(jobRelatedBodyFluidExposureRiskFactorSectionText1);
			
			// Socio-behavioral risk factor observation
			items.add(behaviorRiskFactorSectionText1);
			items.add(behaviorRiskFactorSectionText2);
			
			// possible exposure location act
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
	 *   Acute Hepatitis B Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Acute Hepatitis B Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 *     
	 *   Acute hepatitis B risk associated procedure
	 *   Viral hepatitis history observation
	 *   STD history observation
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		AcuteHepatitisBPHCRClinicalInformationSection clinicalInformationSection = HEPB.createAcuteHepatitisBPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Acute Hepatitis B Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD(HEPB_CODE, SNOMED_OID, SNOMED_SYSTEM_NAME, HEPB_DISPLAY_NAME);
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_REPORT);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - " + HEPB_DISPLAY_NAME;
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Condition diagnosed by Dr Warren Welby";
		
		AcuteHepatitisBCaseObservation caseObservation = HEPB.createAcuteHepatitisBCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// Case Observation > Author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II authorId = Datatypes.createII(TEST_ROOT, "999");
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addStreetAddressLine("31 East First Street");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL(TEST_TELECOM);
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Welby");
		authorName.addGiven("Warren");
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
		
		II informantId = Datatypes.createII(TEST_ROOT, "999");
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("Welby");
		informantName.addGiven("Warren");
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
		
		boolean symptomAsymptomatic = false;
		boolean symptomJaundice = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Asymptomatic (84387000 - SNOMEDCT)
		if (symptomAsymptomatic || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asymptomatic"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomAsymptomatic);
			items.add("Signs and Symptoms - Asymptomatic " + (symptomAsymptomatic ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Jaundice (18165001 - SNOMEDCT)
		if (symptomJaundice || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("18165001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Jaundice"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_REPORT));
			signsSymptomsNegInd.add(!symptomJaundice);
			items.add("Signs and Symptoms - Jaundice " + (symptomJaundice ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT) : "not reported"));
		}
				
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			AcuteHepatitisBSignsAndSymptomsObservation symptomsObservation = HEPB.createAcuteHepatitisBSignsAndSymptomsObservation().init();
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
		
		
		// Acute hepatitis B risk associated procedure
		IVL_TS procedureEffectiveTime = Datatypes.createIVL_TS();
		procedureEffectiveTime.setNullFlavor(NullFlavor.UNK);
		CD riskCode = Datatypes.createCD("428324008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Piercing of tongue");
		String patientRiskAssociatedProcedureText = "Acute Hepatitis B risk associated procedure - " + riskCode.getDisplayName();
		
		AcuteHepatitisBRiskAssociatedProcedure riskProcedure = HEPB.createAcuteHepatitisBRiskAssociatedProcedure().init();
		clinicalInformationSection.addProcedure(riskProcedure);
		((Entry) riskProcedure.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		if (procedureEffectiveTime != null) {
			riskProcedure.setEffectiveTime(procedureEffectiveTime);
		}
		if (riskCode != null) {
			riskProcedure.setCode(riskCode);
		}
		
		items.add(patientRiskAssociatedProcedureText);
		

		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Acute Hepatitis B Clinical Information Section" + "</caption>");
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
		
		II encounter1Id = Datatypes.createII(NullFlavor.NI);
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		CD encounter1Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		
		String encounter1SectionText = timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT) + " at Welby Family Practice, 31 East First Street, Boston, MA 01572 (tel:+1-617-555-3101)";
		String encounter1PerformerSectionText = encounter1Type.getDisplayName() + " encounter with Dr. Warren Welby MD";
		
		EncountersActivity encounters1Activity = createEncountersActivity(activity1IdList, encounter1EffectiveTime, encounter1Type);
		encountersSection.addEncounter(encounters1Activity);
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
	 *   > Acute Hepatitis B Result Organizer (MAY) 0..*
	 *   > Acute Hepatitis B Result Observation (SHOULD) 0..*
	 *   > Imaging Observation (MAY) 0..*
	 *   
	 * @param document
	 * @throws Exception
	 */
	public static void setDxTestsSection(PublicHealthCaseReport document) throws Exception {
		
		// Diagnostic and Laboratory Tests (SHOULD)
		AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection dxTestsSection = HEPB.createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection().init();
		document.addSection(dxTestsSection);
		
		// Hepatitis B core Result Observation
		List<II> abIgMIdList = new ArrayList<II>();
		abIgMIdList.add(Datatypes.createII(NullFlavor.NI));
		CD abIgMCode = Datatypes.createCD("16933-4", LOINC_OID, LOINC_SYSTEM_NAME, "HBV core Ab Ser Ql"); 
 

		IVL_TS abIgMEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		ANY abIgMValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		CE abIgMSpecimenType = Datatypes.createCE("119297000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Blood Specimen");
		
		String abIgMLabObservationSectionText1 = abIgMSpecimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT) + ", " + abIgMCode.getDisplayName() + " result: Positive";
		String abIgMLabObservationSectionText2 = "Quest Diagnostics Laboratory, 336 Main St, Boston, MA 01577 (tel:+1-617-555-4209)";
			
		AcuteHepatitisBResultObservation abIgMObservation = createAcuteHepatitisBResultObservation(abIgMIdList, abIgMCode, abIgMEffectiveTime, abIgMValue, abIgMSpecimenType);
		abIgMObservation.setMoodCode(x_ActMoodDocumentObservation.EVN);
		dxTestsSection.addObservation(abIgMObservation);
		((Entry) abIgMObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Acute Hepatitis B Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		 
		// lab observation
		items.add(abIgMLabObservationSectionText1);
		items.add(abIgMLabObservationSectionText2);

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
		AcuteHepatitisBImmunizationSection immunizationsSection = HEPB.createAcuteHepatitisBImmunizationSection().init();
		immunizationsSection.setTitle(Datatypes.createST("Acute Hepatitis B Immunizations"));
		document.addSection(immunizationsSection);
		
		// HepB Vaccine
		String hepBVaccineMaterialCode = "45";
		String hepBVaccineMaterialDisplayName = "Hepatitis B vaccine";
		int seriesNumber = 1;
		String hepBVaccine_immunizationSectionText = hepBVaccineMaterialDisplayName + " 1 - not recieved";
				
		List<II> activityId = new ArrayList<II>();
		activityId.add(Datatypes.createII(NullFlavor.NI));
		CE routeCode = Datatypes.createCE("IM", "2.16.840.1.113883.5.112", "RouteOfAdministration", "Intramuscular injection");
		CE materialCode = Datatypes.createCE(hepBVaccineMaterialCode, "2.16.840.1.113883.6.59", "CVX", hepBVaccineMaterialDisplayName);
		EN materialName = Datatypes.createEN();
		materialName.addText(hepBVaccineMaterialDisplayName);
		ED materialOriginalText = Datatypes.createED(hepBVaccineMaterialDisplayName);

		// Medication Activity	(required) - if exists, must have an (II activityId)
		AcuteHepatitisBImmunizationActivity medicationActivity = HEPB.createAcuteHepatitisBImmunizationActivity().init();
		medicationActivity.setMoodCode(x_DocumentSubstanceMood.EVN);
		medicationActivity.setNegationInd(true);
		Consumable consumable = CDA.createConsumable();
		AcuteHepatitisBImmunizationProduct product = HEPB.createAcuteHepatitisBImmunizationProduct().init();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		Organization manufacturer = CDA.createOrganization();
		product.setManufacturerOrganization(manufacturer);
		consumable.setManufacturedProduct(product);
		medicationActivity.setConsumable(consumable);
			
		// Medication Series Number Observation
		if (seriesNumber > 0) {
			INT immunizationSeries = Datatypes.createINT();
			immunizationSeries.setValue(seriesNumber);
			MedicationSeriesNumberObservation medicationNumberObservation = CCD.createMedicationSeriesNumberObservation().init();
			medicationNumberObservation.getValues().add(immunizationSeries);
			medicationNumberObservation.setStatusCode(Datatypes.createCS("completed"));
			medicationActivity.addObservation(medicationNumberObservation);
			((EntryRelationship) medicationNumberObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
		}
			
		for (int i=0; i < activityId.size(); i++) {
			medicationActivity.getIds().add(activityId.get(i));
		}
		if (routeCode != null) medicationActivity.setRouteCode(routeCode);
		if (materialCode != null) {
			material.setCode(materialCode);
			material.getCode().setOriginalText(materialOriginalText);
		}
		if (materialName != null) material.setName(materialName);
			
		// Activity Information Source (physician)
		II providerId = Datatypes.createII(NullFlavor.UNK);

		PN providerName = Datatypes.createPN();
		providerName.addFamily("Welby");
		providerName.addGiven("Warren");		
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
			
		immunizationsSection.addSubstanceAdministration(medicationActivity);
		((Entry) medicationActivity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Acute Hepatitis B Immunizations Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// immunization
		items.add(hepBVaccine_immunizationSectionText);

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
		performerAddress.addStreetAddressLine("31 East First Street");
		performerAddress.addCity(TEST_CITY);
		performerAddress.addState(TEST_STATE);
		performerAddress.addPostalCode(TEST_POSTALCODE);
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+617-555-3101"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Welby");
		performerPN.addGiven("Warren");
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
		participantAddress.addStreetAddressLine("31 East First Street");
		participantAddress.addCity(TEST_CITY);
		participantAddress.addState(TEST_STATE);
		participantAddress.addPostalCode(TEST_POSTALCODE);
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-617-555-3101"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("Welby Family Practice");
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
	
	private static AcuteHepatitisBResultObservation createAcuteHepatitisBResultObservation(List<II> idList, CD code, IVL_TS effectiveTime, ANY value, 
			CE specimenType) throws Exception {
		
		// Result Observation
		AcuteHepatitisBResultObservation observation = HEPB.createAcuteHepatitisBResultObservation().init();
		
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
		
		return observation;
	}


}
