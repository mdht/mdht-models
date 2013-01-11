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
 * A representation of the model object '<em><b>EMS Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSInjuryIncidentDescriptionSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Injury Incident Description Section' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Injury Incident Description Section' templateId.root='2.16.840.1.113883.17.3.10.1.17' constraints.validation.error='EMSInjuryIncidentDescriptionSectionTemplateId EMSInjuryIncidentDescriptionSectionCode EMSInjuryIncidentDescriptionSectionTitle EMSInjuryIncidentDescriptionSectionText' code.codeSystemName='LOINC' code.code='11374-6' constraints.validation.info='EMSInjuryIncidentDescriptionSectionEntry3 EMSInjuryIncidentDescriptionSectionEntry4 EMSInjuryIncidentDescriptionSectionEntry5 EMSInjuryIncidentDescriptionSectionEntry6 EMSInjuryIncidentDescriptionSectionEntry7 EMSInjuryIncidentDescriptionSectionEntry8 EMSInjuryIncidentDescriptionSectionEntry9 EMSInjuryIncidentDescriptionSectionEntry10 EMSInjuryIncidentDescriptionSectionEntry11 EMSInjuryIncidentDescriptionSectionEntry12'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntry constraints.validation.error='InjuryCauseEntryInjuryCauseCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryCauseEntryInjuryCauseCategory value.codeSystemName='ICD-10' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Injury Cause' constraints.validation.error='InjuryCauseCategoryCode InjuryCauseCategoryValue' code.codeSystemName='LOINC' code.code='69543-7' value.codeSystem='2.16.840.1.113883.6.3.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntry constraints.validation.error='InjuryMechanismEntryInjuryMechanism'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryMechanismEntryInjuryMechanism value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Injury Mechanism' constraints.validation.error='InjuryMechanismCode InjuryMechanismValue' code.codeSystemName='LOINC' code.code='67494-5' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntry constraints.validation.error='TraumaCenterCriteriaEntryTraumaCenterCriteria'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaEntryTraumaCenterCriteria value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Trauma Center Critieria' constraints.validation.error='TraumaCenterCriteriaCode TraumaCenterCriteriaValue' code.codeSystemName='LOINC' code.code='67495-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntry constraints.validation.error='InjuryRiskFactorEntryInjuryRiskFactor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionInjuryRiskFactorEntryInjuryRiskFactor value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Other injury risk factors' constraints.validation.error='InjuryRiskFactorCode InjuryRiskFactorValue' code.codeSystemName='LOINC' code.code='67496-0' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntry constraints.validation.error='VehicleImpactAreaEntryVehicleImpactArea'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleImpactAreaEntryVehicleImpactArea value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Location of impact on the vehicle' constraints.validation.error='VehicleImpactAreaCode VehicleImpactAreaValue' code.codeSystemName='LOINC' code.code='67497-8' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntry constraints.validation.error='PatientLocationInVehicleEntryPatientLocationInVehicle'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleEntryPatientLocationInVehicle value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Location of patient in vehicle' constraints.validation.error='PatientLocationInVehicleCode PatientLocationInVehicleValue' code.codeSystemName='LOINC' code.code='67498-6' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntry constraints.validation.error='VehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentEntryVehicleOccupantSafetyEquipment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Safety equipment' constraints.validation.error='VehicleOccupantSafetyEquipmentCode VehicleOccupantSafetyEquipmentValue' code.codeSystemName='LOINC' code.code='67499-4' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntry constraints.validation.error='AirbagDeploymentEntryAirbagDeploymentStatus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionAirbagDeploymentEntryAirbagDeploymentStatus value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Airbag deployment' constraints.validation.error='AirbagDeploymentStatusCode AirbagDeploymentStatusValue' code.codeSystemName='LOINC' code.code='67500-9' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntry constraints.validation.error='FallHeightEntryHeightOfFall'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionFallHeightEntryHeightOfFall code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Height of fall' constraints.validation.error='HeightOfFallCode HeightOfFallValue' code.codeSystemName='LOINC' code.code='67501-7'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntry constraints.validation.error='DisasterTypeEntryDisasterType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDisasterTypeEntryDisasterType value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Suspected intentional or unintentional disaster' constraints.validation.error='DisasterTypeCode DisasterTypeValue' code.codeSystemName='LOINC' code.code='69463-8' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSInjuryIncidentDescriptionSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.17\')'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'11374-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Injury Incident Description Section')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Injury Incident Description Section\')'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry9(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry10(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry11(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))'"
   * @generated
   */
	boolean validateEMSInjuryIncidentDescriptionSectionEntry12(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryCauseEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryMechanismEntry)'"
   * @generated
   */
  void getEntry4();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::TraumaCenterCriteriaEntry)'"
   * @generated
   */
  void getEntry5();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::InjuryRiskFactorEntry)'"
   * @generated
   */
  void getEntry6();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleImpactAreaEntry)'"
   * @generated
   */
  void getEntry7();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::PatientLocationInVehicleEntry)'"
   * @generated
   */
  void getEntry8();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::VehicleOccupantSafetyEquipmentEntry)'"
   * @generated
   */
  void getEntry9();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::AirbagDeploymentEntry)'"
   * @generated
   */
  void getEntry10();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::FallHeightEntry)'"
   * @generated
   */
  void getEntry11();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescriptionSection::DisasterTypeEntry)'"
   * @generated
   */
  void getEntry12();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSInjuryIncidentDescriptionSection init();
} // EMSInjuryIncidentDescriptionSection
