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
 * A representation of the model object '<em><b>Cardiac Arrest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getCardiacArrest()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='CardiacArrestCauseRelationship CardiacArrestInformantParticipation CardiacArrestPriorCPRRelationship CardiacArrestPriorAEDRelationship CardiacArrestSpontaneousCirculationRelationship CardiacArrestDestinationRhythmRelationship CardiacArrestArrestRhythmRelationship' constraints.validation.error='CardiacArrestTemplateId CardiacArrestMoodCode CardiacArrestCode CardiacArrestValue' templateId.root='2.16.840.1.1133883.17.3.10.1.27' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='ASSERTION' constraints.validation.warning='CardiacArrestNegationInd CardiacArrestEffectiveTime' value.code='410429000' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' value.displayName='cardiac arrest'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestCardiacArrestTimingRelationship typeCode='SUBJ' constraints.validation.error='CardiacArrestCardiacArrestTimingRelationshipTypeCode CardiacArrestCardiacArrestTimingRelationshipInversionInd' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestCardiacArrestCauseRelationship constraints.validation.error='CardiacArrestCardiacArrestCauseRelationshipCardiacArrestCause CardiacArrestCardiacArrestCauseRelationshipTypeCode CardiacArrestCardiacArrestCauseRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestCardiacArrestInformantParticipation constraints.validation.error='CardiacArrestCardiacArrestInformantParticipationCardiacArrestInformantRole CardiacArrestCardiacArrestInformantParticipationTypeCode' typeCode='INF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestCardiacArrestInformantParticipationCardiacArrestInformantRole classCode='AGNT' constraints.validation.error='CardiacArrestCardiacArrestInformantParticipationCardiacArrestInformantRoleClassCode CardiacArrestCardiacArrestInformantParticipationCardiacArrestInformantRoleCode' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestPriorCPRRelationship constraints.validation.error='CardiacArrestPriorCPRRelationshipPriorCPR CardiacArrestPriorCPRRelationshipTypeCode CardiacArrestPriorCPRRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestPriorAEDRelationship constraints.validation.error='CardiacArrestPriorAEDRelationshipPriorAEDUse CardiacArrestPriorAEDRelationshipTypeCode CardiacArrestPriorAEDRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestArrestRhythmRelationship constraints.validation.error='CardiacArrestArrestRhythmRelationshipObservation CardiacArrestArrestRhythmRelationshipTypeCode CardiacArrestArrestRhythmRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestSpontaneousCirculationRelationship constraints.validation.error='CardiacArrestSpontaneousCirculationRelationshipReturnOfSpontaneousCirculation CardiacArrestSpontaneousCirculationRelationshipTypeCode CardiacArrestSpontaneousCirculationRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCardiacArrestDestinationRhythmRelationship constraints.validation.error='CardiacArrestDestinationRhythmRelationshipDestinationRhythm CardiacArrestDestinationRhythmRelationshipTypeCode CardiacArrestDestinationRhythmRelationshipInversionInd' typeCode='SUBJ' inversionInd='TRUE'"
 * @generated
 */
public interface CardiacArrest extends Observation {
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
	boolean validateCardiacArrestCauseRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestInformantParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestPriorCPRRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestPriorAEDRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestSpontaneousCirculationRelationship(DiagnosticChain diagnostics,
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
	boolean validateCardiacArrestDestinationRhythmRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestArrestRhythmRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCardiacArrestValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CardiacArrest
