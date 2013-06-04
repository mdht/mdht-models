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
 * A representation of the model object '<em><b>EMS Situation Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSSituationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSSituationSectionTemplateId EMSSituationSectionCode EMSSituationSectionCodeP EMSSituationSectionTitle EMSSituationSectionText EMSSituationSectionEntry1 EMSSituationSectionEntry3 EMSSituationSectionEntry4 EMSSituationSectionEntry6 EMSSituationSectionEntry7 EMSSituationSectionEntry8' templateId.root='2.16.840.1.113883.17.3.10.1.9' code.code='67666-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Situation Section' title.mixed='EMS Situation Section' constraints.validation.info='EMSSituationSectionEntry5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntry constraints.validation.info='EMSComplaintEntryEMSComplaint'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaint code.code='10154-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS complaint' constraints.validation.error='EMSComplaintCode EMSComplaintCodeP EMSComplaintTargetSiteCode EMSComplaintEffectiveTime EMSComplaintMoodCode' constraints.validation.dependOn.EMSComplaintCode='EMSComplaintCodeP' constraints.validation.info='EMSComplaintValue EMSComplaintEMSComplaintDurationRelationship EMSComplaintEMSComplaintTypeRelationship' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' constraints.validation.warning='EMSComplaintTargetSiteCodeP EMSComplaintEMSComplaintOrganSystemRelationship' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintType code.code='72114-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Complaint type' constraints.validation.error='EMSComplaintTypeCode EMSComplaintTypeCodeP EMSComplaintTypeValue EMSComplaintTypeValueP EMSComplaintTypeMoodCode' constraints.validation.dependOn.EMSComplaintTypeCode='EMSComplaintTypeCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration code.code='67491-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Complaint duration' constraints.validation.error='EMSComplaintDurationCode EMSComplaintDurationCodeP EMSComplaintDurationValue EMSComplaintDurationMoodCode' constraints.validation.dependOn.EMSComplaintDurationCode='EMSComplaintDurationCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationship constraints.validation.error='EMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem code.code='69468-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Organ system' constraints.validation.error='EMSComplaintOrganSystemCode EMSComplaintOrganSystemCodeP EMSComplaintOrganSystemValue EMSComplaintOrganSystemValueP EMSComplaintOrganSystemMoodCode' constraints.validation.dependOn.EMSComplaintOrganSystemCode='EMSComplaintOrganSystemCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntry constraints.validation.error='EMSPossibleInjuryEntryEMSPossibleInjury'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjury code.code='69467-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Possible injury' constraints.validation.error='EMSPossibleInjuryCode EMSPossibleInjuryCodeP EMSPossibleInjuryValue EMSPossibleInjuryMoodCode' constraints.validation.dependOn.EMSPossibleInjuryCode='EMSPossibleInjuryCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntry constraints.validation.error='EMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression code.code='67492-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Provider Primary Impression' constraints.validation.error='EMSProviderPrimaryImpressionCode EMSProviderPrimaryImpressionCodeP EMSProviderPrimaryImpressionValue EMSProviderPrimaryImpressionValueP EMSProviderPrimaryImpressionMoodCode' constraints.validation.dependOn.EMSProviderPrimaryImpressionCode='EMSProviderPrimaryImpressionCodeP' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntry constraints.validation.error='EMSPrimarySymptomEntryEMSPrimarySymptom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptom code.code='67774-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Primary Symptom' constraints.validation.error='EMSPrimarySymptomCode EMSPrimarySymptomCodeP EMSPrimarySymptomValue EMSPrimarySymptomValueP EMSPrimarySymptomMoodCode' constraints.validation.dependOn.EMSPrimarySymptomCode='EMSPrimarySymptomCodeP' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntry constraints.validation.error='EMSOtherSymptomEntryEMSOtherSymptoms'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptoms code.code='67776-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Other symptoms' constraints.validation.error='EMSOtherSymptomsCode EMSOtherSymptomsCodeP EMSOtherSymptomsValue EMSOtherSymptomsValueP EMSOtherSymptomsMoodCode' constraints.validation.dependOn.EMSOtherSymptomsCode='EMSOtherSymptomsCodeP' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntry constraints.validation.info='EMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions code.code='69542-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Provider Secondary Impressions' constraints.validation.error='EMSProviderSecondaryImpressionsCode EMSProviderSecondaryImpressionsCodeP EMSProviderSecondaryImpressionsValue EMSProviderSecondaryImpressionsValueP EMSProviderSecondaryImpressionsMoodCode' constraints.validation.dependOn.EMSProviderSecondaryImpressionsCode='EMSProviderSecondaryImpressionsCodeP' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntry constraints.validation.error='EMSPatientAcuityEntryEMSInitialPatientAcuity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuity code.code='67493-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Initial Patient Acuity' constraints.validation.error='EMSInitialPatientAcuityCode EMSInitialPatientAcuityCodeP EMSInitialPatientAcuityValue EMSInitialPatientAcuityValueP EMSInitialPatientAcuityMoodCode' constraints.validation.dependOn.EMSInitialPatientAcuityCode='EMSInitialPatientAcuityCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface EMSSituationSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.9\')'"
	* @generated
	*/
	boolean validateEMSSituationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67666-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSSituationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Situation Section\')'"
	* @generated
	*/
	boolean validateEMSSituationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSSituationSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSSituationSection
