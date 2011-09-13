/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFamilyHistoryOrganizer()
 * @generated
 */
public interface IFamilyHistoryOrganizer {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Organizer)
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getFamilyHistoryOrganizer_CDAType()
	 * @generated
	 */
	Organizer getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer#getCDAType <em>CDA Type</em>}' reference.
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
	 * ccd::FamilyHistoryOrganizer::familyHistoryObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::FamilyHistoryObservation)).oclAsType(domain::FamilyHistoryObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IFamilyHistoryObservation> getFamilyHistoryObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Organizer SHOULD contain at least one [1..*] component, such that Contains exactly one [1..1] Family History Observation (templateId: 2.16.840.1.113883.10.20.1.22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryObservation addFamilyHistoryObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Organizer SHOULD contain at least one [1..*] component, such that Contains exactly one [1..1] Family History Observation (templateId: 2.16.840.1.113883.10.20.1.22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryOrganizer addFamilyHistoryObservation(IFamilyHistoryObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryOrganizer init();
} // IFamilyHistoryOrganizer
