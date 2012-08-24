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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRSocialHistorySection() <em>Get Tuberculosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRClinicalInformationSection() <em>Get Tuberculosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRRelevantDxTestsSection() <em>Get Tuberculosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRTreatmentInformationSection() <em>Get Tuberculosis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRImmunizationSection() <em>Get Tuberculosis PHCR Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuberculosisCaseReportOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTitle(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTitle(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Tuberculosis')";

  /**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTitle(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTitle(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTuberculosisCaseReportTitle(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TITLE,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTitle"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRSocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTuberculosisPHCRSocialHistorySection"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRClinicalInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTuberculosisPHCRClinicalInformationSection"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRRelevantDxTestsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Treatment Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRTreatmentInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Treatment Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Immunization Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRImmunizationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Immunization Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisCaseReportTuberculosisPHCRImmunizationSection"),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRSocialHistorySection)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisPHCRSocialHistorySection getTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport tuberculosisCaseReport) {
    if (GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT.getEAllOperations().get(66));
      try
      {
        GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (TuberculosisPHCRSocialHistorySection) query.evaluate(tuberculosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRClinicalInformationSection)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisPHCRClinicalInformationSection getTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport tuberculosisCaseReport) {
    if (GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT.getEAllOperations().get(67));
      try
      {
        GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (TuberculosisPHCRClinicalInformationSection) query.evaluate(tuberculosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRRelevantDxTestsSection)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisPHCRRelevantDxTestsSection getTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport tuberculosisCaseReport) {
    if (GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT.getEAllOperations().get(68));
      try
      {
        GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (TuberculosisPHCRRelevantDxTestsSection) query.evaluate(tuberculosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Treatment Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRTreatmentInformationSection)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Treatment Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisPHCRTreatmentInformationSection getTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport tuberculosisCaseReport) {
    if (GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT.getEAllOperations().get(69));
      try
      {
        GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
    return (TuberculosisPHCRTreatmentInformationSection) query.evaluate(tuberculosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisPHCRImmunizationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Immunization Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRImmunizationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRImmunizationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRImmunizationSection)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisPHCRImmunizationSection(TuberculosisCaseReport) <em>Get Tuberculosis PHCR Immunization Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisPHCRImmunizationSection(TuberculosisCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisPHCRImmunizationSection getTuberculosisPHCRImmunizationSection(TuberculosisCaseReport tuberculosisCaseReport) {
    if (GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT, TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT.getEAllOperations().get(70));
      try
      {
        GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__EOCL_QRY);
    return (TuberculosisPHCRImmunizationSection) query.evaluate(tuberculosisCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.1')";

	/**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisCaseReport, context) }),
             new Object [] { tuberculosisCaseReport }));
      }
       
      return false;
    }
    return true;
  }

} // TuberculosisCaseReportOperations