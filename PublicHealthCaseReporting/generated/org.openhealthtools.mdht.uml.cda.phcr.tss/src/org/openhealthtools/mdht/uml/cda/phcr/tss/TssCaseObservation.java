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
package org.openhealthtools.mdht.uml.cda.phcr.tss;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tss Case Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage#getTssCaseObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TssCaseObservationTemplateId TssCaseObservationValue TssCaseObservationValueP' templateId.root='2.16.840.1.113883.10.20.15.3.99' value.code='240450004' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.TssCaseObservationValue='TssCaseObservationValueP' constraints.validation.warning='TssCaseObservationTssSignsAndSymptomsObservation'"
 * @generated
 */
public interface TssCaseObservation extends CaseObservation {
	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
   * @generated
   */
  boolean validateTssCaseObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
   * value.code = '240450004' and value.codeSystem = '2.16.840.1.113883.6.96'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'240450004\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
   * @generated
   */
  boolean validateTssCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tss::TssSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(tss::TssSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)'"
   * @generated
   */
	boolean validateTssCaseObservationTssSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tss::TssSignsAndSymptomsObservation)).oclAsType(tss::TssSignsAndSymptomsObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tss::TssSignsAndSymptomsObservation)).oclAsType(tss::TssSignsAndSymptomsObservation)'"
   * @generated
   */
	EList<TssSignsAndSymptomsObservation> getTssSignsAndSymptomsObservations();
} // TssCaseObservation
