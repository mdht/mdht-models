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
import org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.ResponseReferenceRangePatternOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Reference Range Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseReferenceRangePatternImpl extends ReferenceRangeImpl implements ResponseReferenceRangePattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseReferenceRangePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternObservationRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternObservationRangeIVLINTHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternObservationRangeIVLINTHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternObservationRangeIVLINTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternObservationRangeIVLINTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternObservationRangeText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternObservationRangeText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseReferenceRangePatternObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseReferenceRangePatternOperations.validateResponseReferenceRangePatternObservationRangeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseReferenceRangePattern init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseReferenceRangePattern init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseReferenceRangePatternImpl
