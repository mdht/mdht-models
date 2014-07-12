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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxResultObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxResultObservationImpl extends ResultObservationImpl implements AnthraxResultObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxResultObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AnthraxPackage.Literals.ANTHRAX_RESULT_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnthraxResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AnthraxResultObservationOperations.validateAnthraxResultObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnthraxResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AnthraxResultObservationOperations.validateAnthraxResultObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
  }
} //AnthraxResultObservationImpl
