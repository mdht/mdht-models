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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationLatitudeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Location Latitude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DispatchLocationLatitudeImpl extends ObservationImpl implements DispatchLocationLatitude {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchLocationLatitudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_LOCATION_LATITUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLatitudeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLatitudeOperations.validateDispatchLocationLatitudeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLatitudeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLatitudeOperations.validateDispatchLocationLatitudeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLatitudeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLatitudeOperations.validateDispatchLocationLatitudeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationLatitudeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationLatitudeOperations.validateDispatchLocationLatitudeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationLatitude init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationLatitude init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DispatchLocationLatitudeImpl
