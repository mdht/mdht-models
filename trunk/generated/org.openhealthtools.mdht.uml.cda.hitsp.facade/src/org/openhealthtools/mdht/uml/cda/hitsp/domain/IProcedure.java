/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a coded entry describing a procedure performed on a patient.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getProcedure()
 * @generated
 */
public interface IProcedure {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Procedure)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getProcedure_CDAType()
	 * @generated
	 */
	Procedure getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Procedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Procedure::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Procedure SHOULD contain exactly one [1..1] code (CONF-433).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Procedure SHOULD contain exactly one [1..1] code (CONF-433).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Procedure::statusCode.
	 * The &lt;statusCode> element shall be present when used to describe a procedure event. It shall have the value 'completed' for procedures that have been completed, and 'active' for procedures that are still in progress. Procedures that were stopped prior to completion shall use the value 'aborted', and procedures that were cancelled before being started shall use the value 'cancelled'.
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.15 ProcedureStatusCode STATIC 20061017 (CONF-430, CONF-431).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.15 ProcedureStatusCode STATIC 20061017 (CONF-430, CONF-431).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Procedure::text.
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Procedure::approachSiteCode.
	 * This element may be present to indicate the procedure approach.
	 * self.approachSiteCode.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getApproachSiteCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or more [0..*] approachSiteCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addApproachSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or more [0..*] approachSiteCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addApproachSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Procedure::targetSiteCode.
	 * The anatomical site where a procedure is performed
	 * self.targetSiteCode.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getTargetSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Procedure SHOULD contain exactly one [1..1] targetSiteCode, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.9 Body Site STATIC 2 (C83-[DE-17-CDA-3]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withTargetSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Procedure SHOULD contain exactly one [1..1] targetSiteCode, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.9 Body Site STATIC 2 (C83-[DE-17-CDA-3]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setTargetSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::encounterLocation.
	 * self.getParticipant2s()->select(participant2 : cda::Participant2 | not participant2.oclIsUndefined() and participant2.oclIsKindOf(ccd::EncounterLocation)).oclAsType(ccd::EncounterLocation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<EncounterLocation> getEncounterLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] encounterLocation, where its type is Encounter Location (CONF-437).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EncounterLocation addEncounterLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] encounterLocation, where its type is Encounter Location (CONF-437).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addEncounterLocation(EncounterLocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::patientInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PatientInstruction)).oclAsType(ccd::PatientInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<PatientInstruction> getPatientInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] patientInstruction, where its type is Patient Instruction (CONF-441, CONF-333).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PatientInstruction addPatientInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] patientInstruction, where its type is Patient Instruction (CONF-441, CONF-333).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addPatientInstruction(PatientInstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AgeObservation))->asSequence()->first().oclAsType(ccd::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain zero or one [0..1] ageObservation, where its type is Age Observation (CONF-445).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	AgeObservation withAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain zero or one [0..1] ageObservation, where its type is Age Observation (CONF-445).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setAgeObservation(AgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::medicationActivity.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ccd::MedicationActivity)).oclAsType(ccd::MedicationActivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<MedicationActivity> getMedicationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] medicationActivity, where its type is Medication Activity (CONF-446).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	MedicationActivity addMedicationActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] medicationActivity, where its type is Medication Activity (CONF-446).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addMedicationActivity(MedicationActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProcedureEntryProcedureActivityProcedure::internalReference.
	 * This element may be present to point the encounter in which the procedure was performed, and shall contain an internal reference to the encounter.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference))->asSequence()->first().oclAsType(ihe::InternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InternalReference getInternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InternalReference withInternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure setInternalReference(InternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProcedureEntryProcedureActivityProcedure::internalReferenceReason.
	 * A &lt;procedure> act may indicate one or more reasons for the procedure. These reasons identify the concern that was the reason for use via the Internal Reference entry content module. The extension and root of each observation present must match the identifier of a concern entry contained elsewhere within the CDA document.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<InternalReference> getInternalReferenceReasons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain at least one [1..*] entryRelationship, such that Contains @typeCode="RSON" RSON (has reason), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InternalReference addInternalReferenceReason();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain at least one [1..*] entryRelationship, such that Contains @typeCode="RSON" RSON (has reason), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addInternalReferenceReason(InternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure init();
} // IProcedure
