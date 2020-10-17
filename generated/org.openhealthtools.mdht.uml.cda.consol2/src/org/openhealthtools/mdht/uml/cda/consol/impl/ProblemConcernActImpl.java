/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Concern Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemConcernActImpl extends ActImpl implements ProblemConcernAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemConcernActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_CONCERN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemConcernActProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemConcernActOperations.validateProblemConcernActProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProblemObservation> getProblemObservations() {
		return ProblemConcernActOperations.getProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemConcernActImpl
