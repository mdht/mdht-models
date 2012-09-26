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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util.MeningococcalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeningococcalCaseReportImpl extends PublicHealthCaseReportImpl implements MeningococcalCaseReport
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MeningococcalCaseReportImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateMeningococcalCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Meningococcal')";
		/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT);
			try {
				VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_TITLE,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalCaseReportTitle"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Meningococcal Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))";
		/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Meningococcal Phcr Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT);
			try {
				VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalCaseReportMeningococcalPhcrClinicalInformationSection"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Meningococcal Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))";
		/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Report Meningococcal Phcr Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT);
			try {
				VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #getMeningococcalPhcrClinicalInformationSection() <em>Get Meningococcal Phcr Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalPhcrClinicalInformationSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(meningococcal::MeningococcalPhcrClinicalInformationSection)";
		/**
	 * The cached OCL query for the '{@link #getMeningococcalPhcrClinicalInformationSection() <em>Get Meningococcal Phcr Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalPhcrClinicalInformationSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalPhcrClinicalInformationSection getMeningococcalPhcrClinicalInformationSection() {
		if (GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT, MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT.getEAllOperations().get(62));
			try {
				GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (MeningococcalPhcrClinicalInformationSection) query.evaluate(this);
	}

		/**
	 * The cached OCL expression body for the '{@link #getMeningococcalPhcrRelevantDxTestsSection() <em>Get Meningococcal Phcr Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalPhcrRelevantDxTestsSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(meningococcal::MeningococcalPhcrRelevantDxTestsSection)";
		/**
	 * The cached OCL query for the '{@link #getMeningococcalPhcrRelevantDxTestsSection() <em>Get Meningococcal Phcr Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalPhcrRelevantDxTestsSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalPhcrRelevantDxTestsSection getMeningococcalPhcrRelevantDxTestsSection() {
		if (GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT, MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT.getEAllOperations().get(63));
			try {
				GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (MeningococcalPhcrRelevantDxTestsSection) query.evaluate(this);
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.15')";
		/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public MeningococcalCaseReport init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MeningococcalCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MeningococcalCaseReportImpl
