/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.AuthorImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance;

import org.hl7.security.ds4p.contentprofile.operations.MandatoryDocumentProvenanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Document Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MandatoryDocumentProvenanceImpl extends AuthorImpl implements MandatoryDocumentProvenance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryDocumentProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_PROVENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentProvenanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentProvenanceTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryDocumentProvenanceAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MandatoryDocumentProvenanceOperations.validateMandatoryDocumentProvenanceAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryDocumentProvenance init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MandatoryDocumentProvenance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MandatoryDocumentProvenanceImpl
