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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxPhcrClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements AnthraxPhcrClinicalInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthraxPhcrClinicalInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnthraxPackage.Literals.ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrClinicalInformationSectionOperations.validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxCaseObservation getAnthraxCaseObservation() {
		return AnthraxPhcrClinicalInformationSectionOperations.getAnthraxCaseObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxPhcrClinicalInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AnthraxPhcrClinicalInformationSectionImpl