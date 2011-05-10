/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHealth Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The health status observation records information about the current health status of the patient.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIHealthStatusObservation()
 * @generated
 */
public interface IHealthStatusObservation extends IStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Health Status Observation SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet HealthStatusValue STATIC.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IHealthStatusObservation withValue(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation init();
} // IHealthStatusObservation
