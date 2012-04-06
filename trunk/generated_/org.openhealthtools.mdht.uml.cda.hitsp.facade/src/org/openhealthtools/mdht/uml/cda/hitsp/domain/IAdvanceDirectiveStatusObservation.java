/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getAdvanceDirectiveStatusObservation()
 * @generated
 */
public interface IAdvanceDirectiveStatusObservation extends IStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Advance Directive Status Observation SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.1.11.20.1 AdvanceDirectiveStatusCode STATIC 20061017.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAdvanceDirectiveStatusObservation setValue(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveStatusObservation init();
} // IAdvanceDirectiveStatusObservation
