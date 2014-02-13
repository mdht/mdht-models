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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;

import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NutritionAssessmentImpl extends ObservationImpl implements NutritionAssessment {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected NutritionAssessmentImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUTRITION_ASSESSMENT;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentStatusCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NutritionAssessment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NutritionAssessmentImpl
