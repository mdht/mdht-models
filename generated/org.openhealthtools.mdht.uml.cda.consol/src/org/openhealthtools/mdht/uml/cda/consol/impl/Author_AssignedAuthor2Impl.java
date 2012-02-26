/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.Author_AssignedAuthor2Operations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedAuthorImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Assigned Author2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Author_AssignedAuthor2Impl extends AssignedAuthorImpl implements Author_AssignedAuthor2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Author_AssignedAuthor2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.AUTHOR_ASSIGNED_AUTHOR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor2Addr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthor2Operations.validateAssignedAuthor2Addr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor2Telecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthor2Operations.validateAssignedAuthor2Telecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author_AssignedAuthor2 init() {
    	CDAUtil.init(this);
    	return this;
	}
} // Author_AssignedAuthor2Impl
