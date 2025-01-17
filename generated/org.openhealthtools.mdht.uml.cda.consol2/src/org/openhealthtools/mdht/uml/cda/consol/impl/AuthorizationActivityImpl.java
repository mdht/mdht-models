/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorizationActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Activity</b></em>'.
 * <!-- end-user-doc -->
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
		return ConsolPackage.Literals.AUTHORIZATION_ACTIVITY;
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
	public boolean validateAuthorizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityId(this, diagnostics, context);
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
	public boolean validateAuthorizationActivityEntryRelationshipHasClinicalStatement(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipHasClinicalStatement(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorizationActivityOperations.validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(
			this, diagnostics, context);
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
	public AuthorizationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AuthorizationActivityImpl
