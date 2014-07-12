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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssSignsAndSymptomsObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tss Signs And Symptoms Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TssSignsAndSymptomsObservationImpl extends SignsAndSymptomsObservationImpl implements TssSignsAndSymptomsObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TssSignsAndSymptomsObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return tssPackage.Literals.TSS_SIGNS_AND_SYMPTOMS_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssSignsAndSymptomsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TssSignsAndSymptomsObservationOperations.validateTssSignsAndSymptomsObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateSignsAndSymptomsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TssSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(this, diagnostics, context);
  }
} //TssSignsAndSymptomsObservationImpl
