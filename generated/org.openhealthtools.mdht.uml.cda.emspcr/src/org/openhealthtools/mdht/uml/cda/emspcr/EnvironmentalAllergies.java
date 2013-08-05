/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environmental Allergies</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEnvironmentalAllergies()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EnvironmentalAllergiesExistenceOfEnvironmentalAllergy EnvironmentalAllergiesTemplateId' constraints.validation.info='EnvironmentalAllergiesEnvironmentalAllergy' templateId.root='2.16.840.1.1133883.17.3.10.1.49'"
 * @generated
 */
public interface EnvironmentalAllergies extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfEnvironmentalAllergy))'"
	 * @generated
	 */
	boolean validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::EnvironmentalAllergy))'"
	 * @generated
	 */
	boolean validateEnvironmentalAllergiesEnvironmentalAllergy(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.49\')'"
	 * @generated
	 */
	boolean validateEnvironmentalAllergiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfEnvironmentalAllergy))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfEnvironmentalAllergy)'"
	 * @generated
	 */
	ExistenceOfEnvironmentalAllergy getExistenceOfEnvironmentalAllergy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::EnvironmentalAllergy)).oclAsType(emspcr::EnvironmentalAllergy)'"
	 * @generated
	 */
	EList<EnvironmentalAllergy> getEnvironmentalAllergies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalAllergies init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalAllergies init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EnvironmentalAllergies
