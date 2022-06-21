/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleSupportingObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Scale Supporting Observation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssessmentScaleSupportingObservationV2Impl extends ObservationImpl
		implements AssessmentScaleSupportingObservationV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentScaleSupportingObservationV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2CodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2CodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2Id(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentScaleSupportingObservationV2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2MoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleSupportingObservationV2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleSupportingObservationV2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AssessmentScaleSupportingObservationV2Impl
