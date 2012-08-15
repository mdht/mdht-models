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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WestNileVirusCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>West Nile Virus Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WestNileVirusCaseReportImpl extends PublicHealthCaseReportImpl implements WestNileVirusCaseReport
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WestNileVirusCaseReportImpl()
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
		return WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportTitle(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvPhcrClinicalInformationSection getWnvPhcrClinicalInformationSection()
  {
		return WestNileVirusCaseReportOperations.getWnvPhcrClinicalInformationSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvPhcrRelevantDxTestsSection getWnvPhcrRelevantDxTestsSection()
  {
		return WestNileVirusCaseReportOperations.getWnvPhcrRelevantDxTestsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return WestNileVirusCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WestNileVirusCaseReport init() {
    	CDAUtil.init(this);
    	return this;
	}
} //WestNileVirusCaseReportImpl
