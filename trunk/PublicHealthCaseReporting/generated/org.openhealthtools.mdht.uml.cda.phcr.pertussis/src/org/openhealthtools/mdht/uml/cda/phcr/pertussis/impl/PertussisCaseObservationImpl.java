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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisCaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PertussisCaseObservationImpl extends CaseObservationImpl implements PertussisCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PertussisPackage.Literals.PERTUSSIS_CASE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisCaseObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return PertussisCaseObservationOperations.validatePertussisCaseObservationValueP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return PertussisCaseObservationOperations.validatePertussisCaseObservationValue(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseObservationOperations.validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PertussisSignsAndSymptomsObservation> getPertussisSignsAndSymptomsObservations() {
		return PertussisCaseObservationOperations.getPertussisSignsAndSymptomsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PertussisCaseObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PertussisCaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PertussisCaseObservationImpl
