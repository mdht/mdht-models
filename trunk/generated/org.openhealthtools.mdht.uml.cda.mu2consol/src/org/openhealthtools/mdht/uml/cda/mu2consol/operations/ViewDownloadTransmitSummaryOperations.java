/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>View Download Transmit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryCarePlanFields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Plan Fields</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#retrievePreoperativeDiagnosisSection() <em>Retrieve Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewDownloadTransmitSummaryOperations extends
		GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDownloadTransmitSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryCarePlanFields(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Plan Fields</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryCarePlanFields(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryCarePlanFields(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Plan Fields</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryCarePlanFields(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryCarePlanFields(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryCarePlanFields"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryAllergiesSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryAllergiesSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryMedicationsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Medications Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMedicationsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryMedicationsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMedicationsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryMedicationsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryMedicationsSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryProblemSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryProblemSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ProceduresSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryProceduresSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryProceduresSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryVitalSignsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryVitalSignsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryVitalSignsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryVitalSignsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryVitalSignsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryVitalSignsSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ResultsSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryResultsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryResultsSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryPlanOfCareSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryPlanOfCareSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryPlanOfCareSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryPlanOfCareSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryPlanOfCareSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryPlanOfCareSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummarySocialHistorySection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummarySocialHistorySection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Assessment And Plan Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAssessmentAndPlanSection()->excluding(null)->reject(getAssessmentAndPlanSection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.9'))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Assessment And Plan Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAssessmentAndPlanSection()->excluding(null)->reject(
	 * getAssessmentAndPlanSection().templateId->exists(id : datatypes::II |
	 * id.root = '2.16.840.1.113883.10.20.22.2.9'))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getPlanOfCareSection().getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PlanOfCareActivityAct)) or
	 * getPlanOfCareSection().getObservations()->exists(o : cda::Observation |
	 * o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or
	 * getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter |
	 * e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation)))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10'))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.10'))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryPlanOfCareSectionTemplateId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17'))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSocialHistorySection()->excluding(null)->reject(
	 * getSocialHistorySection().templateId->exists(id : datatypes::II | id.root
	 * = '2.16.840.1.113883.10.20.22.2.17'))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummarySocialHistorySectionTemplateId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Social History Section Smoking Status Observation</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(mu2consol::SmokingStatusObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Social History Section Smoking Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSocialHistorySection()->excluding(null)->reject(
	 * getSocialHistorySection().entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(mu2consol::SmokingStatusObservation)))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(viewDownloadTransmitSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary) <em>Retrieve Preoperative Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PreoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary) <em>Retrieve Preoperative Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PreoperativeDiagnosisSection)
	 * @param viewDownloadTransmitSummary The receiving '<em><b>View Download Transmit Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PreoperativeDiagnosisSection retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(311));
			try {
				RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PreoperativeDiagnosisSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(ViewDownloadTransmitSummary) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllergiesSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(ViewDownloadTransmitSummary) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ViewDownloadTransmitSummary)
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
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(312));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ViewDownloadTransmitSummary) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ViewDownloadTransmitSummary) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getMedicationsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsSection getMedicationsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(313));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ViewDownloadTransmitSummary) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProblemSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ViewDownloadTransmitSummary) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ViewDownloadTransmitSummary)
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
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(314));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ViewDownloadTransmitSummary) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProceduresSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ViewDownloadTransmitSummary) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getProceduresSection(ViewDownloadTransmitSummary)
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
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(315));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ViewDownloadTransmitSummary) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ViewDownloadTransmitSummary) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection
	 * ))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static VitalSignsSection getVitalSignsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(316));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ViewDownloadTransmitSummary) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getResultsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ViewDownloadTransmitSummary) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ViewDownloadTransmitSummary)
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
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(317));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ViewDownloadTransmitSummary) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getAssessmentAndPlanSection(ViewDownloadTransmitSummary)
	 * <em>Get Assessment And Plan Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssessmentAndPlanSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection
	 * ))->asSequence()->any
	 * (true).oclAsType(mu2consol::AssessmentAndPlanSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection getAssessmentAndPlanSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(318));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ViewDownloadTransmitSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ViewDownloadTransmitSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(319));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ViewDownloadTransmitSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(ViewDownloadTransmitSummary)
	 * <em>Get Social History Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(ViewDownloadTransmitSummary)
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
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(320));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(viewDownloadTransmitSummary);
	}

} // ViewDownloadTransmitSummaryOperations