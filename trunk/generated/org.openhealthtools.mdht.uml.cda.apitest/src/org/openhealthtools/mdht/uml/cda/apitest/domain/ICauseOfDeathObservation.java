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
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getTimeOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Cause Of Death Observation Contains zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withTimeOfDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Cause Of Death Observation Contains zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation withTimeOfDeath(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Cause Of Death Observation Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IAgeObservation withAgeAtDeath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Cause Of Death Observation Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation withAgeAtDeath(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation init();
} // ICauseOfDeathObservation
