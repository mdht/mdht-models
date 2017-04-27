/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.NumericResponsePatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Response Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumericResponsePatternObservationImpl extends ObservationImpl implements NumericResponsePatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericResponsePatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.NUMERIC_RESPONSE_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationCDCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationCDCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationCDCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericResponsePatternObservationCDOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericResponsePatternObservationOperations.validateNumericResponsePatternObservationCDOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericResponsePatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NumericResponsePatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NumericResponsePatternObservationImpl
