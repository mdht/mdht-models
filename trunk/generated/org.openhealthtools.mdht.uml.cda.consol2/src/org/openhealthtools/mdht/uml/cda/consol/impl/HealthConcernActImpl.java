/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;

import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.WoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Concern Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HealthConcernActImpl extends ActImpl implements HealthConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActActReferenceExtra(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReferenceExtra(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCognitiveAbilitiesObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCognitiveAbilitiesObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActMentalStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActNutritionAssessment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActNutritionAssessmentExtra(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessmentExtra(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActPregnancyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPregnancyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCaregiverCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCulturalAndReligiousObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActCharacteristicsOfHomeEnvironment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCharacteristicsOfHomeEnvironment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActNutritionalStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionalStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActPatientPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPatientPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActActReferenceExtra3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReferenceExtra3(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActSelfCareActivities(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSelfCareActivities(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActSensoryAndSpeechStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSensoryAndSpeechStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActWoundObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActWoundObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActProviderPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProviderPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthConcernActExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAllergyObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAllergyObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCognitiveStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCognitiveStatusObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCognitiveStatusObservation2Extra(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCognitiveStatusObservation2Extra(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCurrentSmokingStatus2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCurrentSmokingStatus2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEncounterDiagnosis2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEncounterDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActFunctionalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFunctionalStatusObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActHospitalAdmissionDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActHospitalAdmissionDiagnosis2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPostprocedureDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPostprocedureDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPreoperativeDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPreoperativeDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReactionObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReactionObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActResultObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActResultObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSocialHistoryObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSocialHistoryObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSubstanceOrDeviceAllergyObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSubstanceOrDeviceAllergyObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActTobaccoUse2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActTobaccoUse2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActVitalSignObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActVitalSignObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemObservation2Support(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemObservation2Support(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActResultOrganizer2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActResultOrganizer2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemConcernAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemConcernAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActReference> getActReferences() {
		return HealthConcernActOperations.getActReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReferenceExtras() {
		return HealthConcernActOperations.getActReferenceExtras(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return HealthConcernActOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CognitiveAbilitiesObservation> getCognitiveAbilitiesObservations() {
		return HealthConcernActOperations.getCognitiveAbilitiesObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FamilyHistoryOrganizer> getFamilyHistoryOrganizers() {
		return HealthConcernActOperations.getFamilyHistoryOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MentalStatusObservation> getMentalStatusObservations() {
		return HealthConcernActOperations.getMentalStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionAssessment> getNutritionAssessments() {
		return HealthConcernActOperations.getNutritionAssessments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionAssessment> getNutritionAssessmentExtras() {
		return HealthConcernActOperations.getNutritionAssessmentExtras(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PregnancyObservation> getPregnancyObservations() {
		return HealthConcernActOperations.getPregnancyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return HealthConcernActOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations() {
		return HealthConcernActOperations.getCulturalAndReligiousObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments() {
		return HealthConcernActOperations.getCharacteristicsOfHomeEnvironments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionalStatusObservation> getNutritionalStatusObservations() {
		return HealthConcernActOperations.getNutritionalStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatientPriorityPreference> getPatientPriorityPreferences() {
		return HealthConcernActOperations.getPatientPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReferenceExtra3s() {
		return HealthConcernActOperations.getActReferenceExtra3s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelfCareActivities> getSelfCareActivitiess() {
		return HealthConcernActOperations.getSelfCareActivitiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SensoryAndSpeechStatus> getSensoryAndSpeechStatuss() {
		return HealthConcernActOperations.getSensoryAndSpeechStatuss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WoundObservation> getWoundObservations() {
		return HealthConcernActOperations.getWoundObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProviderPriorityPreference> getProviderPriorityPreferences() {
		return HealthConcernActOperations.getProviderPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalDocumentReference> getExternalDocumentReferences() {
		return HealthConcernActOperations.getExternalDocumentReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getProblemObservation2s() {
		return HealthConcernActOperations.getProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyObservation2> getAllergyObservation2s() {
		return HealthConcernActOperations.getAllergyObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getCognitiveStatusObservation2s() {
		return HealthConcernActOperations.getCognitiveStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getCognitiveStatusObservation2Extras() {
		return HealthConcernActOperations.getCognitiveStatusObservation2Extras(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusMeaningfulUse2> getCurrentSmokingStatus2s() {
		return HealthConcernActOperations.getCurrentSmokingStatus2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterDiagnosis2> getEncounterDiagnosis2s() {
		return HealthConcernActOperations.getEncounterDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusObservation2> getFunctionalStatusObservation2s() {
		return HealthConcernActOperations.getFunctionalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HospitalAdmissionDiagnosis2> getHospitalAdmissionDiagnosis2s() {
		return HealthConcernActOperations.getHospitalAdmissionDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostprocedureDiagnosis2> getPostprocedureDiagnosis2s() {
		return HealthConcernActOperations.getPostprocedureDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreoperativeDiagnosis2> getPreoperativeDiagnosis2s() {
		return HealthConcernActOperations.getPreoperativeDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation2> getReactionObservation2s() {
		return HealthConcernActOperations.getReactionObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation2> getResultObservation2s() {
		return HealthConcernActOperations.getResultObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialHistoryObservation2> getSocialHistoryObservation2s() {
		return HealthConcernActOperations.getSocialHistoryObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceOrDeviceAllergyObservation2> getSubstanceOrDeviceAllergyObservation2s() {
		return HealthConcernActOperations.getSubstanceOrDeviceAllergyObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TobaccoUse2> getTobaccoUse2s() {
		return HealthConcernActOperations.getTobaccoUse2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VitalSignObservation2> getVitalSignObservation2s() {
		return HealthConcernActOperations.getVitalSignObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getProblemObservation2Supports() {
		return HealthConcernActOperations.getProblemObservation2Supports(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultOrganizer2> getResultOrganizer2s() {
		return HealthConcernActOperations.getResultOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemConcernAct2> getProblemConcernAct2s() {
		return HealthConcernActOperations.getProblemConcernAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HealthConcernActImpl
