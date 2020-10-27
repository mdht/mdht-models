/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ParticipantRole;

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
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProductInstanceScopingEntity constraints.validation.error='ProductInstanceScopingEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProductInstancePlayingDevice constraints.validation.warning='ProductInstancePlayingDeviceCode'"
 * @generated
 */
public interface ProductInstance extends ParticipantRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.37\')'"
	 * @generated
	 */
	boolean validateProductInstanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::RoleClassRoot::MANU'"
	 * @generated
	 */
	boolean validateProductInstanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateProductInstanceId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.scopingEntity-&gt;one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))'"
	 * @generated
	 */
	boolean validateProductInstanceScopingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingDevice-&gt;one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))'"
	 * @generated
	 */
	boolean validateProductInstancePlayingDevice(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.scopingEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateProductInstanceScopingEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingDevice-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProductInstancePlayingDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProductInstance
