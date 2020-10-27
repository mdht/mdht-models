/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NutritionRecommendationImpl extends ActImpl implements NutritionRecommendation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUTRITION_RECOMMENDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedEncounter2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedEncounter2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedProcedure2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedSupply2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedSupply2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionRecommendationPlannedAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionRecommendationOperations.validateNutritionRecommendationPlannedAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedEncounter2> getPlannedEncounter2s() {
		return NutritionRecommendationOperations.getPlannedEncounter2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedMedicationActivity2> getPlannedMedicationActivity2s() {
		return NutritionRecommendationOperations.getPlannedMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedObservation2> getPlannedObservation2s() {
		return NutritionRecommendationOperations.getPlannedObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedProcedure2> getPlannedProcedure2s() {
		return NutritionRecommendationOperations.getPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedSupply2> getPlannedSupply2s() {
		return NutritionRecommendationOperations.getPlannedSupply2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedAct2> getPlannedAct2s() {
		return NutritionRecommendationOperations.getPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRecommendation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRecommendation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NutritionRecommendationImpl
