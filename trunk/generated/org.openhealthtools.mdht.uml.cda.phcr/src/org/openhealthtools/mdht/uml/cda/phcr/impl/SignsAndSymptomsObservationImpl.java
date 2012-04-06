/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signs And Symptoms Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SignsAndSymptomsObservationImpl extends ObservationImpl implements SignsAndSymptomsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignsAndSymptomsObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.SIGNS_AND_SYMPTOMS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignsAndSymptomsObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignsAndSymptomsObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //SignsAndSymptomsObservationImpl
