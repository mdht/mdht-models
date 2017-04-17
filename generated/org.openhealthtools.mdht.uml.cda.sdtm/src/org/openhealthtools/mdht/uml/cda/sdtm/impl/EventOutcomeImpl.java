/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventOutcomeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventOutcomeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements EventOutcome {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.EVENT_OUTCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventOutcomeValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventOutcomeOperations.validateEventOutcomeValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOutcome init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EventOutcome init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //EventOutcomeImpl
