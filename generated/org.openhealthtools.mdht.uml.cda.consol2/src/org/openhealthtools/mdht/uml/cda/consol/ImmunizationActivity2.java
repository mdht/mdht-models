/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationActivityTemplateId ImmunizationActivityInstructionInversion ImmunizationActivityStatusCode ImmunizationActivityStatusCodeP ImmunizationActivityAdministrationUnitCode ImmunizationActivityText ImmunizationActivityConsumable ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct ImmunizationActivityConsumableImmunizationMedicationInformation ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration' templateId.root='2.16.840.1.113883.10.20.22.4.52' templateId.extension='2015-08-01' constraints.validation.info='ImmunizationActivityTextReference ImmunizationActivityReferenceValue ImmunizationActivityTextReferenceValue ImmunizationActivityCode ImmunizationActivityRepeatNumber ImmunizationActivityAdministrationUnitCodeP ImmunizationActivityDrugVehicle ImmunizationActivityIndication ImmunizationActivityMedicationSupplyOrder ImmunizationActivityMedicationDispense ImmunizationActivityReactionObservation ImmunizationActivityInstructions ImmunizationActivityPrecondition ImmunizationActivity2EntryRelationshipSequenceNumber' constraints.validation.dependOn.ImmunizationActivityStatusCode='ImmunizationActivityStatusCodeP' administrationUnitCode.codeSystem='2.16.840.1.113883.5.85' administrationUnitCode.codeSystemName='orderableDrugForm' constraints.validation.dependOn.ImmunizationActivityAdministrationUnitCode='ImmunizationActivityAdministrationUnitCodeP' constraints.validation.warning='ImmunizationActivity2AuthorParticipation ImmunizationActivity2EntryRelationshipForSubAdminAct' constraints.validation.query='ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSequenceNumber ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct ImmunizationActivityConsumableImmunizationMedicationInformation ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2Consumable constraints.validation.error='ImmunizationActivityConsumableImmunizationMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2Precondition typeCode='PRCN' constraints.validation.error='ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2EntryRelationship typeCode='COMP' constraints.validation.error='ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct' inversionInd='true' constraints.validation.info='ImmunizationActivity2EntryRelationshipSequenceNumber'"
 * @generated
 */
public interface ImmunizationActivity2 extends ImmunizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateImmunizationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateImmunizationActivity2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->notEmpty()'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipForSubAdminAct(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->reject(not inversionInd.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->reject((sequenceNumber.oclIsUndefined() or sequenceNumber.isNullFlavorUndefined()) implies (not sequenceNumber.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)))'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)'"
	 * @generated
	 */
	EList<DrugVehicle> getConsolDrugVehicles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getConsolIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder2)'"
	 * @generated
	 */
	MedicationSupplyOrder2 getConsolMedicationSupplyOrder2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2))->asSequence()->any(true).oclAsType(consol::MedicationDispense2)'"
	 * @generated
	 */
	MedicationDispense2 getConsolMedicationDispense2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2))->asSequence()->any(true).oclAsType(consol::ReactionObservation2)'"
	 * @generated
	 */
	ReactionObservation2 getConsolReactionObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	Instruction2 getConsolInstruction2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationActivity2
