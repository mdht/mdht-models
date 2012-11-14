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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveVerificationOperations;
import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveVerificationImpl extends Participant2Impl implements AdvanceDirectiveVerification {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AdvanceDirectiveVerificationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveVerificationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveVerificationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAdvanceDirectiveVerificationTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AdvanceDirectiveVerification init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public AdvanceDirectiveVerification init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveVerificationImpl
