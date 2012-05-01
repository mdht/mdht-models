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
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Plan of Care Section contains information about the expectations for care to be provided including
 *     proposed interventions and goals for improving the condition of the patient. 
 * </p>
 * <p>
 *     A plan of care section varies from the assessment and plan section defined above in that it does not
 *     include a physician assessment of the patient condition. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPlanOfCareSection()
 * @generated
 */
public interface IPlanOfCareSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPlanOfCareSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::title.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::text.
	 * self.text.oclAsType(cda::StrucDocText)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivityAct.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PlanOfCareActivityAct))->asSequence()->first().oclAsType(domain::PlanOfCareActivityAct)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityAct getPlanOfCareActivityAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Act (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityAct withPlanOfCareActivityAct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Act (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivityAct(IPlanOfCareActivityAct value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivityEncounter.
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(domain::PlanOfCareActivityEncounter))->asSequence()->first().oclAsType(domain::PlanOfCareActivityEncounter)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityEncounter getPlanOfCareActivityEncounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Encounter (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityEncounter withPlanOfCareActivityEncounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Encounter (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivityEncounter(IPlanOfCareActivityEncounter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivityObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::PlanOfCareActivityObservation))->asSequence()->first().oclAsType(domain::PlanOfCareActivityObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityObservation getPlanOfCareActivityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Observation (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityObservation withPlanOfCareActivityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Observation (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivityObservation(IPlanOfCareActivityObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivityProcedure.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::PlanOfCareActivityProcedure))->asSequence()->first().oclAsType(domain::PlanOfCareActivityProcedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityProcedure getPlanOfCareActivityProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Procedure (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivityProcedure withPlanOfCareActivityProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Procedure (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivityProcedure(IPlanOfCareActivityProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivitySubstanceAdministration.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::PlanOfCareActivitySubstanceAdministration))->asSequence()->first().oclAsType(domain::PlanOfCareActivitySubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Substance Administration (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivitySubstanceAdministration withPlanOfCareActivitySubstanceAdministration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Substance Administration (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivitySubstanceAdministration(IPlanOfCareActivitySubstanceAdministration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PlanOfCareSection::planOfCareActivitySupply.
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(domain::PlanOfCareActivitySupply))->asSequence()->first().oclAsType(domain::PlanOfCareActivitySupply)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivitySupply getPlanOfCareActivitySupply();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Supply (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareActivitySupply withPlanOfCareActivitySupply();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Plan Of Care Activity Supply (templateId: 2.16.840.1.113883.10.20.1.25).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setPlanOfCareActivitySupply(IPlanOfCareActivitySupply value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::PlanOfCareSection::medication.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::Medication))->asSequence()->first().oclAsType(domain::Medication)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication getMedication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Medication (templateId: 2.16.840.1.113883.3.88.11.83.8).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedication withMedication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Medication (templateId: 2.16.840.1.113883.3.88.11.83.8).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setMedication(IMedication value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::PlanOfCareSection::immunization.
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::Immunization))->asSequence()->first().oclAsType(domain::Immunization)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization getImmunization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Immunization (templateId: 2.16.840.1.113883.3.88.11.83.13).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IImmunization withImmunization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Immunization (templateId: 2.16.840.1.113883.3.88.11.83.13).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setImmunization(IImmunization value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::PlanOfCareSection::encounter.
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(domain::Encounter))->asSequence()->first().oclAsType(domain::Encounter)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncounter getEncounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Encounter (templateId: 2.16.840.1.113883.3.88.11.83.16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEncounter withEncounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Encounter (templateId: 2.16.840.1.113883.3.88.11.83.16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setEncounter(IEncounter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::PlanOfCareSection::procedure.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::Procedure))->asSequence()->first().oclAsType(domain::Procedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure getProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure withProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Plan Of Care Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPlanOfCareSection setProcedure(IProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection init();
} // IPlanOfCareSection
