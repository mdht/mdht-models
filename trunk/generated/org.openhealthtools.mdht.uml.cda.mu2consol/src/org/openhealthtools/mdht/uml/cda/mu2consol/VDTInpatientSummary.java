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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>VDT Inpatient Summary</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getVDTInpatientSummary()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VDTInpatientSummaryAdmissionDate VDTInpatientSummaryDischargeDate VDTInpatientSummaryAdmissionDischargeLocation VDTInpatientSummaryMedications VDTInpatientSummaryReasonforHospitalization VDTInpatientSummaryHospitalDischargeInstructionsSection'"
 * @generated
 */
public interface VDTInpatientSummary extends ViewDownloadTransmitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent->notEmpty() and self.documentationOf.serviceEvent->forAll((effectiveTime.low.oclIsUndefined() or effectiveTime.low.isNullFlavorUndefined()) implies not effectiveTime.low.oclIsUndefined())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll((effectiveTime.low.oclIsUndefined() or effectiveTime.low.isNullFlavorUndefined()) implies not effectiveTime.low.oclIsUndefined())) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryAdmissionDate(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent->notEmpty() and self.documentationOf.serviceEvent->forAll((effectiveTime.high.oclIsUndefined() or effectiveTime.high.isNullFlavorUndefined()) implies not effectiveTime.high.oclIsUndefined())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll((effectiveTime.high.oclIsUndefined() or effectiveTime.high.isNullFlavorUndefined()) implies not effectiveTime.oclIsUndefined() and not effectiveTime.high.oclIsUndefined())) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryDischargeDate(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll(location->notEmpty() and location.oclIsTypeOf(cda::Location))) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryAdmissionDischargeLocation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryMedications(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='((self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or \r\n self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor \r\n self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PreoperativeDiagnosisSection))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryReasonforHospitalization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))'"
	 * @generated
	 */
	boolean validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)'"
	 * @generated
	 */
	HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public VDTInpatientSummary init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public VDTInpatientSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // VDTInpatientSummary
