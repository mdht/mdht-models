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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSVitalSignsSectionTemplateId EMSVitalSignsSectionCode EMSVitalSignsSectionTitle EMSVitalSignsSectionText EMSVitalSignsSectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.23' code.code='67801-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Vital Signs Section' title.mixed='EMS Vital Signs'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntry constraints.validation.error='EMSVitalSignsEntryEMSVitalSignsOrganizer' constraints.validation.info='EMSVitalSignsEntryEMSPriorAidVitals'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizer constraints.validation.error='EMSVitalSignsOrganizerEffectiveTime' constraints.validation.warning='EMSVitalSignsOrganizerEMSSystolicBloodPressureComponent EMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent EMSVitalSignsOrganizerEMSHeartRateComponent EMSVitalSignsOrganizerEMSRespiratoryRateComponent EMSVitalSignsOrganizerEMSBodyTemperatureComponent EMSVitalSignsOrganizerEMSOxygenSaturationComponent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure constraints.validation.error='EMSSystolicBloodPressureTemplateId EMSSystolicBloodPressureCode EMSSystolicBloodPressureValue EMSSystolicBloodPressureMoodCode' templateId.root='2.16.840.1.113883.17.3.10.1.23.1' code.code='8480-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Intravascular systolic' constraints.validation.info='EMSSystolicBloodPressureEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure code.code='8462-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Intravascular diastolic' constraints.validation.error='EMSDiastolicBloodPressureCode EMSDiastolicBloodPressureValue EMSDiastolicBloodPressureMoodCode' constraints.validation.info='EMSDiastolicBloodPressureEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRate code.code='8867-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Heart rate' constraints.validation.error='EMSHeartRateCode EMSHeartRateCodeP EMSHeartRateValue EMSHeartRateMoodCode' constraints.validation.dependOn.EMSHeartRateCode='EMSHeartRateCodeP' constraints.validation.info='EMSHeartRateEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRate code.code='9279-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Breaths' constraints.validation.error='EMSRespiratoryRateCode EMSRespiratoryRateValue EMSRespiratoryRateMoodCode' constraints.validation.info='EMSRespiratoryRateEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperature constraints.validation.error='EMSBodyTemperatureTemplateId EMSBodyTemperatureCode EMSBodyTemperatureValue EMSBodyTemperatureMoodCode' templateId.root='null' code.code='8310-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Body temperature' constraints.validation.info='EMSBodyTemperatureEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSSystolicBloodPressureComponent constraints.validation.error='EMSSystolicBloodPressureComponentEMSSystolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressureComponent constraints.validation.error='EMSDiastolicBloodPressureComponentEMSDiastolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSHeartRateComponent constraints.validation.error='EMSHeartRateComponentEMSHeartRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSRespiratoryRateComponent constraints.validation.error='EMSRespiratoryRateComponentEMSRespiratoryRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSBodyTemperatureComponent constraints.validation.error='EMSBodyTemperatureComponentEMSBodyTemperature'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturationComponent constraints.validation.error='EMSOxygenSaturationComponentEMSOxygenSaturation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSVitalSignsOrganizerEMSOxygenSaturation constraints.validation.error='EMSOxygenSaturationTemplateId EMSOxygenSaturationCode EMSOxygenSaturationValue EMSOxygenSaturationMoodCode' templateId.root='null' code.code='2710-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Oxygen saturation' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSPriorAidVitals code.code='67518-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Obtained prior to units EMS care' constraints.validation.error='EMSPriorAidVitalsCode EMSPriorAidVitalsValue EMSPriorAidVitalsMoodCode' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizer constraints.validation.info='EMSAdditionalVitalSignsOrganizerEffectiveTime EMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreComponent EMSAdditionalVitalSignsOrganizerEMSStrokeScoreComponent EMSAdditionalVitalSignsOrganizerEMSPainScoreComponent EMSAdditionalVitalSignsOrganizerEMSLevelOfResponsivenessComponent EMSAdditionalVitalSignsOrganizerEMSBloodGlucoseComponent EMSAdditionalVitalSignsOrganizerEMSCarbonMonoxideComponent EMSAdditionalVitalSignsOrganizerEMSCarbonDioxideComponent EMSAdditionalVitalSignsOrganizerEMSCardiacRhythmComponent' moodCode='EVN' constraints.validation.error='EMSAdditionalVitalSignsOrganizerMoodCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScore constraints.validation.info='EMSGlasgowComaScoreEffectiveTime EMSGlasgowComaScoreEMSGlasgowQualifier' constraints.validation.error='EMSGlasgowComaScoreEMSGlasgowEye EMSGlasgowComaScoreEMSGlasgowMotor EMSGlasgowComaScoreEMSGlasgowVerbal' constraints.validation.warning='EMSGlasgowComaScoreEMSGlasgowTotal'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotal code.code='9269-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.total' constraints.validation.error='EMSGlasgowTotalCode EMSGlasgowTotalCodeP EMSGlasgowTotalValue EMSGlasgowTotalMoodCode' constraints.validation.dependOn.EMSGlasgowTotalCode='EMSGlasgowTotalCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifier code.code='55285-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score special circumstances' constraints.validation.error='EMSGlasgowQualifierCode EMSGlasgowQualifierCodeP EMSGlasgowQualifierMoodCode' constraints.validation.dependOn.EMSGlasgowQualifierCode='EMSGlasgowQualifierCodeP' constraints.validation.info='EMSGlasgowQualifierValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEye code.code='9267-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.eye opening' constraints.validation.error='EMSGlasgowEyeCode EMSGlasgowEyeCodeP EMSGlasgowEyeValue EMSGlasgowEyeMoodCode' constraints.validation.dependOn.EMSGlasgowEyeCode='EMSGlasgowEyeCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotor constraints.validation.error='EMSGlasgowMotorTemplateId EMSGlasgowMotorCode EMSGlasgowMotorCodeP EMSGlasgowMotorValue EMSGlasgowMotorMoodCode' templateId.root='null' code.code='9268-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.motor' constraints.validation.dependOn.EMSGlasgowMotorCode='EMSGlasgowMotorCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbal code.code='9270-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.verbal' constraints.validation.error='EMSGlasgowVerbalCode EMSGlasgowVerbalCodeP EMSGlasgowVerbalValue EMSGlasgowVerbalMoodCode' constraints.validation.dependOn.EMSGlasgowVerbalCode='EMSGlasgowVerbalCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSStrokeScore code.code='67520-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Stroke scale overall interpretation' constraints.validation.error='EMSStrokeScoreCode EMSStrokeScoreCodeP EMSStrokeScoreValue EMSStrokeScoreValueP EMSStrokeScoreMethodCode EMSStrokeScoreMethodCodeP EMSStrokeScoreMoodCode' constraints.validation.dependOn.EMSStrokeScoreCode='EMSStrokeScoreCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' constraints.validation.info='EMSStrokeScoreEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSPainScore code.code='56840-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Pain severity verbal numeric scale' constraints.validation.error='EMSPainScoreCode EMSPainScoreMoodCode' constraints.validation.info='EMSPainScoreEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSLevelOfResponsiveness code.code='67775-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Level of responsiveness' constraints.validation.error='EMSLevelOfResponsivenessCode EMSLevelOfResponsivenessCodeP EMSLevelOfResponsivenessValue EMSLevelOfResponsivenessValueP EMSLevelOfResponsivenessMoodCode' constraints.validation.dependOn.EMSLevelOfResponsivenessCode='EMSLevelOfResponsivenessCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' constraints.validation.info='EMSLevelOfResponsivenessEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSBloodGlucose code.code='2339-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glucose' constraints.validation.error='EMSBloodGlucoseCode EMSBloodGlucoseCodeP EMSBloodGlucoseValue EMSBloodGlucoseMoodCode' constraints.validation.dependOn.EMSBloodGlucoseCode='EMSBloodGlucoseCodeP' constraints.validation.info='EMSBloodGlucoseEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSCarbonMonoxide code.code='19911-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Diffusion capacity.carbon monoxide' constraints.validation.error='EMSCarbonMonoxideCode EMSCarbonMonoxideCodeP EMSCarbonMonoxideValue EMSCarbonMonoxideMoodCode' constraints.validation.dependOn.EMSCarbonMonoxideCode='EMSCarbonMonoxideCodeP' constraints.validation.info='EMSCarbonMonoxideEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSCarbonDioxide code.code='19889-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Carbon dioxide/Gas.total.at end expiration' constraints.validation.error='EMSCarbonDioxideCode EMSCarbonDioxideCodeP EMSCarbonDioxideValue EMSCarbonDioxideMoodCode' constraints.validation.dependOn.EMSCarbonDioxideCode='EMSCarbonDioxideCodeP' constraints.validation.info='EMSCarbonDioxideEffectiveTime' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionEMSVitalSignsEntryEMSAdditionalVitalSignsOrganizerEMSCardiacRhythm code.code='67519-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac rhythm' constraints.validation.error='EMSCardiacRhythmCode EMSCardiacRhythmCodeP EMSCardiacRhythmMethodCode EMSCardiacRhythmMethodCodeP EMSCardiacRhythmValue EMSCardiacRhythmValueP EMSCardiacRhythmMoodCode' constraints.validation.dependOn.EMSCardiacRhythmCode='EMSCardiacRhythmCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' constraints.validation.info='EMSCardiacRhythmEffectiveTime' moodCode='EVN'"
 * @generated
 */
public interface EMSVitalSignsSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67801-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	* @generated
	*/
	boolean validateEMSVitalSignsSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSVitalSignsSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSVitalSignsSection
