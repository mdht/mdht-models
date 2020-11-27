/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Concern Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyConcernAct2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergyConcernAct2TemplateId AllergyProblemActCode AllergyProblemActAllergyObservation AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem' templateId.root='2.16.840.1.113883.10.20.22.4.30' templateId.extension='2015-08-01' constraints.validation.warning='AllergyConcernAct2AuthorParticipation' constraints.validation.query='AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyConcernAct2CD constraints.validation.error='AllergyProblemActCDCodeAndCodeSystemValues AllergyProblemActCDCode AllergyProblemActCDCodeSystem'"
 *        annotation="duplicates"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.30\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyConcernAct2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateAllergyConcernAct2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation2)).oclAsType(consol::AllergyObservation2)'"
	 * @generated
	 */
	EList<AllergyObservation2> getConsolAllergyObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyConcernAct2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyConcernAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyConcernAct2
