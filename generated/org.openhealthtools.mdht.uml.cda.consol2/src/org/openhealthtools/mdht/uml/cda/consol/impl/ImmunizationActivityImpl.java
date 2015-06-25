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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationActivityImpl extends SubstanceAdministrationImpl implements ImmunizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDoseQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantityUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityInstructionInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityInstructionInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDrugVehicleTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicleTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPreconditionTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityMedicationDispense(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMedicationDispense(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityReactionObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityImmunizationRefusalReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityImmunizationRefusalReason(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMedicationSupplyOrder(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityConsumableImmunizationMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityConsumableImmunizationMedicationInformation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugVehicle getDrugVehicle() {
		return ImmunizationActivityOperations.getDrugVehicle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication getIndication() {
		return ImmunizationActivityOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions getInstructions() {
		return ImmunizationActivityOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense getMedicationDispense() {
		return ImmunizationActivityOperations.getMedicationDispense(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation getReactionObservation() {
		return ImmunizationActivityOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRefusalReason getImmunizationRefusalReason() {
		return ImmunizationActivityOperations.getImmunizationRefusalReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder getMedicationSupplyOrder() {
		return ImmunizationActivityOperations.getMedicationSupplyOrder(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ImmunizationActivityImpl
