/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.InsuranceProviderOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.CoverageEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InsuranceProviderImpl extends CoverageEntryImpl implements InsuranceProvider {
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
		return HITSPPackage.Literals.INSURANCE_PROVIDER;
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
	public boolean validateInsuranceProviderInsuranceInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInformation(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderInsuranceInfoSourceID(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceID(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderInsuranceInfoSourceAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceAddr(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderHealthPlanCoverageStartTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStartTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderHealthPlanCoverageStopTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStopTime(
			this, diagnostics, context);
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
	public boolean validateInsuranceProviderRelationshipToSubscriber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriber(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderRelationshipToSubscriberCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriberCodeSystem(
			this, diagnostics, context);
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
	public boolean validateInsuranceProviderSubscriberInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
	public boolean validateInsuranceProviderFinancialResponsibilityPartyType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyType(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderFinancialResponsibilityPartyTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyTypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateInsuranceProviderFinancialResponsibilityPartyAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyAddress(
			this, diagnostics, context);
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
	public boolean validateInsuranceProviderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InsuranceProviderOperations.validateInsuranceProviderCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public InsuranceProvider init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsuranceProvider init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InsuranceProviderImpl
