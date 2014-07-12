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
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaPHCRClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza PHCR Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements InfluenzaPHCRClinicalInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRClinicalInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRClinicalInformationSectionOperations.validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaCaseObservation getInfluenzaCaseObservation() {
		return InfluenzaPHCRClinicalInformationSectionOperations.getInfluenzaCaseObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenzaPHCRClinicalInformationSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public InfluenzaPHCRClinicalInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InfluenzaPHCRClinicalInformationSectionImpl
