/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	public boolean validateReactionObservationHasReactionIntervention(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationHasReactionIntervention(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationReactionInterventionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationReactionInterventionTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationReactionInterventionType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationReactionInterventionType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationContainsPatientAwareness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationContainsPatientAwareness(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationCommentInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation getSeverity() {
		return ReactionObservationOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // ReactionObservationImpl
