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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ViewDownloadTransmitSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>View Download Transmit Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ViewDownloadTransmitSummaryImpl extends
		GeneralHeaderConstraintsImpl implements ViewDownloadTransmitSummary {
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
	public boolean validateViewDownloadTransmitSummaryCarePlanFields(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryCarePlanFields(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryAllergiesSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryAllergiesSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryMedicationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryMedicationsSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryProblemSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryProceduresSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryVitalSignsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryVitalSignsSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryResultsSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryAssessmentAndPlanSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryAssessmentAndPlanSection(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryPlanOfCareSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryPlanOfCareSection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummarySocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummarySocialHistorySection(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ViewDownloadTransmitSummaryOperations
				.validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PreoperativeDiagnosisSection retrievePreoperativeDiagnosisSection() {
		return ViewDownloadTransmitSummaryOperations
				.retrievePreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AllergiesSection getAllergiesSection() {
		return ViewDownloadTransmitSummaryOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ViewDownloadTransmitSummaryOperations
				.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return ViewDownloadTransmitSummaryOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return ViewDownloadTransmitSummaryOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ViewDownloadTransmitSummaryOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return ViewDownloadTransmitSummaryOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ViewDownloadTransmitSummaryOperations
				.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return ViewDownloadTransmitSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ViewDownloadTransmitSummaryOperations
				.getSocialHistorySection(this);
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
	public ViewDownloadTransmitSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ViewDownloadTransmitSummaryImpl
