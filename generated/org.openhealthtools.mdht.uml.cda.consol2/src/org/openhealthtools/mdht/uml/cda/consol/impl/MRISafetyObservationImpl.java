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
import org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.MRISafetyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRI Safety Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MRISafetyObservationImpl extends EObjectImpl implements MRISafetyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRISafetyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MRI_SAFETY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRISafetyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MRISafetyObservationOperations.validateMRISafetyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRISafetyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MRISafetyObservationOperations.validateMRISafetyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRISafetyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MRISafetyObservationOperations.validateMRISafetyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRISafetyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MRISafetyObservationOperations.validateMRISafetyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRISafetyObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MRISafetyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //MRISafetyObservationImpl
