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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusProblemObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Problem Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusProblemObservationImpl extends ProblemObservationImpl implements
		FunctionalStatusProblemObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusProblemObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationHasOnsetDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasOnsetDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationHasResolutionDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasResolutionDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationValueNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationValueNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationNegationInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationNegationInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationMethodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationCaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusProblemObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return FunctionalStatusProblemObservationOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return FunctionalStatusProblemObservationOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return FunctionalStatusProblemObservationOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusProblemObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusProblemObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusProblemObservationImpl
