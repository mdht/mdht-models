/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assessment And Plan For Care Planning</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getAssessmentAndPlanForCarePlanning()
 * @model
 * @generated
 */
public interface AssessmentAndPlanForCarePlanning extends
		AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PlanOfCareActivityProcedure) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityProcedure)'"
	 * @generated
	 */
	PlanOfCareActivityProcedure getPlanOfCareActivityProcedure();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::PlanOfCareActivitySubstanceAdministration
	 * ))->asSequence()->any(true
	 * ).oclAsType(consol::PlanOfCareActivitySubstanceAdministration) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)'"
	 * @generated
	 */
	PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not
	 * supply.oclIsUndefined() and
	 * supply.oclIsKindOf(consol::PlanOfCareActivitySupply
	 * ))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)'"
	 * @generated
	 */
	PlanOfCareActivitySupply getPlanOfCareActivitySupply();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssessmentAndPlanForCarePlanning init();
} // AssessmentAndPlanForCarePlanning
