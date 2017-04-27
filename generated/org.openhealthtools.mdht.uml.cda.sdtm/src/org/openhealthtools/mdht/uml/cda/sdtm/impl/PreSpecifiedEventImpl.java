/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PreSpecifiedEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Specified Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreSpecifiedEventImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PreSpecifiedEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreSpecifiedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PRE_SPECIFIED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreSpecifiedEventValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreSpecifiedEventOperations.validatePreSpecifiedEventValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PreSpecifiedEvent init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //PreSpecifiedEventImpl
