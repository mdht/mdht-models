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
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influenza PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#getInfluenzaPHCRSocialHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.2.49' constraints.validation.error='InfluenzaPHCRSocialHistorySectionTemplateId InfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation' constraints.validation.warning='InfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation InfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct'"
 * @generated
 */
public interface InfluenzaPHCRSocialHistorySection extends PhcrSocialHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation))->asSequence()->first().oclAsType(flu::InfluenzaEmploymentStatusObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaEmploymentStatusObservation))->asSequence()->first().oclAsType(flu::InfluenzaEmploymentStatusObservation)'"
	 * @generated
	 */
	InfluenzaEmploymentStatusObservation getInfluenzaEmploymentStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct)).oclAsType(flu::InfluenzaPossibleExposureLocationAct)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaPossibleExposureLocationAct)).oclAsType(flu::InfluenzaPossibleExposureLocationAct)'"
	 * @generated
	 */
	EList<InfluenzaPossibleExposureLocationAct> getInfluenzaPossibleExposureLocationActs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRSocialHistorySection init();
} // InfluenzaPHCRSocialHistorySection
