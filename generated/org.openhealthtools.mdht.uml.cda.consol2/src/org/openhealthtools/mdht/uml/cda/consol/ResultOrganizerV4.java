/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Organizer V4</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getResultOrganizerV4()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerV4TemplateId' templateId.root='2.16.840.1.113883.10.20.22.4.1' templateId.extension='2023-05-01'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4Specimen constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4SpecimenSpecimenRole constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4SpecimenSpecimenRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP'"
 * @generated
 */
public interface ResultOrganizerV4 extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.1\' and id.extension = \'2023-05-01\')'"
	 * @generated
	 */
	boolean validateResultOrganizerV4TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizerV4 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizerV4 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultOrganizerV4
