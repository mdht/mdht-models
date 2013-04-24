/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>VDT Ambulatory Summary</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getVDTAmbulatorySummary()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VDTAmbulatorySummaryProviderNameAndContactInfo VDTAmbulatorySummaryMedicationsSection'"
 * @generated
 */
public interface VDTAmbulatorySummary extends ViewDownloadTransmitSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent.performer->notEmpty() and self.documentationOf.serviceEvent.performer->exists( not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.encounterParticipant->notEmpty() and self.componentOf.encompassingEncounter.encounterParticipant->exists(not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.responsibleParty->notEmpty() and self.componentOf.encompassingEncounter.responsibleParty->exists(not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent.performer->notEmpty() and self.documentationOf.serviceEvent.performer->exists( not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.encounterParticipant->notEmpty() and self.componentOf.encompassingEncounter.encounterParticipant->exists(not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.responsibleParty->notEmpty() and self.componentOf.encompassingEncounter.responsibleParty->exists(not assignedEntity.oclIsUndefined() and assignedEntity.assignedPerson.name->notEmpty() and assignedEntity.addr->notEmpty() and assignedEntity.telecom->notEmpty()))'"
	 * @generated
	 */
	boolean validateVDTAmbulatorySummaryProviderNameAndContactInfo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))'"
	 * @generated
	 */
	boolean validateVDTAmbulatorySummaryMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)'"
	 * @generated
	 */
	MedicationsSection getMedicationsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VDTAmbulatorySummary init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public VDTAmbulatorySummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // VDTAmbulatorySummary
