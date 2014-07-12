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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaTherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaTherapeuticRegimenActImpl extends TherapeuticRegimenActImpl implements TularemiaTherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TularemiaTherapeuticRegimenActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TularemiaPackage.Literals.TULAREMIA_THERAPEUTIC_REGIMEN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaTherapeuticRegimenActOperations.validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaTherapeuticRegimenActOperations.validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TularemiaTreatmentGivenSubstanceAdministration> getTularemiaTreatmentGivenSubstanceAdministrations() {
		return TularemiaTherapeuticRegimenActOperations.getTularemiaTreatmentGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TularemiaTreatmentNotGivenSubstanceAdministration> getTularemiaTreatmentNotGivenSubstanceAdministrations() {
		return TularemiaTherapeuticRegimenActOperations.getTularemiaTreatmentNotGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTherapeuticRegimenActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TularemiaTherapeuticRegimenAct init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TularemiaTherapeuticRegimenAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TularemiaTherapeuticRegimenActImpl
