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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ExternalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.operations.ExternalDocumentReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExternalDocumentReferenceImpl extends ExternalDocumentImpl implements ExternalDocumentReference {
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
	public boolean validateExternalDocumentReferenceTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceId(this, diagnostics, context);
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
	public boolean validateExternalDocumentReferenceSetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocumentReferenceVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalDocumentReferenceOperations.validateExternalDocumentReferenceVersionNumber(
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
