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

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SeriousEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serious Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeriousEventImpl extends ObservationImpl implements SeriousEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriousEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SERIOUS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSeriousEventSeriousEventTypeAssociationSeriousEventType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeriousEventOperations.validateSeriousEventSeriousEventTypeAssociationSeriousEventType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriousEvent init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SeriousEvent init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SeriousEventImpl
