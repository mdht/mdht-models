/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Observation V4</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getResultObservationV4()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservation2TemplateId ResultObservationV4SpecimenSpecimenRolePlayingEntityCode ResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP ResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity ResultObservationV4SpecimenSpecimenRole' templateId.root='2.16.840.1.113883.10.20.22.4.2' templateId.extension='2023-05-01' constraints.validation.info='ResultObservationV4Specimen' constraints.validation.query='ResultObservationV4SpecimenSpecimenRolePlayingEntityCode ResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP ResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity ResultObservationV4SpecimenSpecimenRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultObservationV4Specimen constraints.validation.error='ResultObservationV4SpecimenSpecimenRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultObservationV4SpecimenSpecimenRole constraints.validation.error='ResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultObservationV4SpecimenSpecimenRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.error='ResultObservationV4SpecimenSpecimenRolePlayingEntityCode ResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface ResultObservationV4 extends ResultObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;exists(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))'"
	 * @generated
	 */
	boolean validateResultObservationV4Specimen(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(DiagnosticChain diagnostics,
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
	boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null).specimenRole-&gt;excluding(null)-&gt;reject(specimenPlayingEntity-&gt;one(specimenPlayingEntity : cda::PlayingEntity | not specimenPlayingEntity.oclIsUndefined() and specimenPlayingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specimen-&gt;excluding(null)-&gt;reject(specimenRole-&gt;one(specimenRole : cda::SpecimenRole | not specimenRole.oclIsUndefined() and specimenRole.oclIsKindOf(cda::SpecimenRole)))'"
	 * @generated
	 */
	boolean validateResultObservationV4SpecimenSpecimenRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservationV4 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservationV4 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultObservationV4
