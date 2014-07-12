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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage#getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionTemplateId' templateId.root='2.16.840.1.113883.10.20.15.2.56' constraints.validation.warning='StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation' constraints.validation.info='StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer'"
 * @generated
 */
public interface StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection extends PhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation)).oclAsType(streppneumo::StrepPneumoResultObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation)).oclAsType(streppneumo::StrepPneumoResultObservation)'"
	 * @generated
	 */
	EList<StrepPneumoResultObservation> getStrepPneumoResultObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer)).oclAsType(streppneumo::StrepPneumoResultOrganizer)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer)).oclAsType(streppneumo::StrepPneumoResultOrganizer)'"
	 * @generated
	 */
	EList<StrepPneumoResultOrganizer> getStrepPneumoResultOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection
