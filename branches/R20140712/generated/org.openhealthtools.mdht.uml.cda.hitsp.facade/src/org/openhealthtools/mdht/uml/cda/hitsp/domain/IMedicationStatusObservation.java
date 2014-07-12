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

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedicationStatusObservation()
 * @generated
 */
public interface IMedicationStatusObservation extends IStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Status Observation SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.7 MedicationStatusCode STATIC 20061017 (CONF-353).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationStatusObservation setValue(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationStatusObservation init();
} // IMedicationStatusObservation
