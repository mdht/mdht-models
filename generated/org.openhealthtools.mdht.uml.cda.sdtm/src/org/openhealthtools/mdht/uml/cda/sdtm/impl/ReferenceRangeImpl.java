/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationRangeImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ReferenceRangeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferenceRangeImpl extends ObservationRangeImpl implements ReferenceRange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.REFERENCE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferenceRangeInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateReferenceRangeInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceRange init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ReferenceRange init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ReferenceRangeImpl
