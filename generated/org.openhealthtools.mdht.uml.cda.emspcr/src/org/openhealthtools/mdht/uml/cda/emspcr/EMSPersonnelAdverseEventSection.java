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
 * A representation of the model object '<em><b>EMS Personnel Adverse Event Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSPersonnelAdverseEventSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSPersonnelAdverseEventSectionTemplateId EMSPersonnelAdverseEventSectionCode EMSPersonnelAdverseEventSectionCodeP EMSPersonnelAdverseEventSectionTitle EMSPersonnelAdverseEventSectionText EMSPersonnelAdverseEventSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.6' code.code='67658-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Exposures or Injuries of EMS Personnel Section' title.mixed='Exposures or Injuries of EMS Personnel' constraints.validation.info='EMSPersonnelAdverseEventSectionEntry2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntry constraints.validation.error='EMSExposureOrInjuryEntryEMSExposureOrInjuryIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionEMSExposureOrInjuryEntryEMSAdverseEventIndicator code.code='67554-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS personnel exposed or injured' constraints.validation.error='EMSAdverseEventIndicatorCode EMSAdverseEventIndicatorCodeP EMSAdverseEventIndicatorValue' constraints.validation.dependOn.EMSAdverseEventIndicatorCode='EMSAdverseEventIndicatorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntry constraints.validation.error='AdverseEventTypeEntryEMSAdverseEventTypeObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPersonnelAdverseEventSectionAdverseEventTypeEntryEMSAdverseEventTypeObservation code.code='67555-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS personnel adverse event type' constraints.validation.error='EMSAdverseEventTypeObservationCode EMSAdverseEventTypeObservationCodeP EMSAdverseEventTypeObservationValue EMSAdverseEventTypeObservationValueP' constraints.validation.dependOn.EMSAdverseEventTypeObservationCode='EMSAdverseEventTypeObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSPersonnelAdverseEventSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.6\')'"
	* @generated
	*/
	boolean validateEMSPersonnelAdverseEventSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67658-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSPersonnelAdverseEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPersonnelAdverseEventSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPersonnelAdverseEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Exposures or Injuries of EMS Personnel\')'"
	* @generated
	*/
	boolean validateEMSPersonnelAdverseEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPersonnelAdverseEventSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSPersonnelAdverseEventSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSPersonnelAdverseEventSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPersonnelAdverseEventSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSPersonnelAdverseEventSection
