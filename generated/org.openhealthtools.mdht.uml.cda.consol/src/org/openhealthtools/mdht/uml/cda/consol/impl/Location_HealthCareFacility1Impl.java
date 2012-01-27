/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility1;

import org.openhealthtools.mdht.uml.cda.consol.operations.Location_HealthCareFacility1Operations;

import org.openhealthtools.mdht.uml.cda.impl.HealthCareFacilityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Health Care Facility1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Location_HealthCareFacility1Impl extends HealthCareFacilityImpl implements Location_HealthCareFacility1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location_HealthCareFacility1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LOCATION_HEALTH_CARE_FACILITY1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCareFacility1Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Location_HealthCareFacility1Operations.validateHealthCareFacility1Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_HealthCareFacility1 init() {
		CDAUtil.init(this);
		return this;
	}
} // Location_HealthCareFacility1Impl
