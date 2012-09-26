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
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;
import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaCaseReportImpl extends PublicHealthCaseReportImpl implements InfluenzaCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportInfluenzaImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportInfluenzaImmunizationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaImmunizationSection getInfluenzaImmunizationSection() {
		return InfluenzaCaseReportOperations.getInfluenzaImmunizationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRClinicalInformationSection getInfluenzaPHCRClinicalInformationSection() {
		return InfluenzaCaseReportOperations.getInfluenzaPHCRClinicalInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRTreatmentInformationSection getInfluenzaPHCRTreatmentInformationSection() {
		return InfluenzaCaseReportOperations.getInfluenzaPHCRTreatmentInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
		return InfluenzaCaseReportOperations.getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRSocialHistorySection getInfluenzaPHCRSocialHistorySection() {
		return InfluenzaCaseReportOperations.getInfluenzaPHCRSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenzaCaseReport init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public InfluenzaCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InfluenzaCaseReportImpl
