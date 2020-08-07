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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReactionObservationImpl extends ObservationImpl implements ReactionObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REACTION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationEffectiveTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationSeverityObservationInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationSeverityObservationInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationProcedureActivityProcedureInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedureInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationMedicationActivityInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationMedicationActivityInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationSeverityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationProcedureActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReactionObservationMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation getSeverityObservation() {
		return ReactionObservationOperations.getSeverityObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureActivityProcedure> getProcedureActivityProcedures() {
		return ReactionObservationOperations.getProcedureActivityProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationActivity> getMedicationActivities() {
		return ReactionObservationOperations.getMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReactionObservationImpl
