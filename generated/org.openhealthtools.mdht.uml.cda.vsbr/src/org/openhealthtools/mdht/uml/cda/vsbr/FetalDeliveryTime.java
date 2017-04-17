/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetal Delivery Time</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getFetalDeliveryTime()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery Time'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Fetal Delivery TimeTemplateId Fetal Delivery TimeMoodCode Fetal Delivery TimeCode Fetal Delivery TimeCodeP Fetal Delivery TimeValue Fetal Delivery TimeParticipatingLocation' templateId.root='2.16.840.1.113883.10.20.26.23' classCode='OBS' moodCode='EVN' code.code='11778-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Delivery date for patient selected by practitioner using all pertinent information'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocation typeCode='LOC' constraints.validation.error='Fetal Delivery TimeparticipatingLocationTypeCode Fetal Delivery TimeparticipatingLocationLocationRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRole classCode='SDLOC' constraints.validation.error='Fetal Delivery TimeparticipatingLocationLocationRoleClassCode Fetal Delivery TimeparticipatingLocationLocationRoleCode Fetal Delivery TimeparticipatingLocationLocationRoleCodeP Fetal Delivery TimeparticipatingLocationLocationRoleLocation' constraints.validation.warning='Fetal Delivery TimeparticipatingLocationLocationRoleId' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.info='Fetal Delivery TimeparticipatingLocationLocationRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocation classCode='PLC' constraints.validation.error='Fetal Delivery TimeparticipatingLocationLocationRoleLocationClassCode Fetal Delivery TimeparticipatingLocationLocationRoleLocationDeterminerCode' determinerCode='INSTANCE' constraints.validation.warning='Fetal Delivery TimeparticipatingLocationLocationRoleLocationName' constraints.validation.info='Fetal Delivery TimeparticipatingLocationLocationRoleLocationDesc'"
 * @generated
 */
public interface FetalDeliveryTime extends org.eclipse.mdht.uml.cda.Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.23\')'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'11778-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Fetal Delivery TimeParticipatingLocation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateFetalDeliveryTimeParticipatingLocation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetalDeliveryTime init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetalDeliveryTime init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // FetalDeliveryTime
