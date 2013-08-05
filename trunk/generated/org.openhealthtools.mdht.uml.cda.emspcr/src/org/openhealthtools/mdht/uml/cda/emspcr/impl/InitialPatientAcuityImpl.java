/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.InitialPatientAcuityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Patient Acuity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InitialPatientAcuityImpl extends ObservationImpl implements InitialPatientAcuity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialPatientAcuityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INITIAL_PATIENT_ACUITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialPatientAcuityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InitialPatientAcuityOperations.validateInitialPatientAcuityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPatientAcuity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPatientAcuity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InitialPatientAcuityImpl
