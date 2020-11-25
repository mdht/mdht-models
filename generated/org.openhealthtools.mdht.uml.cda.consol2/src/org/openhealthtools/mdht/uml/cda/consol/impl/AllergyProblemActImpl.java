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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Problem Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AllergyProblemActImpl extends ActImpl implements AllergyProblemAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyProblemActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_PROBLEM_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActCDCodeAndCodeSystemValues(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActCDCodeAndCodeSystemValues(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActCDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActCDCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActCDCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyObservation> getAllergyObservations() {
		return AllergyProblemActOperations.getAllergyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyProblemAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AllergyProblemAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AllergyProblemActImpl
