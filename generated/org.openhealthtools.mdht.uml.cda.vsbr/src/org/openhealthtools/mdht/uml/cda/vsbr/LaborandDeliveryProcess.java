/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laborand Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getLaborandDeliveryProcess()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery Process'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Labor and Delivery ProcessTemplateId Labor and Delivery ProcessClassCode Labor and Delivery ProcessMoodCode Labor and Delivery ProcessCode Labor and Delivery ProcessCodeP Labor and Delivery ProcessAttendantParticipation Labor and Delivery ProcessEntryRelationship Labor and Delivery ProcessMaternalTransfer Labor and Delivery ProcessParticipatingLocation Labor and Delivery ProcessMaternalMorbidities Labor and Delivery ProcessRiskFactors' templateId.root='2.16.840.1.113883.10.20.26.31' classCode='ACT' moodCode='EVN' code.code='57074-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Labor and delivery process'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipation typeCode='PRF' constraints.validation.error='Labor and Delivery ProcessattendantParticipationTypeCode Labor and Delivery ProcessattendantParticipationAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRole classCode='ASSIGNED' constraints.validation.error='Labor and Delivery ProcessattendantParticipationattendantRoleClassCode Labor and Delivery ProcessattendantParticipationattendantRoleCode Labor and Delivery ProcessattendantParticipationattendantRoleCodeP Labor and Delivery ProcessattendantParticipationattendantRoleAttendant' constraints.validation.warning='Labor and Delivery ProcessattendantParticipationattendantRoleId' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendant classCode='PSN' constraints.validation.error='Labor and Delivery ProcessattendantParticipationattendantRoleAttendantClassCode Labor and Delivery ProcessattendantParticipationattendantRoleAttendantDeterminerCode Labor and Delivery ProcessattendantParticipationattendantRoleAttendantName' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociation typeCode='COMP' constraints.validation.error='Labor and Delivery ProcesspaymentSourceAssociationTypeCode Labor and Delivery ProcesspaymentSourceAssociationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSource classCode='OBS' constraints.validation.error='Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceClassCode Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceMoodCode Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceCode Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceCodeP Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceValue Labor and Delivery ProcesspaymentSourceAssociationpaymentSourceValueP' moodCode='EVN' code.code='68461-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Payment source'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocation typeCode='LOC' constraints.validation.error='Labor and Delivery ProcessparticipatingLocationTypeCode Labor and Delivery ProcessparticipatingLocationLocationRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRole classCode='BIRTHPL' constraints.validation.error='Labor and Delivery ProcessparticipatingLocationLocationRoleClassCode Labor and Delivery ProcessparticipatingLocationLocationRoleCode Labor and Delivery ProcessparticipatingLocationLocationRoleCodeP' constraints.validation.warning='Labor and Delivery ProcessparticipatingLocationLocationRoleId Labor and Delivery ProcessparticipatingLocationLocationRolePlayingEntity' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.info='Labor and Delivery ProcessparticipatingLocationLocationRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocation classCode='PLC' constraints.validation.error='Labor and Delivery ProcessparticipatingLocationLocationRoleLocationClassCode Labor and Delivery ProcessparticipatingLocationLocationRoleLocationDeterminerCode' determinerCode='INSTANCE' constraints.validation.warning='Labor and Delivery ProcessparticipatingLocationLocationRoleLocationName' constraints.validation.info='Labor and Delivery ProcessparticipatingLocationLocationRoleLocationDesc'"
 * @generated
 */
public interface LaborandDeliveryProcess extends org.eclipse.mdht.uml.cda.Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.31\')'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'57074-7\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessAttendantParticipation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessAttendantParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessEntryRelationship'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessCharacteristicsOfLaborAndDelivery'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::CharacteristicofLaborandDelivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessHomeBirthPlan'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::PlannedHomeBirth) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessHomeBirthPlan(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessMaternalTransfer'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::MaternalTransfer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessMaternalTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessParticipatingLocation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessParticipatingLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessMaternalMorbidities'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::MaternalMorbidity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessMaternalMorbidities(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Labor and Delivery ProcessRiskFactors'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::PregnancyRiskFactor) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateLaborandDeliveryProcessRiskFactors(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CharacteristicofLaborandDelivery)).oclAsType(vsbr::CharacteristicofLaborandDelivery)'"
	 * @generated
	 */
	EList<CharacteristicofLaborandDelivery> getCharacteristicsOfLaborAndDeliveries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::PlannedHomeBirth))->asSequence()->any(true).oclAsType(vsbr::PlannedHomeBirth)'"
	 * @generated
	 */
	PlannedHomeBirth getHomeBirthPlan();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::MaternalTransfer))->asSequence()->any(true).oclAsType(vsbr::MaternalTransfer)'"
	 * @generated
	 */
	MaternalTransfer getMaternalTransfer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::MaternalMorbidity)).oclAsType(vsbr::MaternalMorbidity)'"
	 * @generated
	 */
	EList<MaternalMorbidity> getMaternalMorbiditiess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::PregnancyRiskFactor)).oclAsType(vsbr::PregnancyRiskFactor)'"
	 * @generated
	 */
	EList<PregnancyRiskFactor> getRiskFactorss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcess init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcess init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // LaborandDeliveryProcess
