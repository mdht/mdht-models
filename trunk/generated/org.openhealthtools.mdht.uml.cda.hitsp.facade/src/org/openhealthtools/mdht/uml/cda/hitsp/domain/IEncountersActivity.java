/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getEncountersActivity()
 * @generated
 */
public interface IEncountersActivity {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Encounter)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getEncountersActivity_CDAType()
	 * @generated
	 */
	Encounter getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Encounter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Encounter::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Encounter::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.1.11.13955 EncounterCode STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.1.11.13955 EncounterCode STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Encounter::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::EncountersActivity::patientInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PatientInstruction)).oclAsType(domain::PatientInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IPatientInstruction> getPatientInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or more [0..*] entryRelationship, such that Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPatientInstruction addPatientInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or more [0..*] entryRelationship, such that Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity addPatientInstruction(IPatientInstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::EncountersActivity::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AgeObservation))->asSequence()->first().oclAsType(domain::AgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity setAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::EncountersActivity::encounterLocation.
	 * self.getParticipant2s()->select(participant2 : cda::Participant2 | not participant2.oclIsUndefined() and participant2.oclIsKindOf(domain::EncounterLocation)).oclAsType(domain::EncounterLocation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IEncounterLocation> getEncounterLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or more [0..*] encounterLocation, such that Contains exactly one [1..1] Encounter Location (templateId: 2.16.840.1.113883.10.20.1.45).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncounterLocation addEncounterLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Encounters Activity MAY contain zero or more [0..*] encounterLocation, such that Contains exactly one [1..1] Encounter Location (templateId: 2.16.840.1.113883.10.20.1.45).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncountersActivity addEncounterLocation(IEncounterLocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersActivity init();
} // IEncountersActivity
