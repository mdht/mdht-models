/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Clinical Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getHumanClinicalSubjectDemographics()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject Demographics'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Human Clinical Subject DemographicsTemplateId Human Clinical Subject DemographicsMoodCode Human Clinical Subject DemographicsCode Human Clinical Subject DemographicsCodeP Human Clinical Subject DemographicsStudy Arm Human Clinical Subject DemographicsParticipant Human Clinical Subject DemographicsDomain Assignment Human Clinical Subject DemographicsReference Period Human Clinical Subject DemographicsAgeAssociationSubjectAgeClassCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeMoodCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeCodeP Human Clinical Subject DemographicsAgeAssociationSubjectAgeCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeValue Human Clinical Subject DemographicsAgeAssociationTypeCode Human Clinical Subject DemographicsAgeAssociationSubjectAge Human Clinical Subject DemographicsLocationParticipationStudySiteClassCode Human Clinical Subject DemographicsLocationParticipationStudySiteAddr Human Clinical Subject DemographicsLocationParticipationTypeCode' templateId.root='2.16.840.1.113883.10.20.23.46' classCode='ACT' moodCode='EVN' code.code='DMGtbd' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalSubjectDemographicsAgeAssociation typeCode='COMP' constraints.validation.error='Human Clinical Subject DemographicsAgeAssociationTypeCode Human Clinical Subject DemographicsAgeAssociationSubjectAge Human Clinical Subject DemographicsAgeAssociationSubjectAgeClassCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeMoodCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeCodeP Human Clinical Subject DemographicsAgeAssociationSubjectAgeCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeValue' constraints.validation.query='Human Clinical Subject DemographicsAgeAssociationSubjectAgeClassCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeMoodCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeCodeP Human Clinical Subject DemographicsAgeAssociationSubjectAgeCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalSubjectDemographicsAgeAssociationSubjectAge classCode='OBS' constraints.validation.error='Human Clinical Subject DemographicsAgeAssociationSubjectAgeClassCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeMoodCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeCode Human Clinical Subject DemographicsAgeAssociationSubjectAgeCodeP Human Clinical Subject DemographicsAgeAssociationSubjectAgeValue' moodCode='EVN' code.code='C25150' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalSubjectDemographicsLocationParticipation typeCode='LOC' constraints.validation.error='Human Clinical Subject DemographicsLocationParticipationTypeCode Human Clinical Subject DemographicsLocationParticipationStudySiteClassCode Human Clinical Subject DemographicsLocationParticipationStudySiteAddr' constraints.validation.query='Human Clinical Subject DemographicsLocationParticipationStudySiteClassCode Human Clinical Subject DemographicsLocationParticipationStudySiteAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmHumanClinicalSubjectDemographicsLocationParticipationStudySite classCode='SDLOC' constraints.validation.error='Human Clinical Subject DemographicsLocationParticipationStudySiteClassCode Human Clinical Subject DemographicsLocationParticipationStudySiteAddr'"
 * @generated
 */
public interface HumanClinicalSubjectDemographics extends org.eclipse.mdht.uml.cda.Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.46\')'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'DMGtbd\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsData Collection'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsStudy Arm'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyArm) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)->size() = 2'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsParticipant'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsComment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsComment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsDomain Assignment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsRelated Record'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsSupplemental Value'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsReference Period'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::ReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsFinding About'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAgeClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAgeMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAgeCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAgeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C25150\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAgeValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsAgeAssociationSubjectAge'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsLocationParticipationStudySiteClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject(classCode=vocab::RoleClassRoot::SDLOC)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsLocationParticipationStudySiteAddr'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Human Clinical Subject DemographicsLocationParticipationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)'"
	 * @generated
	 */
	boolean validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getData Collection'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)'"
	 * @generated
	 */
	DataCollection getDataCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" upper="2" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getStudy Arms'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyArm)).oclAsType(sdtm::StudyArm)'"
	 * @generated
	 */
	EList<StudyArm> getStudyArms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getDomain Assignment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)'"
	 * @generated
	 */
	DomainAssignment getDomainAssignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getRelated Records'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)'"
	 * @generated
	 */
	EList<RelatedRecord> getRelatedRecords();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getSupplemental Values'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)'"
	 * @generated
	 */
	EList<SupplementalValue> getSupplementalValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getReference Period'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::ReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::ReferencePeriod)'"
	 * @generated
	 */
	ReferencePeriod getReferencePeriod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getFinding Abouts'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)'"
	 * @generated
	 */
	EList<FindingAbout> getFindingAbouts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanClinicalSubjectDemographics init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanClinicalSubjectDemographics init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // HumanClinicalSubjectDemographics
