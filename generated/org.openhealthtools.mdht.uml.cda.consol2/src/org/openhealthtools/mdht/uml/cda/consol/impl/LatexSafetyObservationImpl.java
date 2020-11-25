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
import org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.LatexSafetyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latex Safety Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LatexSafetyObservationImpl extends EObjectImpl implements LatexSafetyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatexSafetyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LATEX_SAFETY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatexSafetyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LatexSafetyObservationOperations.validateLatexSafetyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatexSafetyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LatexSafetyObservationOperations.validateLatexSafetyObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatexSafetyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LatexSafetyObservationOperations.validateLatexSafetyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatexSafetyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LatexSafetyObservationOperations.validateLatexSafetyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatexSafetyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LatexSafetyObservationOperations.validateLatexSafetyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatexSafetyObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LatexSafetyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //LatexSafetyObservationImpl
