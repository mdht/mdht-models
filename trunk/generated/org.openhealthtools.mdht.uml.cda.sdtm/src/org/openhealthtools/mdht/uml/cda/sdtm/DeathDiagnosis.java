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
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Death Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getDeathDiagnosis()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Death DiagnosisTemplateId Death DiagnosisClassCode Death DiagnosisCode Death DiagnosisId Death DiagnosisMoodCode Death DiagnosisValue Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue Death DiagnosisdeathDiagnosisResultCategoryAssociationTypeCode Death DiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory' templateId.root='2.16.840.1.113883.10.20.23.46' classCode='OBS' moodCode='EVN' constraints.validation.info='Death DiagnosisData Collection Death DiagnosisDeathDiagnosisResultCategoryAssociation' constraints.validation.query='Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode Death DiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue Death DiagnosisdeathDiagnosisResultCategoryAssociationTypeCode Death DiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmDeathDiagnosisdeathDiagnosisResultCategoryAssociation typeCode='COMP' constraints.validation.error='deathDiagnosisResultCategoryAssociationTypeCode deathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue' constraints.validation.query='deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue' constraints.validation.dependOn.deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode='deathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategory constraints.validation.error='deathDiagnosisResultCategoryClassCode deathDiagnosisResultCategoryCode deathDiagnosisResultCategoryCodeP deathDiagnosisResultCategoryMoodCode deathDiagnosisResultCategoryValue' code.code='C83218' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Concomitant Medication Category Code' constraints.validation.dependOn.deathDiagnosisResultCategoryCode='deathDiagnosisResultCategoryCodeP'"
 * @generated
 */
public interface DeathDiagnosis extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.46\')'"
   * @generated
   */
  boolean validateDeathDiagnosisTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
   * @generated
   */
  boolean validateDeathDiagnosisClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
   * @generated
   */
  boolean validateDeathDiagnosisId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
   * @generated
   */
  boolean validateDeathDiagnosisMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validateDeathDiagnosisValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateDeathDiagnosisDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83218\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'moodCode\'))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)'"
   * @generated
   */
  DataCollection getDataCollection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathDiagnosis init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathDiagnosis init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeathDiagnosis
