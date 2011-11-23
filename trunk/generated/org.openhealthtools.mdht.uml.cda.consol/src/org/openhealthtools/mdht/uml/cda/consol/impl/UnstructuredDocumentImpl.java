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
	public boolean validateUnstructuredDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeIdFixed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasOneRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOneRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientRoleAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientRoleAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientBirthYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientBirthYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyBinaryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextMediaType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentNoStructuredData(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentOnePatientPerDocument(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentConfidentialityCode(this, diagnostics, context);
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
	public boolean validateUnstructuredDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeId(this, diagnostics, context);
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
	public UnstructuredDocument init() {
    	CDAUtil.init(this);
    	return this;
	}
} //UnstructuredDocumentImpl
