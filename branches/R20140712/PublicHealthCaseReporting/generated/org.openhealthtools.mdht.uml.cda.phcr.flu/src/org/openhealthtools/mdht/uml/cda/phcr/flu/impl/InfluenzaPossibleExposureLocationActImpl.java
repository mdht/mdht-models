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
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaPossibleExposureLocationActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza Possible Exposure Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaPossibleExposureLocationActImpl extends ActImpl implements InfluenzaPossibleExposureLocationAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPossibleExposureLocationActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPossibleExposureLocationActOperations.validateInfluenzaPossibleExposureLocationActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPossibleExposureLocationActOperations.validateInfluenzaPossibleExposureLocationActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPossibleExposureLocationActOperations.validateInfluenzaPossibleExposureLocationActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPossibleExposureLocationAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InfluenzaPossibleExposureLocationAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InfluenzaPossibleExposureLocationActImpl
