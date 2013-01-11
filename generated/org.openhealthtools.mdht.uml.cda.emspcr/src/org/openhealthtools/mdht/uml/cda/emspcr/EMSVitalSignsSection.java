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
 * A representation of the model object '<em><b>EMS Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSVitalSignsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Vital Signs' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Vital Signs Section' templateId.root='2.16.840.1.113883.17.3.10.1.23' constraints.validation.error='EMSVitalSignsSectionTemplateId EMSVitalSignsSectionCode EMSVitalSignsSectionTitle EMSVitalSignsSectionText EMSVitalSignsSectionEntry1' code.codeSystemName='LOINC' code.code='67801-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntry constraints.validation.error='EMSVitalSignsEntryEMSVitalSignsOrganizer' constraints.validation.info='EMSVitalSignsEntryEMSPriorAidVitals EMSVitalSignsEntryEMSCardiacRhythm EMSVitalSignsEntryEMSCarbonDioxide EMSVitalSignsEntryEMSCarbonMonoxide EMSVitalSignsEntryEMSBloodGlucose EMSVitalSignsEntryEMSLevelOfResponsiveness EMSVitalSignsEntryEMSPainScore EMSVitalSignsEntryEMSStrokeScore'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizer constraints.validation.error='EMSVitalSignsOrganizerEffectiveTime' constraints.validation.warning='EMSVitalSignsOrganizerEMSSystolicBloodPressureComponent EMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent EMSVitalSignsOrganizerEMSHeartRateComponent EMSVitalSignsOrganizerEMSRespiratoryRateComponent EMSVitalSignsOrganizerEMSBodyTemperatureComponent EMSVitalSignsOrganizerEMSOxygenSaturationComponent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.17.3.10.1.23.1' code.displayName='Intravascular systolic' constraints.validation.error='EMSSystolicBloodPressureTemplateId VitalSignObservationCode EMSSystolicBloodPressureValue' code.codeSystemName='LOINC' code.code='8480-6'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Intravascular diastolic' constraints.validation.error='EMSDiastolicBloodPressureCode EMSDiastolicBloodPressureValue' code.codeSystemName='LOINC' code.code='8462-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRate code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Heart rate' constraints.validation.dependOn.EMSHeartRateCode='EMSHeartRateCodeP' constraints.validation.error='EMSHeartRateCode EMSHeartRateCodeP EMSHeartRateValue' code.codeSystemName='LOINC' code.code='8867-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRate code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Breaths' constraints.validation.error='EMSRespiratoryRateCode EMSRespiratoryRateValue' code.codeSystemName='LOINC' code.code='9279-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperature code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Body temperature' constraints.validation.error='EMSBodyTemperatureCode EMSBodyTemperatureValue' code.codeSystemName='LOINC' code.code='8310-5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Oxygen saturation' constraints.validation.error='EMSOxygenSaturationCode EMSOxygenSaturationValue' code.codeSystemName='LOINC' code.code='2710-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponent constraints.validation.error='EMSSystolicBloodPressureComponentEMSSystolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent constraints.validation.error='EMSDiastolicBloodPressureComponentEMSDiastolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponent constraints.validation.error='EMSHeartRateComponentEMSHeartRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponent constraints.validation.error='EMSRespiratoryRateComponentEMSRespiratoryRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponent constraints.validation.error='EMSBodyTemperatureComponentEMSBodyTemperature'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponent constraints.validation.error='EMSOxygenSaturationComponentEMSOxygenSaturation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitals code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Obtained prior to units EMS care' constraints.validation.error='EMSPriorAidVitalsCode EMSPriorAidVitalsValue' code.codeSystemName='LOINC' code.code='67518-1' constraints.validation.info='EMSPriorAidVitalsEffectiveTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCardiacRhythm value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Cardiac rhythm' constraints.validation.error='EMSCardiacRhythmCode EMSCardiacRhythmCodeP EMSCardiacRhythmMethodCode EMSCardiacRhythmMethodCodeP EMSCardiacRhythmValue EMSCardiacRhythmValueP' constraints.validation.dependOn.EMSCardiacRhythmCode='EMSCardiacRhythmCodeP' methodCode.codeSystemName='LOINC' code.codeSystemName='LOINC' code.code='67519-9' methodCode.codeSystem='2.16.840.1.113883.6.1' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonDioxide code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Carbon dioxide/Gas.total.at end expiration' constraints.validation.error='EMSCarbonDioxideCode EMSCarbonDioxideCodeP EMSCarbonDioxideValue' code.codeSystemName='LOINC' code.code='19889-5' constraints.validation.dependOn.EMSCarbonDioxideCode='EMSCarbonDioxideCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSCarbonMonoxide code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Diffusion capacity.carbon monoxide' constraints.validation.error='EMSCarbonMonoxideCode EMSCarbonMonoxideCodeP EMSCarbonMonoxideValue' code.codeSystemName='LOINC' code.code='19911-7' constraints.validation.dependOn.EMSCarbonMonoxideCode='EMSCarbonMonoxideCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSBloodGlucose code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Glucose' constraints.validation.error='EMSBloodGlucoseCode EMSBloodGlucoseCodeP EMSBloodGlucoseValue' code.codeSystemName='LOINC' code.code='2339-0' constraints.validation.dependOn.EMSBloodGlucoseCode='EMSBloodGlucoseCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSLevelOfResponsiveness value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Level of responsiveness' constraints.validation.dependOn.EMSLevelOfResponsivenessCode='EMSLevelOfResponsivenessCodeP' constraints.validation.error='EMSLevelOfResponsivenessCode EMSLevelOfResponsivenessCodeP EMSLevelOfResponsivenessValue EMSLevelOfResponsivenessValueP' code.codeSystemName='LOINC' code.code='67775-7' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPainScore code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Pain severity verbal numeric scale' constraints.validation.error='EMSPainScoreCode' code.codeSystemName='LOINC' code.code='56840-2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSStrokeScore constraints.validation.dependOn.EMSStrokeScoreCode='EMSStrokeScoreCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Stroke scale overall interpretation' constraints.validation.error='EMSStrokeScoreCode EMSStrokeScoreCodeP EMSStrokeScoreValue EMSStrokeScoreValueP EMSStrokeScoreMethodCode EMSStrokeScoreMethodCodeP' methodCode.codeSystemName='LOINC' code.codeSystemName='LOINC' code.code='67520-7' value.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScore constraints.validation.error='EMSGlasgowComaScoreEMSGlasgowEye EMSGlasgowComaScoreEMSGlasgowMotor EMSGlasgowComaScoreEMSGlasgowVerbal' constraints.validation.warning='EMSGlasgowComaScoreEMSGlasgowTotal' constraints.validation.info='EMSGlasgowComaScoreEMSGlasgowQualifier'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowTotal code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Glasgow coma score.total' constraints.validation.error='EMSGlasgowTotalCode EMSGlasgowTotalCodeP EMSGlasgowTotalValue' code.codeSystemName='LOINC' code.code='9269-2' constraints.validation.dependOn.EMSGlasgowTotalCode='EMSGlasgowTotalCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowQualifier code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Glasgow coma score special circumstances' constraints.validation.error='EMSGlasgowQualifierCode EMSGlasgowQualifierCodeP' code.codeSystemName='LOINC' code.code='55285-1' constraints.validation.info='EMSGlasgowQualifierValue' constraints.validation.dependOn.EMSGlasgowQualifierCode='EMSGlasgowQualifierCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowEye constraints.validation.dependOn.EMSGlasgowEyeCode='EMSGlasgowEyeCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Glasgow coma score.eye opening' constraints.validation.error='EMSGlasgowEyeCode EMSGlasgowEyeCodeP EMSGlasgowEyeValue EMSGlasgowEyeValueP' code.codeSystemName='LOINC' code.code='9267-6' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowMotor value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='null' code.displayName='Glasgow coma score.motor' constraints.validation.error='EMSGlasgowMotorTemplateId EMSGlasgowMotorCode EMSGlasgowMotorCodeP EMSGlasgowMotorValue EMSGlasgowMotorValueP' code.codeSystemName='LOINC' code.code='9268-4' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSGlasgowMotorCode='EMSGlasgowMotorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSGlasgowComaScoreEMSGlasgowVerbal constraints.validation.dependOn.EMSGlasgowVerbalCode='EMSGlasgowVerbalCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Glasgow coma score.verbal' constraints.validation.error='EMSGlasgowVerbalCode EMSGlasgowVerbalCodeP EMSGlasgowVerbalValue EMSGlasgowVerbalValueP' code.codeSystemName='LOINC' code.code='9270-0' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSVitalSignsSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.23')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.23\')'"
   * @generated
   */
	boolean validateEMSVitalSignsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67801-1' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67801-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Vital Signs')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Vital Signs\')'"
   * @generated
   */
	boolean validateEMSVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry))'"
   * @generated
   */
	boolean validateEMSVitalSignsSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry)).oclAsType(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry)).oclAsType(emspcr::EMSVitalSignsSection::EMSVitalSignsEntry)'"
   * @generated
   */
  void getEntry1s();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSVitalSignsSection init();
} // EMSVitalSignsSection
