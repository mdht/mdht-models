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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvCaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WnvCaseObservationImpl extends CaseObservationImpl implements WnvCaseObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WnvCaseObservationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WnvPackage.Literals.WNV_CASE_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWnvCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WnvCaseObservationOperations.validateWnvCaseObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWnvCaseObservationWnvSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return WnvCaseObservationOperations.validateWnvCaseObservationWnvSignsAndSymptomsObservation(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<WnvSignsAndSymptomsObservation> getWnvSignsAndSymptomsObservations() {
    return WnvCaseObservationOperations.getWnvSignsAndSymptomsObservations(this);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return WnvCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }
} //WnvCaseObservationImpl
