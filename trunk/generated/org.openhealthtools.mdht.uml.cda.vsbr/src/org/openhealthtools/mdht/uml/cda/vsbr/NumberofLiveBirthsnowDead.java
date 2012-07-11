/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numberof Live Birthsnow Dead</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getNumberofLiveBirthsnowDead()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Number of Live Births now DeadTemplateId Number of Live Births now DeadClassCode Number of Live Births now DeadCode Number of Live Births now DeadMoodCode Number of Live Births now DeadValue' templateId.root='2.16.840.1.113883.10.20.26.28' classCode='OBS' moodCode='EVN'"
 * @generated
 */
public interface NumberofLiveBirthsnowDead extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.28')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.28\')'"
   * @generated
   */
  boolean validateNumberofLiveBirthsnowDeadTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNumberofLiveBirthsnowDeadClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNumberofLiveBirthsnowDeadCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateNumberofLiveBirthsnowDeadMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))'"
   * @generated
   */
  boolean validateNumberofLiveBirthsnowDeadValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofLiveBirthsnowDead init();
} // NumberofLiveBirthsnowDead
