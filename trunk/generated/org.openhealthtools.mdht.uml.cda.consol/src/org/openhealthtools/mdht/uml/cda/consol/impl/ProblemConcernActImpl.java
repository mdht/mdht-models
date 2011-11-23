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
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Concern Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemConcernActImpl extends ActImpl implements ProblemConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActEntryRelationshipRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEntryRelationshipRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActSubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActSubjectOfTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActContainsProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActContainsProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActContainsAlertObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActContainsAlertObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeLowHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActHasRelatedObservations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActHasRelatedObservations(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActRelatedObservationsTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActRelatedObservationsTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActHasRelatedReferencesTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActHasRelatedReferencesTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActHasTreatingProvider(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActHasTreatingProvider(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActHasProviderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActHasProviderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActHasProviderTreatmentTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActHasProviderTreatmentTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return ProblemConcernActOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ProblemConcernActImpl
