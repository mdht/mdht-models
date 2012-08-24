/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.cdt.operations.UnstructuredDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocumentImpl extends GeneralHeaderConstraintsImpl implements UnstructuredDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.UNSTRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentPatientRoleHasId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentPatientRoleHasId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAssignedAuthorHasAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAssignedAuthorHasAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAssignedAuthorHasTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAssignedAuthorHasTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasTextReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasTextReferenceOrRepresentation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasTextMediaTypeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasTextMediaTypeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public UnstructuredDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // UnstructuredDocumentImpl
