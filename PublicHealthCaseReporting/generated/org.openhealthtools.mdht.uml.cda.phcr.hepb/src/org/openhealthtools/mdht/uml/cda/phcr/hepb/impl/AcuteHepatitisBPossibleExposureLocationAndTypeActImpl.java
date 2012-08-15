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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPossibleExposureLocationAndTypeActOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BPossible Exposure Location And Type Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPossibleExposureLocationAndTypeActImpl extends ActImpl implements AcuteHepatitisBPossibleExposureLocationAndTypeAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPossibleExposureLocationAndTypeActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPossibleExposureLocationAndTypeActOperations.validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPossibleExposureLocationAndTypeActOperations.validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPossibleExposureLocationAndTypeActOperations.validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPossibleExposureLocationAndTypeActOperations.validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPossibleExposureLocationAndTypeActOperations.validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBPossibleExposureLocationAndTypeAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBPossibleExposureLocationAndTypeActImpl
