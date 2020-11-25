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
import org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ExpirationDateObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expiration Date Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpirationDateObservationImpl extends ObservationImpl implements ExpirationDateObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpirationDateObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.EXPIRATION_DATE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationDateObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExpirationDateObservationOperations.validateExpirationDateObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationDateObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExpirationDateObservationOperations.validateExpirationDateObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationDateObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExpirationDateObservationOperations.validateExpirationDateObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationDateObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExpirationDateObservationOperations.validateExpirationDateObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpirationDateObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpirationDateObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //ExpirationDateObservationImpl
