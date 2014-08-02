/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MothersVitalSignsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mothers Vital Signs Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MothersVitalSignsObservationImpl extends ObservationImpl implements MothersVitalSignsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MothersVitalSignsObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MothersVitalSignsObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MothersVitalSignsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MothersVitalSignsObservationImpl
