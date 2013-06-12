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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchNotifiedTimeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Notified Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DispatchNotifiedTimeImpl extends ObservationImpl implements DispatchNotifiedTime {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DispatchNotifiedTimeImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_NOTIFIED_TIME;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchNotifiedTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchNotifiedTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchNotifiedTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchNotifiedTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchNotifiedTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DispatchNotifiedTime init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchNotifiedTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DispatchNotifiedTimeImpl
