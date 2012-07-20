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
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
	public boolean validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCommentActivityAuthorAssignedAuthorAssignPersonName(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAssignPersonName(this, diagnostics, context);
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
    	CDAUtil.init(this);
    	return this;
  }
} // CommentActivityImpl
