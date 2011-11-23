/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;

import org.openhealthtools.mdht.uml.cda.consol.operations.InsuranceProviderOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InsuranceProviderImpl extends ActImpl implements InsuranceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INSURANCE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderSequenceNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderPaymentProviders(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderPaymentProviders(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderPayerEntryID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderPayerEntryID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderHealthInsuranceType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderHealthInsuranceType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderInsuranceInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderInsuranceInfoSourceID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderInsuranceInfoSourceAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderHealthPlanCoverageStartTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStartTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderHealthPlanCoverageStopTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStopTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderPatientInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderPatientInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderMemberId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderMemberId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderMemberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderMemberIdRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderRelationshipToSubscriber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderRelationshipToSubscriberCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriberCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderSubscriberInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderSubscriberInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderSubscriberId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderSubscriberId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderSubscriberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderSubscriberIdRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderSubscriberAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderSubscriberAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderFinancialResponsibilityPartyType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderFinancialResponsibilityPartyTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderFinancialResponsibilityPartyAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProviderPayerEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderPayerEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PayerEntry> getPayerEntries() {
		return InsuranceProviderOperations.getPayerEntries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceProvider init() {
    	CDAUtil.init(this);
    	return this;
	}
} //InsuranceProviderImpl
