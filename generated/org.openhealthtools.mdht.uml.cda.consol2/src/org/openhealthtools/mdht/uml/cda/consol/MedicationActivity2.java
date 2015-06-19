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
 * A representation of the model object '<em><b>Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationActivityTemplateId MedicationActivityInstructionsInversionInd MedicationActivity2SubstanceAdministeredActInversionInd MedicationActivityEffectiveTimeIVLTSorTS MedicationActivity2EffectiveTimeIVLTSLowXorValue MedicationActivityStatusCode MedicationActivityStatusCodeP MedicationActivityRouteCode MedicationActivityDoseQuantity MedicationActivityAdministrationUnitCode MedicationActivityConsumable MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration MedicationActivityConsumableMedicationInformation' templateId.root='2.16.840.1.113883.10.20.22.4.16' templateId.extension='2014-06-09' constraints.validation.warning='MedicationActivityDoseQuantityorrateQuantity MedicationActivityEffectiveTimeIVLTSLow MedicationActivityEffectiveTimePIVLTS MedicationActivityRouteCodeP MedicationActivity2AuthorParticipation' constraints.validation.info='MedicationActivity2SubstanceAdministeredActSequenceNumber MedicationActivityEffectiveTimeIVLTSHigh MedicationActivityCode MedicationActivityRepeatNumber MedicationActivityAdministrationUnitCodeP MedicationActivity2DrugMonitoringAct MedicationActivityInstructions MedicationActivity2SubstanceAdministeredAct MedicationActivityIndication MedicationActivityMedicationSupplyOrder MedicationActivityMedicationDispense MedicationActivityReactionObservation MedicationActivityPrecondition' constraints.validation.dependOn.MedicationActivityStatusCode='MedicationActivityStatusCodeP' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.MedicationActivityRouteCode='MedicationActivityRouteCodeP' administrationUnitCode.codeSystemName='' constraints.validation.dependOn.MedicationActivityAdministrationUnitCode='MedicationActivityAdministrationUnitCodeP' constraints.validation.query='MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration MedicationActivityConsumableMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Consumable constraints.validation.error='MedicationActivityConsumableMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivity2Precondition typeCode='PRCN' constraints.validation.error='MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration'"
 * @generated
 */
public interface MedicationActivity2 extends MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::SubstanceAdministeredAct))->forAll(ent : cda::EntryRelationship | not ent.sequenceNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredActSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1) )  and  ( self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->forAll( eff | eff.oclAsType(datatypes:: SXCM_TS).value->size() = 1 or eff.oclAsType(datatypes::SXCM_TS).isNullFlavorDefined()) )'"
	 * @generated
	 */
	boolean validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::DrugMonitoringAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateMedicationActivity2DrugMonitoringAct(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::SubstanceAdministeredAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateMedicationActivity2SubstanceAdministeredAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DrugMonitoringAct))->asSequence()->any(true).oclAsType(consol::DrugMonitoringAct)'"
	 * @generated
	 */
	DrugMonitoringAct getDrugMonitoringAct();

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
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)).oclAsType(consol::SubstanceAdministeredAct)'"
	 * @generated
	 */
	EList<SubstanceAdministeredAct> getSubstanceAdministeredActs();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2)).oclAsType(consol::MedicationDispense2)'"
	 * @generated
	 */
	EList<MedicationDispense2> getConsolMedicationDispense2s();

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
	 * @generated
	 */
	@Override
	public MedicationActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationActivity2
