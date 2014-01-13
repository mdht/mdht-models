/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDelayOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DelayOrganizerDispatchDelayRelationship DelayOrganizerResponseDelayRelationship DelayOrganizerSceneDelayRelationship DelayOrganizerTransportDelayRelationship DelayOrganizerTurnaoundDelayRelationship DelayOrganizerTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.95'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDelayOrganizerDispatchDelayRelationship constraints.validation.error='DelayOrganizerDispatchDelayRelationshipDispatchDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDelayOrganizerResponseDelayRelationship constraints.validation.error='DelayOrganizerResponseDelayRelationshipResponseDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDelayOrganizerSceneDelayRelationship constraints.validation.error='DelayOrganizerSceneDelayRelationshipSceneDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDelayOrganizerTransportDelayRelationship constraints.validation.error='DelayOrganizerTransportDelayRelationshipTransportDelay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrDelayOrganizerTurnaoundDelayRelationship constraints.validation.error='DelayOrganizerTurnaoundDelayRelationshipTurnaroundDelay'"
 * @generated
 */
public interface DelayOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDelayOrganizerDispatchDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDelayOrganizerResponseDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDelayOrganizerSceneDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDelayOrganizerTransportDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateDelayOrganizerTurnaoundDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.95\')'"
	 * @generated
	 */
	boolean validateDelayOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DelayOrganizer
