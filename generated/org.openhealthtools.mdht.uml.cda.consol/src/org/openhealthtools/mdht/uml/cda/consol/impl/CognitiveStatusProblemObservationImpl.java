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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusProblemObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Status Problem Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusProblemObservationImpl extends ProblemObservationImpl implements
		CognitiveStatusProblemObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CognitiveStatusProblemObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_STATUS_PROBLEM_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationHasOnsetDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasOnsetDate(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationHasResolutionDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasResolutionDate(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationNegationInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationNegationInd(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationMethodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationValueP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCognitiveStatusProblemObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return CognitiveStatusProblemObservationOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return CognitiveStatusProblemObservationOperations.getCaregiverCharacteristicss(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return CognitiveStatusProblemObservationOperations.getAssessmentScaleObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public CognitiveStatusProblemObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusProblemObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CognitiveStatusProblemObservationImpl
