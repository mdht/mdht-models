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
 * A representation of the model object '<em><b>Service Delivery Location</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getServiceDeliveryLocation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ServiceDeliveryLocationTemplateId ServiceDeliveryLocationHasPlayingEntityClassCode ServiceDeliveryLocationClassCode ServiceDeliveryLocationCode' templateId.root='2.16.840.1.113883.10.20.22.4.32' constraints.validation.info='ServiceDeliveryLocationHasPlayingEntity ServiceDeliveryLocationHasPlayingEntityName' classCode='SDLOC' code.codeSystem='2.16.840.1.113883.6.259' code.codeSystemName='HealthcareServiceLocation' constraints.validation.warning='ServiceDeliveryLocationAddr ServiceDeliveryLocationTelecom'"
 * @generated
 */
public interface ServiceDeliveryLocation extends ParticipantRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingEntity-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationHasPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingEntity-&gt;size()&gt;0 implies self.playingEntity.classCode=vocab::EntityClassRoot::PLC'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationHasPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.playingEntity-&gt;size()&gt;0 implies self.playingEntity.name-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationHasPlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.32\')'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::RoleClassRoot::SDLOC'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.259\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.addr-&gt;isEmpty() or self.addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.addr-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.telecom-&gt;isEmpty() or self.telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.telecom-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateServiceDeliveryLocationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ServiceDeliveryLocation
