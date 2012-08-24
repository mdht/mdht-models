/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Concomitant Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConcomitantMedicationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationindicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationindication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationActivtyEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activty End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Concomitant Medication Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Concomitant Medication Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getActivtyEndTimingReference() <em>Get Activty End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcomitantMedicationOperations extends SubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcomitantMedicationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.25.19')";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationTemplateId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationTemplateId(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationDoseQuantity(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationEffectiveTime(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationEffectiveTime(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationRouteCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationRouteCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ROUTE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationId(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationId(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationStatusCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationStatusCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationText(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationText(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationMaxDoseQuantity(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_MAX_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationGroupIdentifier(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationGroupIdentifier(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationConcomitantMedicationCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConcomitantMedicationCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationConcomitantMedicationCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConcomitantMedicationCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationConcomitantMedicationCategoryAssociation(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationNonPerformanceReason(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationindicationAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationindication Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationindicationAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationindicationAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationindication Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationindicationAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationindicationAssociation(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONINDICATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationindicationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Consumable Material</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConsumableMaterial(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationConsumableMaterial(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CONSUMABLE_MATERIAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Concomitant Medication Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationConcomitantMedicationSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociation(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationActivityStartTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationActivityStartTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity Start Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationActivityStartTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activity Start Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationActivityStartTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationActivityStartTimingReference(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ACTIVITY_START_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationActivityStartTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationActivtyEndTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activty End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationActivtyEndTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationActivtyEndTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Activty End Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationActivtyEndTimingReference(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationActivtyEndTimingReference(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_ACTIVTY_END_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationActivtyEndTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationPreSpecifiedEvent(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationDataCollection(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationDataCollection(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationStudyDayPeriod(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83232' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Categoryconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORYCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83218' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Concomitant Medication Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Associationconcomitant Medication Category Concomitant Medication Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATIONCONCOMITANT_MEDICATION_CATEGORY_CONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Concomitant Medication Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Category Association Concomitant Medication Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83085' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Concomitant Medication Indication Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_CONCOMITANT_MEDICATION_INDICATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Indication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Indication Association Indication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_INDICATION_ASSOCIATION_INDICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationIndicationAssociationIndication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83232' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medicationconcomitant Medication Sub Category Association Concomitant Medication Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATIONCONCOMITANT_MEDICATION_SUB_CATEGORY_ASSOCIATION_CONCOMITANT_MEDICATION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83232' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Associationintended Regimen Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATIONINTENDED_REGIMEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationTypeCode(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationTypeCode(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Intended Regimen</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Medication Intended Regimen Association Intended Regimen</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(ConcomitantMedication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param concomitantMedication The receiving '<em><b>Concomitant Medication</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(ConcomitantMedication concomitantMedication, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION);
      try
      {
        VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantMedication))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CONCOMITANT_MEDICATION__CONCOMITANT_MEDICATION_INTENDED_REGIMEN_ASSOCIATION_INTENDED_REGIMEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantMedicationIntendedRegimenAssociationIntendedRegimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantMedication, context) }),
             new Object [] { concomitantMedication }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(ConcomitantMedication) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(ConcomitantMedication) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(ConcomitantMedication concomitantMedication)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(110));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(ConcomitantMedication) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(ConcomitantMedication) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(ConcomitantMedication concomitantMedication)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(111));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityStartTimingReference(ConcomitantMedication) <em>Get Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity Start Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity Start Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityStartTimingReference(ConcomitantMedication) <em>Get Activity Start Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ActivityStartTimingReference getActivityStartTimingReference(ConcomitantMedication concomitantMedication)
  {
    if (GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(112));
      try
      {
        GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityStartTimingReference) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivtyEndTimingReference(ConcomitantMedication) <em>Get Activty End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivtyEndTimingReference(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity End Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivtyEndTimingReference(ConcomitantMedication) <em>Get Activty End Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivtyEndTimingReference(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ActivityEndTimingReference getActivtyEndTimingReference(ConcomitantMedication concomitantMedication)
  {
    if (GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(113));
      try
      {
        GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVTY_END_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityEndTimingReference) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(ConcomitantMedication) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(ConcomitantMedication) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(ConcomitantMedication concomitantMedication)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(114));
      try
      {
        GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
    return (PreSpecifiedEvent) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(ConcomitantMedication) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(ConcomitantMedication) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(ConcomitantMedication concomitantMedication)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(115));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(concomitantMedication);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(ConcomitantMedication) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(ConcomitantMedication) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(ConcomitantMedication)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(ConcomitantMedication concomitantMedication)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CONCOMITANT_MEDICATION, SdtmPackage.Literals.CONCOMITANT_MEDICATION.getEAllOperations().get(116));
      try
      {
        GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
    return (StudyDayPeriod) query.evaluate(concomitantMedication);
  }

} // ConcomitantMedicationOperations