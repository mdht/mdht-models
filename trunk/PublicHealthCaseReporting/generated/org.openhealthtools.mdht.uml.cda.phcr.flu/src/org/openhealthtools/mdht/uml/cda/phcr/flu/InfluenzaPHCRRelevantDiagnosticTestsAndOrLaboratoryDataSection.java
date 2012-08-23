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

import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.2.51' constraints.validation.error='InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTemplateId' constraints.validation.warning='InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation' constraints.validation.info='InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation'"
 * @generated
 */
public interface InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection extends PhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(flu::InfluenzaImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaResultObservation)).oclAsType(flu::InfluenzaResultObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaResultObservation)).oclAsType(flu::InfluenzaResultObservation)'"
	 * @generated
	 */
	EList<InfluenzaResultObservation> getInfluenzaResultObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaImagingObservation)).oclAsType(flu::InfluenzaImagingObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(flu::InfluenzaImagingObservation)).oclAsType(flu::InfluenzaImagingObservation)'"
	 * @generated
	 */
	EList<InfluenzaImagingObservation> getInfluenzaImagingObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection init();
} // InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection
