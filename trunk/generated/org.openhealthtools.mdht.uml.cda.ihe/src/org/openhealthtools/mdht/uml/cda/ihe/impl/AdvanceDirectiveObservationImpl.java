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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationImpl extends
		org.openhealthtools.mdht.uml.cda.ccd.impl.AdvanceDirectiveObservationImpl implements
		AdvanceDirectiveObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AdvanceDirectiveObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSimpleObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SimpleObservationOperations.validateSimpleObservationStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationHasExternalReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationHasExternalReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationRepeatNumber(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEAdvanceDirectiveObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public AdvanceDirectiveObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveObservationImpl
