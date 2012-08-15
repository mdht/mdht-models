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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.ccd.impl.ImmunizationsSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisImmunizationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunizations Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PertussisImmunizationsSectionImpl extends ImmunizationsSectionImpl implements PertussisImmunizationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisImmunizationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PertussisPackage.Literals.PERTUSSIS_IMMUNIZATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationsSectionPertussisImmunizationActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisImmunizationsSectionOperations.validatePertussisImmunizationsSectionPertussisImmunizationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PertussisImmunizationActivity> getPertussisImmunizationActivities() {
		return PertussisImmunizationsSectionOperations.getPertussisImmunizationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PertussisImmunizationsSectionOperations.validateImmunizationsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisImmunizationsSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PertussisImmunizationsSectionImpl
