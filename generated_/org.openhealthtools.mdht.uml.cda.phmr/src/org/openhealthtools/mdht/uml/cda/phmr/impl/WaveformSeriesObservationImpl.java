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

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation;

import org.openhealthtools.mdht.uml.cda.phmr.operations.WaveformSeriesObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waveform Series Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WaveformSeriesObservationImpl extends ObservationImpl implements WaveformSeriesObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveformSeriesObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationObservationMediaJPG(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationObservationMediaJPG(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveformSeriesObservationObservationNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WaveformSeriesObservationOperations.validateWaveformSeriesObservationObservationNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMedia getObservationMediaJPG() {
		return WaveformSeriesObservationOperations.getObservationMediaJPG(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservationNullFlavor() {
		return WaveformSeriesObservationOperations.getObservationNullFlavor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveformSeriesObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //WaveformSeriesObservationImpl
