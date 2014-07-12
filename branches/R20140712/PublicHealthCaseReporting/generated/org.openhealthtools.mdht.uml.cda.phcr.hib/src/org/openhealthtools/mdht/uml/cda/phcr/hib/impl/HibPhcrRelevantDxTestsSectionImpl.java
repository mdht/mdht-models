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
package org.openhealthtools.mdht.uml.cda.phcr.hib.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.hib.operations.HibPhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HibPhcrRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements HibPhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibPhcrRelevantDxTestsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSectionHibResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HibPhcrRelevantDxTestsSectionOperations.validateHibPhcrRelevantDxTestsSectionHibResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HibPhcrRelevantDxTestsSectionOperations.validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HibResultObservation> getHibResultObservations() {
		return HibPhcrRelevantDxTestsSectionOperations.getHibResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HibResultOrganizer> getHibResultOrganizers() {
		return HibPhcrRelevantDxTestsSectionOperations.getHibResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HibPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HibPhcrRelevantDxTestsSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HibPhcrRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HibPhcrRelevantDxTestsSectionImpl
