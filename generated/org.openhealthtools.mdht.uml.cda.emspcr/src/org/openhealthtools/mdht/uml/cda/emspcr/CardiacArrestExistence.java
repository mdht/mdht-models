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
 * A representation of the model object '<em><b>Cardiac Arrest Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getCardiacArrestExistence()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='CardiacArrestExistenceCardiacArrestCauseRelationship CardiacArrestExistenceCardiacArrestInformantParticipation CardiacArrestExistencePriorCPRRelationship CardiacArrestExistencePriorAEDRelationship CardiacArrestExistenceSpontaneousCirculationRelationship CardiacArrestExistenceDestinationRhythmRelationship CardiacArrestExistenceArrestRhythmRelationship' constraints.validation.error='CardiacArrestExistenceTemplateId CardiacArrestExistenceCode CardiacArrestExistenceValue CardiacArrestExistenceMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.27' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='ASSERTION' constraints.validation.warning='CardiacArrestExistenceEffectiveTime CardiacArrestExistenceNegationInd' value.code='410429000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='cardiac arrest' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceCardiacArrestTimingRelationship inversionInd='TRUE' constraints.validation.error='CardiacArrestExistenceCardiacArrestTimingRelationshipInversionInd CardiacArrestExistenceCardiacArrestTimingRelationshipTypeCode' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceCardiacArrestCauseRelationship constraints.validation.error='CardiacArrestExistenceCardiacArrestCauseRelationshipCardiacArrestCause CardiacArrestExistenceCardiacArrestCauseRelationshipInversionInd CardiacArrestExistenceCardiacArrestCauseRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceCardiacArrestInformantParticipation constraints.validation.error='CardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole CardiacArrestExistenceCardiacArrestInformantParticipationTypeCode' typeCode='INF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRole classCode='AGNT' constraints.validation.error='CardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleClassCode CardiacArrestExistenceCardiacArrestInformantParticipationCardiacArrestInformantRoleCode' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistencePriorCPRRelationship constraints.validation.error='CardiacArrestExistencePriorCPRRelationshipPriorCPR CardiacArrestExistencePriorCPRRelationshipInversionInd CardiacArrestExistencePriorCPRRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistencePriorAEDRelationship constraints.validation.error='CardiacArrestExistencePriorAEDRelationshipPriorAEDUse CardiacArrestExistencePriorAEDRelationshipInversionInd CardiacArrestExistencePriorAEDRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceArrestRhythmRelationship constraints.validation.error='CardiacArrestExistenceArrestRhythmRelationshipObservation CardiacArrestExistenceArrestRhythmRelationshipInversionInd CardiacArrestExistenceArrestRhythmRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceSpontaneousCirculationRelationship constraints.validation.error='CardiacArrestExistenceSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation CardiacArrestExistenceSpontaneousCirculationRelationshipInversionInd CardiacArrestExistenceSpontaneousCirculationRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestExistenceDestinationRhythmRelationship constraints.validation.error='CardiacArrestExistenceDestinationRhythmRelationshipDestinationRhythm CardiacArrestExistenceDestinationRhythmRelationshipInversionInd CardiacArrestExistenceDestinationRhythmRelationshipTypeCode' inversionInd='TRUE' typeCode='SUBJ'"
 * @generated
 */
public interface CardiacArrestExistence extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceCardiacArrestCauseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceCardiacArrestInformantParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistencePriorCPRRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistencePriorAEDRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceSpontaneousCirculationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceDestinationRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceArrestRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.27\')'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestExistenceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'410429000\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateCardiacArrestExistenceNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestExistenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestExistence init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestExistence init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CardiacArrestExistence
