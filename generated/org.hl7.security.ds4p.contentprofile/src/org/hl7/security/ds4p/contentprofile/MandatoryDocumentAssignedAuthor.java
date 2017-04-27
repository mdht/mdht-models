/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Document Assigned Author</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getMandatoryDocumentAssignedAuthor()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MandatoryDocumentAssignedAuthorTemplateId MandatoryDocumentAssignedAuthorTelecomEmail' templateId.root='2.16.840.1.113883.3.3251.1.3' constraints.validation.warning='MandatoryDocumentAssignedAuthorAssignedAuthoringDevice MandatoryDocumentAssignedAuthorAssignedPerson MandatoryDocumentAssignedAuthorRepresentedOrganization'"
 * @generated
 */
public interface MandatoryDocumentAssignedAuthor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.3251.1.3\')'"
	 * @generated
	 */
	boolean validateMandatoryDocumentAssignedAuthorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (( not self.telecom->isEmpty()) )'"
	 * @generated
	 */
	boolean validateMandatoryDocumentAssignedAuthorTelecomEmail(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthoringDevice->one(assignedAuthoringDevice : cda::AuthoringDevice | not assignedAuthoringDevice.oclIsUndefined() and assignedAuthoringDevice.oclIsKindOf(cda::AuthoringDevice))'"
	 * @generated
	 */
	boolean validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))'"
	 * @generated
	 */
	boolean validateMandatoryDocumentAssignedAuthorAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity))'"
	 * @generated
	 */
	boolean validateMandatoryDocumentAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDocumentAssignedAuthor init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MandatoryDocumentAssignedAuthor init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MandatoryDocumentAssignedAuthor
