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

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSDrugAllergy()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSDrugAllergyParticipant1 EMSDrugAllergyTemplateId' templateId.root='2.16.840.1.1133883.17.3.10.1.48'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDrugAllergyDrugAllergyParticipation constraints.validation.error='EMSDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRole constraints.validation.error='EMSDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntity code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='EMSDrugAllergyDrugAllergyParticipationDrugAllergyParticipantRoleDrugAllergyEntityCode'"
 * @generated
 */
public interface EMSDrugAllergy extends Act
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
   * @generated
   */
  boolean validateEMSDrugAllergyParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.48\')'"
   * @generated
   */
  boolean validateEMSDrugAllergyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSDrugAllergy init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSDrugAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSDrugAllergy
