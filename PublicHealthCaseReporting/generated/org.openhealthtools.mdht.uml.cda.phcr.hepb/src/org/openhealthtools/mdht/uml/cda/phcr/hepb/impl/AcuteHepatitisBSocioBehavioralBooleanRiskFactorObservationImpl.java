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
import org.openhealthtools.mdht.uml.cda.ccd.impl.SocialHistoryObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl extends SocialHistoryObservationImpl implements AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return HepbPackage.Literals.ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateSocialHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl
