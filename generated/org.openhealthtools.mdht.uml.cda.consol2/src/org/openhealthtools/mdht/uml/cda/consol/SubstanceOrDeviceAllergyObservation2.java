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
 * A representation of the model object '<em><b>Substance Or Device Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSubstanceOrDeviceAllergyObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservation2TemplateId SubstanceOrDeviceAllergyObservationReactionInversionIndicator SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator SubstanceOrDeviceAllergyObservationEffectiveTime SubstanceOrDeviceAllergyObservationValue SubstanceOrDeviceAllergyObservationValueP SubstanceOrDeviceAllergyObservationCode SubstanceOrDeviceAllergyObservationCodeP SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.24.3.90' templateId.extension='2014-06-09' constraints.validation.warning='SubstanceOrDeviceAllergyObservationSeverityInversionIndicator SubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator SubstanceOrDeviceAllergyObservationParticipant SubstanceOrDeviceAllergyObservationReactionObservation SubstanceOrDeviceAllergyObservationSeverityObservation SubstanceOrDeviceAllergyObservation2AuthorParticipation SubstanceOrDeviceAllergyObservation2CriticalityObservation' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationValue='SubstanceOrDeviceAllergyObservationValueP' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationCode='SubstanceOrDeviceAllergyObservationCodeP' constraints.validation.info='SubstanceOrDeviceAllergyObservationAllergyStatusObservation SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance' constraints.validation.query='SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2IVLTS constraints.validation.error='SubstanceOrDeviceAllergyObservation2IVLTSLow' constraints.validation.info='SubstanceOrDeviceAllergyObservation2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2Participant constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRole constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntity constraints.validation.info='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance' constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation' constraints.validation.query='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityCE constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="duplicates"
 * @generated
 */
public interface SubstanceOrDeviceAllergyObservation2 extends SubstanceOrDeviceAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::CriticalityObservation))-&gt;forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.24.3.90\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CriticalityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)'"
	 * @generated
	 */
	EList<ReactionObservation2> getConsolReactionObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SeverityObservation2)'"
	 * @generated
	 */
	SeverityObservation2 getConsolSeverityObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CriticalityObservation))-&gt;asSequence()-&gt;any(true).oclAsType(consol::CriticalityObservation)'"
	 * @generated
	 */
	CriticalityObservation getCriticalityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergyStatusObservation2)'"
	 * @generated
	 */
	AllergyStatusObservation2 getConsolAllergyStatusObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SubstanceOrDeviceAllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubstanceOrDeviceAllergyObservation2
