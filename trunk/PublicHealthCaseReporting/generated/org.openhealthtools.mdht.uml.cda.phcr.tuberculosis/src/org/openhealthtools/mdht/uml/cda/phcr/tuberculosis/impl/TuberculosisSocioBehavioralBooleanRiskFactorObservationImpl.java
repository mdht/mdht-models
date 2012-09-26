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
import org.openhealthtools.mdht.uml.cda.ccd.impl.SocialHistoryObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisSocioBehavioralBooleanRiskFactorObservationImpl extends SocialHistoryObservationImpl implements TuberculosisSocioBehavioralBooleanRiskFactorObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisSocioBehavioralBooleanRiskFactorObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TuberculosisSocioBehavioralBooleanRiskFactorObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TuberculosisSocioBehavioralBooleanRiskFactorObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisSocioBehavioralBooleanRiskFactorObservationImpl
