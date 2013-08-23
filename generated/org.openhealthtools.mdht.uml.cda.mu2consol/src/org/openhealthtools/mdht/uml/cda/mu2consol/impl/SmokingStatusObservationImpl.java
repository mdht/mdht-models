/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SmokingStatusObservationOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Smoking Status Observation</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SmokingStatusObservationImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.SmokingStatusObservationImpl implements
		SmokingStatusObservation {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected SmokingStatusObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.SMOKING_STATUS_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMU2CONSOLSmokingStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SmokingStatusObservationOperations.validateMU2CONSOLSmokingStatusObservationValueP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMU2CONSOLSmokingStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SmokingStatusObservationOperations.validateMU2CONSOLSmokingStatusObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateTobaccoUseTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return SmokingStatusObservationOperations.validateTobaccoUseTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public SmokingStatusObservation init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SmokingStatusObservation init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SmokingStatusObservationImpl
