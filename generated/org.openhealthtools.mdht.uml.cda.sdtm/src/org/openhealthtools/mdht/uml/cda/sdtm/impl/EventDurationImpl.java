/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventDurationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventDurationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements EventDuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.EVENT_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventDurationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventDurationOperations.validateEventDurationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EventDuration init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //EventDurationImpl
