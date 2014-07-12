/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientSystolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Patient Systolic Blood Pressure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPatientSystolicBloodPressureImpl extends EObjectImpl implements EMSPatientSystolicBloodPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPatientSystolicBloodPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspatientcarereportPackage.Literals.EMS_PATIENT_SYSTOLIC_BLOOD_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientSystolicBloodPressure init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EMSPatientSystolicBloodPressureImpl
