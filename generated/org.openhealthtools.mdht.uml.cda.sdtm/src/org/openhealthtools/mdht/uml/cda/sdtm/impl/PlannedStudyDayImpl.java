/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PlannedStudyDayOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Study Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedStudyDayImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PlannedStudyDay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedStudyDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PLANNED_STUDY_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedStudyDayValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedStudyDayOperations.validatePlannedStudyDayValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PlannedStudyDay init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //PlannedStudyDayImpl
