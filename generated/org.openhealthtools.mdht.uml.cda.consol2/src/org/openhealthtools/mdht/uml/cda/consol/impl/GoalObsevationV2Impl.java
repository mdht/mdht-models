/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2;

import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObsevationV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Obsevation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GoalObsevationV2Impl extends GoalObservationImpl implements GoalObsevationV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObsevationV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GOAL_OBSEVATION_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObsevationV2Author(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObsevationV2Author(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObsevationV2Operations.validateGoalObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObsevationV2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObsevationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GoalObsevationV2Impl
