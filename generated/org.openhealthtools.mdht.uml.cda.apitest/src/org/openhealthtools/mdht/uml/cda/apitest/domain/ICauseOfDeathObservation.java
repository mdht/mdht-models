/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getICauseOfDeathObservation()
 * @generated
 */
public interface ICauseOfDeathObservation extends IFamilyHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getTimeOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains zero or one [0..1] <tt><b>effectiveTime</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setTimeOfDeath(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setAgeAtDeath(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation init();
} // ICauseOfDeathObservation
