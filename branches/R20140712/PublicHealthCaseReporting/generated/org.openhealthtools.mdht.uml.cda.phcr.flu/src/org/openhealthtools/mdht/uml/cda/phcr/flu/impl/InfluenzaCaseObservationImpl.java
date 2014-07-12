/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaCaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaCaseObservationImpl extends CaseObservationImpl implements InfluenzaCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_CASE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseObservationOperations.validateInfluenzaCaseObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseObservationOperations.validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaSignsAndSymptomsObservation> getInfluenzaSignsAndSymptomsObservations() {
		return InfluenzaCaseObservationOperations.getInfluenzaSignsAndSymptomsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenzaCaseObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public InfluenzaCaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InfluenzaCaseObservationImpl
