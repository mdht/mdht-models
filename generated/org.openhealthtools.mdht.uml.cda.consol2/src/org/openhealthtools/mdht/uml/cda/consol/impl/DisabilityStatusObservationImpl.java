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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.DisabilityStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disability Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DisabilityStatusObservationImpl extends ObservationImpl implements DisabilityStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisabilityStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabilityStatusObservationAssessmentScaleObservationV2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DisabilityStatusObservationOperations.validateDisabilityStatusObservationAssessmentScaleObservationV2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservationV2> getAssessmentScaleObservationV2s() {
		return DisabilityStatusObservationOperations.getAssessmentScaleObservationV2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabilityStatusObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabilityStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DisabilityStatusObservationImpl
