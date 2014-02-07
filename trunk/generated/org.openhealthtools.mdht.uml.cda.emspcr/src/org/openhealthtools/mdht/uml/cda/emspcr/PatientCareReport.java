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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId PatientCareReportClassCode PatientCareReportMoodCode GeneralHeaderConstraintsId PatientCareReportCode PatientCareReportCodeP GeneralHeaderConstraintsTitle PatientCareReportConfidentialityCode PatientCareReportRecordTarget PatientCareReportCurrentMedication PatientCareReportAllergiesAndAdverseReactionsSection PatientCareReportPastMedicalHistorySection PatientCareReportSocialHistorySection PatientCareReportPhysicalAssessmentSection PatientCareReportProceduresPerformedSection PatientCareReportPatientCareNarrativeSection PatientCareReportSceneSection GeneralHeaderConstraintsComponentOf PatientCareReportDispatchSection PatientCareReportPersonnelAdverseEventSection PatientCareReportProtocolSection PatientCareReportResponseSection PatientCareReportSituationSection PatientCareReportVitalSignsSection PatientCareReportAuthorParticipation GeneralHeaderConstraintsCustodian PatientCareReportDocumentationOf PatientCareReportParticipant PatientCareReportInjuryIncidentDescriptionSection' templateId.root='2.16.840.1.113883.17.3.10.2' classCode='DOCCLIN' moodCode='EVN' code.code='67796-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS patient care report - version 3.1 Document NEMSIS' constraints.validation.dependOn.PatientCareReportCode='PatientCareReportCodeP' title.mixed='EMS Patient Care Report' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' confidentialityCode.codeSystemName='ConfidentialityCode' constraints.validation.info='GeneralHeaderConstraintsVersionNumber PatientCareReportCardiacArrestEvent PatientCareReportMedicationsAdministeredSection PatientCareReportDispositionSection PatientCareReportTimesSection PatientCareReportRelatedDocument' constraints.validation.warning='PatientCareReportAdvanceDirectives'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTarget constraints.validation.error='PatientCareReportRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRole constraints.validation.error='PatientCareReportRecordTargetPatientRoleAddr PatientCareReportRecordTargetPatientRoleId PatientCareReportRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportRecordTargetPatientRolePatient constraints.validation.warning='PatientCareReportRecordTargetPatientRolePatientBirthTime PatientCareReportRecordTargetPatientRolePatientName' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode PatientCareReportRecordTargetPatientRolePatientRaceCode PatientCareReportRecordTargetPatientRolePatientAdministrativeGenderCode' constraints.validation.info='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP PatientCareReportRecordTargetPatientRolePatientSDTCRaceCode' constraints.validation.dependOn.PatientCareReportRecordTargetPatientRolePatientEthnicGroupCode='PatientCareReportRecordTargetPatientRolePatientEthnicGroupCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipation constraints.validation.error='PatientCareReportAuthorParticipationAuthorRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRole constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleId PatientCareReportAuthorParticipationAuthorRoleAddr PatientCareReportAuthorParticipationAuthorRoleTelecom' constraints.validation.info='PatientCareReportAuthorParticipationAuthorRoleHumanAuthor PatientCareReportAuthorParticipationAuthorRoleAuthoringDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleHumanAuthor constraints.validation.error='PatientCareReportAuthorParticipationAuthorRoleHumanAuthorName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportAuthorParticipationAuthorRoleAuthoringDevice constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationship typeCode='COMP' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipTypeCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounter constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterEffectiveTime PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocation constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacility constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityId PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityCode PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlace classCode='PLC' constraints.validation.error='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceClassCode' constraints.validation.info='PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceName PatientCareReportEncompassingEncounterRelationshipEncompassingEncounterLocationHealthCareFacilityPlaceAddr'"
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
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrPatientCareReportDestinationParticipantParticipationDestinationRole constraints.validation.warning='PatientCareReportDestinationParticipantParticipationDestinationRoleAddr' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientCareReportDestinationParticipantParticipationDestinationRoleCode' classCode='SDLOC'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67796-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.25\' and (value.code = \'N\' or value.code = \'R\' or value.code = \'V\'))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPastMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))'"
	 * @generated
	 */
	boolean validatePatientCareReportSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportPatientCareNarrativeSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))'"
	 * @generated
	 */
	boolean validatePatientCareReportInjuryIncidentDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::EMSCurrentMedicationSection)'"
	 * @generated
	 */
	EMSCurrentMedicationSection getCurrentMedication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)'"
	 * @generated
	 */
	EMSCardiacArrestEventSection getCardiacArrestEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)'"
	 * @generated
	 */
	EMSAdvanceDirectivesSection getAdvanceDirectives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)'"
	 * @generated
	 */
	EMSAllergiesAndAdverseReactionsSection getAllergiesAndAdverseReactionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSPastMedicalHistorySection)'"
	 * @generated
	 */
	EMSPastMedicalHistorySection getPastMedicalHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSSocialHistorySection)'"
	 * @generated
	 */
	EMSSocialHistorySection getSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)'"
	 * @generated
	 */
	EMSPhysicalAssessmentSection getPhysicalAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)'"
	 * @generated
	 */
	EMSMedicationsAdministeredSection getMedicationsAdministeredSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::EMSProceduresPerformedSection)'"
	 * @generated
	 */
	EMSProceduresPerformedSection getProceduresPerformedSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))->asSequence()->any(true).oclAsType(emspcr::EMSPatientCareNarrativeSection)'"
	 * @generated
	 */
	EMSPatientCareNarrativeSection getPatientCareNarrativeSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))->asSequence()->any(true).oclAsType(emspcr::EMSSceneSection)'"
	 * @generated
	 */
	EMSSceneSection getSceneSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispatchSection)'"
	 * @generated
	 */
	EMSDispatchSection getDispatchSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispositionSection)'"
	 * @generated
	 */
	EMSDispositionSection getDispositionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSPersonnelAdverseEventSection)'"
	 * @generated
	 */
	EMSPersonnelAdverseEventSection getPersonnelAdverseEventSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))->asSequence()->any(true).oclAsType(emspcr::EMSProtocolSection)'"
	 * @generated
	 */
	EMSProtocolSection getProtocolSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))->asSequence()->any(true).oclAsType(emspcr::EMSResponseSection)'"
	 * @generated
	 */
	EMSResponseSection getResponseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))->asSequence()->any(true).oclAsType(emspcr::EMSSituationSection)'"
	 * @generated
	 */
	EMSSituationSection getSituationSection();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))->asSequence()->any(true).oclAsType(emspcr::EMSVitalSignsSection)'"
	 * @generated
	 */
	EMSVitalSignsSection getVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)'"
	 * @generated
	 */
	EMSInjuryIncidentDescriptionSection getInjuryIncidentDescriptionSection();

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
