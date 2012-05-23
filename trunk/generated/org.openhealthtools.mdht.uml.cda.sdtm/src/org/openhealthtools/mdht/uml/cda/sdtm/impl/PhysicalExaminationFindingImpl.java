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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PhysicalExaminationFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Examination Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicalExaminationFindingImpl extends ObservationImpl implements PhysicalExaminationFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhysicalExaminationFindingImpl()
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
    return SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return PhysicalExaminationFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return PhysicalExaminationFindingOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return PhysicalExaminationFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhysicalExaminationFinding init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PhysicalExaminationFindingImpl
