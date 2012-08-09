/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan For Care Planning</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivityProcedure()
 * <em>Get Plan Of Care Activity Procedure</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivitySubstanceAdministration()
 * <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivitySupply()
 * <em>Get Plan Of Care Activity Supply</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssessmentAndPlanForCarePlanningOperations extends
		AssessmentAndPlanSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssessmentAndPlanForCarePlanningOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPlanOfCareActivityProcedure(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Procedure</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivityProcedure(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityProcedure)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPlanOfCareActivityProcedure(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Procedure</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivityProcedure(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PlanOfCareActivityProcedure)
	 * 
	 * @param assessmentAndPlanForCarePlanning
	 *            The receiving '
	 *            <em><b>Assessment And Plan For Care Planning</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivityProcedure getPlanOfCareActivityProcedure(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning) {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING,
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING
							.getEAllOperations().get(60));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY = helper
						.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY);
		return (PlanOfCareActivityProcedure) query
				.evaluate(assessmentAndPlanForCarePlanning);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Substance Administration</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Substance Administration</em>}' query
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::PlanOfCareActivitySubstanceAdministration
	 * ))->asSequence()->any(true
	 * ).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)
	 * 
	 * @param assessmentAndPlanForCarePlanning
	 *            The receiving '
	 *            <em><b>Assessment And Plan For Care Planning</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING,
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING
							.getEAllOperations().get(61));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper
						.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		return (PlanOfCareActivitySubstanceAdministration) query
				.evaluate(assessmentAndPlanForCarePlanning);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPlanOfCareActivitySupply(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Supply</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySupply(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPlanOfCareActivitySupply(AssessmentAndPlanForCarePlanning)
	 * <em>Get Plan Of Care Activity Supply</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySupply(AssessmentAndPlanForCarePlanning)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not
	 * supply.oclIsUndefined() and
	 * supply.oclIsKindOf(consol::PlanOfCareActivitySupply
	 * ))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)
	 * 
	 * @param assessmentAndPlanForCarePlanning
	 *            The receiving '
	 *            <em><b>Assessment And Plan For Care Planning</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivitySupply getPlanOfCareActivitySupply(
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING,
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING
							.getEAllOperations().get(62));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY = helper
						.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY);
		return (PlanOfCareActivitySupply) query
				.evaluate(assessmentAndPlanForCarePlanning);
	}

} // AssessmentAndPlanForCarePlanningOperations