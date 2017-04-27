/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.BirthOrderOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Birth Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BirthOrderImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements BirthOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirthOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.BIRTH_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthOrderOperations.validateBirthOrderValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthOrder init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthOrder init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // BirthOrderImpl
