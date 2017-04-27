/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary;
import org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Medications Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Problem Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Procedures Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Results Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Vital Signs Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Planof Care Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Functional Status Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Encounters Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getMedicationsSectionBCTPS() <em>Get Medications Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getFamilyHistorySectionBCTPS() <em>Get Family History Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getFamilyHistorySectionBCTPS2() <em>Get Family History Section BCTPS2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getProblemSectionBCTPS() <em>Get Problem Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getProceduresSectionBCTPS() <em>Get Procedures Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getResultsSectionBCTPS() <em>Get Results Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getVitalSignsSectionBCTPS() <em>Get Vital Signs Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getPlanofCareSectionBCTPS() <em>Get Planof Care Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getFunctionalStatusSectionBCTPS() <em>Get Functional Status Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#getEncountersSectionBCTPS() <em>Get Encounters Section BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalOncologyTreatmentPlanandSummaryOperations extends GeneralHeaderConstraintsOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalOncologyTreatmentPlanandSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Allergies Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Medications Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::MedicationsSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Medications Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Problem Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProblemSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Problem Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Procedures Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProceduresSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Procedures Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Results Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ResultsSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Results Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Vital Signs Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::VitalSignsSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Vital Signs Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Planof Care Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::PlanofCareSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Planof Care Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Functional Status Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FunctionalStatusSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Functional Status Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Encounters Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::EncountersSectionBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Oncology Treatment Planand Summary Encounters Section BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(311));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(
					GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Medications Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::MedicationsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::MedicationsSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Medications Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSectionBCTPS getMedicationsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_MEDICATIONS_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(312));
			try {
				GET_MEDICATIONS_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION_BCTPS__EOCL_QRY);
		return (MedicationsSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Family History Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FamilyHistorySectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Family History Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(313));
			try {
				GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_QRY = helper.createQuery(
					GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION_BCTPS__EOCL_QRY);
		return (FamilyHistorySectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary) <em>Get Family History Section BCTPS2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FamilyHistorySectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary) <em>Get Family History Section BCTPS2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySectionBCTPS2(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS2(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(314));
			try {
				GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_QRY = helper.createQuery(
					GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION_BCTPS2__EOCL_QRY);
		return (FamilyHistorySectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Problem Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProblemSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ProblemSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Problem Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSectionBCTPS getProblemSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_PROBLEM_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(315));
			try {
				GET_PROBLEM_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION_BCTPS__EOCL_QRY);
		return (ProblemSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Procedures Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProceduresSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ProceduresSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Procedures Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSectionBCTPS getProceduresSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_PROCEDURES_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(316));
			try {
				GET_PROCEDURES_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION_BCTPS__EOCL_QRY);
		return (ProceduresSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Results Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ResultsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ResultsSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Results Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSectionBCTPS getResultsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_RESULTS_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(317));
			try {
				GET_RESULTS_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION_BCTPS__EOCL_QRY);
		return (ResultsSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Vital Signs Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::VitalSignsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::VitalSignsSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Vital Signs Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionBCTPS getVitalSignsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(318));
			try {
				GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION_BCTPS__EOCL_QRY);
		return (VitalSignsSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Planof Care Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANOF_CARE_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::PlanofCareSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::PlanofCareSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Planof Care Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanofCareSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANOF_CARE_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanofCareSectionBCTPS getPlanofCareSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_PLANOF_CARE_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(319));
			try {
				GET_PLANOF_CARE_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_PLANOF_CARE_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANOF_CARE_SECTION_BCTPS__EOCL_QRY);
		return (PlanofCareSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Functional Status Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FunctionalStatusSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FunctionalStatusSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Functional Status Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSectionBCTPS getFunctionalStatusSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(320));
			try {
				GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_QRY = helper.createQuery(
					GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FUNCTIONAL_STATUS_SECTION_BCTPS__EOCL_QRY);
		return (FunctionalStatusSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Encounters Section BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION_BCTPS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::EncountersSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::EncountersSectionBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary) <em>Get Encounters Section BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSectionBCTPS(ClinicalOncologyTreatmentPlanandSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EncountersSectionBCTPS getEncountersSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary) {

		if (GET_ENCOUNTERS_SECTION_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary(),
				CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary().getEAllOperations().get(321));
			try {
				GET_ENCOUNTERS_SECTION_BCTPS__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ENCOUNTERS_SECTION_BCTPS__EOCL_QRY);
		return (EncountersSectionBCTPS) query.evaluate(clinicalOncologyTreatmentPlanandSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOncologyTreatmentPlanandSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param clinicalOncologyTreatmentPlanandSummary The receiving '<em><b>Clinical Oncology Treatment Planand Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary());
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				clinicalOncologyTreatmentPlanandSummary)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ClinicalOncologyTreatmentPlanandSummaryGeneralHeaderConstraintsTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										clinicalOncologyTreatmentPlanandSummary, context) }),
						new Object[] { clinicalOncologyTreatmentPlanandSummary }));
			}

			return false;
		}
		return true;
	}

} // ClinicalOncologyTreatmentPlanandSummaryOperations
