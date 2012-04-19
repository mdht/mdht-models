/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Cardiac Arrest Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCardiacArrestEvent()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Cardiac Arrest Event' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS CARDIAC ARREST EVENT' templateId.root='2.16.840.1.113883.17.3.10.1.14' constraints.validation.error='EMSCardiacArrestEventTemplateId EMSCardiacArrestEventCode EMSCardiacArrestEventCardiacArrestExistence' code.codeSystemName='LOINC' constraints.validation.warning='EMSCardiacArrestEventTitle' code.code='67799-7'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistence value.displayName='cardiac arrest' value.codeSystemName='SNOMEDCT' code.codeSystem='2.16.840.1.113883.5.4' code.displayName='ASSERTION' value.code='410429000' constraints.validation.error='CardiacArrestExistenceCode CardiacArrestExistenceValue' code.codeSystemName='HL7ActCode' code.code='ASSERTION' value.codeSystem='2.16.840.1.113883.6.96'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestTimingRelationshipInversionInd' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='CardiacArrestTimingCode' code.codeSystemName='LOINC' code.code='67502-5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac arrest cause' constraints.validation.error='CardiacArrestCauseCode' code.codeSystemName='LOINC' code.code='67503-3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipation typeCode='INF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole classCode='AGNT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPR code.codeSystem='2.16.840.1.113883.6.1' code.displayName='CPR prior to EMS arrival' constraints.validation.error='PriorCPRCode' code.codeSystemName='LOINC' code.code='67506-6'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUse code.codeSystem='2.16.840.1.113883.6.1' code.displayName='AED use prior to EMS arrival' constraints.validation.error='PriorAEDUseCode' code.codeSystemName='LOINC' code.code='67508-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm code.codeSystem='2.16.840.1.113883.6.1' code.displayName='First monitored rhythm' constraints.validation.error='ArrestRhythmCode' code.codeSystemName='LOINC' code.code='67512-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Return of spontaneous circulation' constraints.validation.error='ReturnOfSpontaneousCirculationCode' code.codeSystemName='LOINC' code.code='67513-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac rhythm' constraints.validation.error='DestinationRhythmCode' code.codeSystemName='LOINC' code.code='67519-9'"
 * @generated
 */
public interface EMSCardiacArrestEvent extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.14')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.14\')'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67799-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Cardiac Arrest Event')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Cardiac Arrest Event\')'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventCardiacArrestExistence(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)'"
   * @generated
   */
  Observation getCardiacArrestExistence();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCardiacArrestEvent init();
} // EMSCardiacArrestEvent
