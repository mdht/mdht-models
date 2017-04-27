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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseOnSceneOdometerReadingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response On Scene Odometer Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseOnSceneOdometerReadingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ResponseOnSceneOdometerReading {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseOnSceneOdometerReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_ON_SCENE_ODOMETER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOnSceneOdometerReadingTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOnSceneOdometerReadingMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOnSceneOdometerReadingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOnSceneOdometerReadingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOnSceneOdometerReadingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOnSceneOdometerReading init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseOnSceneOdometerReading init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseOnSceneOdometerReadingImpl
