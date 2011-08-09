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
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedication()
 * @generated
 */
public interface IMedication {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedication_CDAType()
	 * @generated
	 */
	SubstanceAdministration getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication#getCDAType <em>CDA Type</em>}' reference.
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
	IMedication addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::code.
	 * Delivery Method: A description of how the product is
	 * administered/consumed
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain zero or more [0..*] code (C83-[DE-8.12-CDA-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain zero or more [0..*] code (C83-[DE-8.12-CDA-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::effectiveTime.
	 * Indicate Medication Stopped: Used to express a "hard stop," such as the last Sig sequence in a tapering dose, where the last sequence is 'then D/C' or where the therapy/drug is used to treat a condition and that treatment is for a fixed duration with a hard stop, such as antibiotic treatment, etc.
	 * Administration Timing: defines a specific administration or use time. Can be a text string (Morning, Evening, Before Meals, 1 Hour After Meals, 3 Hours After Meals, Before Bed) or an exact time.
	 * Frequency: defines how often the medication is to be administered as events per unit of time. Often expressed as the number of times per day (e.g., four times a day), but may also include event-related information (e.g., 1 hour before meals, in the morning, at bedtime). Complimentary to Interval, although equivalent expressions may have different implications (e.g., every 8 hours versus 3 times a day).
	 * Interval: defines how the product is to be administered as an interval of time. For example, every 8 hours. Complimentary to Frequency, although equivalent expressions may have different implications (e.g., every 8 hours versus 3 times a day).
	 * Duration: for non-instantaneous administrations, indicates the length of time the administration should be continued. For example, (infuse) over 30 minutes.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IVL_TS> getEffectiveTimes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] effectiveTime, where its data type is IVL_TS (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS addEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] effectiveTime, where its data type is IVL_TS (CONF-308).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::routeCode.
	 * The route is a coded value, and indicates how the medication is received by the patient (by mouth, intravenously, topically, et cetera).
	 * self.routeCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CE> getRouteCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] routeCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.7 Medication Route FDA STATIC 1 (CONF-309, CONF-310).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE addRouteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] routeCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.7 Medication Route FDA STATIC 1 (CONF-309, CONF-310).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addRouteCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::approachSiteCode.
	 * The anatomic site where the
	 * medication is administered. Usually applicable to
	 * injected or topical products
	 * self.approachSiteCode.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getApproachSiteCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain zero or more [0..*] approachSiteCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.9 Body Site STATIC 2 (C154-[DE-8.09-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addApproachSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain zero or more [0..*] approachSiteCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.9 Body Site STATIC 2 (C154-[DE-8.09-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addApproachSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::doseQuantity.
	 * the amount of the product to be
	 * given. This may be a known, measurable unit (e.g.,
	 * milliliters), an administration unit (e.g., tablet), or an
	 * amount of active ingredient (e.g., 250 mg). May define
	 * a variable dose, dose range or dose options based
	 * upon identified criteria (see Dose Indicator)
	 * self.doseQuantity.oclAsType(datatypes::IVL_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IVL_PQ> getDoseQuantities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ addDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] doseQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addDoseQuantity(IVL_PQ value);

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
	 * IHE Medication SHOULD contain zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_PQ withRateQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication SHOULD contain zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication setRateQuantity(IVL_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::maxDoseQuantity.
	 * defines a maximum or dose limit.
	 * This segment can repeat for more than one dose
	 * restriction
	 * self.maxDoseQuantity.oclAsType(datatypes::RTO_PQ_PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<RTO_PQ_PQ> getMaxDoseQuantities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] maxDoseQuantity (CONF-312).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	RTO_PQ_PQ addMaxDoseQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain at least one [1..*] maxDoseQuantity (CONF-312).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addMaxDoseQuantity(RTO_PQ_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::SubstanceAdministration::administrationUnitCode.
	 * The physical form of the product as presented to the
	 * patient. For example: tablet, capsule, liquid or
	 * ointment
	 * self.administrationUnitCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getAdministrationUnitCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain exactly one [1..1] administrationUnitCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.11 Medication Product Form STATIC 1 (C154-[DE-8.11-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withAdministrationUnitCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication MAY contain exactly one [1..1] administrationUnitCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.8.11 Medication Product Form STATIC 1 (C154-[DE-8.11-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication setAdministrationUnitCode(CE value);

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
	IMedication setConsumable(Consumable value);

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
	IMedication setMedicationSeriesNumberObservation(MedicationSeriesNumberObservation value);

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
	IMedication setMedicationStatusObservation(MedicationStatusObservation value);

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
	IMedication addPerformer(Performer2 value);

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
	IMedication addReactionObservation(ReactionObservation value);

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
	IMedication addProductInstance(ProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::Medication::internalReference.
	 * Entry may indicate one or more reasons for the use of the
	 * medication. The extension and root of each observation present must match the identifier of a concern entry
	 * contained elsewhere within the CDA document.
	 * A consumer of the Medical Summary is encouraged, but not required to maintain these links on
	 * import.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<InternalReference> getInternalReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InternalReference addInternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addInternalReference(InternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::Medication::patientMedicalInstructions.
	 * At most one instruction may be provided for each &lt;substanceAdministration> entry. The instructions
	 * shall contain any special case dosing instructions (e.g., split, tapered, or conditional dosing), and
	 * may contain other information (take with food, et cetera).
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::PatientMedicalInstructions)).oclAsType(ihe::PatientMedicalInstructions)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<PatientMedicalInstructions> getPatientMedicalInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Patient Medical Instructions (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PatientMedicalInstructions addPatientMedicalInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Patient Medical Instructions (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addPatientMedicalInstructions(PatientMedicalInstructions value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::Medication::medicationType.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationType))->asSequence()->first().oclAsType(domain::MedicationType)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationType getMedicationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Medication Type (templateId: 2.16.840.1.113883.3.88.11.83.8.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationType withMedicationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Medication Type (templateId: 2.16.840.1.113883.3.88.11.83.8.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication setMedicationType(IMedicationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::Medication::medicationOrderInformation.
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(domain::MedicationOrderInformation)).oclAsType(domain::MedicationOrderInformation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IMedicationOrderInformation> getMedicationOrderInformations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Medication Order Information (templateId: 2.16.840.1.113883.3.88.11.83.8.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationOrderInformation addMedicationOrderInformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Medication Order Information (templateId: 2.16.840.1.113883.3.88.11.83.8.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication addMedicationOrderInformation(IMedicationOrderInformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::Medication::reactionObservation.
	 * Any noted intended or unintended effects of the
	 * product. For example: full body rash, nausea, rash
	 * resolved
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ReactionObservation getReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] CCD Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ReactionObservation withReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] CCD Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication setReactionObservation(ReactionObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication init();
} // IMedication
