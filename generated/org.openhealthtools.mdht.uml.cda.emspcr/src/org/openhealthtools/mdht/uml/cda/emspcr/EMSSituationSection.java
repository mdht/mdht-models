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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Situation Section' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Situation Section' templateId.root='2.16.840.1.113883.17.3.10.1.9' constraints.validation.error='EMSSituationSectionTemplateId EMSSituationSectionCode EMSSituationSectionCodeP EMSSituationSectionTitle EMSSituationSectionText EMSSituationSectionEntry1 EMSSituationSectionEntry3 EMSSituationSectionEntry4 EMSSituationSectionEntry6 EMSSituationSectionEntry7 EMSSituationSectionEntry8' code.codeSystemName='LOINC' code.code='67666-8' constraints.validation.info='EMSSituationSectionEntry5'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntry constraints.validation.info='EMSComplaintEntryEMSComplaint'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaint code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS complaint' constraints.validation.error='EMSComplaintCode EMSComplaintCodeP EMSComplaintTargetSiteCode EMSComplaintEffectiveTime' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSComplaintCode='EMSComplaintCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' constraints.validation.warning='EMSComplaintTargetSiteCodeP EMSComplaintEMSComplaintOrganSystemRelationship' code.code='10154-3' constraints.validation.info='EMSComplaintValue EMSComplaintEMSComplaintDurationRelationship EMSComplaintEMSComplaintTypeRelationship' targetSiteCode.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintTypeRelationshipEMSComplaintType constraints.validation.dependOn.EMSComplaintTypeCode='EMSComplaintTypeCodeP' value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Complaint type' constraints.validation.error='EMSComplaintTypeCode EMSComplaintTypeCodeP EMSComplaintTypeValue EMSComplaintTypeValueP' code.codeSystemName='LOINC' code.code='72114-2' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintDurationRelationshipEMSComplaintDuration constraints.validation.dependOn.EMSComplaintDurationCode='EMSComplaintDurationCodeP' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Complaint duration' constraints.validation.error='EMSComplaintDurationCode EMSComplaintDurationCodeP EMSComplaintDurationValue' code.codeSystemName='LOINC' code.code='67491-1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationship constraints.validation.error='EMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSComplaintEntryEMSComplaintEMSComplaintOrganSystemRelationshipEMSComplaintOrganSystem value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Organ system' constraints.validation.error='EMSComplaintOrganSystemCode EMSComplaintOrganSystemCodeP EMSComplaintOrganSystemValue EMSComplaintOrganSystemValueP' constraints.validation.dependOn.EMSComplaintOrganSystemCode='EMSComplaintOrganSystemCodeP' code.codeSystemName='LOINC' code.code='69468-7' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntry constraints.validation.error='EMSPossibleInjuryEntryEMSPossibleInjury'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPossibleInjuryEntryEMSPossibleInjury code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Possible injury' constraints.validation.error='EMSPossibleInjuryCode EMSPossibleInjuryCodeP EMSPossibleInjuryValue' code.codeSystemName='LOINC' code.code='69467-9' constraints.validation.dependOn.EMSPossibleInjuryCode='EMSPossibleInjuryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntry constraints.validation.error='EMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderPrimaryImpressionEntryEMSProviderPrimaryImpression value.codeSystemName='ICD-10 CM' code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSProviderPrimaryImpressionCode='EMSProviderPrimaryImpressionCodeP' code.displayName='Provider Primary Impression' constraints.validation.error='EMSProviderPrimaryImpressionCode EMSProviderPrimaryImpressionCodeP EMSProviderPrimaryImpressionValue EMSProviderPrimaryImpressionValueP' code.codeSystemName='LOINC' code.code='67492-9' value.codeSystem='2.16.840.1.113883.6.90'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntry constraints.validation.error='EMSPrimarySymptomEntryEMSPrimarySymptom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPrimarySymptomEntryEMSPrimarySymptom value.codeSystemName='ICD-10 CM' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Primary Symptom' constraints.validation.dependOn.EMSPrimarySymptomCode='EMSPrimarySymptomCodeP' constraints.validation.error='EMSPrimarySymptomCode EMSPrimarySymptomCodeP EMSPrimarySymptomValue EMSPrimarySymptomValueP' code.codeSystemName='LOINC' code.code='67774-0' value.codeSystem='2.16.840.1.113883.6.90'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntry constraints.validation.error='EMSOtherSymptomEntryEMSOtherSymptoms'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSOtherSymptomEntryEMSOtherSymptoms value.codeSystemName='ICD-10 CM' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Other symptoms' constraints.validation.dependOn.EMSOtherSymptomsCode='EMSOtherSymptomsCodeP' constraints.validation.error='EMSOtherSymptomsCode EMSOtherSymptomsCodeP EMSOtherSymptomsValue EMSOtherSymptomsValueP' code.codeSystemName='LOINC' code.code='67776-5' value.codeSystem='2.16.840.1.113883.6.90'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntry constraints.validation.info='EMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSProviderSecondaryImpressionEntryEMSProviderSecondaryImpressions value.codeSystemName='ICD-10 CM' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Provider Secondary Impressions' constraints.validation.error='EMSProviderSecondaryImpressionsCode EMSProviderSecondaryImpressionsCodeP EMSProviderSecondaryImpressionsValue EMSProviderSecondaryImpressionsValueP' code.codeSystemName='LOINC' code.code='69542-9' value.codeSystem='2.16.840.1.113883.6.90' constraints.validation.dependOn.EMSProviderSecondaryImpressionsCode='EMSProviderSecondaryImpressionsCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntry constraints.validation.error='EMSPatientAcuityEntryEMSInitialPatientAcuity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSituationSectionEMSPatientAcuityEntryEMSInitialPatientAcuity value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Initial Patient Acuity' constraints.validation.error='EMSInitialPatientAcuityCode EMSInitialPatientAcuityCodeP EMSInitialPatientAcuityValue EMSInitialPatientAcuityValueP' constraints.validation.dependOn.EMSInitialPatientAcuityCode='EMSInitialPatientAcuityCodeP' code.codeSystemName='LOINC' code.code='67493-7' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSSituationSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.9')
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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67666-8' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67666-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSSituationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSituationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Situation Section')
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
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))'"
   * @generated
   */
	boolean validateEMSSituationSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSComplaintEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSComplaintEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSComplaintEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPossibleInjuryEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPossibleInjuryEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPossibleInjuryEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPrimarySymptomEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPrimarySymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPrimarySymptomEntry)'"
   * @generated
   */
  void getEntry4();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSOtherSymptomEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSOtherSymptomEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSOtherSymptomEntry)'"
   * @generated
   */
  void getEntry5();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderPrimaryImpressionEntry)'"
   * @generated
   */
  void getEntry6();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSProviderSecondaryImpressionEntry)'"
   * @generated
   */
  void getEntry7();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPatientAcuityEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSituationSection::EMSPatientAcuityEntry))->asSequence()->first().oclAsType(emspcr::EMSSituationSection::EMSPatientAcuityEntry)'"
   * @generated
   */
  void getEntry8();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSSituationSection init();
} // EMSSituationSection
