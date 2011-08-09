/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain.test;

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
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;

public class TestDischargeSummary {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		DischargeSummary dischargeSummaryImpl = HITSPFactory.eINSTANCE.createDischargeSummary().init();
		IDischargeSummary dischargeSummary = IDomainFactory.eINSTANCE.createDischargeSummary();
		dischargeSummary.setCDAType(dischargeSummaryImpl);

		createHeader(dischargeSummary);

		createActiveProblems(dischargeSummary);
		createAllergies(dischargeSummary);
		createResolvedProblems(dischargeSummary);
		createAdmittingDiagnosis(dischargeSummary);
		createDischargeDiagnosis(dischargeSummary);
		createDischargeMeds(dischargeSummary);
		createHospitalCourse(dischargeSummary);
		createPlanOfCare(dischargeSummary);

		System.out.println();
		save(dischargeSummary.getCDAType());

		System.out.println();
		System.out.println();
		validate(dischargeSummary.getCDAType());

	}

	public static void createHeader(IDischargeSummary doc) {
		doc.withId().setRoot("2.16.840.1.113883.3.72");

		II typeId = doc.withTypeId();
		typeId.setRoot("2.16.840.1.113883.1.3");
		typeId.setExtension("POCD_HD000040");

		doc.withEffectiveTime().setValue("20110804103022-0500");

		doc.withLanguageCode().setCode("en-US");

		doc.withTitle().addText("Test Instance of C48 Discharge Summary");

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);

		CE code = DatatypesFactory.eINSTANCE.createCE(
			"34133-9", "2.16.840.1.113883.6.1", "LOINC", "Summarization of episode note (CCD/CONF-1)");
		doc.setCode(code);

		addPatient(doc);
		addOriginalAuthor(doc);
		addDocumentCustodian(doc);
	}

	public static void addPatient(IDischargeSummary doc) {
		RecordTarget target = doc.addRecordTarget();

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		Patient patient = CDAFactory.eINSTANCE.createPatient();
		target.setPatientRole(patientRole);
		patientRole.setPatient(patient);

		II id = DatatypesFactory.eINSTANCE.createII(UUID.randomUUID().toString());
		patientRole.getIds().add(id);

		AD addr = DatatypesFactory.eINSTANCE.createAD();
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "US");
		addr.getCountries().add(country);
		patientRole.getAddrs().add(addr);
	}

	public static void addOriginalAuthor(IDischargeSummary doc) {
		Author author = doc.addAuthor();

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

	public static void addDocumentCustodian(IDischargeSummary doc) {
		Custodian custodian = doc.withCustodian();

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

	public static IProblemListSection createActiveProblems(IDischargeSummary dischargeSummary) {
		IProblemListSection problemListSection = dischargeSummary.withActiveProblems();
		ICondition condition = problemListSection.addCondition();
		condition.addId().setRoot(UUID.randomUUID().toString());
		condition.withEffectiveTime().setValue(new Date().toString());

		IProblemEntry problemEntry = condition.addProblemEntry();
		problemEntry.addId().setRoot(UUID.randomUUID().toString());

		problemEntry.withProblemStatusObservation();
		// problemEntry.withProblemStatus().withValue().setCode("123123-7");
		// problemEntry.addComment().withAuthor();

		problemEntry.withHealthStatusObservation();
		// problemEntry.withHealthStatusObservation().withValue().setCode("435345-9");

		problemEntry.withAgeObservation();
		// problemEntry.withCauseOfDeath().withTimeOfDeath().setValue(new Date().toString());

		condition.withEpisodeObservation();
		// IEpisodeObservation episodeObservation = condition.withEpisodeObservation();
		// episodeObservation.withCode().setCode("9999-2");
		// episodeObservation.withValue().setCode("7623487");

		// test toCDAType()
		System.out.println();
		System.out.println("ProblemSection code = " + problemListSection.getCDAType().getCode());
		System.out.println("ProblemEntry classCode = " + problemEntry.getCDAType().getClassCode());
		System.out.println("ProblemEntry statusCode = " + problemEntry.getCDAType().getStatusCode().getCode());

		return problemListSection;
	}

	public static IAllergiesReactionsSection createAllergies(IDischargeSummary dischargeSummary) {
		IAllergiesReactionsSection allergiesSection = dischargeSummary.withAllergies();
		allergiesSection.addAllergyDrugSensitivity();

		return allergiesSection;
	}

	public static IHistoryOfPastIllnessSection createResolvedProblems(IDischargeSummary dischargeSummary) {
		IHistoryOfPastIllnessSection resolvedProblems = dischargeSummary.withResolvedProblems();

		return resolvedProblems;
	}

	public static IHospitalAdmissionDiagnosisSection createAdmittingDiagnosis(IDischargeSummary dischargeSummary) {
		IHospitalAdmissionDiagnosisSection admittingDiagnosis = dischargeSummary.withAdmittingDiagnosis();

		return admittingDiagnosis;
	}

	public static IDischargeDiagnosisSection createDischargeDiagnosis(IDischargeSummary dischargeSummary) {
		IDischargeDiagnosisSection dischargeDiagnosis = dischargeSummary.withDischargeDiagnosis();

		return dischargeDiagnosis;
	}

	public static IHospitalDischargeMedicationsSection createDischargeMeds(IDischargeSummary dischargeSummary) {
		IHospitalDischargeMedicationsSection dischargeMeds = dischargeSummary.withDischargeMeds();

		return dischargeMeds;
	}

	public static IHospitalCourseSection createHospitalCourse(IDischargeSummary dischargeSummary) {
		IHospitalCourseSection hospitalCourse = dischargeSummary.withHospitalCourse();

		return hospitalCourse;
	}

	public static IPlanOfCareSection createPlanOfCare(IDischargeSummary dischargeSummary) {
		IPlanOfCareSection planOfCare = dischargeSummary.withPlanOfCare();

		return planOfCare;
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
