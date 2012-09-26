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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentNotGivenSubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoTreatmentNotGivenSubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment Not Given Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StrepPneumoTreatmentNotGivenSubstanceAdministrationImpl extends TreatmentNotGivenSubstanceAdministrationImpl implements StrepPneumoTreatmentNotGivenSubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoTreatmentNotGivenSubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrepPneumoPackage.Literals.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTreatmentNotGivenSubstanceAdministrationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoTreatmentNotGivenSubstanceAdministrationOperations.validateTreatmentNotGivenSubstanceAdministrationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrepPneumoTreatmentNotGivenSubstanceAdministration init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StrepPneumoTreatmentNotGivenSubstanceAdministration init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StrepPneumoTreatmentNotGivenSubstanceAdministrationImpl
