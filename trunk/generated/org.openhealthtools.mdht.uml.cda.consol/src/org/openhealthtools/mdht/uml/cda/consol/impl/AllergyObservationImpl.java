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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyObservationImpl extends ObservationImpl implements AllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyStatusInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyStatusInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationReactionInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationSeverityInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationProblemEntryReactionObservationContainer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation> getProblemEntryReactionObservationContainers() {
		return AllergyObservationOperations.getProblemEntryReactionObservationContainers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation getSeverity() {
		return AllergyObservationOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation getAllergyStatusObservation() {
		return AllergyObservationOperations.getAllergyStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergyObservationImpl
