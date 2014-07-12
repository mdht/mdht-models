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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaResultOrganizerImpl extends ResultOrganizerImpl implements TularemiaResultOrganizer
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaResultOrganizerImpl()
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
		return TularemiaPackage.Literals.TULAREMIA_RESULT_ORGANIZER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaResultOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaResultOrganizerOperations.validateTularemiaResultOrganizerCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaResultOrganizerOperations.validateTularemiaResultOrganizerCode(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaResultOrganizerTularemiaResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaResultOrganizerOperations.validateTularemiaResultOrganizerTularemiaResultObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TularemiaResultObservation> getTularemiaResultObservations()
  {
		return TularemiaResultOrganizerOperations.getTularemiaResultObservations(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TularemiaResultOrganizer init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TularemiaResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TularemiaResultOrganizerImpl
