/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Reference;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.RiskConcernActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAllergyObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceRelatesTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Relates To</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceHasComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Has Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSelfCareActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2B(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSmokingStatusMeaningfulUse2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEncounterDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActFamilyHistoryOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActFunctionalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActHospitalAdmissionDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActMentalStatusObservation2C(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 C</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionAssessment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionAssessmentB(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPostprocedureDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPreoperativeDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActResultObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSensoryStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSocialHistoryObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActSubstanceOrDeviceAllergyObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActTobaccoUse2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActVitalSignObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActWoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemObservation2HasSupport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Has Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCulturalAndReligiousObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActCharacteristicsOfHomeEnvironment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActNutritionalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActResultOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPriorityPreferencePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActPriorityPreferenceProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActProblemConcernAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActEntryReferenceHealthConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Health Concern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#validateRiskConcernActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getProblemObservation2s() <em>Get Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getAllergyObservation2s() <em>Get Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getEntryReferenceRelatesTos() <em>Get Entry Reference Relates Tos</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getEntryReferenceHasComponents() <em>Get Entry Reference Has Components</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getMentalStatusObservation2s() <em>Get Mental Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getSelfCareActivitiess() <em>Get Self Care Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getMentalStatusObservation2Bs() <em>Get Mental Status Observation2 Bs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getSmokingStatusMeaningfulUse2s() <em>Get Smoking Status Meaningful Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getEncounterDiagnosis2s() <em>Get Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getFamilyHistoryOrganizer2s() <em>Get Family History Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getFunctionalStatusObservation2s() <em>Get Functional Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getHospitalAdmissionDiagnosis2s() <em>Get Hospital Admission Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getMentalStatusObservation2Cs() <em>Get Mental Status Observation2 Cs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getNutritionAssessments() <em>Get Nutrition Assessments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getNutritionAssessmentBs() <em>Get Nutrition Assessment Bs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getPostprocedureDiagnosis2s() <em>Get Postprocedure Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getPreoperativeDiagnosis2s() <em>Get Preoperative Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getReactionObservation2s() <em>Get Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getResultObservation2s() <em>Get Result Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getSensoryStatuss() <em>Get Sensory Statuss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getSocialHistoryObservation2s() <em>Get Social History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getSubstanceOrDeviceAllergyObservation2s() <em>Get Substance Or Device Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getTobaccoUse2s() <em>Get Tobacco Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getVitalSignObservation2s() <em>Get Vital Sign Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getWoundObservations() <em>Get Wound Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getProblemObservation2HasSupports() <em>Get Problem Observation2 Has Supports</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getCulturalAndReligiousObservations() <em>Get Cultural And Religious Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getCharacteristicsOfHomeEnvironments() <em>Get Characteristics Of Home Environments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getNutritionalStatusObservations() <em>Get Nutritional Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getResultOrganizer2s() <em>Get Result Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getPriorityPreferencePatients() <em>Get Priority Preference Patients</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getPriorityPreferenceProviders() <em>Get Priority Preference Providers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getProblemConcernAct2s() <em>Get Problem Concern Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct#getEntryReferenceHealthConcerns() <em>Get Entry Reference Health Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RiskConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActTemplateId() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActTemplateIdTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActTemplateId(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActClassCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActClassCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActClassCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActMoodCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMoodCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMoodCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActId() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActIdTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActId(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActCodeP() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCodePTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCodeP(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

			}

			@Override
			protected void setDependency(RiskConcernAct target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActStatusCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActStatusCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActStatusCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActStatusCodeP() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActStatusCodePTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActStatusCodeP(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRiskConcernActEffectiveTime() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEffectiveTimeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEffectiveTime(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActAuthorParticipation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAuthorParticipationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {

			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAuthorParticipation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActProblemObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemObservation2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActAllergyObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAllergyObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAllergyObservation2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAllergyObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAllergyObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActEntryReferenceRelatesTo() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceRelatesToTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceRelatesTo",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceRelatesTo(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceRelatesToTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActEntryReferenceHasComponent() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceHasComponentTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceHasComponent",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceHasComponent(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceHasComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActAssessmentScaleObservation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActAssessmentScaleObservationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActAssessmentScaleObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActAssessmentScaleObservation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActMentalStatusObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActSelfCareActivities() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSelfCareActivitiesTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSelfCareActivities", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSelfCareActivities().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSelfCareActivities(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSelfCareActivitiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActMentalStatusObservation2B() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2BTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2B",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2B(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2BTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActSmokingStatusMeaningfulUse2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSmokingStatusMeaningfulUse2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSmokingStatusMeaningfulUse2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSmokingStatusMeaningfulUse2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSmokingStatusMeaningfulUse2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSmokingStatusMeaningfulUse2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActEncounterDiagnosis2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEncounterDiagnosis2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEncounterDiagnosis2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEncounterDiagnosis2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEncounterDiagnosis2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEncounterDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActFamilyHistoryOrganizer2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActFamilyHistoryOrganizer2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActFamilyHistoryOrganizer2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setOrganizer(ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActFamilyHistoryOrganizer2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActFamilyHistoryOrganizer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActFunctionalStatusObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActFunctionalStatusObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActFunctionalStatusObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createFunctionalStatusObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActFunctionalStatusObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActFunctionalStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActHospitalAdmissionDiagnosis2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActHospitalAdmissionDiagnosis2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActHospitalAdmissionDiagnosis2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActHospitalAdmissionDiagnosis2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActHospitalAdmissionDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActMentalStatusObservation2C() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActMentalStatusObservation2CTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActMentalStatusObservation2C",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2C(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActMentalStatusObservation2CTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActNutritionAssessment() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionAssessmentTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionAssessment", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionAssessment().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionAssessment(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionAssessmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActNutritionAssessmentB() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionAssessmentBTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionAssessmentB", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionAssessment().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentB(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionAssessmentBTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActPostprocedureDiagnosis2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPostprocedureDiagnosis2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPostprocedureDiagnosis2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createPostprocedureDiagnosis2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPostprocedureDiagnosis2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPostprocedureDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActPregnancyObservation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPregnancyObservationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPregnancyObservation", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPregnancyObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPregnancyObservation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPregnancyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActPreoperativeDiagnosis2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPreoperativeDiagnosis2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPreoperativeDiagnosis2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createPreoperativeDiagnosis2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPreoperativeDiagnosis2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPreoperativeDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActReactionObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReactionObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReactionObservation2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReactionObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActResultObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActResultObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActResultObservation2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createResultObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActResultObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActResultObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActSensoryStatus() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSensoryStatusTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSensoryStatus",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSensoryStatus().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSensoryStatus(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSensoryStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActSocialHistoryObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSocialHistoryObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSocialHistoryObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSocialHistoryObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSocialHistoryObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSocialHistoryObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActSubstanceOrDeviceAllergyObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActSubstanceOrDeviceAllergyObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActSubstanceOrDeviceAllergyObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSubstanceOrDeviceAllergyObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActSubstanceOrDeviceAllergyObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActSubstanceOrDeviceAllergyObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActTobaccoUse2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActTobaccoUse2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActTobaccoUse2",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createTobaccoUse2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActTobaccoUse2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActTobaccoUse2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActVitalSignObservation2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActVitalSignObservation2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActVitalSignObservation2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createVitalSignObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActVitalSignObservation2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActVitalSignObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActWoundObservation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActWoundObservationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActWoundObservation",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createLongitudinalCareWoundObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActWoundObservation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActWoundObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActProblemObservation2HasSupport() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemObservation2HasSupportTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemObservation2HasSupport",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemObservation2HasSupport(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemObservation2HasSupportTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActCaregiverCharacteristics() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCaregiverCharacteristicsTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCaregiverCharacteristics", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCaregiverCharacteristics(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActCulturalAndReligiousObservation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCulturalAndReligiousObservationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCulturalAndReligiousObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createCulturalAndReligiousObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCulturalAndReligiousObservation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCulturalAndReligiousObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActCharacteristicsOfHomeEnvironment() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActCharacteristicsOfHomeEnvironmentTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActCharacteristicsOfHomeEnvironment",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createCharacteristicsOfHomeEnvironment().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActCharacteristicsOfHomeEnvironment(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActCharacteristicsOfHomeEnvironmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActNutritionalStatusObservation() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActNutritionalStatusObservationTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActNutritionalStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createNutritionalStatusObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActNutritionalStatusObservation(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActNutritionalStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActResultOrganizer2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActResultOrganizer2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActResultOrganizer2",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setOrganizer(ConsolFactory.eINSTANCE.createResultOrganizer2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActResultOrganizer2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActResultOrganizer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActPriorityPreferencePatient() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPriorityPreferencePatientTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPriorityPreferencePatient",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPriorityPreferencePatient(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPriorityPreferencePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActPriorityPreferenceProvider() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActPriorityPreferenceProviderTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActPriorityPreferenceProvider",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceProvider(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActPriorityPreferenceProviderTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActProblemConcernAct2() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActProblemConcernAct2TestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActProblemConcernAct2", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createProblemConcernAct2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActProblemConcernAct2(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActProblemConcernAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActEntryReferenceHealthConcern() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActEntryReferenceHealthConcernTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActEntryReferenceHealthConcern",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActEntryReferenceHealthConcern(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActEntryReferenceHealthConcernTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActReference() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReference",
			operationsForOCL.getOCLValue("VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReference(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActReferenceTypeCode() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceTypeCodeTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				for (Reference r : target.getReferences()) {
					r.setTypeCode(x_ActRelationshipExternalReference.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReferenceTypeCode(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateRiskConcernActReferenceExternalDocumentReference() {
		OperationsTestCase<RiskConcernAct> validateRiskConcernActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<RiskConcernAct>(
			"validateRiskConcernActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RiskConcernAct target) {
				target.init();
				Reference r = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(r);
			}

			@Override
			protected void updateToPass(RiskConcernAct target) {
				for (Reference r : target.getReferences()) {
					r.setExternalDocument(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RiskConcernActOperations.validateRiskConcernActReferenceExternalDocumentReference(
					(RiskConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateRiskConcernActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getAllergyObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceRelatesTos() {

		RiskConcernAct target = objectFactory.create();
		target.getEntryReferenceRelatesTos();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceHasComponents() {

		RiskConcernAct target = objectFactory.create();
		target.getEntryReferenceHasComponents();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		RiskConcernAct target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getMentalStatusObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSelfCareActivitiess() {

		RiskConcernAct target = objectFactory.create();
		target.getSelfCareActivitiess();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservation2Bs() {

		RiskConcernAct target = objectFactory.create();
		target.getMentalStatusObservation2Bs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSmokingStatusMeaningfulUse2s() {

		RiskConcernAct target = objectFactory.create();
		target.getSmokingStatusMeaningfulUse2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounterDiagnosis2s() {

		RiskConcernAct target = objectFactory.create();
		target.getEncounterDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryOrganizer2s() {

		RiskConcernAct target = objectFactory.create();
		target.getFamilyHistoryOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getFunctionalStatusObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionDiagnosis2s() {

		RiskConcernAct target = objectFactory.create();
		target.getHospitalAdmissionDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservation2Cs() {

		RiskConcernAct target = objectFactory.create();
		target.getMentalStatusObservation2Cs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionAssessments() {

		RiskConcernAct target = objectFactory.create();
		target.getNutritionAssessments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionAssessmentBs() {

		RiskConcernAct target = objectFactory.create();
		target.getNutritionAssessmentBs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostprocedureDiagnosis2s() {

		RiskConcernAct target = objectFactory.create();
		target.getPostprocedureDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyObservations() {

		RiskConcernAct target = objectFactory.create();
		target.getPregnancyObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPreoperativeDiagnosis2s() {

		RiskConcernAct target = objectFactory.create();
		target.getPreoperativeDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getReactionObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getResultObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSensoryStatuss() {

		RiskConcernAct target = objectFactory.create();
		target.getSensoryStatuss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistoryObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getSocialHistoryObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSubstanceOrDeviceAllergyObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getSubstanceOrDeviceAllergyObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTobaccoUse2s() {

		RiskConcernAct target = objectFactory.create();
		target.getTobaccoUse2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignObservation2s() {

		RiskConcernAct target = objectFactory.create();
		target.getVitalSignObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundObservations() {

		RiskConcernAct target = objectFactory.create();
		target.getWoundObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation2HasSupports() {

		RiskConcernAct target = objectFactory.create();
		target.getProblemObservation2HasSupports();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		RiskConcernAct target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCulturalAndReligiousObservations() {

		RiskConcernAct target = objectFactory.create();
		target.getCulturalAndReligiousObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCharacteristicsOfHomeEnvironments() {

		RiskConcernAct target = objectFactory.create();
		target.getCharacteristicsOfHomeEnvironments();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionalStatusObservations() {

		RiskConcernAct target = objectFactory.create();
		target.getNutritionalStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultOrganizer2s() {

		RiskConcernAct target = objectFactory.create();
		target.getResultOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferencePatients() {

		RiskConcernAct target = objectFactory.create();
		target.getPriorityPreferencePatients();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreferenceProviders() {

		RiskConcernAct target = objectFactory.create();
		target.getPriorityPreferenceProviders();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemConcernAct2s() {

		RiskConcernAct target = objectFactory.create();
		target.getProblemConcernAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceHealthConcerns() {

		RiskConcernAct target = objectFactory.create();
		target.getEntryReferenceHealthConcerns();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RiskConcernActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RiskConcernAct> {
		public RiskConcernAct create() {
			return ConsolFactory.eINSTANCE.createRiskConcernAct();
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
	private static class ConstructorTestClass extends RiskConcernActOperations {
	}

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

} // RiskConcernActOperations
