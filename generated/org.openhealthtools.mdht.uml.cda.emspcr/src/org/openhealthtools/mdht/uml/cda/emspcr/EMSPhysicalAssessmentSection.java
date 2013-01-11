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
 * A representation of the model object '<em><b>EMS Physical Assessment Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSPhysicalAssessmentSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Physical Assessment Section' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Physical Assessment Section' templateId.root='2.16.840.1.113883.17.3.10.1.20' constraints.validation.error='EMSPhysicalAssessmentSectionTemplateId EMSPhysicalAssessmentSectionCode EMSPhysicalAssessmentSectionCodeP EMSPhysicalAssessmentSectionTitle EMSPhysicalAssessmentSectionText EMSPhysicalAssessmentSectionEntry1 EMSPhysicalAssessmentSectionEntry2 EMSPhysicalAssessmentSectionEntry3 EMSPhysicalAssessmentSectionEntry4 EMSPhysicalAssessmentSectionEntry5 EMSPhysicalAssessmentSectionEntry6' code.codeSystemName='LOINC' code.code='67668-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionEMSNeurologicalAssessment constraints.validation.dependOn.EMSNeurologicalAssessmentCode='EMSNeurologicalAssessmentCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Neurological status assessment' constraints.validation.error='EMSNeurologicalAssessmentCode EMSNeurologicalAssessmentCodeP EMSNeurologicalAssessmentValue EMSNeurologicalAssessmentValueP' code.codeSystemName='LOINC' code.code='67536-3' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntry constraints.validation.error='PhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPhysicalAssessmentOrganizer constraints.validation.error='EMSPhysicalAssessmentOrganizerEffectiveTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryPatientBodyWeight code.codeSystem='2.16.840.1.113883.6.1' templateId.root='null' constraints.validation.error='PatientBodyWeightTemplateId PatientBodyWeightCode PatientBodyWeightValue' code.codeSystemName='LOINC' code.code='8335-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryLengthBasedPatientBodyWeightClass value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.LengthBasedPatientBodyWeightClassCode='LengthBasedPatientBodyWeightClassCodeP' constraints.validation.error='LengthBasedPatientBodyWeightClassCode LengthBasedPatientBodyWeightClassCodeP LengthBasedPatientBodyWeightClassValue LengthBasedPatientBodyWeightClassEffectiveTime' code.codeSystemName='LOINC' code.code='67670-0' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSSkinAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='null' constraints.validation.error='EMSSkinAssessmentTemplateId EMSSkinAssessmentCode EMSSkinAssessmentCodeP EMSSkinAssessmentValue EMSSkinAssessmentValueP' code.codeSystemName='LOINC' code.code='67524-9' constraints.validation.dependOn.EMSSkinAssessmentCode='EMSSkinAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeadAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSHeadAssessmentCode='EMSHeadAssessmentCodeP' constraints.validation.error='EMSHeadAssessmentCode EMSHeadAssessmentCodeP EMSHeadAssessmentValue EMSHeadAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67525-6' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSFaceAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.error='EMSFaceAssessmentCode EMSFaceAssessmentCodeP EMSFaceAssessmentValue EMSFaceAssessmentValueP EMSFaceAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67526-4' constraints.validation.dependOn.EMSFaceAssessmentCode='EMSFaceAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSNeckAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Neck assessment finding' constraints.validation.error='EMSNeckAssessmentCode EMSNeckAssessmentValue EMSNeckAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67527-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSChestAndLungsAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Chest and lungs assessment' constraints.validation.error='EMSChestAndLungsAssessmentCode EMSChestAndLungsAssessmentValue EMSChestAndLungsAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67528-0' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSHeartAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Heart assessment finding' constraints.validation.error='EMSHeartAssessmentCode EMSHeartAssessmentCodeP EMSHeartAssessmentValue EMSHeartAssessmentValueP EMSHeartAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67529-8' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSHeartAssessmentCode='EMSHeartAssessmentCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSAbdomenAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Abdomen assessment' constraints.validation.error='EMSAbdomenAssessmentCode EMSAbdomenAssessmentValue EMSAbdomenAssessmentTargetSiteCode EMSAbdomenAssessmentEffectiveTime' code.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' code.code='67530-6' value.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSPelvicAndGenitourinaryAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Pelvic and genitourinary assessment' constraints.validation.error='EMSPelvicAndGenitourinaryAssessmentCode EMSPelvicAndGenitourinaryAssessmentValue EMSPelvicAndGenitourinaryAssessmentValueP EMSPelvicAndGenitourinaryAssessmentEffectiveTime' code.codeSystemName='LOINC' code.code='67531-4' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSBackAndSpineAssessment constraints.validation.dependOn.EMSBackAndSpineAssessmentCode='EMSBackAndSpineAssessmentCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Back and spine assessment' constraints.validation.error='EMSBackAndSpineAssessmentCode EMSBackAndSpineAssessmentCodeP EMSBackAndSpineAssessmentTargetSiteCode EMSBackAndSpineAssessmentTargetSiteCodeP EMSBackAndSpineAssessmentValue EMSBackAndSpineAssessmentValueP EMSBackAndSpineAssessmentEffectiveTime' code.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' code.code='67532-2' value.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSExtremitiesAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Extremities assessment' constraints.validation.error='EMSExtremitiesAssessmentCode EMSExtremitiesAssessmentCodeP EMSExtremitiesAssessmentTargetSiteCode EMSExtremitiesAssessmentValue EMSExtremitiesAssessmentEffectiveTime' code.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' code.code='67533-0' constraints.validation.dependOn.EMSExtremitiesAssessmentCode='EMSExtremitiesAssessmentCodeP' constraints.validation.info='EMSExtremitiesAssessmentTargetSiteCodeP' value.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSEyeAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSEyeAssessmentCode='EMSEyeAssessmentCodeP' code.displayName='Eye assessment' constraints.validation.error='EMSEyeAssessmentCode EMSEyeAssessmentCodeP EMSEyeAssessmentTargetSiteCode EMSEyeAssessmentTargetSiteCodeP EMSEyeAssessmentValue EMSEyeAssessmentValueP EMSEyeAssessmentEffectiveTime' code.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' code.code='67534-8' value.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPhysicalAssessmentEntryEMSMentalStatusAssessment value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Mental status assessment' constraints.validation.error='EMSMentalStatusAssessmentCode EMSMentalStatusAssessmentValue' constraints.validation.dependOn.EMSMentalStatusAssessmentCode='EMSMentalStatusAssessmentCodeP' code.codeSystemName='LOINC' code.code='67535-5' constraints.validation.info='EMSMentalStatusAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntry constraints.validation.info='PregnancyEntryPatientPregnancy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPregnancyEntryPatientPregnancy value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Patient Pregnancy' constraints.validation.error='PatientPregnancyCode PatientPregnancyCodeP PatientPregnancyValue PatientPregnancyValueP' code.codeSystemName='LOINC' code.code='67471-3' constraints.validation.dependOn.PatientPregnancyCode='PatientPregnancyCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntry constraints.validation.info='OralIntakeEntryLastOralIntake'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionOralIntakeEntryLastOralIntake constraints.validation.dependOn.LastOralIntakeCode='LastOralIntakeCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Last oral intake' constraints.validation.error='LastOralIntakeCode LastOralIntakeCodeP LastOralIntakeValue' code.codeSystemName='LOINC' code.code='67517-3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntry constraints.validation.error='PatientAgeEntryEMSPatientAge'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionPatientAgeEntryEMSPatientAge code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Patient age' constraints.validation.error='EMSPatientAgeCode EMSPatientAgeCodeP EMSPatientAgeValue' code.codeSystemName='LOINC' code.code='30525-0' constraints.validation.dependOn.EMSPatientAgeCode='EMSPatientAgeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntry constraints.validation.info='ThrombolyticEntryEMSThrombolyticContraindications'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionThrombolyticEntryEMSThrombolyticContraindications value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Contraindications to thrombolytic use' constraints.validation.error='EMSThrombolyticContraindicationsCode EMSThrombolyticContraindicationsCodeP EMSThrombolyticContraindicationsValue' constraints.validation.dependOn.EMSThrombolyticContraindicationsCode='EMSThrombolyticContraindicationsCodeP' code.codeSystemName='LOINC' code.code='67523-1' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntry constraints.validation.error='BarrriersEntryEMSBarriersToPatientCare'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSPhysicalAssessmentSectionBarrriersEntryEMSBarriersToPatientCare constraints.validation.dependOn.EMSBarriersToPatientCareCode='EMSBarriersToPatientCareCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Barriers to patient care' constraints.validation.error='EMSBarriersToPatientCareCode EMSBarriersToPatientCareCodeP EMSBarriersToPatientCareValue EMSBarriersToPatientCareValueP' code.codeSystemName='LOINC' code.code='67523-1' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSPhysicalAssessmentSection extends Section {
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
   * value.code = '67668-4' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67668-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
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
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Physical Assessment Section')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Physical Assessment Section\')'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry))'"
   * @generated
   */
	boolean validateEMSPhysicalAssessmentSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PhysicalAssessmentEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PregnancyEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::OralIntakeEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::PatientAgeEntry)'"
   * @generated
   */
  void getEntry4();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::ThrombolyticEntry)'"
   * @generated
   */
  void getEntry5();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry))->asSequence()->first().oclAsType(emspcr::EMSPhysicalAssessmentSection::BarrriersEntry)'"
   * @generated
   */
  void getEntry6();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPhysicalAssessmentSection init();
} // EMSPhysicalAssessmentSection
