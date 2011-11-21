/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Severity;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemEntryReactionObservationContainerOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Entry Reaction Observation Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemEntryReactionObservationContainerImpl extends ObservationImpl implements ProblemEntryReactionObservationContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemEntryReactionObservationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerHasReactionIntervention(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerHasReactionIntervention(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerReactionInterventionType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerReactionInterventionType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerCommentInversionInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerHealthStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerHealthStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainerComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryReactionObservationContainerOperations.validateProblemEntryReactionObservationContainerComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return ProblemEntryReactionObservationContainerOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return ProblemEntryReactionObservationContainerOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return ProblemEntryReactionObservationContainerOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation getHealthStatusObservation() {
		return ProblemEntryReactionObservationContainerOperations.getHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		return ProblemEntryReactionObservationContainerOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ProblemEntryReactionObservationContainerImpl
