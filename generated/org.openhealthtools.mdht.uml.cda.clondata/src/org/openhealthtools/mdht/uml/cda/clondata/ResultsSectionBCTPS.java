/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getResultsSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Results Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Results Section BCTPSTemplateId' templateId.root='2.16.840.1.113883.10.20.30.2.2'"
 * @generated
 */
public interface ResultsSectionBCTPS extends ResultsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getReceptor Status Organizer'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(clondata::ReceptorStatusOrganizer))->asSequence()->any(true).oclAsType(clondata::ReceptorStatusOrganizer)'"
	 * @generated
	 */
	ReceptorStatusOrganizer getReceptorStatusOrganizer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getCardiac Function Observation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::CardiacFunctionObservation))->asSequence()->any(true).oclAsType(clondata::CardiacFunctionObservation)'"
	 * @generated
	 */
	CardiacFunctionObservation getCardiacFunctionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultsSectionBCTPS
