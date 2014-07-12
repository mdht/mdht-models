/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientRespiratoryRate;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Patient Respiratory Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPatientRespiratoryRateImpl extends EObjectImpl implements EMSPatientRespiratoryRate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPatientRespiratoryRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspatientcarereportPackage.Literals.EMS_PATIENT_RESPIRATORY_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientRespiratoryRate init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EMSPatientRespiratoryRateImpl
