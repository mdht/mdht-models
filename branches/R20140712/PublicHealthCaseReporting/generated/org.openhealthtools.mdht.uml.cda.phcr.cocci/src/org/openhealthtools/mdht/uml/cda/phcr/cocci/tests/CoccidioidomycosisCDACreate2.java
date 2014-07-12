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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ParentDocument;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.RelatedDocument;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO;
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
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class CoccidioidomycosisCDACreate2 {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static CocciFactory COCCI = CocciFactory.eINSTANCE;
	
	public static String PATIENT_ID = "AZ35988134";
	
	public static String TIME_STAMP_DOB = "19650402000000-0700";           // 0700 - Mountain Standard Time (MST)
	public static String TIME_STAMP_SYMPTOMS = "20110716000000-0700";
	public static String TIME_STAMP_ENCOUNTER1 = "20110719094500-0700";
	public static String TIME_STAMP_ENCOUNTER2 = "20110808102500-0700";
	public static String TIME_STAMP_ENCOUNTER3 = "20110907114500-0700";
	public static String TIME_STAMP_REPORT = "20110907143000-0700";
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static String UUID_RPLC = "b48d37ef-afd4-448f-8098-2ad4f6e7ab13";
	public static int VERSION = 2;
	
	public static void main(String[] args) throws Exception {
		
		CoccidioidesCaseReport document = COCCI.createCoccidioidesCaseReport().init();
		
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
			System.out.println("Coccidioides document is valid");
		} else {
			System.out.println("Coccidioides document is invalid");
		}
		
		// Output document to file
		String filePathOut = "samples/";
		File fileOut = new File(filePathOut, "CoccidioidomycosisSampleCDA2.xml");
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
		
		II patientId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("18 W Diamond Bell Ranch Rd");
		patientAddress.addCity("Three Points");
		patientAddress.addState("AZ");
		patientAddress.addPostalCode("85736");
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-520-555-5555");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Rodriguez");
		patientName.addGiven("Manuel");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
		CE patientRace = Datatypes.createCE("2106-3", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "White");
		CE patientEthnicity = Datatypes.createCE("2135-2", "2.16.840.1.113883.6.238", "Ethnicity Group", "Hispanic or Latino");
		
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
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("1501 N. Campbell Ave");
		reporterAddress.addCity("Tucson");
		reporterAddress.addState("AZ");
		reporterAddress.addPostalCode("85724");
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-520-694-0111");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Trenton");
		reporterName.addGiven("Betty");
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
		custodianOrgName.addText("State Of Arizona Health Information Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("100 N. 15th Ave, #400");
		custodianOrgAddress.addCity("Phoenix");
		custodianOrgAddress.addState("AZ");
		custodianOrgAddress.addPostalCode("85007");
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-602-881-5738");
		
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
		verifierAddress.addStreetAddressLine("1501 N. Campbell Av");
		verifierAddress.addCity("Tucson");
		verifierAddress.addState("AZ");
		verifierAddress.addPostalCode("85724");
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-520-694-0111");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Trenton");
		personName.addGiven("Betty");
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
	 *   Coccidioidomycosis Possible Exposure Location Act (MAY) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(PublicHealthCaseReport document) throws Exception {
		
		// Social History Section (optional)
		CoccidioidesPHCRSocialHistorySection socialHistorySection = COCCI.createCoccidioidesPHCRSocialHistorySection().init();
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
		
		String occupationSectionText1 = "Occupation - Construction and Extraction, June 2009 - present";
		String occupationSectionText2 = "Occupation Location - Arizona Construction LLC, Commercial and Institutional Building Construction in Tucson, AZ  85710"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS("20090600000000-0700");
			CD occupationCode = Datatypes.createCD("47-0000", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Construction and Extraction Occupations");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addCity("Tucson");
			locationAddress.addState("AZ");
			locationAddress.addPostalCode("85710");

			TEL locationTelecom = Datatypes.createTEL("tel:+1-520-558-5858"); 

			PN locationName = Datatypes.createPN();
			locationName.addText("Arizona Construction LLC");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS("20090600000000-0700");
			CD occupationHistoryCode = Datatypes.createCD("23622", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Commercial and Institutional Building Construction");

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
		
		// Coccidioidomycosis Possible Exposure Location Act
		boolean hasExposureLocation = true;
		String locationTypeCode = "285141008";
		String locationTypeDisplayName = "Work Environment";
		
		String exposureLocationSectionText = "Possible Exposure Location - Work Environment, Tucson, AZ";
		
		if (hasExposureLocation) {
			IVL_TS exposureLocationTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);

			AD exposureLocationAddress = Datatypes.createAD();
			exposureLocationAddress.addCity("Tucson");
			exposureLocationAddress.addState("AZ");

			TEL exposureLocationTelecom = Datatypes.createTEL();
			exposureLocationTelecom.setNullFlavor(NullFlavor.UNK);

			CE exposureLocationTypeCode = Datatypes.createCE(locationTypeCode, SNOMED_OID, SNOMED_SYSTEM_NAME, locationTypeDisplayName);

			CoccidioidesPossibleExposureLocationAct locationAndTypeAct = COCCI.createCoccidioidesPossibleExposureLocationAct().init();

			CD actCode = locationAndTypeAct.getCode();

			CV qualifierValue1 = Datatypes.createCV();
			qualifierValue1.setCode("246090004");
			qualifierValue1.setCodeSystem(SNOMED_OID);
			qualifierValue1.setCodeSystemName(SNOMED_SYSTEM_NAME);
			qualifierValue1.setDisplayName("Associated finding");

			CD qualifierCode1 = Datatypes.createCD("TBD", "2.16.840.1.114222.4.5.274", "PHIN VADS", "Coccidioides immitis exposure");

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
			buffer.append("            " + "            " + "<caption>" + "Coccidioidomycosis Social History Section" + "</caption>");
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
	 *     > Coccidioides Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 *   Coccidioidomycosis Immunocompromised Medical Condition History Observation (MAY) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		CoccidioidesPHCRClinicalInformationSection clinicalInformationSection = COCCI.createCoccidioidesPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		CD reportableCode = Datatypes.createCD("60826002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Coccidioidomycosis");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_ENCOUNTER2);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - Coccidioidomycosis";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Condition diagnosed by Dr Betty Trenton MD";
		
		CoccidioidesCaseObservation caseObservation = COCCI.createCoccidioidesCaseObservation().init();
		clinicalInformationSection.addObservation(caseObservation);
		((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// case observation > time
		caseObservation.setEffectiveTime(reportableTime);
		
		// case observation > reportable code
		caseObservation.getValues().add(reportableCode);
		
		// case observation > author (SHOULD) 0..1
		TS authorEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II authorId = Datatypes.createII(NullFlavor.UNK);
		
		AD authorAddress = Datatypes.createAD();
		authorAddress.addStreetAddressLine("1501 N. Campbell Ave");
		authorAddress.addCity("Tucson");
		authorAddress.addState("AZ");
		authorAddress.addPostalCode("85724");
		
		TEL authorTelecom = Datatypes.createTEL("tel:+1-520-694-0111");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Trenton");
		authorName.addGiven("Betty");
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
		
		// case observation > informant (SHALL) 1..*
		
		II informantId = Datatypes.createII(NullFlavor.UNK);
		
		PN informantName = Datatypes.createPN();
		informantName.addFamily("Trenton");
		informantName.addGiven("Betty");
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

		// case observation > Signs and Symptoms (SHOULD) 0..* - if exists, must have a value (CD signSymptom)
		
		boolean symptomFever = true;
		boolean symptomFatigue = true;
		boolean symptomPersistentCough = true;
		boolean symptomPneumonia = true;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fatigue (84229001 - SNOMEDCT)
		if (symptomFatigue || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84229001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fatigue"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFatigue);
			items.add("Signs and Symptoms - Fatigue " + (symptomFatigue ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Persistent Cough (284523002 - SNOMEDCT)
		if (symptomPersistentCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("284523002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Persistent Cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPersistentCough);
			items.add("Signs and Symptoms - Persistent Cough " + (symptomPersistentCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Pneumonia (233604007 - SNOMEDCT)
		if (symptomPneumonia || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("233604007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pneumonia"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomPneumonia);
			items.add("Signs and Symptoms - Pneumonia " + (symptomPneumonia ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		
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
		

		// Coccidioides Immunocompromised Medical Condition History Observation (SHOULD) 0..*
		
		IVL_TS asthmaEffectiveTime = Datatypes.createIVL_TS();
		IVXB_TS asthmaTimeLow = Datatypes.createIVXB_TS();
		asthmaTimeLow.setValue(TIME_STAMP_ENCOUNTER2);              
		asthmaEffectiveTime.setLow(asthmaTimeLow);
		
		CD historyCode = Datatypes.createCD("370391006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Patient immunosuppressed");
		
		CD asthmaCode = Datatypes.createCD("64572001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Condition");
		CD asthmaValueCode = Datatypes.createCD("195967001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asthma");
		CE asthmaStatusCode = Datatypes.createCE("90734009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chronic");
		
		String immunocompromisedHistorySectionText1 = "Relevant medical history includes " + asthmaStatusCode.getDisplayName() + " " + asthmaValueCode.getDisplayName();

		CoccidioidesImmunosuppressedMedicalConditionHistoryObservation immunocompromisedHistoryObservation1 = COCCI.createCoccidioidesImmunosuppressedMedicalConditionHistoryObservation().init();
		clinicalInformationSection.addObservation(immunocompromisedHistoryObservation1);
		((Entry) immunocompromisedHistoryObservation1.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		immunocompromisedHistoryObservation1.getValues().add(historyCode);
		
		CoccidioidesImmunosuppressedMedicalConditionProblemObservation historyObservation1problem = COCCI.createCoccidioidesImmunosuppressedMedicalConditionProblemObservation().init();
		immunocompromisedHistoryObservation1.addObservation(historyObservation1problem);
		((EntryRelationship) historyObservation1problem.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		((EntryRelationship) historyObservation1problem.eContainer()).setInversionInd(true);
		
		historyObservation1problem.setNegationInd(false);
		historyObservation1problem.setEffectiveTime(asthmaEffectiveTime);
		historyObservation1problem.setCode(asthmaCode);
		historyObservation1problem.getValues().add(asthmaValueCode);	
		
		II asthmaInformantId = Datatypes.createII(NullFlavor.UNK);
		Organization asthmaInformantOrganization = CDA.createOrganization();
		ON asthmaOrganizationName = Datatypes.createON();
		asthmaOrganizationName.addText("University of Arizona Medical Center");
		asthmaInformantOrganization.getNames().add(asthmaOrganizationName);
		
		Informant12 asthmaInformant = CDA.createInformant12();
		AssignedEntity asthmaInformantEntity = CDA.createAssignedEntity();
		asthmaInformantEntity.getIds().add(asthmaInformantId);
		asthmaInformantEntity.getRepresentedOrganizations().add(asthmaInformantOrganization);
		asthmaInformant.setAssignedEntity(asthmaInformantEntity);
		historyObservation1problem.getInformants().add(asthmaInformant);
		
		ProblemStatusObservation asthmaStatusObservation = CCD.createProblemStatusObservation().init();
		historyObservation1problem.addObservation(asthmaStatusObservation);
		((EntryRelationship) asthmaStatusObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		
		asthmaStatusObservation.getValues().add(asthmaStatusCode);
		items.add(immunocompromisedHistorySectionText1);
		

		IVL_TS diabetesEffectiveTime = Datatypes.createIVL_TS();
		IVXB_TS diabetesTimeLow = Datatypes.createIVXB_TS();
		diabetesTimeLow.setValue(TIME_STAMP_ENCOUNTER2);
		diabetesEffectiveTime.setLow(diabetesTimeLow);
		
		CD diabetesCode = Datatypes.createCD("64572001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Condition");
		CD diabetesValueCode = Datatypes.createCD("44054006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Diabetes type II");
		CE diabetesStatusCode = Datatypes.createCE("55561003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Active");
		
		String immunocompromisedHistorySectionText2 = "Relevant medical history includes " + diabetesStatusCode.getDisplayName() + " " + diabetesValueCode.getDisplayName();

		CoccidioidesImmunosuppressedMedicalConditionProblemObservation historyObservation2problem = COCCI.createCoccidioidesImmunosuppressedMedicalConditionProblemObservation().init();
		immunocompromisedHistoryObservation1.addObservation(historyObservation2problem);
		((EntryRelationship) historyObservation2problem.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		((EntryRelationship) historyObservation2problem.eContainer()).setInversionInd(true);
		
		historyObservation2problem.setNegationInd(false);
		historyObservation2problem.setEffectiveTime(diabetesEffectiveTime);
		historyObservation2problem.setCode(diabetesCode);
		historyObservation2problem.getValues().add(diabetesValueCode);
		
		II diabetesInformantId = Datatypes.createII(NullFlavor.UNK);
		Organization diabetesInformantOrganization = CDA.createOrganization();
		ON diabetesOrganizationName = Datatypes.createON();
		diabetesOrganizationName.addText("University of Arizona Medical Center");
		diabetesInformantOrganization.getNames().add(diabetesOrganizationName);
		
		Informant12 diabetesInformant = CDA.createInformant12();
		AssignedEntity diabetesInformantEntity = CDA.createAssignedEntity();
		diabetesInformantEntity.getIds().add(diabetesInformantId);
		diabetesInformantEntity.getRepresentedOrganizations().add(diabetesInformantOrganization);
		diabetesInformant.setAssignedEntity(diabetesInformantEntity);
		historyObservation2problem.getInformants().add(diabetesInformant);
		
		ProblemStatusObservation diabetesStatusObservation = CCD.createProblemStatusObservation().init();
		historyObservation2problem.addObservation(diabetesStatusObservation);
		((EntryRelationship) diabetesStatusObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		
		diabetesStatusObservation.getValues().add(diabetesStatusCode);
		items.add(immunocompromisedHistorySectionText2);
		
		
		// Patient Condition (Alive) Observation (MAY) 0..1
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER3);		
		String patientConditionSectionText = "Patient is alive " + timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT);
	
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
		buffer.append("            " + "            " + "<caption>" + "Coccidioides Clinical Information Section" + "</caption>");
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
	 *   Coccidioides Therapeutic Regimen Act (SHALL) 1..1
	 *     > Condition Observation (SHALL) 1..1
	 *     > Coccidioides Treatment Given Substance Administration (SHOULD) 0..*
	 *     > Coccidioides Treatment Not Given Substance Administration (SHOULD) 0..*
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setTreatmentInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Treatment Information Section (optional)
		CoccidioidesPHCRTreatmentInformationSection treatmentInformationSection = COCCI.createCoccidioidesPHCRTreatmentInformationSection().init();
		boolean hasTreatmentInformation = true;
		
		// Therapeutic Regimen Act (required) - must have both (II caseId) and value (CD caseCode)
		
		II caseId = Datatypes.createII(TEST_ROOT, "AZ35988134");
		CD caseCode = Datatypes.createCD("60826002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Coccidioidomycosis");
		
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
			
			CoccidioidesTherapeuticRegimenAct regimenAct = COCCI.createCoccidioidesTherapeuticRegimenAct().init();
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
			timeLow.setValue(TIME_STAMP_ENCOUNTER3);
			subsAdminTime.setLow(timeLow);
			IVXB_TS timeHigh = Datatypes.createIVXB_TS();
			timeHigh.setValue("20111007114500-0700");
			subsAdminTime.setHigh(timeHigh);
			IVL_PQ doseQuantity = Datatypes.createIVL_PQ();
			doseQuantity.setValue(BigDecimal.valueOf(Double.valueOf("4")));
			IVL_PQ rateQuantity = Datatypes.createIVL_PQ();
			rateQuantity.setValue(Double.parseDouble("24"));
			rateQuantity.setUnit("H");
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			CE materialCode = Datatypes.createCE("4450", "2.16.840.1.113883.6.88", "RxNorm", "Fluconazole");
			EN materialName = Datatypes.createEN();
			materialName.addText("Fluconazole 200 MG Oral Tablet");
			
			String treatmentNotGivenSectionText1 = "Prescribed " + materialCode.getDisplayName() + " four times daily for 30 days prescribed on " + timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT);
				
			CoccidioidesTreatmentGivenSubstanceAdministration treatmentGivenSBADM = COCCI.createCoccidioidesTreatmentGivenSubstanceAdministration().init();
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
			if (doseQuantity != null) treatmentGivenSBADM.setDoseQuantity(doseQuantity);
			if (rateQuantity != null) treatmentGivenSBADM.setRateQuantity(rateQuantity);
			if (materialCode != null) material.setCode(materialCode);
			if (materialName != null) material.setName(materialName);

			regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
			((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Coccidioides Treatment Information Section" + "</caption>");
			buffer.append(System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// therapy condition id
			items.add(conditionIdSectionText);
			
			// treatments given
			items.add(treatmentNotGivenSectionText1);

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
		II encounter1Id = Datatypes.createII(TEST_ROOT, "AZ35988134-1");
		List<II> activity1IdList = new ArrayList<II>();
		activity1IdList.add(encounter1Id);
		IVL_TS encounter1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER1);
		CD encounter1Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter1SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER1, TEST_DATE_FORMAT) + " at University of Arizona Medical Center, Tucson, AZ";
		String encounter1PerformerSectionText = encounter1Type.getDisplayName() + " encounter with Dr. Betty Trenton MD";	
		
		// Second Encounter
		II encounter2Id = Datatypes.createII(TEST_ROOT, "AZ35988134-2");
		List<II> activity2IdList = new ArrayList<II>();
		activity2IdList.add(encounter2Id);
		IVL_TS encounter2EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD encounter2Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter2SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + " at University of Arizona Medical Center, Tucson, AZ";
		String encounter2PerformerSectionText = encounter2Type.getDisplayName() + " encounter with Dr. Betty Trenton MD";
		
		// Third Encounter
		II encounter3Id = Datatypes.createII(TEST_ROOT, "AZ35988134-3");
		List<II> activity3IdList = new ArrayList<II>();
		activity3IdList.add(encounter3Id);
		IVL_TS encounter3EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER3);
		CD encounter3Type = Datatypes.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory");
		
		String encounter3SectionText = timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT) + " at University of Arizona Medical Center, Tucson, AZ";
		String encounter3PerformerSectionText = encounter3Type.getDisplayName() + " encounter with Dr. Betty Trenton MD";
		
		
		EncountersActivity encounters1Activity = createEncountersActivity(activity1IdList, encounter1EffectiveTime, encounter1Type);
		encountersSection.addEncounter(encounters1Activity);
		((Entry) encounters1Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		EncountersActivity encounters2Activity = createEncountersActivity(activity2IdList, encounter2EffectiveTime, encounter2Type);
		encountersSection.addEncounter(encounters2Activity);
		((Entry) encounters2Activity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
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
		CoccidioidesPHCRRelevantDxTestsSection dxTestsSection = COCCI.createCoccidioidesPHCRRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);

		List<II> organizerIdList = new ArrayList<II>();
		organizerIdList.add(Datatypes.createII(NullFlavor.NI));
		CD organizerTypeCode = Datatypes.createCD("68793005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Serology");
		IVL_TS organizerEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CE specimenType = Datatypes.createCE("119364003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Serum");
		
		CD collectionProcedureCode = Datatypes.createCD("22778000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Venipuncture (procedure)");
		IVL_TS collectionTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		CD collectionTargetSiteCode = Datatypes.createCD("66480008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Left forearm");
		II collectionOrganizationId = Datatypes.createII(NullFlavor.UNK);
		ON collectionOrganizationName = Datatypes.createON();
		collectionOrganizationName.addText("University of Arizona Medical Center");
		CE collectionSpecimenTypeCode = Datatypes.createCE("119364003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Serum");
		
		II labOrganizerInformantId = Datatypes.createII(NullFlavor.UNK);
		ON labOrganizerOrganizationName = Datatypes.createON();
		labOrganizerOrganizationName.addText("University of Arizona Medical Center");
		
		AD labOrganizerOrganizationAddress = Datatypes.createAD();
		labOrganizerOrganizationAddress.addStreetAddressLine("1501 N. Campbell Ave");
		labOrganizerOrganizationAddress.addCity("Tucson");
		labOrganizerOrganizationAddress.addState("AZ");
		labOrganizerOrganizationAddress.addPostalCode("85724");
		
		TEL labOrganizerOrganizationTel = Datatypes.createTEL("tel:+1-520-694-0111");
		
		// Result Organizer (Serology)
		CoccidioidesResultOrganizer organizer = COCCI.createCoccidioidesResultOrganizer().init();
		dxTestsSection.addOrganizer(organizer);
		((Entry) organizer.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < organizerIdList.size(); i++) {
			organizer.getIds().add(organizerIdList.get(i));
		}
		if (organizerTypeCode != null) organizer.setCode(organizerTypeCode);
		if (organizerEffectiveTime != null) organizer.setEffectiveTime(organizerEffectiveTime);
		
		if (specimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			organizer.getSpecimens().add(specimen);
			playingEntity.setCode(specimenType);
		}
		
		// Result Organizer > Specimen Collection Procedure
		SpecimenCollectionProcedure observationCollectionProcedure = PHCR.createSpecimenCollectionProcedure().init();
		observationCollectionProcedure.setCode(collectionProcedureCode);
		observationCollectionProcedure.setEffectiveTime(collectionTime);
		observationCollectionProcedure.getTargetSiteCodes().add(collectionTargetSiteCode);
		organizer.addProcedure(observationCollectionProcedure);
		
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
		PlayingEntity observationCollectionPlayingEntity = CDA.createPlayingEntity();
		observationCollectionPlayingEntity.setCode(collectionSpecimenTypeCode);
		observationCollectionParticipantRole.setPlayingEntity(observationCollectionPlayingEntity);
		observationCollectionParticipant.setParticipantRole(observationCollectionParticipantRole);
		observationCollectionProcedure.getParticipants().add(observationCollectionParticipant);
		
		// Result Organizer > Informant
		Informant12 labOrganizerInformant = CDA.createInformant12();
		AssignedEntity labOrganizerInformantEntity = CDA.createAssignedEntity();
		Organization labOrganizerOrganization = CDA.createOrganization();
		labOrganizerInformantEntity.getIds().add(labOrganizerInformantId);
		labOrganizerInformantEntity.getAddrs().add(labOrganizerOrganizationAddress);
		labOrganizerInformantEntity.getTelecoms().add(labOrganizerOrganizationTel);
		labOrganizerOrganization.getNames().add(labOrganizerOrganizationName);
		labOrganizerInformantEntity.getRepresentedOrganizations().add(labOrganizerOrganization);
		labOrganizerInformant.setAssignedEntity(labOrganizerInformantEntity);
		organizer.getInformants().add(labOrganizerInformant);
		
		// Result Observations
		
		CD obsIgGEIA = Datatypes.createCD("13947-7", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis IgG Ser Ql EIA");
		IVL_TS obsIgGEIATime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY obsIgGEIAValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String labObservationSectionText1 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + obsIgGEIA.getDisplayName() + " result: Positive";
		//String labObservationSectionText2 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";
		
		CoccidioidesResultObservation resultObservation1 = createCoccidioidesResultObservation(obsIgGEIA, obsIgGEIATime, obsIgGEIAValue);
		organizer.addObservation(resultObservation1);
		
		
		CD obsIgMEIA = Datatypes.createCD("13948-5", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis IgM Ser Ql EIA");
		IVL_TS obsIgMEIATime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY obsIgMEIAValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String labObservationSectionText3 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + obsIgMEIA.getDisplayName() + " result: Positive";
		//String labObservationSectionText4 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";
	
		CoccidioidesResultObservation resultObservation2 = createCoccidioidesResultObservation(obsIgMEIA, obsIgMEIATime, obsIgMEIAValue);
		organizer.addObservation(resultObservation2);
		
		CD obsIgGID = Datatypes.createCD("62459-3", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis IgG Ser Ql ID");
		IVL_TS obsIgGIDTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY obsIgGIDValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String labObservationSectionText5 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + obsIgGID.getDisplayName() + " result: Positive";
		//String labObservationSectionText6 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";

		CoccidioidesResultObservation resultObservation3 = createCoccidioidesResultObservation(obsIgGID, obsIgGIDTime, obsIgGIDValue);
		organizer.addObservation(resultObservation3);
		
		CD obsIgMID = Datatypes.createCD("62458-5", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis IgM Ser Ql ID");
		IVL_TS obsIgMIDTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		ANY obsIgMIDValue = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String labObservationSectionText7 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + obsIgMID.getDisplayName() + " result: Positive";
		//String labObservationSectionText8 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";

		CoccidioidesResultObservation resultObservation4 = createCoccidioidesResultObservation(obsIgMID, obsIgMIDTime, obsIgMIDValue);
		organizer.addObservation(resultObservation4);
		
		CD obsTitrCF = Datatypes.createCD("5096-3", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis Ab Titr Ser CF");
		IVL_TS obsTitrCFTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		
		INT titerNumerator = Datatypes.createINT();
		titerNumerator.setValue(1);
		INT titerDenominator = Datatypes.createINT();
		titerDenominator.setValue(16);
		RTO obsTitrCFValue = Datatypes.createRTO();
		obsTitrCFValue.setDenominator(titerDenominator);
		obsTitrCFValue.setNumerator(titerNumerator);	
		
		String labObservationSectionText9 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER2, TEST_DATE_FORMAT) + ", " + obsTitrCF.getDisplayName() + " result: 1:16";
		String labObservationSectionText10 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";
		
		CoccidioidesResultObservation resultObservation5 = createCoccidioidesResultObservation(obsTitrCF, obsTitrCFTime, obsTitrCFValue);
		organizer.addObservation(resultObservation5);
		
		
		// lab repeat of antibody titer
		CD obsTitrCF2 = Datatypes.createCD("5096-3", LOINC_OID, LOINC_SYSTEM_NAME, "C immitis Ab Titr Ser CF");
		IVL_TS obsTitrCF2Time = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER2);
		
		INT titer2Numerator = Datatypes.createINT();
		titer2Numerator.setValue(1);
		INT titer2Denominator = Datatypes.createINT();
		titer2Denominator.setValue(64);
		RTO obsTitrCF2Value = Datatypes.createRTO();
		obsTitrCF2Value.setDenominator(titer2Denominator);
		obsTitrCF2Value.setNumerator(titer2Numerator);	
		
		String labObservationSectionText11 = specimenType.getDisplayName() + " collected on " +
			timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT) + ", " + obsTitrCF.getDisplayName() + " result: 1:64";
		String labObservationSectionText12 = "University of Arizona Medical Center Laboratory, 1501 N. Campbell Ave, Tucson, AZ  (tel:520-694-0111)";
		
		CoccidioidesResultObservation resultObservation6 = createCoccidioidesResultObservation(obsTitrCF2, obsTitrCF2Time, obsTitrCF2Value);
		dxTestsSection.addObservation(resultObservation6);
		((Entry) resultObservation6.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		CE specimenType2 = Datatypes.createCE("119364003", SNOMED_OID, SNOMED_SYSTEM_NAME, "Serum");
		
		Specimen specimen = CDA.createSpecimen();
		SpecimenRole specimenRole = CDA.createSpecimenRole();
		PlayingEntity playingEntity = CDA.createPlayingEntity();
		specimenRole.setSpecimenPlayingEntity(playingEntity);
		specimen.setSpecimenRole(specimenRole);
		resultObservation6.getSpecimens().add(specimen);
		playingEntity.setCode(specimenType2);
		
		
		
		// Imaging Observation
		List<II> imageIds = new ArrayList<II>();
		imageIds.add(Datatypes.createII(TEST_ROOT, "ABC"));
		CD imageCode = Datatypes.createCD();
		imageCode.setCode("ASSERTION");
		imageCode.setCodeSystem("2.16.840.1.113883.5.4");
		imageCode.setCodeSystemName("HL7ActCode");
		IVL_TS imageEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_ENCOUNTER3);
		ANY imageValue = Datatypes.createCD("128309002", "2.16.840.1.113883.6.96", "SNOMED-CT", "Radiologic infiltrate");
		CE imageMethodType = Datatypes.createCE("168731009", "2.16.840.1.113883.6.96", "SNOMED-CT", "Standard chest X-ray");
		
		String imageObservationSectionText = imageMethodType.getDisplayName() + " from " + 
			timeStampFormat(TIME_STAMP_ENCOUNTER3, TEST_DATE_FORMAT) + " - radiologic infiltrate with localized nodules";
		
		File imageMediaFile = new File("samples/pneumonia2.jpg");
		String imageMediaId = "ABC";
		String imageMediaType = "image/jpeg";
			
		ImagingObservation imageObservation = PHCR.createImagingObservation().init();
		dxTestsSection.addObservation(imageObservation);
		((Entry) imageObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < imageIds.size(); i++) {
			imageObservation.getIds().add(imageIds.get(i));
		}
		if (imageCode != null) imageObservation.setCode(imageCode);
		if (imageEffectiveTime != null) imageObservation.setEffectiveTime(imageEffectiveTime);
		if (imageValue != null) imageObservation.getValues().add(imageValue);
		if (imageMethodType != null) imageObservation.getMethodCodes().add(imageMethodType);
		
		ObservationMedia obMedia = createMediaObservation(imageMediaFile, imageMediaId, imageMediaType);
		imageObservation.addObservationMedia(obMedia);
		((EntryRelationship) obMedia.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
		
		
		// Image Observation Informant
		II imageInformantId = Datatypes.createII(TEST_ROOT, "2872927");
		
		ON imageOrganizationName = Datatypes.createON();
		imageOrganizationName.addText("Radiology Clinic");		
		
		Informant12 imageInformant = CDA.createInformant12();
		AssignedEntity imageInformantEntity = CDA.createAssignedEntity();
		Organization imageOrganization = CDA.createOrganization();
		imageInformantEntity.getIds().add(imageInformantId);
		imageOrganization.getNames().add(imageOrganizationName);
		imageInformantEntity.getRepresentedOrganizations().add(imageOrganization);
		imageInformant.setAssignedEntity(imageInformantEntity);
		imageObservation.getInformants().add(imageInformant);		
		
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Coccidioides Diagnostic Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab observation
		items.add(labObservationSectionText1);
		//items.add(labObservationSectionText2);
		items.add(labObservationSectionText3);
		//items.add(labObservationSectionText4);
		items.add(labObservationSectionText5);
		//items.add(labObservationSectionText6);
		items.add(labObservationSectionText7);
		//items.add(labObservationSectionText8);
		items.add(labObservationSectionText9);
		items.add(labObservationSectionText10);
		items.add(labObservationSectionText11);
		items.add(labObservationSectionText12);
		
		// image observation
		items.add(imageObservationSectionText);

		buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append("            " + "            " + "<item>" + items.get(i) + "</item>" + System.getProperty("line.separator"));
		}
		String listItems = buffer.toString();
		
		StringBuffer buffer2 = new StringBuffer();
		buffer2.append("<renderMultiMedia referencedObject=");
		buffer2.append("\"" + imageMediaId + "\"");
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
		performerAddress.addStreetAddressLine("1501 N. Campbell Ave");
		performerAddress.addCity("Tucson");
		performerAddress.addState("AZ");
		performerAddress.addPostalCode("85724");
		adPerformerList.add(performerAddress);
		List<TEL> telPerformerList = new ArrayList<TEL>();
		telPerformerList.add(Datatypes.createTEL("tel:+1-520-694-0111"));
		List<PN> namePerformerList = new ArrayList<PN>();
		PN performerPN = Datatypes.createPN();
		performerPN.addFamily("Trenton");
		performerPN.addGiven("Betty");
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
		participantAddress.addStreetAddressLine("1501 N. Campbell Ave");
		participantAddress.addCity("Tucson");
		participantAddress.addState("AZ");
		participantAddress.addPostalCode("85724");
		adParticipantList.add(participantAddress);
		List<TEL> telParticipantList = new ArrayList<TEL>();
		telParticipantList.add(Datatypes.createTEL("tel:+1-520-694-0111"));
		List<PN> nameParticipantList = new ArrayList<PN>();
		PN participantPN = Datatypes.createPN();
		participantPN.addText("University of Arizona Medical Center");
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
	
	
	private static CoccidioidesResultObservation createCoccidioidesResultObservation(CD code, IVL_TS effectiveTime, ANY value) throws Exception {
		
		// Result Observation
		CoccidioidesResultObservation observation = COCCI.createCoccidioidesResultObservation().init();
		
		observation.getIds().add(Datatypes.createII(NullFlavor.NI));
		
		if (code != null) observation.setCode(code);
		if (effectiveTime != null) observation.setEffectiveTime(effectiveTime);
		if (value != null) observation.getValues().add(value);
		
		// Informant
		II labObservationInformantId = Datatypes.createII(NullFlavor.NI);
		
		ON labObservationOrganizationName = Datatypes.createON();
		labObservationOrganizationName.addText("University of Arizona Medical Center Laboratory");		
		
		AD labObservationOrganizationAddress = Datatypes.createAD();
		labObservationOrganizationAddress.addStreetAddressLine("1501 N. Campbell Ave");
		labObservationOrganizationAddress.addCity("Tucson");
		labObservationOrganizationAddress.addState("AZ");
		labObservationOrganizationAddress.addPostalCode("85724");
		
		TEL labObservationOrganizationTel = Datatypes.createTEL("tel:+1-520-694-0111");
		
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
		//FeatureMapUtil.addText(value.getMixed(), b64);
		//obMedia.setValue(value);
		value.setReference(Datatypes.createTEL(b64));
		obMedia.setValue(value);
		
		return obMedia;		
	}

}
