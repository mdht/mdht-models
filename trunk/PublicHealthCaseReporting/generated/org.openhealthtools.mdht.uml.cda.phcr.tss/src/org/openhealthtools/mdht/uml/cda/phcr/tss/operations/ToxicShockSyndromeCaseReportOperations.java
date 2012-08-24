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
package org.openhealthtools.mdht.uml.cda.phcr.tss.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.util.tssValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Toxic Shock Syndrome Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#getTssPhcrClinicalInformationSection() <em>Get Tss Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#getTssPhcrRelevantDxTestsSection() <em>Get Tss Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToxicShockSyndromeCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ToxicShockSyndromeCaseReportOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Toxic Shock Syndrome')";

	/**
   * The cached OCL invariant for the '{@link #validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param toxicShockSyndromeCaseReport The receiving '<em><b>Toxic Shock Syndrome Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT);
      try
      {
        VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(toxicShockSyndromeCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE,
             TssPlugin.INSTANCE.getString("ToxicShockSyndromeCaseReportTitle"),
             new Object [] { toxicShockSyndromeCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Clinical Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param toxicShockSyndromeCaseReport The receiving '<em><b>Toxic Shock Syndrome Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT);
      try
      {
        VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(toxicShockSyndromeCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION,
             TssPlugin.INSTANCE.getString("ToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection"),
             new Object [] { toxicShockSyndromeCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Relevant Dx Tests Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param toxicShockSyndromeCaseReport The receiving '<em><b>Toxic Shock Syndrome Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT);
      try
      {
        VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(toxicShockSyndromeCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION,
             TssPlugin.INSTANCE.getString("ToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection"),
             new Object [] { toxicShockSyndromeCaseReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport) <em>Get Tss Phcr Clinical Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(tss::TssPhcrClinicalInformationSection)";

	/**
   * The cached OCL query for the '{@link #getTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport) <em>Get Tss Phcr Clinical Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TssPhcrClinicalInformationSection getTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport) {
    if (GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT, tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT.getEAllOperations().get(63));
      try
      {
        GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TSS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
    return (TssPhcrClinicalInformationSection) query.evaluate(toxicShockSyndromeCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport) <em>Get Tss Phcr Relevant Dx Tests Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport)
   * @generated
   * @ordered
   */
	protected static final String GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tss::TssPhcrRelevantDxTestsSection)";

	/**
   * The cached OCL query for the '{@link #getTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport) <em>Get Tss Phcr Relevant Dx Tests Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TssPhcrRelevantDxTestsSection getTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport) {
    if (GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT, tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT.getEAllOperations().get(64));
      try
      {
        GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
    return (TssPhcrRelevantDxTestsSection) query.evaluate(toxicShockSyndromeCaseReport);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.6')";

	/**
   * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param toxicShockSyndromeCaseReport The receiving '<em><b>Toxic Shock Syndrome Case Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TOXIC_SHOCK_SYNDROME_CASE_REPORT);
      try
      {
        VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(toxicShockSyndromeCaseReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TOXIC_SHOCK_SYNDROME_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(toxicShockSyndromeCaseReport, context) }),
             new Object [] { toxicShockSyndromeCaseReport }));
      }
       
      return false;
    }
    return true;
  }

} // ToxicShockSyndromeCaseReportOperations