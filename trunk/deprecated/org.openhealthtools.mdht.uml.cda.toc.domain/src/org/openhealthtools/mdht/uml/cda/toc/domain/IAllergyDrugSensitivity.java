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
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Drug Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This module contains the allergy or intolerance conditions and the associated adverse reactions suffered
 *     by the patient. See the HL7 Continuity of Care Document Section 3.8 for constraints applicable to this module. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAllergyDrugSensitivity()
 * @generated
 */
public interface IAllergyDrugSensitivity {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Act)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAllergyDrugSensitivity_CDAType()
	 * @generated
	 */
	Act getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Act value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act SHALL contain at least one [1..*] id (CONF-148).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act SHALL contain at least one [1..*] id (CONF-148).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::statusCode.
	 * <p>
	 * The statusCode associated with any concern must be one of the following values:
	 * </p>
	 * <p>
	 * <b>active</b>: A concern that is still being tracked.
	 * <b>suspended</b>: A concern that is active, but which may be set aside. For example, this value might be used to suspend concern
	 * about a patient problem after some period of remission, but before assumption that the concern has been resolved.
	 * <b>aborted</b>: A concern that is no longer actively being tracked, but for reasons other than because the problem was resolved.
	 * This value might be used to mark a concern as being aborted after a patient leaves care against medical advice.
	 * <b>completed</b>:
	 * The problem, allergy or medical state has been resolved and the concern no longer needs to be tracked except for
	 * historical purposes.
	 * </p>
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Concern Entry SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Concern Entry SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::effectiveTime.
	 * The effectiveTime element records the starting and ending times during which the concern was active.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Concern Entry SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Concern Entry SHALL contain exactly one [1..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ProblemAct::episodeObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::EpisodeObservation))->asSequence()->first().oclAsType(domain::EpisodeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation getEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation withEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Problem Act MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity setEpisodeObservation(IEpisodeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::AllergyIntoleranceConcern::allergyIntolerance.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::AllergyIntolerance)).oclAsType(domain::AllergyIntolerance)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IAllergyIntolerance> getAllergyIntolerances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance Concern SHALL contain at least one [1..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Allergy Intolerance (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyIntolerance addAllergyIntolerance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Allergy Intolerance Concern SHALL contain at least one [1..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Allergy Intolerance (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAllergyDrugSensitivity addAllergyIntolerance(IAllergyIntolerance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyDrugSensitivity init();
} // IAllergyDrugSensitivity
