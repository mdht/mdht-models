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
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;
import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportInfluenzaImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#getInfluenzaImmunizationSection() <em>Get Influenza Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#getInfluenzaPHCRClinicalInformationSection() <em>Get Influenza PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#getInfluenzaPHCRTreatmentInformationSection() <em>Get Influenza PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() <em>Get Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#getInfluenzaPHCRSocialHistorySection() <em>Get Influenza PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportTitle(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportTitle(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Influenza')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportTitle(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportTitle(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Influenza')
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportTitle(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_TITLE,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportTitle"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza Immunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza Immunization Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportInfluenzaImmunizationSection"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportInfluenzaPHCRClinicalInformationSection"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Case Report Influenza PHCR Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION,
						 FluPlugin.INSTANCE.getString("InfluenzaCaseReportInfluenzaPHCRSocialHistorySection"),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaImmunizationSection(InfluenzaCaseReport) <em>Get Influenza Immunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImmunizationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaImmunizationSection)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaImmunizationSection(InfluenzaCaseReport) <em>Get Influenza Immunization Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImmunizationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaImmunizationSection)
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaImmunizationSection getInfluenzaImmunizationSection(InfluenzaCaseReport influenzaCaseReport) {
		if (GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_REPORT, fluPackage.Literals.INFLUENZA_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_IMMUNIZATION_SECTION__EOCL_QRY);
		return (InfluenzaImmunizationSection) query.evaluate(influenzaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport) <em>Get Influenza PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRClinicalInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport) <em>Get Influenza PHCR Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRClinicalInformationSection)
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaPHCRClinicalInformationSection getInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport influenzaCaseReport) {
		if (GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_REPORT, fluPackage.Literals.INFLUENZA_CASE_REPORT.getEAllOperations().get(66));
			try {
				GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (InfluenzaPHCRClinicalInformationSection) query.evaluate(influenzaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport) <em>Get Influenza PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRTreatmentInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport) <em>Get Influenza PHCR Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRTreatmentInformationSection)
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaPHCRTreatmentInformationSection getInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport influenzaCaseReport) {
		if (GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_REPORT, fluPackage.Literals.INFLUENZA_CASE_REPORT.getEAllOperations().get(67));
			try {
				GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (InfluenzaPHCRTreatmentInformationSection) query.evaluate(influenzaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport) <em>Get Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport) <em>Get Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport influenzaCaseReport) {
		if (GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_REPORT, fluPackage.Literals.INFLUENZA_CASE_REPORT.getEAllOperations().get(68));
			try {
				GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY);
		return (InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) query.evaluate(influenzaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport) <em>Get Influenza PHCR Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport) <em>Get Influenza PHCR Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(flu::InfluenzaPHCRSocialHistorySection)
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaPHCRSocialHistorySection getInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport influenzaCaseReport) {
		if (GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_CASE_REPORT, fluPackage.Literals.INFLUENZA_CASE_REPORT.getEAllOperations().get(69));
			try {
				GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (InfluenzaPHCRSocialHistorySection) query.evaluate(influenzaCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.11')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.11')
	 * @param influenzaCaseReport The receiving '<em><b>Influenza Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaCaseReport, context) }),
						 new Object [] { influenzaCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaCaseReportOperations