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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.operations.TreatmentNotGivenSubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment Not Given Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TreatmentNotGivenSubstanceAdministrationImpl extends SubstanceAdministrationImpl implements TreatmentNotGivenSubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentNotGivenSubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentNotGivenSubstanceAdministration init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreatmentNotGivenSubstanceAdministration init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TreatmentNotGivenSubstanceAdministrationImpl
