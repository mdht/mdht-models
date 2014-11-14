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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedSupply2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Supply2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Quantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Product(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getProductInstance() <em>Get Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedSupply2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2StatusCode() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCode(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedSupply2StatusCodeP() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2StatusCodePTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2StatusCodeP(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2EffectiveTime() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2EffectiveTimeTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2EffectiveTime(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2RepeatNumber() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2RepeatNumberTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2RepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2RepeatNumber(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2RepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Quantity() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2QuantityTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Quantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.setQuantity(DatatypesFactory.eINSTANCE.createPQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Quantity(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2QuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Product() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Product",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.setProduct(CDAFactory.eINSTANCE.createProduct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Product(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Performer() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PerformerTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				Performer2 p = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Performer(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2AuthorParticipation() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2AuthorParticipationTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2AuthorParticipation(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProductInstance() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProductInstanceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				for (Participant2 p : target.getParticipants()) {
					p.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProductInstance(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2PatientPriorityPreference() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PatientPriorityPreferenceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PatientPriorityPreference(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2ProviderPriorityPreference() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2ProviderPriorityPreferenceTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2ProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2ProviderPriorityPreference(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2ProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Indication2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Indication2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Indication2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2Instruction2() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2Instruction2TestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2Instruction2(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedSupply2PlannedCoverage() {
		OperationsTestCase<PlannedSupply2> validatePlannedSupply2PlannedCoverageTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlannedSupply2PlannedCoverage",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedCoverage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlannedSupply2PlannedCoverage(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedSupply2PlannedCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstance() {

		PlannedSupply2 target = objectFactory.create();
		target.getProductInstance();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		PlannedSupply2 target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		PlannedSupply2 target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedSupply2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedSupply2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedCoverages() {

		PlannedSupply2 target = objectFactory.create();
		target.getPlannedCoverages();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyTemplateId() {
		OperationsTestCase<PlannedSupply2> validatePlanOfCareActivitySupplyTemplateIdTestCase = new OperationsTestCase<PlannedSupply2>(
			"validatePlanOfCareActivitySupplyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedSupply2 target) {

			}

			@Override
			protected void updateToPass(PlannedSupply2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedSupply2Operations.validatePlanOfCareActivitySupplyTemplateId(
					(PlannedSupply2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedSupply2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedSupply2> {
		@Override
		public PlannedSupply2 create() {
			return ConsolFactory.eINSTANCE.createPlannedSupply2();
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
	private static class ConstructorTestClass extends PlannedSupply2Operations {
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

} // PlannedSupply2Operations
