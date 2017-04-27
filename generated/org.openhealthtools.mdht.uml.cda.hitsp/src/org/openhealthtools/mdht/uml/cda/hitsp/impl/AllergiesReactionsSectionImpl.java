/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AllergiesReactionsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergies Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AllergiesReactionsSectionImpl extends
		org.openhealthtools.mdht.uml.cda.ihe.impl.AllergiesReactionsSectionImpl implements AllergiesReactionsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesReactionsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.ALLERGIES_REACTIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAllergiesReactionsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesReactionsSectionOperations.validateHITSPAllergiesReactionsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesReactionsSectionOperations.validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyDrugSensitivity> getAllergyDrugSensitivities() {
		return AllergiesReactionsSectionOperations.getAllergyDrugSensitivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesReactionsSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesReactionsSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergiesReactionsSectionImpl
