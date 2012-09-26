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
package org.openhealthtools.mdht.uml.cda.phcr.hib.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;



import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>HIB Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#validateHIBCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#validateHIBCaseReportHibPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#validateHIBCaseReportHibPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#getHibPhcrClinicalInformationSection() <em>Get Hib Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#getHibPhcrRelevantDxTestsSection() <em>Get Hib Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIBCaseReportOperations extends PublicHealthCaseReportOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HIBCaseReportOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHIBCaseReportTitle(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportTitle(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Haemophilus Influenzae Type B')";

		/**
	 * The cached OCL invariant for the '{@link #validateHIBCaseReportTitle(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportTitle(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Haemophilus Influenzae Type B')
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHIBCaseReportTitle(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_REPORT);
			try {
				VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_REPORT__HIB_CASE_REPORT_TITLE,
						 HibPlugin.INSTANCE.getString("HIBCaseReportTitle"),
						 new Object [] { hibCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))";

		/**
	 * The cached OCL invariant for the '{@link #validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_REPORT);
			try {
				VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_REPORT__HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION,
						 HibPlugin.INSTANCE.getString("HIBCaseReportHibPhcrClinicalInformationSection"),
						 new Object [] { hibCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))";

		/**
	 * The cached OCL invariant for the '{@link #validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIB Case Report Hib Phcr Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_REPORT);
			try {
				VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_REPORT__HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION,
						 HibPlugin.INSTANCE.getString("HIBCaseReportHibPhcrRelevantDxTestsSection"),
						 new Object [] { hibCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #getHibPhcrClinicalInformationSection(HIBCaseReport) <em>Get Hib Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibPhcrClinicalInformationSection(HIBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))->asSequence()->any(true).oclAsType(hib::HibPhcrClinicalInformationSection )";

		/**
	 * The cached OCL query for the '{@link #getHibPhcrClinicalInformationSection(HIBCaseReport) <em>Get Hib Phcr Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibPhcrClinicalInformationSection(HIBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))->asSequence()->any(true).oclAsType(hib::HibPhcrClinicalInformationSection )
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HibPhcrClinicalInformationSection getHibPhcrClinicalInformationSection(HIBCaseReport hibCaseReport) {
		if (GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_CASE_REPORT, HibPackage.Literals.HIB_CASE_REPORT.getEAllOperations().get(62));
			try {
				GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (HibPhcrClinicalInformationSection) query.evaluate(hibCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #getHibPhcrRelevantDxTestsSection(HIBCaseReport) <em>Get Hib Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibPhcrRelevantDxTestsSection(HIBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(hib::HibPhcrRelevantDxTestsSection)";

		/**
	 * The cached OCL query for the '{@link #getHibPhcrRelevantDxTestsSection(HIBCaseReport) <em>Get Hib Phcr Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibPhcrRelevantDxTestsSection(HIBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(hib::HibPhcrRelevantDxTestsSection)
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HibPhcrRelevantDxTestsSection getHibPhcrRelevantDxTestsSection(HIBCaseReport hibCaseReport) {
		if (GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_CASE_REPORT, HibPackage.Literals.HIB_CASE_REPORT.getEAllOperations().get(63));
			try {
				GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (HibPhcrRelevantDxTestsSection) query.evaluate(hibCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.14')";

  /**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(HIBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.14')
	 * @param hibCaseReport The receiving '<em><b>HIB Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validatePublicHealthCaseReportTemplateId(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibCaseReport, context) }),
						 new Object [] { hibCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // HIBCaseReportOperations