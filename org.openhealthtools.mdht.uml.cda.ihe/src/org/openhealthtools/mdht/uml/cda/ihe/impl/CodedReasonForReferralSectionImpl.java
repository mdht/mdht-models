/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coded Reason For Referral Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CodedReasonForReferralSectionImpl extends ReasonForReferralSectionImpl implements
		CodedReasonForReferralSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedReasonForReferralSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedReasonForReferralSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedReasonForReferralSectionSimpleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionSimpleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedReasonForReferralSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedReasonForReferralSectionOperations.validateCodedReasonForReferralSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleObservation> getSimpleObservations() {
		return CodedReasonForReferralSectionOperations.getSimpleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemEntry> getProblemEntries() {
		return CodedReasonForReferralSectionOperations.getProblemEntries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedReasonForReferralSection init() {
		CDAUtil.init(this);
		return this;
	}
} // CodedReasonForReferralSectionImpl
