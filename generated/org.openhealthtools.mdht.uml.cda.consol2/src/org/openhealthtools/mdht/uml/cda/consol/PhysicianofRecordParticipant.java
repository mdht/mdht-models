/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.EncounterParticipant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianofRecordParticipantTemplateId PhysicianofRecordParticipantTypeCode PhysicianofRecordParticipantAssignedEntity PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId' templateId.root='2.16.840.1.113883.10.20.6.2.2' typeCode='ATND' constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.query='PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId PhysicianofRecordParticipantAssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntity constraints.validation.error='PhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode PhysicianofRecordParticipantAssignedEntityCode PhysicianofRecordParticipantAssignedEntityId' constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipantAssignedEntityAssignedPerson constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityAssignedPersonName'"
 * @generated
 */
public interface PhysicianofRecordParticipant extends EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.2\')'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).assignedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(code.codeSystem = \'1.2.840.10008.2.16.4\' or code.codeSystem = \'2.16.840.1.113883.6.101\')'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(id-&gt;exists( root=\'2.16.840.1.113883.4.6\' ))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(assignedPerson-&gt;one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianofRecordParticipant
