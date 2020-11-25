/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SerialNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serial Number Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SerialNumberObservationImpl extends ObservationImpl implements SerialNumberObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerialNumberObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SERIAL_NUMBER_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SerialNumberObservationOperations.validateSerialNumberObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SerialNumberObservationOperations.validateSerialNumberObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SerialNumberObservationOperations.validateSerialNumberObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SerialNumberObservationOperations.validateSerialNumberObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerialNumberObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SerialNumberObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //SerialNumberObservationImpl
