/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.AssignedEntity;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Performer1;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.ActClassRoot;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.eclipse.mdht.uml.hl7.vocab.x_ServiceEventPerformer;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocument2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ProceduresSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Encounters Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2FunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ImmunizationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2PayersSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2VitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2FamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getProceduresSection2() <em>Get Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getEncountersSectionEntriesOptional2() <em>Get Encounters Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getImmunizationsSection2() <em>Get Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getPayersSection2() <em>Get Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ContinuityOfCareDocument2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2CodeP() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2CodePTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2CodeP(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2Code() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2CodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2Code",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ContinuityOfCareDocument2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Code(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2Author() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2Author", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Author(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOf() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOf(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AllergiesSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AllergiesSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AllergiesSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AllergiesSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AllergiesSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2MedicationsSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2MedicationsSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2MedicationsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MedicationsSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2MedicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2ProblemSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ProblemSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ProblemSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ProblemSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ProblemSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2ProceduresSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ProceduresSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ProceduresSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ProceduresSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ProceduresSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2ResultsSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ResultsSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ResultsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ResultsSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ResultsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2EncountersSectionEntriesOptional2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2EncountersSectionEntriesOptional2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2EncountersSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2EncountersSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2FunctionalStatusSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2FunctionalStatusSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2FunctionalStatusSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFunctionalStatusSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2FunctionalStatusSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2FunctionalStatusSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2ImmunizationsSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ImmunizationsSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ImmunizationsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ImmunizationsSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ImmunizationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2MedicalEquipmentSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2MedicalEquipmentSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2MedicalEquipmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicalEquipmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MedicalEquipmentSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2MedicalEquipmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2PayersSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2PayersSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2PayersSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPayersSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2PayersSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2PayersSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2PlanOfTreatmentSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2PlanOfTreatmentSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2PlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2PlanOfTreatmentSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2SocialHistorySection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2SocialHistorySection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2SocialHistorySection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2SocialHistorySection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2SocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2VitalSignsSection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2VitalSignsSection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2VitalSignsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2VitalSignsSection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2VitalSignsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2MentalStatusSection() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2MentalStatusSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2MentalStatusSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

				/* MentalStatusSection */
				MentalStatusSection section =

				ConsolFactory.eINSTANCE.createMentalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2MentalStatusSection(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2MentalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2NutritionSection() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2NutritionSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2NutritionSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

				ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2NutritionSection(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2NutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2FamilyHistorySection2() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2FamilyHistorySection2TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2FamilyHistorySection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFamilyHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2FamilyHistorySection2(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2FamilyHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// Contains an assignedAuthor which does not contain
						// an assignedPerson element or a representedOrganization element
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// assignedPerson element and representedOrganization element
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						aa.setAssignedPerson(person);
						aa.setRepresentedOrganization(org);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// assignedPerson element only
						target.getAuthors().clear();
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// representedOrganization element only
						target.getAuthors().clear();
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						author.setTime(DatatypesFactory.eINSTANCE.createTS());
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(org);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setNullFlavor(NullFlavor.NA);
				aa.getIds().add(id);
				aa.setRepresentedOrganization(org);
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthor() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthor(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLowTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getDocumentationOfs().add(dof);
				dof.setServiceEvent(se);
				se.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.getServiceEvent().getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHighTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getDocumentationOfs().add(dof);
				dof.setServiceEvent(se);
				se.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.getServiceEvent().getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String NPI_ID = "2.16.840.1.113883.4.6";

			private static final String INCORRECT_NPI_ID = "2.16.777.7.777777.7.7";

			private static final String EXT_VAL = "ValueIsIrrelevant";

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// f1
						// <assignedPerson> exists and there is one id and the id/@root does NOT = '2.16.840.1.113883.4.6'
						// and the id's/@extension exists)
						// expect fail because assigned person exists and the only root (NPI) is incorrect
						System.out.println("\nf1");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// f2
						// -<assignedPerson> exists and there is one id and (the id/@root = '2.16.840.1.113883.4.6'
						// and the only id/@extension DOES NOT EXIST)
						// expect fail because assigned person exists and the only id/@extension does not exist
						System.out.println("\nf2");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// f3
						// -<assignedPerson> exists and there is one id and (the id/@root does NOT = '2.16.840.1.113883.4.6'
						// and the id's/@extension DOES NOT EXIST)
						// expect fail because assigned person exists and the root (NPI) is incorrect and
						// the only id/@extension does not exist
						System.out.println("\nf3");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				// null testing

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// fn1
						// one id
						// nullFlavor replacing the root instead of the extension
						System.out.println("\nfn1");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						II id = DatatypesFactory.eINSTANCE.createII();
						id.setExtension(EXT_VAL);
						ae.getIds().add(id);
						ae.getIds().get(0).setNullFlavor(NullFlavor.UNK);

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// fn2
						// one id
						// incorrect NPI in the root mixed with a null flavor
						System.out.println("\nfn2 \nincorrect NPI in the root mixed with a null flavor");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID));
						ae.getIds().get(0).setNullFlavor(NullFlavor.UNK);

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				// old tests

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// one id only
						// Id is NOT equal to 2.16.840.1.113883.4.6 (or does not have a nullFlavor set instead)
						// and does not have an @extension (has assignedPerson)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// one id only
						// id does not have an attribute root or extension (or any attribute) (or does not have a nullFlavor set instead)
						// (has assignedPerson)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII());

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// two ids
						// Has Id but has two id's with a root each (has assignedPerson) (neither of which have a valid NPI)
						// It should fail, but under the hood, it should only be failing due to not having at least one valid id as opposed to failing
						// both specifically
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("222222"));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ContinuityOfCareDocument2 target) {
						// two ids
						// Has an assignedPerson element and the assignedEntity has two ids (neither of which have a valid NPI)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII());

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// p1
						// one id only
						// <assignedPerson> exists and there is an id and (the id/@root = '2.16.840.1.113883.4.6'
						// and the id's/@extension exists)
						System.out.println("\np1");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// p2
						// NO id
						// If there is no id, none of the checks can be enforced, instead, that will be caught by:
						// Consol Assigned Author SHALL contain at least one [1..*] id (CONF:5449)
						// If there's an assignedPerson element and the assignedAuthor has zero (no) ids
						System.out.println("\np2");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// p3
						// one id only
						// *NO ASSIGNED PERSON
						// If <assignedPerson> DOES NOT exist (we don't enforce the id/@root or id/@extension NPI warning at all
						// For the example we have an incorrect NPI, which is NOT checked.
						System.out.println("\np3");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				// nullFlavor tests

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// pn1
						// one id only
						// correct NPI root and a nullFlavor at the same time (no extension)
						System.out.println("\npn1");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						II id = DatatypesFactory.eINSTANCE.createII();
						id.setRoot(NPI_ID);
						id.setNullFlavor(NullFlavor.UNK);
						ae.getIds().add(id);

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// pn2
						// one id only
						// nullFlavor in id (and nothing else in id), has assignedPerson
						System.out.println("\npn2");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				// multiple id tests (see errata 1015)
				// http://www.hl7.org/dstucomments/showdetail_comment.cfm?commentid=1015

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// DSTU:1015-1
						// two valid ids
						// <assignedPerson> exists and there are 2 ids
						// the id/@root both = '2.16.840.1.113883.4.6' and the id/@extension both exist
						System.out.println("\nDSTU:1015-1");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// DSTU:1015-2
						// three valid ids
						// <assignedPerson> exists and there are 3 ids
						// the id/@root all = '2.16.840.1.113883.4.6' and the id/@extension all exist
						System.out.println("\nDSTU:1015-2");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// Note: This is the most important test for verifying errata 1015 is working
						// DSTU:1015-3
						// one valid id, one invalid id, only one valid id is needed to pass
						// <assignedPerson> exists and there are 2 ids
						// one id/@root = '2.16.840.1.113883.4.6' and the other is invalid
						// the id/@extension both exist
						System.out.println("\nDSTU:1015-3");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// DSTU:1015-4
						// one valid id, two invalid ids, only one valid id is needed to pass
						// <assignedPerson> exists and there are 3 ids
						// one id/@root = '2.16.840.1.113883.4.6' and the other 2 are invalid
						// the id/@extension all exist
						System.out.println("\nDSTU:1015-4");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NPI_ID, EXT_VAL));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// DSTU:1015-5
						// two ids
						// 1st id: incorrect NPI and has extension
						// 2nd id: correct NPI root and a nullFlavor at the same time (no extension)
						System.out.println("\nDSTU:1015-5");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(INCORRECT_NPI_ID, EXT_VAL));
						II id2 = DatatypesFactory.eINSTANCE.createII();
						id2.setRoot(NPI_ID);
						id2.setNullFlavor(NullFlavor.UNK);
						ae.getIds().add(id2);

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// DSTU:1015-6
						// two ids
						// 1st and second id are the same (except nullFlavor type):
						// nullFlavor in id (and nothing else in id), has assignedPerson
						System.out.println("\nDSTU:1015-6");
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

						ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.UNK));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				// *no assignedPerson tests which negates the requirements

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// one id only
						// Id is equal to 2.16.840.1.113883.4.6 (without assignedPerson)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// one id only
						// nullFlavor on Id without assignedPerson
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// one id only
						// (*no assignedPerson) and no extension
						// Id is NOT equal to 2.16.840.1.113883.4.6 (or does not have a nullFlavor set instead)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// one id only
						// Id does not have an attribute root (or any attribute) (or does not have a nullFlavor set instead) and no extension
						// but *no assignedPerson
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII());

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// two incorrect ids
						// Has Id but has two roots (*no assignedPerson)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("222222"));

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// one empty id element but no assignedPerson to enforce rule
						// Has Id but has zero roots (*no assignedPerson)
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getIds().add(DatatypesFactory.eINSTANCE.createII());

						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				// no id
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// 1 id only
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "5555555555"));
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ContinuityOfCareDocument2 target) {
						// more than 1 id
						target.init();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "5555555555"));
						ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.9.9", "54321"));
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();

				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();

				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssignedPerson(ap);
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6", "12345"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				perf.setTypeCode(x_ServiceEventPerformer.PRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setClassCode(ActClassRoot.PCPR);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.getPerformers().add(CDAFactory.eINSTANCE.createPerformer1());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEvent() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEvent(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getAllergiesSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getMedicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getProblemSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getProceduresSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getResultsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSectionEntriesOptional2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getEncountersSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getFunctionalStatusSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getImmunizationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getMedicalEquipmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayersSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getPayersSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getVitalSignsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusSection() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getMentalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection2() {

		ContinuityOfCareDocument2 target = objectFactory.create();
		target.getFamilyHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ContinuityOfCareDocument2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ContinuityOfCareDocument2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<ContinuityOfCareDocument2> {
		public ContinuityOfCareDocument2 create() {
			return ConsolFactory.eINSTANCE.createContinuityOfCareDocument2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends ContinuityOfCareDocument2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ContinuityOfCareDocument2Operations
