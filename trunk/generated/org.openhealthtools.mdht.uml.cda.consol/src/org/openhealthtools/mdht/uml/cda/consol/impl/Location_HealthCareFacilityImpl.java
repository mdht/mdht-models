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
import org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility;

import org.openhealthtools.mdht.uml.cda.consol.operations.Location_HealthCareFacilityOperations;

import org.openhealthtools.mdht.uml.cda.impl.HealthCareFacilityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Health Care Facility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Location_HealthCareFacilityImpl extends HealthCareFacilityImpl implements Location_HealthCareFacility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location_HealthCareFacilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LOCATION_HEALTH_CARE_FACILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCareFacilityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Location_HealthCareFacilityOperations.validateHealthCareFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_HealthCareFacility init() {
		CDAUtil.init(this);
		return this;
	}
} // Location_HealthCareFacilityImpl
