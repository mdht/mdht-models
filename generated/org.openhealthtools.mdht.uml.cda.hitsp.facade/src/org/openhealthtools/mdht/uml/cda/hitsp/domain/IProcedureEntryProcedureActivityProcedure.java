/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Entry Procedure Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getProcedureEntryProcedureActivityProcedure()
 * @generated
 */
public interface IProcedureEntryProcedureActivityProcedure extends IProcedureEntry {
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
	IProcedureEntryProcedureActivityProcedure setText(ED value);

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
	IProcedureEntryProcedureActivityProcedure setStatusCode(CS value);

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
	IProcedureEntryProcedureActivityProcedure addApproachSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::encounterLocation.
	 * self.getParticipant2s()->select(participant2 : cda::Participant2 | not participant2.oclIsUndefined() and participant2.oclIsKindOf(domain::EncounterLocation)).oclAsType(domain::EncounterLocation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IEncounterLocation> getEncounterLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] encounterLocation, where its type is Encounter Location (CONF-437).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncounterLocation addEncounterLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] encounterLocation, where its type is Encounter Location (CONF-437).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure addEncounterLocation(IEncounterLocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::patientInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PatientInstruction)).oclAsType(domain::PatientInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IPatientInstruction> getPatientInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] patientInstruction, where its type is Patient Instruction (CONF-441, CONF-333).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPatientInstruction addPatientInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] patientInstruction, where its type is Patient Instruction (CONF-441, CONF-333).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure addPatientInstruction(IPatientInstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AgeObservation))->asSequence()->first().oclAsType(domain::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain zero or one [0..1] ageObservation, where its type is Age Observation (CONF-445).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain zero or one [0..1] ageObservation, where its type is Age Observation (CONF-445).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure setAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProcedureActivity::medicationActivity.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::MedicationActivity)).oclAsType(domain::MedicationActivity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IMedicationActivity> getMedicationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] medicationActivity, where its type is Medication Activity (CONF-446).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addMedicationActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedure Activity MAY contain at least one [1..*] medicationActivity, where its type is Medication Activity (CONF-446).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure addMedicationActivity(IMedicationActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProcedureEntryProcedureActivityProcedure::internalReference.
	 * This element may be present to point the encounter in which the procedure was performed, and shall contain an internal reference to the encounter.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::InternalReference))->asSequence()->first().oclAsType(domain::InternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInternalReference getInternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInternalReference withInternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="COMP" COMP (has component), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure setInternalReference(IInternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::ProcedureEntryProcedureActivityProcedure::internalReferenceReason.
	 * A &lt;procedure> act may indicate one or more reasons for the procedure. These reasons identify the concern that was the reason for use via the Internal Reference entry content module. The extension and root of each observation present must match the identifier of a concern entry contained elsewhere within the CDA document.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::InternalReference)).oclAsType(domain::InternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IInternalReference> getInternalReferenceReasons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain at least one [1..*] entryRelationship, such that Contains @typeCode="RSON" RSON (has reason), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IInternalReference addInternalReferenceReason();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Procedure Entry Procedure Activity Procedure MAY contain at least one [1..*] entryRelationship, such that Contains @typeCode="RSON" RSON (has reason), and Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure addInternalReferenceReason(IInternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedureEntryProcedureActivityProcedure init();
} // IProcedureEntryProcedureActivityProcedure
