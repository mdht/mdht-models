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
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntry constraints.validation.error='DerivedEntryEMSVitalSignsOrganizer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizer constraints.validation.error='EMSVitalSignsOrganizerEffectiveTime EMSVitalSignsOrganizerEMSPriorAidVitals EMSVitalSignsOrganizerEMSCardiacRhythm EMSVitalSignsOrganizerEMSSystolicBloodPressure EMSVitalSignsOrganizerEMSRespiratoryRate EMSVitalSignsOrganizerEMSOxygenSaturation EMSVitalSignsOrganizerEMSCarbonDioxide EMSVitalSignsOrganizerEMSBloodGlucose EMSVitalSignsOrganizerEMSLevelOfResponsiveness EMSVitalSignsOrganizerEMSPainScore EMSVitalSignsOrganizerEMSStrokeScore EMSVitalSignsOrganizerEMSGlasgowComaScore' constraints.validation.info='EMSVitalSignsOrganizerEMSDiastolicBloodPressure EMSVitalSignsOrganizerEMSBodyTemperature EMSVitalSignsOrganizerEMSCarbonMonoxide' constraints.validation.warning='EMSVitalSignsOrganizerEMSHeartRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPriorAidVitals code.code='67518-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Obtained prior to units EMS care' constraints.validation.error='EMSPriorAidVitalsCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCardiacRhythm code.code='67519-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cardiac rhythm' constraints.validation.error='EMSCardiacRhythmCode EMSCardiacRhythmCodeP EMSCardiacRhythmMethodCode EMSCardiacRhythmMethodCodeP EMSCardiacRhythmValue EMSCardiacRhythmValueP' constraints.validation.dependOn.EMSCardiacRhythmCode='EMSCardiacRhythmCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSSystolicBloodPressure code.code='8480-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Intravascular systolic' constraints.validation.error='EMSSystolicBloodPressureCode EMSSystolicBloodPressureValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSDiastolicBloodPressure code.code='8462-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Intravascular diastolic' constraints.validation.error='EMSDiastolicBloodPressureCode EMSDiastolicBloodPressureValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSHeartRate code.code='8867-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Heart rate' constraints.validation.error='EMSHeartRateCode EMSHeartRateCodeP EMSHeartRateValue' constraints.validation.dependOn.EMSHeartRateCode='EMSHeartRateCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSRespiratoryRate code.code='9279-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Breaths' constraints.validation.error='EMSRespiratoryRateCode EMSRespiratoryRateValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBodyTemperature code.code='8310-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Body temperature' constraints.validation.error='EMSBodyTemperatureCode EMSBodyTemperatureValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSOxygenSaturation code.code='2710-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Oxygen saturation' constraints.validation.error='EMSOxygenSaturationCode EMSOxygenSaturationValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonDioxide code.code='19889-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Carbon dioxide/Gas.total.at end expiration' constraints.validation.error='EMSCarbonDioxideCode EMSCarbonDioxideCodeP EMSCarbonDioxideValue' constraints.validation.dependOn.EMSCarbonDioxideCode='EMSCarbonDioxideCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSCarbonMonoxide code.code='19911-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Diffusion capacity.carbon monoxide' constraints.validation.error='EMSCarbonMonoxideCode EMSCarbonMonoxideCodeP EMSCarbonMonoxideValue' constraints.validation.dependOn.EMSCarbonMonoxideCode='EMSCarbonMonoxideCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSBloodGlucose code.code='2339-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glucose' constraints.validation.error='EMSBloodGlucoseCode EMSBloodGlucoseCodeP EMSBloodGlucoseValue' constraints.validation.dependOn.EMSBloodGlucoseCode='EMSBloodGlucoseCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSLevelOfResponsiveness code.code='67775-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Level of responsiveness' constraints.validation.error='EMSLevelOfResponsivenessCode EMSLevelOfResponsivenessCodeP EMSLevelOfResponsivenessValue EMSLevelOfResponsivenessValueP' constraints.validation.dependOn.EMSLevelOfResponsivenessCode='EMSLevelOfResponsivenessCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSPainScore code.code='56840-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Pain severity verbal numeric scale' constraints.validation.error='EMSPainScoreCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSStrokeScore code.code='67520-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Stroke scale overall interpretation' constraints.validation.error='EMSStrokeScoreCode EMSStrokeScoreCodeP EMSStrokeScoreValue EMSStrokeScoreValueP EMSStrokeScoreMethodCode EMSStrokeScoreMethodCodeP' constraints.validation.dependOn.EMSStrokeScoreCode='EMSStrokeScoreCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScore constraints.validation.error='EMSGlasgowComaScoreEMSGlasgowEye EMSGlasgowComaScoreEMSGlasgowMotor EMSGlasgowComaScoreEMSGlasgowVerbal' constraints.validation.info='EMSGlasgowComaScoreEMSGlasgowQualifier' constraints.validation.warning='EMSGlasgowComaScoreEMSGlasgowTotal'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowTotal code.code='9269-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.total' constraints.validation.error='EMSGlasgowTotalCode EMSGlasgowTotalCodeP EMSGlasgowTotalValue' constraints.validation.dependOn.EMSGlasgowTotalCode='EMSGlasgowTotalCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowQualifier code.code='55285-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score special circumstances' constraints.validation.error='EMSGlasgowQualifierCode EMSGlasgowQualifierCodeP' constraints.validation.dependOn.EMSGlasgowQualifierCode='EMSGlasgowQualifierCodeP' constraints.validation.info='EMSGlasgowQualifierValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowEye code.code='9267-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.eye opening' constraints.validation.error='EMSGlasgowEyeCode EMSGlasgowEyeCodeP EMSGlasgowEyeValue EMSGlasgowEyeValueP' constraints.validation.dependOn.EMSGlasgowEyeCode='EMSGlasgowEyeCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowMotor constraints.validation.error='EMSGlasgowMotorTemplateId EMSGlasgowMotorCode EMSGlasgowMotorCodeP EMSGlasgowMotorValue EMSGlasgowMotorValueP' templateId.root='null' code.code='9268-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.motor' constraints.validation.dependOn.EMSGlasgowMotorCode='EMSGlasgowMotorCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSVitalSignsSectionDerivedEntryEMSVitalSignsOrganizerEMSGlasgowComaScoreEMSGlasgowVerbal code.code='9270-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Glasgow coma score.verbal' constraints.validation.error='EMSGlasgowVerbalCode EMSGlasgowVerbalCodeP EMSGlasgowVerbalValue EMSGlasgowVerbalValueP' constraints.validation.dependOn.EMSGlasgowVerbalCode='EMSGlasgowVerbalCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
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