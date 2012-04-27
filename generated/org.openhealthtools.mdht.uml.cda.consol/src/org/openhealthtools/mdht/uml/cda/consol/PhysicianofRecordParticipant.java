/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.6.2.2' constraints.validation.error='PhysicianofRecordParticipantTemplateId PhysicianofRecordParticipantTypeCode PhysicianofRecordParticipantAssignedEntity' typeCode='ATND'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntity constraints.validation.error='AssignedEntityCode AssignedEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntityAssignedPerson constraints.validation.warning='AssignedPersonName'"
 * @generated
 */
public interface PhysicianofRecordParticipant extends EncounterParticipant {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.2\')'"
	* @generated
	*/
	boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.typeCode=vocab::x_EncounterParticipant::ATND
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::x_EncounterParticipant::ATND'"
	* @generated
	*/
	boolean validatePhysicianofRecordParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	* @generated
	*/
	boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PhysicianofRecordParticipant init();
} // PhysicianofRecordParticipant
