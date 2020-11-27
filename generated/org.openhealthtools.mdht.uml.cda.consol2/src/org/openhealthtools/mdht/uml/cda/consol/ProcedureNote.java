/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections ProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent ProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection ProcedureNoteSectionTitles GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP ProcedureNoteComplicationsSection ProcedureNotePostprocedureDiagnosisSection ProcedureNoteProcedureDescriptionSection ProcedureNoteProcedureIndicationsSection ProcedureNoteDocumentationOf ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode ProcedureNoteComponentOfEncompassingEncounter5Code ProcedureNoteComponentOfEncompassingEncounter5Location ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity ProcedureNoteDocumentationOfServiceEvent1ProcedureCodes ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth ProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay ProcedureNoteDocumentationOfServiceEvent1Code ProcedureNoteDocumentationOfServiceEvent1EffectiveTime ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer ProcedureNoteDocumentationOfServiceEvent1' templateId.root='2.16.840.1.113883.10.20.22.1.6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.warning='ProcedureNoteComponentOf ProcedureNoteComponentOfEncompassingEncounter5 ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP ProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute ProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='ProcedureNoteAssessmentSection ProcedureNotePlanOfCareSection ProcedureNoteAssessmentAndPlanSection ProcedureNoteAllergiesSectionEntriesOptional ProcedureNoteAnesthesiaSection ProcedureNoteChiefComplaintSection ProcedureNoteChiefComplaintAndReasonForVisitSection ProcedureNoteFamilyHistorySection ProcedureNoteHistoryOfPastIllnessSection ProcedureNoteHistoryOfPresentIllnessSection ProcedureNoteMedicalHistorySection ProcedureNoteMedicationsSectionEntriesOptional ProcedureNoteMedicationsAdministeredSection ProcedureNotePhysicalExamSection ProcedureNotePlannedProcedureSection ProcedureNoteProcedureDispositionSection ProcedureNoteProcedureEstimatedBloodLossSection ProcedureNoteProcedureFindingsSection ProcedureNoteProcedureImplantsSection ProcedureNoteProcedureSpecimensTakenSection ProcedureNoteProceduresSectionEntriesOptional ProcedureNoteReasonForVisitSection ProcedureNoteReviewOfSystemsSection ProcedureNoteSocialHistorySection ProcedureNoteParticipant1 ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant ProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond' constraints.validation.query='ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode ProcedureNoteComponentOfEncompassingEncounter5Code ProcedureNoteComponentOfEncompassingEncounter5Location ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant ProcedureNoteComponentOfEncompassingEncounter5 ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity ProcedureNoteDocumentationOfServiceEvent1ProcedureCodes ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth ProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay ProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute ProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond ProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset ProcedureNoteDocumentationOfServiceEvent1Code ProcedureNoteDocumentationOfServiceEvent1EffectiveTime ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer ProcedureNoteDocumentationOfServiceEvent1' constraints.validation.dependOn.ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteComponentOf constraints.validation.warning='ProcedureNoteComponentOfEncompassingEncounter5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteComponentOfEncompassingEncounter5 constraints.validation.error='ProcedureNoteComponentOfEncompassingEncounter5Code ProcedureNoteComponentOfEncompassingEncounter5Location ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode' constraints.validation.info='ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant' constraints.validation.query='ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteComponentOfEncompassingEncounter5Location constraints.validation.error='ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility constraints.validation.error='ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant typeCode='REF' constraints.validation.error='ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteDocumentationOf constraints.validation.error='ProcedureNoteDocumentationOfServiceEvent1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteDocumentationOfServiceEvent1 constraints.validation.error='ProcedureNoteDocumentationOfServiceEvent1ProcedureCodes ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth ProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth ProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay ProcedureNoteDocumentationOfServiceEvent1Code ProcedureNoteDocumentationOfServiceEvent1EffectiveTime ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode ServiceEvent1ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity' constraints.validation.warning='ProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute ProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP' constraints.validation.info='ProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond' constraints.validation.query='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode ServiceEvent1ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity' constraints.validation.dependOn.ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer typeCode='PPRF' constraints.validation.error='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode' constraints.validation.warning='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode='ProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProcedureNote extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;forAll(section : cda::Section | not section.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureNoteSectionTitles(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))'"
	 * @generated
	 */
	boolean validateProcedureNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteAssessmentAndPlanSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteComplicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection))'"
	 * @generated
	 */
	boolean validateProcedureNotePostprocedureDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureDescriptionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureIndicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProcedureNoteAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteAnesthesiaSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))'"
	 * @generated
	 */
	boolean validateProcedureNoteFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteHistoryOfPastIllnessSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalHistorySection))'"
	 * @generated
	 */
	boolean validateProcedureNoteMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProcedureNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteMedicationsAdministeredSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))'"
	 * @generated
	 */
	boolean validateProcedureNotePhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))'"
	 * @generated
	 */
	boolean validateProcedureNotePlannedProcedureSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureFindingsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureImplantsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))'"
	 * @generated
	 */
	boolean validateProcedureNoteProceduresSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteReasonForVisitSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))'"
	 * @generated
	 */
	boolean validateProcedureNoteReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))'"
	 * @generated
	 */
	boolean validateProcedureNoteSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateProcedureNoteParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).location-&gt;excluding(null).healthCareFacility-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).location-&gt;excluding(null)-&gt;reject(healthCareFacility-&gt;exists(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).encounterParticipant-&gt;excluding(null)-&gt;select(typeCode = vocab::x_EncounterParticipant::REF)-&gt;select(typeCode = vocab::x_EncounterParticipant::REF)-&gt;reject(typeCode=vocab::x_EncounterParticipant::REF)'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(location-&gt;exists(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5Location(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(encounterParticipant-&gt;select(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant))-&gt;select(typeCode = vocab::x_EncounterParticipant::REF)-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null)-&gt;reject(encompassingEncounter-&gt;one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateProcedureNoteComponentOfEncompassingEncounter5(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(code.codeSystem = \'2.16.840.1.113883.6.104\' or code.codeSystem = \'2.16.840.1.113883.6.12\' or code.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(not effectiveTime.low.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 8) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 8))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 12) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 12))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() implies effectiveTime.low.value.size() &gt;= 14) and (not effectiveTime.high.value.oclIsUndefined() implies effectiveTime.high.value.size() &gt;= 14))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((not effectiveTime.low.value.oclIsUndefined() and effectiveTime.low.value.size() &gt; 8 implies effectiveTime.low.value.size() &gt;= 15) and (not effectiveTime.high.value.oclIsUndefined() and effectiveTime.high.value.size() &gt; 8 implies effectiveTime.high.value.size() &gt;= 15))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null)-&gt;reject(serviceEvent-&gt;one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateProcedureNoteDocumentationOfServiceEvent1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentSection)'"
	 * @generated
	 */
	AssessmentSection getAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfCareSection)'"
	 * @generated
	 */
	PlanOfCareSection getPlanOfCareSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentAndPlanSection)'"
	 * @generated
	 */
	AssessmentAndPlanSection getAssessmentAndPlanSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ComplicationsSection)'"
	 * @generated
	 */
	ComplicationsSection getComplicationsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PostprocedureDiagnosisSection)'"
	 * @generated
	 */
	PostprocedureDiagnosisSection getPostprocedureDiagnosisSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureDescriptionSection)'"
	 * @generated
	 */
	ProcedureDescriptionSection getProcedureDescriptionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureIndicationsSection)'"
	 * @generated
	 */
	ProcedureIndicationsSection getProcedureIndicationsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AnesthesiaSection)'"
	 * @generated
	 */
	AnesthesiaSection getAnesthesiaSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ChiefComplaintSection)'"
	 * @generated
	 */
	ChiefComplaintSection getChiefComplaintSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)'"
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::FamilyHistorySection)'"
	 * @generated
	 */
	FamilyHistorySection getFamilyHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPastIllnessSection)'"
	 * @generated
	 */
	HistoryOfPastIllnessSection getHistoryOfPastIllnessSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPresentIllnessSection)'"
	 * @generated
	 */
	HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalHistorySection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicalHistorySection)'"
	 * @generated
	 */
	MedicalHistorySection getMedicalHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsSectionEntriesOptional)'"
	 * @generated
	 */
	MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsAdministeredSection)'"
	 * @generated
	 */
	MedicationsAdministeredSection getMedicationsAdministeredSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PhysicalExamSection)'"
	 * @generated
	 */
	PhysicalExamSection getPhysicalExamSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlannedProcedureSection)'"
	 * @generated
	 */
	PlannedProcedureSection getPlannedProcedureSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureDispositionSection)'"
	 * @generated
	 */
	ProcedureDispositionSection getProcedureDispositionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureEstimatedBloodLossSection)'"
	 * @generated
	 */
	ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureFindingsSection)'"
	 * @generated
	 */
	ProcedureFindingsSection getProcedureFindingsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureImplantsSection)'"
	 * @generated
	 */
	ProcedureImplantsSection getProcedureImplantsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureSpecimensTakenSection)'"
	 * @generated
	 */
	ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProceduresSectionEntriesOptional)'"
	 * @generated
	 */
	ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReasonForVisitSection)'"
	 * @generated
	 */
	ReasonForVisitSection getReasonForVisitSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReviewOfSystemsSection)'"
	 * @generated
	 */
	ReviewOfSystemsSection getReviewOfSystemsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SocialHistorySection)'"
	 * @generated
	 */
	SocialHistorySection getSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureNote
