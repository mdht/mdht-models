/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Represents the patient's sources of support such as immediate family, relatives, and guardian at the time the summarization is generated. Support information also includes next of kin, caregivers, and support organizations. At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included.</p>
 * <p>CDA R2 represents a patient's guardian with the CDA Header Guardian class. Other Supporters are represented as participant participations in the CDA Header.</p>
 * <p>Represents the patient's sources of support such as immediate family, relatives, and guardian at the time the summarization is generated. Support information also includes next of kin, caregivers, and support organizations. At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included.</p>
 * <p>CDA R2 represents a patient's guardian with the CDA Header Guardian class. Other Supporters are represented as participant participations in the CDA Header.</p>
 * At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included. If no healthcare providers are supplied, the reason should be supplied as free text in the narrative block (e.g., Unknown, etc).
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSupportParticipant()
 * @model
 * @generated
 */
public interface SupportParticipant extends Support {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportParticipant init();
} // SupportParticipant
