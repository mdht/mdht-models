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
 * A representation of the model object '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getNonDrugAllergyOrganizerActuallyDreg()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='NonDrugAllergyOrganizerActuallyDregEMSDrugAllergy' constraints.validation.error='NonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation'"
 * @generated
 */
public interface NonDrugAllergyOrganizerActuallyDreg extends Organizer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(emspcr::EMSDrugAllergy))'"
   * @generated
   */
  boolean validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))'"
   * @generated
   */
  boolean validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(emspcr::EMSDrugAllergy)).oclAsType(emspcr::EMSDrugAllergy)'"
   * @generated
   */
  EList<EMSDrugAllergy> getEMSDrugAllergies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)'"
   * @generated
   */
  ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonDrugAllergyOrganizerActuallyDreg init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonDrugAllergyOrganizerActuallyDreg init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NonDrugAllergyOrganizerActuallyDreg
