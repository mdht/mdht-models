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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityActImpl extends ActImpl implements ProcedureActivityAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActCodeCodeSystems(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActCodeCodeSystems(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActCodeOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActCodeOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActOriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEncounterInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEncounterInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActServiceDeliveryLocationTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocationTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActInstructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActInstructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActPriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActPriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActPriorityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActPriorityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipProcedureActEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityActEntryRelationshipProcedureActEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryLocation> getServiceDeliveryLocations() {
		return ProcedureActivityActOperations.getServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return ProcedureActivityActOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getIndications() {
		return ProcedureActivityActOperations.getIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return ProcedureActivityActOperations.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureActivityActImpl
