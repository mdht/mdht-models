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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitAtPatienttTimeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit At Patientt Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnitAtPatienttTimeImpl extends ObservationImpl implements UnitAtPatienttTime {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected UnitAtPatienttTimeImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_AT_PATIENTT_TIME;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateUnitAtPatienttTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateUnitAtPatienttTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateUnitAtPatienttTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateUnitAtPatienttTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateUnitAtPatienttTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public UnitAtPatienttTime init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatienttTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // UnitAtPatienttTimeImpl
