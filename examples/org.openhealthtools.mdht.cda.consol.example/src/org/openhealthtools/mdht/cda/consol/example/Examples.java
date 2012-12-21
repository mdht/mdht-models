/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cda.consol.example;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class Examples {

	private static void initializeRecordTarget(ContinuityOfCareDocument ccdDocument) {

		InfrastructureRootTypeId typeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		typeId.setExtension("POCD_HD000040");
		ccdDocument.setTypeId(typeId);

		ccdDocument.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en-US"));

		DocumentationOf documentationOf = CDAFactory.eINSTANCE.createDocumentationOf();

		// ccdDocument.getDocumentationOfs().add(documentationOf);

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.4", "c266");
		ccdDocument.setId(id);

		II templateId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.27.1776");
		ccdDocument.getTemplateIds().add(templateId);

		CE code = DatatypesFactory.eINSTANCE.createCE(
			"34133-9", "2.16.840.1.113883.6.1", "LOINC", "Summarization of Episode Note");
		ccdDocument.setCode(code);

		ST title = DatatypesFactory.eINSTANCE.createST("Good Health Clinic Consultation Note");
		ccdDocument.setTitle(title);

		TS effectiveTime = DatatypesFactory.eINSTANCE.createTS("20000407");
		ccdDocument.setEffectiveTime(effectiveTime);

		CE confidentialityCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		ccdDocument.setConfidentialityCode(confidentialityCode);

		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		ccdDocument.getRecordTargets().add(recordTarget);

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();

		patientRole.getIds().add(DatatypesFactory.eINSTANCE.createII("123456789"));
		AD ad = DatatypesFactory.eINSTANCE.createAD();
		ad.addStreetAddressLine("101 Second Street");
		ad.addCity("Somewhere");
		ad.addState("IL");
		patientRole.getAddrs().add(ad);
		TEL telephone = DatatypesFactory.eINSTANCE.createTEL("5551113434");
		patientRole.getTelecoms().add(telephone);

		recordTarget.setPatientRole(patientRole);

		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);

		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Henry").addFamily("Levin").addSuffix("the 7th");
		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1");
		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS("19320924");
		patient.setBirthTime(birthTime);

		Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
		providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5"));
		ON oname = DatatypesFactory.eINSTANCE.createON();
		oname.addText("Providers R US");
		providerOrganization.getNames().add(oname);
		ad = DatatypesFactory.eINSTANCE.createAD();
		ad.addStreetAddressLine("101 East Main Street");
		ad.addCity("Somewhere");
		ad.addState("NY");
		providerOrganization.getAddrs().add(ad);
		telephone = DatatypesFactory.eINSTANCE.createTEL("5551113434");
		providerOrganization.getTelecoms().add(telephone);
		patientRole.setProviderOrganization(providerOrganization);

		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setTime(DatatypesFactory.eINSTANCE.createTS("2000040714"));
		ccdDocument.getAuthors().add(author);

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "MYID"));
		ad = DatatypesFactory.eINSTANCE.createAD();
		ad.addStreetAddressLine("2 Fourth St");
		ad.addCity("Somewhere");
		ad.addState("CA");
		assignedAuthor.getAddrs().add(ad);
		telephone = DatatypesFactory.eINSTANCE.createTEL("5551113434");
		assignedAuthor.getTelecoms().add(telephone);
		author.setAssignedAuthor(assignedAuthor);

		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(assignedPerson);

		name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Bob").addFamily("Doctor").addSuffix("MD");
		assignedPerson.getNames().add(name);

		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();

		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();
		oname = DatatypesFactory.eINSTANCE.createON();
		oname.addText("Custodians R US");
		custodianOrganization.setName(oname);
		ad = DatatypesFactory.eINSTANCE.createAD();
		ad.addStreetAddressLine("2 Fourth St");
		ad.addCity("Somewhere");
		ad.addState("CA");
		custodianOrganization.setAddr(ad);
		telephone = DatatypesFactory.eINSTANCE.createTEL("5551113434");
		custodianOrganization.setTelecom(telephone);
		custodianOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "ANId"));

		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);

		custodian.setAssignedCustodian(assignedCustodian);

		ccdDocument.setCustodian(custodian);

	}

	private static void inializeAllergiesSection(AllergiesSection allergiesSection) {
		allergiesSection.setTitle(DatatypesFactory.eINSTANCE.createST("Allergies Section"));
		StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
		text.addText("Allergies Section Narrative");
		allergiesSection.setText(text);

	}

	public static void createCCD() {

		/*
		 * Use the EMFFactory Pattern with additional init call, this will set all the static structural information
		 */

		// create and initialize an instance of the ContinuityOfCareDocument class
		ContinuityOfCareDocument ccdDocument = ConsolFactory.eINSTANCE.createContinuityOfCareDocument().init();

		initializeRecordTarget(ccdDocument);

		AllergiesSection allergiesSection = ConsolFactory.eINSTANCE.createAllergiesSection().init();

		inializeAllergiesSection(allergiesSection);

		ccdDocument.addSection(allergiesSection);

		MedicationsSection medicationsSection = ConsolFactory.eINSTANCE.createMedicationsSection().init();

		ccdDocument.addSection(medicationsSection);
		ProblemSection problemSection = ConsolFactory.eINSTANCE.createProblemSection().init();

		ccdDocument.addSection(problemSection);
		ProceduresSection proceduresSection = ConsolFactory.eINSTANCE.createProceduresSection().init();

		ccdDocument.addSection(proceduresSection);
		ResultsSection ResultsSection = ConsolFactory.eINSTANCE.createResultsSection().init();

		ccdDocument.addSection(ResultsSection);

		// create a validation result object to collect diagnostics produced during validation
		ValidationResult result = new ValidationResult();
		CDAUtil.validate(ccdDocument, result);

		System.out.println("\n***** Sample validation results *****");
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		// for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
		// System.out.println("WARNING: " + diagnostic.getMessage());
		// }

		System.out.println("Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());

		if (!result.hasErrors()) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		createCCD();

	}

}
