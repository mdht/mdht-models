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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSProceduresPerformedSectionTemplateId EMSProceduresPerformedSectionCode EMSProceduresPerformedSectionCodeP EMSProceduresPerformedSectionTitle EMSProceduresPerformedSectionText EMSProceduresPerformedSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.21' code.code='67802-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Procedures Performed Section' title.mixed='EMS Procedures Performed'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntry constraints.validation.error='ProceduresEntryEMSProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedure constraints.validation.error='EMSProcedureTemplateId EMSProcedureCode EMSProcedureEffectiveTime EMSProcedureStatusCode EMSProcedureApproachSiteCode EMSProcedureEMSProcedurePriorRelationship EMSProcedureEMSProcedureNumberOfAttemptsRelationship EMSProcedureEMSProcedureSuccessfulRelationship EMSProcedureEMSProcedureComplicationsRelationship EMSProcedureEMSProcedurePatientResponseRelationship EMSProcedureEMSProcedurePerformer' templateId.root='null' statusCode.code='Aborted' constraints.validation.info='EMSProcedureStatusCodeP EMSProcedureApproachSiteCodeP EMSProcedureEMSAbandonedProcedureRelationship EMSProcedureEMSAirwayConfirmationRelationship' constraints.validation.dependOn.EMSProcedureStatusCode='EMSProcedureStatusCodeP' approachSiteCode.codeSystem='2.16.840.1.113883.6.1' approachSiteCode.codeSystemName='LOINC' constraints.validation.dependOn.EMSProcedureApproachSiteCode='EMSProcedureApproachSiteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationship constraints.validation.error='EMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAbandonedProcedureRelationshipEMSAbandonedProcedureReasonObservation code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.error='EMSAbandonedProcedureReasonObservationCode EMSAbandonedProcedureReasonObservationCodeP EMSAbandonedProcedureReasonObservationValue EMSAbandonedProcedureReasonObservationValueP' constraints.validation.dependOn.EMSAbandonedProcedureReasonObservationCode='EMSAbandonedProcedureReasonObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationship constraints.validation.error='EMSProcedurePriorRelationshipEMSProcedurePriorIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePriorRelationshipEMSProcedurePriorIndicator code.code='67542-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Procedure performed prior to EMS arrival' constraints.validation.error='EMSProcedurePriorIndicatorCode EMSProcedurePriorIndicatorCodeP EMSProcedurePriorIndicatorValue' constraints.validation.dependOn.EMSProcedurePriorIndicatorCode='EMSProcedurePriorIndicatorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationship constraints.validation.error='EMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureNumberOfAttemptsRelationshipEMSProcedureNumberOfAttemptsObservation code.code='67543-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Number of procedure attempts' constraints.validation.error='EMSProcedureNumberOfAttemptsObservationCode EMSProcedureNumberOfAttemptsObservationCodeP EMSProcedureNumberOfAttemptsObservationValue' constraints.validation.dependOn.EMSProcedureNumberOfAttemptsObservationCode='EMSProcedureNumberOfAttemptsObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationship constraints.validation.error='EMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureSuccessfulRelationshipEMSProcedureSuccessfulObservation code.code='67544-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Procedure successful indicator' constraints.validation.error='EMSProcedureSuccessfulObservationCode EMSProcedureSuccessfulObservationCodeP EMSProcedureSuccessfulObservationValue' constraints.validation.dependOn.EMSProcedureSuccessfulObservationCode='EMSProcedureSuccessfulObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationship constraints.validation.error='EMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedureComplicationsRelationshipEMSProcedureComplicationsObservation constraints.validation.error='EMSProcedureComplicationsObservationTemplateId EMSProcedureComplicationsObservationCode EMSProcedureComplicationsObservationCodeP EMSProcedureComplicationsObservationValue' templateId.root='null' code.code='67545-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Procedure complication' constraints.validation.dependOn.EMSProcedureComplicationsObservationCode='EMSProcedureComplicationsObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationship constraints.validation.error='EMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePatientResponseRelationshipEMSProcedurePatientResponseObservation code.code='67546-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Procedure patient response' constraints.validation.error='EMSProcedurePatientResponseObservationCode EMSProcedurePatientResponseObservationCodeP EMSProcedurePatientResponseObservationValue EMSProcedurePatientResponseObservationValueP' constraints.validation.dependOn.EMSProcedurePatientResponseObservationCode='EMSProcedurePatientResponseObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformer constraints.validation.error='EMSProcedurePerformerEMSProcedurePerformerEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSProcedurePerformerEMSProcedurePerformerEntity code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSProcedurePerformerEntityCode EMSProcedurePerformerEntityCodeP EMSProcedurePerformerEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationship constraints.validation.error='EMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservation constraints.validation.error='EMSAirwayConfirmationObservationTemplateId EMSAirwayConfirmationObservationCode EMSAirwayConfirmationObservationCodeP EMSAirwayConfirmationObservationMethodCode EMSAirwayConfirmationObservationMethodCodeP EMSAirwayConfirmationObservationValue EMSAirwayConfirmationObservationEffectiveTime EMSAirwayConfirmationObservationEMSAirwayDeviceParticipant' templateId.root='null' code.code='TBD' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSAirwayConfirmationObservationCode='EMSAirwayConfirmationObservationCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipant constraints.validation.error='EMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRole constraints.validation.error='EMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSProceduresPerformedSectionProceduresEntryEMSProcedureEMSAirwayConfirmationRelationshipEMSAirwayConfirmationObservationEMSAirwayDeviceParticipantEMSAirwayDeviceParticipantRoleEMSAirwayDeviceParticipantType code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSAirwayDeviceParticipantTypeCode'"
 * @generated
 */
public interface EMSProceduresPerformedSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	* @generated
	*/
	boolean validateEMSProceduresPerformedSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSProceduresPerformedSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSProceduresPerformedSection
