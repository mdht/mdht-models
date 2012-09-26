/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ImagingObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImagingObservationImpl extends ProblemObservationImpl implements ImagingObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ImagingObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhcrPackage.Literals.IMAGING_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateImagingObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ImagingObservationOperations.validateImagingObservationStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationStatusCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateImagingObservationMethodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ImagingObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }
} //ImagingObservationImpl
