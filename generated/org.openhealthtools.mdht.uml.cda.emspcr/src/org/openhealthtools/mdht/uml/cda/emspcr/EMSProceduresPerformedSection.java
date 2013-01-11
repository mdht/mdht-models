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
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Procedures Performed Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSProceduresPerformedSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Procedures Performed' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Procedures Performed Section' templateId.root='2.16.840.1.113883.17.3.10.1.21' constraints.validation.error='EMSProceduresPerformedSectionTemplateId EMSProceduresPerformedSectionCode EMSProceduresPerformedSectionCodeP EMSProceduresPerformedSectionTitle EMSProceduresPerformedSectionText EMSProceduresPerformedSectionEntry1' code.codeSystemName='LOINC' code.code='67802-9'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntry constraints.validation.error='ProceduresEntryEMSProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedure statusCode.code='Aborted' constraints.validation.dependOn.EMSProcedureStatusCode='EMSProcedureStatusCodeP' templateId.root='null' approachSiteCode.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSProcedureTemplateId EMSProcedureCode EMSProcedureEffectiveTime EMSProcedureStatusCode EMSProcedureApproachSiteCode EMSProcedureEMSProcedurePriorRelationship EMSProcedureEMSProcedureNumberOfAttemptsRelationship EMSProcedureEMSProcedureSuccessfulRelationship EMSProcedureEMSProcedureComplicationsRelationship EMSProcedureEMSProcedurePatientResponseRelationship EMSProcedureEMSProcedurePerformer' approachSiteCode.codeSystemName='LOINC' constraints.validation.dependOn.EMSProcedureApproachSiteCode='EMSProcedureApproachSiteCodeP' constraints.validation.info='EMSProcedureStatusCodeP EMSProcedureApproachSiteCodeP EMSProcedureNegationInd EMSProcedureEMSAbandonedProcedureRelationship EMSProcedureEMSAirwayConfirmationRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationship constraints.validation.error='EMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.5.4' code.displayName='Assertion' constraints.validation.error='EMSAbandonedProcedureReasonObservationCode EMSAbandonedProcedureReasonObservationCodeP EMSAbandonedProcedureReasonObservationValue EMSAbandonedProcedureReasonObservationValueP' code.codeSystemName='HL7ActCode' code.code='ASSERTION' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSAbandonedProcedureReasonObservationCode='EMSAbandonedProcedureReasonObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationship constraints.validation.error='EMSProcedurePriorRelationshipEMSProcedurePriorIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSProcedurePriorIndicatorCode='EMSProcedurePriorIndicatorCodeP' code.displayName='Procedure performed prior to EMS arrival' constraints.validation.error='EMSProcedurePriorIndicatorCode EMSProcedurePriorIndicatorCodeP EMSProcedurePriorIndicatorValue' code.codeSystemName='LOINC' code.code='67542-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship constraints.validation.error='EMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation constraints.validation.dependOn.EMSProcedureNumberOfAttemptsObservationCode='EMSProcedureNumberOfAttemptsObservationCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Number of procedure attempts' constraints.validation.error='EMSProcedureNumberOfAttemptsObservationCode EMSProcedureNumberOfAttemptsObservationCodeP EMSProcedureNumberOfAttemptsObservationValue' code.codeSystemName='LOINC' code.code='67543-9'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationship constraints.validation.error='EMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSProcedureSuccessfulObservationCode='EMSProcedureSuccessfulObservationCodeP' code.displayName='Procedure successful indicator' constraints.validation.error='EMSProcedureSuccessfulObservationCode EMSProcedureSuccessfulObservationCodeP EMSProcedureSuccessfulObservationValue' code.codeSystemName='LOINC' code.code='67544-7'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationship constraints.validation.error='EMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='null' code.displayName='Procedure complication' constraints.validation.error='EMSProcedureComplicationsObservationTemplateId EMSProcedureComplicationsObservationCode EMSProcedureComplicationsObservationCodeP EMSProcedureComplicationsObservationValue' code.codeSystemName='LOINC' code.code='67545-4' constraints.validation.dependOn.EMSProcedureComplicationsObservationCode='EMSProcedureComplicationsObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationship constraints.validation.error='EMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation constraints.validation.dependOn.EMSProcedurePatientResponseObservationCode='EMSProcedurePatientResponseObservationCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Procedure patient response' constraints.validation.error='EMSProcedurePatientResponseObservationCode EMSProcedurePatientResponseObservationCodeP EMSProcedurePatientResponseObservationValue EMSProcedurePatientResponseObservationValueP' code.codeSystemName='LOINC' code.code='67546-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformer constraints.validation.error='EMSProcedurePerformerEMSProcedurePerformerEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSProcedurePerformerEntityCode EMSProcedurePerformerEntityCodeP EMSProcedurePerformerEntityId' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationship constraints.validation.error='EMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation constraints.validation.dependOn.EMSAirwayConfirmationObservationCode='EMSAirwayConfirmationObservationCodeP' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='null' constraints.validation.error='EMSAirwayConfirmationObservationTemplateId EMSAirwayConfirmationObservationCode EMSAirwayConfirmationObservationCodeP EMSAirwayConfirmationObservationMethodCode EMSAirwayConfirmationObservationMethodCodeP EMSAirwayConfirmationObservationValue EMSAirwayConfirmationObservationEffectiveTime EMSAirwayConfirmationObservationEMSAirwayDeviceParticipant' methodCode.codeSystemName='LOINC' code.codeSystemName='LOINC' code.code='71576-3' methodCode.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant constraints.validation.error='EMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole constraints.validation.error='EMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSAirwayDeviceParticipantTypeCode' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationship constraints.validation.error='EMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSReasonProcedureNotAttemptedRelationshipEMSReasonProcedureNotAttemptedObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Reason Not Attempted' constraints.validation.error='EMSReasonProcedureNotAttemptedObservationCode EMSReasonProcedureNotAttemptedObservationValue EMSReasonProcedureNotAttemptedObservationValueP' code.codeSystemName='LOINC' code.code='67504-1' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSProceduresPerformedSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.21')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.21\')'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67802-9' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67802-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Procedures Performed')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Procedures Performed\')'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSProceduresPerformedSection::ProceduresEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSProceduresPerformedSection::ProceduresEntry))'"
   * @generated
   */
	boolean validateEMSProceduresPerformedSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSProceduresPerformedSection::ProceduresEntry))->asSequence()->first().oclAsType(emspcr::EMSProceduresPerformedSection::ProceduresEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSProceduresPerformedSection::ProceduresEntry))->asSequence()->first().oclAsType(emspcr::EMSProceduresPerformedSection::ProceduresEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSProceduresPerformedSection init();
} // EMSProceduresPerformedSection
