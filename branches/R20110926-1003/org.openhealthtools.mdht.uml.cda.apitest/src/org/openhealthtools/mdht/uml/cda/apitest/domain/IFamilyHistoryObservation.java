/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFamily History Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIFamilyHistoryObservation()
 * @generated
 */
public interface IFamilyHistoryObservation {
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
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIFamilyHistoryObservation_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getCDAType <em>CDA Type</em>}' reference.
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
	 * APITest Family History Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Family History Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryObservation addId(II value);

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
	 * APITest Family History Observation Contains exactly one [1..1] code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Family History Observation Contains exactly one [1..1] code.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryObservation withCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::FamilyHistoryObservation::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation getAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Family History Observation Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Family History Observation Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IFamilyHistoryObservation withAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryObservation init();
} // IFamilyHistoryObservation
