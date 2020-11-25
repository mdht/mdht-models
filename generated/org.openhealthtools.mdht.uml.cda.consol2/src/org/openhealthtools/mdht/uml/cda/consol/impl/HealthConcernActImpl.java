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
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Concern Act</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateHealthConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActHealthConcernActErRefr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActHealthConcernActErRefr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActHealthConcernActErComp(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActHealthConcernActErComp(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActFamilyHistoryOrganizer2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActNutritionAssessment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPregnancyObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPregnancyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCaregiverCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCulturalAndReligiousObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActCharacteristicsOfHomeEnvironment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActCharacteristicsOfHomeEnvironment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActNutritionalStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionalStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEntryReferenceGeneral(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEntryReferenceGeneral(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSelfCareActivities(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSelfCareActivities(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSensoryStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSensoryStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActLongitudinalCareWoundObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActLongitudinalCareWoundObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActProblemObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActAllergyObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActAllergyObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActMentalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActSmokingStatusMeaningfulUse2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActSmokingStatusMeaningfulUse2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActEncounterDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEncounterDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActFunctionalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFunctionalStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActHospitalAdmissionDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActHospitalAdmissionDiagnosis2(this, diagnostics, context);
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
	public boolean validateHealthConcernActReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReactionObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActResultObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		return HealthConcernActOperations.validateHealthConcernActSubstanceOrDeviceAllergyObservation2(this, diagnostics, context);
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
	public boolean validateHealthConcernActProblemConcernAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActProblemConcernAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthConcernActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActReferenceExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return HealthConcernActOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryOrganizer2> getFamilyHistoryOrganizer2s() {
		return HealthConcernActOperations.getFamilyHistoryOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionAssessment> getNutritionAssessments() {
		return HealthConcernActOperations.getNutritionAssessments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PregnancyObservation> getPregnancyObservations() {
		return HealthConcernActOperations.getPregnancyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return HealthConcernActOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations() {
		return HealthConcernActOperations.getCulturalAndReligiousObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments() {
		return HealthConcernActOperations.getCharacteristicsOfHomeEnvironments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionalStatusObservation> getNutritionalStatusObservations() {
		return HealthConcernActOperations.getNutritionalStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceGenerals() {
		return HealthConcernActOperations.getEntryReferenceGenerals(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelfCareActivities> getSelfCareActivitiess() {
		return HealthConcernActOperations.getSelfCareActivitiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensoryStatus> getSensoryStatuss() {
		return HealthConcernActOperations.getSensoryStatuss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongitudinalCareWoundObservation> getLongitudinalCareWoundObservations() {
		return HealthConcernActOperations.getLongitudinalCareWoundObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferences() {
		return HealthConcernActOperations.getPriorityPreferences(this);
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
	public EList<MentalStatusObservation2> getMentalStatusObservation2s() {
		return HealthConcernActOperations.getMentalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusMeaningfulUse2> getSmokingStatusMeaningfulUse2s() {
		return HealthConcernActOperations.getSmokingStatusMeaningfulUse2s(this);
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
	public HealthConcernAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HealthConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HealthConcernActImpl
