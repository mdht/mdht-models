/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VehicleImpactAreaOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Impact Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VehicleImpactAreaImpl extends ObservationImpl implements VehicleImpactArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpactAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.VEHICLE_IMPACT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleImpactAreaTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VehicleImpactAreaOperations.validateVehicleImpactAreaTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleImpactAreaCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VehicleImpactAreaOperations.validateVehicleImpactAreaCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleImpactAreaValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VehicleImpactAreaOperations.validateVehicleImpactAreaValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleImpactAreaMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VehicleImpactAreaOperations.validateVehicleImpactAreaMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleImpactArea init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VehicleImpactArea init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //VehicleImpactAreaImpl
