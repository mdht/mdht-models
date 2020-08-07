/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.ChiefComplaintAndReasonForVisitSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chief Complaint And Reason For Visit Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChiefComplaintAndReasonForVisitSectionImpl extends SectionImpl
		implements ChiefComplaintAndReasonForVisitSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintAndReasonForVisitSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateChiefComplaintAndReasonForVisitSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateChiefComplaintAndReasonForVisitSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateChiefComplaintAndReasonForVisitSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateChiefComplaintAndReasonForVisitSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateChiefComplaintAndReasonForVisitSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChiefComplaintAndReasonForVisitSectionOperations.validateChiefComplaintAndReasonForVisitSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ChiefComplaintAndReasonForVisitSectionImpl
