/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deceased Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getDeceasedObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DeceasedObservationTemplateId DeceasedObservationCode DeceasedObservationCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.79' templateId.extension='2015-08-01' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.DeceasedObservationCode='DeceasedObservationCodeP' constraints.validation.warning='DeceasedObservationProblemObservation'"
 * @generated
 */
public interface DeceasedObservation2 extends DeceasedObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2))->asSequence()->any(true).oclAsType(consol::ProblemObservation2)'"
	 * @generated
	 */
	ProblemObservation2 getConsolProblemObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DeceasedObservation2
