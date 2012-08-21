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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Scale Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentScaleObservationImpl extends ObservationImpl implements AssessmentScaleObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentScaleObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationInterpretationCodeTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationInterpretationCodeTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationDerivationExpr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationDerivationExpr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationAssessmentScaleSupportingObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationAssessmentScaleSupportingObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRangeObservationRangeTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRangeObservationRangeText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleSupportingObservation> getAssessmentScaleSupportingObservations() {
		return AssessmentScaleObservationOperations.getAssessmentScaleSupportingObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AssessmentScaleObservationImpl
