/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Organizer V4</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getResultOrganizerV4()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizer2TemplateId ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity ResultOrganizerV4SpecimenSpecimenRole' templateId.root='2.16.840.1.113883.10.20.22.4.1' templateId.extension='2023-05-01' constraints.validation.info='ResultOrganizerV4Specimen' constraints.validation.query='ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity ResultOrganizerV4SpecimenSpecimenRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4Specimen constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4SpecimenSpecimenRole constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultOrganizerV4SpecimenSpecimenRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface ResultOrganizerV4 extends ResultOrganizer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;one(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))'"
	 * @generated
	 */
	boolean validateResultOrganizerV4Specimen(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null).specimenRole-&gt;excluding(null).specimenPlayingEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null).specimenRole-&gt;excluding(null).specimenPlayingEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null).specimenRole-&gt;excluding(null)-&gt;reject(specimenPlayingEntity.oclIsTypeOf(consol::ResultOrganizerV4::Specimen::SpecimenRole::PlayingEntity))'"
	 * @generated
	 */
	boolean validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null)-&gt;reject(specimenRole.oclIsTypeOf(consol::ResultOrganizerV4::Specimen::SpecimenRole))'"
	 * @generated
	 */
	boolean validateResultOrganizerV4SpecimenSpecimenRole(DiagnosticChain diagnostics, Map<Object, Object> context);

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
