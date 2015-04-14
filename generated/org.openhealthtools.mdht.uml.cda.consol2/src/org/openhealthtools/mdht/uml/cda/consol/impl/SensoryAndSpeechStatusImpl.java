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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus;

import org.openhealthtools.mdht.uml.cda.consol.operations.SensoryAndSpeechStatusOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensory And Speech Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SensoryAndSpeechStatusImpl extends ObservationImpl implements SensoryAndSpeechStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensoryAndSpeechStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SENSORY_AND_SPEECH_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSensoryAndSpeechStatusAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return SensoryAndSpeechStatusOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensoryAndSpeechStatus init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensoryAndSpeechStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SensoryAndSpeechStatusImpl
