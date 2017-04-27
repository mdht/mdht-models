/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planof Care Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getPlanofCareSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan of Care Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Plan of Care Section BCTPSTemplateId' templateId.root='2.16.840.1.113883.10.20.30.2.6'"
 * @generated
 */
public interface PlanofCareSectionBCTPS extends PlanOfCareSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getChemotherapy Regimen Plans'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(clondata::ChemotherapyRegimenPlans))->asSequence()->any(true).oclAsType(clondata::ChemotherapyRegimenPlans)'"
	 * @generated
	 */
	ChemotherapyRegimenPlans getChemotherapyRegimenPlans();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getPlan of Care Activity Reconstruction Procedure'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(clondata::PlanofCareActivityReconstructionProcedure))->asSequence()->any(true).oclAsType(clondata::PlanofCareActivityReconstructionProcedure)'"
	 * @generated
	 */
	PlanofCareActivityReconstructionProcedure getPlanofCareActivityReconstructionProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getPlan of Care Radiation Activity'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::PlanofCareRadiationActivity))->asSequence()->any(true).oclAsType(clondata::PlanofCareRadiationActivity)'"
	 * @generated
	 */
	PlanofCareRadiationActivity getPlanofCareRadiationActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanofCareSectionBCTPS
