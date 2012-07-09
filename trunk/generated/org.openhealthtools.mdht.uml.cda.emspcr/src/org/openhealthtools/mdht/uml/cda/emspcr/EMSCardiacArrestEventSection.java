/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Cardiac Arrest Event Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCardiacArrestEventSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSCardiacArrestEventSectionTemplateId EMSCardiacArrestEventSectionCode EMSCardiacArrestEventSectionTitle EMSCardiacArrestEventSectionText EMSCardiacArrestEventSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.14' code.code='67799-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Cardiac Arrest Section' title.mixed='EMS Cardiac Arrest Event'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntry constraints.validation.error='DerivedEntryCardiacArrestExistence'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistence code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='ASSERTION' constraints.validation.error='CardiacArrestExistenceCode CardiacArrestExistenceValue' constraints.validation.warning='CardiacArrestExistenceEffectiveTime CardiacArrestExistenceNegationInd' value.code='410429000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='cardiac arrest' constraints.validation.info='CardiacArrestExistenceCardiacArrestCauseRelationship CardiacArrestExistenceCardiacArrestTimingRelationship CardiacArrestExistenceCardiacArrestInformantParticipation CardiacArrestExistencePriorCPRRelationship CardiacArrestExistencePriorAEDRelationship CardiacArrestExistenceSpontaneousCirculationRelationship CardiacArrestExistenceDestinationRhythmRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestTimingRelationshipInversionInd CardiacArrestTimingRelationshipTypeCode CardiacArrestTimingRelationshipCardiacArrestTiming' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming code.code='67502-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac arrest occurrence' constraints.validation.error='CardiacArrestTimingCode CardiacArrestTimingValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestCauseRelationshipInversionInd CardiacArrestCauseRelationshipTypeCode' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause code.code='67503-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac arrest cause' constraints.validation.error='CardiacArrestCauseCode CardiacArrestCauseValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipation typeCode='INF' constraints.validation.error='CardiacArrestInformantParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole classCode='AGNT' constraints.validation.error='CardiacArrestInformantRoleClassCode CardiacArrestInformantRoleCode' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationship inversionInd='TRUE' constraints.validation.error='PriorCPRRelationshipInversionInd PriorCPRRelationshipTypeCode' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR code.code='67506-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='CPR prior to EMS arrival' constraints.validation.error='PriorCPRCode PriorCPRValue' constraints.validation.info='PriorCPRPriorCPRProviderParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation typeCode='RESP' constraints.validation.info='PriorCPRProviderParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PriorCPRProviderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationship inversionInd='TRUE' constraints.validation.error='PriorAEDRelationshipInversionInd PriorAEDRelationshipTypeCode PriorAEDRelationshipPriorAEDUse' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse code.code='67508-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='AED use prior to EMS arrival' constraints.validation.error='PriorAEDUseCode PriorAEDUseValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' constraints.validation.info='PriorAEDUsePriorAEDProviderParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation typeCode='RESP' constraints.validation.info='PriorAEDProviderParticipationPriorAEDProvider'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PriorAEDProviderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationship inversionInd='TRUE' constraints.validation.error='ArrestRhythmRelationshipInversionInd ArrestRhythmRelationshipTypeCode ArrestRhythmRelationshipObservation' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm code.code='67512-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='First monitored rhythm' constraints.validation.error='ArrestRhythmCode ArrestRhythmValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationship inversionInd='TRUE' constraints.validation.error='SpontaneousCirculationRelationshipInversionInd SpontaneousCirculationRelationshipTypeCode SpontaneousCirculationRelationshipReturnOfSpontaneousCirculation' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation code.code='67513-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Return of spontaneous circulation' constraints.validation.error='ReturnOfSpontaneousCirculationCode ReturnOfSpontaneousCirculationValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationship inversionInd='TRUE' constraints.validation.error='DestinationRhythmRelationshipInversionInd DestinationRhythmRelationshipTypeCode DestinationRhythmRelationshipDestinationRhythm' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm code.code='67519-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac rhythm' constraints.validation.error='DestinationRhythmCode DestinationRhythmValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSCardiacArrestEventSection extends Section
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
  boolean validateEMSCardiacArrestEventSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67799-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSCardiacArrestEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSCardiacArrestEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSCardiacArrestEventSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCardiacArrestEventSection init();
} // EMSCardiacArrestEventSection
