/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCardiacArrestEventOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Cardiac Arrest Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSCardiacArrestEventImpl extends SectionImpl implements EMSCardiacArrestEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSCardiacArrestEventImpl()
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
    return EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSCardiacArrestEventOperations.validateEMSCardiacArrestEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSCardiacArrestEventOperations.validateEMSCardiacArrestEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSCardiacArrestEventOperations.validateEMSCardiacArrestEventTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventCardiacArrestExistence(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSCardiacArrestEventOperations.validateEMSCardiacArrestEventCardiacArrestExistence(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getCardiacArrestExistence()
  {
    return EMSCardiacArrestEventOperations.getCardiacArrestExistence(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCardiacArrestEvent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSCardiacArrestEventImpl
