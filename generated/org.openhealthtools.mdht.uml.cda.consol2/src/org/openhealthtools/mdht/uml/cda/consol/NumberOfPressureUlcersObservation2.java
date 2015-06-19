/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Of Pressure Ulcers Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getNumberOfPressureUlcersObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='NumberOfPressureUlcersObservationTemplateId NumberOfPressureUlcersObservationCode NumberOfPressureUlcersObservationCodeP NumberOfPressureUlcersObservationEntryRelationship NumberOfPressureUlcersObservationEntryRelationshipObservationClassCode NumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP NumberOfPressureUlcersObservation2EntryRelationshipObservationCode NumberOfPressureUlcersObservationEntryRelationshipObservationValueP NumberOfPressureUlcersObservationEntryRelationshipTypeCode NumberOfPressureUlcersObservationEntryRelationshipObservation' templateId.root='2.16.840.1.113883.10.20.22.4.76' templateId.extension='2014-06-09' code.code='75277-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Number of pressure ulcers' constraints.validation.dependOn.NumberOfPressureUlcersObservationCode='NumberOfPressureUlcersObservationCodeP' constraints.validation.query='NumberOfPressureUlcersObservationEntryRelationshipObservationClassCode NumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP NumberOfPressureUlcersObservation2EntryRelationshipObservationCode NumberOfPressureUlcersObservationEntryRelationshipObservationValueP NumberOfPressureUlcersObservationEntryRelationshipObservationValue NumberOfPressureUlcersObservationEntryRelationshipTypeCode NumberOfPressureUlcersObservationEntryRelationshipObservation' constraints.validation.dependOn.NumberOfPressureUlcersObservation2EntryRelationshipObservationCode='NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP' constraints.validation.warning='NumberOfPressureUlcersObservationEntryRelationshipObservationValue' constraints.validation.dependOn.NumberOfPressureUlcersObservationEntryRelationshipObservationValue='NumberOfPressureUlcersObservationEntryRelationshipObservationValueP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolNumberOfPressureUlcersObservation2EntryRelationship typeCode='SUBJ' constraints.validation.error='NumberOfPressureUlcersObservationEntryRelationshipTypeCode NumberOfPressureUlcersObservationEntryRelationshipObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolNumberOfPressureUlcersObservation2EntryRelationshipObservation classCode='OBS' constraints.validation.error='NumberOfPressureUlcersObservationEntryRelationshipObservationClassCode NumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode NumberOfPressureUlcersObservation2EntryRelationshipObservationCode NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP NumberOfPressureUlcersObservationEntryRelationshipObservationValueP' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.NumberOfPressureUlcersObservation2EntryRelationshipObservationCode='NumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.warning='NumberOfPressureUlcersObservationEntryRelationshipObservationValue' constraints.validation.dependOn.NumberOfPressureUlcersObservationEntryRelationshipObservationValue='NumberOfPressureUlcersObservationEntryRelationshipObservationValueP'"
 * @generated
 */
public interface NumberOfPressureUlcersObservation2 extends NumberOfPressureUlcersObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\'))'"
	 * @generated
	 */
	boolean validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPressureUlcersObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPressureUlcersObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NumberOfPressureUlcersObservation2
