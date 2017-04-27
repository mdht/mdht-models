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
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.TextResponsePatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Response Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextResponsePatternObservationImpl extends ObservationImpl implements TextResponsePatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextResponsePatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.TEXT_RESPONSE_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationLanguageCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationLanguageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextResponsePatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextResponsePatternObservationOperations.validateTextResponsePatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextResponsePatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextResponsePatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TextResponsePatternObservationImpl
