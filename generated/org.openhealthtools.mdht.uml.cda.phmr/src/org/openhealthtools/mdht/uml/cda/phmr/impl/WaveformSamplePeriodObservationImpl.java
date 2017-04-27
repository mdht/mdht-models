/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.WaveformSamplePeriodObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waveform Sample Period Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WaveformSamplePeriodObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements WaveformSamplePeriodObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveformSamplePeriodObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhmrPackage.Literals.WAVEFORM_SAMPLE_PERIOD_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWaveformSamplePeriodObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWaveformSamplePeriodObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWaveformSamplePeriodObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWaveformSamplePeriodObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWaveformSamplePeriodObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaveformSamplePeriodObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public WaveformSamplePeriodObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //WaveformSamplePeriodObservationImpl
