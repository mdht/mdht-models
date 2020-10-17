/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForReferralSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Referral Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReasonForReferralSection2Impl extends ReasonForReferralSectionImpl implements ReasonForReferralSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForReferralSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonForReferralSection2Operations.validateReasonForReferralSection2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReasonForReferralSection2PatientReferralAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonForReferralSection2Operations.validateReasonForReferralSection2PatientReferralAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatientReferralAct> getPatientReferralActs() {
		return ReasonForReferralSection2Operations.getPatientReferralActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReasonForReferralSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSection2Operations.validateReasonForReferralSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReasonForReferralSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSection2Operations.validateReasonForReferralSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReasonForReferralSection2Impl
