/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDemographicsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDemographicsImpl extends OrganizerImpl implements NonhumanSubjectDemographics
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanSubjectDemographicsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDemographics init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanSubjectDemographics init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanSubjectDemographicsImpl
