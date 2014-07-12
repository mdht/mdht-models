/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisCaseReportImpl extends PublicHealthCaseReportImpl implements TuberculosisCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTitle(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRSocialHistorySection getTuberculosisPHCRSocialHistorySection() {
		return TuberculosisCaseReportOperations.getTuberculosisPHCRSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRClinicalInformationSection getTuberculosisPHCRClinicalInformationSection() {
		return TuberculosisCaseReportOperations.getTuberculosisPHCRClinicalInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRRelevantDxTestsSection getTuberculosisPHCRRelevantDxTestsSection() {
		return TuberculosisCaseReportOperations.getTuberculosisPHCRRelevantDxTestsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRTreatmentInformationSection getTuberculosisPHCRTreatmentInformationSection() {
		return TuberculosisCaseReportOperations.getTuberculosisPHCRTreatmentInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRImmunizationSection getTuberculosisPHCRImmunizationSection() {
		return TuberculosisCaseReportOperations.getTuberculosisPHCRImmunizationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TuberculosisCaseReport init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TuberculosisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisCaseReportImpl
