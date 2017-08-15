/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Procedure Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlannedProcedureSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlannedProcedureSectionTemplateId PlannedProcedureSectionCode PlannedProcedureSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.30' templateId.extension='2014-06-09' constraints.validation.dependOn.PlannedProcedureSectionCode='PlannedProcedureSectionCodeP' constraints.validation.info='PlannedProcedureSectionPlanOfCareActivityProcedure'"
 * @generated
 */
public interface PlannedProcedureSection2 extends PlannedProcedureSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)).oclAsType(consol::PlannedProcedure2)'"
	 * @generated
	 */
	EList<PlannedProcedure2> getConsolPlannedProcedure2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlannedProcedureSection2
