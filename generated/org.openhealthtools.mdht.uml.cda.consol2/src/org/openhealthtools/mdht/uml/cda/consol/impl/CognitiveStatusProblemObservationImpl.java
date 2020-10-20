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
 *
 * @generated
 */
public class CognitiveStatusProblemObservationImpl extends ProblemObservationImpl
		implements CognitiveStatusProblemObservation {
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
	public boolean validateProblemObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationHasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationHasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationHasOnsetDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationHasResolutionDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationHasResolutionDate(
			this, diagnostics, context);
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
	public boolean validateProblemObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationNegationInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusProblemObservationOperations.validateProblemObservationValue(this, diagnostics, context);
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
