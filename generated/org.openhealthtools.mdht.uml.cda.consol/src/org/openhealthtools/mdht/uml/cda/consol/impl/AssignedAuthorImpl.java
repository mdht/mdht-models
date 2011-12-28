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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedAuthorOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssignedAuthorImpl extends org.openhealthtools.mdht.uml.cda.impl.AssignedAuthorImpl implements
		AssignedAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSIGNED_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolAssignedAuthorAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthorOperations.validateConsolAssignedAuthorAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolAssignedAuthorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthorOperations.validateConsolAssignedAuthorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthorOperations.validateConsolAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolAssignedAuthorTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthorOperations.validateConsolAssignedAuthorTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedAuthor init() {
		CDAUtil.init(this);
		return this;
	}
} // AssignedAuthorImpl
