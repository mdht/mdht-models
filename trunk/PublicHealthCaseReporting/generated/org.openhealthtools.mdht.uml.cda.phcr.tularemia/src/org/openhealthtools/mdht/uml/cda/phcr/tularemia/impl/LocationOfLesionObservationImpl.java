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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.LocationOfLesionObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Of Lesion Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocationOfLesionObservationImpl extends ObservationImpl implements LocationOfLesionObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationOfLesionObservationImpl()
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
    return TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLocationOfLesionObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationCodeP(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLocationOfLesionObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationStatusCodeP(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationOfLesionObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateLocationOfLesionObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return LocationOfLesionObservationOperations.validateLocationOfLesionObservationTargetSiteCode(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationOfLesionObservation init() {
      return Initializer.Util.init(this);
  }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationOfLesionObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //LocationOfLesionObservationImpl
