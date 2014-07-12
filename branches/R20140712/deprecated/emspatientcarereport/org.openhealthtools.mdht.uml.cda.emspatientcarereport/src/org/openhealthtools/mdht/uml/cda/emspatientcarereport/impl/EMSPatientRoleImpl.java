/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EMSPatientRole;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Patient Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPatientRoleImpl extends EObjectImpl implements EMSPatientRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPatientRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspatientcarereportPackage.Literals.EMS_PATIENT_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientRole init() {
    	CDAUtil.init(this);
    	return this;
	}
} //EMSPatientRoleImpl
