/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianofRecordParticipantTemplateId PhysicianofRecordParticipantAssignedEntity PhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName' templateId.root='2.16.840.1.113883.10.20.6.2.2' templateId.extension='2014-06-09' constraints.validation.query='PhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipant2AssignedEntityHasNationalProviderId PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization' constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipant2AssignedEntityHasNationalProviderId PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntity constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntityAssignedPerson constraints.validation.error='PhysicianofRecordParticipantAssignedEntityAssignedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntityRepresentedOrganization constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName'"
 * @generated
 */
public interface PhysicianofRecordParticipant2 extends PhysicianofRecordParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianofRecordParticipant2
