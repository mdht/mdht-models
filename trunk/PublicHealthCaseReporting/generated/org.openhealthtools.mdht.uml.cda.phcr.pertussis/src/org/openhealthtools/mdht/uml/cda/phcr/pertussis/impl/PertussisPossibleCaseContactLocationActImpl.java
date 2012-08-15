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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisPossibleCaseContactLocationActOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Case Contact Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PertussisPossibleCaseContactLocationActImpl extends ActImpl implements PertussisPossibleCaseContactLocationAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisPossibleCaseContactLocationActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PertussisPackage.Literals.PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleCaseContactLocationActOperations.validatePertussisPossibleCaseContactLocationActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleCaseContactLocationActOperations.validatePertussisPossibleCaseContactLocationActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleCaseContactLocationActOperations.validatePertussisPossibleCaseContactLocationActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleCaseContactLocationActOperations.validatePertussisPossibleCaseContactLocationActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisPossibleCaseContactLocationActOperations.validatePertussisPossibleCaseContactLocationActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisPossibleCaseContactLocationAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PertussisPossibleCaseContactLocationActImpl
