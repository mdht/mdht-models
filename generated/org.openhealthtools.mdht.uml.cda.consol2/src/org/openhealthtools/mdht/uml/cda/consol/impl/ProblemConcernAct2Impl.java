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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernAct2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Concern Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemConcernAct2Impl extends ProblemConcernActImpl implements ProblemConcernAct2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemConcernAct2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_CONCERN_ACT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernAct2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernAct2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernAct2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernAct2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernAct2PriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernAct2PriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferences() {
		return ProblemConcernAct2Operations.getPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return ProblemConcernAct2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernAct2Operations.validateProblemConcernActProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemConcernAct2Impl
