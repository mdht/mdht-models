/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
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
import org.openhealthtools.mdht.uml.cda.consol.operations.RiskConcernActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RiskConcernActImpl extends ActImpl implements RiskConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RISK_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAllergyObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAllergyObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceRelatesTo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceRelatesTo(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceHasComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceHasComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSelfCareActivities(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSelfCareActivities(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2B(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2B(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSmokingStatusMeaningfulUse2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSmokingStatusMeaningfulUse2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEncounterDiagnosis2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEncounterDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActFamilyHistoryOrganizer2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActFamilyHistoryOrganizer2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActFunctionalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActFunctionalStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActHospitalAdmissionDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActHospitalAdmissionDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActMentalStatusObservation2C(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActMentalStatusObservation2C(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionAssessment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionAssessment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionAssessmentB(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionAssessmentB(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPostprocedureDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPostprocedureDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPregnancyObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPregnancyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPreoperativeDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPreoperativeDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReactionObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActResultObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActResultObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSensoryStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSensoryStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSocialHistoryObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSocialHistoryObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActSubstanceOrDeviceAllergyObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActSubstanceOrDeviceAllergyObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActTobaccoUse2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActTobaccoUse2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActVitalSignObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActVitalSignObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActWoundObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActWoundObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemObservation2HasSupport(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemObservation2HasSupport(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCaregiverCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCulturalAndReligiousObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCulturalAndReligiousObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActCharacteristicsOfHomeEnvironment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActCharacteristicsOfHomeEnvironment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActNutritionalStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActNutritionalStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActResultOrganizer2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActResultOrganizer2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPriorityPreferencePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPriorityPreferencePatient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActPriorityPreferenceProvider(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActPriorityPreferenceProvider(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActProblemConcernAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActProblemConcernAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActEntryReferenceHealthConcern(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActEntryReferenceHealthConcern(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RiskConcernActOperations.validateRiskConcernActReferenceExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getProblemObservation2s() {
		return RiskConcernActOperations.getProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyObservation2> getAllergyObservation2s() {
		return RiskConcernActOperations.getAllergyObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceRelatesTos() {
		return RiskConcernActOperations.getEntryReferenceRelatesTos(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceHasComponents() {
		return RiskConcernActOperations.getEntryReferenceHasComponents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return RiskConcernActOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getMentalStatusObservation2s() {
		return RiskConcernActOperations.getMentalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelfCareActivities> getSelfCareActivitiess() {
		return RiskConcernActOperations.getSelfCareActivitiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getMentalStatusObservation2Bs() {
		return RiskConcernActOperations.getMentalStatusObservation2Bs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusMeaningfulUse2> getSmokingStatusMeaningfulUse2s() {
		return RiskConcernActOperations.getSmokingStatusMeaningfulUse2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterDiagnosis2> getEncounterDiagnosis2s() {
		return RiskConcernActOperations.getEncounterDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryOrganizer2> getFamilyHistoryOrganizer2s() {
		return RiskConcernActOperations.getFamilyHistoryOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusObservation2> getFunctionalStatusObservation2s() {
		return RiskConcernActOperations.getFunctionalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HospitalAdmissionDiagnosis2> getHospitalAdmissionDiagnosis2s() {
		return RiskConcernActOperations.getHospitalAdmissionDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getMentalStatusObservation2Cs() {
		return RiskConcernActOperations.getMentalStatusObservation2Cs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionAssessment> getNutritionAssessments() {
		return RiskConcernActOperations.getNutritionAssessments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionAssessment> getNutritionAssessmentBs() {
		return RiskConcernActOperations.getNutritionAssessmentBs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostprocedureDiagnosis2> getPostprocedureDiagnosis2s() {
		return RiskConcernActOperations.getPostprocedureDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PregnancyObservation> getPregnancyObservations() {
		return RiskConcernActOperations.getPregnancyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreoperativeDiagnosis2> getPreoperativeDiagnosis2s() {
		return RiskConcernActOperations.getPreoperativeDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation2> getReactionObservation2s() {
		return RiskConcernActOperations.getReactionObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation2> getResultObservation2s() {
		return RiskConcernActOperations.getResultObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensoryStatus> getSensoryStatuss() {
		return RiskConcernActOperations.getSensoryStatuss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialHistoryObservation2> getSocialHistoryObservation2s() {
		return RiskConcernActOperations.getSocialHistoryObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceOrDeviceAllergyObservation2> getSubstanceOrDeviceAllergyObservation2s() {
		return RiskConcernActOperations.getSubstanceOrDeviceAllergyObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TobaccoUse2> getTobaccoUse2s() {
		return RiskConcernActOperations.getTobaccoUse2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VitalSignObservation2> getVitalSignObservation2s() {
		return RiskConcernActOperations.getVitalSignObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongitudinalCareWoundObservation> getWoundObservations() {
		return RiskConcernActOperations.getWoundObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getProblemObservation2HasSupports() {
		return RiskConcernActOperations.getProblemObservation2HasSupports(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return RiskConcernActOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations() {
		return RiskConcernActOperations.getCulturalAndReligiousObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments() {
		return RiskConcernActOperations.getCharacteristicsOfHomeEnvironments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionalStatusObservation> getNutritionalStatusObservations() {
		return RiskConcernActOperations.getNutritionalStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultOrganizer2> getResultOrganizer2s() {
		return RiskConcernActOperations.getResultOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferencePatients() {
		return RiskConcernActOperations.getPriorityPreferencePatients(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferenceProviders() {
		return RiskConcernActOperations.getPriorityPreferenceProviders(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemConcernAct2> getProblemConcernAct2s() {
		return RiskConcernActOperations.getProblemConcernAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceHealthConcerns() {
		return RiskConcernActOperations.getEntryReferenceHealthConcerns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskConcernAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // RiskConcernActImpl
