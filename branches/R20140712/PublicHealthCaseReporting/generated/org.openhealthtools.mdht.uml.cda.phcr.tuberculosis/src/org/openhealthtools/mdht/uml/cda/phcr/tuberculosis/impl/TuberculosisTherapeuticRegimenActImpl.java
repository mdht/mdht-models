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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisTherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisTherapeuticRegimenActImpl extends TherapeuticRegimenActImpl implements TuberculosisTherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisTherapeuticRegimenActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisTherapeuticRegimenActOperations.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisTherapeuticRegimenActOperations.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuberculosisTreatmentGivenSubstanceAdministration> getTuberculosisTreatmentGivenSubstanceAdministrations() {
		return TuberculosisTherapeuticRegimenActOperations.getTuberculosisTreatmentGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuberculosisTreatmentNotGivenSubstanceAdministration> getTuberculosisTreatmentNotGivenSubstanceAdministrations() {
		return TuberculosisTherapeuticRegimenActOperations.getTuberculosisTreatmentNotGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTherapeuticRegimenActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TuberculosisTherapeuticRegimenAct init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TuberculosisTherapeuticRegimenAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisTherapeuticRegimenActImpl
