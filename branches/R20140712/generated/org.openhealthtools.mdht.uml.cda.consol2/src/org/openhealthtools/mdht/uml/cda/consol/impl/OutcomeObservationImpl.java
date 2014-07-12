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

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.OutcomeObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OutcomeObservationImpl extends ObservationImpl implements OutcomeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OUTCOME_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationActReference2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationActReference2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationGoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationGoalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationProgressTowardGoalObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationProgressTowardGoalObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationInterventionAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationInterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReferences() {
		return OutcomeObservationOperations.getActReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReference2s() {
		return OutcomeObservationOperations.getActReference2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalObservation> getGoalObservations() {
		return OutcomeObservationOperations.getGoalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressTowardGoalObservation getProgressTowardGoalObservation() {
		return OutcomeObservationOperations.getProgressTowardGoalObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterventionAct> getInterventionActs() {
		return OutcomeObservationOperations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalDocumentReference> getExternalDocumentReferences() {
		return OutcomeObservationOperations.getExternalDocumentReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutcomeObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutcomeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OutcomeObservationImpl
