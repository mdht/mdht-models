/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * A vital signs organizer collects vital signs observations.
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getVitalSignsOrganizer()
 * @generated
 */
public interface IVitalSignsOrganizer extends IResultOrganizer {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * <ul>
	 *   <li>'{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType() <em>CDA Type</em>}'</li>
	 *   <li>'{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType() <em>CDA Type</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Organizer)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getResultOrganizer_CDAType()
	 * @generated
	 */
	Organizer getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Organizer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::id.
	 * The organizer shall have an &lt;id> element.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] id (6.3.4.21.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II withId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] id (6.3.4.21.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer setId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::effectiveTime.
	 * The effective time element shall be present to indicate when the measurement was taken.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] effectiveTime (6.3.4.21.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] effectiveTime (6.3.4.21.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHOULD contain at least one [1..*] specimen (CONF-399), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer addSpecimen(Specimen value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::VitalSignsOrganizer::vitalSignObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::VitalSignObservation)).oclAsType(domain::VitalSignObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IVitalSignObservation> getVitalSignObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain at least one [1..*] component (6.3.4.21.9), such that Contains exactly one [1..1] Vital Sign Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.13.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation addVitalSignObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain at least one [1..*] component (6.3.4.21.9), such that Contains exactly one [1..1] Vital Sign Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.13.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer addVitalSignObservation(IVitalSignObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::author.
	 * self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))->asSequence()->first().oclAsType(cda::Author)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Author getAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] author (6.3.4.21.8), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Author withAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Signs Organizer SHALL contain exactly one [1..1] author (6.3.4.21.8), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer setAuthor(Author value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] id (CONF-395).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] code (CONF-397).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] statusCode (CONF-396).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] component (CONF-405), such that Contains exactly one [1..1] Result Observation (templateId: 2.16.840.1.113883.10.20.1.31).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignsOrganizer addResultObservation(IResultObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsOrganizer init();
} // IVitalSignsOrganizer
