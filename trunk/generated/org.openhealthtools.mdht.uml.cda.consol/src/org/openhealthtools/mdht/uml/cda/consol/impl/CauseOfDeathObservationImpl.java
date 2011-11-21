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

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.CauseOfDeathObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CauseOfDeathObservationImpl extends ObservationImpl implements CauseOfDeathObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseOfDeathObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CAUSE_OF_DEATH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationHasSubjectPatientRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationHasSubjectPatientRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationRelationshipValueCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationRelationshipValueCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationHasRelatedSubjectCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationHasRelatedSubjectCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationRelatedSubjectCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationRelatedSubjectCodeValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationHasRelatedSubjectSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationHasRelatedSubjectSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationHasGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationHasGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationRelatedSubjectBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationRelatedSubjectBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservationProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateCauseOfDeathObservationProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return CauseOfDeathObservationOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return CauseOfDeathObservationOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseOfDeathObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //CauseOfDeathObservationImpl
