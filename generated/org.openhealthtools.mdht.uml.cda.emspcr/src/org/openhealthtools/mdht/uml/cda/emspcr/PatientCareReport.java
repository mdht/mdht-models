/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getPatientCareReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientCareReportTemplateId PatientCareReportClassCode PatientCareReportMoodCode PatientCareReportCode PatientCareReportCodeP PatientCareReportTitle PatientCareReportId PatientCareReportConfidentialityCode PatientCareReportRecordTarget PatientCareReportBilling PatientCareReportCurrentMedication PatientCareReportAllergiesAndAdverseReactionsSection PatientCareReportPastMedicalHistory PatientCareReportSocialHistory PatientCareReportPhysicalAssessmentSection PatientCareReportProceduresPerformedSection PatientCareReportPatientCareNarrative PatientCareReportSceneSection PatientCareReportComponentOf PatientCareReportDispatchSection PatientCareReportPersonnelAdverseEventSection PatientCareReportProtocolSection PatientCareReportResponseSection PatientCareReportSituationSection PatientCareReportVitalSignsSection PatientCareReportCustodian PatientCareReportDocumentationOf PatientCareReportRelatedDocument PatientCareReportParticipant PatientCareReportInjuryIncidentDescriptionSection' templateId.root='2.16.840.1.113883.17.3.10.2' classCode='DOCCLIN' moodCode='EVN' code.code='67796-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Patient Care Report' constraints.validation.dependOn.PatientCareReportCode='PatientCareReportCodeP' title.mixed='EMS Patient Care Report' constraints.validation.info='PatientCareReportVersionNumber PatientCareReportCardiacArrestEvent PatientCareReportMedicationsAdministeredSection PatientCareReportDispositionSection PatientCareReportTimesSection' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' confidentialityCode.codeSystemName='ConfidentialityCode' constraints.validation.warning='PatientCareReportAdvanceDirectives PatientCareReportAuthorParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget constraints.validation.error='PatientCareReportRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole constraints.validation.error='PatientCareReportRecordTargetPatientRoleAddr PatientCareReportRecordTargetPatientRoleId PatientCareReportRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRolePatient constraints.validation.warning='PatientCareReportRecordTargetPatientRolePatientBirthTime' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode PatientCareReportRecordTargetPatientRolePatientName PatientCareReportRecordTargetPatientRolePatientAdministrativeGenderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipation constraints.validation.error='PatientCareReportAuthorParticipationAuthorRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRole constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleId PatientCareReportAuthorParticipationAuthorRoleAddr PatientCareReportAuthorParticipationAuthorRoleTelecom PatientCareReportAuthorParticipationAuthorRoleHumanAuthor PatientCareReportAuthorParticipationAuthorRoleAuthoringDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleHumanAuthor constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleHumanAuthorName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleAuthoringDevice constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleAuthoringDeviceManufacturerModelName PatientCareReportAuthorParticipationAuthorRoleAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationship typeCode='COMP' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipTypeCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounter constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterEffectiveTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocation constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityId PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceName PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAddr' classCode='PLC' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipation constraints.validation.error='PatientCareReportCustodianParticipationCustodianRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipationCustodianRole constraints.validation.error='PatientCareReportCustodianParticipationCustodianRoleCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportCustodianParticipationCustodianRoleCustodian constraints.validation.error='PatientCareReportCustodianParticipationCustodianRoleCustodianAddr PatientCareReportCustodianParticipationCustodianRoleCustodianId PatientCareReportCustodianParticipationCustodianRoleCustodianName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipation constraints.validation.error='PatientCareReportServiceEventParticipationServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEvent code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventCode PatientCareReportServiceEventParticipationServiceEventId PatientCareReportServiceEventParticipationServiceEventPerformerParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipation functionCode.codeSystem='2.16.840.1.113883.6.1' functionCode.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationFunctionCode PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRole code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCode PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleCodeP PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleId PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleAddr PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRoleTelecom PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformer constraints.validation.error='PatientCareReportServiceEventParticipationServiceEventPerformerParticipationPerformerRolePerformerName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportParentDocumentRelationship typeCode='RPLC' constraints.validation.info='PatientCareReportParentDocumentRelationshipParentDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportParentDocumentRelationshipParentDocument constraints.validation.error='PatientCareReportParentDocumentRelationshipParentDocumentId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipation typeCode='DST' constraints.validation.error='PatientCareReportDestinationParticipantParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipationDestinationRole constraints.validation.warning='PatientCareReportDestinationParticipantParticipationDestinationRoleAddr' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportDestinationParticipantParticipationDestinationRoleCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipationDestinationRoleDestinationOrganization constraints.validation.error='PatientCareReportDestinationParticipantParticipationDestinationRoleDestinationOrganizationName'"
 * @generated
 */
public interface PatientCareReport extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClinicalDocument::DOCCLIN'"
	 * @generated
	 */
	boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientCareReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67796-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'EMS Patient Care Report\')'"
	 * @generated
	 */
	boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientCareReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientCareReportId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\' and (value.code = \'N\' or value.code = \'R\' or value.code = \'V\'))'"
	 * @generated
	 */
	boolean validatePatientCareReportConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validatePatientCareReportRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::BillingSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportBilling(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CurrentMedicationSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportCurrentMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CardiacArrestEventSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportCardiacArrestEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AdvanceDirectivesSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportAdvanceDirectives(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AllergiesAndAdverseReactionsSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PastMedicalHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPastMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SocialHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PhysicalAssessmentSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPhysicalAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::MedicationsAdministeredSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportMedicationsAdministeredSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProceduresPerformedSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportProceduresPerformedSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PatientCareNarrativeSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPatientCareNarrative(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SceneSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validatePatientCareReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispatchSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportDispatchSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispositionSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportDispositionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PersonnelAdverseEventSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPersonnelAdverseEventSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProtocolSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportProtocolSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ResponseSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportResponseSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SituationSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSituationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::TimesSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportTimesSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::VitalSignsSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validatePatientCareReportAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validatePatientCareReportCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validatePatientCareReportDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
	 * @generated
	 */
	boolean validatePatientCareReportRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validatePatientCareReportParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::InjuryIncidentDescriptionSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportInjuryIncidentDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::BillingSection))->asSequence()->any(true).oclAsType(emspcr::BillingSection)'"
	 * @generated
	 */
	BillingSection getBilling();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::CurrentMedicationSection)'"
	 * @generated
	 */
	CurrentMedicationSection getCurrentMedication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::CardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::CardiacArrestEventSection)'"
	 * @generated
	 */
	CardiacArrestEventSection getCardiacArrestEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::AdvanceDirectivesSection)'"
	 * @generated
	 */
	AdvanceDirectivesSection getAdvanceDirectives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::AllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::AllergiesAndAdverseReactionsSection)'"
	 * @generated
	 */
	AllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PastMedicalHistorySection))->asSequence()->any(true).oclAsType(emspcr::PastMedicalHistorySection)'"
	 * @generated
	 */
	PastMedicalHistorySection getPastMedicalHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SocialHistorySection))->asSequence()->any(true).oclAsType(emspcr::SocialHistorySection)'"
	 * @generated
	 */
	SocialHistorySection getSocialHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::PhysicalAssessmentSection)'"
	 * @generated
	 */
	PhysicalAssessmentSection getPhysicalAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::MedicationsAdministeredSection)'"
	 * @generated
	 */
	MedicationsAdministeredSection getMedicationsAdministeredSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::ProceduresPerformedSection)'"
	 * @generated
	 */
	ProceduresPerformedSection getProceduresPerformedSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PatientCareNarrativeSection))->asSequence()->any(true).oclAsType(emspcr::PatientCareNarrativeSection)'"
	 * @generated
	 */
	PatientCareNarrativeSection getPatientCareNarrative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SceneSection))->asSequence()->any(true).oclAsType(emspcr::SceneSection)'"
	 * @generated
	 */
	SceneSection getSceneSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispatchSection))->asSequence()->any(true).oclAsType(emspcr::DispatchSection)'"
	 * @generated
	 */
	DispatchSection getDispatchSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::DispositionSection))->asSequence()->any(true).oclAsType(emspcr::DispositionSection)'"
	 * @generated
	 */
	DispositionSection getDispositionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::PersonnelAdverseEventSection))->asSequence()->any(true).oclAsType(emspcr::PersonnelAdverseEventSection)'"
	 * @generated
	 */
	PersonnelAdverseEventSection getPersonnelAdverseEventSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ProtocolSection))->asSequence()->any(true).oclAsType(emspcr::ProtocolSection)'"
	 * @generated
	 */
	ProtocolSection getProtocolSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::ResponseSection))->asSequence()->any(true).oclAsType(emspcr::ResponseSection)'"
	 * @generated
	 */
	ResponseSection getResponseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::SituationSection))->asSequence()->any(true).oclAsType(emspcr::SituationSection)'"
	 * @generated
	 */
	SituationSection getSituationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::TimesSection))->asSequence()->any(true).oclAsType(emspcr::TimesSection)'"
	 * @generated
	 */
	TimesSection getTimesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::VitalSignsSection))->asSequence()->any(true).oclAsType(emspcr::VitalSignsSection)'"
	 * @generated
	 */
	VitalSignsSection getVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::InjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::InjuryIncidentDescriptionSection)'"
	 * @generated
	 */
	InjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareReport init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientCareReport
