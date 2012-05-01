/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain.test;

import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResult;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer;

public abstract class TestToCDocument {

	public static void addPatient(RecordTarget recordTarget) {
		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		Patient patient = CDAFactory.eINSTANCE.createPatient();
		recordTarget.setPatientRole(patientRole);
		patientRole.setPatient(patient);

		II id = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		patientRole.getIds().add(id);

		AD addr = DatatypesFactory.eINSTANCE.createAD();
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "US");
		addr.getCountries().add(country);
		patientRole.getAddrs().add(addr);
	}

	public static void addOriginalAuthor(Author author) {
		author.setTime(DatatypesFactory.eINSTANCE.createTS("20070916130000"));
		// assignedAuthor
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		author.setAssignedAuthor(assignedAuthor);
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString()));
		// assignedPerson
		Person person = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(person);
		PN pn = DatatypesFactory.eINSTANCE.createPN();
		pn.addGiven("John").addFamily("Doe");
		person.getNames().add(pn);

		// representedOrganization
		Organization organization = CDAFactory.eINSTANCE.createOrganization();
		assignedAuthor.setRepresentedOrganization(organization);
		II orgId = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		organization.getIds().add(orgId);
		ON on = DatatypesFactory.eINSTANCE.createON();
		on.addText("Happy Valley Hospital");
		organization.getNames().add(on);
		organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("+1-800-555-1212"));
	}

	public static void addDocumentCustodian(Custodian custodian) {
		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
		custodian.setAssignedCustodian(assignedCustodian);
		// representedOrganization
		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();
		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);
		II custodianId = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		custodianOrganization.getIds().add(custodianId);
		ON custodianName = DatatypesFactory.eINSTANCE.createON();
		custodianName.addText("ONC ToC Team");
		custodianOrganization.setName(custodianName);
		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL("+1-800-555-1212"));

		AD addr = DatatypesFactory.eINSTANCE.createAD();
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "US");
		addr.getCountries().add(country);
		custodianOrganization.setAddr(addr);
	}

	public static IProblemListSection createActiveProblems(IProblemListSection problemListSection) {
		ICondition condition = problemListSection.addCondition();
		condition.addId().setRoot(UUID.randomUUID().toString());
		condition.withEffectiveTime().setValue(new Date().toString());

		IProblemEntry problemEntry = condition.addProblemEntry();
		problemEntry.addId().setRoot(UUID.randomUUID().toString());

		problemEntry.withProblemStatus().withValue().setCode("123123-7");
		problemEntry.addComment().withAuthor();

		problemEntry.withHealthStatusObservation().withValue().setCode("435345-9");

		problemEntry.withAgeObservation();
		// problemEntry.withCauseOfDeath().withTimeOfDeath().setValue(new Date().toString());
		problemEntry.withCauseOfDeath();

		IEpisodeObservation episodeObservation = condition.withEpisodeObservation();
		episodeObservation.withCode().setCode("9999-2");
		episodeObservation.withValue().setCode("7623487");

		// test toCDAType()
		System.out.println();
		System.out.println("ProblemSection code = " + problemListSection.getCDAType().getCode());
		System.out.println("ProblemEntry classCode = " + problemEntry.getCDAType().getClassCode());
		System.out.println("ProblemEntry statusCode = " + problemEntry.getCDAType().getStatusCode().getCode());

		return problemListSection;
	}

	public static IAllergiesReactionsSection createAllergies(IAllergiesReactionsSection allergiesSection) {
		allergiesSection.addAllergyDrugSensitivity();

		return allergiesSection;
	}

	public static IDischargeDiagnosisSection createDischargeDiagnosis(IDischargeDiagnosisSection dischargeDiagnosis) {
		// TODO add entries

		return dischargeDiagnosis;
	}

	public static IHospitalDischargeMedicationsSection createDischargeMeds(
			IHospitalDischargeMedicationsSection dischargeMeds) {
		// TODO add entries

		return dischargeMeds;
	}

	public static IHospitalCourseSection createHospitalCourse(IHospitalCourseSection hospitalCourse) {
		// TODO add entries

		return hospitalCourse;
	}

	public static IPlanOfCareSection createPlanOfCare(IPlanOfCareSection planOfCare) {
		// TODO add entries

		return planOfCare;
	}

	public static IDiagnosticResultsSection createDiagnosticResults(IDiagnosticResultsSection diagnosticResults) {
		// C83 requires a Procedure
		diagnosticResults.addDiagnosticProcedure();

		// Add Result as child of section, or within ResultOrganizer
		// IResult result1 = diagnosticResults.addResult();
		// result1.addId().setRoot(UUID.randomUUID().toString());
		// result1.withResultDateTime().setValue("20110716130000");
		// result1.withResultType();

		IResultOrganizer resultOrganizer = diagnosticResults.addResultOrganizer();
		resultOrganizer.getCDAType().setClassCode(x_ActClassDocumentEntryOrganizer.BATTERY);
		resultOrganizer.addId().setRoot(UUID.randomUUID().toString());
		resultOrganizer.withStatusCode().setCode("completed");

		IResult result1 = resultOrganizer.addResult();
		result1.addId().setRoot(UUID.randomUUID().toString());
		result1.withResultDateTime().setValue("20110716130000");
		result1.withResultType();
		// TODO what datatype for value?
		// result1.withValue();

		IResult result2 = resultOrganizer.addResult();
		result2.addId().setRoot(UUID.randomUUID().toString());
		result2.withResultDateTime().setValue("20110716140000");
		result2.withResultType();
		// result2.withValue();

		return diagnosticResults;
	}

	public static IFamilyHistorySection createFamilyHistory(IFamilyHistorySection familyHistorySection) {
		IFamilyHistory familyHistory1 = familyHistorySection.addFamilyHistory();
		familyHistory1.addFamilyHistoryObservation();

		IFamilyHistory familyHistory2 = familyHistorySection.addFamilyHistory();
		familyHistory2.addFamilyHistoryObservation();
		familyHistory2.addFamilyHistoryObservation();

		return familyHistorySection;
	}

	public static void save(ClinicalDocument clinicalDocument) throws Exception {
		CDAUtil.save(clinicalDocument, System.out);
	}

	public static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			// @Override
			// public void handleWarning(Diagnostic diagnostic) {
			// System.out.println("WARNING: " + diagnostic.getMessage());
			// }
			// @Override
			// public void handleInfo(Diagnostic diagnostic) {
			// System.out.println("INFO: " + diagnostic.getMessage());
			// }
		});

		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}

}
