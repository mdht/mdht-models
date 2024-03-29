/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ViewDownloadTransmitSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>View
 * Download Transmit Summary</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ViewDownloadTransmitSummaryImpl extends GeneralHeaderConstraintsImpl
		implements ViewDownloadTransmitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ViewDownloadTransmitSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryCarePlanning(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryCarePlanning(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryVitalSigns(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryVitalSigns(this, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryAllergiesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryAllergiesSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryProblemSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProblemSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryProceduresSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProceduresSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummaryResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryResultsSection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateViewDownloadTransmitSummarySocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummarySocialHistorySection(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection retrievePreoperativeDiagnosisSection() {
		return ViewDownloadTransmitSummaryOperations.retrievePreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AllergiesSection getAllergiesSection() {
		return ViewDownloadTransmitSummaryOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ProblemSection getProblemSection() {
		return ViewDownloadTransmitSummaryOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ProceduresSection getProceduresSection() {
		return ViewDownloadTransmitSummaryOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResultsSection getResultsSection() {
		return ViewDownloadTransmitSummaryOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return ViewDownloadTransmitSummaryOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ViewDownloadTransmitSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ViewDownloadTransmitSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ViewDownloadTransmitSummaryImpl
