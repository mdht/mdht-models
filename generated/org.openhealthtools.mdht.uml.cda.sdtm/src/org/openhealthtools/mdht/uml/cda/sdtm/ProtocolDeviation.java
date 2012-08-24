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
 * A representation of the model object '<em><b>Protocol Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getProtocolDeviation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Protocol DeviationTemplateId Protocol DeviationClassCode Protocol DeviationCode Protocol DeviationId Protocol DeviationMoodCode Protocol DeviationValue Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue Protocol DeviationprotocolDeviationCategoryAssociationTypeCode Protocol DeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue Protocol DeviationprotocolDeviationSubCategoryAssociationTypeCode Protocol DeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory' templateId.root='2.16.840.1.113883.10.20.23.27' constraints.validation.info='Protocol DeviationEffectiveTime Protocol DeviationProtocolDeviationCategoryAssociation Protocol DeviationStudy Epoch' constraints.validation.warning='Protocol DeviationProtocolDeviationSubCategoryAssociation' constraints.validation.query='Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode Protocol DeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue Protocol DeviationprotocolDeviationCategoryAssociationTypeCode Protocol DeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode Protocol DeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue Protocol DeviationprotocolDeviationSubCategoryAssociationTypeCode Protocol DeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmProtocolDeviationprotocolDeviationCategoryAssociation typeCode='COMP' constraints.validation.error='protocolDeviationCategoryAssociationTypeCode protocolDeviationCategoryAssociationProtocolDeviationCategory protocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode protocolDeviationCategoryAssociationprotocolDeviationCategoryCode protocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode protocolDeviationCategoryAssociationprotocolDeviationCategoryValue' constraints.validation.query='protocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode protocolDeviationCategoryAssociationprotocolDeviationCategoryCode protocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode protocolDeviationCategoryAssociationprotocolDeviationCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategory constraints.validation.error='protocolDeviationCategoryClassCode protocolDeviationCategoryCode protocolDeviationCategoryMoodCode protocolDeviationCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmProtocolDeviationprotocolDeviationSubCategoryAssociation typeCode='COMP' constraints.validation.error='protocolDeviationSubCategoryAssociationTypeCode protocolDeviationSubCategoryAssociationProtocolDeviationSubCategory protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue' constraints.validation.query='protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode protocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategory classCode='OBS' constraints.validation.error='protocolDeviationSubCategoryClassCode protocolDeviationSubCategoryCode protocolDeviationSubCategoryMoodCode protocolDeviationSubCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface ProtocolDeviation extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.27\')'"
   * @generated
   */
  boolean validateProtocolDeviationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
   * @generated
   */
  boolean validateProtocolDeviationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateProtocolDeviationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateProtocolDeviationId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
   * @generated
   */
  boolean validateProtocolDeviationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))'"
   * @generated
   */
  boolean validateProtocolDeviationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationProtocolDeviationCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationProtocolDeviationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch))'"
   * @generated
   */
  boolean validateProtocolDeviationStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->any(true).oclAsType(sdtm::Study Epoch)'"
   * @generated
   */
  StudyEpoch getStudyEpoch();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolDeviation init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolDeviation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProtocolDeviation
