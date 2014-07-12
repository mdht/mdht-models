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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Order Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Order information may be recorded as part of the fulfillment history (moodcode = EVN) or as part of the administration information (moodcode = INT)
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicationOrderInformation()
 * @generated
 */
public interface IMedicationOrderInformation {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getMedicationOrderInformation_CDAType()
	 * @generated
	 */
	Supply getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation#getCDAType <em>CDA Type</em>}' reference.
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
	IMedicationOrderInformation addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::statusCode.
	 * When supply element has a moodCode attribute set to EVN
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Order Information MAY contain exactly one [1..1] statusCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.80.64 Medication Fill Status STATIC 1 (CONF-319).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Order Information MAY contain exactly one [1..1] statusCode, which MAY be selected from ValueSet 2.16.840.1.113883.3.88.12.80.64 Medication Fill Status STATIC 1 (CONF-319).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationOrderInformation setStatusCode(CS value);

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
	IMedicationOrderInformation setEffectiveTime(SXCM_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::repeatNumber.
	 * <p>
	 * The number of times that the ordering provider has
	 * authorized the pharmacy to dispense this medication
	 * </p>
	 * <p>
	 * Please note that the number of fills requested is what is recorded in the document, not the number of refills. The number of refills is simply one less than the number of fills.
	 * </p>
	 * self.repeatNumber.oclAsType(datatypes::IVL_INT)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_INT getRepeatNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Order Information MAY contain exactly one [1..1] repeatNumber (CONF-321).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_INT withRepeatNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Order Information MAY contain exactly one [1..1] repeatNumber (CONF-321).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationOrderInformation setRepeatNumber(IVL_INT value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Supply::quantity.
	 * The supply entry should indicate the quantity supplied. The value attribute shall be present and
	 * indicates the quantity of medication supplied. If the medication is supplied in dosing units
	 * (tablets or capsules), then the unit attribute need not be present (and should be set to 1 if present).
	 * Otherwise, the unit element shall be present to indicate the quantity (e.g., volume or mass) of
	 * medication supplied.
	 * self.quantity.oclAsType(datatypes::PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ getQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Supply Entry SHOULD contain exactly one [1..1] quantity (CONF-322).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ withQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Supply Entry SHOULD contain exactly one [1..1] quantity (CONF-322).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationOrderInformation setQuantity(PQ value);

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
	IMedicationOrderInformation setMedicationStatusObservation(IMedicationStatusObservation value);

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
	IMedicationOrderInformation addProductInstance(IProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::SupplyEntry::medicationFullfillmentInstructions.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::MedicationFullfillmentInstructions))->asSequence()->first().oclAsType(domain::MedicationFullfillmentInstructions)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationFullfillmentInstructions getMedicationFullfillmentInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Supply Entry Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Medication Fullfillment Instructions (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.3.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationFullfillmentInstructions withMedicationFullfillmentInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Supply Entry Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Medication Fullfillment Instructions (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.3.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationOrderInformation setMedicationFullfillmentInstructions(IMedicationFullfillmentInstructions value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationOrderInformation init();
} // IMedicationOrderInformation
