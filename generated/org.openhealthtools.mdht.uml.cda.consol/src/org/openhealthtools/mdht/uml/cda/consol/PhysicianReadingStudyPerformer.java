/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Performer1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physician Reading Study Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianReadingStudyPerformer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianReadingStudyPerformerTemplateId PhysicianReadingStudyPerformerTypeCode PhysicianReadingStudyPerformerAssignedEntity PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityCode PhysicianReadingStudyPerformerAssignedEntityId' templateId.root='2.16.840.1.113883.10.20.6.2.1' constraints.validation.info='PhysicianReadingStudyPerformerTime' constraints.validation.warning='PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId' constraints.validation.query='PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityCode PhysicianReadingStudyPerformerAssignedEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianReadingStudyPerformerAssignedEntity constraints.validation.warning='PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId' constraints.validation.error='PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityCode PhysicianReadingStudyPerformerAssignedEntityId'"
 * @generated
 */
public interface PhysicianReadingStudyPerformer extends Performer1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.1\')'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'typeCode\')'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(code.codeSystem = \'1.2.840.10008.2.16.4\' or code.codeSystem = \'2.16.840.1.113883.6.101\')'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject(not assignedPerson->isEmpty() or  not representedOrganization->isEmpty())'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicianReadingStudyPerformer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianReadingStudyPerformer
