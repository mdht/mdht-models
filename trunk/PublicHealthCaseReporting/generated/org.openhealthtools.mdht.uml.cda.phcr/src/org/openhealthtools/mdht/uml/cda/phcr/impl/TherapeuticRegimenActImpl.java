/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TherapeuticRegimenActImpl extends ActImpl implements TherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TherapeuticRegimenActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TherapeuticRegimenActOperations.validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreatmentGivenSubstanceAdministration> getTreatmentGivenSubstanceAdministrations() {
		return TherapeuticRegimenActOperations.getTreatmentGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreatmentNotGivenSubstanceAdministration> getTreatmentNotGivenSubstanceAdministrations() {
		return TherapeuticRegimenActOperations.getTreatmentNotGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TherapeuticRegimenAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TherapeuticRegimenAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
	
} //TherapeuticRegimenActImpl
