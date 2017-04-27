/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyFindingEvaluatorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Finding Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StudyFindingEvaluatorImpl extends org.eclipse.mdht.uml.cda.impl.Participant2Impl implements StudyFindingEvaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyFindingEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_FINDING_EVALUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyFindingEvaluatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyFindingEvaluatorOperations.validateStudyFindingEvaluatorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyFindingEvaluatorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyFindingEvaluatorOperations.validateStudyFindingEvaluatorTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyFindingEvaluatorRoleOfEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyFindingEvaluatorOperations.validateStudyFindingEvaluatorRoleOfEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyFindingEvaluator init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudyFindingEvaluator init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyFindingEvaluatorImpl
