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
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConcomitantMedicationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concomitant Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConcomitantMedicationImpl extends SubstanceAdministrationImpl implements ConcomitantMedication
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcomitantMedicationImpl()
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
    return SdtmPackage.Literals.CONCOMITANT_MEDICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationConcomitantMedicationCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationConcomitantMedicationCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationindicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationindicationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationConsumableMaterial(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationActivityStartTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationActivityStartTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationActivtyEndTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationActivtyEndTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return ConcomitantMedicationOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return ConcomitantMedicationOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityStartTimingReference getActivityStartTimingReference()
  {
    return ConcomitantMedicationOperations.getActivityStartTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference getActivtyEndTimingReference()
  {
    return ConcomitantMedicationOperations.getActivtyEndTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return ConcomitantMedicationOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return ConcomitantMedicationOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return ConcomitantMedicationOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcomitantMedication init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcomitantMedication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ConcomitantMedicationImpl
