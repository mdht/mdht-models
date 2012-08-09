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

import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan For Condition Or Concern</b></em>'
 * model objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern#getProblemObservation()
 * <em>Get Problem Observation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssessmentAndPlanForConditionOrConcernOperations extends
		AssessmentAndPlanSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssessmentAndPlanForConditionOrConcernOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getProblemObservation(AssessmentAndPlanForConditionOrConcern)
	 * <em>Get Problem Observation</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProblemObservation(AssessmentAndPlanForConditionOrConcern)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation))->asSequence()->any(true).oclAsType(consol::ProblemObservation)";

	/**
	 * The cached OCL query for the '
	 * {@link #getProblemObservation(AssessmentAndPlanForConditionOrConcern)
	 * <em>Get Problem Observation</em>}' query operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getProblemObservation(AssessmentAndPlanForConditionOrConcern)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::ProblemObservation
	 * ))->asSequence()->any(true).oclAsType(consol::ProblemObservation)
	 * 
	 * @param assessmentAndPlanForConditionOrConcern
	 *            The receiving '
	 *            <em><b>Assessment And Plan For Condition Or Concern</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemObservation getProblemObservation(
			AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern) {
		if (GET_PROBLEM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN,
					Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN
							.getEAllOperations().get(60));
			try {
				GET_PROBLEM_OBSERVATION__EOCL_QRY = helper
						.createQuery(GET_PROBLEM_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_PROBLEM_OBSERVATION__EOCL_QRY);
		return (ProblemObservation) query
				.evaluate(assessmentAndPlanForConditionOrConcern);
	}

} // AssessmentAndPlanForConditionOrConcernOperations