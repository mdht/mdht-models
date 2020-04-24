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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Assessment</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateNutritionAssessmentValueOfTypeCDIsFromSnomed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentValueOfTypeCDIsFromSnomed(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNutritionAssessmentAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NutritionAssessmentOperations.validateNutritionAssessmentAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionAssessment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NutritionAssessmentImpl
