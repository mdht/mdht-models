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
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoPHCRTreatmentInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StrepPneumoPHCRTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements StrepPneumoPHCRTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoPHCRTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StrepPneumoPackage.Literals.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPHCRTreatmentInformationSectionOperations.validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoTherapeuticRegimenAct getStrepPneumoTherapeuticRegimenAct() {
		return StrepPneumoPHCRTreatmentInformationSectionOperations.getStrepPneumoTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StrepPneumoPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrepPneumoPHCRTreatmentInformationSection init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StrepPneumoPHCRTreatmentInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StrepPneumoPHCRTreatmentInformationSectionImpl
