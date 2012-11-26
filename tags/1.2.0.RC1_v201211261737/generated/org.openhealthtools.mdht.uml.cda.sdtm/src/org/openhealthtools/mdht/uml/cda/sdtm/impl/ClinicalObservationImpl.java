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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClinicalObservationImpl extends ObservationImpl implements ClinicalObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalObservationImpl()
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
    return SdtmPackage.Literals.CLINICAL_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationClinicalObservationCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationClinicalObservationCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationClinicalObservationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationClinicalObservationSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationClinicalObservationResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationClinicalObservationResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationMassIdentification(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return ClinicalObservationOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return ClinicalObservationOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return ClinicalObservationOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return ClinicalObservationOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return ClinicalObservationOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return ClinicalObservationOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return ClinicalObservationOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return ClinicalObservationOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalObservation init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClinicalObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ClinicalObservationImpl
