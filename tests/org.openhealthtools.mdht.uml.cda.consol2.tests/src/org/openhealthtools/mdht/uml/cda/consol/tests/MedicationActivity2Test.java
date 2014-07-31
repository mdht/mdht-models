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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2InstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2DoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimeIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimeIVLTSorTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLT Sor TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2DrugMonitoringAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityMedicationSupplyOrder2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityMedicationDispense2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationActivityConsumableMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Activity Consumable Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getDrugMonitoringAct() <em>Get Drug Monitoring Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getSubstanceAdministeredActs() <em>Get Substance Administered Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolMedicationDispense2s() <em>Get Consol Medication Dispense2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#getConsolReactionObservation2() <em>Get Consol Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
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
	public void testValidateMedicationActivity2InstructionsInversionInd() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2InstructionsInversionIndTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2InstructionsInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2InstructionsInversionInd(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2InstructionsInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2DoseQuantityorrateQuantity() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2DoseQuantityorrateQuantityTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2DoseQuantityorrateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2DoseQuantityorrateQuantity(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2DoseQuantityorrateQuantityTestCase.doValidationTest();
	}

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
	public void testValidateMedicationActivity2EffectiveTimeIVLTSHigh() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EffectiveTimeIVLTSHighTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EffectiveTimeIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSHigh(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EffectiveTimeIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2EffectiveTimePIVLTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EffectiveTimePIVLTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EffectiveTimePIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimePIVLTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EffectiveTimePIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2EffectiveTimeIVLTSorTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EffectiveTimeIVLTSorTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EffectiveTimeIVLTSorTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSorTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EffectiveTimeIVLTSorTSTestCase.doValidationTest();
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
	public void testValidateMedicationActivityInstruction2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityInstruction2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivityInstruction2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstruction2TestCase.doValidationTest();
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
	public void testValidateMedicationActivityIndication2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityIndication2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityIndication2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivityIndication2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityIndication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityMedicationSupplyOrder2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityMedicationSupplyOrder2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityMedicationSupplyOrder2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivityMedicationSupplyOrder2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationSupplyOrder2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityMedicationDispense2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityMedicationDispense2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityMedicationDispense2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivityMedicationDispense2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationDispense2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivityReactionObservation2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityReactionObservation2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityReactionObservation2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivityReactionObservation2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationActivity2MedicationActivityConsumableMedicationInformation2() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2MedicationActivityConsumableMedicationInformation2TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2MedicationActivityConsumableMedicationInformation2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivity2Operations.validateMedicationActivity2MedicationActivityConsumableMedicationInformation2(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2MedicationActivityConsumableMedicationInformation2TestCase.doValidationTest();
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
