/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Odometer Reading Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getResponseOdometerReadingOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='ResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship ResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship ResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship ResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship' constraints.validation.error='ResponseOdometerReadingOrganizerTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.97'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship constraints.validation.error='ResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationshipResponseBeginningOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship constraints.validation.error='ResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationshipResponseOnSceneOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship constraints.validation.error='ResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationshipResponseDestinationOdometerReading'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship constraints.validation.error='ResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationshipResponseEndingOdometerReading'"
 * @generated
 */
public interface ResponseOdometerReadingOrganizer extends org.eclipse.mdht.uml.cda.Organizer {
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
	boolean validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.97\')'"
	 * @generated
	 */
	boolean validateResponseOdometerReadingOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOdometerReadingOrganizer init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseOdometerReadingOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // ResponseOdometerReadingOrganizer
