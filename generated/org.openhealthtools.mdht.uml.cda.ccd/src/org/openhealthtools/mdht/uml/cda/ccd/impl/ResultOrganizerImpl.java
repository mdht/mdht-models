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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerImpl extends OrganizerImpl implements ResultOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ResultOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.RESULT_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerCodeValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerComponentElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerComponentElement(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerInformationSource(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerResultObservation(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateResultOrganizerSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerSpecimen(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ResultObservation> getResultObservations() {
		return ResultOrganizerOperations.getResultObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ResultOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public ResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResultOrganizerImpl
