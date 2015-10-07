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
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GoalObservationImpl extends ObservationImpl implements GoalObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GOAL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationGoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationGoalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationActReferenceER(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationActReferenceER(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationHealthConcernActER(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationHealthConcernActER(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPriorityPreference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedERs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedERs(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationReferenceExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GoalObservation> getGoalObservations() {
		return GoalObservationOperations.getGoalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getActReferenceERs() {
		return GoalObservationOperations.getActReferenceERs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getHealthConcernActERs() {
		return GoalObservationOperations.getHealthConcernActERs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityPreference getPriorityPreference() {
		return GoalObservationOperations.getPriorityPreference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getPlannedERss() {
		return GoalObservationOperations.getPlannedERss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GoalObservationImpl
