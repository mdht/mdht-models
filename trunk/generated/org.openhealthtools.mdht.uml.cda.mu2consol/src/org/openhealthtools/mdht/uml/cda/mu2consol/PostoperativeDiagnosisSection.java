/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Postoperative Diagnosis Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getPostoperativeDiagnosisSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolPostoperativeDiagnosisSectionTemplateId Mu2consolPostoperativeDiagnosisSectionProblemObservation' templateId.root='2.16.840.1.113883.10.20.22.2.35'"
 * @generated
 */
public interface PostoperativeDiagnosisSection extends
		org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::ProblemObservation))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation))'"
	 * @generated
	 */
	boolean validateMu2consolPostoperativeDiagnosisSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::ProblemObservation
	 * ))->asSequence()->any(true).oclAsType(consol::ProblemObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation))->asSequence()->any(true).oclAsType(consol::ProblemObservation)'"
	 * @generated
	 */
	ProblemObservation getProblemObservation();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public PostoperativeDiagnosisSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // PostoperativeDiagnosisSection