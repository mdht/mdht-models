/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medications Administered Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationsAdministeredSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationsAdministeredSectionTemplateId MedicationsAdministeredSectionCode MedicationsAdministeredSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.38' templateId.extension='2014-06-09' code.code='29549-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Medications Administered' constraints.validation.dependOn.MedicationsAdministeredSectionCode='MedicationsAdministeredSectionCodeP' constraints.validation.info='MedicationsAdministeredSectionMedicationActivity'"
 * @generated
 */
public interface MedicationsAdministeredSection2 extends MedicationsAdministeredSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)'"
	 * @generated
	 */
	EList<MedicationActivity2> getConsolMedicationActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationsAdministeredSection2
