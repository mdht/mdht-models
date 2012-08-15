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
package org.openhealthtools.mdht.uml.cda.phcr.tss.tests;

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
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssFactory;
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

public class TSSCDACreateOLD {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static tssFactory TSS = tssFactory.eINSTANCE;
	
	public static String TIME_STAMP = "20110810102500-0500";
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_TELECOM = "tel:+1-608-555-5555";
	public static String TEST_CITY = "Janesville";
	public static String TEST_STATE = "WI";
	public static String TEST_POSTALCODE = "53545";	
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		//PublicHealthCaseReport document = PHCR.createPublicHealthCaseReport().init();
		ToxicShockSyndromeCaseReport document = TSS.createToxicShockSyndromeCaseReport().init();
		
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
		setImmunizationsSection(document);
		
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
		ST documentTitle = Datatypes.createST("Public Health Case Report");
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
		
		// document title
		ST title = documentTitle;
		document.setTitle(title);
		
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
		patientName.addFamily("TRENTON");
		patientName.addGiven("MICHAEL");
		
		CE patientGender = Datatypes.createCE("F", "2.16.840.1.113883.5.1", "HL7", "Female");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP);
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
		reporterName.addFamily("TRENTON");
		reporterName.addGiven("BETTY");
		
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
		custodianOrgName.addText("GOOD SAMARITAN HEALTH INFORMATION EXCHANGE");
		
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
		personName.addFamily("TRENTON");
		personName.addGiven("BARBARA");
		
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
		
		// Geotemporal history observation (SHOULD) 0..* - if exists, must have a value (CD locationCode)
		// ValueSet 2.16.840.1.114222.4.11.3201
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=9CE75E17-176B-DE11-9B52-0015173D1785
		
		CD locationCode1 = Datatypes.createCD("ARG", "1.0.3166.1", "ISO 3166-1", "ARGENTINA");
		IVL_TS locationTime1 = Datatypes.createIVL_TS(TIME_STAMP);
		CD locationCode2 = Datatypes.createCD("BRA", "1.0.3166.1", "ISO 3166-1", "BRAZIL");
		IVL_TS locationTime2 = Datatypes.createIVL_TS(TIME_STAMP);
		
		String geotemporalHistorySectionText1 = "Geotemporal history - Argentina";
		String geotemporalHistorySectionText2 = "Geotemporal history - Brazil";
		
		List<CD> geotemporalHistoryCodes = new ArrayList<CD>();
		List<IVL_TS> geotemporalHistoryEffectiveTimes = new ArrayList<IVL_TS>();
		geotemporalHistoryCodes.add(locationCode1);
		geotemporalHistoryEffectiveTimes.add(locationTime1);
		geotemporalHistoryCodes.add(locationCode2);
		geotemporalHistoryEffectiveTimes.add(locationTime2);

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
		
		//Most recent time arrived in USA observation (SHOULD) 0..1 - if exists, must have a value (TS arrivalTime)
		
		TS arrivalTime = Datatypes.createTS(TIME_STAMP);
		
		String mostRecentTimeArrivedSectionText = "Most Recent Time Arrived in USA - " + timeStampFormat(arrivalTime.getValue(), TEST_DATE_FORMAT);
		
		if (arrivalTime != null) {
			MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation = PHCR.createMostRecentTimeArrivedInUSAObservation().init();
			mostRecentTimeArrivedInUSAObservation.getValues().add(arrivalTime);
			socialHistorySection.addObservation(mostRecentTimeArrivedInUSAObservation);
			((Entry) mostRecentTimeArrivedInUSAObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			hasSocialHistory = true;
		}
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2106-3", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "White");
		CD raceCode2 = Datatypes.createCD("1069-4", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "Canadian Indian");
		
		String raceCodeSectionText1 = "Race - White";
		String raceCodeSectionText2 = "Race - Canadian Indian";
		
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
		
		String occupationSectionText1 = "Occupation - Healthcare Support Occupations";
		String occupationSectionText2 = "Occupation Location - Riverside Community Clinic"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			ED occupationComment = Datatypes.createED("No further differentiation known at this time.");
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
			CD occupationCode = Datatypes.createCD("31-0000", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Healthcare Support Occupations");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addCity(TEST_CITY);
			locationAddress.addState(TEST_STATE);
			locationAddress.addPostalCode(TEST_POSTALCODE);

			TEL locationTelecom = Datatypes.createTEL(TEST_TELECOM);

			PN locationName = Datatypes.createPN();
			locationName.addText("Riverside Community Clinic");
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
			CD occupationHistoryCode = Datatypes.createCD("62", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Health Care and Social Assistance");

			// occupation observation
			OccupationObservation occupationObservation = PHCR.createOccupationObservation().init();
			socialHistorySection.addObservation(occupationObservation);
			((Entry) occupationObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);

			if (occupationNegationIndicator == true) {
				occupationObservation.setNegationInd(occupationNegationIndicator);
			}
			if (occupationComment != null) {
				occupationObservation.setText(occupationComment);
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

		
		// Pregnancy observation (SHOULD) 0..* - if exists, must have a value (IVL_TS dateOfDelivery)
		TS dateOfDelivery = Datatypes.createTS(TIME_STAMP);
		
		String pregnancySectionText = "Pregnant, estimated date of delivery - " + timeStampFormat(dateOfDelivery.getValue(), TEST_DATE_FORMAT);
		
		if (dateOfDelivery != null) {

			PregnancyObservation pregnancyObservation = PHCR.createPregnancyObservation().init();
			socialHistorySection.addObservation(pregnancyObservation);
			pregnancyObservation.getValues().add(Datatypes.createCD("77386006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Pregnant"));
			((Entry) pregnancyObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
			
			EstimatedDateOfDeliveryObservation dateOfDeliveryObservation = PHCR.createEstimatedDateOfDeliveryObservation().init();
			pregnancyObservation.addObservation(dateOfDeliveryObservation);
			((EntryRelationship) dateOfDeliveryObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
			dateOfDeliveryObservation.getValues().add(dateOfDelivery);
			
			hasSocialHistory = true;
		}
		
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "<caption>" + "PHCR Social History Section" + "</caption>");
			buffer.append("</list>" + System.getProperty("line.separator"));
			buffer.append("            " + "<list>" + System.getProperty("line.separator"));
			String listOpen = buffer.toString();
			
			buffer = new StringBuffer();
			buffer.append("            " + "</list>");		
			String listClose = buffer.toString();
			
			List<String> items = new ArrayList<String>();
			
			// Geotemporal history observation
			items.add(geotemporalHistorySectionText1);
			items.add(geotemporalHistorySectionText2);
			
			// Most recent time arrived in USA observation
			items.add(mostRecentTimeArrivedSectionText);
			
			// Race observation
			items.add(raceCodeSectionText1);
			items.add(raceCodeSectionText2);
			
			// Occupation observation
			items.add(occupationSectionText1);
			items.add(occupationSectionText2);
			
			// Pregnancy observation
			items.add(pregnancySectionText);

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
		PhcrClinicalInformationSection clinicalInformationSection = PHCR.createPhcrClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
//		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > PHCR Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("???", SNOMED_OID, SNOMED_SYSTEM_NAME, "PHCR Reportable Condition");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - PHCR Reportable Condition";
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr Betty Trenton";
		
		CaseObservation caseObservation = PHCR.createCaseObservation().init();
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
		authorName.addFamily("TRENTON");
		authorName.addGiven("BETTY");
		
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
		informantName.addFamily("TRENTON");
		informantName.addGiven("BETTY");
		
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
		
		// patient is asymptomatic (negation indicator = false)
		CD signsSymptoms1Code = Datatypes.createCD("84387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asymptomatic");
		IVL_TS signsSymptoms1Time = Datatypes.createIVL_TS(TIME_STAMP);
		boolean signsSymptoms1Negation = false;
		String signsAndSymptomsSectionText1 = "Signs and Symptoms - Patient asymptomatic";
		
		// patient does not have a fever (negation indicator = true)
		CD signsSymptoms2Code = Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever");
		IVL_TS signsSymptoms2Time = Datatypes.createIVL_TS(TIME_STAMP);
		boolean signsSymptoms2Negation = true;
		String signsAndSymptomsSectionText2 = "Signs and Symptoms - Patient had no fever";
		
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
		
		boolean isPatientStatusAlive = false;
		
		// If patient alive
		IVL_TS patientConditionTS = Datatypes.createIVL_TS(TIME_STAMP);
		
		// If patient deceased
		IVL_TS deceasedTime = Datatypes.createIVL_TS();
		IVXB_TS deceasedTimeLow = Datatypes.createIVXB_TS();
		deceasedTimeLow.setValue(TIME_STAMP);
		deceasedTime.setLow(deceasedTimeLow);
		II deceasedCaseId = Datatypes.createII(TEST_ROOT, "222");
		CD deceasedCauseOfDeath = Datatypes.createCD("???", SNOMED_OID, SNOMED_SYSTEM_NAME, "PHCR Reportable Condition");
		
		//A negationIndicator of false means the condition caused the death. 
		//A negationIndicator of true means the condition did not cause the death.
		boolean deceasedCauseIsReportable = false;
		
		//String patientConditionSectionText = "Patient alive " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		String patientConditionSectionText = "Patient deceased, cause PHCR Reportable Condition";
		
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
		buffer.append("            " + "<caption>" + "PHCR Clinical Information Section" + "</caption>");
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
		CD caseCode = Datatypes.createCD("55555", SNOMED_OID, SNOMED_SYSTEM_NAME, "PHCR Reportable Condition");
		
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
			CE routeCode = Datatypes.createCE("C38288", "2.16.840.1.113883.3.26.1.1", "NCI Thesaurus", "Oral");
			IVL_PQ rate = Datatypes.createIVL_PQ();
			rate.setUnit("H");
			rate.setValue(Double.parseDouble("24"));
			IVL_PQ dose = Datatypes.createIVL_PQ();
			dose.setValue(BigDecimal.ONE);
			CE materialCode = Datatypes.createCE("311810", "2.16.840.1.113883.6.88", "RxNorm", "Multivitamin oral tablet");
			EN materialName = Datatypes.createEN();
			materialName.addText("Flinstones Multivitamin");
			
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
			
			negationInd = true;
			
			subsAdminStatus = Datatypes.createCS("completed");
			subsAdminTime = Datatypes.createIVL_TS();
			IVXB_TS lowTime = Datatypes.createIVXB_TS();
			lowTime.setNullFlavor(NullFlavor.UNK);
			IVXB_TS highTime = Datatypes.createIVXB_TS();
			highTime.setValue(TIME_STAMP);
			subsAdminTime.setLow(lowTime);
			subsAdminTime.setHigh(highTime);
			routeCode = null;
			rate = null;
			dose = null;
			materialCode = Datatypes.createCE("161", "2.16.840.1.113883.6.88", "RxNorm", "Acetominophen");
			materialName = Datatypes.createEN();
			materialName.addText("Tylenol");
			
			String treatmentNotGivenSectionText1 = materialCode.getDisplayName() + " not given.";
				
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
			buffer.append("            " + "<caption>" + "PHCR Treatment Information Section" + "</caption>");
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
			
			// treatments not given
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
		boolean hasEncounter = false;
		
		II encounterId = Datatypes.createII(TEST_ROOT, "111");
		IVL_TS encounterEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		CD encounterType = Datatypes.createCD("INP", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Inpatient");
		
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
			performerAddress.addCity(TEST_CITY);
			performerAddress.addState(TEST_STATE);
			adPerformerList.add(performerAddress);
			List<TEL> telPerformerList = new ArrayList<TEL>();
			telPerformerList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> namePerformerList = new ArrayList<PN>();
			PN performerPN = Datatypes.createPN();
			performerPN.addFamily("TRENTON");
			performerPN.addGiven("HOWARD");
			namePerformerList.add(performerPN);
			
			String encounterPerformerSectionText = "Encounter source performer - Howard Trenton";

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
			participantAddress.addCity(TEST_CITY);
			participantAddress.addState(TEST_STATE);
			adParticipantList.add(participantAddress);
			List<TEL> telParticipantList = new ArrayList<TEL>();
			telParticipantList.add(Datatypes.createTEL(TEST_TELECOM));
			List<PN> nameParticipantList = new ArrayList<PN>();
			PN participantPN = Datatypes.createPN();
			participantPN.addFamily("TRENTON");
			participantPN.addGiven("HOWARD");
			nameParticipantList.add(participantPN);
			
			String encounterParticipantSectionText = "Encounter source location - " + TEST_CITY + ", " + TEST_STATE;

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
			buffer.append("            " + "<caption>" + "PHCR Encounters Section" + "</caption>");
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
		PhcrRelevantDxTestsSection dxTestsSection = PHCR.createPhcrRelevantDxTestsSection().init();
		document.addSection(dxTestsSection);
		
		// Result Organizer (MAY)
		List<II> organizerIdList = new ArrayList<II>();
		organizerIdList.add(Datatypes.createII(TEST_ROOT, "123456"));
		CD organizerCode = Datatypes.createCD("XXXX", LOINC_OID, LOINC_SYSTEM_NAME, "Generic Lab Organizer X");
		IVL_TS organizerEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		CE organizerSpecimenType = Datatypes.createCE("119297000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Blood Specimen");
		
		String labOrganizerSectionText = organizerCode.getDisplayName() + " for " + organizerSpecimenType.getDisplayName();
		
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
		
		II labOrganizerInformantId = Datatypes.createII(TEST_ROOT, "27364276");
		
		ON labOrganizerOrganizationName = Datatypes.createON();
		labOrganizerOrganizationName.addText("Reference Laboratory");		
		
		Informant12 labOrganizerInformant = CDA.createInformant12();
		AssignedEntity labOrganizerInformantEntity = CDA.createAssignedEntity();
		Organization labOrganizerOrganization = CDA.createOrganization();
		labOrganizerInformantEntity.getIds().add(labOrganizerInformantId);
		labOrganizerOrganization.getNames().add(labOrganizerOrganizationName);
		labOrganizerInformantEntity.getRepresentedOrganizations().add(labOrganizerOrganization);
		labOrganizerInformant.setAssignedEntity(labOrganizerInformantEntity);
		organizer.getInformants().add(labOrganizerInformant);
		
		// Result Organizer > Result Observation
		List<II> observation1IdList = new ArrayList<II>();
		observation1IdList.add(Datatypes.createII(TEST_ROOT, "123456-1"));
		CD observation1Code = Datatypes.createCD("YYYY", LOINC_OID, LOINC_SYSTEM_NAME, "Generic Lab Test X");
		IVL_TS observation1EffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		ANY value1 = Datatypes.createCD("10828004", SNOMED_OID, SNOMED_SYSTEM_NAME, "Positive");
		
		String labOrganizerObservationSectionText = observation1Code.getDisplayName() + " result: Positive";
				
		ResultObservation observation1 = PHCR.createResultObservation().init();
		organizer.addObservation(observation1);
		
		for (int i=0; i < observation1IdList.size(); i++) {
			observation1.getIds().add(observation1IdList.get(i));
		}
		if (observation1Code != null) observation1.setCode(observation1Code);
		if (observation1EffectiveTime != null) observation1.setEffectiveTime(observation1EffectiveTime);
		if (value1 != null) observation1.getValues().add(value1);
		
		
		// Result Observation (optional - but must have one result) - if exists, must have (II observationId), (CD observationCode), (ANY value)
		List<II> observationIdList = new ArrayList<II>();
		observationIdList.add(Datatypes.createII(TEST_ROOT, "7839"));
		CD observationCode = Datatypes.createCD("ZZZZ", "2.16.840.1.113883.6.1", "LOINC", "Generic Lab Test Z");
		IVL_TS observationEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		ANY value = Datatypes.createCD("10828004", "2.16.840.1.113883.6.96", "SNOMED-CT", "Positive");
		CE observationSpecimenType = Datatypes.createCE("119297000", "2.16.840.1.113883.6.96", "SNOMED-CT", "Blood Specimen");
		
		String labObservationSectionText = observationCode.getDisplayName() + " for " + observationSpecimenType.getDisplayName() + " result: Positive";

		ResultObservation observation = PHCR.createResultObservation().init();
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
		
		// Image Observation Informant
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
		
		
		// Image Observation (MAY - but SHALL have one result) - if exists, must have (II imageId), (CD imageCode), (ANY imageValue)
		List<II> imageIds = new ArrayList<II>();
		imageIds.add(Datatypes.createII(TEST_ROOT, "333"));
		CD imageCode = Datatypes.createCD();
		imageCode.setCode("ASSERTION");
		imageCode.setCodeSystem("2.16.840.1.113883.5.4");
		imageCode.setCodeSystemName("HL7ActCode");
		IVL_TS imageEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP);
		ANY imageValue = Datatypes.createCD("128309002", "2.16.840.1.113883.6.96", "SNOMED-CT", "Radiologic infiltrate");
		CE imageMethodType = Datatypes.createCE("168731009", "2.16.840.1.113883.6.96", "SNOMED-CT", "Standard chest X-ray");
		
		String imageObservationSectionText = imageMethodType.getDisplayName() + " - radiologic infiltrate";
			
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
		buffer.append("            " + "<caption>" + "PHCR Encounters Section" + "</caption>");
		buffer.append("</list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<list>" + System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// lab organizer
		items.add(labOrganizerSectionText);
		items.add(labOrganizerObservationSectionText);
		 
		// lab observation
		items.add(labObservationSectionText);
		
		// image observation
		items.add(imageObservationSectionText);

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
		ImmunizationsSection immunizationsSection = CCD.createImmunizationsSection().init();
		immunizationsSection.setTitle(Datatypes.createST("Immunizations"));
		document.addSection(immunizationsSection);
		
		List<II> activityId = new ArrayList<II>();
		activityId.add(Datatypes.createII(TEST_ROOT, "3331"));
		CS subsAdminStatus = Datatypes.createCS("completed");
		IVL_TS subsAdminTime = Datatypes.createIVL_TS(TIME_STAMP);
		CE routeCode = Datatypes.createCE("IM", "2.16.840.1.113883.5.112", "RouteOfAdministration", "Intramuscular injection");
		IVL_PQ dose = null;
		CE materialCode = Datatypes.createCE("88", "2.16.840.1.113883.6.59", "CVX", "Influenza Virus Vaccine, NOS");
		ED materialOriginalText = Datatypes.createED("Influenza Virus Vaccine");
		EN materialName = Datatypes.createEN();
		materialName.addText("Influenza Virus Vaccine");
		
		String immunizationSectionText = materialName.getText() + " received " + timeStampFormat(TIME_STAMP, TEST_DATE_FORMAT);
		
		// Medication Activity	(required) - if exists, must have an (II activityId)
		MedicationActivity medicationActivity = CCD.createMedicationActivity().init();
		medicationActivity.setMoodCode(x_DocumentSubstanceMood.EVN);
		Consumable consumable = CDA.createConsumable();
		Product product = CCD.createProduct().init();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		consumable.setManufacturedProduct(product);
		medicationActivity.setConsumable(consumable);
		
		for (int i=0; i < activityId.size(); i++) {
			medicationActivity.getIds().add(activityId.get(i));
		}
		if (subsAdminStatus != null) medicationActivity.setStatusCode(subsAdminStatus);
		if (subsAdminTime != null) medicationActivity.getEffectiveTimes().add(subsAdminTime);
		if (routeCode != null) medicationActivity.setRouteCode(routeCode);
		if (dose != null) medicationActivity.setDoseQuantity(dose);
		if (materialCode != null) material.setCode(materialCode);
		material.getCode().setOriginalText(materialOriginalText);
		if (materialName != null) material.setName(materialName);
		
		// Activity Information Source (patient)
		II patientId = Datatypes.createII(TEST_ROOT, "214365");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("TRENTON");
		patientName.addGiven("MICHAEL");		
		
		Informant12 patientInformant = CDA.createInformant12();
		AssignedEntity patientEntity = CDA.createAssignedEntity();
		Person patientPerson = CDA.createPerson();
		patientEntity.getIds().add(patientId);
		patientPerson.getNames().add(patientName);
		patientEntity.setAssignedPerson(patientPerson);
		patientInformant.setAssignedEntity(patientEntity);
		medicationActivity.getInformants().add(patientInformant);		
		
		immunizationsSection.addSubstanceAdministration(medicationActivity);
		((Entry) medicationActivity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<caption>" + "PHCR Immunizations Section" + "</caption>");
		buffer.append("</list>" + System.getProperty("line.separator"));
		buffer.append("            " + "<list>" + System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// immunization
		items.add(immunizationSectionText);

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

}
