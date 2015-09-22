/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;

import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActHealthConcernActErRefr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Refr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActHealthConcernActErComp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Comp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActFamilyHistoryOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionAssessment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCulturalAndReligiousObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActCharacteristicsOfHomeEnvironment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActNutritionalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEntryReferenceGeneral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference General</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSelfCareActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSensoryStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActLongitudinalCareWoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActAllergyObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActMentalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSmokingStatusMeaningfulUse2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActEncounterDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActFunctionalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActHospitalAdmissionDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPostprocedureDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActPreoperativeDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActResultObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSocialHistoryObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActSubstanceOrDeviceAllergyObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActTobaccoUse2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActVitalSignObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemObservation2Support(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActResultOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActProblemConcernAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#validateHealthConcernActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getFamilyHistoryOrganizer2s() <em>Get Family History Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getNutritionAssessments() <em>Get Nutrition Assessments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCulturalAndReligiousObservations() <em>Get Cultural And Religious Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getCharacteristicsOfHomeEnvironments() <em>Get Characteristics Of Home Environments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getNutritionalStatusObservations() <em>Get Nutritional Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getEntryReferenceGenerals() <em>Get Entry Reference Generals</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSelfCareActivitiess() <em>Get Self Care Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSensoryStatuss() <em>Get Sensory Statuss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getLongitudinalCareWoundObservations() <em>Get Longitudinal Care Wound Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getProblemObservation2s() <em>Get Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getAllergyObservation2s() <em>Get Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getMentalStatusObservation2s() <em>Get Mental Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSmokingStatusMeaningfulUse2s() <em>Get Smoking Status Meaningful Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getEncounterDiagnosis2s() <em>Get Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getFunctionalStatusObservation2s() <em>Get Functional Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getHospitalAdmissionDiagnosis2s() <em>Get Hospital Admission Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPostprocedureDiagnosis2s() <em>Get Postprocedure Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getPreoperativeDiagnosis2s() <em>Get Preoperative Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getReactionObservation2s() <em>Get Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getResultObservation2s() <em>Get Result Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSocialHistoryObservation2s() <em>Get Social History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getSubstanceOrDeviceAllergyObservation2s() <em>Get Substance Or Device Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getTobaccoUse2s() <em>Get Tobacco Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getVitalSignObservation2s() <em>Get Vital Sign Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getProblemObservation2Supports() <em>Get Problem Observation2 Supports</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getResultOrganizer2s() <em>Get Result Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct#getProblemConcernAct2s() <em>Get Problem Concern Act2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthConcernActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.132' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTemplateId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActTemplateId(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActTemplateId"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActClassCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActClassCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActClassCode"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMoodCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActMoodCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActMoodCode"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActId(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActId(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ID,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActId"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCodeP(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CODE_P,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCodeP"),
					new Object[] { healthConcernAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP", passToken);
				}
				passToken.add(healthConcernAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCode(HealthConcernAct healthConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(healthConcernAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CODE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCode"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActStatusCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActStatusCode"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActStatusCodeP(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActStatusCodeP(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActStatusCodeP"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEffectiveTime(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActEffectiveTime(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEffectiveTime"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActHealthConcernActErRefr(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Refr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHealthConcernActErRefr(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActHealthConcernActErRefr(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Refr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHealthConcernActErRefr(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActHealthConcernActErRefr(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_REFR,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActHealthConcernActErRefr"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActHealthConcernActErComp(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Comp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHealthConcernActErComp(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActHealthConcernActErComp(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Health Concern Act Er Comp</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHealthConcernActErComp(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActHealthConcernActErComp(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_HEALTH_CONCERN_ACT_ER_COMP,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActHealthConcernActErComp"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAssessmentScaleObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAssessmentScaleObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAssessmentScaleObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAssessmentScaleObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActAssessmentScaleObservation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAssessmentScaleObservation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActFamilyHistoryOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFamilyHistoryOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActFamilyHistoryOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Family History Organizer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFamilyHistoryOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActFamilyHistoryOrganizer2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActFamilyHistoryOrganizer2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActNutritionAssessment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionAssessment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionAssessment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActNutritionAssessment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutrition Assessment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionAssessment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActNutritionAssessment(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_NUTRITION_ASSESSMENT,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActNutritionAssessment"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPregnancyObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPregnancyObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PregnancyObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPregnancyObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Pregnancy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPregnancyObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActPregnancyObservation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PREGNANCY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPregnancyObservation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCaregiverCharacteristics(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCaregiverCharacteristics(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CaregiverCharacteristics) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCaregiverCharacteristics(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCaregiverCharacteristics(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCaregiverCharacteristics(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CAREGIVER_CHARACTERISTICS,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCaregiverCharacteristics"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCulturalAndReligiousObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCulturalAndReligiousObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CulturalAndReligiousObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCulturalAndReligiousObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Cultural And Religious Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCulturalAndReligiousObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCulturalAndReligiousObservation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCulturalAndReligiousObservation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActCharacteristicsOfHomeEnvironment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCharacteristicsOfHomeEnvironment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActCharacteristicsOfHomeEnvironment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Characteristics Of Home Environment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActCharacteristicsOfHomeEnvironment(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActCharacteristicsOfHomeEnvironment(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActCharacteristicsOfHomeEnvironment"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActNutritionalStatusObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionalStatusObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionalStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActNutritionalStatusObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Nutritional Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActNutritionalStatusObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActNutritionalStatusObservation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActNutritionalStatusObservation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEntryReferenceGeneral(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceGeneral(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEntryReferenceGeneral(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Entry Reference General</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEntryReferenceGeneral(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActEntryReferenceGeneral(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENTRY_REFERENCE_GENERAL,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEntryReferenceGeneral"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAuthorParticipation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActAuthorParticipation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAuthorParticipation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSelfCareActivities(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSelfCareActivities(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SelfCareActivities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSelfCareActivities(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Self Care Activities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSelfCareActivities(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActSelfCareActivities(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SELF_CARE_ACTIVITIES,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSelfCareActivities"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSensoryStatus(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSensoryStatus(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SensoryStatus) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSensoryStatus(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Sensory Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSensoryStatus(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActSensoryStatus(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SENSORY_STATUS,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSensoryStatus"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActLongitudinalCareWoundObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActLongitudinalCareWoundObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::LongitudinalCareWoundObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActLongitudinalCareWoundObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Longitudinal Care Wound Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActLongitudinalCareWoundObservation(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActLongitudinalCareWoundObservation(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_LONGITUDINAL_CARE_WOUND_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActLongitudinalCareWoundObservation"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPriorityPreference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPriorityPreference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPriorityPreference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPriorityPreference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActPriorityPreference(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PRIORITY_PREFERENCE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPriorityPreference"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActProblemObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Allergy Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActAllergyObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ALLERGY_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActAllergyObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActMentalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMentalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MentalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActMentalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Mental Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActMentalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActMentalStatusObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActMentalStatusObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSmokingStatusMeaningfulUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSmokingStatusMeaningfulUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSmokingStatusMeaningfulUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Smoking Status Meaningful Use2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSmokingStatusMeaningfulUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActSmokingStatusMeaningfulUse2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSmokingStatusMeaningfulUse2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActEncounterDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEncounterDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EncounterDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActEncounterDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Encounter Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActEncounterDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActEncounterDiagnosis2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActEncounterDiagnosis2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActFunctionalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFunctionalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::FunctionalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActFunctionalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Functional Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActFunctionalStatusObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActFunctionalStatusObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActFunctionalStatusObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActHospitalAdmissionDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHospitalAdmissionDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActHospitalAdmissionDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Hospital Admission Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActHospitalAdmissionDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActHospitalAdmissionDiagnosis2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActHospitalAdmissionDiagnosis2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPostprocedureDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPostprocedureDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PostprocedureDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPostprocedureDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Postprocedure Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPostprocedureDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActPostprocedureDiagnosis2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPostprocedureDiagnosis2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActPreoperativeDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPreoperativeDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PreoperativeDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActPreoperativeDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Preoperative Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActPreoperativeDiagnosis2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActPreoperativeDiagnosis2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActPreoperativeDiagnosis2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReactionObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReactionObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReactionObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reaction Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReactionObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActReactionObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REACTION_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReactionObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActResultObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ResultObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActResultObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActResultObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_RESULT_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActResultObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSocialHistoryObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSocialHistoryObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SocialHistoryObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSocialHistoryObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Social History Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSocialHistoryObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActSocialHistoryObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSocialHistoryObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActSubstanceOrDeviceAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSubstanceOrDeviceAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActSubstanceOrDeviceAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Substance Or Device Allergy Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActSubstanceOrDeviceAllergyObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActSubstanceOrDeviceAllergyObservation2(
			HealthConcernAct healthConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActSubstanceOrDeviceAllergyObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActTobaccoUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTobaccoUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::TobaccoUse2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActTobaccoUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Tobacco Use2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActTobaccoUse2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActTobaccoUse2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_TOBACCO_USE2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActTobaccoUse2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActVitalSignObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActVitalSignObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::VitalSignObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActVitalSignObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Vital Sign Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActVitalSignObservation2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActVitalSignObservation2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_VITAL_SIGN_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActVitalSignObservation2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemObservation2Support(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Support</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2Support(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemObservation2Support(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Observation2 Support</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemObservation2Support(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActProblemObservation2Support(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_OBSERVATION2_SUPPORT,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemObservation2Support"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActResultOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consol::ResultOrganizer2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActResultOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Result Organizer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActResultOrganizer2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActResultOrganizer2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_RESULT_ORGANIZER2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActResultOrganizer2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActProblemConcernAct2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemConcernAct2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ProblemConcernAct2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActProblemConcernAct2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Problem Concern Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActProblemConcernAct2(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActProblemConcernAct2(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_PROBLEM_CONCERN_ACT2,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActProblemConcernAct2"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernActReference(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			healthConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReference"),
					new Object[] { healthConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceTypeCode(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHealthConcernActReferenceTypeCode(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReferenceTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernAct The receiving '<em><b>Health Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHealthConcernActReferenceExternalDocumentReference(HealthConcernAct healthConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(healthConcernAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERN_ACT__HEALTH_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("HealthConcernActHealthConcernActReferenceExternalDocumentReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(HealthConcernAct) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(HealthConcernAct) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(HealthConcernAct healthConcernAct) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(97));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryOrganizer2s(HealthConcernAct) <em>Get Family History Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)).oclAsType(consol::FamilyHistoryOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryOrganizer2s(HealthConcernAct) <em>Get Family History Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FamilyHistoryOrganizer2> getFamilyHistoryOrganizer2s(HealthConcernAct healthConcernAct) {
		if (GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(98));
			try {
				GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryOrganizer2> result = (Collection<FamilyHistoryOrganizer2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<FamilyHistoryOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionAssessments(HealthConcernAct) <em>Get Nutrition Assessments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_ASSESSMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)).oclAsType(consol::NutritionAssessment)";

	/**
	 * The cached OCL query for the '{@link #getNutritionAssessments(HealthConcernAct) <em>Get Nutrition Assessments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_ASSESSMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionAssessment> getNutritionAssessments(HealthConcernAct healthConcernAct) {
		if (GET_NUTRITION_ASSESSMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(99));
			try {
				GET_NUTRITION_ASSESSMENTS__EOCL_QRY = helper.createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionAssessment> result = (Collection<NutritionAssessment>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<NutritionAssessment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyObservations(HealthConcernAct) <em>Get Pregnancy Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)).oclAsType(consol::PregnancyObservation)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyObservations(HealthConcernAct) <em>Get Pregnancy Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PregnancyObservation> getPregnancyObservations(HealthConcernAct healthConcernAct) {
		if (GET_PREGNANCY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(100));
			try {
				GET_PREGNANCY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PregnancyObservation> result = (Collection<PregnancyObservation>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<PregnancyObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(HealthConcernAct) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(HealthConcernAct) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(HealthConcernAct healthConcernAct) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(101));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCulturalAndReligiousObservations(HealthConcernAct) <em>Get Cultural And Religious Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)).oclAsType(consol::CulturalAndReligiousObservation)";

	/**
	 * The cached OCL query for the '{@link #getCulturalAndReligiousObservations(HealthConcernAct) <em>Get Cultural And Religious Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations(
			HealthConcernAct healthConcernAct) {
		if (GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(102));
			try {
				GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CulturalAndReligiousObservation> result = (Collection<CulturalAndReligiousObservation>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<CulturalAndReligiousObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCharacteristicsOfHomeEnvironments(HealthConcernAct) <em>Get Characteristics Of Home Environments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)).oclAsType(consol::CharacteristicsOfHomeEnvironment)";

	/**
	 * The cached OCL query for the '{@link #getCharacteristicsOfHomeEnvironments(HealthConcernAct) <em>Get Characteristics Of Home Environments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments(
			HealthConcernAct healthConcernAct) {
		if (GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(103));
			try {
				GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY = helper.createQuery(GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CharacteristicsOfHomeEnvironment> result = (Collection<CharacteristicsOfHomeEnvironment>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<CharacteristicsOfHomeEnvironment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionalStatusObservations(HealthConcernAct) <em>Get Nutritional Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionalStatusObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)).oclAsType(consol::NutritionalStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getNutritionalStatusObservations(HealthConcernAct) <em>Get Nutritional Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionalStatusObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionalStatusObservation> getNutritionalStatusObservations(HealthConcernAct healthConcernAct) {
		if (GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(104));
			try {
				GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionalStatusObservation> result = (Collection<NutritionalStatusObservation>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<NutritionalStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceGenerals(HealthConcernAct) <em>Get Entry Reference Generals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGenerals(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_GENERALS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceGenerals(HealthConcernAct) <em>Get Entry Reference Generals</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGenerals(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_GENERALS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceGenerals(HealthConcernAct healthConcernAct) {
		if (GET_ENTRY_REFERENCE_GENERALS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(105));
			try {
				GET_ENTRY_REFERENCE_GENERALS__EOCL_QRY = helper.createQuery(GET_ENTRY_REFERENCE_GENERALS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_GENERALS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSelfCareActivitiess(HealthConcernAct) <em>Get Self Care Activitiess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SELF_CARE_ACTIVITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)).oclAsType(consol::SelfCareActivities)";

	/**
	 * The cached OCL query for the '{@link #getSelfCareActivitiess(HealthConcernAct) <em>Get Self Care Activitiess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SELF_CARE_ACTIVITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SelfCareActivities> getSelfCareActivitiess(HealthConcernAct healthConcernAct) {
		if (GET_SELF_CARE_ACTIVITIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(106));
			try {
				GET_SELF_CARE_ACTIVITIESS__EOCL_QRY = helper.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SelfCareActivities> result = (Collection<SelfCareActivities>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<SelfCareActivities>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSensoryStatuss(HealthConcernAct) <em>Get Sensory Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryStatuss(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SENSORY_STATUSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)).oclAsType(consol::SensoryStatus)";

	/**
	 * The cached OCL query for the '{@link #getSensoryStatuss(HealthConcernAct) <em>Get Sensory Statuss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryStatuss(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SENSORY_STATUSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SensoryStatus> getSensoryStatuss(HealthConcernAct healthConcernAct) {
		if (GET_SENSORY_STATUSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(107));
			try {
				GET_SENSORY_STATUSS__EOCL_QRY = helper.createQuery(GET_SENSORY_STATUSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SENSORY_STATUSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SensoryStatus> result = (Collection<SensoryStatus>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<SensoryStatus>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getLongitudinalCareWoundObservations(HealthConcernAct) <em>Get Longitudinal Care Wound Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalCareWoundObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)).oclAsType(consol::LongitudinalCareWoundObservation)";

	/**
	 * The cached OCL query for the '{@link #getLongitudinalCareWoundObservations(HealthConcernAct) <em>Get Longitudinal Care Wound Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalCareWoundObservations(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<LongitudinalCareWoundObservation> getLongitudinalCareWoundObservations(
			HealthConcernAct healthConcernAct) {
		if (GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(108));
			try {
				GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LONGITUDINAL_CARE_WOUND_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<LongitudinalCareWoundObservation> result = (Collection<LongitudinalCareWoundObservation>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<LongitudinalCareWoundObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(HealthConcernAct) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(HealthConcernAct) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferences(HealthConcernAct healthConcernAct) {
		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(109));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation2s(HealthConcernAct) <em>Get Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation2s(HealthConcernAct) <em>Get Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getProblemObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(110));
			try {
				GET_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyObservation2s(HealthConcernAct) <em>Get Allergy Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)).oclAsType(consol::AllergyObservation2)";

	/**
	 * The cached OCL query for the '{@link #getAllergyObservation2s(HealthConcernAct) <em>Get Allergy Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AllergyObservation2> getAllergyObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_ALLERGY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(111));
			try {
				GET_ALLERGY_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_ALLERGY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyObservation2> result = (Collection<AllergyObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<AllergyObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusObservation2s(HealthConcernAct) <em>Get Mental Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusObservation2s(HealthConcernAct) <em>Get Mental Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation2> getMentalStatusObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(112));
			try {
				GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation2> result = (Collection<MentalStatusObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSmokingStatusMeaningfulUse2s(HealthConcernAct) <em>Get Smoking Status Meaningful Use2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusMeaningfulUse2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)).oclAsType(consol::SmokingStatusMeaningfulUse2)";

	/**
	 * The cached OCL query for the '{@link #getSmokingStatusMeaningfulUse2s(HealthConcernAct) <em>Get Smoking Status Meaningful Use2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusMeaningfulUse2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SmokingStatusMeaningfulUse2> getSmokingStatusMeaningfulUse2s(HealthConcernAct healthConcernAct) {
		if (GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(113));
			try {
				GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY = helper.createQuery(GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusMeaningfulUse2> result = (Collection<SmokingStatusMeaningfulUse2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<SmokingStatusMeaningfulUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterDiagnosis2s(HealthConcernAct) <em>Get Encounter Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)).oclAsType(consol::EncounterDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getEncounterDiagnosis2s(HealthConcernAct) <em>Get Encounter Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterDiagnosis2> getEncounterDiagnosis2s(HealthConcernAct healthConcernAct) {
		if (GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(114));
			try {
				GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterDiagnosis2> result = (Collection<EncounterDiagnosis2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<EncounterDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusObservation2s(HealthConcernAct) <em>Get Functional Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)).oclAsType(consol::FunctionalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusObservation2s(HealthConcernAct) <em>Get Functional Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusObservation2> getFunctionalStatusObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(115));
			try {
				GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusObservation2> result = (Collection<FunctionalStatusObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<FunctionalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionDiagnosis2s(HealthConcernAct) <em>Get Hospital Admission Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2)).oclAsType(consol::HospitalAdmissionDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getHospitalAdmissionDiagnosis2s(HealthConcernAct) <em>Get Hospital Admission Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HospitalAdmissionDiagnosis2> getHospitalAdmissionDiagnosis2s(HealthConcernAct healthConcernAct) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(116));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HospitalAdmissionDiagnosis2> result = (Collection<HospitalAdmissionDiagnosis2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<HospitalAdmissionDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostprocedureDiagnosis2s(HealthConcernAct) <em>Get Postprocedure Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)).oclAsType(consol::PostprocedureDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getPostprocedureDiagnosis2s(HealthConcernAct) <em>Get Postprocedure Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PostprocedureDiagnosis2> getPostprocedureDiagnosis2s(HealthConcernAct healthConcernAct) {
		if (GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(117));
			try {
				GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PostprocedureDiagnosis2> result = (Collection<PostprocedureDiagnosis2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<PostprocedureDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreoperativeDiagnosis2s(HealthConcernAct) <em>Get Preoperative Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)).oclAsType(consol::PreoperativeDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getPreoperativeDiagnosis2s(HealthConcernAct) <em>Get Preoperative Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosis2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PreoperativeDiagnosis2> getPreoperativeDiagnosis2s(HealthConcernAct healthConcernAct) {
		if (GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(118));
			try {
				GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PreoperativeDiagnosis2> result = (Collection<PreoperativeDiagnosis2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<PreoperativeDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation2s(HealthConcernAct) <em>Get Reaction Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation2s(HealthConcernAct) <em>Get Reaction Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation2> getReactionObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_REACTION_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(119));
			try {
				GET_REACTION_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation2> result = (Collection<ReactionObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ReactionObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultObservation2s(HealthConcernAct) <em>Get Result Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation2)).oclAsType(consol::ResultObservation2)";

	/**
	 * The cached OCL query for the '{@link #getResultObservation2s(HealthConcernAct) <em>Get Result Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultObservation2> getResultObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_RESULT_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(120));
			try {
				GET_RESULT_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_RESULT_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultObservation2> result = (Collection<ResultObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ResultObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistoryObservation2s(HealthConcernAct) <em>Get Social History Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)).oclAsType(consol::SocialHistoryObservation2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistoryObservation2s(HealthConcernAct) <em>Get Social History Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SocialHistoryObservation2> getSocialHistoryObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(121));
			try {
				GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SocialHistoryObservation2> result = (Collection<SocialHistoryObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<SocialHistoryObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceOrDeviceAllergyObservation2s(HealthConcernAct) <em>Get Substance Or Device Allergy Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceOrDeviceAllergyObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2)).oclAsType(consol::SubstanceOrDeviceAllergyObservation2)";

	/**
	 * The cached OCL query for the '{@link #getSubstanceOrDeviceAllergyObservation2s(HealthConcernAct) <em>Get Substance Or Device Allergy Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceOrDeviceAllergyObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SubstanceOrDeviceAllergyObservation2> getSubstanceOrDeviceAllergyObservation2s(
			HealthConcernAct healthConcernAct) {
		if (GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(122));
			try {
				GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceOrDeviceAllergyObservation2> result = (Collection<SubstanceOrDeviceAllergyObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<SubstanceOrDeviceAllergyObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTobaccoUse2s(HealthConcernAct) <em>Get Tobacco Use2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOBACCO_USE2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)).oclAsType(consol::TobaccoUse2)";

	/**
	 * The cached OCL query for the '{@link #getTobaccoUse2s(HealthConcernAct) <em>Get Tobacco Use2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOBACCO_USE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TobaccoUse2> getTobaccoUse2s(HealthConcernAct healthConcernAct) {
		if (GET_TOBACCO_USE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(123));
			try {
				GET_TOBACCO_USE2S__EOCL_QRY = helper.createQuery(GET_TOBACCO_USE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOBACCO_USE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TobaccoUse2> result = (Collection<TobaccoUse2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<TobaccoUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignObservation2s(HealthConcernAct) <em>Get Vital Sign Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGN_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)).oclAsType(consol::VitalSignObservation2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignObservation2s(HealthConcernAct) <em>Get Vital Sign Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservation2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<VitalSignObservation2> getVitalSignObservation2s(HealthConcernAct healthConcernAct) {
		if (GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(124));
			try {
				GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_VITAL_SIGN_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignObservation2> result = (Collection<VitalSignObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<VitalSignObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation2Supports(HealthConcernAct) <em>Get Problem Observation2 Supports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2Supports(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation2Supports(HealthConcernAct) <em>Get Problem Observation2 Supports</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2Supports(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getProblemObservation2Supports(HealthConcernAct healthConcernAct) {
		if (GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(125));
			try {
				GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION2_SUPPORTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultOrganizer2s(HealthConcernAct) <em>Get Result Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizer2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)).oclAsType(consol::ResultOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getResultOrganizer2s(HealthConcernAct) <em>Get Result Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizer2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultOrganizer2> getResultOrganizer2s(HealthConcernAct healthConcernAct) {
		if (GET_RESULT_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(126));
			try {
				GET_RESULT_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_RESULT_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer2> result = (Collection<ResultOrganizer2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ResultOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemConcernAct2s(HealthConcernAct) <em>Get Problem Concern Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernAct2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CONCERN_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)).oclAsType(consol::ProblemConcernAct2)";

	/**
	 * The cached OCL query for the '{@link #getProblemConcernAct2s(HealthConcernAct) <em>Get Problem Concern Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernAct2s(HealthConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemConcernAct2> getProblemConcernAct2s(HealthConcernAct healthConcernAct) {
		if (GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERN_ACT,
				ConsolPackage.Literals.HEALTH_CONCERN_ACT.getEAllOperations().get(127));
			try {
				GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY = helper.createQuery(GET_PROBLEM_CONCERN_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemConcernAct2> result = (Collection<ProblemConcernAct2>) query.evaluate(healthConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemConcernAct2>(result.size(), result.toArray());
	}

} // HealthConcernActOperations
