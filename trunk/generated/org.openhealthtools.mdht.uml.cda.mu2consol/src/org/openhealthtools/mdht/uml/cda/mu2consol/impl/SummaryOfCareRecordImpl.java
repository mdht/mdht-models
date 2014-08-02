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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Summary Of Care Record</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SummaryOfCareRecordImpl extends GeneralHeaderConstraintsImpl
		implements SummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryOfCareRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordCarePlanning(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordCarePlanning(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordVitalSigns(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordVitalSigns(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordProblemSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordAllergiesSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordAllergiesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordImmunizationsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordSocialHistorySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordResultsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordProceduresSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSummaryOfCareRecordFunctionalStatusSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SummaryOfCareRecordOperations.validateSummaryOfCareRecordFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection retrieveFunctionalStatusSection() {
		return SummaryOfCareRecordOperations.retrieveFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosisSection retrieveHospitalDischargeDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrieveHospitalDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostoperativeDiagnosisSection retrievePostoperativeDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrievePostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection retrievePostprocedureDiagnosisSection() {
		return SummaryOfCareRecordOperations.retrievePostprocedureDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSection getProblemSection() {
		return SummaryOfCareRecordOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSection getAllergiesSection() {
		return SummaryOfCareRecordOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSection getImmunizationsSection() {
		return SummaryOfCareRecordOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return SummaryOfCareRecordOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSection getResultsSection() {
		return SummaryOfCareRecordOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection getProceduresSection() {
		return SummaryOfCareRecordOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection getFunctionalStatusSection() {
		return SummaryOfCareRecordOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryOfCareRecord init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SummaryOfCareRecord init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SummaryOfCareRecordImpl