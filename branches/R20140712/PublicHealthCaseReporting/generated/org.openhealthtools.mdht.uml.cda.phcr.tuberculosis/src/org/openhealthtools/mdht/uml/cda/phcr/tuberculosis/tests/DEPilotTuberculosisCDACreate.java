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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.tests;

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
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;
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
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class DEPilotTuberculosisCDACreate {
	
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	public static CDAFactory CDA = CDAFactory.eINSTANCE;
	public static CCDFactory CCD = CCDFactory.eINSTANCE;
	public static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	public static TuberculosisFactory TB = TuberculosisFactory.eINSTANCE;
	
	public static String PATIENT_ID = "DE28932881";
	
	public static String TIME_STAMP_DOB = "19650308000000-0500"; 
	public static String TIME_STAMP_SYMPTOMS = "20111101000000-0500";
	public static String TIME_STAMP_REPORT = "20120501094500-0500";	
	
	public static String TEST_CITY = "Dover";
	public static String TEST_STATE = "DE";
	public static String TEST_POSTALCODE = "19720";	
	
	public static String TEST_ROOT = "1.3.6.1.4.1.19376.1.3.4";
	public static String TEST_DATE_FORMAT = "yyyy/MM/dd";
	
	public static String SNOMED_OID = "2.16.840.1.113883.6.96";	
	public static String SNOMED_SYSTEM_NAME = "SNOMEDCT";
	public static String LOINC_OID = "2.16.840.1.113883.6.1";
	public static String LOINC_SYSTEM_NAME = "LOINC";
	
	public static void main(String[] args) throws Exception {
		
		TuberculosisCaseReport document = TB.createTuberculosisCaseReport().init();
		
		setHeader(document);
		
		setPatient(document);
		setReporter(document);
		setCustodian(document);
		setVerifier(document);
		
		setSocialHistorySection(document);
		setClinicalInformationSection(document);
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
		File fileOut = new File(filePathOut, "DEPilotSampleCDA.xml");
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
	public static void setHeader(TuberculosisCaseReport document) throws Exception {
		
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
	public static void setPatient(TuberculosisCaseReport document) throws Exception {

		
		II patientId = Datatypes.createII(TEST_ROOT, PATIENT_ID);
		
		AD patientAddress = Datatypes.createAD();
		patientAddress.addStreetAddressLine("13 Lake City Way NE");
		patientAddress.addCity(TEST_CITY);
		patientAddress.addState(TEST_STATE);
		patientAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL patientTelecom = Datatypes.createTEL("tel:+1-206-123-4567");
		
		PN patientName = Datatypes.createPN();
		patientName.addFamily("Lamptey");
		patientName.addGiven("Daniel");
		
		CE patientGender = Datatypes.createCE("M", "2.16.840.1.113883.5.1", "HL7", "Male");
		TS patientBirthTime = Datatypes.createTS(TIME_STAMP_DOB);
		CE patientRace = Datatypes.createCE("2060-2", "2.16.840.1.113883.1.11.14914", "Race & Ethnicity - CDC", "African");
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
	public static void setReporter(TuberculosisCaseReport document) throws Exception {
		
		TS reporterEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		
		II reporterId = Datatypes.createII(NullFlavor.UNK);
		
		AD reporterAddress = Datatypes.createAD();
		reporterAddress.addStreetAddressLine("12736 33rd Ave NE");
		reporterAddress.addCity(TEST_CITY);	
		reporterAddress.addState(TEST_STATE);
		reporterAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL reporterTelecom = Datatypes.createTEL("tel:+1-206-367-0150");
		
		PN reporterName = Datatypes.createPN();
		reporterName.addFamily("Livington");
		reporterName.addGiven("William");
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
	public static void setCustodian(TuberculosisCaseReport document) throws Exception {
		
		II custodianOrgId = Datatypes.createII(NullFlavor.UNK);
		
		ON custodianOrgName = Datatypes.createON();
		custodianOrgName.addText("Delaware Health Information Exchange");
		
		AD custodianOrgAddress = Datatypes.createAD();
		custodianOrgAddress.addStreetAddressLine("2003 Western Avenue, Suite 600");
		custodianOrgAddress.addCity(TEST_CITY);
		custodianOrgAddress.addState(TEST_STATE);
		custodianOrgAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL custodianOrgTelecom = Datatypes.createTEL("tel:+1-302-624-3128");
		
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
	public static void setVerifier(TuberculosisCaseReport document) throws Exception {
		
		TS verifierEffectiveTime = Datatypes.createTS(TIME_STAMP_REPORT);
		CS signatureCode = Datatypes.createCS("S");
		
		II verifierId = Datatypes.createII(NullFlavor.UNK);
		
		AD verifierAddress = Datatypes.createAD();
		verifierAddress.addStreetAddressLine("12736 33rd Ave NE");
		verifierAddress.addCity(TEST_CITY);
		verifierAddress.addState(TEST_STATE);
		verifierAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL verifierTelecom = Datatypes.createTEL("tel:+1-302-367-0150");
		
		PN personName = Datatypes.createPN();
		personName.addFamily("Livington");
		personName.addGiven("William");
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
	 *   Tuberculosis possible exposure location (SHOULD) 0..*
	 *   HIV status observation (SHOULD) 0..1
	 *   Tuberculosis socio-behavioral boolean risk factor (SHOULD) 0..*
	 *   Smoking status observation (SHOULD) 0..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setSocialHistorySection(TuberculosisCaseReport document) throws Exception {
		
		// Social History Section (optional)
		TuberculosisPHCRSocialHistorySection socialHistorySection = TB.createTuberculosisPHCRSocialHistorySection().init();
		boolean hasSocialHistory = false;
		
		// Race observation (SHOULD) 0..* - if exists, must have a value (CD raceCode)
		// ValueSet 2.16.840.1.113883.1.11.14914
		// https://phinvads.cdc.gov/vads/ViewValueSet.action?id=94E75E17-176B-DE11-9B52-0015173D1785
		
		CD raceCode1 = Datatypes.createCD("2060-2", "2.16.840.1.113883.6.238", "Race & Ethnicity - CDC", "African");
		
		String raceCodeSectionText1 = "Race - African";
		
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
		
		String occupationSectionText1 = "Occupation - Construction Laborers, Roofing Contractor started on " + timeStampFormat("19980210000000-0500", TEST_DATE_FORMAT);
		String occupationSectionText2 = "Occupation Location - Unknown Employer, Delaware"; 
		
		if (hasOccupation == true) {
			boolean occupationNegationIndicator = false;
			IVL_TS occupationEffectiveTime = Datatypes.createIVL_TS("19980210000000-0500");
			CD occupationCode = Datatypes.createCD("47-2060", "2.16.840.1.113883.6.243", "Occupation (SOC 2000)", "Construction Laborers");

			AD locationAddress = Datatypes.createAD();
			locationAddress.addState(TEST_STATE);

			TEL locationTelecom = Datatypes.createTEL();
			locationTelecom.setNullFlavor(NullFlavor.UNK);

			PN locationName = Datatypes.createPN();
			locationName.setNullFlavor(NullFlavor.UNK);
			
			IVL_TS occupationHistoryEffectiveTime = Datatypes.createIVL_TS("19980210000000-0500");
			CD occupationHistoryCode = Datatypes.createCD("23816", "2.16.840.1.113883.6.85", "Industry (NAICS)", "Roofing Contractors");

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
				
		
		if (hasSocialHistory) {
			document.addSection(socialHistorySection);
			
			// create <text> block
			StringBuffer buffer = new StringBuffer();
			buffer.append("<list>" + System.getProperty("line.separator"));
			buffer.append("            " + "            " + "<caption>" + "Tuberculosis Social History Section" + "</caption>");
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
	 *   Tuberculosis Case Observation (SHALL) 1..1
	 *     > Author (SHOULD) 0..1
	 *     > CCD Problem Status Observation (SHOULD) 0..1
	 *     > Tuberculosis Signs and Symptoms Observation (SHOULD) 0..*
	 *   Patient Condition Alive Observation (MAY) 0..1
	 *   Patient Condition Deceased Observation (MAY) 0..1  *(but not both alive and deceased observations)
	 *     > Deceased Cause Observation (SHALL) 1..1
	 * 
	 * @param document
	 * @throws Exception
	 */
	public static void setClinicalInformationSection(PublicHealthCaseReport document) throws Exception {
		
		// Clinical Information Section (required)
		TuberculosisPHCRClinicalInformationSection clinicalInformationSection = TB.createTuberculosisPHCRClinicalInformationSection().init();
		document.addSection(clinicalInformationSection);
		
		// Case Observation (SHALL) 1..1 - must have a value (CD reportableCode)
		// Case Observation > Author (SHOULD) 0..1
		// Case Observation > Informant (SHALL) 1..*
		// Case Observation > CCD Problem Status Observation (SHOULD) 0..1
		// Case Observation > Tuberculosis Signs and Symptoms (SHOULD) 0..*
		
		CD reportableCode = Datatypes.createCD("427099000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Active tuberculosis");
		IVL_TS reportableTime = Datatypes.createIVL_TS();
		IVXB_TS caseTimeLow = Datatypes.createIVXB_TS();
		caseTimeLow.setValue(TIME_STAMP_REPORT);
		reportableTime.setLow(caseTimeLow);
		
		String caseObservationReportableSectionText = "Condition - " + reportableCode.getDisplayName();
		String caseObservationDateOfDiagnosisSectionText = "Condition diagnosed " + timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT);
		String caseObservationDiagnosingClinicianSectionText = "Diagnosed by Dr William Livington, MD";
		
		TuberculosisCaseObservation caseObservation = TB.createTuberculosisCaseObservation().init();
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
		authorAddress.addStreetAddressLine("12736 33rd Ave NE");
		authorAddress.addCity(TEST_CITY);
		authorAddress.addState(TEST_STATE);
		authorAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL authorTelecom = Datatypes.createTEL("tel:+1-302-367-0150");
		
		PN authorName = Datatypes.createPN();
		authorName.addFamily("Livington");
		authorName.addGiven("William");
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
		informantName.addFamily("Livington");
		informantName.addGiven("William");
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
		
		// populate <text> block prior to SignsAndSymptoms
		List<String> items = new ArrayList<String>();
		
		// case observation
		items.add(caseObservationReportableSectionText);
		items.add(caseObservationDateOfDiagnosisSectionText);
		
		// case observation > author
		items.add(caseObservationDiagnosingClinicianSectionText);
		
		
		// Case Observation > Signs and Symptoms (SHOULD) 0..* - if exists, must have a value (CD signSymptom)
		
		boolean symptomAsymptomatic = false;
		boolean symptomChestPain = false;
		boolean symptomChill = false;
		boolean symptomFever = false;
		boolean symptomHemoptysis = false;
		boolean symptomNightSweats = false;
		boolean symptomNonProductiveCough = true;
		boolean symptomProductiveCough = false;
		boolean symptomWeightLoss = false;
		
		List<CD> signsSymptomsCD = new ArrayList<CD>();
		List<IVL_TS> signsSymptomsTS = new ArrayList<IVL_TS>();
		List<Boolean> signsSymptomsNegInd = new ArrayList<Boolean>();
		
		boolean isReportNegativeSymptoms = false;
		
		// Signs and Symptom Asymptomatic (84387000 - SNOMEDCT)
		if (symptomAsymptomatic || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("84387000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Asymptomatic"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomAsymptomatic);
			items.add("Signs and Symptoms - Asymptomatic " + (symptomAsymptomatic ? "REPORTED" : "not reported"));
		}
		
		// Signs and Symptom Chest pain (29857009 - SNOMEDCT)
		if (symptomChestPain || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("29857009", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chest pain"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomChestPain);
			items.add("Signs and Symptoms - Chest pain " + (symptomChestPain ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Chill (43724002 - SNOMEDCT)
		if (symptomChill || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("43724002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Chill"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomChill);
			items.add("Signs and Symptoms - Chill " + (symptomChill ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Fever (386661006 - SNOMEDCT)
		if (symptomFever || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("386661006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Fever"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomFever);
			items.add("Signs and Symptoms - Fever " + (symptomFever ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Hemoptysis (66857006 - SNOMEDCT)
		if (symptomHemoptysis || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("66857006", SNOMED_OID, SNOMED_SYSTEM_NAME, "Hemoptysis"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomHemoptysis);
			items.add("Signs and Symptoms - Hemoptysis " + (symptomHemoptysis ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Night sweats (42984000 - SNOMEDCT)
		if (symptomNightSweats || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("42984000", SNOMED_OID, SNOMED_SYSTEM_NAME, "Night sweats"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomNightSweats);
			items.add("Signs and Symptoms - Night sweats " + (symptomNightSweats ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Non-productive cough (409596002 - SNOMEDCT)
		if (symptomNonProductiveCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("409596002", SNOMED_OID, SNOMED_SYSTEM_NAME, "Non-productive cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomNonProductiveCough);
			items.add("Signs and Symptoms - Non-productive cough " + (symptomNonProductiveCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Productive cough (28743005 - SNOMEDCT)
		if (symptomProductiveCough || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("28743005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Productive cough"));
			signsSymptomsTS.add(Datatypes.createIVL_TS(TIME_STAMP_SYMPTOMS));
			signsSymptomsNegInd.add(!symptomProductiveCough);
			items.add("Signs and Symptoms - Productive cough " + (symptomProductiveCough ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		// Signs and Symptom Weight loss (89362005 - SNOMEDCT)
		if (symptomWeightLoss || isReportNegativeSymptoms) {
			signsSymptomsCD.add(Datatypes.createCD("89362005", SNOMED_OID, SNOMED_SYSTEM_NAME, "Weight loss"));
			signsSymptomsTS.add(Datatypes.createIVL_TS("20111125000000-0700"));
			signsSymptomsNegInd.add(!symptomWeightLoss);
			items.add("Signs and Symptoms - Weight loss " + (symptomWeightLoss ? "REPORTED starting on " + timeStampFormat(TIME_STAMP_SYMPTOMS, TEST_DATE_FORMAT) : "not reported"));
		}
		
		int count = signsSymptomsCD.size();
		for (int i=0; i < count; i++) {
			IVL_TS effectiveTime = signsSymptomsTS.get(i);
			CD signSymptomCD = signsSymptomsCD.get(i);
			boolean signSymptomNegation = signsSymptomsNegInd.get(i);
			
			TuberculosisSignsAndSymptomsObservation symptomsObservation = TB.createTuberculosisSignsAndSymptomsObservation().init();
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
		buffer.append("            " + "            " + "<caption>" + "Tuberculosis Clinical Information Section" + "</caption>");
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
		
		// Tuberculosis Result Observation - Sputum AFB
		List<II> sputumAFStainIdList = new ArrayList<II>();
		sputumAFStainIdList.add(Datatypes.createII(NullFlavor.UNK));
		CD sputumAFStainCode = Datatypes.createCD("38379-4", "2.16.840.1.113883.6.1", "LOINC", "Mycobacterium tuberculosis complex DNA Amplification");
		IVL_TS sputumAFStainEffectiveTime = Datatypes.createIVL_TS(TIME_STAMP_REPORT);
		CS sputumAFStainStatus = Datatypes.createCS("completed");
		CD sputumAFStainValue = Datatypes.createCD("113858008", SNOMED_OID, SNOMED_SYSTEM_NAME, "Mycobacterium tuberculosis complex");
		
		CE sputumSpecimenType = Datatypes.createCE("119335007", SNOMED_OID, SNOMED_SYSTEM_NAME, "Coughed Sputum");
		
		CV qualifierValue = Datatypes.createCV();
		qualifierValue.setCode("408729009");
		qualifierValue.setCodeSystem(SNOMED_OID);
		qualifierValue.setCodeSystemName(SNOMED_SYSTEM_NAME);
		qualifierValue.setDisplayName("Finding context");

		CD qualifierCode = Datatypes.createCD("260373001", SNOMED_OID, SNOMED_SYSTEM_NAME, "Detected");

		CR sputumAFStainQualifier = Datatypes.createCR();
		sputumAFStainQualifier.setName(qualifierValue);
		sputumAFStainQualifier.setValue(qualifierCode);

		sputumAFStainValue.getQualifiers().add(sputumAFStainQualifier);
		
		String sputumAFStainObservationSectionText1 = sputumSpecimenType.getDisplayName() + " collected on " +
		timeStampFormat(TIME_STAMP_REPORT, TEST_DATE_FORMAT) + ", " + sputumAFStainCode.getDisplayName() + " result: Detected";
		String sputumAFStainObservationSectionText2 = "Neighbor Care Health Laboratory, 12736 33rd Ave NE, Dover, DE  (tel:302-367-0150)";
				
		TuberculosisResultObservation sputumAFStainObservation = TB.createTuberculosisResultObservation().init();
		dxTestsSection.addObservation(sputumAFStainObservation);
		((Entry) sputumAFStainObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		
		for (int i=0; i < sputumAFStainIdList.size(); i++) {
			sputumAFStainObservation.getIds().add(sputumAFStainIdList.get(i));
		}
		if (sputumAFStainCode != null) sputumAFStainObservation.setCode(sputumAFStainCode);
		if (sputumAFStainEffectiveTime != null) sputumAFStainObservation.setEffectiveTime(sputumAFStainEffectiveTime);
		if (sputumAFStainStatus != null) sputumAFStainObservation.setStatusCode(sputumAFStainStatus);
		if (sputumAFStainValue != null) sputumAFStainObservation.getValues().add(sputumAFStainValue);
		
		II sputumAFStainInformantId = Datatypes.createII(NullFlavor.UNK);
		
		ON sputumAFStainOrganizationName = Datatypes.createON();
		sputumAFStainOrganizationName.addText("Neighbor Care Health Laboratory");
		
		AD sputumAFStainOrganizationAddress = Datatypes.createAD();
		sputumAFStainOrganizationAddress.addStreetAddressLine("12736 33rd Ave NE");
		sputumAFStainOrganizationAddress.addCity(TEST_CITY);
		sputumAFStainOrganizationAddress.addState(TEST_STATE);
		sputumAFStainOrganizationAddress.addPostalCode(TEST_POSTALCODE);
		
		TEL sputumAFStainOrganizationTelecom = Datatypes.createTEL("tel:+1-302-367-0150");
		
		Informant12 sputumAFStainInformant = CDA.createInformant12();
		AssignedEntity sputumAFStainInformantEntity = CDA.createAssignedEntity();
		Organization sputumAFStainOrganization = CDA.createOrganization();
		sputumAFStainInformantEntity.getIds().add(sputumAFStainInformantId);
		sputumAFStainInformantEntity.getAddrs().add(sputumAFStainOrganizationAddress);
		sputumAFStainInformantEntity.getTelecoms().add(sputumAFStainOrganizationTelecom);
		sputumAFStainOrganization.getNames().add(sputumAFStainOrganizationName);
		sputumAFStainInformantEntity.getRepresentedOrganizations().add(sputumAFStainOrganization);
		sputumAFStainInformant.setAssignedEntity(sputumAFStainInformantEntity);
		sputumAFStainObservation.getInformants().add(sputumAFStainInformant);
		
		
		// create <text> block
		StringBuffer buffer = new StringBuffer();
		buffer.append("<list>" + System.getProperty("line.separator"));
		buffer.append("            " + "            " + "<caption>" + "Tuberculosis Relevant Diagnostics Tests Section" + "</caption>");
		buffer.append(System.getProperty("line.separator"));
		String listOpen = buffer.toString();
		
		buffer = new StringBuffer();
		buffer.append("            " + "</list>");		
		String listClose = buffer.toString();
		
		List<String> items = new ArrayList<String>();
		
		// sputum AF stain
		items.add(sputumAFStainObservationSectionText1);
		items.add(sputumAFStainObservationSectionText2);

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
