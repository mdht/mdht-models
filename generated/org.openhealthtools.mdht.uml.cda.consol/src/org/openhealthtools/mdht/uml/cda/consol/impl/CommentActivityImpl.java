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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CommentActivityImpl extends ActImpl implements CommentActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMMENT_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorAssignPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAssignPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentActivityAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CommentActivityImpl
