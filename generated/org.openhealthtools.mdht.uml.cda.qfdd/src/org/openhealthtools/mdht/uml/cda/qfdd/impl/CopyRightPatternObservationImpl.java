/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.CopyRightPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Right Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CopyRightPatternObservationImpl extends ObservationImpl implements CopyRightPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyRightPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CopyRightPatternObservationOperations.validateCopyRightPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyRightPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyRightPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CopyRightPatternObservationImpl
