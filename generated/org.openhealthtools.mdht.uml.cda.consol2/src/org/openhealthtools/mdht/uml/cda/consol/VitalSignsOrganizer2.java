/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsOrganizer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsOrganizerTemplateId VitalSignsOrganizerCode VitalSignsOrganizerCodeP VitalSignsOrganizerEffectiveTime VitalSignsOrganizerVitalSignObservation VitalSignsOrganizer2CDTranslation VitalSignsOrganizer2CDTranslationP' templateId.root='2.16.840.1.113883.10.20.22.4.26' templateId.extension='2015-08-01' constraints.validation.dependOn.VitalSignsOrganizerCode='VitalSignsOrganizerCodeP' constraints.validation.warning='VitalSignsOrganizer2AuthorParticipation' constraints.validation.query='VitalSignsOrganizer2CDTranslation VitalSignsOrganizer2CDTranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolVitalSignsOrganizer2CD translation.code='74728-7' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Vital signs, weight, height, head circumference, oximetry, BMI, and BSA panel - HL7.CCDAr1.1' constraints.validation.error='VitalSignsOrganizer2CDTranslation VitalSignsOrganizer2CDTranslationP'"
 * @generated
 */
public interface VitalSignsOrganizer2 extends VitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizer2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'74728-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizer2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizer2CDTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)).oclAsType(consol::VitalSignObservation2)'"
	 * @generated
	 */
	EList<VitalSignObservation2> getConsolVitalSignObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsOrganizer2
