/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage#getPhcrClinicalInformationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhcrClinicalInformationSectionTemplateId PhcrClinicalInformationSectionPatientConditionConstraint PhcrClinicalInformationSectionCode PhcrClinicalInformationSectionCodeP PhcrClinicalInformationSectionTitle PhcrClinicalInformationSectionText PhcrClinicalInformationSectionCaseObservation' templateId.root='2.16.840.1.113883.10.20.15.2.1' code.code='55752-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Clinical Information' title.mixed='Clinical Information' constraints.validation.info='PhcrClinicalInformationSectionPatientConditionAliveObservation PhcrClinicalInformationSectionPatientConditionDeceasedObservation' constraints.validation.warning='PhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation'"
 * @generated
 */
public interface PhcrClinicalInformationSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->exists(obs3 : cda::Observation | obs3.oclIsKindOf(phcr::PatientConditionAliveObservation) and not self.getObservations()->exists(obs4 : cda::Observation | obs4.oclIsKindOf(phcr::PatientConditionDeceasedObservation))) or self.getObservations()->exists(obs1 : cda::Observation | obs1.oclIsKindOf(phcr::PatientConditionDeceasedObservation) and not self.getObservations()->exists(obs2 : cda::Observation | obs2.oclIsKindOf(phcr::PatientConditionAliveObservation))) or self.getObservations()->forAll(obs : cda::Observation | not obs.oclIsKindOf(phcr::PatientConditionAliveObservation) and not obs.oclIsKindOf(phcr::PatientConditionDeceasedObservation))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs3 : cda::Observation | obs3.oclIsKindOf(phcr::PatientConditionAliveObservation) and not self.getObservations()->exists(obs4 : cda::Observation | obs4.oclIsKindOf(phcr::PatientConditionDeceasedObservation))) or self.getObservations()->exists(obs1 : cda::Observation | obs1.oclIsKindOf(phcr::PatientConditionDeceasedObservation) and not self.getObservations()->exists(obs2 : cda::Observation | obs2.oclIsKindOf(phcr::PatientConditionAliveObservation))) or self.getObservations()->forAll(obs : cda::Observation | not obs.oclIsKindOf(phcr::PatientConditionAliveObservation) and not obs.oclIsKindOf(phcr::PatientConditionDeceasedObservation))'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionPatientConditionConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.15.2.1\')'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '55752-0' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'55752-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhcrClinicalInformationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Clinical Information')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Clinical Information\')'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePhcrClinicalInformationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::CaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::CaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PatientConditionAliveObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PatientConditionAliveObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionPatientConditionAliveObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PatientConditionDeceasedObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PatientConditionDeceasedObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PhcrRelevantMedicalConditionHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PhcrRelevantMedicalConditionHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::CaseObservation))->asSequence()->any(true).oclAsType(phcr::CaseObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::CaseObservation))->asSequence()->any(true).oclAsType(phcr::CaseObservation)'"
   * @generated
   */
	CaseObservation getCaseObservation();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PatientConditionAliveObservation))->asSequence()->any(true).oclAsType(phcr::PatientConditionAliveObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PatientConditionAliveObservation))->asSequence()->any(true).oclAsType(phcr::PatientConditionAliveObservation)'"
   * @generated
   */
	PatientConditionAliveObservation getPatientConditionAliveObservation();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PatientConditionDeceasedObservation))->asSequence()->any(true).oclAsType(phcr::PatientConditionDeceasedObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PatientConditionDeceasedObservation))->asSequence()->any(true).oclAsType(phcr::PatientConditionDeceasedObservation)'"
   * @generated
   */
	PatientConditionDeceasedObservation getPatientConditionDeceasedObservation();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PhcrRelevantMedicalConditionHistoryObservation)).oclAsType(phcr::PhcrRelevantMedicalConditionHistoryObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PhcrRelevantMedicalConditionHistoryObservation)).oclAsType(phcr::PhcrRelevantMedicalConditionHistoryObservation)'"
   * @generated
   */
	EList<PhcrRelevantMedicalConditionHistoryObservation> getPhcrRelevantMedicalConditionHistoryObservations();
	
} // PhcrClinicalInformationSection
