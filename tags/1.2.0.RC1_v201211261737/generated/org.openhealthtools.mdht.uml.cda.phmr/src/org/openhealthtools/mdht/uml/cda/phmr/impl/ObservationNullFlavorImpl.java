/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation;

import org.openhealthtools.mdht.uml.cda.phmr.operations.ObservationNullFlavorOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Null Flavor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ObservationNullFlavorImpl extends ObservationImpl implements ObservationNullFlavor {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ObservationNullFlavorImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhmrPackage.Literals.OBSERVATION_NULL_FLAVOR;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ObservationNullFlavorOperations.validateObservationNullFlavorTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavorClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ObservationNullFlavorOperations.validateObservationNullFlavorClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ObservationNullFlavorOperations.validateObservationNullFlavorMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavorWaveformObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ObservationNullFlavorOperations.validateObservationNullFlavorWaveformObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavorWaveformSamplePeriodObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ObservationNullFlavorOperations.validateObservationNullFlavorWaveformSamplePeriodObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public WaveformObservation getWaveformObservation() {
    return ObservationNullFlavorOperations.getWaveformObservation(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public WaveformSamplePeriodObservation getWaveformSamplePeriodObservation() {
    return ObservationNullFlavorOperations.getWaveformSamplePeriodObservation(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObservationNullFlavor init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservationNullFlavor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ObservationNullFlavorImpl
