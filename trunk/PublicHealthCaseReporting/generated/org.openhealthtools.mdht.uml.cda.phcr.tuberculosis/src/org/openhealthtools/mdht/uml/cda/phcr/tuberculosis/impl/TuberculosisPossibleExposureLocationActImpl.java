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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPossibleExposureLocationActOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Exposure Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisPossibleExposureLocationActImpl extends ActImpl implements TuberculosisPossibleExposureLocationAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuberculosisPossibleExposureLocationActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTuberculosisPossibleExposureLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TuberculosisPossibleExposureLocationActOperations.validateTuberculosisPossibleExposureLocationActTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTuberculosisPossibleExposureLocationActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TuberculosisPossibleExposureLocationActOperations.validateTuberculosisPossibleExposureLocationActClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTuberculosisPossibleExposureLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TuberculosisPossibleExposureLocationActOperations.validateTuberculosisPossibleExposureLocationActCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTuberculosisPossibleExposureLocationActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TuberculosisPossibleExposureLocationActOperations.validateTuberculosisPossibleExposureLocationActMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTuberculosisPossibleExposureLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TuberculosisPossibleExposureLocationActOperations.validateTuberculosisPossibleExposureLocationActStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuberculosisPossibleExposureLocationAct init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TuberculosisPossibleExposureLocationAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisPossibleExposureLocationActImpl
