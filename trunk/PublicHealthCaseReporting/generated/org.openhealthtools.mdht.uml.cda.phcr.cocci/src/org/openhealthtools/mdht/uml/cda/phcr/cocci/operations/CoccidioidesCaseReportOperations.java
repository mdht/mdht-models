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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRSocialHistorySection() <em>Get Coccidioides PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRClinicalInformationSection() <em>Get Coccidioides PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRTreatmentInformationSection() <em>Get Coccidioides PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRRelevantDxTestsSection() <em>Get Coccidioides PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesCaseReportOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Coccidioidomycosis')";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_TITLE,
             CocciPlugin.INSTANCE.getString("CoccidioidesCaseReportTitle"),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION,
             CocciPlugin.INSTANCE.getString("CoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection"),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION,
             CocciPlugin.INSTANCE.getString("CoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection"),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Treatment Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Treatment Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION,
             CocciPlugin.INSTANCE.getString("CoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection"),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION,
             CocciPlugin.INSTANCE.getString("CoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection"),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRSocialHistorySection)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  CoccidioidesPHCRSocialHistorySection getCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport coccidioidesCaseReport) {
    if (GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT, CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT.getEAllOperations().get(65));
      try
      {
        GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (CoccidioidesPHCRSocialHistorySection) query.evaluate(coccidioidesCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRClinicalInformationSection)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  CoccidioidesPHCRClinicalInformationSection getCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport coccidioidesCaseReport) {
    if (GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT, CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT.getEAllOperations().get(66));
      try
      {
        GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (CoccidioidesPHCRClinicalInformationSection) query.evaluate(coccidioidesCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Treatment Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRTreatmentInformationSection)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Treatment Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  CoccidioidesPHCRTreatmentInformationSection getCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport coccidioidesCaseReport) {
    if (GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT, CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT.getEAllOperations().get(67));
      try
      {
        GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
    return (CoccidioidesPHCRTreatmentInformationSection) query.evaluate(coccidioidesCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRRelevantDxTestsSection)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport) <em>Get Coccidioides PHCR Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  CoccidioidesPHCRRelevantDxTestsSection getCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport coccidioidesCaseReport) {
    if (GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT, CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT.getEAllOperations().get(68));
      try
      {
        GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (CoccidioidesPHCRRelevantDxTestsSection) query.evaluate(coccidioidesCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.10')";

	/**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coccidioidesCaseReport The receiving '<em><b>Coccidioides Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesCaseReport, context) }),
             new Object [] { coccidioidesCaseReport }));
      }
       
      return false;
    }
    return true;
  }

} // CoccidioidesCaseReportOperations