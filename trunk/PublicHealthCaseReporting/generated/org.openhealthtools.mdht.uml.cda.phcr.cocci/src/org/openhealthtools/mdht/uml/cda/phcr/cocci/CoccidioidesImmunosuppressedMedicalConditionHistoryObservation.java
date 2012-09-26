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
package org.openhealthtools.mdht.uml.cda.phcr.cocci;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage#getCoccidioidesImmunosuppressedMedicalConditionHistoryObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CoccidioidesImmunosuppressedMedicalConditionHistoryObservationTemplateId' templateId.root='2.16.840.1.113883.10.20.15.3.94' constraints.validation.warning='CoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation'"
 * @generated
 */
public interface CoccidioidesImmunosuppressedMedicalConditionHistoryObservation extends PhcrRelevantMedicalConditionHistoryObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
	boolean validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation))->asSequence()->any(true).oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation))->asSequence()->any(true).oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionProblemObservation)'"
   * @generated
   */
	CoccidioidesImmunosuppressedMedicalConditionProblemObservation getCoccidioidesImmunosuppressedMedicalConditionProblemObservation();
} // CoccidioidesImmunosuppressedMedicalConditionHistoryObservation
