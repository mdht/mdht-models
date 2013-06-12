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

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardiac Rhythm</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getCardiacRhythm()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='CardiacRhythmParticipant1' constraints.validation.error='CardiacRhythmTemplateId CardiacRhythmCode CardiacRhythmCodeP CardiacRhythmMethodCode CardiacRhythmMethodCodeP CardiacRhythmValue CardiacRhythmValueP CardiacRhythmMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.169' code.code='67519-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac rhythm' constraints.validation.dependOn.CardiacRhythmCode='CardiacRhythmCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' constraints.validation.info='CardiacRhythmEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacRhythmECGParticipant constraints.validation.error='ECGParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacRhythmECGParticipantECGParticipantRole constraints.validation.error='ECGParticipantRolePlayingDevice'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacRhythmECGParticipantECGParticipantRoleECGDevice code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='ECGDeviceCode ECGDeviceCodeP'"
 * @generated
 */
public interface CardiacRhythm extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateCardiacRhythmParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.169\')'"
	 * @generated
	 */
	boolean validateCardiacRhythmTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacRhythmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'67519-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCardiacRhythmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1 and self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA18682-7\' or value.code = \'LA18683-5\' or value.code = \'LA18684-3\' or value.code = \'LA18685-0\')))'"
	 * @generated
	 */
	boolean validateCardiacRhythmMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1)'"
	 * @generated
	 */
	boolean validateCardiacRhythmMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA12904-1\' or value.code = \'LA12904-1\' or value.code = \'LA17059-9\' or value.code = \'LA17059-9\' or value.code = \'LA17068-0\' or value.code = \'LA17068-0\' or value.code = \'LA17070-6\' or value.code = \'LA17070-6\' or value.code = \'LA17071-4\' or value.code = \'LA17071-4\' or value.code = \'LA17072-2\' or value.code = \'LA17072-2\' or value.code = \'LA17073-0\' or value.code = \'LA17073-0\' or value.code = \'LA17074-8\' or value.code = \'LA17074-8\' or value.code = \'LA17083-9\' or value.code = \'LA17083-9\' or value.code = \'LA17084-7\' or value.code = \'LA17084-7\' or value.code = \'LA17085-4\' or value.code = \'LA17085-4\' or value.code = \'LA17086-2\' or value.code = \'LA17086-2\' or value.code = \'LA17087-0\' or value.code = \'LA17087-0\' or value.code = \'LA17088-8\' or value.code = \'LA17088-8\' or value.code = \'LA17089-6\' or value.code = \'LA17089-6\' or value.code = \'LA17090-4\' or value.code = \'LA17090-4\' or value.code = \'LA17091-2\' or value.code = \'LA17091-2\' or value.code = \'LA17093-8\' or value.code = \'LA17093-8\' or value.code = \'LA17094-6\' or value.code = \'LA17094-6\' or value.code = \'LA17095-3\' or value.code = \'LA17095-3\' or value.code = \'LA17096-1\' or value.code = \'LA17096-1\' or value.code = \'LA17097-9\' or value.code = \'LA17097-9\' or value.code = \'LA17098-7\' or value.code = \'LA17098-7\' or value.code = \'LA17099-5\' or value.code = \'LA17099-5\' or value.code = \'LA17100-1\' or value.code = \'LA17100-1\' or value.code = \'LA17101-9\' or value.code = \'LA17101-9\' or value.code = \'LA17703-2\' or value.code = \'LA17703-2\' or value.code = \'LA17704-0\' or value.code = \'LA17704-0\' or value.code = \'LA17705-7\' or value.code = \'LA17705-7\' or value.code = \'LA17706-5\' or value.code = \'LA17706-5\' or value.code = \'LA17708-1\' or value.code = \'LA17708-1\' or value.code = \'LA17718-0\' or value.code = \'LA17718-0\' or value.code = \'LA18205-7\' or value.code = \'LA18205-7\' or value.code = \'LA18206-5\' or value.code = \'LA18206-5\' or value.code = \'LA18207-3\' or value.code = \'LA18207-3\' or value.code = \'LA18208-1\' or value.code = \'LA18208-1\')))'"
	 * @generated
	 */
	boolean validateCardiacRhythmValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateCardiacRhythmValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCardiacRhythmEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateCardiacRhythmMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacRhythm init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CardiacRhythm init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CardiacRhythm
