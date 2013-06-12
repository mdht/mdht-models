/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getInjuryIncidentDescriptionSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InjuryIncidentDescriptionSectionTemplateId InjuryIncidentDescriptionSectionCode InjuryIncidentDescriptionSectionTitle InjuryIncidentDescriptionSectionText InjuryIncidentDescriptionSectionInjuryCauseCategory InjuryIncidentDescriptionSectionInjuryMechanism InjuryIncidentDescriptionSectionTraumaCenterCriteria InjuryIncidentDescriptionSectionInjuryRiskFactor InjuryIncidentDescriptionSectionVehicleImpactArea InjuryIncidentDescriptionSectionPatientLocationInVehicle InjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment InjuryIncidentDescriptionSectionAirbagDeploymentStatus InjuryIncidentDescriptionSectionHeightOfFall InjuryIncidentDescriptionSectionDisasterType' templateId.root='2.16.840.1.113883.17.3.10.1.17' code.code='11374-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury Incident Description Section' title.mixed='Injury Incident Description Section'"
 * @generated
 */
public interface InjuryIncidentDescriptionSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.17\')'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'11374-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Injury Incident Description Section\')'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryCauseCategory) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionInjuryCauseCategory(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryMechanism) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionInjuryMechanism(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TraumaCenterCriteria) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryRiskFactor) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionInjuryRiskFactor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleImpactArea) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionVehicleImpactArea(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientLocationInVehicle) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AirbagDeploymentStatus) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::HeightOfFall) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionHeightOfFall(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DisasterType) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	* @generated
	*/
	boolean validateInjuryIncidentDescriptionSectionDisasterType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryCauseCategory))->asSequence()->any(true).oclAsType(emspcr::InjuryCauseCategory)'"
	* @generated
	*/
	InjuryCauseCategory getInjuryCauseCategory();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryMechanism))->asSequence()->any(true).oclAsType(emspcr::InjuryMechanism)'"
	* @generated
	*/
	InjuryMechanism getInjuryMechanism();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TraumaCenterCriteria))->asSequence()->any(true).oclAsType(emspcr::TraumaCenterCriteria)'"
	* @generated
	*/
	TraumaCenterCriteria getTraumaCenterCriteria();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryRiskFactor))->asSequence()->any(true).oclAsType(emspcr::InjuryRiskFactor)'"
	* @generated
	*/
	InjuryRiskFactor getInjuryRiskFactor();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleImpactArea))->asSequence()->any(true).oclAsType(emspcr::VehicleImpactArea)'"
	* @generated
	*/
	VehicleImpactArea getVehicleImpactArea();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientLocationInVehicle))->asSequence()->any(true).oclAsType(emspcr::PatientLocationInVehicle)'"
	* @generated
	*/
	PatientLocationInVehicle getPatientLocationInVehicle();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment))->asSequence()->any(true).oclAsType(emspcr::VehicleOccupantSafetyEquipment)'"
	* @generated
	*/
	VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AirbagDeploymentStatus))->asSequence()->any(true).oclAsType(emspcr::AirbagDeploymentStatus)'"
	* @generated
	*/
	AirbagDeploymentStatus getAirbagDeploymentStatus();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::HeightOfFall))->asSequence()->any(true).oclAsType(emspcr::HeightOfFall)'"
	* @generated
	*/
	HeightOfFall getHeightOfFall();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DisasterType))->asSequence()->any(true).oclAsType(emspcr::DisasterType)'"
	* @generated
	*/
	DisasterType getDisasterType();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public InjuryIncidentDescriptionSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryIncidentDescriptionSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // InjuryIncidentDescriptionSection
