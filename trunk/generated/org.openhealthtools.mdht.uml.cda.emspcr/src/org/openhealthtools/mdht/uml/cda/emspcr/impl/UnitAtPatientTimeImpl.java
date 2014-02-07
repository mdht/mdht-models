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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitAtPatientTimeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit At Patient Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnitAtPatientTimeImpl extends ObservationImpl implements UnitAtPatientTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitAtPatientTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_AT_PATIENT_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAtPatientTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatientTimeOperations.validateUnitAtPatientTimeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAtPatientTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatientTimeOperations.validateUnitAtPatientTimeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAtPatientTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatientTimeOperations.validateUnitAtPatientTimeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAtPatientTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatientTimeOperations.validateUnitAtPatientTimeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAtPatientTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatientTimeOperations.validateUnitAtPatientTimeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatientTime init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatientTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // UnitAtPatientTimeImpl
