/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanForCarePlanningOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assessment And Plan For Care Planning</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AssessmentAndPlanForCarePlanningImpl extends
		AssessmentAndPlanSectionImpl implements
		AssessmentAndPlanForCarePlanning {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssessmentAndPlanForCarePlanningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PlanOfCareActivityProcedure getPlanOfCareActivityProcedure() {
		return AssessmentAndPlanForCarePlanningOperations
				.getPlanOfCareActivityProcedure(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration() {
		return AssessmentAndPlanForCarePlanningOperations
				.getPlanOfCareActivitySubstanceAdministration(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PlanOfCareActivitySupply getPlanOfCareActivitySupply() {
		return AssessmentAndPlanForCarePlanningOperations
				.getPlanOfCareActivitySupply(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AssessmentAndPlanForCarePlanning init() {
		CDAUtil.init(this);
		return this;
	}
} // AssessmentAndPlanForCarePlanningImpl
