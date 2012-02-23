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

import org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.Author_AssignedAuthorOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedAuthorImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Assigned Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Author_AssignedAuthorImpl extends AssignedAuthorImpl implements Author_AssignedAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Author_AssignedAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.AUTHOR_ASSIGNED_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorHasNationalProviderIdentifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthorTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Author_AssignedAuthorOperations.validateAssignedAuthorTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author_AssignedAuthor init() {
		CDAUtil.init(this);
		return this;
	}
} // Author_AssignedAuthorImpl
