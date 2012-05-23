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

import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticConcentrationFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pharmacokinetic Concentration Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PharmacokineticConcentrationFindingImpl extends ObservationImpl implements PharmacokineticConcentrationFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PharmacokineticConcentrationFindingImpl()
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
    return SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingDerivedDataIndicator(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingDerivedDataIndicator(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePPharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePPharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCodePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValuePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValuePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return PharmacokineticConcentrationFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return PharmacokineticConcentrationFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return PharmacokineticConcentrationFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedDataIndicator getDerivedDataIndicator()
  {
    return PharmacokineticConcentrationFindingOperations.getDerivedDataIndicator(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticConcentrationFinding init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PharmacokineticConcentrationFindingImpl
