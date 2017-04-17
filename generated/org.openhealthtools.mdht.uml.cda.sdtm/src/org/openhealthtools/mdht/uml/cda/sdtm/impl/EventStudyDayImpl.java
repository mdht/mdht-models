/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventStudyDayOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Study Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventStudyDayImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements EventStudyDay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventStudyDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.EVENT_STUDY_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEventStudyDayValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EventStudyDayOperations.validateEventStudyDayValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStudyDay init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EventStudyDay init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //EventStudyDayImpl
