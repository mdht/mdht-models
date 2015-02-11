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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncounterActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncounterActivitiesTemplateId EncounterActivity2SdtcDDCFromNUBCOrDD EncounterActivitiesCodeP EncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.49' templateId.extension='2014-06-09' code.codeSystem='2.16.840.1.113883.6.12' code.codeSystemName='CPT-4' constraints.validation.warning='EncounterActivitiesCode EncounterActivitiesServiceDeliveryLocation EncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode' constraints.validation.info='EncounterActivitiesSDTCDischargeDispositionCode EncounterActivitiesIndication2 EncounterActivitiesEncounterDiagnosis2 EncounterActivitiesEncounterPerformer EncounterActivity2CDTranslation EncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP' constraints.validation.query='EncounterActivity2CDTranslation EncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP EncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode EncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity' constraints.validation.dependOn.EncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2EncounterPerformer constraints.validation.error='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2EncounterPerformerEncounterPerformerAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode' constraints.validation.info='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP' constraints.validation.dependOn.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode='EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolEncounterActivity2CD constraints.validation.info='EncounterActivity2CDTranslation'"
 * @generated
 */
public interface EncounterActivity2 extends EncounterActivities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCDischargeDispositionCode->forAll( element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and let value : datatypes::CE = element.oclAsType(datatypes::CE) in (value.codeSystem = \'2.16.840.1.113883.6.301.5\' or value.codeSystem = \'2.16.840.1.113883.12.112\') and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateEncounterActivity2SdtcDDCFromNUBCOrDD(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateEncounterActivitiesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
	 * @generated
	 */
	boolean validateEncounterActivitiesIndication2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EncounterDiagnosis2))'"
	 * @generated
	 */
	boolean validateEncounterActivitiesEncounterDiagnosis2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateEncounterActivity2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateEncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getConsolIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)).oclAsType(consol::EncounterDiagnosis2)'"
	 * @generated
	 */
	EList<EncounterDiagnosis2> getConsolEncounterDiagnosis2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)'"
	 * @generated
	 */
	EList<ServiceDeliveryLocation> getConsolServiceDeliveryLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncounterActivity2
