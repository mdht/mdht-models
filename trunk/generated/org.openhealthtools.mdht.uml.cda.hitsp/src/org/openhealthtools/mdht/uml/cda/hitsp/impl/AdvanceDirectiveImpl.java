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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AdvanceDirectiveOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.AdvanceDirectiveObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveImpl extends AdvanceDirectiveObservationImpl implements AdvanceDirective {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AdvanceDirectiveImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.ADVANCE_DIRECTIVE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasStartingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasStartingTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasEndingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasEndingTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasCustodian(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantRoleClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasAddress(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasTelecom(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveHasNameOfAgent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasNameOfAgent(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public AdvanceDirective init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirective init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveImpl
