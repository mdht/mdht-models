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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StrepPneumoCaseReportImpl extends PublicHealthCaseReportImpl implements StrepPneumoCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReportStrepPneumoImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoImmunizationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoPHCRClinicalInformationSection getStrepPneumoPHCRClinicalInformationSection() {
		return StrepPneumoCaseReportOperations.getStrepPneumoPHCRClinicalInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoPHCRTreatmentInformationSection getStrepPneumoPHCRTreatmentInformationSection() {
		return StrepPneumoCaseReportOperations.getStrepPneumoPHCRTreatmentInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
		return StrepPneumoCaseReportOperations.getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrepPneumoSocialHistorySection> getStrepPneumoSocialHistorySections() {
		return StrepPneumoCaseReportOperations.getStrepPneumoSocialHistorySections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoImmunizationSection getStrepPneumoImmunizationSection() {
		return StrepPneumoCaseReportOperations.getStrepPneumoImmunizationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrepPneumoCaseReport init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StrepPneumoCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StrepPneumoCaseReportImpl
