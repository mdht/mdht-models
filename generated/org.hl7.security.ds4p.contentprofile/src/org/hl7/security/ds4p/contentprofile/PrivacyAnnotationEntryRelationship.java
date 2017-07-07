/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.EntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Annotation Entry Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getPrivacyAnnotationEntryRelationship()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrivacyAnnotationEntryRelationshipTemplateId PrivacyAnnotationEntryRelationshipOrganizer' templateId.root='2.16.840.1.113883.3.3251.1.11'"
 * @generated
 */
public interface PrivacyAnnotationEntryRelationship extends EntryRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.3251.1.11\')'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationEntryRelationshipTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.organizer->one(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(contentprofile::PrivacyAnnotation))'"
	 * @generated
	 */
	boolean validatePrivacyAnnotationEntryRelationshipOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyAnnotationEntryRelationship init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrivacyAnnotationEntryRelationship init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PrivacyAnnotationEntryRelationship
