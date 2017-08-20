/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.EntryRelationshipImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship;

import org.hl7.security.ds4p.contentprofile.operations.PrivacyAnnotationEntryRelationshipOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Annotation Entry Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyAnnotationEntryRelationshipImpl extends EntryRelationshipImpl
		implements PrivacyAnnotationEntryRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyAnnotationEntryRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationEntryRelationshipTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyAnnotationEntryRelationshipOperations.validatePrivacyAnnotationEntryRelationshipTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePrivacyAnnotationEntryRelationshipOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyAnnotationEntryRelationshipOperations.validatePrivacyAnnotationEntryRelationshipOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyAnnotationEntryRelationship init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyAnnotationEntryRelationship init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrivacyAnnotationEntryRelationshipImpl
