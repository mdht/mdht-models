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
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntry constraints.validation.error='EMSDelayEntryEMSDelayOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizer constraints.validation.error='EMSDelayOrganizerEMSDispatchDelayRelationship EMSDelayOrganizerEMSResponseDelayRelationship EMSDelayOrganizerEMSSceneDelayRelationship EMSDelayOrganizerEMSTransportDelayRelationship EMSDelayOrganizerEMSTurnaoundDelayRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationship constraints.validation.error='EMSDispatchDelayRelationshipEMSDispatchDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSDispatchDelayRelationshipEMSDispatchDelay code.code='67480-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch delay' constraints.validation.error='EMSDispatchDelayCode EMSDispatchDelayCodeP EMSDispatchDelayValue EMSDispatchDelayValueP EMSDispatchDelayMoodCode' constraints.validation.dependOn.EMSDispatchDelayCode='EMSDispatchDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationship constraints.validation.error='EMSResponseDelayRelationshipEMSResponseDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSResponseDelayRelationshipEMSResponseDelay code.code='67557-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response delay' constraints.validation.error='EMSResponseDelayCode EMSResponseDelayCodeP EMSResponseDelayValue EMSResponseDelayValueP EMSResponseDelayMoodCode' constraints.validation.dependOn.EMSResponseDelayCode='EMSResponseDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationship constraints.validation.error='EMSSceneDelayRelationshipEMSSceneDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSSceneDelayRelationshipEMSSceneDelay code.code='67558-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Scene delay' constraints.validation.error='EMSSceneDelayCode EMSSceneDelayCodeP EMSSceneDelayValue EMSSceneDelayValueP EMSSceneDelayMoodCode' constraints.validation.dependOn.EMSSceneDelayCode='EMSSceneDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationship constraints.validation.error='EMSTransportDelayRelationshipEMSTransportDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTransportDelayRelationshipEMSTransportDelay code.code='67559-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Transport delay' constraints.validation.error='EMSTransportDelayCode EMSTransportDelayCodeP EMSTransportDelayValue EMSTransportDelayValueP EMSTransportDelayMoodCode' constraints.validation.dependOn.EMSTransportDelayCode='EMSTransportDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationship constraints.validation.error='EMSTurnaoundDelayRelationshipEMSTurnaroundDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDelayEntryEMSDelayOrganizerEMSTurnaoundDelayRelationshipEMSTurnaroundDelay code.code='67560-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Turnaround delay' constraints.validation.error='EMSTurnaroundDelayCode EMSTurnaroundDelayCodeP EMSTurnaroundDelayValue EMSTurnaroundDelayValueP EMSTurnaroundDelayMoodCode' constraints.validation.dependOn.EMSTurnaroundDelayCode='EMSTurnaroundDelayCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizer constraints.validation.info='EMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship EMSDispatchLocationOrganizerEMSDispatchLocationLongtudeRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationship constraints.validation.error='EMSDispatchLocationNameRelationshipTemplateId EMSDispatchLocationNameRelationshipEMSDispatchLocationName' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationNameRelationshipEMSDispatchLocationName code.code='69466-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Name' constraints.validation.error='EMSDispatchLocationNameCode EMSDispatchLocationNameValue EMSDispatchLocationNameMoodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationship constraints.validation.error='EMSDispatchLocationLatitudeRelationshipTemplateId EMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLatitudeRelationshipEMSDispatchLocationLatitude code.code='52002-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Latitude' constraints.validation.error='EMSDispatchLocationLatitudeCode EMSDispatchLocationLatitudeValue EMSDispatchLocationLatitudeMoodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationship constraints.validation.error='EMSDispatchLocationLongitudeRelationshipTemplateId EMSDispatchLocationLongitudeRelationshipObservation' templateId.root='null'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSDispatchLocationEntryEMSDispatchLocationOrganizerEMSDispatchLocationLongitudeRelationshipEMSDispatchLocationLongitude code.code='52003-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch Location Longitude' constraints.validation.error='EMSDispatchLocationLongitudeCode EMSDispatchLocationLongitudeValue EMSDispatchLocationLongitudeMoodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntry constraints.validation.error='EMSOdometerReadingEntryEMSResponseOdometerReadingsOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizer constraints.validation.info='EMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship EMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationship constraints.validation.error='EMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseBeginningOdometerReadingRelationshipEMSResponseBeginningOdometerReading code.code='67484-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer beginning reading' constraints.validation.error='EMSResponseBeginningOdometerReadingCode EMSResponseBeginningOdometerReadingCodeP EMSResponseBeginningOdometerReadingValue EMSResponseBeginningOdometerReadingMoodCode' constraints.validation.dependOn.EMSResponseBeginningOdometerReadingCode='EMSResponseBeginningOdometerReadingCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationship constraints.validation.error='EMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseOnSceneOdometerReadingRelationshipEMSResponseOnSceneOdometerReading code.code='67485-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer on-scene reading' constraints.validation.error='EMSResponseOnSceneOdometerReadingCode EMSResponseOnSceneOdometerReadingCodeP EMSResponseOnSceneOdometerReadingValue EMSResponseOnSceneOdometerReadingMoodCode' constraints.validation.dependOn.EMSResponseOnSceneOdometerReadingCode='EMSResponseOnSceneOdometerReadingCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationship constraints.validation.error='EMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseDestinationOdometerReadingRelationshipEMSResponseDestinationOdometerReading code.code='67486-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer destination reading' constraints.validation.error='EMSResponseDestinationOdometerReadingCode EMSResponseDestinationOdometerReadingCodeP EMSResponseDestinationOdometerReadingValue EMSResponseDestinationOdometerReadingMoodCode' constraints.validation.dependOn.EMSResponseDestinationOdometerReadingCode='EMSResponseDestinationOdometerReadingCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationship constraints.validation.error='EMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSOdometerReadingEntryEMSResponseOdometerReadingOrganizerEMSResponseEndingOdometerReadingRelationshipEMSResponseEndingOdometerReading code.code='67487-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Response odometer ending reading' constraints.validation.error='EMSResponseEndingOdometerReadingCode EMSResponseEndingOdometerReadingCodeP EMSResponseEndingOdometerReadingValue EMSResponseEndingOdometerReadingMoodCode' constraints.validation.dependOn.EMSResponseEndingOdometerReadingCode='EMSResponseEndingOdometerReadingCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntry constraints.validation.error='EMSResponseModeEntryEMSResponseModeToScene'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSResponseSectionEMSResponseModeEntryEMSResponseModeToScene code.code='67482-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Response mode to scene' constraints.validation.error='EMSResponseModeToSceneCode EMSResponseModeToSceneCodeP EMSResponseModeToSceneValue EMSResponseModeToSceneValueP EMSResponseModeToSceneMoodCode' constraints.validation.dependOn.EMSResponseModeToSceneCode='EMSResponseModeToSceneCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface EMSResponseSection extends Section {
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
