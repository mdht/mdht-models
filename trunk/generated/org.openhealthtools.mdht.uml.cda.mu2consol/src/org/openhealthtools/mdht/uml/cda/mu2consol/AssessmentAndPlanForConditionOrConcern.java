/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assessment And Plan For Condition Or Concern</b></em>'. <!--
 * end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getAssessmentAndPlanForConditionOrConcern()
 * @model
 * @generated
 */
public interface AssessmentAndPlanForConditionOrConcern extends
		AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::ProblemObservation
	 * ))->asSequence()->any(true).oclAsType(consol::ProblemObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation))->asSequence()->any(true).oclAsType(consol::ProblemObservation)'"
	 * @generated
	 */
	ProblemObservation getProblemObservation();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentAndPlanForConditionOrConcern init();
} // AssessmentAndPlanForConditionOrConcern
