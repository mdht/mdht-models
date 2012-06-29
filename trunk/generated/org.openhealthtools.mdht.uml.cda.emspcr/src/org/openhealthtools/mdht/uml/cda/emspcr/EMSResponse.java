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
 * A representation of the model object '<em><b>EMS Response</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSResponse()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSResponseTemplateId EMSResponseCode EMSResponseCodeP EMSResponseText EMSResponseTitle EMSResponseEntry1 EMSResponseEntry2 EMSResponseEntry3 EMSResponseEntry4' templateId.root='2.16.840.1.113883.17.3.10.1.3' code.code='67664?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response' title.mixed='EMS Response'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntry constraints.validation.error='DerivedEntryEMSResponseModeToScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizer constraints.validation.error='EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationship constraints.validation.error='EMSDispatchDelayRelationshipEMSDispatchDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay code.code='67480?4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch delay' constraints.validation.error='EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP' constraints.validation.dependOn.EMSDispatchDelayCode='EMSDispatchDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationship constraints.validation.error='EMSResponseDelayRelationshipEMSResponseDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay code.code='67557?9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response delay' constraints.validation.error='EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP' constraints.validation.dependOn.EMSResponseDelayCode='EMSResponseDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationship constraints.validation.error='EMSSceneDelayRelationshipEMSSceneDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay code.code='67558?7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Scene delay' constraints.validation.error='EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP' constraints.validation.dependOn.EMSSceneDelayCode='EMSSceneDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationship constraints.validation.error='EMSTransportDelayRelationshipEMSTransportDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay code.code='67559?5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Transport delay' constraints.validation.error='EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP' constraints.validation.dependOn.EMSTransportDelayCode='EMSTransportDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship constraints.validation.error='EMSTurnaoundDelayRelationshipEMSTurnaroundDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay code.code='67560?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Turnaround delay' constraints.validation.error='EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP' constraints.validation.dependOn.EMSTurnaroundDelayCode='EMSTurnaroundDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizer constraints.validation.info='EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship constraints.validation.error='EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName code.code='69466?1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Name' constraints.validation.error='EMSDispatchLocationNameCode EMSDispatchLocationNameValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship constraints.validation.error='EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude code.code='52002?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Latitude' constraints.validation.error='EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship constraints.validation.error='EMSDispatchLocationLongitudeRelationshipTemplateId' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude code.code='52003?1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Longitude' constraints.validation.error='EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizer constraints.validation.info='EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship constraints.validation.error='EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading code.code='67484?6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer beginning reading' constraints.validation.error='EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue' constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode='EMSResponseBeginningOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship constraints.validation.error='EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading code.code='67485?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer on-scene reading' constraints.validation.error='EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue' constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode='EMSResponseOnSceneOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship constraints.validation.error='EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading code.code='67486?1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer destination reading' constraints.validation.error='EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue' constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode='EMSResponseDestinationOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading code.code='67487?9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer ending reading' constraints.validation.error='EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue' constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode='EMSResponseEndingOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseDerivedEntryEMSResponseModeToScene code.code='67482?0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response mode to scene' constraints.validation.error='EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP' constraints.validation.dependOn.EMSResponseModeToSceneCode='EMSResponseModeToSceneCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSResponse extends DerivedCDASection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.3')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.3\')'"
   * @generated
   */
  boolean validateEMSResponseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67664?3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67664?3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSResponseCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Response')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Response\')'"
   * @generated
   */
  boolean validateEMSResponseTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSResponseEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSResponseEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSResponseEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponse::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSResponseEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSResponse init();
} // EMSResponse
