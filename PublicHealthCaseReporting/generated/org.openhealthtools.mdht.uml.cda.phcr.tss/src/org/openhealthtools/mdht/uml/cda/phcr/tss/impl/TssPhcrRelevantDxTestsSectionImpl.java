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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssPhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TssPhcrRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements TssPhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TssPhcrRelevantDxTestsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssPhcrRelevantDxTestsSectionOperations.validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTssPhcrRelevantDxTestsSectionTssResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssPhcrRelevantDxTestsSectionOperations.validateTssPhcrRelevantDxTestsSectionTssResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TssResultOrganizer> getTssResultOrganizers() {
		return TssPhcrRelevantDxTestsSectionOperations.getTssResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TssResultObservation> getTssResultObservations() {
		return TssPhcrRelevantDxTestsSectionOperations.getTssResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TssPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TssPhcrRelevantDxTestsSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TssPhcrRelevantDxTestsSectionImpl
