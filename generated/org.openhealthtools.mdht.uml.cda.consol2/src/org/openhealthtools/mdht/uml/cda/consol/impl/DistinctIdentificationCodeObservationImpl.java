/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.DistinctIdentificationCodeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distinct Identification Code Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistinctIdentificationCodeObservationImpl extends EObjectImpl implements DistinctIdentificationCodeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctIdentificationCodeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISTINCT_IDENTIFICATION_CODE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinctIdentificationCodeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinctIdentificationCodeObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinctIdentificationCodeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinctIdentificationCodeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinctIdentificationCodeObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DistinctIdentificationCodeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //DistinctIdentificationCodeObservationImpl
