/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A medication activity is used to describe what is administered.</p>
 * <p>An indication describes the rationale for a medication activity. The indication can be an existing problem or can be a criterion that if met would warrant the activity. Criteria are typically associated with PRN (from the Latin "pro re nata", meaning "as needed") medications (e.g. "give Medication X as needed for nausea").</p>
 * <p>A reaction represents an adverse event due to an administered substance. Significant reactions are to be listed in the Alerts section. Reactions in the Medications section can be used to track reactions associated with individual substance administrations or to track routine follow up to an administration (e.g. "no adverse reaction 30 minutes post administration").</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedicationActivity()
 * @generated
 */
public interface IMedicationActivity {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(SubstanceAdministration)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedicationActivity_CDAType()
	 * @generated
	 */
	SubstanceAdministration getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(SubstanceAdministration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHALL contain at least one [1..*] id (CONF-306).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHALL contain at least one [1..*] id (CONF-306).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::statusCode.
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain exactly one [1..1] statusCode (CONF-307).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain exactly one [1..1] statusCode (CONF-307).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::effectiveTime.
	 * Used to indicate the actual or intended start and stop date of a medication, and the frequency of administration.
	 * self.effectiveTime.oclAsType(datatypes::SXCM_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<SXCM_TS> getEffectiveTimes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain at least one [1..*] effectiveTime (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	SXCM_TS addEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain at least one [1..*] effectiveTime (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addEffectiveTime(SXCM_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::routeCode.
	 * self.routeCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getRouteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain exactly one [1..1] routeCode (CodeSystem: 2.16.840.1.113883.5.112 HL7 RouteOfAdministration) (CONF-309, CONF-310).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withRouteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain exactly one [1..1] routeCode (CodeSystem: 2.16.840.1.113883.5.112 HL7 RouteOfAdministration) (CONF-309, CONF-310).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setRouteCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::doseQuantity.
	 * self.doseQuantity.oclAsType(datatypes::IVL_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ getDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain zero or one [0..1] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ withDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain zero or one [0..1] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setDoseQuantity(IVL_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::rateQuantity.
	 * self.rateQuantity.oclAsType(datatypes::IVL_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ getRateQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ withRateQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHOULD contain zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setRateQuantity(IVL_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::maxDoseQuantity.
	 * represents a maximum dose limit
	 * self.maxDoseQuantity.oclAsType(datatypes::RTO_PQ_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	RTO_PQ_PQ getMaxDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] maxDoseQuantity (CONF-312).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	RTO_PQ_PQ withMaxDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] maxDoseQuantity (CONF-312).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setMaxDoseQuantity(RTO_PQ_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::consumable.
	 * self.getConsumables()->select(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))->asSequence()->first().oclAsType(cda::Consumable)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Consumable getConsumable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Substance Administration Contains exactly one [1..1] consumable, where its type is Consumable.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Consumable withConsumable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Substance Administration Contains exactly one [1..1] consumable, where its type is Consumable.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setConsumable(Consumable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::medicationSeriesNumberObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(domain::MedicationSeriesNumberObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationSeriesNumberObservation getMedicationSeriesNumberObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-338, CONF-339), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Medication Series Number Observation (templateId: 2.16.840.1.113883.10.20.1.46).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationSeriesNumberObservation withMedicationSeriesNumberObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-338, CONF-339), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Medication Series Number Observation (templateId: 2.16.840.1.113883.10.20.1.46).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setMedicationSeriesNumberObservation(IMedicationSeriesNumberObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::medicationStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationStatusObservation))->asSequence()->first().oclAsType(domain::MedicationStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationStatusObservation getMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-350), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationStatusObservation withMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-350), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity setMedicationStatusObservation(IMedicationStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::patientInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PatientInstruction)).oclAsType(domain::PatientInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IPatientInstruction> getPatientInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-330, CONF-333), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPatientInstruction addPatientInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-330, CONF-333), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addPatientInstruction(IPatientInstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::performer.
	 * Indicates the person administering a substance.
	 * self.getPerformer2s()->select(performer2 : cda::Performer2 | not performer2.oclIsUndefined() and performer2.oclIsKindOf(cda::Performer2)).oclAsType(cda::Performer2)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<Performer2> getPerformers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] performer (CONF-313), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Performer2 addPerformer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] performer (CONF-313), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addPerformer(Performer2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::reactionObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ReactionObservation)).oclAsType(domain::ReactionObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IReactionObservation> getReactionObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-348, CONF-349), such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IReactionObservation addReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-348, CONF-349), such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addReactionObservation(IReactionObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::productInstance.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::ProductInstance)).oclAsType(domain::ProductInstance)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProductInstance> getProductInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] participant (CONF-368), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProductInstance addProductInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] participant (CONF-368), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationActivity addProductInstance(IProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationActivity init();
} // IMedicationActivity
