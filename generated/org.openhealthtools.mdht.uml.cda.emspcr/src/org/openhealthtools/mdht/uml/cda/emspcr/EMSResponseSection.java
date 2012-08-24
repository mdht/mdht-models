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
 * A representation of the model object '<em><b>EMS Response Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSResponseSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSResponseSectionTemplateId EMSResponseSectionCode EMSResponseSectionCodeP EMSResponseSectionTitle EMSResponseSectionText EMSResponseSectionEntry1 EMSResponseSectionEntry2 EMSResponseSectionEntry3 EMSResponseSectionEntry4' templateId.root='2.16.840.1.113883.17.3.10.1.3' code.code='67664-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response Section' title.mixed='EMS Response'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntry constraints.validation.error='DerivedEntryEMSResponseModeToScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizer constraints.validation.error='EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationship constraints.validation.error='EMSDispatchDelayRelationshipEMSDispatchDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay code.code='67480-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch delay' constraints.validation.error='EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP' constraints.validation.dependOn.EMSDispatchDelayCode='EMSDispatchDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationship constraints.validation.error='EMSResponseDelayRelationshipEMSResponseDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay code.code='67557-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response delay' constraints.validation.error='EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP' constraints.validation.dependOn.EMSResponseDelayCode='EMSResponseDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationship constraints.validation.error='EMSSceneDelayRelationshipEMSSceneDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay code.code='67558-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Scene delay' constraints.validation.error='EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP' constraints.validation.dependOn.EMSSceneDelayCode='EMSSceneDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationship constraints.validation.error='EMSTransportDelayRelationshipEMSTransportDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay code.code='67559-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Transport delay' constraints.validation.error='EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP' constraints.validation.dependOn.EMSTransportDelayCode='EMSTransportDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship constraints.validation.error='EMSTurnaoundDelayRelationshipEMSTurnaroundDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay code.code='67560-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Turnaround delay' constraints.validation.error='EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP' constraints.validation.dependOn.EMSTurnaroundDelayCode='EMSTurnaroundDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizer constraints.validation.info='EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship constraints.validation.error='EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName code.code='69466-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Name' constraints.validation.error='EMSDispatchLocationNameCode EMSDispatchLocationNameValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship constraints.validation.error='EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude code.code='52002-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Latitude' constraints.validation.error='EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship constraints.validation.error='EMSDispatchLocationLongitudeRelationshipTemplateId EMSDispatchLocationLongitudeRelationshipObservation' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude code.code='52003-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Longitude' constraints.validation.error='EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizer constraints.validation.info='EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship constraints.validation.error='EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading code.code='67484-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer beginning reading' constraints.validation.error='EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue' constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode='EMSResponseBeginningOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship constraints.validation.error='EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading code.code='67485-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer on-scene reading' constraints.validation.error='EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue' constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode='EMSResponseOnSceneOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship constraints.validation.error='EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading code.code='67486-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer destination reading' constraints.validation.error='EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue' constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode='EMSResponseDestinationOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship constraints.validation.error='EMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading code.code='67487-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer ending reading' constraints.validation.error='EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue' constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode='EMSResponseEndingOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionDerivedEntryEMSResponseModeToScene code.code='67482-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response mode to scene' constraints.validation.error='EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP' constraints.validation.dependOn.EMSResponseModeToSceneCode='EMSResponseModeToSceneCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSResponseSection extends Section
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.3\')'"
   * @generated
   */
  boolean validateEMSResponseSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67664-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSResponseSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Response\')'"
   * @generated
   */
  boolean validateEMSResponseSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSResponseSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSResponseSection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSResponseSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSResponseSection
