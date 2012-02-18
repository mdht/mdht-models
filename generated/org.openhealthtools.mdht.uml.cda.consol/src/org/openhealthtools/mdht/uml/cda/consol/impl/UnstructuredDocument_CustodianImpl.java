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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Custodian;

import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocument_CustodianOperations;
import org.openhealthtools.mdht.uml.cda.impl.CustodianImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Document Custodian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocument_CustodianImpl extends CustodianImpl implements UnstructuredDocument_Custodian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocument_CustodianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT_CUSTODIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianAssignedCustodian2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocument_CustodianOperations.validateCustodianAssignedCustodian2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument_Custodian init() {
    	CDAUtil.init(this);
    	return this;
	}
} // UnstructuredDocument_CustodianImpl
