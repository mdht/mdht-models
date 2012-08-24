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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySusceptibilityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microbiology Susceptibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MicrobiologySusceptibilityImpl extends ObservationImpl implements MicrobiologySusceptibility
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicrobiologySusceptibilityImpl()
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
    return SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEventStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return MicrobiologySusceptibilityOperations.getEventStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return MicrobiologySusceptibilityOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return MicrobiologySusceptibilityOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return MicrobiologySusceptibilityOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySusceptibility init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MicrobiologySusceptibility init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MicrobiologySusceptibilityImpl
