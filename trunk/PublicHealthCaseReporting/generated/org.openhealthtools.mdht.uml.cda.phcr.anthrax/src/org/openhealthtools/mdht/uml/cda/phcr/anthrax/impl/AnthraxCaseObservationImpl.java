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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxCaseObservationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxCaseObservationImpl extends CaseObservationImpl implements AnthraxCaseObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxCaseObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AnthraxPackage.Literals.ANTHRAX_CASE_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnthraxCaseObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AnthraxCaseObservationOperations.validateAnthraxCaseObservationValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnthraxCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AnthraxCaseObservationOperations.validateAnthraxCaseObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseObservationOperations.validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<AnthraxSignsAndSymptomsObservation> getAnthraxSignsAndSymptomsObservations() {
    return AnthraxCaseObservationOperations.getAnthraxSignsAndSymptomsObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }
} //AnthraxCaseObservationImpl
