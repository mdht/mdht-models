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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Imaging Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReportImpl extends GeneralHeaderConstraintsImpl implements DiagnosticImagingReport {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DiagnosticImagingReportImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportUseDiagnosticImagingCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportAllSectionsHaveTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportSectionsHaveText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportSectionsHaveText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticImagingReportId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformant(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformationRecipient(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipant1(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInFulfillmentOf(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOf(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportRelatedDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportRelatedDocument(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOf(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDiagnosticImagingReportFindingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DiagnosticImagingReportOperations.validateDiagnosticImagingReportFindingsSection(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FindingsSection getFindingsSection() {
		return DiagnosticImagingReportOperations.getFindingsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public DiagnosticImagingReport init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public DiagnosticImagingReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DiagnosticImagingReportImpl
