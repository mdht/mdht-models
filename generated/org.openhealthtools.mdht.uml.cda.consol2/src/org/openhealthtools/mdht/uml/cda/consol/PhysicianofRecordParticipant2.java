/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physicianof Record Participant2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianofRecordParticipant2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianofRecordParticipant2TemplateId PhysicianofRecordParticipantAssignedEntity PhysicianofRecordParticipantAssignedEntityAssignedPersonName' templateId.root='2.16.840.1.113883.10.20.6.2.2' templateId.extension='2014-06-09' constraints.validation.query='PhysicianofRecordParticipantAssignedEntityAssignedPersonName PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization' constraints.validation.warning='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianofRecordParticipant2AssignedEntity constraints.validation.warning='PhysicianofRecordParticipantAssignedEntityHasNationalProviderId PhysicianofRecordParticipantAssignedEntityAssignedPerson' constraints.validation.info='PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.2\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null).representedOrganization-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(representedOrganization-&gt;one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianofRecordParticipant2
