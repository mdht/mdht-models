/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lymph Node Sampling Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getLymphNodeSamplingResultOrganizer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result Organizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Lymph Node Sampling Result OrganizerTemplateId Lymph Node Sampling Result OrganizerClassCode Lymph Node Sampling Result OrganizerCode Lymph Node Sampling Result OrganizerEffectiveTime Lymph Node Sampling Result OrganizerStatusCode Lymph Node Sampling Result OrganizerStatusCodeP Lymph Node Sampling Result OrganizerNumber of Lymph Nodes Removed and Examined Lymph Node Sampling Result OrganizerNumber of Lymph Nodes Positive Lymph Node Sampling Result OrganizerReferenceExternalDocumentCode Lymph Node Sampling Result OrganizerSpecimenSpecimenRolePlayingEntityCode Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleId Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleSpecimenPlayingEntity' templateId.root='2.16.840.1.113883.10.20.30.3.13'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataLymphNodeSamplingResultOrganizerSpecimenSpecimenRole constraints.validation.error='Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleId Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleSpecimenPlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='Lymph Node Sampling Result OrganizerSpecimenSpecimenRolePlayingEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataLymphNodeSamplingResultOrganizerReference typeCode='REFR'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataLymphNodeSamplingResultOrganizerReferenceExternalDocument code.code='34122-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Pathology Note' constraints.validation.error='Lymph Node Sampling Result OrganizerReferenceExternalDocumentCode'"
 * @generated
 */
public interface LymphNodeSamplingResultOrganizer extends ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerStatusCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerStatusCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'aborted\' or value.code = \'active\' or value.code = \'cancelled\' or value.code = \'completed\' or value.code = \'held\' or value.code = \'suspended\')'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerNumber of Lymph Nodes Removed and Examined'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::NumberofLymphNodesRemovedandExamined))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerNumber of Lymph Nodes Positive'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::NumberofLymphNodesPositive))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerReferenceExternalDocumentCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'34122-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\'))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerSpecimenSpecimenRolePlayingEntityCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen->excluding(null).specimenRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Lymph Node Sampling Result OrganizerSpecimenSpecimenRoleSpecimenPlayingEntity'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen->excluding(null).specimenRole->excluding(null)->reject(specimenPlayingEntity->one(specimenPlayingEntity : cda::PlayingEntity | not specimenPlayingEntity.oclIsUndefined() and specimenPlayingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getNumber of Lymph Nodes Removed and Examined'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::NumberofLymphNodesRemovedandExamined))->asSequence()->any(true).oclAsType(clondata::NumberofLymphNodesRemovedandExamined)'"
	 * @generated
	 */
	NumberofLymphNodesRemovedandExamined getNumberofLymphNodesRemovedandExamined();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getNumber of Lymph Nodes Positive'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::NumberofLymphNodesPositive))->asSequence()->any(true).oclAsType(clondata::NumberofLymphNodesPositive)'"
	 * @generated
	 */
	NumberofLymphNodesPositive getNumberofLymphNodesPositive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LymphNodeSamplingResultOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LymphNodeSamplingResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // LymphNodeSamplingResultOrganizer
