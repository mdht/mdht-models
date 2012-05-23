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

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticParameterFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pharmacokinetic Parameter Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PharmacokineticParameterFindingImpl extends ObservationImpl implements PharmacokineticParameterFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PharmacokineticParameterFindingImpl()
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
    return SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return PharmacokineticParameterFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return PharmacokineticParameterFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return PharmacokineticParameterFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return PharmacokineticParameterFindingOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticParameterFinding init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PharmacokineticParameterFindingImpl
