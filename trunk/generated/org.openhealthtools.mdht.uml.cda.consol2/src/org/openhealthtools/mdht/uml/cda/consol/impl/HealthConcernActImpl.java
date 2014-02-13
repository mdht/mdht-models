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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;

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
	public boolean validateHealthConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReference(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActActReference2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReference2(this, diagnostics, context);
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
	public boolean validateHealthConcernActFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActFamilyHistoryOrganizer(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActMentalStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActMentalStatusObservation(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActNutritionAssessment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessment(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActNutritionAssessment2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActNutritionAssessment2(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActPregnancyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return HealthConcernActOperations.validateHealthConcernActCulturalAndReligiousObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
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
	public boolean validateHealthConcernActPatientPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActPatientPriorityPreference(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHealthConcernActActReference3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthConcernActOperations.validateHealthConcernActActReference3(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ActReference> getActReferences() {
		return HealthConcernActOperations.getActReferences(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ActReference> getActReference2s() {
		return HealthConcernActOperations.getActReference2s(this);
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
	public EList<CognitiveAbilitiesObservation> getCognitiveAbilitiesObservations() {
		return HealthConcernActOperations.getCognitiveAbilitiesObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<FamilyHistoryOrganizer> getFamilyHistoryOrganizers() {
		return HealthConcernActOperations.getFamilyHistoryOrganizers(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<MentalStatusObservation> getMentalStatusObservations() {
		return HealthConcernActOperations.getMentalStatusObservations(this);
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
	public EList<NutritionAssessment> getNutritionAssessment2s() {
		return HealthConcernActOperations.getNutritionAssessment2s(this);
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
	public EList<PatientPriorityPreference> getPatientPriorityPreferences() {
		return HealthConcernActOperations.getPatientPriorityPreferences(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ActReference> getActReference3s() {
		return HealthConcernActOperations.getActReference3s(this);
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
