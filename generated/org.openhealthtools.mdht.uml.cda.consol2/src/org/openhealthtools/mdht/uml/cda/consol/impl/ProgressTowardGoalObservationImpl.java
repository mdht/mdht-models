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
import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressTowardGoalObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Toward Goal Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgressTowardGoalObservationImpl extends ObservationImpl implements ProgressTowardGoalObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressTowardGoalObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProgressTowardGoalObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressTowardGoalObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressTowardGoalObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProgressTowardGoalObservationImpl
