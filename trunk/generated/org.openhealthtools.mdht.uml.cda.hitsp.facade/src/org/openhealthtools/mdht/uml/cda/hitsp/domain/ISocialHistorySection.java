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
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Social History Section contains information about the person's beliefs, home life, community life,
 *     work life, hobbies, and risky habits. 
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <p>
 *     This section contains data defining the patient's occupational, personal (e.g. lifestyle), social, and
 *     environmental history and health risk factors, as well as administrative data such as marital status, race, ethnicity
 *     and religious affiliation. Social history can have significant influence on a patient's physical, psychological and
 *     emotional health and wellbeing so should be considered in the development of a complete record.
 * </p>
 * 
 * <p>
 * The ASTM CCR includes 'administrative data (ADT) such as marital status, ethnicity, nationality, and religious preferences' in the Social History section. CDA R2 differentiates between administrative data and clinical observations, supporting the former in the CDA Header and the latter in the CDA Body. As a result, it is necessary at times to populate attributes in the CDA Header, and to provide richer clinical details in the CDA Body.
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSocialHistorySection()
 * @generated
 */
public interface ISocialHistorySection {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSocialHistorySection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Social History Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Section SHALL contain exactly one [1..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection setTitle(ST value);

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
	 * CCD Social History Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Section SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::SocialHistorySection::socialHistory.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::SocialHistory)).oclAsType(domain::SocialHistory)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ISocialHistory> getSocialHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Social History (templateId: 2.16.840.1.113883.10.20.1.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory addSocialHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History Section MAY contain zero or more [0..*] entry, such that Contains exactly one [1..1] Social History (templateId: 2.16.840.1.113883.10.20.1.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection addSocialHistory(ISocialHistory value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SocialHistorySection::socialHistoryObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::SocialHistoryObservation)).oclAsType(domain::SocialHistoryObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ISocialHistoryObservation> getSocialHistoryObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Section SHOULD contain zero or more [0..*] entry, such that Contains exactly one [1..1] Social History Observation (templateId: 2.16.840.1.113883.10.20.1.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistoryObservation addSocialHistoryObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Section SHOULD contain zero or more [0..*] entry, such that Contains exactly one [1..1] Social History Observation (templateId: 2.16.840.1.113883.10.20.1.33).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistorySection addSocialHistoryObservation(ISocialHistoryObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection init();
} // ISocialHistorySection
