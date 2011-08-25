/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivityImpl extends EObjectImpl implements IPlanOfCareActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getPlanOfCareActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivity init() {
		CDAUtil.init(this);
		return this;
	}
} // PlanOfCareActivityImpl
