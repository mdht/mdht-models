/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends SectionImpl implements FunctionalStatusSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FunctionalStatusSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionClinicalStatements(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionClinicalStatements(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionObservationCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCodeValueSet(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionValueDatatype(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionValueDatatype(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionIcfCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionIcfCodeSystem(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionResultStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionResultStatusObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FunctionalStatusSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusSectionImpl
