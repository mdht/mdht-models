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
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActActReference2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Act Reference2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCognitiveAbilitiesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cognitive Abilities Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActFamilyHistoryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActMentalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionAssessment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionAssessment2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCulturalAndReligiousObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCharacteristicsOfHomeEnvironment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActActReference3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Act Reference3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSelfCareActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSensoryAndSpeechStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory And Speech Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActWoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getActReference2s() <em>Get Act Reference2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCognitiveAbilitiesObservations() <em>Get Cognitive Abilities Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getFamilyHistoryOrganizers() <em>Get Family History Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getMentalStatusObservations() <em>Get Mental Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getNutritionAssessments() <em>Get Nutrition Assessments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getNutritionAssessment2s() <em>Get Nutrition Assessment2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCulturalAndReligiousObservations() <em>Get Cultural And Religious Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCharacteristicsOfHomeEnvironments() <em>Get Characteristics Of Home Environments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getNutritionalStatusObservations() <em>Get Nutritional Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPatientPriorityPreferences() <em>Get Patient Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getActReference3s() <em>Get Act Reference3s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSelfCareActivitiess() <em>Get Self Care Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSensoryAndSpeechStatuss() <em>Get Sensory And Speech Statuss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getWoundObservations() <em>Get Wound Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getExternalDocumentReferences() <em>Get External Document References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActTemplateId() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActTemplateIdTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActTemplateId(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActClassCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActClassCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActClassCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActMoodCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActMoodCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActMoodCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActId() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActIdTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				II idII = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(idII);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActId(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActCodeP() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCodePTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCodeP(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				CD codeCD = DatatypesFactory.eINSTANCE.createCD();
				codeCD.setCode("CONC");
				codeCD.setCodeSystem("2.16.840.1.113883.5.6");
				codeCD.setCodeSystemName("HL7ActClass");
				target.setCode(codeCD);
			}

			@Override
			protected void setDependency(HealthConcernAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActStatusCode() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActStatusCodeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActStatusCode(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernActEffectiveTime() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActEffectiveTimeTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActEffectiveTime(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActActReference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActActReferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActActReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActActReference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActActReference2() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActActReference2TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActActReference2",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActActReference2(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActActReference2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActAssessmentScaleObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActAssessmentScaleObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActAssessmentScaleObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActCognitiveAbilitiesObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCognitiveAbilitiesObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCognitiveAbilitiesObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCognitiveAbilitiesObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCognitiveAbilitiesObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCognitiveAbilitiesObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActFamilyHistoryOrganizer() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActFamilyHistoryOrganizerTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActFamilyHistoryOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setOrganizer(ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActFamilyHistoryOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActMentalStatusObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActMentalStatusObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActMentalStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActMentalStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActNutritionAssessment() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActNutritionAssessmentTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActNutritionAssessment",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionAssessment().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActNutritionAssessment(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActNutritionAssessmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActNutritionAssessment2() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActNutritionAssessment2TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActNutritionAssessment2",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionAssessment().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActNutritionAssessment2(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActNutritionAssessment2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActPregnancyObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPregnancyObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPregnancyObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPregnancyObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPregnancyObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPregnancyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActCaregiverCharacteristics() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCaregiverCharacteristicsTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCaregiverCharacteristics(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActCulturalAndReligiousObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCulturalAndReligiousObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCulturalAndReligiousObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCulturalAndReligiousObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCulturalAndReligiousObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActCharacteristicsOfHomeEnvironment() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActCharacteristicsOfHomeEnvironmentTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActCharacteristicsOfHomeEnvironment",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCharacteristicsOfHomeEnvironment().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActCharacteristicsOfHomeEnvironment(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActCharacteristicsOfHomeEnvironmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActNutritionalStatusObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActNutritionalStatusObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActNutritionalStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionalStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActNutritionalStatusObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActNutritionalStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActPatientPriorityPreference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActPatientPriorityPreferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActPatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActPatientPriorityPreference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActPatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActActReference3() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActActReference3TestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActActReference3",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_ACT_REFERENCE3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {

			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActActReference3(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActActReference3TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActAuthorParticipation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActAuthorParticipationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActAuthorParticipation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActSelfCareActivities() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSelfCareActivitiesTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSelfCareActivities",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createSelfCareActivities().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSelfCareActivities(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSelfCareActivitiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActSensoryAndSpeechStatus() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActSensoryAndSpeechStatusTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActSensoryAndSpeechStatus",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createSensoryAndSpeechStatus());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActSensoryAndSpeechStatus(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActSensoryAndSpeechStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActWoundObservation() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActWoundObservationTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActWoundObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createWoundObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActWoundObservation(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActWoundObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActProviderPriorityPreference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActProviderPriorityPreferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActProviderPriorityPreference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernActExternalDocumentReference() {
		OperationsTestCase<HealthConcernAct> validateHealthConcernActExternalDocumentReferenceTestCase = new OperationsTestCase<HealthConcernAct>(
			"validateHealthConcernActExternalDocumentReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(HealthConcernAct target) {
				target.getEntryRelationships().get(0).setAct(
					ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActOperations.validateHealthConcernActExternalDocumentReference(
					(HealthConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		HealthConcernAct target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReference2s() {

		HealthConcernAct target = objectFactory.create();
		target.getActReference2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveAbilitiesObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getCognitiveAbilitiesObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryOrganizers() {

		HealthConcernAct target = objectFactory.create();
		target.getFamilyHistoryOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getMentalStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionAssessments() {

		HealthConcernAct target = objectFactory.create();
		target.getNutritionAssessments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionAssessment2s() {

		HealthConcernAct target = objectFactory.create();
		target.getNutritionAssessment2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getPregnancyObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		HealthConcernAct target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCulturalAndReligiousObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getCulturalAndReligiousObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCharacteristicsOfHomeEnvironments() {

		HealthConcernAct target = objectFactory.create();
		target.getCharacteristicsOfHomeEnvironments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionalStatusObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getNutritionalStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreferences() {

		HealthConcernAct target = objectFactory.create();
		target.getPatientPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReference3s() {

		HealthConcernAct target = objectFactory.create();
		target.getActReference3s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSelfCareActivitiess() {

		HealthConcernAct target = objectFactory.create();
		target.getSelfCareActivitiess();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSensoryAndSpeechStatuss() {

		HealthConcernAct target = objectFactory.create();
		target.getSensoryAndSpeechStatuss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundObservations() {

		HealthConcernAct target = objectFactory.create();
		target.getWoundObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		HealthConcernAct target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalDocumentReferences() {

		HealthConcernAct target = objectFactory.create();
		target.getExternalDocumentReferences();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthConcernActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthConcernAct> {
		@Override
		public HealthConcernAct create() {
			return ConsolFactory.eINSTANCE.createHealthConcernAct();
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
	private static class ConstructorTestClass extends HealthConcernActOperations {
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

} // HealthConcernActOperations
