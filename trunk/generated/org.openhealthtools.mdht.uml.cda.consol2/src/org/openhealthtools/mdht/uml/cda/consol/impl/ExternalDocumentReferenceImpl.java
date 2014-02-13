/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;

import org.openhealthtools.mdht.uml.cda.consol.operations.ExternalDocumentReferenceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Document Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentReferenceImpl extends ActImpl implements ExternalDocumentReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDocumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentSetId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentSetId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceReferenceExternalDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocumentReference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocumentReference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ExternalDocumentReferenceImpl
