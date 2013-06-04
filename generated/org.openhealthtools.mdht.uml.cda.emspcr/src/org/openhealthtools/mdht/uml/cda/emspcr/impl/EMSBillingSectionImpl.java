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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSBillingSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Billing Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSBillingSectionImpl extends SectionImpl implements EMSBillingSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSBillingSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_BILLING_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSBillingSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSBillingSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSBillingSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSBillingSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSBillingSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntry1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryBillingConditionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryBillingConditionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryBillingConditionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryBillingConditionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryBillingConditionValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryBillingConditionValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryBillingConditionValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryBillingConditionValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryBillingConditionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryBillingConditionMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingSectionEntryTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSBillingSectionOperations.validateEMSBillingSectionEntryTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBillingSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBillingSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSBillingSectionImpl
