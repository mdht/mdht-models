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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisPossibleExposureLocationActOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Exposure Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PertussisPossibleExposureLocationActImpl extends ActImpl implements PertussisPossibleExposureLocationAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisPossibleExposureLocationActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleExposureLocationActOperations.validatePertussisPossibleExposureLocationActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleExposureLocationActOperations.validatePertussisPossibleExposureLocationActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleExposureLocationActOperations.validatePertussisPossibleExposureLocationActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleExposureLocationActOperations.validatePertussisPossibleExposureLocationActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleExposureLocationActOperations.validatePertussisPossibleExposureLocationActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisPossibleExposureLocationAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PertussisPossibleExposureLocationActImpl
