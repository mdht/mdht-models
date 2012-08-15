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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrSocialHistorySection() <em>Get Anthrax Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrClinicalInformationSection() <em>Get Anthrax Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrTreatmentInformationSection() <em>Get Anthrax Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrRelevantDxTestsSection() <em>Get Anthrax Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthraxCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxCaseReportTitle(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportTitle(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Anthrax')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxCaseReportTitle(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportTitle(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Anthrax')
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxCaseReportTitle(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_TITLE,
						 AnthraxPlugin.INSTANCE.getString("AnthraxCaseReportTitle"),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION,
						 AnthraxPlugin.INSTANCE.getString("AnthraxCaseReportAnthraxPhcrClinicalInformationSection"),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION,
						 AnthraxPlugin.INSTANCE.getString("AnthraxCaseReportAnthraxPhcrRelevantDxTestsSection"),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION,
						 AnthraxPlugin.INSTANCE.getString("AnthraxCaseReportAnthraxPhcrSocialHistorySection"),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION,
						 AnthraxPlugin.INSTANCE.getString("AnthraxCaseReportAnthraxPhcrTreatmentInformationSection"),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrClinicalInformationSection)
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AnthraxPhcrClinicalInformationSection getAnthraxPhcrClinicalInformationSection(AnthraxCaseReport anthraxCaseReport) {
		if (GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT, AnthraxPackage.Literals.ANTHRAX_CASE_REPORT.getEAllOperations().get(66));
			try {
				GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (AnthraxPhcrClinicalInformationSection) query.evaluate(anthraxCaseReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrRelevantDxTestsSection)
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AnthraxPhcrRelevantDxTestsSection getAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport anthraxCaseReport) {
		if (GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT, AnthraxPackage.Literals.ANTHRAX_CASE_REPORT.getEAllOperations().get(68));
			try {
				GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (AnthraxPhcrRelevantDxTestsSection) query.evaluate(anthraxCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnthraxPhcrSocialHistorySection(AnthraxCaseReport) <em>Get Anthrax Phcr Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrSocialHistorySection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getAnthraxPhcrSocialHistorySection(AnthraxCaseReport) <em>Get Anthrax Phcr Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrSocialHistorySection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getAnthraxPhcrClinicalInformationSection(AnthraxCaseReport) <em>Get Anthrax Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrClinicalInformationSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrClinicalInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getAnthraxPhcrClinicalInformationSection(AnthraxCaseReport) <em>Get Anthrax Phcr Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrClinicalInformationSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrSocialHistorySection)
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AnthraxPhcrSocialHistorySection getAnthraxPhcrSocialHistorySection(AnthraxCaseReport anthraxCaseReport) {
		if (GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT, AnthraxPackage.Literals.ANTHRAX_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (AnthraxPhcrSocialHistorySection) query.evaluate(anthraxCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport) <em>Get Anthrax Phcr Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrTreatmentInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport) <em>Get Anthrax Phcr Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport) <em>Get Anthrax Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrRelevantDxTestsSection)";

	/**
	 * The cached OCL query for the '{@link #getAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport) <em>Get Anthrax Phcr Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))->asSequence()->first().oclAsType(anthrax::AnthraxPhcrTreatmentInformationSection)
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AnthraxPhcrTreatmentInformationSection getAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport anthraxCaseReport) {
		if (GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT, AnthraxPackage.Literals.ANTHRAX_CASE_REPORT.getEAllOperations().get(67));
			try {
				GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (AnthraxPhcrTreatmentInformationSection) query.evaluate(anthraxCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(AnthraxCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.3')
	 * @param anthraxCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePublicHealthCaseReportTemplateId(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxCaseReport, context) }),
						 new Object [] { anthraxCaseReport }));
			}
			return false;
		}
		return true;
	}

} // AnthraxCaseReportOperations