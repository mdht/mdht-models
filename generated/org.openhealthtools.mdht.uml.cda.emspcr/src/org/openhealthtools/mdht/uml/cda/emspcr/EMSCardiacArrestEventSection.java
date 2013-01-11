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
 * A representation of the model object '<em><b>EMS Cardiac Arrest Event Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSCardiacArrestEventSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation value.codeSystemName='LOINC' title.mixed='EMS Cardiac Arrest Event' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Cardiac Arrest Section' templateId.root='2.16.840.1.113883.17.3.10.1.14' constraints.validation.error='EMSCardiacArrestEventSectionTemplateId EMSCardiacArrestEventSectionCode EMSCardiacArrestEventSectionTitle EMSCardiacArrestEventSectionText EMSCardiacArrestEventSectionEntry1' code.codeSystemName='LOINC' code.code='67799-7' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntry constraints.validation.error='CardiacArrestEntryCardiacArrestExistence'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistence value.displayName='cardiac arrest' value.codeSystemName='SNOMEDCT' code.codeSystem='2.16.840.1.113883.5.4' code.displayName='ASSERTION' value.code='410429000' constraints.validation.error='CardiacArrestExistenceCode CardiacArrestExistenceValue' code.codeSystemName='HL7ActCode' constraints.validation.warning='CardiacArrestExistenceEffectiveTime CardiacArrestExistenceNegationInd' code.code='ASSERTION' constraints.validation.info='CardiacArrestExistenceCardiacArrestCauseRelationship CardiacArrestExistenceCardiacArrestTimingRelationship CardiacArrestExistenceCardiacArrestInformantParticipation CardiacArrestExistencePriorCPRRelationship CardiacArrestExistencePriorAEDRelationship CardiacArrestExistenceSpontaneousCirculationRelationship CardiacArrestExistenceDestinationRhythmRelationship CardiacArrestExistenceArrestRhythmRelationship' value.codeSystem='2.16.840.1.113883.6.96'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestTimingRelationshipInversionInd CardiacArrestTimingRelationshipTypeCode CardiacArrestTimingRelationshipCardiacArrestTiming' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestTimingRelationshipCardiacArrestTiming value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac arrest occurrence' constraints.validation.error='CardiacArrestTimingCode CardiacArrestTimingValue' code.codeSystemName='LOINC' code.code='67502-5' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestCauseRelationshipInversionInd CardiacArrestCauseRelationshipTypeCode CardiacArrestCauseRelationshipCardiacArrestCause' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac arrest cause' constraints.validation.error='CardiacArrestCauseCode CardiacArrestCauseValue' code.codeSystemName='LOINC' code.code='67503-3' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipation constraints.validation.error='CardiacArrestInformantParticipationTypeCode CardiacArrestInformantParticipationCardiacArrestInformantRole' typeCode='INF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='CardiacArrestInformantRoleClassCode CardiacArrestInformantRoleCode' code.codeSystemName='LOINC' classCode='AGNT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationship inversionInd='TRUE' constraints.validation.error='PriorCPRRelationshipInversionInd PriorCPRRelationshipTypeCode PriorCPRRelationshipPriorCPR' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPR code.codeSystem='2.16.840.1.113883.6.1' code.displayName='CPR prior to EMS arrival' constraints.validation.error='PriorCPRCode PriorCPRValue' code.codeSystemName='LOINC' code.code='67506-6' constraints.validation.info='PriorCPRPriorCPRProviderParticipation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipation constraints.validation.error='PriorCPRProviderParticipationPriorCPRProvider' typeCode='RESP' constraints.validation.info='PriorCPRProviderParticipationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorCPRRelationshipPriorCPRPriorCPRProviderParticipationPriorCPRProvider code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='PriorCPRProviderCode' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationship inversionInd='TRUE' constraints.validation.error='PriorAEDRelationshipInversionInd PriorAEDRelationshipTypeCode PriorAEDRelationshipPriorAEDUse' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUse value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='AED use prior to EMS arrival' constraints.validation.error='PriorAEDUseCode PriorAEDUseValue PriorAEDUsePriorAEDProviderParticipation' code.codeSystemName='LOINC' code.code='67508-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipation constraints.validation.error='PriorAEDProviderParticipationPriorAEDProvider' typeCode='RESP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistencePriorAEDRelationshipPriorAEDUsePriorAEDProviderParticipationPriorAEDProvider code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='PriorAEDProviderCode' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationship inversionInd='TRUE' constraints.validation.error='ArrestRhythmRelationshipInversionInd ArrestRhythmRelationshipTypeCode ArrestRhythmRelationshipObservation' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceArrestRhythmRelationshipArrestRhythm value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='First monitored rhythm' constraints.validation.error='ArrestRhythmCode ArrestRhythmValue' code.codeSystemName='LOINC' code.code='67512-4' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationship inversionInd='TRUE' constraints.validation.error='SpontaneousCirculationRelationshipInversionInd SpontaneousCirculationRelationshipTypeCode SpontaneousCirculationRelationshipReturnOfSpontaneousCirculation' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Return of spontaneous circulation' constraints.validation.error='ReturnOfSpontaneousCirculationCode ReturnOfSpontaneousCirculationValue' code.codeSystemName='LOINC' code.code='67513-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationship inversionInd='TRUE' constraints.validation.error='DestinationRhythmRelationshipInversionInd DestinationRhythmRelationshipTypeCode DestinationRhythmRelationshipDestinationRhythm' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSCardiacArrestEventSectionCardiacArrestEntryCardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac rhythm' constraints.validation.error='DestinationRhythmCode DestinationRhythmValue' code.codeSystemName='LOINC' code.code='67519-9' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSCardiacArrestEventSection extends Section {
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
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry))'"
   * @generated
   */
	boolean validateEMSCardiacArrestEventSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry))->asSequence()->first().oclAsType(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry))->asSequence()->first().oclAsType(emspcr::EMSCardiacArrestEventSection::CardiacArrestEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSCardiacArrestEventSection init();
} // EMSCardiacArrestEventSection
