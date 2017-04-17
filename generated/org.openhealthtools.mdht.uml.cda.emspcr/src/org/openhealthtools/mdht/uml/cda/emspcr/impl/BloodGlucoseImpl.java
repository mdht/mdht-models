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
import org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BloodGlucoseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blood Glucose</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BloodGlucoseImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements BloodGlucose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodGlucoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.BLOOD_GLUCOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloodGlucoseValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BloodGlucoseOperations.validateBloodGlucoseValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloodGlucose init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BloodGlucose init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // BloodGlucoseImpl
