/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.CombinationMedicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Combination Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationCombinationMedicationImpl extends CombinationMedicationImpl
		implements MedicationCombinationMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationCombinationMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.MEDICATION_COMBINATION_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationFirstEffectiveTimeDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationFirstEffectiveTimeDatatype(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationDoseUnits(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationDoseUnits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationDeliveryMethodDescription(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationDeliveryMethodDescription(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasMedicationInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasStatusOfMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasStatusOfMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasIndicationNarrativeText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasIndicationNarrativeText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasIndicationVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasIndicationVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasPatientInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasPatientInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationHasMedicationVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasMedicationVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleClass(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleCodedName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleCodedName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleCodedNameVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleCodedNameVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType getMedicationType() {
		return MedicationOperations.getMedicationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getMedicationOrderInformations() {
		return MedicationOperations.getMedicationOrderInformations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation getHITSPReactionObservation() {
		return MedicationOperations.getHITSPReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationCombinationMedication init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationCombinationMedication init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationCombinationMedicationImpl
