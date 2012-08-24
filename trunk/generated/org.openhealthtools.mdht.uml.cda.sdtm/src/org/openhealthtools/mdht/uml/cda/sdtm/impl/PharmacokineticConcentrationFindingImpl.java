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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
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
  public boolean validatePharmacokineticConcentrationFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingInterpretationCode(this, diagnostics, context);
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
  public boolean validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(this, diagnostics, context);
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
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(this, diagnostics, context);
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
  public boolean validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(this, diagnostics, context);
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
  public PlannedStudyDay getPlannedStudyDay()
  {
    return PharmacokineticConcentrationFindingOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return PharmacokineticConcentrationFindingOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticConcentrationFinding init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PharmacokineticConcentrationFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PharmacokineticConcentrationFindingImpl
