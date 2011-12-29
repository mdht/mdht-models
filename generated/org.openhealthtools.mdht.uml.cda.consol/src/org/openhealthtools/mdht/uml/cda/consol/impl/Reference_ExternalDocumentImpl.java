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
import org.openhealthtools.mdht.uml.cda.consol.Reference_ExternalDocument;

import org.openhealthtools.mdht.uml.cda.consol.operations.Reference_ExternalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.impl.ExternalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference External Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Reference_ExternalDocumentImpl extends ExternalDocumentImpl implements Reference_ExternalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference_ExternalDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REFERENCE_EXTERNAL_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Reference_ExternalDocumentOperations.validateExternalDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Reference_ExternalDocumentOperations.validateExternalDocumentText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_ExternalDocument init() {
		CDAUtil.init(this);
		return this;
	}
} // Reference_ExternalDocumentImpl
