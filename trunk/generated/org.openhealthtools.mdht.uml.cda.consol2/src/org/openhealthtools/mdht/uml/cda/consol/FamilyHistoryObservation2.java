/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistoryObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistoryObservationTemplateId FamilyHistoryObservationCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.46' templateId.extension='2014-06-09' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='FamilyHistoryObservationCode' constraints.validation.dependOn.FamilyHistoryObservationCode='FamilyHistoryObservationCodeP'"
 * @generated
 */
public interface FamilyHistoryObservation2 extends FamilyHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryObservation2
