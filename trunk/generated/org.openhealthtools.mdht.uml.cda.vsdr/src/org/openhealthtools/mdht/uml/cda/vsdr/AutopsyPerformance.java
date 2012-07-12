/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autopsy Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getAutopsyPerformance()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Autopsy PerformanceTemplateId Autopsy PerformanceClassCode Autopsy PerformanceCode Autopsy PerformanceCodeP Autopsy PerformanceEffectiveTime Autopsy PerformanceValue Autopsy PerformanceMoodCode Autopsy PerformanceAutopsyPerformer Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName Autopsy PerformanceAutopsyPerformerAutopsyPerformerRoleClassCode Autopsy PerformanceAutopsyPerformerTypeCode Autopsy PerformanceAutopsyPerformerAutopsyPerformerRole' templateId.root='2.16.840.1.113883.10.20.26.1.2' classCode='OBS' code.code='21986-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Autopsy Status'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformer typeCode='PRF' constraints.validation.error='AutopsyPerformerTypeCode AutopsyPerformerAutopsyPerformerRole AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName AutopsyPerformerAutopsyPerformerRoleClassCode' constraints.validation.query='AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName AutopsyPerformerAutopsyPerformerRoleClassCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole classCode='ASSIGNED' constraints.validation.error='AutopsyPerformerRoleClassCode AutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerRoleAutopsyClinicianName' constraints.validation.query='AutopsyPerformerRoleAutopsyClinicianClassCode AutopsyPerformerRoleAutopsyClinicianDeterminerCode AutopsyPerformerRoleAutopsyClinicianName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician classCode='PSN' constraints.validation.error='AutopsyClinicianClassCode AutopsyClinicianDeterminerCode AutopsyClinicianName' determinerCode='INSTANCE'"
 * @generated
 */
public interface AutopsyPerformance extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.2')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.2\')'"
   * @generated
   */
  boolean validateAutopsyPerformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
   * @generated
   */
  boolean validateAutopsyPerformanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
   * @generated
   */
  boolean validateAutopsyPerformanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '21986-5' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'21986-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
   * @generated
   */
  boolean validateAutopsyPerformanceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateAutopsyPerformanceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))'"
   * @generated
   */
  boolean validateAutopsyPerformanceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
   * @generated
   */
  boolean validateAutopsyPerformanceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(classCode=vocab::EntityClass::PSN)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(classCode=vocab::EntityClass::PSN)'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(determinerCode=vocab::EntityDeterminer::INSTANCE)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(determinerCode=vocab::EntityDeterminer::INSTANCE)'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssignedEntity::ASSIGNED)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssignedEntity::ASSIGNED)'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(typeCode=vocab::ParticipationPhysicalPerformer::PRF)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
   * @generated
   */
  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyPerformance init();
} // AutopsyPerformance
