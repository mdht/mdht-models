/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) and Dan Brown (Audacious Inquiry) - initial API and implementation
 *     Dan Brown - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityIVLPQUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity IVLPQ Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedImmunizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedImmunizationActivityTemplateId() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityTemplateIdTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityTemplateId(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityClassCode() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityClassCodeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
				target.setClassCode(ActClass.ACCM);
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.setClassCode(ActClass.SBADM);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityClassCode(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityMoodCode() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityMoodCodeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			public void addPassTests() {
				for (final x_DocumentSubstanceMood mood : Arrays.asList(
					x_DocumentSubstanceMood.INT, x_DocumentSubstanceMood.PRMS, x_DocumentSubstanceMood.PRP,
					x_DocumentSubstanceMood.RQO)) {
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(PlannedImmunizationActivity target) {
							target.init();
							target.setMoodCode(mood);
						}
					});
				}
				;
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityMoodCode(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityId() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityIdTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityId(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityStatusCode() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityStatusCodeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();
				CS statusCode = DatatypesFactory.eINSTANCE.createCS("active");
				statusCode.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(statusCode);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityStatusCode(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedImmunizationActivityStatusCodeP() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityStatusCodePTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityStatusCodeP(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityEffectiveTime() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityEffectiveTimeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				SXCM_TS et = DatatypesFactory.eINSTANCE.createSXCM_TS();
				target.getEffectiveTimes().add(et);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityEffectiveTime(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityRepeatNumber() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				IVL_INT repeatNum = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(repeatNum);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRepeatNumber(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedImmunizationActivityRouteCodeP() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityRouteCodePTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRouteCodeP(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityRouteCode() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityRouteCodeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				CE rc = DatatypesFactory.eINSTANCE.createCE();
				rc.setCode("C38192");
				rc.setCodeSystem("2.16.840.1.113883.3.26.1.1");
				target.setRouteCode(rc);
			}

			@Override
			protected void setDependency(PlannedImmunizationActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityRouteCode(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedImmunizationActivityApproachSiteCodeP() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityApproachSiteCodePTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityApproachSiteCodeP(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityApproachSiteCode() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityApproachSiteCodeTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				CD asc = DatatypesFactory.eINSTANCE.createCD("not checked", "2.16.840.1.113883.6.96");
				target.getApproachSiteCodes().set(0, asc);
			}

			@Override
			protected void setDependency(PlannedImmunizationActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityApproachSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityApproachSiteCode(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityDoseQuantity() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityDoseQuantityTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				IVL_PQ doseQ = DatatypesFactory.eINSTANCE.createIVL_PQ();
				target.setDoseQuantity(doseQ);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityDoseQuantity(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityPerformer() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityPerformerTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				Performer2 perf = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(perf);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityPerformer(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityPatientPriorityPreference() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityPatientPriorityPreferenceTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityPatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityPatientPriorityPreference(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityPatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedImmunizationActivityIVLPQUnit() {
		OperationsTestCase<PlannedImmunizationActivity> validatePlannedImmunizationActivityIVLPQUnitTestCase = new OperationsTestCase<PlannedImmunizationActivity>(
			"validatePlannedImmunizationActivityIVLPQUnit",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(PlannedImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedImmunizationActivityOperations.validatePlannedImmunizationActivityIVLPQUnit(
					(PlannedImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validatePlannedImmunizationActivityIVLPQUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		PlannedImmunizationActivity target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedImmunizationActivity> {
		public PlannedImmunizationActivity create() {
			return ConsolFactory.eINSTANCE.createPlannedImmunizationActivity();
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
	private static class ConstructorTestClass extends PlannedImmunizationActivityOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PlannedImmunizationActivityOperations
