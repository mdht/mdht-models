/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getFunctionalStatusSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Functional Status Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Functional Status Section BCTPSTemplateId' templateId.root='2.16.840.1.113883.10.20.30.2.8'"
 * @generated
 */
public interface FunctionalStatusSectionBCTPS extends FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getNeurotoxicity Impairment of ADLs'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::NeurotoxicityImpairmentofADLs))->asSequence()->any(true).oclAsType(clondata::NeurotoxicityImpairmentofADLs)'"
	 * @generated
	 */
	NeurotoxicityImpairmentofADLs getNeurotoxicityImpairmentofADLs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSectionBCTPS
