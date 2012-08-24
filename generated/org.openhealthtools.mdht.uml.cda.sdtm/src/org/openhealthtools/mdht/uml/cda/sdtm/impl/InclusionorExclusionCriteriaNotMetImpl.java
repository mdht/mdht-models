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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.InclusionorExclusionCriteriaNotMetOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InclusionorExclusionCriteriaNotMetImpl extends ObservationImpl implements InclusionorExclusionCriteriaNotMet
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InclusionorExclusionCriteriaNotMetImpl()
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
    return SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return InclusionorExclusionCriteriaNotMetOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InclusionorExclusionCriteriaNotMet init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InclusionorExclusionCriteriaNotMet init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InclusionorExclusionCriteriaNotMetImpl
