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
package org.openhealthtools.mdht.uml.cda.phcr.hib.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;



import org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HIBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.operations.HIBCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIB Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIBCaseReportImpl extends PublicHealthCaseReportImpl implements HIBCaseReport
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HIBCaseReportImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return HibPackage.Literals.HIB_CASE_REPORT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HIBCaseReportOperations.validateHIBCaseReportTitle(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReportHibPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HIBCaseReportOperations.validateHIBCaseReportHibPhcrClinicalInformationSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReportHibPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HIBCaseReportOperations.validateHIBCaseReportHibPhcrRelevantDxTestsSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibPhcrClinicalInformationSection getHibPhcrClinicalInformationSection() {
		return HIBCaseReportOperations.getHibPhcrClinicalInformationSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibPhcrRelevantDxTestsSection getHibPhcrRelevantDxTestsSection() {
		return HIBCaseReportOperations.getHibPhcrRelevantDxTestsSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HIBCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HIBCaseReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //HIBCaseReportImpl
