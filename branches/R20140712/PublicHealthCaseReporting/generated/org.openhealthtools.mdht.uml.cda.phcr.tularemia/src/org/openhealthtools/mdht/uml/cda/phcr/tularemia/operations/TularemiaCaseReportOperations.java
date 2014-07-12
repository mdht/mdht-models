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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportPhcrEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRSocialHistorySection() <em>Get Tularemia PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRClinicalInformationSection() <em>Get Tularemia PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRTreatmentInformationSection() <em>Get Tularemia PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#gettularemiaPhcrEncountersSection() <em>Gettularemia Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRRelevantDxTestsSection() <em>Get Tularemia PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TularemiaCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportTitle(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTitle(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Tularemia')";

	/**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportTitle(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTitle(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Tularemia')
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaCaseReportTitle(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TITLE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportTitle"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportTularemiaPHCRSocialHistorySection"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportTularemiaPHCRClinicalInformationSection"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportTularemiaPHCRTreatmentInformationSection"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Phcr Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Phcr Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportPhcrEncountersSection"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaCaseReportTularemiaPHCRRelevantDxTestsSection"),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaPHCRSocialHistorySection(TularemiaCaseReport) <em>Get Tularemia PHCR Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRSocialHistorySection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getTularemiaPHCRSocialHistorySection(TularemiaCaseReport) <em>Get Tularemia PHCR Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRSocialHistorySection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRSocialHistorySection)
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  TularemiaPHCRSocialHistorySection getTularemiaPHCRSocialHistorySection(TularemiaCaseReport tularemiaCaseReport) {
		if (GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT, TularemiaPackage.Literals.TULAREMIA_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (TularemiaPHCRSocialHistorySection) query.evaluate(tularemiaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTularemiaPHCRClinicalInformationSection(TularemiaCaseReport) <em>Get Tularemia PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRClinicalInformationSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRClinicalInformationSection)";

  /**
	 * The cached OCL query for the '{@link #getTularemiaPHCRClinicalInformationSection(TularemiaCaseReport) <em>Get Tularemia PHCR Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRClinicalInformationSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRClinicalInformationSection)
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  TularemiaPHCRClinicalInformationSection getTularemiaPHCRClinicalInformationSection(TularemiaCaseReport tularemiaCaseReport)
  {
		if (GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT, TularemiaPackage.Literals.TULAREMIA_CASE_REPORT.getEAllOperations().get(66));
			try {
				GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (TularemiaPHCRClinicalInformationSection) query.evaluate(tularemiaCaseReport);
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport) <em>Get Tularemia PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRTreatmentInformationSection)";

		/**
	 * The cached OCL query for the '{@link #getTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport) <em>Get Tularemia PHCR Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRTreatmentInformationSection)
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  TularemiaPHCRTreatmentInformationSection getTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport tularemiaCaseReport) {
		if (GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT, TularemiaPackage.Literals.TULAREMIA_CASE_REPORT.getEAllOperations().get(67));
			try {
				GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (TularemiaPHCRTreatmentInformationSection) query.evaluate(tularemiaCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #gettularemiaPhcrEncountersSection(TularemiaCaseReport) <em>Gettularemia Phcr Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #gettularemiaPhcrEncountersSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static final String GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))->asSequence()->any(true).oclAsType(phcr::PhcrEncountersSection)";

  /**
	 * The cached OCL query for the '{@link #gettularemiaPhcrEncountersSection(TularemiaCaseReport) <em>Gettularemia Phcr Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #gettularemiaPhcrEncountersSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))->asSequence()->any(true).oclAsType(phcr::PhcrEncountersSection)
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PhcrEncountersSection gettularemiaPhcrEncountersSection(TularemiaCaseReport tularemiaCaseReport)
  {
		if (GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT, TularemiaPackage.Literals.TULAREMIA_CASE_REPORT.getEAllOperations().get(68));
			try {
				GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETTULAREMIA_PHCR_ENCOUNTERS_SECTION__EOCL_QRY);
		return (PhcrEncountersSection) query.evaluate(tularemiaCaseReport);
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport) <em>Get Tularemia PHCR Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRRelevantDxTestsSection)";

  /**
	 * The cached OCL query for the '{@link #getTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport) <em>Get Tularemia PHCR Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRRelevantDxTestsSection)
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  TularemiaPHCRRelevantDxTestsSection getTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport tularemiaCaseReport)
  {
		if (GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT, TularemiaPackage.Literals.TULAREMIA_CASE_REPORT.getEAllOperations().get(69));
			try {
				GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (TularemiaPHCRRelevantDxTestsSection) query.evaluate(tularemiaCaseReport);
	}

  /**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(TularemiaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.4')
	 * @param tularemiaCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePublicHealthCaseReportTemplateId(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaCaseReport, context) }),
						 new Object [] { tularemiaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // TularemiaCaseReportOperations