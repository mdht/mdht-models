/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Represents the patient's sources of support such as immediate family, relatives, and guardian at the time the summarization is generated. Support information also includes next of kin, caregivers, and support organizations. At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included.</p>
 * <p>CDA R2 represents a patient's guardian with the CDA Header Guardian class. Other Supporters are represented as participant participations in the CDA Header.</p>
 * At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included. If no healthcare providers are supplied, the reason should be supplied as free text in the narrative block (e.g., Unknown, etc).
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSupport()
 * @model
 * @generated
 */
public interface Support extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Support init();
} // Support
