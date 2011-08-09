/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getImmunization()
 * @generated
 */
public interface IImmunization {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getImmunization_CDAType()
	 * @generated
	 */
	SubstanceAdministration getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization#getCDAType <em>CDA Type</em>}' reference.
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
	IImmunization addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Immunization SHALL contain zero or one [0..1] code, which SHALL be selected from ValueSet 2.16.840.1.114222.4.11.934 Vaccines administered (CVX) STATIC 3.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Immunization SHALL contain zero or one [0..1] code, which SHALL be selected from ValueSet 2.16.840.1.114222.4.11.934 Vaccines administered (CVX) STATIC 3.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setCode(CD value);

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
	 * IHE Immunization SHALL contain exactly one [1..1] statusCode (6.3.4.17.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization SHALL contain exactly one [1..1] statusCode (6.3.4.17.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::SXCM_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	SXCM_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization SHALL contain exactly one [1..1] effectiveTime (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	SXCM_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization SHALL contain exactly one [1..1] effectiveTime (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setEffectiveTime(SXCM_TS value);

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
	IImmunization setRouteCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::approachSiteCode.
	 * The site where the medication is administered, usually used with IV or topical drugs. The &lt;approachSiteCode> element describes the site of medication administrion. It may be coded
	 * to a controlled vocabulary that lists such sites (e.g., SNOMED-CT). In CDA documents, this
	 * 4805 element contains a URI in the value attribute of the &lt;reference> that points to the text in the
	 * narrative identifying the site. In a message, the &lt;originalText> element shall contain the text
	 * identifying the site.
	 * self.approachSiteCode.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getApproachSiteCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or more [0..*] approachSiteCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addApproachSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or more [0..*] approachSiteCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization addApproachSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::doseQuantity.
	 * The amount of the medication given. This should be in some known and measurable unit, such as grams, milligrams, et cetera. It may be measured in "administration" units (such as tablets or each), for medications where the strength is relevant. In this case, only the unit count is specified , no units are specified. It may be a range.
	 * self.doseQuantity.oclAsType(datatypes::IVL_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ getDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or one [0..1] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ withDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or one [0..1] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setDoseQuantity(IVL_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::rateQuantity.
	 * The rate is a measurement of how fast the dose is given to the patient over time (e.g., .5 liter / 1 hr), and is often used with IV drugs.
	 * self.rateQuantity.oclAsType(datatypes::IVL_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ getRateQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ withRateQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Immunization Contains zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setRateQuantity(IVL_PQ value);

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
	IImmunization setMaxDoseQuantity(RTO_PQ_PQ value);

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
	IImmunization setConsumable(Consumable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::medicationSeriesNumberObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(ccd::MedicationSeriesNumberObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	MedicationSeriesNumberObservation getMedicationSeriesNumberObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-338, CONF-339), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Medication Series Number Observation (templateId: 2.16.840.1.113883.10.20.1.46).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	MedicationSeriesNumberObservation withMedicationSeriesNumberObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-338, CONF-339), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Medication Series Number Observation (templateId: 2.16.840.1.113883.10.20.1.46).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setMedicationSeriesNumberObservation(MedicationSeriesNumberObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::medicationStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationStatusObservation))->asSequence()->first().oclAsType(ccd::MedicationStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	MedicationStatusObservation getMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-350), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	MedicationStatusObservation withMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-350), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization setMedicationStatusObservation(MedicationStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::patientInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PatientInstruction)).oclAsType(ccd::PatientInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<PatientInstruction> getPatientInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-330, CONF-333), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PatientInstruction addPatientInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-330, CONF-333), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Patient Instruction (templateId: 2.16.840.1.113883.10.20.1.49).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization addPatientInstruction(PatientInstruction value);

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
	IImmunization addPerformer(Performer2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::reactionObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation)).oclAsType(ccd::ReactionObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ReactionObservation> getReactionObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-348, CONF-349), such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ReactionObservation addReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-348, CONF-349), such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization addReactionObservation(ReactionObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::MedicationActivity::productInstance.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(ccd::ProductInstance)).oclAsType(ccd::ProductInstance)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ProductInstance> getProductInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] participant (CONF-368), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ProductInstance addProductInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] participant (CONF-368), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization addProductInstance(ProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization init();
} // IImmunization
