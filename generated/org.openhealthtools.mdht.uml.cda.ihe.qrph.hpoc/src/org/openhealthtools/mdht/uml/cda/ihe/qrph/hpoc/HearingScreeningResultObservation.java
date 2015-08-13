/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Screening Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingScreeningResultObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservationTemplateId ResultObservationCode ResultObservationCodeP ResultObservationText ResultObservationEffectiveTime ResultObservationValue ResultObservationValueP ResultObservationMethodCode ResultObservationMethodCodeP ResultObservationTargetSiteCode ResultObservationTargetSiteCodeP HearingScreeningResultObservationEntryRelationshipReasonNotScreened' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.13' code.code='417491009' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Neonatal Hearing Test (Procedure)' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' constraints.validation.dependOn.ResultObservationMethodCode='ResultObservationMethodCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ResultObservationTargetSiteCode='ResultObservationTargetSiteCodeP' constraints.validation.info='HearingScreeningResultObservationAuthor' constraints.validation.warning='HearingScreeningResultObservationPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipReasonNotScreened typeCode='RSON' constraints.validation.error='HearingScreeningResultObservationEntryRelationshipReasonNotScreenedTypeCode HearingScreeningResultObservationEntryRelationshipReasonNotScreenedAct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingScreeningResultObservationEntryRelationshipRefer typeCode='REFR' constraints.validation.error='HearingScreeningResultObservationEntryRelationshipReferTypeCode HearingScreeningResultObservationEntryRelationshipReferAct'"
 * @generated
 */
public interface HearingScreeningResultObservation extends ResultObservation
{
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
  boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validateResultObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())'"
   * @generated
   */
  boolean validateResultObservationMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())'"
   * @generated
   */
  boolean validateResultObservationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);
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
  boolean validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))'"
   * @generated
   */
  boolean validateHearingScreeningResultObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))'"
   * @generated
   */
  boolean validateHearingScreeningResultObservationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingScreeningResultObservation init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingScreeningResultObservation
