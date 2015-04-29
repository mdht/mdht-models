/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationActivity2Impl extends ImmunizationActivityImpl implements ImmunizationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2TextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2TextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2ReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2ReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2TextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2TextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2InstructionInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2InstructionInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityIndication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityIndication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityMedicationSupplyOrder2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityMedicationSupplyOrder2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityMedicationDispense2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityMedicationDispense2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityReactionObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityInstruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipForSubAdminAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipForSubAdminAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSequenceNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DrugVehicle> getConsolDrugVehicles() {
		return ImmunizationActivity2Operations.getConsolDrugVehicles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return ImmunizationActivity2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder2 getConsolMedicationSupplyOrder2() {
		return ImmunizationActivity2Operations.getConsolMedicationSupplyOrder2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense2 getConsolMedicationDispense2() {
		return ImmunizationActivity2Operations.getConsolMedicationDispense2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation2 getConsolReactionObservation2() {
		return ImmunizationActivity2Operations.getConsolReactionObservation2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction2 getConsolInstruction2() {
		return ImmunizationActivity2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ImmunizationActivity2Impl
