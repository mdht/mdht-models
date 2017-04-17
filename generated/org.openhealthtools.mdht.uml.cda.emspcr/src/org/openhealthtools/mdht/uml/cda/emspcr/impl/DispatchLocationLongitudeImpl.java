/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationLongitudeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Location Longitude</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DispatchLocationLongitudeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DispatchLocationLongitude {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchLocationLongitudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_LOCATION_LONGITUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLongitudeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLongitudeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLongitudeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLongitudeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationLongitude init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DispatchLocationLongitude init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // DispatchLocationLongitudeImpl
