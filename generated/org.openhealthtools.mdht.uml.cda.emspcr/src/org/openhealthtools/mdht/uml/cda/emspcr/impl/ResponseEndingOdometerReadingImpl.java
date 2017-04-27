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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseEndingOdometerReadingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Ending Odometer Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseEndingOdometerReadingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ResponseEndingOdometerReading {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseEndingOdometerReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_ENDING_ODOMETER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEndingOdometerReadingTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEndingOdometerReadingMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEndingOdometerReadingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEndingOdometerReadingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEndingOdometerReadingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEndingOdometerReading init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseEndingOdometerReading init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseEndingOdometerReadingImpl
