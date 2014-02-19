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
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionalStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutritional Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NutritionalStatusObservationImpl extends ObservationImpl implements NutritionalStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionalStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUTRITIONAL_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionalStatusObservationNutritionAssessment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionalStatusObservationOperations.validateNutritionalStatusObservationNutritionAssessment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionAssessment> getNutritionAssessments() {
		return NutritionalStatusObservationOperations.getNutritionAssessments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionalStatusObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionalStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NutritionalStatusObservationImpl
