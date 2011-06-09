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

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAge Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A common scenario is that a patient will know the age of a relative when they had a certain condition or when they died, but will not know the actual year (e.g. "grandpa died of a heart attack at the age of 50"). Often times, neither precise dates nor ages are known (e.g. "cousin died of congenital heart disease as an infant"). In all cases, dates and times and ages can be expressed in narrative.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIAgeObservation()
 * @generated
 */
public interface IAgeObservation {
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
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIAgeObservation_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#getCDAType <em>CDA Type</em>}' reference.
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
	 * cda::Observation::value.
	 * Valued using appropriate datatype.
	 * self.value.oclAsType(datatypes::ANY)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Age Observation SHALL contain exactly one [1..1] value (CONF-231).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY withValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Age Observation SHALL contain exactly one [1..1] value (CONF-231).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withValue(ANY value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation init();
} // IAgeObservation
