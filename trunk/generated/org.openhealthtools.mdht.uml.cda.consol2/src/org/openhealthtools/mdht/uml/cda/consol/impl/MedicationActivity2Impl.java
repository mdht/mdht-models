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
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivity2Impl extends MedicationActivityImpl implements MedicationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2InstructionsInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2InstructionsInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2DoseQuantityorrateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2DoseQuantityorrateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EffectiveTimeIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EffectiveTimePIVLTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimePIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EffectiveTimeIVLTSorTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSorTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2DrugMonitoringAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2DrugMonitoringAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityInstruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2SubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityIndication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityIndication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugMonitoringAct getDrugMonitoringAct() {
		return MedicationActivity2Operations.getDrugMonitoringAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction2 getConsolInstruction2() {
		return MedicationActivity2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministeredAct> getSubstanceAdministeredActs() {
		return MedicationActivity2Operations.getSubstanceAdministeredActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication2> getConsolIndication2s() {
		return MedicationActivity2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationActivity2Impl
