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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyDayPeriodOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Day Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyDayPeriodImpl extends ObservationImpl implements StudyDayPeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyDayPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_DAY_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyDayPeriodValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyDayPeriodOperations.validateStudyDayPeriodValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudyDayPeriod init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyDayPeriodImpl
