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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaResultObservationImpl extends ResultObservationImpl implements TularemiaResultObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaResultObservationImpl()
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
		return TularemiaPackage.Literals.TULAREMIA_RESULT_OBSERVATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaResultObservationOperations.validateTularemiaResultObservationCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaResultObservationOperations.validateTularemiaResultObservationCode(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TularemiaResultObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TularemiaResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TularemiaResultObservationImpl
