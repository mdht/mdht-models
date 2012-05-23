/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

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
  public boolean validateMicrobiologySusceptibilityBaselineIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityBaselineIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySusceptibilityDerivedDataIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityDerivedDataIndicator(this, diagnostics, context);
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
  public boolean validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(this, diagnostics, context);
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
  public BaselineIndicator getBaselineIndicator()
  {
    return MicrobiologySusceptibilityOperations.getBaselineIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedDataIndicator getDerivedDataIndicator()
  {
    return MicrobiologySusceptibilityOperations.getDerivedDataIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySusceptibility init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MicrobiologySusceptibilityImpl
