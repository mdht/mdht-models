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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitNotifiedTimeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Notified Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnitNotifiedTimeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements UnitNotifiedTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitNotifiedTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_NOTIFIED_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitNotifiedTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitNotifiedTimeOperations.validateUnitNotifiedTimeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitNotifiedTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitNotifiedTimeOperations.validateUnitNotifiedTimeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitNotifiedTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitNotifiedTimeOperations.validateUnitNotifiedTimeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitNotifiedTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitNotifiedTimeOperations.validateUnitNotifiedTimeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitNotifiedTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitNotifiedTimeOperations.validateUnitNotifiedTimeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitNotifiedTime init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UnitNotifiedTime init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // UnitNotifiedTimeImpl
