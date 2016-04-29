/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Functional Status Result Organizer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getFunctionalStatusResultOrganizer()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId' templateId.root='2.16.840.1.113883.10.20.22.4.66'"
 * @generated
 */
public interface FunctionalStatusResultOrganizer
		extends org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer, ResultOrganizer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::FunctionalStatusResultObservation)).oclAsType(mu2consol::FunctionalStatusResultObservation)'"
	 * @generated
	 */
	EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalStatusResultOrganizer init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalStatusResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusResultOrganizer
