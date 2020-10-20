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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveAbilitiesObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Abilities Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CognitiveAbilitiesObservationImpl extends ObservationImpl implements CognitiveAbilitiesObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveAbilitiesObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_ABILITIES_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveAbilitiesObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationAuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return CognitiveAbilitiesObservationOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveAbilitiesObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveAbilitiesObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CognitiveAbilitiesObservationImpl
