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
 * A representation of the model object '<em><b>EMS Physical Assessment Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSPhysicalAssessmentSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSPhysicalAssessmentSectionTemplateId EMSPhysicalAssessmentSectionCode EMSPhysicalAssessmentSectionCodeP EMSPhysicalAssessmentSectionText EMSPhysicalAssessmentSectionEntry1 EMSPhysicalAssessmentSectionEntry2 EMSPhysicalAssessmentSectionEntry3 EMSPhysicalAssessmentSectionEntry4 EMSPhysicalAssessmentSectionEntry5 EMSPhysicalAssessmentSectionEntry6' templateId.root='2.16.840.1.113883.17.3.10.1.20' code.code='67668?4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='EMSPhysicalAssessmentSectionTitle'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntry constraints.validation.error='DerivedEntryEMSBarriersToPatientCare' constraints.validation.info='DerivedEntryEMSThrombolyticContraindications'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizer constraints.validation.error='EMSPhysicalAssessmentOrganizerEffectiveTime' constraints.validation.info='EMSPhysicalAssessmentOrganizerPatientBodyWeight EMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass EMSPhysicalAssessmentOrganizerEMSSkinAssessment EMSPhysicalAssessmentOrganizerEMSHeadAssessment EMSPhysicalAssessmentOrganizerEMSFaceAssessment EMSPhysicalAssessmentOrganizerEMSNeckAssessment EMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment EMSPhysicalAssessmentOrganizerEMSHeartAssessment EMSPhysicalAssessmentOrganizerEMSAbdomenAssessment EMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment EMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment EMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment EMSPhysicalAssessmentOrganizerEMSEyeAssessment EMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment EMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerPatientBodyWeight code.code='8335?2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='PatientBodyWeightCode PatientBodyWeightValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerLengthBasedPatientBodyWeightClass code.code='67670?0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='LengthBasedPatientBodyWeightClassCode LengthBasedPatientBodyWeightClassCodeP LengthBasedPatientBodyWeightClassValue' constraints.validation.dependOn.LengthBasedPatientBodyWeightClassCode='LengthBasedPatientBodyWeightClassCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSSkinAssessment code.code='67524?9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSSkinAssessmentCode EMSSkinAssessmentCodeP EMSSkinAssessmentValue EMSSkinAssessmentValueP' constraints.validation.dependOn.EMSSkinAssessmentCode='EMSSkinAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeadAssessment code.code='67525?6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSHeadAssessmentCode EMSHeadAssessmentCodeP EMSHeadAssessmentValue' constraints.validation.dependOn.EMSHeadAssessmentCode='EMSHeadAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSFaceAssessment code.code='67526?4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='EMSFaceAssessmentCode EMSFaceAssessmentCodeP EMSFaceAssessmentValue EMSFaceAssessmentValueP' constraints.validation.dependOn.EMSFaceAssessmentCode='EMSFaceAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeckAssessment code.code='67527?2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Neck assessment finding' constraints.validation.error='EMSNeckAssessmentCode EMSNeckAssessmentValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSChestAndLungsAssessment code.code='67528?0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Chest and lungs assessment' constraints.validation.error='EMSChestAndLungsAssessmentCode EMSChestAndLungsAssessmentValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSHeartAssessment code.code='67529?8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Heart assessment finding' constraints.validation.error='EMSHeartAssessmentCode EMSHeartAssessmentCodeP EMSHeartAssessmentValue EMSHeartAssessmentValueP' constraints.validation.dependOn.EMSHeartAssessmentCode='EMSHeartAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSAbdomenAssessment code.code='67530?6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Abdomen assessment' constraints.validation.error='EMSAbdomenAssessmentCode EMSAbdomenAssessmentValue EMSAbdomenAssessmentTargetSiteCode' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSPelvicAndGenitourinaryAssessment code.code='67531?4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Pelvic and genitourinary assessment' constraints.validation.error='EMSPelvicAndGenitourinaryAssessmentCode EMSPelvicAndGenitourinaryAssessmentValue EMSPelvicAndGenitourinaryAssessmentValueP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSBackAndSpineAssessment code.code='67532?2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Back and spine assessment' constraints.validation.error='EMSBackAndSpineAssessmentCode EMSBackAndSpineAssessmentCodeP EMSBackAndSpineAssessmentTargetSiteCode EMSBackAndSpineAssessmentTargetSiteCodeP EMSBackAndSpineAssessmentValue EMSBackAndSpineAssessmentValueP' constraints.validation.dependOn.EMSBackAndSpineAssessmentCode='EMSBackAndSpineAssessmentCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSExtremitiesAssessment code.code='67533?0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Extremities assessment' constraints.validation.error='EMSExtremitiesAssessmentCode EMSExtremitiesAssessmentCodeP EMSExtremitiesAssessmentTargetSiteCode EMSExtremitiesAssessmentValue' constraints.validation.dependOn.EMSExtremitiesAssessmentCode='EMSExtremitiesAssessmentCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' constraints.validation.info='EMSExtremitiesAssessmentTargetSiteCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSEyeAssessment code.code='67534?8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Eye assessment' constraints.validation.error='EMSEyeAssessmentCode EMSEyeAssessmentCodeP EMSEyeAssessmentTargetSiteCode EMSEyeAssessmentTargetSiteCodeP EMSEyeAssessmentValue EMSEyeAssessmentValueP' constraints.validation.dependOn.EMSEyeAssessmentCode='EMSEyeAssessmentCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSMentalStatusAssessment code.code='67535?5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Mental status assessment' constraints.validation.error='EMSMentalStatusAssessmentCode EMSMentalStatusAssessmentValue' constraints.validation.info='EMSMentalStatusAssessmentCodeP' constraints.validation.dependOn.EMSMentalStatusAssessmentCode='EMSMentalStatusAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPhysicalAssessmentOrganizerEMSNeurologicalAssessment code.code='67536?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Neurological status assessment' constraints.validation.error='EMSNeurologicalAssessmentCode EMSNeurologicalAssessmentCodeP EMSNeurologicalAssessmentValue EMSNeurologicalAssessmentValueP' constraints.validation.dependOn.EMSNeurologicalAssessmentCode='EMSNeurologicalAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryPatientPregnancy code.code='67471?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Patient Pregnancy' constraints.validation.error='PatientPregnancyCode PatientPregnancyCodeP PatientPregnancyValue PatientPregnancyValueP' constraints.validation.dependOn.PatientPregnancyCode='PatientPregnancyCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryLastOralIntake code.code='67517?3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Last oral intake' constraints.validation.error='LastOralIntakeCode LastOralIntakeCodeP LastOralIntakeValue' constraints.validation.dependOn.LastOralIntakeCode='LastOralIntakeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSPatientAge code.code='30525?0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Patient age' constraints.validation.error='EMSPatientAgeCode EMSPatientAgeCodeP EMSPatientAgeValue' constraints.validation.dependOn.EMSPatientAgeCode='EMSPatientAgeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSThrombolyticContraindications code.code='67523?1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Contraindications to thrombolytic use' constraints.validation.error='EMSThrombolyticContraindicationsCode EMSThrombolyticContraindicationsCodeP EMSThrombolyticContraindicationsValue' constraints.validation.dependOn.EMSThrombolyticContraindicationsCode='EMSThrombolyticContraindicationsCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionDerivedEntryEMSBarriersToPatientCare code.code='67523?1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Barriers to patient care' constraints.validation.error='EMSBarriersToPatientCareCode EMSBarriersToPatientCareCodeP EMSBarriersToPatientCareValue EMSBarriersToPatientCareValueP' constraints.validation.dependOn.EMSBarriersToPatientCareCode='EMSBarriersToPatientCareCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSPhysicalAssessmentSection extends DerivedCDASection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.20')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.20\')'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67668?4' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67668?4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateEMSPhysicalAssessmentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::DerivedEntry))'"
   * @generated
   */
  boolean validateEMSPhysicalAssessmentSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPhysicalAssessmentSection init();
} // EMSPhysicalAssessmentSection
