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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.SocialHistoryObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisSocioBehavioralBooleanRiskFactorObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SilicosisSocioBehavioralBooleanRiskFactorObservationImpl extends SocialHistoryObservationImpl implements SilicosisSocioBehavioralBooleanRiskFactorObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisSocioBehavioralBooleanRiskFactorObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SilicosisPackage.Literals.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateSocialHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisSocioBehavioralBooleanRiskFactorObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SilicosisSocioBehavioralBooleanRiskFactorObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SilicosisSocioBehavioralBooleanRiskFactorObservationImpl
