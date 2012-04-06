/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social History Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSocialHistoryObservation()
 * @generated
 */
public interface ISocialHistoryObservation {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getSocialHistoryObservation_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation#getCDAType <em>CDA Type</em>}' reference.
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
	 * CCD Social History Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Social History Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistoryObservation addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Observation Contains exactly one [1..1] code, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Observation Contains exactly one [1..1] code, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISocialHistoryObservation setCode(CD value);

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
	ISocialHistoryObservation setSocialHistoryStatusObservation(ISocialHistoryStatusObservation value);

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
	ISocialHistoryObservation setEpisodeObservation(IEpisodeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistoryObservation init();
} // ISocialHistoryObservation
