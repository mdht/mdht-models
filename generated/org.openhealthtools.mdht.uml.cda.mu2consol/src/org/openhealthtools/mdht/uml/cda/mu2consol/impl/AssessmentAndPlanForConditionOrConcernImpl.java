/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanForConditionOrConcernOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assessment And Plan For Condition Or Concern</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanForConditionOrConcernImpl extends
		AssessmentAndPlanSectionImpl implements
		AssessmentAndPlanForConditionOrConcern {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanForConditionOrConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanForConditionOrConcernProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanForConditionOrConcernOperations.validateAssessmentAndPlanForConditionOrConcernProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return AssessmentAndPlanForConditionOrConcernOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanForConditionOrConcern init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssessmentAndPlanForConditionOrConcern init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AssessmentAndPlanForConditionOrConcernImpl
