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
package org.openhealthtools.mdht.uml.cda.phcr.flu;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influenza PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#getInfluenzaPHCRTreatmentInformationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.2.48' constraints.validation.error='InfluenzaPHCRTreatmentInformationSectionTemplateId InfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct'"
 * @generated
 */
public interface InfluenzaPHCRTreatmentInformationSection extends PhcrTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct))->asSequence()->first().oclAsType(flu::InfluenzaTherapeuticRegimenAct)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct))->asSequence()->first().oclAsType(flu::InfluenzaTherapeuticRegimenAct)'"
	 * @generated
	 */
	InfluenzaTherapeuticRegimenAct getInfluenzaTherapeuticRegimenAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRTreatmentInformationSection init();
} // InfluenzaPHCRTreatmentInformationSection
