/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Indications Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureIndicationsSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureIndicationsSectionTemplateId ProcedureIndicationsSectionCode ProcedureIndicationsSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.29' templateId.extension='2014-06-09' constraints.validation.dependOn.ProcedureIndicationsSectionCode='ProcedureIndicationsSectionCodeP' constraints.validation.info='ProcedureIndicationsSectionIndication'"
 * @generated
 */
public interface ProcedureIndicationsSection2 extends ProcedureIndicationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getConsolIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureIndicationsSection2
