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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl extends ObservationImpl implements AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationOperations.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl
