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
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getFamilyHistory()
 * @generated
 */
public interface IFamilyHistory {
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
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getFamilyHistory_CDAType()
	 * @generated
	 */
	Organizer getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory#getCDAType <em>CDA Type</em>}' reference.
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
	 * cda::Organizer::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Family History Organizer SHALL contain exactly one [1..1] code (CodeSystem: 2.16.840.1.113883.5.111 RoleCode).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Family History Organizer SHALL contain exactly one [1..1] code (CodeSystem: 2.16.840.1.113883.5.111 RoleCode).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistory setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::FamilyHistoryOrganizer::familyHistoryObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::FamilyHistoryObservation)).oclAsType(domain::FamilyHistoryObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IFamilyHistoryObservation> getFamilyHistoryObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Family History Organizer SHALL contain at least one [1..*] component, such that Contains exactly one [1..1] Family History Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.13.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryObservation addFamilyHistoryObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Family History Organizer SHALL contain at least one [1..*] component, such that Contains exactly one [1..1] Family History Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.13.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistory addFamilyHistoryObservation(IFamilyHistoryObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::FamilyHistory::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ProblemStatusObservation)).oclAsType(domain::ProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProblemStatusObservation> getProblemStatusObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Family History SHOULD contain zero or more [0..*] component, such that Contains exactly one [1..1] IHE Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemStatusObservation addProblemStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Family History SHOULD contain zero or more [0..*] component, such that Contains exactly one [1..1] IHE Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistory addProblemStatusObservation(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistory init();
} // IFamilyHistory
