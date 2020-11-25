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
 * A representation of the model object '<em><b>Procedure Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureNote2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='USRealmHeader2TemplateId ProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2 ProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent ProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection ProcedureNote2Code ProcedureNote2CodeP ProcedureNote2DocumentationOf ProcedureNote2ComplicationsSection2 ProcedureNote2ProcedureDescriptionSection ProcedureNote2ProcedureIndicationsSection2 ProcedureNote2PostprocedureDiagnosisSection2 ProcedureNote2ParticipantAssociatedEntityClassCode ProcedureNote2ParticipantAssociatedEntityAssociatedPerson ProcedureNote2ParticipantTypeCode ProcedureNote2ParticipantFunctionCode ProcedureNote2ParticipantFunctionCodeP ProcedureNote2ParticipantAssociatedEntity ProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity ProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth ProcedureNote2DocumentationOfServiceEventProcedureCodes ProcedureNote2DocumentationOfServiceEventEffectiveTime ProcedureNote2DocumentationOfServiceEventCode ProcedureNote2DocumentationOfServiceEventPerformer ProcedureNote2DocumentationOfServiceEvent ProcedureNote2AuthorizationConsentClassCode ProcedureNote2AuthorizationConsentMoodCode ProcedureNote2AuthorizationConsentStatusCode ProcedureNote2AuthorizationTypeCode ProcedureNote2AuthorizationConsent ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility ProcedureNote2ComponentOfEncompassingEncounterCode ProcedureNote2ComponentOfEncompassingEncounterLocation ProcedureNote2ComponentOfEncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.6' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ProcedureNote2Code='ProcedureNote2CodeP' constraints.validation.info='ProcedureNote2Participant ProcedureNote2Authorization ProcedureNote2AssessmentSection ProcedureNote2AssessmentAndPlanSection2 ProcedureNote2PlanOfTreatmentSection2 ProcedureNote2AllergiesSectionEntriesOptional2 ProcedureNote2AnesthesiaSection2 ProcedureNote2ChiefComplaintSection ProcedureNote2ChiefComplaintAndReasonForVisitSection ProcedureNote2FamilyHistorySection2 ProcedureNote2HistoryOfPastIllnessSection2 ProcedureNote2HistoryOfPresentIllnessSection ProcedureNote2MedicalHistorySection ProcedureNote2MedicationsSectionEntriesOptional2 ProcedureNote2MedicationsAdministeredSection2 ProcedureNote2PhysicalExamSection2 ProcedureNote2PlannedProcedureSection2 ProcedureNote2ProcedureDispositionSection ProcedureNote2ProcedureEstimatedBloodLossSection ProcedureNote2ProcedureFindingsSection2 ProcedureNote2ProcedureImplantsSection ProcedureNote2ProcedureSpecimensTakenSection ProcedureNote2ProceduresSectionEntriesOptional2 ProcedureNote2ReasonForVisitSection ProcedureNote2ReviewOfSystemsSection ProcedureNote2SocialHistorySection2 ProcedureNote2DocumentationOfServiceEventPerformerAssistants ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant' constraints.validation.warning='ProcedureNote2ComponentOf ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP ProcedureNote2ComponentOfEncompassingEncounterId' constraints.validation.query='ProcedureNote2ParticipantAssociatedEntityClassCode ProcedureNote2ParticipantAssociatedEntityAssociatedPerson ProcedureNote2ParticipantTypeCode ProcedureNote2ParticipantFunctionCode ProcedureNote2ParticipantFunctionCodeP ProcedureNote2ParticipantAssociatedEntity ProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity ProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth ProcedureNote2DocumentationOfServiceEventProcedureCodes ProcedureNote2DocumentationOfServiceEventEffectiveTime ProcedureNote2DocumentationOfServiceEventCode ProcedureNote2DocumentationOfServiceEventPerformer ProcedureNote2DocumentationOfServiceEventPerformerAssistants ProcedureNote2DocumentationOfServiceEvent ProcedureNote2AuthorizationConsentClassCode ProcedureNote2AuthorizationConsentMoodCode ProcedureNote2AuthorizationConsentStatusCode ProcedureNote2AuthorizationTypeCode ProcedureNote2AuthorizationConsent ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility ProcedureNote2ComponentOfEncompassingEncounterId ProcedureNote2ComponentOfEncompassingEncounterCode ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant ProcedureNote2ComponentOfEncompassingEncounterLocation ProcedureNote2ComponentOfEncompassingEncounter' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2Participant typeCode='IND' constraints.validation.error='ProcedureNote2ParticipantTypeCode ProcedureNote2ParticipantFunctionCode ProcedureNote2ParticipantFunctionCodeP ProcedureNote2ParticipantAssociatedEntity' functionCode.code='PCP' functionCode.codeSystem='2.16.840.1.113883.5.88' functionCode.codeSystemName='ParticipationFunction' functionCode.displayName='Primary Care Physician'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ParticipantAssociatedEntity classCode='PROV' constraints.validation.error='ProcedureNote2ParticipantAssociatedEntityClassCode ProcedureNote2ParticipantAssociatedEntityAssociatedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOf constraints.validation.error='ProcedureNote2DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEvent constraints.validation.error='ProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth ProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth ProcedureNote2DocumentationOfServiceEventProcedureCodes ProcedureNote2DocumentationOfServiceEventEffectiveTime ProcedureNote2DocumentationOfServiceEventCode ProcedureNote2DocumentationOfServiceEventPerformer ServiceEventProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerTypeCode ServiceEventProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ServiceEventProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity' constraints.validation.info='ProcedureNote2DocumentationOfServiceEventPerformerAssistants' constraints.validation.query='ServiceEventProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerTypeCode ServiceEventProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ServiceEventProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity' constraints.validation.warning='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEventPerformer typeCode='PPRF' constraints.validation.error='ProcedureNote2DocumentationOfServiceEventPerformerTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode' constraints.validation.warning='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDT constraints.validation.error='ProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEventPerformerAssistants typeCode='SPRF' constraints.validation.error='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode' constraints.validation.warning='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP' constraints.validation.dependOn.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode='ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2Authorization typeCode='AUTH' constraints.validation.error='ProcedureNote2AuthorizationTypeCode ProcedureNote2AuthorizationConsent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2AuthorizationConsent classCode='CONS' constraints.validation.error='ProcedureNote2AuthorizationConsentClassCode ProcedureNote2AuthorizationConsentMoodCode ProcedureNote2AuthorizationConsentStatusCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ComponentOf constraints.validation.error='ProcedureNote2ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ComponentOfEncompassingEncounter constraints.validation.warning='ProcedureNote2ComponentOfEncompassingEncounterId' constraints.validation.error='ProcedureNote2ComponentOfEncompassingEncounterCode ProcedureNote2ComponentOfEncompassingEncounterLocation' constraints.validation.info='ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant typeCode='REF' constraints.validation.error='ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ComponentOfEncompassingEncounterLocation constraints.validation.error='ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility constraints.validation.error='ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProcedureNote2 extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
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
	boolean validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'28570-0\' or value.code = \'11505-5\' or value.code = \'18744-3\' or value.code = \'18745-0\' or value.code = \'18746-8\' or value.code = \'18751-8\' or value.code = \'18753-4\' or value.code = \'18836-7\' or value.code = \'28577-5\' or value.code = \'28625-2\' or value.code = \'29757-2\' or value.code = \'33721-2\' or value.code = \'34121-4\' or value.code = \'34896-1\' or value.code = \'34899-5\' or value.code = \'47048-4\' or value.code = \'48807-2\'))'"
	 * @generated
	 */
	boolean validateProcedureNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validateProcedureNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2DocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))'"
	 * @generated
	 */
	boolean validateProcedureNote2Authorization(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2ComplicationsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ProcedureDescriptionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2ProcedureIndicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2PostprocedureDiagnosisSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2AssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2AssessmentAndPlanSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateProcedureNote2AllergiesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2AnesthesiaSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2FamilyHistorySection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2HistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2HistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2MedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateProcedureNote2MedicationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2MedicationsAdministeredSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2PhysicalExamSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2PlannedProcedureSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ProcedureDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2ProcedureFindingsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ProcedureImplantsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateProcedureNote2ProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2ReasonForVisitSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))'"
	 * @generated
	 */
	boolean validateProcedureNote2SocialHistorySection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null)-&gt;reject(classCode=vocab::RoleClassAssociative::PROV)'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null)-&gt;reject(associatedPerson-&gt;one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;reject(typeCode=vocab::ParticipationType::IND)'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in \nvalue.code = \'PCP\' and value.codeSystem = \'2.16.840.1.113883.5.88\'))'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantFunctionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantFunctionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;select(typeCode = vocab::ParticipationType::IND)-&gt;reject(associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateProcedureNote2ParticipantAssociatedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;reject(typeCode=vocab::x_ServiceEventPerformer::SPRF)'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
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
	boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
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
	boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2DocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2DocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))-&gt;select(typeCode = vocab::x_ServiceEventPerformer::PPRF)-&gt;notEmpty())'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))-&gt;select(typeCode = vocab::x_ServiceEventPerformer::SPRF)-&gt;notEmpty())'"
	 * @generated
	 */
	boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2DocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\') and classCode=vocab::ActClass::CONS)'"
	 * @generated
	 */
	boolean validateProcedureNote2AuthorizationConsentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject(isDefined(\'moodCode\') and moodCode=vocab::ActMood::EVN)'"
	 * @generated
	 */
	boolean validateProcedureNote2AuthorizationConsentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null).consent-&gt;excluding(null)-&gt;reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureNote2AuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null)-&gt;reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipType::AUTH)'"
	 * @generated
	 */
	boolean validateProcedureNote2AuthorizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authorization-&gt;excluding(null)-&gt;reject(consent-&gt;one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))'"
	 * @generated
	 */
	boolean validateProcedureNote2AuthorizationConsent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).encounterParticipant-&gt;excluding(null)-&gt;reject(typeCode=vocab::x_EncounterParticipant::REF)'"
	 * @generated
	 */
	boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).location-&gt;excluding(null)-&gt;reject(healthCareFacility-&gt;one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))'"
	 * @generated
	 */
	boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProcedureNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateProcedureNote2ComponentOfEncompassingEncounterCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(encounterParticipant-&gt;one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))'"
	 * @generated
	 */
	boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
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
	boolean validateProcedureNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ComplicationsSection2)'"
	 * @generated
	 */
	ComplicationsSection2 getComplicationsSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureIndicationsSection2)'"
	 * @generated
	 */
	ProcedureIndicationsSection2 getProcedureIndicationsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PostprocedureDiagnosisSection2)'"
	 * @generated
	 */
	PostprocedureDiagnosisSection2 getPostprocedureDiagnosisSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentAndPlanSection2)'"
	 * @generated
	 */
	AssessmentAndPlanSection2 getAssessmentAndPlanSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfTreatmentSection2)'"
	 * @generated
	 */
	PlanOfTreatmentSection2 getPlanOfTreatmentSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergiesSectionEntriesOptional2)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AnesthesiaSection2)'"
	 * @generated
	 */
	AnesthesiaSection2 getAnesthesiaSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::FamilyHistorySection2)'"
	 * @generated
	 */
	FamilyHistorySection2 getFamilyHistorySection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPastIllnessSection2)'"
	 * @generated
	 */
	HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsSectionEntriesOptional2)'"
	 * @generated
	 */
	MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsAdministeredSection2)'"
	 * @generated
	 */
	MedicationsAdministeredSection2 getMedicationsAdministeredSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PhysicalExamSection2)'"
	 * @generated
	 */
	PhysicalExamSection2 getPhysicalExamSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlannedProcedureSection2)'"
	 * @generated
	 */
	PlannedProcedureSection2 getPlannedProcedureSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProcedureFindingsSection2)'"
	 * @generated
	 */
	ProcedureFindingsSection2 getProcedureFindingsSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProceduresSectionEntriesOptional2)'"
	 * @generated
	 */
	ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SocialHistorySection2)'"
	 * @generated
	 */
	SocialHistorySection2 getSocialHistorySection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProcedureNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureNote2
