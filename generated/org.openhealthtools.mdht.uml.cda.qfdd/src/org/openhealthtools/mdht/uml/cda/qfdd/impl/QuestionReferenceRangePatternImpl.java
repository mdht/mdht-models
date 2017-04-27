/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionReferenceRangePatternOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Reference Range Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionReferenceRangePatternImpl extends ReferenceRangeImpl implements QuestionReferenceRangePattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionReferenceRangePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTION_REFERENCE_RANGE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternObservationRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternObservationRangeIVLINTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternObservationRangeIVLINTLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternObservationRangeText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternObservationRangeText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionReferenceRangePatternObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionReferenceRangePatternOperations.validateQuestionReferenceRangePatternObservationRangeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReferenceRangePattern init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionReferenceRangePattern init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionReferenceRangePatternImpl
