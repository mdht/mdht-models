/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfantBreastfedOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infant Breastfed</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InfantBreastfedImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements InfantBreastfed {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfantBreastfedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.INFANT_BREASTFED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfantBreastfedValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfantBreastfedOperations.validateInfantBreastfedValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantBreastfed init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantBreastfed init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // InfantBreastfedImpl
