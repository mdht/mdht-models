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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument_Author;

import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocument_AuthorOperations;

import org.openhealthtools.mdht.uml.cda.impl.AuthorImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuity Of Care Document Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocument_AuthorImpl extends AuthorImpl implements ContinuityOfCareDocument_Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument_AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorAssignedAuthor3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocument_AuthorOperations.validateAuthorAssignedAuthor3(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument_Author init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ContinuityOfCareDocument_AuthorImpl
