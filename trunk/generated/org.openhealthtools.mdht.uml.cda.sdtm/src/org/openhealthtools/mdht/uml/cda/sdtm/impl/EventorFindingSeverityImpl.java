/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventorFindingSeverityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eventor Finding Severity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventorFindingSeverityImpl extends ObservationImpl implements EventorFindingSeverity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventorFindingSeverityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.EVENTOR_FINDING_SEVERITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventorFindingSeverityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventorFindingSeverityOperations.validateEventorFindingSeverityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EventorFindingSeverity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EventorFindingSeverityImpl
