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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRSocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements TuberculosisPHCRSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPHCRSocialHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRSocialHistorySectionOperations.validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRSocialHistorySectionOperations.validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRSocialHistorySectionOperations.validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRSocialHistorySectionOperations.validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuberculosisPossibleExposureLocationAct> getTuberculosisPossibleExposureLocationActs() {
		return TuberculosisPHCRSocialHistorySectionOperations.getTuberculosisPossibleExposureLocationActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuberculosisSocioBehavioralBooleanRiskFactorObservation> getTuberculosisSocioBehavioralBooleanRiskFactorObservations() {
		return TuberculosisPHCRSocialHistorySectionOperations.getTuberculosisSocioBehavioralBooleanRiskFactorObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusObservation> getSmokingStatusObservations() {
		return TuberculosisPHCRSocialHistorySectionOperations.getSmokingStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIVStatusObservation getHIVStatusObservation() {
		return TuberculosisPHCRSocialHistorySectionOperations.getHIVStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisPHCRSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TuberculosisPHCRSocialHistorySectionImpl
