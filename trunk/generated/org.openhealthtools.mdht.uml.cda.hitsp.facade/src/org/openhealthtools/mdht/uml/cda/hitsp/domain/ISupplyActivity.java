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
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a supply activity is used to describe what has been dispensed.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupplyActivity()
 * @generated
 */
public interface ISupplyActivity {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Supply)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSupplyActivity_CDAType()
	 * @generated
	 */
	Supply getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Supply value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHALL contain at least one [1..*] id (CONF-318).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHALL contain at least one [1..*] id (CONF-318).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::statusCode.
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHOULD contain exactly one [1..1] statusCode (CONF-319).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHOULD contain exactly one [1..1] statusCode (CONF-319).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::effectiveTime.
	 * Indicates the actual or intended time of dispensing.
	 * self.effectiveTime.oclAsType(datatypes::SXCM_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	SXCM_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHOULD contain exactly one [1..1] effectiveTime (CONF-320).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	SXCM_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity SHOULD contain exactly one [1..1] effectiveTime (CONF-320).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity setEffectiveTime(SXCM_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::repeatNumber.
	 * Indicates the number of fills. (Note that repeatNumber corresponds to the number of "fills", as opposed to the number of "refills").
	 * self.repeatNumber.oclAsType(datatypes::IVL_INT)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_INT getRepeatNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] repeatNumber (CONF-321).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_INT withRepeatNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] repeatNumber (CONF-321).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity setRepeatNumber(IVL_INT value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::quantity.
	 * Indicates the actual or intended supply quantity.
	 * self.quantity.oclAsType(datatypes::PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ getQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] quantity (CONF-322).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ withQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] quantity (CONF-322).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity setQuantity(PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SupplyActivity::medicationStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationStatusObservation))->asSequence()->first().oclAsType(domain::MedicationStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationStatusObservation getMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] entryRelationship (CONF-351), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationStatusObservation withMedicationStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain exactly one [1..1] entryRelationship (CONF-351), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity setMedicationStatusObservation(IMedicationStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SupplyActivity::fulfillmentInstruction.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::FulfillmentInstruction)).oclAsType(domain::FulfillmentInstruction)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IFulfillmentInstruction> getFulfillmentInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain at least one [1..*] entryRelationship (CONF-334, CONF-337), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Fulfillment Instruction (templateId: 2.16.840.1.113883.10.20.1.43).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFulfillmentInstruction addFulfillmentInstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain at least one [1..*] entryRelationship (CONF-334, CONF-337), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Fulfillment Instruction (templateId: 2.16.840.1.113883.10.20.1.43).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity addFulfillmentInstruction(IFulfillmentInstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SupplyActivity::productInstance.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::ProductInstance)).oclAsType(domain::ProductInstance)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProductInstance> getProductInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain at least one [1..*] participant (CONF-369), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProductInstance addProductInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Supply Activity MAY contain at least one [1..*] participant (CONF-369), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISupplyActivity addProductInstance(IProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupplyActivity init();
} // ISupplyActivity
