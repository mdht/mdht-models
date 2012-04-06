/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
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
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AuthorizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AuthorizationActivityImpl extends ActImpl implements AuthorizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.AUTHORIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityEntryRelationshipTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipTarget(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityHasPerformers(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityHasPerformers(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init() {
		CDAUtil.init(this);
		return this;
	}
} // AuthorizationActivityImpl
