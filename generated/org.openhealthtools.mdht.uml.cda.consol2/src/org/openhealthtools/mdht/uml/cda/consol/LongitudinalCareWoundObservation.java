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
 * A representation of the model object '<em><b>Longitudinal Care Wound Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getLongitudinalCareWoundObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemObservationTemplateId LongitudinalCareWoundObservationClassCode LongitudinalCareWoundObservationMoodCode LongitudinalCareWoundObservationCode LongitudinalCareWoundObservationCodeP LongitudinalCareWoundObservationValueP LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue' templateId.root='2.16.840.1.113883.10.20.22.4.114' templateId.extension='2015-08-01' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='assertion' constraints.validation.dependOn.LongitudinalCareWoundObservationCode='LongitudinalCareWoundObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.warning='LongitudinalCareWoundObservationValue LongitudinalCareWoundObservationTargetSiteCode LongitudinalCareWoundObservationTargetSiteCodeP LongitudinalCareWoundObservationWoundMeasurementObservation LongitudinalCareWoundObservationWoundCharacteristics LongitudinalCareWoundObservationAuthorParticipation LongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.dependOn.LongitudinalCareWoundObservationValue='LongitudinalCareWoundObservationValueP' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.LongitudinalCareWoundObservationTargetSiteCode='LongitudinalCareWoundObservationTargetSiteCodeP' constraints.validation.info='LongitudinalCareWoundObservationHighestPressureUlcerStage LongitudinalCareWoundObservationNumberOfPressureUlcersObservation2 LongitudinalCareWoundObservationCDQualifier' constraints.validation.query='LongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue LongitudinalCareWoundObservationCDQualifier'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCD constraints.validation.info='LongitudinalCareWoundObservationCDQualifier' constraints.validation.warning='CDCRLongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.query='CDCRLongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue' constraints.validation.error='LongitudinalCareWoundObservationCDCRCDCode LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCDCR name.code='272741003' name.codeSystem='2.16.840.1.113883.6.96' name.codeSystemName='SNOMEDCT' name.displayName='laterality' constraints.validation.error='LongitudinalCareWoundObservationCDCRName LongitudinalCareWoundObservationCDCRNameP LongitudinalCareWoundObservationCDCRValue LongitudinalCareWoundObservationCDCRCDCode' constraints.validation.warning='CRLongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.query='CRLongitudinalCareWoundObservationCDCRCDValueTerminology LongitudinalCareWoundObservationCDCRCDCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolLongitudinalCareWoundObservationCDCRCD constraints.validation.warning='LongitudinalCareWoundObservationCDCRCDValueTerminology' constraints.validation.error='LongitudinalCareWoundObservationCDCRCDCode'"
 * @generated
 */
public interface LongitudinalCareWoundObservation extends ProblemObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundMeasurementObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationWoundMeasurementObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::WoundCharacteristic) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationWoundCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HighestPressureUlcerStage) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationHighestPressureUlcerStage(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateLongitudinalCareWoundObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject(code = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRCDValueTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined()).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRCDCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined() and name.oclIsKindOf(datatypes::CV) and \r\nlet value : datatypes::CV = name.oclAsType(datatypes::CV) in \r\nvalue.code = \'272741003\' and value.codeSystem = \'2.16.840.1.113883.6.96\') )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRNameP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined()).qualifier->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDCRValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((qualifier->isEmpty() or qualifier->exists(element | element.isNullFlavorUndefined())) implies (not qualifier->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateLongitudinalCareWoundObservationCDQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundMeasurementObservation)).oclAsType(consol::WoundMeasurementObservation)'"
	 * @generated
	 */
	EList<WoundMeasurementObservation> getWoundMeasurementObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::WoundCharacteristic)).oclAsType(consol::WoundCharacteristic)'"
	 * @generated
	 */
	EList<WoundCharacteristic> getWoundCharacteristicss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage))->asSequence()->any(true).oclAsType(consol::HighestPressureUlcerStage)'"
	 * @generated
	 */
	HighestPressureUlcerStage getHighestPressureUlcerStage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation2)).oclAsType(consol::NumberOfPressureUlcersObservation2)'"
	 * @generated
	 */
	EList<NumberOfPressureUlcersObservation2> getNumberOfPressureUlcersObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudinalCareWoundObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudinalCareWoundObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // LongitudinalCareWoundObservation
