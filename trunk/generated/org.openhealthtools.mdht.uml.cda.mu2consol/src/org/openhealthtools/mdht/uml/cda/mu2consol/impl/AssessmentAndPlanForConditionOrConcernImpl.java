/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanForConditionOrConcernOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
	 * 
	 * @generated
	 */
	protected AssessmentAndPlanForConditionOrConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return AssessmentAndPlanForConditionOrConcernOperations
				.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AssessmentAndPlanForConditionOrConcern init() {
		CDAUtil.init(this);
		return this;
	}
} // AssessmentAndPlanForConditionOrConcernImpl
