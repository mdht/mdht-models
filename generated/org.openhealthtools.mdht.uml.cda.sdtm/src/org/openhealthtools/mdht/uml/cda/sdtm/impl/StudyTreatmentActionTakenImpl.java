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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyTreatmentActionTakenOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Treatment Action Taken</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyTreatmentActionTakenImpl extends ObservationImpl implements StudyTreatmentActionTaken {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTreatmentActionTakenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_TREATMENT_ACTION_TAKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentActionTakenValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentActionTakenOperations.validateStudyTreatmentActionTakenValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentActionTaken init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudyTreatmentActionTaken init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyTreatmentActionTakenImpl
