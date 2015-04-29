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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlanOfCareActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlanOfCareActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2CodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2CodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2CodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2Code() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2CodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				CD code = target.getCode();
				code.setCodeSystem(LOINC_ID);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Code(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2StatusCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2StatusCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2StatusCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2StatusCodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2StatusCodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2StatusCodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2EffectiveTime() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EffectiveTimeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EffectiveTime(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2Value() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2ValueTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Value(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2MethodCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2MethodCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2MethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2MethodCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2TargetSiteCodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2TargetSiteCodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2TargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2TargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2TargetSiteCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2TargetSiteCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2TargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				CD tsc = DatatypesFactory.eINSTANCE.createCD("notChecked", SNOMEDCT_ID);
				target.getTargetSiteCodes().set(0, tsc);
			}

			@Override
			protected void setDependency(PlannedObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2TargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2Performer() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PerformerTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Performer(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2AuthorParticipation() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2AuthorParticipationTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2AuthorParticipation(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2PriorityPreference() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PriorityPreferenceTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2PriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2PriorityPreference(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2Indication2() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2Indication2TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Indication2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Indication2(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2Indication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2Instruction2() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2Instruction2TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Instruction2(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedObservation2PlannedCoverage() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PlannedCoverageTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2PlannedCoverage",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedCoverage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2PlannedCoverage(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PlannedCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferences() {

		PlannedObservation2 target = objectFactory.create();
		target.getPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication2s() {

		PlannedObservation2 target = objectFactory.create();
		target.getIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedObservation2 target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedCoverages() {

		PlannedObservation2 target = objectFactory.create();
		target.getPlannedCoverages();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityObservationTemplateId() {
		OperationsTestCase<PlannedObservation2> validatePlanOfCareActivityObservationTemplateIdTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlanOfCareActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlanOfCareActivityObservationTemplateId(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityObservationMoodCode() {
		OperationsTestCase<PlannedObservation2> validatePlanOfCareActivityObservationMoodCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlanOfCareActivityObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();
				target.setMoodCode(x_ActMoodDocumentObservation.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlanOfCareActivityObservationMoodCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedObservation2> {
		@Override
		public PlannedObservation2 create() {
			return ConsolFactory.eINSTANCE.createPlannedObservation2();
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
	private static class ConstructorTestClass extends PlannedObservation2Operations {
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

} // PlannedObservation2Operations
