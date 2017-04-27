/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AssessmentObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssessmentObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl
		implements AssessmentObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.ASSESSMENT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentObservationOperations.validateAssessmentObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentObservation init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentObservation init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // AssessmentObservationImpl
