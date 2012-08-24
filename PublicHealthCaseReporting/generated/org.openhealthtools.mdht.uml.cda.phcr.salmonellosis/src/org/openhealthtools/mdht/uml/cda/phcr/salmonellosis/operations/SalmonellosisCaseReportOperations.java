/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisSocialHistorySection() <em>Get Salmonellosis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisRelevantDxTestsSection() <em>Get Salmonellosis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisPHCRClinicalInformationSection() <em>Get Salmonellosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisCaseReportOperations extends PublicHealthCaseReportOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisCaseReportOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report -  Salmonellosis')";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_TITLE,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisCaseReportTitle"),
             new Object [] { salmonellosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRSocialHistorySection))";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisCaseReportSalmonellosisSocialHistorySection"),
             new Object [] { salmonellosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRRelevantDxTestsSection))";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisCaseReportSalmonellosisRelevantDxTestsSection"),
             new Object [] { salmonellosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRClinicalInformationSection))";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis PHCR Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT);
      try
      {
        VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection"),
             new Object [] { salmonellosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisSocialHistorySection(SalmonellosisCaseReport) <em>Get Salmonellosis Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisSocialHistorySection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRSocialHistorySection)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisSocialHistorySection(SalmonellosisCaseReport) <em>Get Salmonellosis Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisSocialHistorySection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SalmonellosisPHCRSocialHistorySection getSalmonellosisSocialHistorySection(SalmonellosisCaseReport salmonellosisCaseReport)
  {
    if (GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT, SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT.getEAllOperations().get(64));
      try
      {
        GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (SalmonellosisPHCRSocialHistorySection) query.evaluate(salmonellosisCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport) <em>Get Salmonellosis Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRRelevantDxTestsSection)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport) <em>Get Salmonellosis Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SalmonellosisPHCRRelevantDxTestsSection getSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport salmonellosisCaseReport)
  {
    if (GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT, SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT.getEAllOperations().get(65));
      try
      {
        GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (SalmonellosisPHCRRelevantDxTestsSection) query.evaluate(salmonellosisCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport) <em>Get Salmonellosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRClinicalInformationSection)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport) <em>Get Salmonellosis PHCR Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SalmonellosisPHCRClinicalInformationSection getSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport salmonellosisCaseReport)
  {
    if (GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT, SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT.getEAllOperations().get(66));
      try
      {
        GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (SalmonellosisPHCRClinicalInformationSection) query.evaluate(salmonellosisCaseReport);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.9')";

  /**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisCaseReport, context) }),
             new Object [] { salmonellosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

} // SalmonellosisCaseReportOperations