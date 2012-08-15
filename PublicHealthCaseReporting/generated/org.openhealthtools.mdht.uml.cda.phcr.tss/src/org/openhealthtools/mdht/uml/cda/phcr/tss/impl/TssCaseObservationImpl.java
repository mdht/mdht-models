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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssCaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tss Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TssCaseObservationImpl extends CaseObservationImpl implements TssCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TssCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tssPackage.Literals.TSS_CASE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTssCaseObservationTssSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssCaseObservationOperations.validateTssCaseObservationTssSignsAndSymptomsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TssSignsAndSymptomsObservation> getTssSignsAndSymptomsObservations() {
		return TssCaseObservationOperations.getTssSignsAndSymptomsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssCaseObservationOperations.validateCaseObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TssCaseObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TssCaseObservationImpl
