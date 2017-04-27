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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitBackInServiceTimeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Back In Service Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnitBackInServiceTimeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements UnitBackInServiceTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitBackInServiceTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_BACK_IN_SERVICE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBackInServiceTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBackInServiceTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBackInServiceTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBackInServiceTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBackInServiceTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBackInServiceTime init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UnitBackInServiceTime init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // UnitBackInServiceTimeImpl
