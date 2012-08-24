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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRSocialHistorySection() <em>Get Silicosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRClinicalInformationSection() <em>Get Silicosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRRelevantDxTestsSection() <em>Get Silicosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisCaseReportOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisCaseReportTitle(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportTitle(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Silicosis')";

  /**
   * The cached OCL invariant for the '{@link #validateSilicosisCaseReportTitle(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportTitle(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param silicosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateSilicosisCaseReportTitle(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_TITLE,
             SilicosisPlugin.INSTANCE.getString("SilicosisCaseReportTitle"),
             new Object [] { silicosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRSocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param silicosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION,
             SilicosisPlugin.INSTANCE.getString("SilicosisCaseReportSilicosisPHCRSocialHistorySection"),
             new Object [] { silicosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRClinicalInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param silicosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION,
             SilicosisPlugin.INSTANCE.getString("SilicosisCaseReportSilicosisPHCRClinicalInformationSection"),
             new Object [] { silicosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRRelevantDxTestsSection))";

  /**
   * The cached OCL invariant for the '{@link #validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param silicosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION,
             SilicosisPlugin.INSTANCE.getString("SilicosisCaseReportSilicosisPHCRRelevantDxTestsSection"),
             new Object [] { silicosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSilicosisPHCRSocialHistorySection(SilicosisCaseReport) <em>Get Silicosis PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPHCRSocialHistorySection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRSocialHistorySection)";

	/**
   * The cached OCL query for the '{@link #getSilicosisPHCRSocialHistorySection(SilicosisCaseReport) <em>Get Silicosis PHCR Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPHCRSocialHistorySection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  SilicosisPHCRSocialHistorySection getSilicosisPHCRSocialHistorySection(SilicosisCaseReport silicosisCaseReport) {
    if (GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT, SilicosisPackage.Literals.SILICOSIS_CASE_REPORT.getEAllOperations().get(64));
      try
      {
        GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (SilicosisPHCRSocialHistorySection) query.evaluate(silicosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getSilicosisPHCRClinicalInformationSection(SilicosisCaseReport) <em>Get Silicosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPHCRClinicalInformationSection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRClinicalInformationSection)";

	/**
   * The cached OCL query for the '{@link #getSilicosisPHCRClinicalInformationSection(SilicosisCaseReport) <em>Get Silicosis PHCR Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisPHCRClinicalInformationSection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  SilicosisPHCRClinicalInformationSection getSilicosisPHCRClinicalInformationSection(SilicosisCaseReport silicosisCaseReport) {
    if (GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT, SilicosisPackage.Literals.SILICOSIS_CASE_REPORT.getEAllOperations().get(65));
      try
      {
        GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (SilicosisPHCRClinicalInformationSection) query.evaluate(silicosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport) <em>Get Silicosis PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRRelevantDxTestsSection)";

  /**
   * The cached OCL query for the '{@link #getSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport) <em>Get Silicosis PHCR Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SilicosisPHCRRelevantDxTestsSection getSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport silicosisCaseReport)
  {
    if (GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT, SilicosisPackage.Literals.SILICOSIS_CASE_REPORT.getEAllOperations().get(66));
      try
      {
        GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (SilicosisPHCRRelevantDxTestsSection) query.evaluate(silicosisCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.8')";

	/**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(SilicosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param silicosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePublicHealthCaseReportTemplateId(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisCaseReport, context) }),
             new Object [] { silicosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

} // SilicosisCaseReportOperations