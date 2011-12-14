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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument;

import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredOrScannedDocumentOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Or Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnstructuredOrScannedDocumentImpl extends GeneralHeaderConstraintsImpl implements
		UnstructuredOrScannedDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredOrScannedDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentTypeIdFixed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTypeIdFixed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasOneRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasOneRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasPatientRoleAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientRoleAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasPatientName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasPatientGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasPatientBirthYear(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientBirthYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasScanningDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasNonXMLBody(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentNoStructuredData(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentNoStructuredData(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentOnePatientPerDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentOnePatientPerDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentPatientRoleHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentPatientRoleHasId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredOrScannedDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredOrScannedDocumentOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredOrScannedDocument init() {
    	CDAUtil.init(this);
    	return this;
	}
} // UnstructuredOrScannedDocumentImpl
