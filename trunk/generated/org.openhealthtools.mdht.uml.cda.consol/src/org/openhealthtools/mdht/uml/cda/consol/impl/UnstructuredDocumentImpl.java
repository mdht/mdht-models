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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;

import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocumentOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
		return ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentComponent(this, diagnostics, context);
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
	public boolean validateUnstructuredDocumentRecordTargetPatientRole2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentRecordTargetPatientRole2Id(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAuthorAssignedAuthor2Addr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthorAssignedAuthor2Addr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCustodianAssignedCustodian2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init() {
		CDAUtil.init(this);
		return this;
	}
} // UnstructuredDocumentImpl
