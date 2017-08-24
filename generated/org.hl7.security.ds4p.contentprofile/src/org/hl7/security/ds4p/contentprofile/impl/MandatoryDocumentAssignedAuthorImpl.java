/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.AssignedAuthorImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor;

import org.hl7.security.ds4p.contentprofile.operations.MandatoryDocumentAssignedAuthorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Document Assigned Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MandatoryDocumentAssignedAuthorImpl extends AssignedAuthorImpl implements MandatoryDocumentAssignedAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryDocumentAssignedAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentAssignedAuthorTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentAssignedAuthorTelecomEmail(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorTelecomEmail(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryDocumentAssignedAuthorOperations.validateMandatoryDocumentAssignedAuthorRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDocumentAssignedAuthor init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDocumentAssignedAuthor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MandatoryDocumentAssignedAuthorImpl
