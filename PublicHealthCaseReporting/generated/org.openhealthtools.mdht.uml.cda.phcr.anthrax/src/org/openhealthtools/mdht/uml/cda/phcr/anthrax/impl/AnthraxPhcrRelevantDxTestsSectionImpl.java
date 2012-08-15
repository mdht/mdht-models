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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxPhcrRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements AnthraxPhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthraxPhcrRelevantDxTestsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrRelevantDxTestsSectionOperations.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrRelevantDxTestsSectionOperations.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnthraxResultObservation> getAnthraxResultObservations() {
		return AnthraxPhcrRelevantDxTestsSectionOperations.getAnthraxResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnthraxResultOrganizer> getAnthraxResultOrganizers() {
		return AnthraxPhcrRelevantDxTestsSectionOperations.getAnthraxResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxPhcrRelevantDxTestsSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AnthraxPhcrRelevantDxTestsSectionImpl
