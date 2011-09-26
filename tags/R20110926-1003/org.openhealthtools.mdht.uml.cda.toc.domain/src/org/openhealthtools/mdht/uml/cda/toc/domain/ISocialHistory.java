/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSocialHistory()
 * @generated
 */
public interface ISocialHistory {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSocialHistory_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Observation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Simple Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Simple Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHOULD contain zero or more [0..*] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.80.60 Social History Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHOULD contain zero or more [0..*] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.80.60 Social History Type STATIC 1.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory addCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHOULD contain zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Social History SHOULD contain zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * <p>
	 * The data type to use for each observation should be drawn from the table below.
	 * Observations in the table above using the PQ data type have a unit in the form {xxx}/d,
	 * {xxx}/wk or {xxx}/a represent the number of items per day, week or year respectively. The value attribute indicates the number of times of the act performed, and the units represent the
	 * frequency.
	 * </p>
	 * 
	 * <p>
	 * 229819007 Smoking  PQ  {pack}/d or {pack}/wk or {pack}/a
	 * 256235009 Exercise PQ {times}/wk
	 * 160573003 ETOH (Alcohol) Use PQ {drink}/d or {drink}/wk
	 * 364393001 Diet  CD  N/A
	 * 364703007 Employment CD  N/A
	 * 425400000 Toxic Exposure CD  N/A
	 * 363908000 Drug Use CD  N/A
	 * 228272008 Other Social History ANY N/A
	 * </p>
	 * self.value.oclAsType(datatypes::ANY)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<ANY> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Social History Observation MAY contain zero or more [0..*] value.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY addValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Social History Observation MAY contain zero or more [0..*] value.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory addValue(ANY value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SocialHistoryObservation::socialHistoryStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::SocialHistoryStatusObservation))->asSequence()->first().oclAsType(domain::SocialHistoryStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistoryStatusObservation getSocialHistoryStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Observation MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Social History Status Observation (templateId: 2.16.840.1.113883.10.20.1.56).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistoryStatusObservation withSocialHistoryStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Observation MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Social History Status Observation (templateId: 2.16.840.1.113883.10.20.1.56).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory setSocialHistoryStatusObservation(ISocialHistoryStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::SocialHistoryObservation::episodeObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::EpisodeObservation))->asSequence()->first().oclAsType(domain::EpisodeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation getEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Observation MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IEpisodeObservation withEpisodeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Observation MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistory setEpisodeObservation(IEpisodeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistory init();
} // ISocialHistory
