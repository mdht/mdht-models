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
import org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ModelNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Number Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelNumberObservationImpl extends EObjectImpl implements ModelNumberObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNumberObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MODEL_NUMBER_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelNumberObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ModelNumberObservationOperations.validateModelNumberObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelNumberObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ModelNumberObservationOperations.validateModelNumberObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelNumberObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ModelNumberObservationOperations.validateModelNumberObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelNumberObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ModelNumberObservationOperations.validateModelNumberObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNumberObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelNumberObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //ModelNumberObservationImpl
