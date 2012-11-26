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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.AlertsSectionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergiesReactionsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergies Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergiesReactionsSectionImpl extends AlertsSectionImpl implements AllergiesReactionsSection {
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
		return IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesReactionsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesReactionsSectionAllergyIntoleranceConcern(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionAllergyIntoleranceConcern(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<AllergyIntoleranceConcern> getAllergyIntoleranceConcerns() {
		return AllergiesReactionsSectionOperations.getAllergyIntoleranceConcerns(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public AllergiesReactionsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesReactionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergiesReactionsSectionImpl
