/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Scale Observation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssessmentScaleObservationV2Impl extends ObservationImpl implements AssessmentScaleObservationV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentScaleObservationV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSESSMENT_SCALE_OBSERVATION_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Id(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Code(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2DerivationExpr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2DerivationExpr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2InterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2InterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2MoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleObservationV2AssessmentScaleSupportingObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2AssessmentScaleSupportingObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleSupportingObservation> getAssessmentScaleSupportingObservations() {
		return AssessmentScaleObservationV2Operations.getAssessmentScaleSupportingObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleObservationV2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleObservationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AssessmentScaleObservationV2Impl
