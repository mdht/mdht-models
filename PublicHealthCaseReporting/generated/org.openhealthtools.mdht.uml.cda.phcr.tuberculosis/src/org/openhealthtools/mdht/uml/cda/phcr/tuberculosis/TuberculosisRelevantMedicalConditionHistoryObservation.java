/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relevant Medical Condition History Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage#getTuberculosisRelevantMedicalConditionHistoryObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation value.displayName='Co-morbid conditions' value.codeSystemName='SNOMEDCT' templateId.root='2.16.840.1.113883.10.20.15.3.107' value.code='398192003' constraints.validation.error='TuberculosisRelevantMedicalConditionHistoryObservationTemplateId PhcrRelevantMedicalConditionHistoryObservationValue TuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation' value.codeSystem='2.16.840.1.113883.6.96'"
 * @generated
 */
public interface TuberculosisRelevantMedicalConditionHistoryObservation extends PhcrRelevantMedicalConditionHistoryObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.code = '398192003' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'398192003\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
  boolean validatePhcrRelevantMedicalConditionHistoryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation))'"
	 * @generated
	 */
  boolean validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation))->asSequence()->first().oclAsType(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation))->asSequence()->first().oclAsType(tuberculosis::TuberculosisRelevantMedicalConditionProblemObservation)'"
	 * @generated
	 */
  TuberculosisRelevantMedicalConditionProblemObservation getTuberculosisRelevantMedicalConditionProblemObservation();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisRelevantMedicalConditionHistoryObservation init();
} // TuberculosisRelevantMedicalConditionHistoryObservation
