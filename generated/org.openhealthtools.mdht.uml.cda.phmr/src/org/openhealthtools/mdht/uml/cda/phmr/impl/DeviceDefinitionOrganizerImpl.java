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
import org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.DeviceDefinitionOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeviceDefinitionOrganizerImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements DeviceDefinitionOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerSamplingFrequencyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerDeviceResolutionObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceResolutionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceAccuracyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public boolean validateDeviceDefinitionOrganizerParticipant(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerParticipant(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SamplingFrequencyObservation getSamplingFrequencyObservation() {
		return DeviceDefinitionOrganizerOperations.getSamplingFrequencyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMeasurementRangeObservation getDeviceMeasurementRangeObservation() {
		return DeviceDefinitionOrganizerOperations.getDeviceMeasurementRangeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceResolutionObservation getDeviceResolutionObservation() {
		return DeviceDefinitionOrganizerOperations.getDeviceResolutionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceAccuracyObservation getDeviceAccuracyObservation() {
		return DeviceDefinitionOrganizerOperations.getDeviceAccuracyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionOrganizer init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DeviceDefinitionOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //DeviceDefinitionOrganizerImpl
