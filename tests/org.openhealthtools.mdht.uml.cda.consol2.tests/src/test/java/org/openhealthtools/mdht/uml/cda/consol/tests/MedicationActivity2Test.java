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
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS Low Xor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2DrugMonitoringAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationFreeTextSig(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Free Text Sig</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getDrugMonitoringAct() <em>Get Drug Monitoring Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getSubstanceAdministeredActs() <em>Get Substance Administered Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolMedicationDispense2s() <em>Get Consol Medication Dispense2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolReactionObservation2() <em>Get Consol Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getMedicationFreeTextSigs() <em>Get Medication Free Text Sigs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSorTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumableMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2SubstanceAdministeredActInversionInd() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActInversionIndTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredActInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createSubstanceAdministeredAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActInversionInd(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2SubstanceAdministeredActSequenceNumber() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActSequenceNumberTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredActSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createSubstanceAdministeredAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setSequenceNumber(DatatypesFactory.eINSTANCE.createINT());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActSequenceNumber(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2EffectiveTimeIVLTSLowXorValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EffectiveTimeIVLTSLowXorValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EffectiveTimeIVLTSLowXorValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Note: we can't provide a fail test for both in code as we
			// can only have an IVL_TS with a low or
			// a TS with a value anyway as per types

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationActivity2 target) {
						// Contains effectiveTime of type TS (SCXM_TS) withOUT a value element
						target.init();
						target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationActivity2 target) {
						// Contains effectiveTime of type IVL_TS (SCXM_TS) withOUT a low element
						target.init();
						target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS());
					}
				});
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						// test 1 - Contains effectiveTime of type TS (SCXM_TS) with a value element
						target.init();
						target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());
						target.getEffectiveTimes().get(0).setValue("hasAValueAndDefaultsToTypeTS");
					}
				});

				// everything works but this test with latest OCL - this test must be written wrong..
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						// test 2 - Contains effectiveTime of type IVL_TS with a low
						target.init();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
						ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.getEffectiveTimes().add(ef);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EffectiveTimeIVLTSLowXorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityStatusCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityStatusCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityStatusCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityAdministrationUnitCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2DrugMonitoringAct() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2DrugMonitoringActTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2DrugMonitoringAct",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createDrugMonitoringAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2DrugMonitoringAct(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2DrugMonitoringActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2AuthorParticipation() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2AuthorParticipationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2AuthorParticipation(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2SubstanceAdministeredAct() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredAct",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createSubstanceAdministeredAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredAct(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2MedicationFreeTextSig() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2MedicationFreeTextSigTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2MedicationFreeTextSig",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
					er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationFreeTextSig().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2MedicationFreeTextSig(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2MedicationFreeTextSigTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugMonitoringAct() {

		MedicationActivity2 target = objectFactory.create();
		target.getDrugMonitoringAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2() {

		MedicationActivity2 target = objectFactory.create();
		target.getConsolInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSubstanceAdministeredActs() {

		MedicationActivity2 target = objectFactory.create();
		target.getSubstanceAdministeredActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		MedicationActivity2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationSupplyOrder2() {

		MedicationActivity2 target = objectFactory.create();
		target.getConsolMedicationSupplyOrder2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationDispense2s() {

		MedicationActivity2 target = objectFactory.create();
		target.getConsolMedicationDispense2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolReactionObservation2() {

		MedicationActivity2 target = objectFactory.create();
		target.getConsolReactionObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationFreeTextSigs() {

		MedicationActivity2 target = objectFactory.create();
		target.getMedicationFreeTextSigs();

	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationActivityTextReference() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextReferenceTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTextReference(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationActivityReferenceValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityReferenceValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityReferenceValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationActivityTextReferenceValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextReferenceValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTextReferenceValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityInstructionsInversionInd() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityInstructionsInversionIndTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityInstructionsInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityInstructionsInversionInd(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstructionsInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantityorrateQuantity() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityDoseQuantityorrateQuantityTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityDoseQuantityorrateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						target.setRateQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityDoseQuantityorrateQuantity(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityorrateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSorTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSorTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSorTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSorTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSorTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSLow() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSLowTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.getEffectiveTimes().clear();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.getEffectiveTimes().add(ef);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSLow(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSHigh() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSHighTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(et);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.getEffectiveTimes().clear();
				IVL_TS etWithHigh = DatatypesFactory.eINSTANCE.createIVL_TS();
				etWithHigh.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.getEffectiveTimes().add(etWithHigh);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSHigh(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimePIVLTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimePIVLTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimePIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						PIVL_TS et = DatatypesFactory.eINSTANCE.createPIVL_TS();
						target.getEffectiveTimes().add(et);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationActivity2 target) {
						target.init();
						EIVL_TS et = DatatypesFactory.eINSTANCE.createEIVL_TS();
						target.getEffectiveTimes().add(et);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimePIVLTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimePIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityTemplateId() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTemplateIdTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTemplateId(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityRepeatNumber() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRepeatNumberTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRepeatNumber(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityRouteCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRouteCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRouteCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityRouteCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRouteCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				target.setRouteCode(DatatypesFactory.eINSTANCE.createCE("C38192", "2.16.840.1.113883.3.26.1.1"));
			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRouteCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityStatusCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityStatusCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityStatusCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityAdministrationUnitCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE("APPFUL", "2.16.840.1.113883.5.85"));
			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationActivityText() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityText(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityInstructions() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityInstructionsTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityInstructions",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityInstructions(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityIndication() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityIndicationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityIndication",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				// Consol Medication Activity2 MAY contain zero or more [0..*] entryRelationship (CONF:7536, CONF:7537, CONF:16087)
				// Contains @typeCode="RSON" RSON, and Contains exactly one [1..1] Indication2 (templateId: 2.16.840.1.113883.10.20.22.4.19.2)
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityIndication(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantity() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityDoseQuantityTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityDoseQuantity(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityConsumable() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityConsumableTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityConsumable(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityMedicationSupplyOrder() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityMedicationSupplyOrderTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createMedicationSupplyOrder2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityMedicationSupplyOrder(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityMedicationDispense() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityMedicationDispenseTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityMedicationDispense",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createMedicationDispense2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityMedicationDispense(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationDispenseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityReactionObservation() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityReactionObservationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityReactionObservation(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityPrecondition() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();
				Precondition p = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPrecondition(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityPreconditionTypeCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPreconditionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				Precondition p = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(p);
				p.setTypeCode(ActRelationshipType.APND);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				for (Precondition p : target.getPreconditions()) {
					p.setTypeCode(ActRelationshipType.PRCN);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPreconditionTypeCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityPreconditionPreconditionForSubstanceAdministration() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionPreconditionForSubstanceAdministrationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPreconditionPreconditionForSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				Precondition p = CDAFactory.eINSTANCE.createPrecondition();
				target.getPreconditions().add(p);
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				for (Precondition p : target.getPreconditions()) {
					p.setCriterion(ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration2().init());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionPreconditionForSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityConsumableMedicationInformation() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityConsumableMedicationInformationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityConsumableMedicationInformation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.getConsumable().setManufacturedProduct(
					ConsolFactory.eINSTANCE.createMedicationInformation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityConsumableMedicationInformation(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityConsumableMedicationInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationActivity2> {
		@Override
		public MedicationActivity2 create() {
			return ConsolFactory.eINSTANCE.createMedicationActivity2();
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
	private static class ConstructorTestClass extends MedicationActivity2Operations {
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

} // MedicationActivity2Operations
