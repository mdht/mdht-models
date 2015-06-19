/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistorySection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistorySectionTemplateId' templateId.root='2.16.840.1.113883.10.20.22.2.15' templateId.extension='2014-06-09' constraints.validation.info='FamilyHistorySectionFamilyHistory'"
 * @generated
 */
public interface FamilyHistorySection2 extends FamilyHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)).oclAsType(consol::FamilyHistoryOrganizer2)'"
	 * @generated
	 */
	EList<FamilyHistoryOrganizer2> getConsolFamilyHistoryOrganizer2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistorySection2
