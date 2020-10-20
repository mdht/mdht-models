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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.OutcomeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome Observation</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(
			this, diagnostics, context);
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
	public boolean validateOutcomeObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationEntryReferenceGoalObs(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceGoalObs(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationEntryReferenceInterventionAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceInterventionAct(
			this, diagnostics, context);
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
	public boolean validateOutcomeObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcomeObservationReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OutcomeObservationOperations.validateOutcomeObservationReferenceExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceGoalObss() {
		return OutcomeObservationOperations.getEntryReferenceGoalObss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceInterventionActs() {
		return OutcomeObservationOperations.getEntryReferenceInterventionActs(this);
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
