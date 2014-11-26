/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Summary Of Care Record</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Care Planning</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Vital Signs</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveFunctionalStatusSection()
 * <em>Retrieve Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveHospitalDischargeDiagnosisSection()
 * <em>Retrieve Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostoperativeDiagnosisSection()
 * <em>Retrieve Postoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostprocedureDiagnosisSection()
 * <em>Retrieve Postprocedure Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getFunctionalStatusSection()
 * <em>Get Functional Status Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SummaryOfCareRecordOperations extends
		GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SummaryOfCareRecordOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordCarePlanning(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Care Planning</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordCarePlanning(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PlanOfCareSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordCarePlanning(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Care Planning</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordCarePlanning(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordCarePlanning(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_CARE_PLANNING,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordCarePlanning"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordVitalSigns(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Vital Signs</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordVitalSigns(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordVitalSigns(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Vital Signs</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordVitalSigns(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordVitalSigns(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_VITAL_SIGNS,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordVitalSigns"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Problem Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Problem Section</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordProblemSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordProblemSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordProblemSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordAllergiesSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Allergies Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordAllergiesSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordAllergiesSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Allergies Section</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordAllergiesSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordAllergiesSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordAllergiesSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordImmunizationsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Immunizations Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordImmunizationsSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordImmunizationsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Immunizations Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordImmunizationsSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordImmunizationsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordImmunizationsSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Social History Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Social History Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordSocialHistorySection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordSocialHistorySection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordSocialHistorySection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Results Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Results Section</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordResultsSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ResultsSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordResultsSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_RESULTS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordResultsSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Procedures Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Procedures Section</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordProceduresSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ProceduresSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordProceduresSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordProceduresSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSummaryOfCareRecordFunctionalStatusSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Functional Status Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordFunctionalStatusSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateSummaryOfCareRecordFunctionalStatusSection(SummaryOfCareRecord, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Summary Of Care Record Functional Status Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSummaryOfCareRecordFunctionalStatusSection(SummaryOfCareRecord,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::FunctionalStatusSection))
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSummaryOfCareRecordFunctionalStatusSection(
			SummaryOfCareRecord summaryOfCareRecord,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD);
			try {
				VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(summaryOfCareRecord)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.SUMMARY_OF_CARE_RECORD__SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("SummaryOfCareRecordFunctionalStatusSection"),
								new Object[] { summaryOfCareRecord }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrieveFunctionalStatusSection(SummaryOfCareRecord)
	 * <em>Retrieve Functional Status Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveFunctionalStatusSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrieveFunctionalStatusSection(SummaryOfCareRecord)
	 * <em>Retrieve Functional Status Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveFunctionalStatusSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::FunctionalStatusSection
	 * ))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection retrieveFunctionalStatusSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(305));
			try {
				RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(RETRIEVE_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrieveHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Hospital Discharge Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrieveHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Hospital Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveHospitalDischargeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeDiagnosisSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeDiagnosisSection retrieveHospitalDischargeDiagnosisSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(306));
			try {
				RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(RETRIEVE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalDischargeDiagnosisSection) query
				.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrievePostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Postoperative Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PostoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrievePostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Postoperative Diagnosis Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePostoperativeDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::PostoperativeDiagnosisSection
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PostoperativeDiagnosisSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PostoperativeDiagnosisSection retrievePostoperativeDiagnosisSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(307));
			try {
				RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(RETRIEVE_POSTOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostoperativeDiagnosisSection) query
				.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrievePostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Postprocedure Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrievePostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * <em>Retrieve Postprocedure Diagnosis Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePostprocedureDiagnosisSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::PostprocedureDiagnosisSection
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PostprocedureDiagnosisSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PostprocedureDiagnosisSection retrievePostprocedureDiagnosisSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(308));
			try {
				RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(RETRIEVE_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostprocedureDiagnosisSection) query
				.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getProblemSection(SummaryOfCareRecord)
	 * <em>Get Problem Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProblemSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getProblemSection(SummaryOfCareRecord)
	 * <em>Get Problem Section</em>}' query operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProblemSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProblemSection))-
	 * >asSequence()->any(true).oclAsType(consol::ProblemSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(309));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper
						.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getAllergiesSection(SummaryOfCareRecord)
	 * <em>Get Allergies Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAllergiesSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getAllergiesSection(SummaryOfCareRecord)
	 * <em>Get Allergies Section</em>}' query operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAllergiesSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection)
	 * )->asSequence()->any(true).oclAsType(consol::AllergiesSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(310));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper
						.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getImmunizationsSection(SummaryOfCareRecord)
	 * <em>Get Immunizations Section</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getImmunizationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getImmunizationsSection(SummaryOfCareRecord)
	 * <em>Get Immunizations Section</em>}' query operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImmunizationsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ImmunizationsSection getImmunizationsSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(311));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper
						.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getSocialHistorySection(SummaryOfCareRecord)
	 * <em>Get Social History Section</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(SummaryOfCareRecord)
	 * <em>Get Social History Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(312));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper
						.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getResultsSection(SummaryOfCareRecord)
	 * <em>Get Results Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResultsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getResultsSection(SummaryOfCareRecord)
	 * <em>Get Results Section</em>}' query operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResultsSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ResultsSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(313));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper
						.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getProceduresSection(SummaryOfCareRecord)
	 * <em>Get Procedures Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProceduresSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getProceduresSection(SummaryOfCareRecord)
	 * <em>Get Procedures Section</em>}' query operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getProceduresSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ProceduresSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(314));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper
						.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(summaryOfCareRecord);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getFunctionalStatusSection(SummaryOfCareRecord)
	 * <em>Get Functional Status Section</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionalStatusSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getFunctionalStatusSection(SummaryOfCareRecord)
	 * <em>Get Functional Status Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFunctionalStatusSection(SummaryOfCareRecord)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::FunctionalStatusSection
	 * ))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)
	 * 
	 * @param summaryOfCareRecord
	 *            The receiving '<em><b>Summary Of Care Record</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection getFunctionalStatusSection(
			SummaryOfCareRecord summaryOfCareRecord) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD,
					Mu2consolPackage.Literals.SUMMARY_OF_CARE_RECORD
							.getEAllOperations().get(315));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper
						.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(summaryOfCareRecord);
	}

} // SummaryOfCareRecordOperations