/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nonhuman Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getNonhumanSubjectDemographics()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Non-human Subject DemographicsTemplateId Non-human Subject DemographicsClassCode Non-human Subject DemographicsCode Non-human Subject DemographicsCodeP Non-human Subject DemographicsMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationTypeCode Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationTypeCode Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue Non-human Subject DemographicssetMembershipAssociationTypeCode' templateId.root='2.16.840.1.113883.10.20.23.16' classCode='CLUSTER' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' moodCode='EVN' constraints.validation.query='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationTypeCode Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationsubjectStrainText Non-human Subject DemographicsstrainAssociationTypeCode Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue Non-human Subject DemographicssetMembershipAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsageAssociation typeCode='COMP' constraints.validation.error='ageAssociationTypeCode ageAssociationSubjectAgeClassCode ageAssociationSubjectAgeCodeP ageAssociationSubjectAgeCode ageAssociationSubjectAgeMoodCode ageAssociationSubjectAgeValue' constraints.validation.query='ageAssociationSubjectAgeClassCode ageAssociationSubjectAgeCodeP ageAssociationSubjectAgeCode ageAssociationSubjectAgeMoodCode ageAssociationSubjectAgeValue' constraints.validation.dependOn.ageAssociationSubjectAgeCode='ageAssociationSubjectAgeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsageAssociationSubjectAge classCode='OBS' constraints.validation.error='SubjectAgeClassCode SubjectAgeCode SubjectAgeCodeP SubjectAgeMoodCode SubjectAgeValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age' constraints.validation.dependOn.SubjectAgeCode='SubjectAgeCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsspeciesAssociation typeCode='COMP' constraints.validation.error='speciesAssociationTypeCode speciesAssociationsubjectSpeciesClassCode speciesAssociationsubjectSpeciesCodeP speciesAssociationsubjectSpeciesCode speciesAssociationsubjectSpeciesMoodCode speciesAssociationsubjectSpeciesValue' constraints.validation.query='speciesAssociationsubjectSpeciesClassCode speciesAssociationsubjectSpeciesCodeP speciesAssociationsubjectSpeciesCode speciesAssociationsubjectSpeciesMoodCode speciesAssociationsubjectSpeciesValue' constraints.validation.dependOn.speciesAssociationsubjectSpeciesCode='speciesAssociationsubjectSpeciesCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsspeciesAssociationsubjectSpecies classCode='OBS' constraints.validation.error='subjectSpeciesClassCode subjectSpeciesCode subjectSpeciesCodeP subjectSpeciesMoodCode subjectSpeciesValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age' constraints.validation.dependOn.subjectSpeciesCode='subjectSpeciesCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsstrainAssociation typeCode='COMP' constraints.validation.error='strainAssociationTypeCode strainAssociationsubjectStrainClassCode strainAssociationsubjectStrainCodeP strainAssociationsubjectStrainCode strainAssociationsubjectStrainMoodCode strainAssociationsubjectStrainValue' constraints.validation.query='strainAssociationsubjectStrainClassCode strainAssociationsubjectStrainCodeP strainAssociationsubjectStrainCode strainAssociationsubjectStrainMoodCode strainAssociationsubjectStrainValue strainAssociationsubjectStrainText' constraints.validation.dependOn.strainAssociationsubjectStrainCode='strainAssociationsubjectStrainCodeP' constraints.validation.info='strainAssociationsubjectStrainText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsstrainAssociationsubjectStrain classCode='OBS' constraints.validation.error='subjectStrainClassCode subjectStrainCode subjectStrainCodeP subjectStrainMoodCode subjectStrainValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age' constraints.validation.dependOn.subjectStrainCode='subjectStrainCodeP' moodCode='EVN' constraints.validation.info='subjectStrainText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicssetMembershipAssociation typeCode='COMP' constraints.validation.error='setMembershipAssociationTypeCode setMembershipAssociationsetMembershipClassCode setMembershipAssociationsetMembershipCodeP setMembershipAssociationsetMembershipCode setMembershipAssociationsetMembershipMoodCode setMembershipAssociationsetMembershipValue' constraints.validation.query='setMembershipAssociationsetMembershipClassCode setMembershipAssociationsetMembershipCodeP setMembershipAssociationsetMembershipCode setMembershipAssociationsetMembershipMoodCode setMembershipAssociationsetMembershipValue' constraints.validation.dependOn.setMembershipAssociationsetMembershipCode='setMembershipAssociationsetMembershipCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicssetMembershipAssociationsetMembership classCode='OBS' constraints.validation.error='setMembershipClassCode setMembershipCode setMembershipCodeP setMembershipMoodCode setMembershipValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age' constraints.validation.dependOn.setMembershipCode='setMembershipCodeP' moodCode='EVN'"
 * @generated
 */
public interface NonhumanSubjectDemographics extends Organizer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.16\')'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNonhumanSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::ActMood::EVN'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
  boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDemographics init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanSubjectDemographics init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NonhumanSubjectDemographics
