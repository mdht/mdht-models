/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedures Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId ProceduresSectionEntriesOptionalCode ProceduresSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.7' templateId.extension='2014-06-09' code.code='47519-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='History of Procedures' constraints.validation.dependOn.ProceduresSectionEntriesOptionalCode='ProceduresSectionEntriesOptionalCodeP' constraints.validation.info='ProceduresSectionEntriesOptionalProcedureActivityProcedure ProceduresSectionEntriesOptionalProcedureActivityObservation ProceduresSectionEntriesOptionalProcedureActivityAct'"
 * @generated
 */
public interface ProceduresSectionEntriesOptional2 extends ProceduresSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)'"
	 * @generated
	 */
	EList<ProcedureActivityProcedure2> getConsolProcedureActivityProcedure2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)).oclAsType(consol::ProcedureActivityObservation2)'"
	 * @generated
	 */
	EList<ProcedureActivityObservation2> getConsolProcedureActivityObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)).oclAsType(consol::ProcedureActivityAct2)'"
	 * @generated
	 */
	EList<ProcedureActivityAct2> getConsolProcedureActivityAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProceduresSectionEntriesOptional2
