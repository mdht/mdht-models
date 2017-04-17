/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Oncology Treatment Planand Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getClinicalOncologyTreatmentPlanandSummary()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and Summary'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Clinical Oncology Treatment Plan and SummaryTemplateId Clinical Oncology Treatment Plan and SummaryAllergiesSectionEntriesOptional Clinical Oncology Treatment Plan and SummaryMedications Section BCTPS Clinical Oncology Treatment Plan and SummaryFamily History Section BCTPS Clinical Oncology Treatment Plan and SummaryFamily History Section BCTPS2 Clinical Oncology Treatment Plan and SummaryProblem Section BCTPS Clinical Oncology Treatment Plan and SummaryProcedures Section BCTPS Clinical Oncology Treatment Plan and SummaryResults Section BCTPS Clinical Oncology Treatment Plan and SummaryVital Signs Section BCTPS Clinical Oncology Treatment Plan and SummaryPlan of Care Section BCTPS Clinical Oncology Treatment Plan and SummaryFunctional Status Section BCTPS Clinical Oncology Treatment Plan and SummaryEncounters Section BCTPS' templateId.root='2.16.840.1.113883.10.20.30.1.1'"
 * @generated
 */
public interface ClinicalOncologyTreatmentPlanandSummary extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryAllergiesSectionEntriesOptional'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryMedications Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::MedicationsSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryFamily History Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryFamily History Section BCTPS2'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryProblem Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProblemSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryProcedures Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProceduresSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryResults Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ResultsSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryVital Signs Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::VitalSignsSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryPlan of Care Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::PlanofCareSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryFunctional Status Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FunctionalStatusSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Clinical Oncology Treatment Plan and SummaryEncounters Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::EncountersSectionBCTPS))'"
	 * @generated
	 */
	boolean validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getMedications Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::MedicationsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::MedicationsSectionBCTPS)'"
	 * @generated
	 */
	MedicationsSectionBCTPS getMedicationsSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getFamily History Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FamilyHistorySectionBCTPS)'"
	 * @generated
	 */
	FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getFamily History Section BCTPS2'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FamilyHistorySectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FamilyHistorySectionBCTPS)'"
	 * @generated
	 */
	FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getProblem Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProblemSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ProblemSectionBCTPS)'"
	 * @generated
	 */
	ProblemSectionBCTPS getProblemSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getProcedures Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ProceduresSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ProceduresSectionBCTPS)'"
	 * @generated
	 */
	ProceduresSectionBCTPS getProceduresSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getResults Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::ResultsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::ResultsSectionBCTPS)'"
	 * @generated
	 */
	ResultsSectionBCTPS getResultsSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getVital Signs Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::VitalSignsSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::VitalSignsSectionBCTPS)'"
	 * @generated
	 */
	VitalSignsSectionBCTPS getVitalSignsSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getPlan of Care Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::PlanofCareSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::PlanofCareSectionBCTPS)'"
	 * @generated
	 */
	PlanofCareSectionBCTPS getPlanofCareSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getFunctional Status Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::FunctionalStatusSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::FunctionalStatusSectionBCTPS)'"
	 * @generated
	 */
	FunctionalStatusSectionBCTPS getFunctionalStatusSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getEncounters Section BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(clondata::EncountersSectionBCTPS))->asSequence()->any(true).oclAsType(clondata::EncountersSectionBCTPS)'"
	 * @generated
	 */
	EncountersSectionBCTPS getEncountersSectionBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalOncologyTreatmentPlanandSummary init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalOncologyTreatmentPlanandSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ClinicalOncologyTreatmentPlanandSummary
