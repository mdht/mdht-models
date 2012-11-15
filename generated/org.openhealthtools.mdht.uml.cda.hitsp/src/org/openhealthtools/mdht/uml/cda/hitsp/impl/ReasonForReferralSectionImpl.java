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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ReasonForReferralSectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.ihe.impl.CodedReasonForReferralSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Referral Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionImpl extends CodedReasonForReferralSectionImpl implements ReasonForReferralSection {
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
		return HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReasonForReferralSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReasonForReferralSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForReferralSectionOperations.validateReasonForReferralSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPReasonForReferralSectionCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations.validateHITSPReasonForReferralSectionCondition(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPReasonForReferralSectionResult(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations.validateHITSPReasonForReferralSectionResult(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations.getConditions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getResults() {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations.getResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodedReasonForReferralSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReasonForReferralSectionOperations.validateCodedReasonForReferralSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReasonForReferralSectionImpl
