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
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperativeNoteImpl extends GeneralHeaderConstraintsImpl implements OperativeNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteAnesthesiaSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteAnesthesiaSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteComplicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteComplicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNotePostoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePostoperativeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNotePreoperativeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePreoperativeDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureEstimatedBloodLossSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureFindingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureFindingsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureSpecimensTakenSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureDescriptionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureImplantsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureImplantsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteOperativeNoteFluidSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteOperativeNoteFluidSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteOperativeNoteSurgicalProcedureSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteOperativeNoteSurgicalProcedureSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNotePlannedProcedureSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNotePlannedProcedureSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureDispositionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteProcedureIndicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteProcedureIndicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalDrainsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteSurgicalDrainsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventProcedureCodes(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnesthesiaSection getAnesthesiaSection() {
		return OperativeNoteOperations.getAnesthesiaSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection getComplicationsSection() {
		return OperativeNoteOperations.getComplicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostoperativeDiagnosisSection getPostoperativeDiagnosisSection() {
		return OperativeNoteOperations.getPostoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection getPreoperativeDiagnosisSection() {
		return OperativeNoteOperations.getPreoperativeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection() {
		return OperativeNoteOperations.getProcedureEstimatedBloodLossSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection getProcedureFindingsSection() {
		return OperativeNoteOperations.getProcedureFindingsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection() {
		return OperativeNoteOperations.getProcedureSpecimensTakenSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDescriptionSection getProcedureDescriptionSection() {
		return OperativeNoteOperations.getProcedureDescriptionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureImplantsSection getProcedureImplantsSection() {
		return OperativeNoteOperations.getProcedureImplantsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteFluidSection getOperativeNoteFluidSection() {
		return OperativeNoteOperations.getOperativeNoteFluidSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteSurgicalProcedureSection getOperativeNoteSurgicalProcedureSection() {
		return OperativeNoteOperations.getOperativeNoteSurgicalProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection getPlanOfCareSection() {
		return OperativeNoteOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection getPlannedProcedureSection() {
		return OperativeNoteOperations.getPlannedProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDispositionSection getProcedureDispositionSection() {
		return OperativeNoteOperations.getProcedureDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection getProcedureIndicationsSection() {
		return OperativeNoteOperations.getProcedureIndicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurgicalDrainsSection getSurgicalDrainsSection() {
		return OperativeNoteOperations.getSurgicalDrainsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OperativeNoteImpl
