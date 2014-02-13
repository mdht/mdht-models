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
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;

import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationsOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Recommendations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NutritionRecommendationsImpl extends ActImpl implements NutritionRecommendations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected NutritionRecommendationsImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsMoodCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsStatusCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNutritionRecommendationsEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationsOperations.validateNutritionRecommendationsEffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NutritionRecommendations init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRecommendations init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NutritionRecommendationsImpl
