/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.OnsetofLaborOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onsetof Labor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OnsetofLaborImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements OnsetofLabor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnsetofLaborImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.ONSETOF_LABOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnsetofLaborValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OnsetofLaborOperations.validateOnsetofLaborValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnsetofLabor init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnsetofLabor init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // OnsetofLaborImpl
