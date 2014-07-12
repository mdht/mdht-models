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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.util.WnvValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>West Nile Virus Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#getWnvPhcrClinicalInformationSection() <em>Get Wnv Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#getWnvPhcrRelevantDxTestsSection() <em>Get Wnv Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WestNileVirusCaseReportOperations extends PublicHealthCaseReportOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WestNileVirusCaseReportOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - West Nile Virus')";

  /**
   * The cached OCL invariant for the '{@link #validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - West Nile Virus')
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT);
      try
      {
        VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(westNileVirusCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_TITLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWestNileVirusCaseReportTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(westNileVirusCaseReport, context) }),
             new Object [] { westNileVirusCaseReport }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))";

  /**
   * The cached OCL invariant for the '{@link #validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT);
      try
      {
        VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(westNileVirusCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(westNileVirusCaseReport, context) }),
             new Object [] { westNileVirusCaseReport }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))";

  /**
   * The cached OCL invariant for the '{@link #validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT);
      try
      {
        VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(westNileVirusCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(westNileVirusCaseReport, context) }),
             new Object [] { westNileVirusCaseReport }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getWnvPhcrClinicalInformationSection(WestNileVirusCaseReport) <em>Get Wnv Phcr Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWnvPhcrClinicalInformationSection(WestNileVirusCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(wnv::WnvPhcrClinicalInformationSection)";

  /**
   * The cached OCL query for the '{@link #getWnvPhcrClinicalInformationSection(WestNileVirusCaseReport) <em>Get Wnv Phcr Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWnvPhcrClinicalInformationSection(WestNileVirusCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(wnv::WnvPhcrClinicalInformationSection)
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  WnvPhcrClinicalInformationSection getWnvPhcrClinicalInformationSection(WestNileVirusCaseReport westNileVirusCaseReport)
  {
    if (GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT, WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT.getEAllOperations().get(63));
      try
      {
        GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WNV_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (WnvPhcrClinicalInformationSection) query.evaluate(westNileVirusCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport) <em>Get Wnv Phcr Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(wnv::WnvPhcrRelevantDxTestsSection)";

  /**
   * The cached OCL query for the '{@link #getWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport) <em>Get Wnv Phcr Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(wnv::WnvPhcrRelevantDxTestsSection)
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  WnvPhcrRelevantDxTestsSection getWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport westNileVirusCaseReport)
  {
    if (GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT, WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT.getEAllOperations().get(64));
      try
      {
        GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (WnvPhcrRelevantDxTestsSection) query.evaluate(westNileVirusCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.7')";

  /**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.7')
   * @param westNileVirusCaseReport The receiving '<em><b>West Nile Virus Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WEST_NILE_VIRUS_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(westNileVirusCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WEST_NILE_VIRUS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(westNileVirusCaseReport, context) }),
             new Object [] { westNileVirusCaseReport }));
      }
      return false;
    }
    return true;
  }

} // WestNileVirusCaseReportOperations