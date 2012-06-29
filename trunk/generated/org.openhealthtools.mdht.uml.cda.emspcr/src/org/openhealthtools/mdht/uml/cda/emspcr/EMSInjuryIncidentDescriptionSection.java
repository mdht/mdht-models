/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSInjuryIncidentDescriptionSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSInjuryIncidentDescriptionSectionTemplateId EMSInjuryIncidentDescriptionSectionCode EMSInjuryIncidentDescriptionSectionEntry3 EMSInjuryIncidentDescriptionSectionEntry4 EMSInjuryIncidentDescriptionSectionEntry5 EMSInjuryIncidentDescriptionSectionEntry6 EMSInjuryIncidentDescriptionSectionEntry7 EMSInjuryIncidentDescriptionSectionEntry8 EMSInjuryIncidentDescriptionSectionEntry9 EMSInjuryIncidentDescriptionSectionEntry10 EMSInjuryIncidentDescriptionSectionEntry11 EMSInjuryIncidentDescriptionSectionEntry12' templateId.root='2.16.840.1.113883.17.3.10.1.17' code.code='11374-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury incident description'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryCauseCategory code.code='69543-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury Cause' constraints.validation.error='InjuryCauseCategoryCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryMechanism code.code='67494-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury Mechanism' constraints.validation.error='InjuryMechanismCode InjuryMechanismValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryTraumaCenterCriteria code.code='67495-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Trauma Center Critieria' constraints.validation.error='TraumaCenterCriteriaCode TraumaCenterCriteriaValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryInjuryRiskFactor code.code='67496-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Other injury risk factors' constraints.validation.error='InjuryRiskFactorCode InjuryRiskFactorValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleImpactArea code.code='67497-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Location of impact on the vehicle' constraints.validation.error='VehicleImpactAreaCode VehicleImpactAreaValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryPatientLocationInVehicle code.code='67498-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Location of patient in vehicle' constraints.validation.error='PatientLocationInVehicleCode PatientLocationInVehicleValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryVehicleOccupantSafetyEquipment code.code='67499-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Safety equipment' constraints.validation.error='VehicleOccupantSafetyEquipmentCode VehicleOccupantSafetyEquipmentValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryAirbagDeploymentStatus code.code='67500-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Airbag deployment' constraints.validation.error='AirbagDeploymentStatusCode AirbagDeploymentStatusValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryHeightOfFall code.code='67501-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Height of fall' constraints.validation.error='HeightOfFallCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSInjuryIncidentDescriptionSectionDerivedEntryDisasterType code.code='69463-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Suspected intentional or unintentional disaster' constraints.validation.error='DisasterTypeCode DisasterTypeValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSInjuryIncidentDescriptionSection extends DerivedCDASection
{
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
  boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry9(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry10(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry11(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSInjuryIncidentDescriptionSectionEntry12(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSInjuryIncidentDescriptionSection init();
} // EMSInjuryIncidentDescriptionSection
