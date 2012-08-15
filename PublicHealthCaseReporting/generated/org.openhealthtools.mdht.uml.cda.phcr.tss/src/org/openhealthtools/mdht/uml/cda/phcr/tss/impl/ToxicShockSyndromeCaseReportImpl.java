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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.ToxicShockSyndromeCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toxic Shock Syndrome Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ToxicShockSyndromeCaseReportImpl extends PublicHealthCaseReportImpl implements ToxicShockSyndromeCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToxicShockSyndromeCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToxicShockSyndromeCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TssPhcrClinicalInformationSection getTssPhcrClinicalInformationSection() {
		return ToxicShockSyndromeCaseReportOperations.getTssPhcrClinicalInformationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TssPhcrRelevantDxTestsSection getTssPhcrRelevantDxTestsSection() {
		return ToxicShockSyndromeCaseReportOperations.getTssPhcrRelevantDxTestsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicShockSyndromeCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToxicShockSyndromeCaseReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ToxicShockSyndromeCaseReportImpl
