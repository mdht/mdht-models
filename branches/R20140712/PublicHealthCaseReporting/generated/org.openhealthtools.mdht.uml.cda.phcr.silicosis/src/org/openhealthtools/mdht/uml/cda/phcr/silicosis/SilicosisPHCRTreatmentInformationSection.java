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

import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage#getSilicosisPHCRTreatmentInformationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SilicosisPHCRTreatmentInformationSectionSilicosisTherapeuticRegimenAct'"
 * @generated
 */
public interface SilicosisPHCRTreatmentInformationSection extends PhcrTreatmentInformationSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(silicosis::SilicosisTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(silicosis::SilicosisTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
   * @generated
   */
	boolean validateSilicosisPHCRTreatmentInformationSectionSilicosisTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(silicosis::SilicosisTherapeuticRegimenAct))->asSequence()->first().oclAsType(silicosis::SilicosisTherapeuticRegimenAct)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(silicosis::SilicosisTherapeuticRegimenAct))->asSequence()->first().oclAsType(silicosis::SilicosisTherapeuticRegimenAct)'"
   * @generated
   */
	SilicosisTherapeuticRegimenAct getSilicosisTherapeuticRegimenAct();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisPHCRTreatmentInformationSection init();

} // SilicosisPHCRTreatmentInformationSection
