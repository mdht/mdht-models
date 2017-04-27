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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseBeginningOdometerReadingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Beginning Odometer Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseBeginningOdometerReadingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ResponseBeginningOdometerReading {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBeginningOdometerReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_BEGINNING_ODOMETER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseBeginningOdometerReadingTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseBeginningOdometerReadingMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseBeginningOdometerReadingCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseBeginningOdometerReadingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseBeginningOdometerReadingValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBeginningOdometerReading init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseBeginningOdometerReading init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseBeginningOdometerReadingImpl
