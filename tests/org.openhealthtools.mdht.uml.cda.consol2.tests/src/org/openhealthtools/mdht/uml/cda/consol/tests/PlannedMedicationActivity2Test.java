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
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedMedicationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2DoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2MaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2PatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Consumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qdose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2IVLPQrateQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qrate Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ConsumableMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedMedicationActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2StatusCode() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2StatusCodeTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2StatusCode(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedMedicationActivity2StatusCodeP() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2StatusCodePTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2StatusCodeP(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2EffectiveTime() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2EffectiveTimeTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2EffectiveTime(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2RepeatNumber() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2RepeatNumberTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2RepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RepeatNumber(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2RepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2RouteCode() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2RouteCodeTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2RouteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.setRouteCode(DatatypesFactory.eINSTANCE.createCE("C38192", "2.16.840.1.113883.3.26.1.1"));
			}

			@Override
			protected void setDependency(PlannedMedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2RouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RouteCode(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2RouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2ApproachSiteCode() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2ApproachSiteCodeTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2ApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
				target.getApproachSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.getApproachSiteCodes().set(0, DatatypesFactory.eINSTANCE.createCD("mustExistOnly", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(PlannedMedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2ApproachSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ApproachSiteCode(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2ApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2DoseQuantity() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2DoseQuantityTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2DoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2DoseQuantity(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2DoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2RateQuantity() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2RateQuantityTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2RateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.setRateQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RateQuantity(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2RateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2MaxDoseQuantity() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2MaxDoseQuantityTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2MaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.setMaxDoseQuantity(DatatypesFactory.eINSTANCE.createRTO_PQ_PQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2MaxDoseQuantity(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2MaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedMedicationActivity2AdministrationUnitCodeP() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2AdministrationUnitCodePTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2AdministrationUnitCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AdministrationUnitCodeP(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2AdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2AdministrationUnitCode() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2AdministrationUnitCodeTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2AdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.getAdministrationUnitCode().setCode("APPFUL");
				target.getAdministrationUnitCode().setCodeSystem("2.16.840.1.113883.5.85");
			}

			@Override
			protected void setDependency(PlannedMedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2AdministrationUnitCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AdministrationUnitCode(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2AdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2Performer() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2PerformerTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Performer(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2AuthorParticipation() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2AuthorParticipationTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AuthorParticipation(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2PatientPriorityPreference() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2PatientPriorityPreferenceTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2PatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2PatientPriorityPreference(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2PatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2ProviderPriorityPreference() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2ProviderPriorityPreferenceTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2ProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ProviderPriorityPreference(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2ProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2Indication2() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2Indication2TestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Indication2(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2Instruction2() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2Instruction2TestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Instruction2(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2Consumable() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2ConsumableTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2Consumable",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Consumable(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2ConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* modified VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP 
	* due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidatePlannedMedicationActivity2IVLPQdoseQuantityUnit() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2IVLPQdoseQuantityUnitTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2IVLPQdoseQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
				target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.getDoseQuantity().setUnit("hasUnit");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2IVLPQdoseQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* modified VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP 
	* due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidatePlannedMedicationActivity2IVLPQrateQuantityUnit() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2IVLPQrateQuantityUnitTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2IVLPQrateQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
				target.setRateQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.getRateQuantity().setUnit("hasUnit");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2IVLPQrateQuantityUnit(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2IVLPQrateQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedMedicationActivity2ConsumableMedicationInformation2() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlannedMedicationActivity2ConsumableMedicationInformation2TestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlannedMedicationActivity2ConsumableMedicationInformation2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {
				target.init();
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.getConsumable().setManufacturedProduct(
					ConsolFactory.eINSTANCE.createMedicationInformation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ConsumableMedicationInformation2(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedMedicationActivity2ConsumableMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		PlannedMedicationActivity2 target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		PlannedMedicationActivity2 target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedMedicationActivity2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedMedicationActivity2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationTemplateId() {
		OperationsTestCase<PlannedMedicationActivity2> validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<PlannedMedicationActivity2>(
			"validatePlanOfCareActivitySubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedMedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(PlannedMedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedMedicationActivity2Operations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
					(PlannedMedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedMedicationActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedMedicationActivity2> {
		public PlannedMedicationActivity2 create() {
			return ConsolFactory.eINSTANCE.createPlannedMedicationActivity2();
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
	private static class ConstructorTestClass extends PlannedMedicationActivity2Operations {
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

} // PlannedMedicationActivity2Operations
