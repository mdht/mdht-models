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

import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.DrugAccountabilityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug Accountability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DrugAccountabilityImpl extends ObservationImpl implements DrugAccountability
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DrugAccountabilityImpl()
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
    return SdtmPackage.Literals.DRUG_ACCOUNTABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityDrugAccountabilityCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilityEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilityEventStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return DrugAccountabilityOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return DrugAccountabilityOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return DrugAccountabilityOperations.getEventStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrugAccountability init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DrugAccountability init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DrugAccountabilityImpl
