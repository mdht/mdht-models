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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return FunctionalStatusProblemObservationOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return FunctionalStatusProblemObservationOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public boolean validateProblemObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationNegationInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusProblemObservationOperations.validateProblemObservationValue(this, diagnostics, context);
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
