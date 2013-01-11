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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Response' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Response Section' templateId.root='2.16.840.1.113883.17.3.10.1.3' constraints.validation.error='EMSResponseSectionTemplateId EMSResponseSectionCode EMSResponseSectionCodeP EMSResponseSectionTitle EMSResponseSectionText EMSResponseSectionEntry1 EMSResponseSectionEntry2 EMSResponseSectionEntry3 EMSResponseSectionEntry4' code.codeSystemName='LOINC' code.code='67664-3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntry constraints.validation.error='EMSDelayEntryEMSDelayOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizer constraints.validation.error='EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationship constraints.validation.error='EMSDispatchDelayRelationshipEMSDispatchDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Dispatch delay' constraints.validation.error='EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSDispatchDelayCode='EMSDispatchDelayCodeP' code.code='67480-4' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationship constraints.validation.error='EMSResponseDelayRelationshipEMSResponseDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Response delay' constraints.validation.error='EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSResponseDelayCode='EMSResponseDelayCodeP' code.code='67557-9' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationship constraints.validation.error='EMSSceneDelayRelationshipEMSSceneDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Scene delay' constraints.validation.error='EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP' code.codeSystemName='LOINC' code.code='67558-7' constraints.validation.dependOn.EMSSceneDelayCode='EMSSceneDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationship constraints.validation.error='EMSTransportDelayRelationshipEMSTransportDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay constraints.validation.dependOn.EMSTransportDelayCode='EMSTransportDelayCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Transport delay' constraints.validation.error='EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP' code.codeSystemName='LOINC' code.code='67559-5' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship constraints.validation.error='EMSTurnaoundDelayRelationshipEMSTurnaroundDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Turnaround delay' constraints.validation.dependOn.EMSTurnaroundDelayCode='EMSTurnaroundDelayCodeP' constraints.validation.error='EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP' code.codeSystemName='LOINC' code.code='67560-3' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizer constraints.validation.info='EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship templateId.root='null' constraints.validation.error='EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Dispatch Location Name' constraints.validation.error='EMSDispatchLocationNameCode EMSDispatchLocationNameValue' code.codeSystemName='LOINC' code.code='69466-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship templateId.root='null' constraints.validation.error='EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Dispatch Location Latitude' constraints.validation.error='EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue' code.codeSystemName='LOINC' code.code='52002-3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship templateId.root='null' constraints.validation.error='EMSDispatchLocationLongitudeRelationshipTemplateId EMSDispatchLocationLongitudeRelationshipObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Dispatch Location Longitude' constraints.validation.error='EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue' code.codeSystemName='LOINC' code.code='52003-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntry constraints.validation.error='EMSOdometerReadingEntryEMSResponseOdometerReadingsOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizer constraints.validation.info='EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship constraints.validation.error='EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Response odometer beginning reading' constraints.validation.error='EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue' code.codeSystemName='LOINC' code.code='67484-6' constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode='EMSResponseBeginningOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship constraints.validation.error='EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Response odometer on-scene reading' constraints.validation.error='EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue' code.codeSystemName='LOINC' code.code='67485-3' constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode='EMSResponseOnSceneOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship constraints.validation.error='EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Response odometer destination reading' constraints.validation.error='EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue' code.codeSystemName='LOINC' code.code='67486-1' constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode='EMSResponseDestinationOdometerReadingCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship constraints.validation.error='EMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Response odometer ending reading' constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode='EMSResponseEndingOdometerReadingCodeP' constraints.validation.error='EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue' code.codeSystemName='LOINC' code.code='67487-9'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntry constraints.validation.error='EMSResponseModeEntryEMSResponseModeToScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToScene value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Response mode to scene' constraints.validation.error='EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSResponseModeToSceneCode='EMSResponseModeToSceneCodeP' code.code='67482-0' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSResponseSection extends Section {
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
	boolean validateEMSResponseSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67664-3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67664-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSResponseSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSResponseSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSResponseSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSResponseSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDelayEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDelayEntry))'"
   * @generated
   */
	boolean validateEMSResponseSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDispatchLocationEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDispatchLocationEntry))'"
   * @generated
   */
	boolean validateEMSResponseSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSOdometerReadingEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSOdometerReadingEntry))'"
   * @generated
   */
	boolean validateEMSResponseSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSResponseModeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSResponseModeEntry))'"
   * @generated
   */
	boolean validateEMSResponseSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDelayEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSDelayEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDelayEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSDelayEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDispatchLocationEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSDispatchLocationEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSDispatchLocationEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSDispatchLocationEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSOdometerReadingEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSOdometerReadingEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSOdometerReadingEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSOdometerReadingEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSResponseModeEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSResponseModeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSResponseSection::EMSResponseModeEntry))->asSequence()->first().oclAsType(emspcr::EMSResponseSection::EMSResponseModeEntry)'"
   * @generated
   */
  void getEntry4();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSResponseSection init();
} // EMSResponseSection
