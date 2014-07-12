/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Death Causal Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getDeathCausalInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Death Causal InformationTemplateId Death Causal InformationClassCode Death Causal InformationMoodCode Death Causal InformationCode Death Causal InformationStatusCode Death Causal InformationStatusCodeP Death Causal InformationComponentCause Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode Death Causal InformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval Death Causal InformationComponentCauseDeathCauseClassCode Death Causal InformationComponentCauseDeathCauseCodeP Death Causal InformationComponentCauseDeathCauseCode Death Causal InformationComponentCauseDeathCauseMoodCode Death Causal InformationComponentCauseDeathCauseValue Death Causal InformationComponentCauseSequenceNumber Death Causal InformationComponentCauseTypeCode Death Causal InformationComponentCauseDeathCause Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionClassCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCodeP Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantConditionValue Death Causal InformationComponentOtherSignificantConditionTypeCode Death Causal InformationComponentOtherSignificantConditionOtherSignificantCondition' templateId.root='2.16.840.1.113883.10.20.26.1.6' classCode='CLUSTER' moodCode='EVN' code.code='69453-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cause Of Death' statusCode.code='Active'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantCondition typeCode='COMP' constraints.validation.error='ComponentOtherSignificantConditionTypeCode ComponentOtherSignificantConditionOtherSignificantCondition ComponentOtherSignificantConditionOtherSignificantConditionClassCode ComponentOtherSignificantConditionOtherSignificantConditionMoodCode ComponentOtherSignificantConditionOtherSignificantConditionCodeP ComponentOtherSignificantConditionOtherSignificantConditionCode ComponentOtherSignificantConditionOtherSignificantConditionValue' constraints.validation.query='ComponentOtherSignificantConditionOtherSignificantConditionClassCode ComponentOtherSignificantConditionOtherSignificantConditionMoodCode ComponentOtherSignificantConditionOtherSignificantConditionCodeP ComponentOtherSignificantConditionOtherSignificantConditionCode ComponentOtherSignificantConditionOtherSignificantConditionValue' constraints.validation.dependOn.ComponentOtherSignificantConditionOtherSignificantConditionCode='ComponentOtherSignificantConditionOtherSignificantConditionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition classCode='OBS' constraints.validation.error='OtherSignificantConditionClassCode OtherSignificantConditionMoodCode OtherSignificantConditionCode OtherSignificantConditionCodeP OtherSignificantConditionValue' moodCode='EVN' code.code='69441-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Other Significant Condition' constraints.validation.dependOn.OtherSignificantConditionCode='OtherSignificantConditionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCause constraints.validation.error='ComponentCauseSequenceNumber ComponentCauseTypeCode ComponentCauseDeathCause ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue ComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber ComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval ComponentCauseDeathCauseClassCode ComponentCauseDeathCauseCodeP ComponentCauseDeathCauseCode ComponentCauseDeathCauseMoodCode ComponentCauseDeathCauseValue' typeCode='COMP' constraints.validation.query='ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue ComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber ComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval ComponentCauseDeathCauseClassCode ComponentCauseDeathCauseCodeP ComponentCauseDeathCauseCode ComponentCauseDeathCauseMoodCode ComponentCauseDeathCauseValue' constraints.validation.dependOn.ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode='ComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP' constraints.validation.dependOn.ComponentCauseDeathCauseCode='ComponentCauseDeathCauseCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCause classCode='OBS' constraints.validation.error='DeathCauseClassCode DeathCauseCode DeathCauseCodeP DeathCauseMoodCode DeathCauseValue DeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue DeathCauseComponentDeathCauseIntervalSequenceNumber DeathCauseComponentDeathCauseIntervalTypeCode DeathCauseComponentDeathCauseIntervalDeathCauseInterval' code.code='21984-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Cause of Death' constraints.validation.dependOn.DeathCauseCode='DeathCauseCodeP' moodCode='EVN' constraints.validation.query='DeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode DeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue DeathCauseComponentDeathCauseIntervalSequenceNumber DeathCauseComponentDeathCauseIntervalTypeCode DeathCauseComponentDeathCauseIntervalDeathCauseInterval' constraints.validation.dependOn.DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode='DeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseInterval constraints.validation.error='ComponentDeathCauseIntervalSequenceNumber ComponentDeathCauseIntervalTypeCode ComponentDeathCauseIntervalDeathCauseInterval ComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentDeathCauseIntervalDeathCauseIntervalCode ComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentDeathCauseIntervalDeathCauseIntervalValue' typeCode='COMP' constraints.validation.query='ComponentDeathCauseIntervalDeathCauseIntervalClassCode ComponentDeathCauseIntervalDeathCauseIntervalCodeP ComponentDeathCauseIntervalDeathCauseIntervalCode ComponentDeathCauseIntervalDeathCauseIntervalMoodCode ComponentDeathCauseIntervalDeathCauseIntervalValue' constraints.validation.dependOn.ComponentDeathCauseIntervalDeathCauseIntervalCode='ComponentDeathCauseIntervalDeathCauseIntervalCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval classCode='OBS' constraints.validation.error='DeathCauseIntervalClassCode DeathCauseIntervalCode DeathCauseIntervalCodeP DeathCauseIntervalMoodCode DeathCauseIntervalValue' code.code='69440-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Disease onset to death interval' constraints.validation.dependOn.DeathCauseIntervalCode='DeathCauseIntervalCodeP' moodCode='EVN'"
 * @generated
 */
public interface DeathCausalInformation extends Organizer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.6\')'"
   * @generated
   */
  boolean validateDeathCausalInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathCausalInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69453-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
   * @generated
   */
  boolean validateDeathCausalInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateDeathCausalInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'Active\')'"
   * @generated
   */
  boolean validateDeathCausalInformationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='1..4->includes(self.component->select(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))->size())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCause(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69440-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(value->forAll(element | element.oclIsTypeOf(datatypes::ED)))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).->reject(not sequenceNumber.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'21984-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCauseValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(not sequenceNumber.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentCauseDeathCause(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \r\nvalue.code = \'69441-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCausalInformation init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathCausalInformation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeathCausalInformation
