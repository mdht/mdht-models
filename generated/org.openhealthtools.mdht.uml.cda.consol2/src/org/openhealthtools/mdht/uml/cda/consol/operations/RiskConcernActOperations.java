/**
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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
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
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

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
public class RiskConcernActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskConcernActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.136' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTemplateId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActTemplateId(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActTemplateId"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActClassCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActClassCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActClassCode"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMoodCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActMoodCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMoodCode"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActId(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActId(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ID,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActId"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCodeP(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CODE_P,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCodeP"),
						new Object[] { riskConcernAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP", passToken);
				}
				passToken.add(riskConcernAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '281694009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.RiskConcernActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(riskConcernAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCode"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActStatusCode(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActStatusCode"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActStatusCodeP(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActStatusCodeP(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActStatusCodeP"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEffectiveTime(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEffectiveTime(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEffectiveTime"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAuthorParticipation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActAuthorParticipation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAuthorParticipation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActProblemObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Allergy Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActAllergyObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ALLERGY_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAllergyObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceRelatesTo(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Relates To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceRelatesTo(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceRelatesTo(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Relates To</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceRelatesTo(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEntryReferenceRelatesTo(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_RELATES_TO,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceRelatesTo"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceHasComponent(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Has Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceHasComponent(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceHasComponent(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Has Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceHasComponent(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEntryReferenceHasComponent(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_HAS_COMPONENT,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceHasComponent"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActAssessmentScaleObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAssessmentScaleObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActAssessmentScaleObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActAssessmentScaleObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActAssessmentScaleObservation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ASSESSMENT_SCALE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActAssessmentScaleObservation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MentalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActMentalStatusObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSelfCareActivities(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSelfCareActivities(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SelfCareActivities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSelfCareActivities(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Self Care Activities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSelfCareActivities(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActSelfCareActivities(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SELF_CARE_ACTIVITIES,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSelfCareActivities"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2B(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2B(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MentalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2B(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 B</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2B(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActMentalStatusObservation2B(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_B,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2B"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSmokingStatusMeaningfulUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSmokingStatusMeaningfulUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSmokingStatusMeaningfulUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Smoking Status Meaningful Use2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSmokingStatusMeaningfulUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActSmokingStatusMeaningfulUse2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SMOKING_STATUS_MEANINGFUL_USE2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSmokingStatusMeaningfulUse2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEncounterDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEncounterDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EncounterDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEncounterDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Encounter Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEncounterDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEncounterDiagnosis2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENCOUNTER_DIAGNOSIS2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEncounterDiagnosis2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActFamilyHistoryOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFamilyHistoryOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActFamilyHistoryOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Family History Organizer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFamilyHistoryOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActFamilyHistoryOrganizer2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_FAMILY_HISTORY_ORGANIZER2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActFamilyHistoryOrganizer2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActFunctionalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFunctionalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::FunctionalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActFunctionalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Functional Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActFunctionalStatusObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActFunctionalStatusObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_FUNCTIONAL_STATUS_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActFunctionalStatusObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActHospitalAdmissionDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActHospitalAdmissionDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActHospitalAdmissionDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Hospital Admission Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActHospitalAdmissionDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActHospitalAdmissionDiagnosis2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_HOSPITAL_ADMISSION_DIAGNOSIS2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActHospitalAdmissionDiagnosis2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActMentalStatusObservation2C(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 C</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2C(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::MentalStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActMentalStatusObservation2C(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Mental Status Observation2 C</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActMentalStatusObservation2C(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActMentalStatusObservation2C(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_MENTAL_STATUS_OBSERVATION2_C,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActMentalStatusObservation2C"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionAssessment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionAssessment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionAssessment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActNutritionAssessment(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITION_ASSESSMENT,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionAssessment"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionAssessmentB(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentB(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionAssessment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionAssessmentB(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutrition Assessment B</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionAssessmentB(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActNutritionAssessmentB(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITION_ASSESSMENT_B,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionAssessmentB"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPostprocedureDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPostprocedureDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PostprocedureDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPostprocedureDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Postprocedure Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPostprocedureDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActPostprocedureDiagnosis2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_POSTPROCEDURE_DIAGNOSIS2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPostprocedureDiagnosis2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPregnancyObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPregnancyObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PregnancyObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPregnancyObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Pregnancy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPregnancyObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActPregnancyObservation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PREGNANCY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPregnancyObservation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPreoperativeDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPreoperativeDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PreoperativeDiagnosis2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPreoperativeDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Preoperative Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPreoperativeDiagnosis2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActPreoperativeDiagnosis2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PREOPERATIVE_DIAGNOSIS2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPreoperativeDiagnosis2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReactionObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReactionObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReactionObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reaction Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReactionObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActReactionObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REACTION_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReactionObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActResultObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ResultObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActResultObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActResultObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_RESULT_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_RESULT_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActResultObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSensoryStatus(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSensoryStatus(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SensoryStatus) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSensoryStatus(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Sensory Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSensoryStatus(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActSensoryStatus(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_SENSORY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SENSORY_STATUS,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSensoryStatus"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSocialHistoryObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSocialHistoryObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SocialHistoryObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSocialHistoryObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Social History Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSocialHistoryObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActSocialHistoryObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SOCIAL_HISTORY_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActSocialHistoryObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActSubstanceOrDeviceAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSubstanceOrDeviceAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActSubstanceOrDeviceAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Substance Or Device Allergy Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActSubstanceOrDeviceAllergyObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActSubstanceOrDeviceAllergyObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"RiskConcernActRiskConcernActSubstanceOrDeviceAllergyObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActTobaccoUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTobaccoUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::TobaccoUse2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActTobaccoUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Tobacco Use2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActTobaccoUse2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActTobaccoUse2(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_TOBACCO_USE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_TOBACCO_USE2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActTobaccoUse2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActVitalSignObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActVitalSignObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::VitalSignObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActVitalSignObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Vital Sign Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActVitalSignObservation2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActVitalSignObservation2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_VITAL_SIGN_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActVitalSignObservation2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActWoundObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Wound Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActWoundObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::LongitudinalCareWoundObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActWoundObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Wound Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActWoundObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActWoundObservation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_WOUND_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActWoundObservation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemObservation2HasSupport(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Has Support</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2HasSupport(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemObservation2HasSupport(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Observation2 Has Support</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemObservation2HasSupport(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActProblemObservation2HasSupport(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_OBSERVATION2_HAS_SUPPORT,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemObservation2HasSupport"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCaregiverCharacteristics(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCaregiverCharacteristics(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CaregiverCharacteristics) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCaregiverCharacteristics(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCaregiverCharacteristics(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCaregiverCharacteristics(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CAREGIVER_CHARACTERISTICS,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCaregiverCharacteristics"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCulturalAndReligiousObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCulturalAndReligiousObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CulturalAndReligiousObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCulturalAndReligiousObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Cultural And Religious Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCulturalAndReligiousObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCulturalAndReligiousObservation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CULTURAL_AND_RELIGIOUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCulturalAndReligiousObservation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActCharacteristicsOfHomeEnvironment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCharacteristicsOfHomeEnvironment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActCharacteristicsOfHomeEnvironment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Characteristics Of Home Environment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActCharacteristicsOfHomeEnvironment(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActCharacteristicsOfHomeEnvironment(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_CHARACTERISTICS_OF_HOME_ENVIRONMENT,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActCharacteristicsOfHomeEnvironment"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActNutritionalStatusObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionalStatusObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NutritionalStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActNutritionalStatusObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Nutritional Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActNutritionalStatusObservation(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActNutritionalStatusObservation(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_NUTRITIONAL_STATUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActNutritionalStatusObservation"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActResultOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consol::ResultOrganizer2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActResultOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Result Organizer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActResultOrganizer2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActResultOrganizer2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_RESULT_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_RESULT_ORGANIZER2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActResultOrganizer2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPriorityPreferencePatient(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferencePatient(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPriorityPreferencePatient(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Patient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferencePatient(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActPriorityPreferencePatient(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PATIENT,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPriorityPreferencePatient"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActPriorityPreferenceProvider(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceProvider(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActPriorityPreferenceProvider(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Priority Preference Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActPriorityPreferenceProvider(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActPriorityPreferenceProvider(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PRIORITY_PREFERENCE_PROVIDER,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActPriorityPreferenceProvider"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActProblemConcernAct2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemConcernAct2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ProblemConcernAct2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActProblemConcernAct2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Problem Concern Act2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActProblemConcernAct2(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActProblemConcernAct2(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_PROBLEM_CONCERN_ACT2,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActProblemConcernAct2"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActEntryReferenceHealthConcern(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Health Concern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceHealthConcern(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActEntryReferenceHealthConcern(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Entry Reference Health Concern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActEntryReferenceHealthConcern(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActEntryReferenceHealthConcern(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_ENTRY_REFERENCE_HEALTH_CONCERN,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActEntryReferenceHealthConcern"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRiskConcernActReference(RiskConcernAct riskConcernAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_CONCERN_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			riskConcernAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReference"),
						new Object[] { riskConcernAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceTypeCode(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateRiskConcernActReferenceTypeCode(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			riskConcernAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString("RiskConcernActRiskConcernActReferenceTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Concern Act Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param riskConcernAct The receiving '<em><b>Risk Concern Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateRiskConcernActReferenceExternalDocumentReference(RiskConcernAct riskConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RISK_CONCERN_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			riskConcernAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RISK_CONCERN_ACT__RISK_CONCERN_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"RiskConcernActRiskConcernActReferenceExternalDocumentReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation2s(RiskConcernAct) <em>Get Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation2s(RiskConcernAct) <em>Get Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getProblemObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(101));
			try {
				GET_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyObservation2s(RiskConcernAct) <em>Get Allergy Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)).oclAsType(consol::AllergyObservation2)";

	/**
	 * The cached OCL query for the '{@link #getAllergyObservation2s(RiskConcernAct) <em>Get Allergy Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AllergyObservation2> getAllergyObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_ALLERGY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(102));
			try {
				GET_ALLERGY_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_ALLERGY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyObservation2> result = (Collection<AllergyObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<AllergyObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceRelatesTos(RiskConcernAct) <em>Get Entry Reference Relates Tos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceRelatesTos(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceRelatesTos(RiskConcernAct) <em>Get Entry Reference Relates Tos</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceRelatesTos(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceRelatesTos(RiskConcernAct riskConcernAct) {
		if (GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(103));
			try {
				GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_QRY = helper.createQuery(
					GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_RELATES_TOS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceHasComponents(RiskConcernAct) <em>Get Entry Reference Has Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceHasComponents(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceHasComponents(RiskConcernAct) <em>Get Entry Reference Has Components</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceHasComponents(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceHasComponents(RiskConcernAct riskConcernAct) {
		if (GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(104));
			try {
				GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_QRY = helper.createQuery(
					GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_HAS_COMPONENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(RiskConcernAct) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(RiskConcernAct) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(RiskConcernAct riskConcernAct) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(105));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusObservation2s(RiskConcernAct) <em>Get Mental Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusObservation2s(RiskConcernAct) <em>Get Mental Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation2> getMentalStatusObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(106));
			try {
				GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation2> result = (Collection<MentalStatusObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSelfCareActivitiess(RiskConcernAct) <em>Get Self Care Activitiess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SELF_CARE_ACTIVITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)).oclAsType(consol::SelfCareActivities)";

	/**
	 * The cached OCL query for the '{@link #getSelfCareActivitiess(RiskConcernAct) <em>Get Self Care Activitiess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SELF_CARE_ACTIVITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SelfCareActivities> getSelfCareActivitiess(RiskConcernAct riskConcernAct) {
		if (GET_SELF_CARE_ACTIVITIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(107));
			try {
				GET_SELF_CARE_ACTIVITIESS__EOCL_QRY = helper.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SelfCareActivities> result = (Collection<SelfCareActivities>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<SelfCareActivities>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusObservation2Bs(RiskConcernAct) <em>Get Mental Status Observation2 Bs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2Bs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusObservation2Bs(RiskConcernAct) <em>Get Mental Status Observation2 Bs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2Bs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation2> getMentalStatusObservation2Bs(RiskConcernAct riskConcernAct) {
		if (GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(108));
			try {
				GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_QRY = helper.createQuery(
					GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_OBSERVATION2_BS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation2> result = (Collection<MentalStatusObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSmokingStatusMeaningfulUse2s(RiskConcernAct) <em>Get Smoking Status Meaningful Use2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusMeaningfulUse2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)).oclAsType(consol::SmokingStatusMeaningfulUse2)";

	/**
	 * The cached OCL query for the '{@link #getSmokingStatusMeaningfulUse2s(RiskConcernAct) <em>Get Smoking Status Meaningful Use2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokingStatusMeaningfulUse2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SmokingStatusMeaningfulUse2> getSmokingStatusMeaningfulUse2s(RiskConcernAct riskConcernAct) {
		if (GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(109));
			try {
				GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY = helper.createQuery(
					GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SMOKING_STATUS_MEANINGFUL_USE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusMeaningfulUse2> result = (Collection<SmokingStatusMeaningfulUse2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<SmokingStatusMeaningfulUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterDiagnosis2s(RiskConcernAct) <em>Get Encounter Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)).oclAsType(consol::EncounterDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getEncounterDiagnosis2s(RiskConcernAct) <em>Get Encounter Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterDiagnosis2> getEncounterDiagnosis2s(RiskConcernAct riskConcernAct) {
		if (GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(110));
			try {
				GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterDiagnosis2> result = (Collection<EncounterDiagnosis2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<EncounterDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryOrganizer2s(RiskConcernAct) <em>Get Family History Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)).oclAsType(consol::FamilyHistoryOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryOrganizer2s(RiskConcernAct) <em>Get Family History Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FamilyHistoryOrganizer2> getFamilyHistoryOrganizer2s(RiskConcernAct riskConcernAct) {
		if (GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(111));
			try {
				GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryOrganizer2> result = (Collection<FamilyHistoryOrganizer2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<FamilyHistoryOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusObservation2s(RiskConcernAct) <em>Get Functional Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)).oclAsType(consol::FunctionalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusObservation2s(RiskConcernAct) <em>Get Functional Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusObservation2> getFunctionalStatusObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(112));
			try {
				GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusObservation2> result = (Collection<FunctionalStatusObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<FunctionalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionDiagnosis2s(RiskConcernAct) <em>Get Hospital Admission Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalAdmissionDiagnosis2)).oclAsType(consol::HospitalAdmissionDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getHospitalAdmissionDiagnosis2s(RiskConcernAct) <em>Get Hospital Admission Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HospitalAdmissionDiagnosis2> getHospitalAdmissionDiagnosis2s(RiskConcernAct riskConcernAct) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(113));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(
					GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HospitalAdmissionDiagnosis2> result = (Collection<HospitalAdmissionDiagnosis2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<HospitalAdmissionDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusObservation2Cs(RiskConcernAct) <em>Get Mental Status Observation2 Cs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2Cs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusObservation2Cs(RiskConcernAct) <em>Get Mental Status Observation2 Cs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusObservation2Cs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation2> getMentalStatusObservation2Cs(RiskConcernAct riskConcernAct) {
		if (GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(114));
			try {
				GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_QRY = helper.createQuery(
					GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_OBSERVATION2_CS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation2> result = (Collection<MentalStatusObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionAssessments(RiskConcernAct) <em>Get Nutrition Assessments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_ASSESSMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)).oclAsType(consol::NutritionAssessment)";

	/**
	 * The cached OCL query for the '{@link #getNutritionAssessments(RiskConcernAct) <em>Get Nutrition Assessments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessments(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_ASSESSMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionAssessment> getNutritionAssessments(RiskConcernAct riskConcernAct) {
		if (GET_NUTRITION_ASSESSMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(115));
			try {
				GET_NUTRITION_ASSESSMENTS__EOCL_QRY = helper.createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_ASSESSMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionAssessment> result = (Collection<NutritionAssessment>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<NutritionAssessment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionAssessmentBs(RiskConcernAct) <em>Get Nutrition Assessment Bs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessmentBs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_ASSESSMENT_BS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionAssessment)).oclAsType(consol::NutritionAssessment)";

	/**
	 * The cached OCL query for the '{@link #getNutritionAssessmentBs(RiskConcernAct) <em>Get Nutrition Assessment Bs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionAssessmentBs(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_ASSESSMENT_BS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionAssessment> getNutritionAssessmentBs(RiskConcernAct riskConcernAct) {
		if (GET_NUTRITION_ASSESSMENT_BS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(116));
			try {
				GET_NUTRITION_ASSESSMENT_BS__EOCL_QRY = helper.createQuery(GET_NUTRITION_ASSESSMENT_BS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_ASSESSMENT_BS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionAssessment> result = (Collection<NutritionAssessment>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<NutritionAssessment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostprocedureDiagnosis2s(RiskConcernAct) <em>Get Postprocedure Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)).oclAsType(consol::PostprocedureDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getPostprocedureDiagnosis2s(RiskConcernAct) <em>Get Postprocedure Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PostprocedureDiagnosis2> getPostprocedureDiagnosis2s(RiskConcernAct riskConcernAct) {
		if (GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(117));
			try {
				GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTPROCEDURE_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PostprocedureDiagnosis2> result = (Collection<PostprocedureDiagnosis2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<PostprocedureDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyObservations(RiskConcernAct) <em>Get Pregnancy Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PregnancyObservation)).oclAsType(consol::PregnancyObservation)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyObservations(RiskConcernAct) <em>Get Pregnancy Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PregnancyObservation> getPregnancyObservations(RiskConcernAct riskConcernAct) {
		if (GET_PREGNANCY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(118));
			try {
				GET_PREGNANCY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PregnancyObservation> result = (Collection<PregnancyObservation>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<PregnancyObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreoperativeDiagnosis2s(RiskConcernAct) <em>Get Preoperative Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PreoperativeDiagnosis2)).oclAsType(consol::PreoperativeDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getPreoperativeDiagnosis2s(RiskConcernAct) <em>Get Preoperative Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreoperativeDiagnosis2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PreoperativeDiagnosis2> getPreoperativeDiagnosis2s(RiskConcernAct riskConcernAct) {
		if (GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(119));
			try {
				GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREOPERATIVE_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PreoperativeDiagnosis2> result = (Collection<PreoperativeDiagnosis2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<PreoperativeDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation2s(RiskConcernAct) <em>Get Reaction Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation2s(RiskConcernAct) <em>Get Reaction Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation2> getReactionObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_REACTION_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(120));
			try {
				GET_REACTION_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation2> result = (Collection<ReactionObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ReactionObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultObservation2s(RiskConcernAct) <em>Get Result Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation2)).oclAsType(consol::ResultObservation2)";

	/**
	 * The cached OCL query for the '{@link #getResultObservation2s(RiskConcernAct) <em>Get Result Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultObservation2> getResultObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_RESULT_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(121));
			try {
				GET_RESULT_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_RESULT_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultObservation2> result = (Collection<ResultObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ResultObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSensoryStatuss(RiskConcernAct) <em>Get Sensory Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryStatuss(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SENSORY_STATUSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryStatus)).oclAsType(consol::SensoryStatus)";

	/**
	 * The cached OCL query for the '{@link #getSensoryStatuss(RiskConcernAct) <em>Get Sensory Statuss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryStatuss(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SENSORY_STATUSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SensoryStatus> getSensoryStatuss(RiskConcernAct riskConcernAct) {
		if (GET_SENSORY_STATUSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(122));
			try {
				GET_SENSORY_STATUSS__EOCL_QRY = helper.createQuery(GET_SENSORY_STATUSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SENSORY_STATUSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SensoryStatus> result = (Collection<SensoryStatus>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<SensoryStatus>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistoryObservation2s(RiskConcernAct) <em>Get Social History Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)).oclAsType(consol::SocialHistoryObservation2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistoryObservation2s(RiskConcernAct) <em>Get Social History Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistoryObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SocialHistoryObservation2> getSocialHistoryObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(123));
			try {
				GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SocialHistoryObservation2> result = (Collection<SocialHistoryObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<SocialHistoryObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceOrDeviceAllergyObservation2s(RiskConcernAct) <em>Get Substance Or Device Allergy Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceOrDeviceAllergyObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SubstanceOrDeviceAllergyObservation2)).oclAsType(consol::SubstanceOrDeviceAllergyObservation2)";

	/**
	 * The cached OCL query for the '{@link #getSubstanceOrDeviceAllergyObservation2s(RiskConcernAct) <em>Get Substance Or Device Allergy Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceOrDeviceAllergyObservation2s(RiskConcernAct)
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
			RiskConcernAct riskConcernAct) {
		if (GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(124));
			try {
				GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceOrDeviceAllergyObservation2> result = (Collection<SubstanceOrDeviceAllergyObservation2>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<SubstanceOrDeviceAllergyObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTobaccoUse2s(RiskConcernAct) <em>Get Tobacco Use2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOBACCO_USE2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)).oclAsType(consol::TobaccoUse2)";

	/**
	 * The cached OCL query for the '{@link #getTobaccoUse2s(RiskConcernAct) <em>Get Tobacco Use2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobaccoUse2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOBACCO_USE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TobaccoUse2> getTobaccoUse2s(RiskConcernAct riskConcernAct) {
		if (GET_TOBACCO_USE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(125));
			try {
				GET_TOBACCO_USE2S__EOCL_QRY = helper.createQuery(GET_TOBACCO_USE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOBACCO_USE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TobaccoUse2> result = (Collection<TobaccoUse2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<TobaccoUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignObservation2s(RiskConcernAct) <em>Get Vital Sign Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGN_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)).oclAsType(consol::VitalSignObservation2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignObservation2s(RiskConcernAct) <em>Get Vital Sign Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservation2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<VitalSignObservation2> getVitalSignObservation2s(RiskConcernAct riskConcernAct) {
		if (GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(126));
			try {
				GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_VITAL_SIGN_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGN_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignObservation2> result = (Collection<VitalSignObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<VitalSignObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getWoundObservations(RiskConcernAct) <em>Get Wound Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_WOUND_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LongitudinalCareWoundObservation)).oclAsType(consol::LongitudinalCareWoundObservation)";

	/**
	 * The cached OCL query for the '{@link #getWoundObservations(RiskConcernAct) <em>Get Wound Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWoundObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_WOUND_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<LongitudinalCareWoundObservation> getWoundObservations(RiskConcernAct riskConcernAct) {
		if (GET_WOUND_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(127));
			try {
				GET_WOUND_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_WOUND_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_WOUND_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<LongitudinalCareWoundObservation> result = (Collection<LongitudinalCareWoundObservation>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<LongitudinalCareWoundObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation2HasSupports(RiskConcernAct) <em>Get Problem Observation2 Has Supports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2HasSupports(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation2HasSupports(RiskConcernAct) <em>Get Problem Observation2 Has Supports</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation2HasSupports(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getProblemObservation2HasSupports(RiskConcernAct riskConcernAct) {
		if (GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(128));
			try {
				GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_QRY = helper.createQuery(
					GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION2_HAS_SUPPORTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(RiskConcernAct) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(RiskConcernAct) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(RiskConcernAct riskConcernAct) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(129));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCulturalAndReligiousObservations(RiskConcernAct) <em>Get Cultural And Religious Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)).oclAsType(consol::CulturalAndReligiousObservation)";

	/**
	 * The cached OCL query for the '{@link #getCulturalAndReligiousObservations(RiskConcernAct) <em>Get Cultural And Religious Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(RiskConcernAct)
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
			RiskConcernAct riskConcernAct) {
		if (GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(130));
			try {
				GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CulturalAndReligiousObservation> result = (Collection<CulturalAndReligiousObservation>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<CulturalAndReligiousObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCharacteristicsOfHomeEnvironments(RiskConcernAct) <em>Get Characteristics Of Home Environments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)).oclAsType(consol::CharacteristicsOfHomeEnvironment)";

	/**
	 * The cached OCL query for the '{@link #getCharacteristicsOfHomeEnvironments(RiskConcernAct) <em>Get Characteristics Of Home Environments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(RiskConcernAct)
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
			RiskConcernAct riskConcernAct) {
		if (GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(131));
			try {
				GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY = helper.createQuery(
					GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CharacteristicsOfHomeEnvironment> result = (Collection<CharacteristicsOfHomeEnvironment>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<CharacteristicsOfHomeEnvironment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionalStatusObservations(RiskConcernAct) <em>Get Nutritional Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionalStatusObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NutritionalStatusObservation)).oclAsType(consol::NutritionalStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getNutritionalStatusObservations(RiskConcernAct) <em>Get Nutritional Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionalStatusObservations(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NutritionalStatusObservation> getNutritionalStatusObservations(RiskConcernAct riskConcernAct) {
		if (GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(132));
			try {
				GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITIONAL_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NutritionalStatusObservation> result = (Collection<NutritionalStatusObservation>) query.evaluate(
			riskConcernAct);
		return new BasicEList.UnmodifiableEList<NutritionalStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultOrganizer2s(RiskConcernAct) <em>Get Result Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizer2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)).oclAsType(consol::ResultOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getResultOrganizer2s(RiskConcernAct) <em>Get Result Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizer2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultOrganizer2> getResultOrganizer2s(RiskConcernAct riskConcernAct) {
		if (GET_RESULT_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(133));
			try {
				GET_RESULT_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_RESULT_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer2> result = (Collection<ResultOrganizer2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ResultOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferencePatients(RiskConcernAct) <em>Get Priority Preference Patients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferencePatients(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferencePatients(RiskConcernAct) <em>Get Priority Preference Patients</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferencePatients(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferencePatients(RiskConcernAct riskConcernAct) {
		if (GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(134));
			try {
				GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_QRY = helper.createQuery(
					GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIORITY_PREFERENCE_PATIENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferenceProviders(RiskConcernAct) <em>Get Priority Preference Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferenceProviders(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferenceProviders(RiskConcernAct) <em>Get Priority Preference Providers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferenceProviders(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferenceProviders(RiskConcernAct riskConcernAct) {
		if (GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(135));
			try {
				GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_QRY = helper.createQuery(
					GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIORITY_PREFERENCE_PROVIDERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemConcernAct2s(RiskConcernAct) <em>Get Problem Concern Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernAct2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CONCERN_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct2)).oclAsType(consol::ProblemConcernAct2)";

	/**
	 * The cached OCL query for the '{@link #getProblemConcernAct2s(RiskConcernAct) <em>Get Problem Concern Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConcernAct2s(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemConcernAct2> getProblemConcernAct2s(RiskConcernAct riskConcernAct) {
		if (GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(136));
			try {
				GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY = helper.createQuery(GET_PROBLEM_CONCERN_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CONCERN_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemConcernAct2> result = (Collection<ProblemConcernAct2>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<ProblemConcernAct2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceHealthConcerns(RiskConcernAct) <em>Get Entry Reference Health Concerns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceHealthConcerns(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceHealthConcerns(RiskConcernAct) <em>Get Entry Reference Health Concerns</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceHealthConcerns(RiskConcernAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceHealthConcerns(RiskConcernAct riskConcernAct) {
		if (GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RISK_CONCERN_ACT,
				ConsolPackage.Literals.RISK_CONCERN_ACT.getEAllOperations().get(137));
			try {
				GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_QRY = helper.createQuery(
					GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_HEALTH_CONCERNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(riskConcernAct);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

} // RiskConcernActOperations
