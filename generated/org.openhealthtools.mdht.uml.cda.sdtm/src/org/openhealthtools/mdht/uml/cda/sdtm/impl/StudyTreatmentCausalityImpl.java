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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyTreatmentCausalityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Treatment Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyTreatmentCausalityImpl extends ObservationImpl implements StudyTreatmentCausality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTreatmentCausalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_TREATMENT_CAUSALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTreatmentCausalityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTreatmentCausalityOperations.validateStudyTreatmentCausalityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentCausality init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudyTreatmentCausality init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyTreatmentCausalityImpl
