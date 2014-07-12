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
package org.openhealthtools.mdht.uml.cda.phcr.hib.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibSignsAndSymptoms;

import org.openhealthtools.mdht.uml.cda.phcr.hib.operations.HibSignsAndSymptomsOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signs And Symptoms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HibSignsAndSymptomsImpl extends SignsAndSymptomsObservationImpl implements HibSignsAndSymptoms {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibSignsAndSymptomsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HibPackage.Literals.HIB_SIGNS_AND_SYMPTOMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSignsAndSymptomsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HibSignsAndSymptomsOperations.validateSignsAndSymptomsObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HibSignsAndSymptoms init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HibSignsAndSymptoms init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HibSignsAndSymptomsImpl
