/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfantLivingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infant Living</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InfantLivingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements InfantLiving {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfantLivingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.INFANT_LIVING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantLivingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantLivingOperations.validateInfantLivingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantLiving init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantLiving init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // InfantLivingImpl
