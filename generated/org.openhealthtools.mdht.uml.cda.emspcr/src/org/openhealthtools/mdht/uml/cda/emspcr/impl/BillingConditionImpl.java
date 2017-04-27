/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BillingConditionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BillingConditionImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements BillingCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.BILLING_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillingConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BillingConditionOperations.validateBillingConditionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingCondition init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BillingCondition init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // BillingConditionImpl
