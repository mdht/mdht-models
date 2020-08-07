/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationActivity2TemplateId ImmunizationActivityInstructionInversion ImmunizationActivityStatusCode ImmunizationActivityStatusCodeP ImmunizationActivityAdministrationUnitCode ImmunizationActivityText ImmunizationActivityRouteCode ImmunizationActivityConsumable ImmunizationActivityConsumableImmunizationMedicationInformation ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration ImmunizationActivity2CETranslation' templateId.root='2.16.840.1.113883.10.20.22.4.52' templateId.extension='2015-08-01' constraints.validation.info='ImmunizationActivityTextReference ImmunizationActivityReferenceValue ImmunizationActivityTextReferenceValue ImmunizationActivityCode ImmunizationActivityRepeatNumber ImmunizationActivityAdministrationUnitCodeP ImmunizationActivityRouteCodeP ImmunizationActivityDrugVehicle ImmunizationActivityIndication ImmunizationActivityMedicationSupplyOrder ImmunizationActivityMedicationDispense ImmunizationActivityReactionObservation ImmunizationActivityInstructions ImmunizationActivityPrecondition ImmunizationActivity2EntryRelationshipSequenceNumber' constraints.validation.dependOn.ImmunizationActivityStatusCode='ImmunizationActivityStatusCodeP' administrationUnitCode.codeSystem='2.16.840.1.113883.5.85' administrationUnitCode.codeSystemName='orderableDrugForm' constraints.validation.dependOn.ImmunizationActivityAdministrationUnitCode='ImmunizationActivityAdministrationUnitCodeP' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.ImmunizationActivityRouteCode='ImmunizationActivityRouteCodeP' constraints.validation.warning='ImmunizationActivity2AuthorParticipation ImmunizationActivity2EntryRelationshipForSubAdminAct ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct ImmunizationActivity2CETranslationP' constraints.validation.query='ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSequenceNumber ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct ImmunizationActivityConsumableImmunizationMedicationInformation ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration ImmunizationActivity2CETranslationP ImmunizationActivity2CETranslation' constraints.validation.dependOn.ImmunizationActivity2CETranslation='ImmunizationActivity2CETranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2Consumable constraints.validation.error='ImmunizationActivityConsumableImmunizationMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2Precondition typeCode='PRCN' constraints.validation.error='ImmunizationActivityPreconditionTypeCode ImmunizationActivityPreconditionPreconditionForSubstanceAdministration'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2EntryRelationship typeCode='COMP' constraints.validation.warning='ImmunizationActivity2EntryRelationshipTypeCode ImmunizationActivity2EntryRelationshipInversionInd ImmunizationActivity2EntryRelationshipSubstanceAdministeredAct' inversionInd='true' constraints.validation.info='ImmunizationActivity2EntryRelationshipSequenceNumber'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationActivity2CE translation.codeSystem='2.16.840.1.113883.6.96' translation.codeSystemName='SNOMEDCT' constraints.validation.error='ImmunizationActivity2CETranslation' constraints.validation.warning='ImmunizationActivity2CETranslationP' constraints.validation.dependOn.ImmunizationActivity2CETranslation='ImmunizationActivity2CETranslationP'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.52\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateImmunizationActivity2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;notEmpty()'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;reject(not inversionInd.oclIsUndefined())'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;reject((sequenceNumber.oclIsUndefined() or sequenceNumber.isNullFlavorUndefined()) implies (not sequenceNumber.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)-&gt;reject(act-&gt;one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)))'"
	 * @generated
	 */
	boolean validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.routeCode-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (not translation-&gt;isEmpty()) )))'"
	 * @generated
	 */
	boolean validateImmunizationActivity2CETranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.routeCode-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (translation-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined())) )))'"
	 * @generated
	 */
	boolean validateImmunizationActivity2CETranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getParticipantRoles()-&gt;select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)'"
	 * @generated
	 */
	EList<DrugVehicle> getConsolDrugVehicles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getConsolIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()-&gt;select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationSupplyOrder2)'"
	 * @generated
	 */
	MedicationSupplyOrder2 getConsolMedicationSupplyOrder2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()-&gt;select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationDispense2)'"
	 * @generated
	 */
	MedicationDispense2 getConsolMedicationDispense2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReactionObservation2)'"
	 * @generated
	 */
	ReactionObservation2 getConsolReactionObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	Instruction2 getConsolInstruction2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationActivity2
