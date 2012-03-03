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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason;

import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationRefusalReasonOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Refusal Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationRefusalReasonImpl extends ObservationImpl implements ImmunizationRefusalReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRefusalReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_REFUSAL_REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRefusalReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRefusalReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRefusalReasonId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRefusalReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRefusalReasonStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationRefusalReasonOperations.validateImmunizationRefusalReasonStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRefusalReason init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ImmunizationRefusalReasonImpl
