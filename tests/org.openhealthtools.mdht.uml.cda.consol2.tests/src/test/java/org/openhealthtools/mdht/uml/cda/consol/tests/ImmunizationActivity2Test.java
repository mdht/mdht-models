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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2TextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2TextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2InstructionInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Instruction Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityMedicationSupplyOrder2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityMedicationDispense2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipForSubAdminAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship For Sub Admin Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Substance Administered Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Consumable Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Precondition For Substance Administration2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolDrugVehicles() <em>Get Consol Drug Vehicles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolMedicationDispense2() <em>Get Consol Medication Dispense2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolReactionObservation2() <em>Get Consol Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationActivity2TextReference() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2TextReferenceTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2TextReference",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2TextReference(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2TextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationActivity2ReferenceValue() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2ReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2ReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2ReferenceValue(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2ReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationActivity2TextReferenceValue() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2TextReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2TextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2TextReferenceValue(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2TextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2InstructionInversion() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2InstructionInversionTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2InstructionInversion",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_INSTRUCTION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createInstruction2().init());
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ImmunizationActivity2 target) {
						// Test case with entry Relationship , but no Instruction Act
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2InstructionInversion(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2InstructionInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityStatusCodeP() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityStatusCodePTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityStatusCodeP(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2AuthorParticipation() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2AuthorParticipationTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2AuthorParticipation(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityIndication2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityIndication2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityIndication2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityIndication2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIndication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityMedicationSupplyOrder2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityMedicationSupplyOrder2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityMedicationSupplyOrder2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createMedicationSupplyOrder2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityMedicationSupplyOrder2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationSupplyOrder2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityMedicationDispense2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityMedicationDispense2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityMedicationDispense2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createMedicationDispense2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityMedicationDispense2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationDispense2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityReactionObservation2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityReactionObservation2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityReactionObservation2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityReactionObservation2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityInstruction2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityInstruction2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityInstruction2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipForSubAdminAct() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipForSubAdminActTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipForSubAdminAct",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_FOR_SUB_ADMIN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipForSubAdminAct(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipForSubAdminActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipTypeCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (EntryRelationship e : target.getEntryRelationships()) {
					e.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipTypeCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipInversionInd() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipInversionIndTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (EntryRelationship e : target.getEntryRelationships()) {
					e.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipInversionInd(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipSequenceNumber() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipSequenceNumberTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setSequenceNumber(DatatypesFactory.eINSTANCE.createINT());
					target.getEntryRelationships().add(er);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSequenceNumber(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipSubstanceAdministeredActTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
					er.setAct(ConsolFactory.eINSTANCE.createSubstanceAdministeredAct().init());
					target.getEntryRelationships().add(er);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipSubstanceAdministeredActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.getConsumable().setManufacturedProduct(
					ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2ImmunizationActivityPreconditionTypeCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2ImmunizationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				Precondition pre = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(pre);
				pre.setTypeCode(ActRelationshipType.APND);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (Precondition p : target.getPreconditions()) {
					p.setTypeCode(ActRelationshipType.PRCN);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2ImmunizationActivityPreconditionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				Precondition pre = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(pre);
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				for (Precondition p : target.getPreconditions()) {
					p.setCriterion(ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration2().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolDrugVehicles() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolDrugVehicles();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationSupplyOrder2() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolMedicationSupplyOrder2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationDispense2() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolMedicationDispense2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolReactionObservation2() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolReactionObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2() {

		ImmunizationActivity2 target = objectFactory.create();
		target.getConsolInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTemplateId() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityTemplateIdTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityTemplateId(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityStatusCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityStatusCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ImmunizationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityStatusCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityRepeatNumber() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityRepeatNumber(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCodeP() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCodeP(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE("DROP", "2.16.840.1.113883.5.85"));
			}

			@Override
			protected void setDependency(ImmunizationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityNegationInd() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityNegationIndTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.setNegationInd(false);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityNegationInd(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicle() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityDrugVehicleTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				DrugVehicle dv = ConsolFactory.eINSTANCE.createDrugVehicle().init();
				for (Participant2 p2 : target.getParticipants()) {
					p2.setParticipantRole(dv);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityDrugVehicle(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityConsumable() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityConsumableTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityConsumable(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityPrecondition() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityPreconditionTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();
				Precondition pre = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(pre);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityPrecondition(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationActivity2> {
		@Override
		public ImmunizationActivity2 create() {
			return ConsolFactory.eINSTANCE.createImmunizationActivity2();
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
	private static class ConstructorTestClass extends ImmunizationActivity2Operations {
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

} // ImmunizationActivity2Operations
