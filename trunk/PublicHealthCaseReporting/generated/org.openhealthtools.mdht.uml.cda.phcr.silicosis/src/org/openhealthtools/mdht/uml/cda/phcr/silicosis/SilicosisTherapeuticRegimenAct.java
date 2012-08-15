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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage#getSilicosisTherapeuticRegimenAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='SilicosisTherapeuticRegimenActSilicosisTreatmentGivenSubstanceAdministration' constraints.validation.info='SilicosisTherapeuticRegimenActSilicosisTreatmentNotGivenSubstanceAdministration'"
 * @generated
 */
public interface SilicosisTherapeuticRegimenAct extends TherapeuticRegimenAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentGivenSubstanceAdministration))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentGivenSubstanceAdministration))'"
   * @generated
   */
	boolean validateSilicosisTherapeuticRegimenActSilicosisTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration))'"
   * @generated
   */
	boolean validateSilicosisTherapeuticRegimenActSilicosisTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentGivenSubstanceAdministration)).oclAsType(silicosis::SilicosisTreatmentGivenSubstanceAdministration)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentGivenSubstanceAdministration)).oclAsType(silicosis::SilicosisTreatmentGivenSubstanceAdministration)'"
   * @generated
   */
	EList<SilicosisTreatmentGivenSubstanceAdministration> getSilicosisTreatmentGivenSubstanceAdministrations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration)).oclAsType(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration)).oclAsType(silicosis::SilicosisTreatmentNotGivenSubstanceAdministration)'"
   * @generated
   */
	EList<SilicosisTreatmentNotGivenSubstanceAdministration> getSilicosisTreatmentNotGivenSubstanceAdministrations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisTherapeuticRegimenAct init();

} // SilicosisTherapeuticRegimenAct
