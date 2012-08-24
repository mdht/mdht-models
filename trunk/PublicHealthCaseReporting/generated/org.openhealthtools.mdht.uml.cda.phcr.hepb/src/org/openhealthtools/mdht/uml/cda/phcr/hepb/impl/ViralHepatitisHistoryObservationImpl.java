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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;

import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.ViralHepatitisHistoryObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viral Hepatitis History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ViralHepatitisHistoryObservationImpl extends ProblemObservationImpl implements ViralHepatitisHistoryObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ViralHepatitisHistoryObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return HepbPackage.Literals.VIRAL_HEPATITIS_HISTORY_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateViralHepatitisHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateViralHepatitisHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateViralHepatitisHistoryObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateViralHepatitisHistoryObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ViralHepatitisHistoryObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ViralHepatitisHistoryObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ViralHepatitisHistoryObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ViralHepatitisHistoryObservationImpl
