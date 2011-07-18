/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
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
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ConditionalDoseImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Conditional Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationConditionalDoseImpl extends ConditionalDoseImpl implements MedicationConditionalDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationConditionalDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.MEDICATION_CONDITIONAL_DOSE;
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
	public boolean validateHITSPMedicationHasStatusOfMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateHITSPMedicationHasMedicationVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationHasMedicationVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleType(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateHITSPMedicationMedicationVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationMedicationVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationMedicationVehicleName(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateHITSPMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationDoseQuantity(this, diagnostics, context);
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
	public boolean validateHITSPMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateHITSPMedicationCode(this, diagnostics, context);
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
	public MedicationConditionalDose init() {
    	CDAUtil.init(this);
    	return this;
	}
} // MedicationConditionalDoseImpl
