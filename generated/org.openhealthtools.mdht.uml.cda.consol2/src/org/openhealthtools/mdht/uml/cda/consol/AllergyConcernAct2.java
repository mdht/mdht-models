/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Concern Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyConcernAct2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergyProblemActTemplateId AllergyProblemActEffectiveTime AllergyProblemActCode AllergyProblemActAllergyObservation AllergyConcernAct2IVLTSLow AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem' templateId.root='2.16.840.1.113883.10.20.22.4.30' templateId.extension='2014-06-09' constraints.validation.info='AllergyProblemActEffectiveTimeLow AllergyProblemActEffectiveTimeHigh AllergyConcernAct2IVLTSHigh' constraints.validation.warning='AllergyConcernAct2AuthorParticipation' constraints.validation.query='AllergyConcernAct2IVLTSLow AllergyConcernAct2IVLTSHigh AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyConcernAct2IVLTS constraints.validation.error='AllergyConcernAct2IVLTSLow' constraints.validation.info='AllergyConcernAct2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyConcernAct2CD constraints.validation.error='AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem'"
 * @generated
 */
public interface AllergyConcernAct2 extends AllergyProblemAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateAllergyConcernAct2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateAllergyConcernAct2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateAllergyConcernAct2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)).oclAsType(consol::AllergyObservation2)'"
	 * @generated
	 */
	EList<AllergyObservation2> getConsolAllergyObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyConcernAct2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyConcernAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyConcernAct2
