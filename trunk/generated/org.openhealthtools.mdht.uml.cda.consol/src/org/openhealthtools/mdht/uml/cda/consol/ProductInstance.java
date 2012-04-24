/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This clinical statement represents a particular device that was placed in or used as part of a procedure or other act. This provides a record of the identifier and other details about the given product that was used. For example, it is important to have a record that indicates not just that a hip prostheses was placed in a patient but that it was a particular hip prostheses number with a unique identifier.
 * The FDA Amendments Act specifies the creation of a Unique Device Identification (UDI) System that requires the label of devices to bear a unique identifier that will standardize device identification and identify the device through distribution and use.  
 * The UDI should be sent in the participantRole/id.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProductInstance()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProductInstanceTemplateId ProductInstanceClassCode ProductInstanceId ProductInstanceScopingEntity ProductInstancePlayingDevice ProductInstanceScopingEntityId' templateId.root='2.16.840.1.113883.10.20.22.4.37' classCode='MANU' constraints.validation.query='ProductInstanceScopingEntityId ProductInstancePlayingDeviceCode' constraints.validation.warning='ProductInstancePlayingDeviceCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProductInstanceScopingEntity constraints.validation.error='ScopingEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProductInstancePlayingDevice constraints.validation.warning='PlayingDeviceCode'"
 * @generated
 */
public interface ProductInstance extends ParticipantRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.37')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.37\')'"
	 * @generated
	 */
	boolean validateProductInstanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateProductInstanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateProductInstanceId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))'"
	 * @generated
	 */
	boolean validateProductInstanceScopingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))'"
	 * @generated
	 */
	boolean validateProductInstancePlayingDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.scopingEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.scopingEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateProductInstanceScopingEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingDevice->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingDevice->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProductInstancePlayingDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance init();
} // ProductInstance
