/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getVitalSignsSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Vital Signs Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Vital Signs Section BCTPSTemplateId Vital Signs Section BCTPSVital Signs Organizer BCTPS' templateId.root='2.16.840.1.113883.10.20.30.2.5'"
 * @generated
 */
public interface VitalSignsSectionBCTPS extends VitalSignsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Vital Signs Section BCTPSTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.30.2.5\')'"
	 * @generated
	 */
	boolean validateVitalSignsSectionBCTPSTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Vital Signs Section BCTPSVital Signs Organizer BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(clondata::VitalSignsOrganizerBCTPS))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getVital Signs Organizer BCTPS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(clondata::VitalSignsOrganizerBCTPS))->asSequence()->any(true).oclAsType(clondata::VitalSignsOrganizerBCTPS)'"
	 * @generated
	 */
	VitalSignsOrganizerBCTPS getVitalSignsOrganizerBCTPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsSectionBCTPS
