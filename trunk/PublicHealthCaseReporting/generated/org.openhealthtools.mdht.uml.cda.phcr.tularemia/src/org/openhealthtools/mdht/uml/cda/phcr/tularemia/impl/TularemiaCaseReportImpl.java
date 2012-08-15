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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaCaseReportImpl extends PublicHealthCaseReportImpl implements TularemiaCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TularemiaCaseReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TularemiaPackage.Literals.TULAREMIA_CASE_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaCaseReportPhcrEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportPhcrEncountersSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRSocialHistorySection getTularemiaPHCRSocialHistorySection()
  {
		return TularemiaCaseReportOperations.getTularemiaPHCRSocialHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRClinicalInformationSection getTularemiaPHCRClinicalInformationSection()
  {
		return TularemiaCaseReportOperations.getTularemiaPHCRClinicalInformationSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaPHCRTreatmentInformationSection getTularemiaPHCRTreatmentInformationSection() {
		return TularemiaCaseReportOperations.getTularemiaPHCRTreatmentInformationSection(this);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PhcrEncountersSection gettularemiaPhcrEncountersSection()
  {
		return TularemiaCaseReportOperations.gettularemiaPhcrEncountersSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRRelevantDxTestsSection getTularemiaPHCRRelevantDxTestsSection()
  {
		return TularemiaCaseReportOperations.getTularemiaPHCRRelevantDxTestsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaCaseReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TularemiaCaseReportImpl
