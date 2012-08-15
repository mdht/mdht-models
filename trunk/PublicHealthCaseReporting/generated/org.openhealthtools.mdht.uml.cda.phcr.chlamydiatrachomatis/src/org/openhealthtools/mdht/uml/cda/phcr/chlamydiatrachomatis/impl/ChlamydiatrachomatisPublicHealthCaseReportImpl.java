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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Health Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPublicHealthCaseReportImpl extends PublicHealthCaseReportImpl implements ChlamydiatrachomatisPublicHealthCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChlamydiatrachomatisPublicHealthCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChlamydiatrachomatisPublicHealthCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRClinicalInformationSection getChlamydiatrachomatisPHCRClinicalInformationSection() {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.getChlamydiatrachomatisPHCRClinicalInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRRelevantDxTestsSection getChlamydiatrachomatisPHCRRelevantDxTestsSection() {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.getChlamydiatrachomatisPHCRRelevantDxTestsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRTreatmentInformationSection getChlamydiatrachomatisPHCRTreatmentInformationSection() {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.getChlamydiatrachomatisPHCRTreatmentInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChlamydiatrachomatisPublicHealthCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPublicHealthCaseReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ChlamydiatrachomatisPublicHealthCaseReportImpl
