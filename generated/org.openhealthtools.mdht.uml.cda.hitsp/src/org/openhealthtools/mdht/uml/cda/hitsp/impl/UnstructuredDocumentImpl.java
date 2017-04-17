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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScannedDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnstructuredDocumentImpl extends MedicalDocumentImpl implements UnstructuredDocument {
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
		return HITSPPackage.Literals.UNSTRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTypeIdFixed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasOneRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasOneRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientRoleAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientRoleAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientBirthYear(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientBirthYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentLegalAuthenticatorAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyBinaryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextMediaType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextRepresentation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateScannedDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentConfidentialityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentScanOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentScanOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentLegalAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentNoStructuredData(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentOnePatientPerDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // UnstructuredDocumentImpl
