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
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForReferralSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Referral Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionImpl extends SectionImpl implements ReasonForReferralSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForReferralSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ReasonForReferralSectionImpl
