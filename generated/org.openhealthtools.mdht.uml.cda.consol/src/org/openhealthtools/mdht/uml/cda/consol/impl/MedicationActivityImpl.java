/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivityImpl extends SubstanceAdministrationImpl implements MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDoseQuantityorrateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDoseQuantityorrateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTimeIVLTS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTimeIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTimeHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTimePIVLTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTimePIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTimeOperator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTimeOperator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDoseQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDoseQuantityUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDrugVehicleTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDrugVehicleTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityInstructionsInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityInstructionsInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityPreconditionSubstanceAdmTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityPreconditionSubstanceAdmTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationSupplyOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityConsumableMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityConsumableMedicationInformation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder getMedicationSupplyOrder() {
		return MedicationActivityOperations.getMedicationSupplyOrder(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationDispense(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationDispense(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation getReactionObservation() {
		return MedicationActivityOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return MedicationActivityOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getIndications() {
		return MedicationActivityOperations.getIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationDispense> getMedicationDispenses() {
		return MedicationActivityOperations.getMedicationDispenses(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DrugVehicle> getDrugVehicles() {
		return MedicationActivityOperations.getDrugVehicles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationActivityImpl
