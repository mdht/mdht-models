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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisSiteOfTBDiseaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site Of TB Disease Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisSiteOfTBDiseaseObservationImpl extends ObservationImpl implements TuberculosisSiteOfTBDiseaseObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TuberculosisSiteOfTBDiseaseObservationImpl()
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
    return TuberculosisPackage.Literals.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTuberculosisSiteOfTBDiseaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuberculosisSiteOfTBDiseaseObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TuberculosisSiteOfTBDiseaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisSiteOfTBDiseaseObservationImpl
