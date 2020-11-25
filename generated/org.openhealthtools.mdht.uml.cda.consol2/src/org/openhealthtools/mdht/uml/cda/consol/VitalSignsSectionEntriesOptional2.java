/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsSectionEntriesOptionalTemplateId VitalSignsSectionEntriesOptionalCode VitalSignsSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.4' templateId.extension='2015-08-01' constraints.validation.dependOn.VitalSignsSectionEntriesOptionalCode='VitalSignsSectionEntriesOptionalCodeP' constraints.validation.warning='VitalSignsSectionEntriesOptionalVitalSignsOrganizer'"
 *        annotation="duplicates"
 * @generated
 */
public interface VitalSignsSectionEntriesOptional2 extends VitalSignsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()-&gt;select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer2)).oclAsType(consol::VitalSignsOrganizer2)'"
	 * @generated
	 */
	EList<VitalSignsOrganizer2> getConsolVitalSignsOrganizer2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VitalSignsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsSectionEntriesOptional2
