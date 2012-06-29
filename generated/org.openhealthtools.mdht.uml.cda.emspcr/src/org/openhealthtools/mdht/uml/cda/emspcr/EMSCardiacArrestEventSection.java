/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Cardiac Arrest Event Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCardiacArrestEventSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSCardiacArrestEventSectionTemplateId EMSCardiacArrestEventSectionCode EMSCardiacArrestEventSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.14' code.code='67799-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS CARDIAC ARREST EVENT' title.mixed='EMS Cardiac Arrest Event' constraints.validation.warning='EMSCardiacArrestEventSectionTitle'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntry constraints.validation.error='DerivedEntryCardiacArrestExistence'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistence code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='ASSERTION' constraints.validation.error='CardiacArrestExistenceCode CardiacArrestExistenceValue' value.code='410429000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='cardiac arrest'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestTimingRelationshipInversionInd' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming code.code='67502-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='CardiacArrestTimingCode CardiacArrestTimingValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause code.code='67503-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac arrest cause' constraints.validation.error='CardiacArrestCauseCode CardiacArrestCauseValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipation typeCode='INF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole classCode='AGNT' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='CardiacArrestInformantRoleCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR code.code='67506-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='CPR prior to EMS arrival' constraints.validation.error='PriorCPRCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PriorCPRProviderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse code.code='67508-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='AED use prior to EMS arrival' constraints.validation.error='PriorAEDUseCode PriorAEDUseValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PriorAEDProviderCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm code.code='67512-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='First monitored rhythm' constraints.validation.error='ArrestRhythmCode ArrestRhythmValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation code.code='67513-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Return of spontaneous circulation' constraints.validation.error='ReturnOfSpontaneousCirculationCode ReturnOfSpontaneousCirculationValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationship inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionDerivedEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm code.code='67519-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac rhythm' constraints.validation.error='DestinationRhythmCode DestinationRhythmValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSCardiacArrestEventSection extends DerivedCDASection
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
