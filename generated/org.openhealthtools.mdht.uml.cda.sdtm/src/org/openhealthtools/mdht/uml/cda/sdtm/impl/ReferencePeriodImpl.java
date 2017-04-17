/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ReferencePeriodOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReferencePeriodImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements ReferencePeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.REFERENCE_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferencePeriodEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencePeriodOperations.validateReferencePeriodEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePeriod init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ReferencePeriod init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ReferencePeriodImpl
