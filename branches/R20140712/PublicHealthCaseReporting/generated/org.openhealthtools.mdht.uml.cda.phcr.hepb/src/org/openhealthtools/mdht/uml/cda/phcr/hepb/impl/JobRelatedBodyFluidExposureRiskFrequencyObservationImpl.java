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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.JobRelatedBodyFluidExposureRiskFrequencyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Related Body Fluid Exposure Risk Frequency Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JobRelatedBodyFluidExposureRiskFrequencyObservationImpl extends ObservationImpl implements JobRelatedBodyFluidExposureRiskFrequencyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobRelatedBodyFluidExposureRiskFrequencyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRelatedBodyFluidExposureRiskFrequencyObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JobRelatedBodyFluidExposureRiskFrequencyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //JobRelatedBodyFluidExposureRiskFrequencyObservationImpl
