/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_GuarantorOperations;

import org.openhealthtools.mdht.uml.cda.impl.Performer2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Guarantor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_GuarantorImpl extends Performer2Impl implements PolicyActivity_Guarantor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_GuarantorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_GUARANTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorOperations.validateGuarantorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorOperations.validateGuarantorGuarantorAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorOperations.validateGuarantorGuarantorAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_GuarantorOperations.validateGuarantorGuarantorAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity_GuarantorOperations.validateGuarantorGuarantorAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_Guarantor init() {
		CDAUtil.init(this);
		return this;
	}
} // PolicyActivity_GuarantorImpl
