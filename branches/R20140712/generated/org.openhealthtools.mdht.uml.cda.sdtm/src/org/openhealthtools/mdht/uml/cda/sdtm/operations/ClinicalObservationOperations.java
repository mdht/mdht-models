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
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

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
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Clinical Observation Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Clinical Observation Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalObservationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationTemplateId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTemplateId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.45')";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationTemplateId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTemplateId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationTemplateId(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationClassCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationId(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationId(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationMoodCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationValue(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationStatusCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationStatusCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationStatusCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationStatusCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationStatusCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationTargetSiteCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTargetSiteCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationTargetSiteCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTargetSiteCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationTargetSiteCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationInterpretationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationInterpretationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationInterpretationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationInterpretationCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationInterpretationCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationGroupIdentifier(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationGroupIdentifier(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationGroupIdentifier(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationGroupIdentifier(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationGroupIdentifier(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationClinicalObservationCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationClinicalObservationCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationClinicalObservationCategoryAssociation(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationClinicalObservationCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationClinicalObservationSubCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationSubCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationClinicalObservationSubCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationSubCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationClinicalObservationSubCategoryAssociation(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationClinicalObservationSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationBodySystemorOrganClass(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationBodySystemorOrganClass(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationBodySystemorOrganClass(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationBodySystemorOrganClass(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationBodySystemorOrganClass(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationNonPerformanceReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationNonPerformanceReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationNonPerformanceReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationNonPerformanceReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationNonPerformanceReason(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationEventSeverity(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationEventSeverity(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationEventSeverity(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationEventSeverity(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationEventSeverity(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationPlannedStudyDay(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationPlannedStudyDay(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationPlannedStudyDay(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationPlannedStudyDay(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationPlannedStudyDay(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationDataCollection(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationDataCollection(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationDataCollection(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationDataCollection(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationDataCollection(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationTimingReference(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTimingReference(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationTimingReference(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationTimingReference(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationTimingReference(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationClinicalObservationResultCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationResultCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationClinicalObservationResultCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationClinicalObservationResultCategoryAssociation(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationClinicalObservationResultCategoryAssociation(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationClinicalObservationResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationMassIdentification(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mass Identification</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationMassIdentification(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::Mass Identification))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationMassIdentification(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mass Identification</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationMassIdentification(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationMassIdentification(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_MASS_IDENTIFICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationExclusionReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationExclusionReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationExclusionReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Exclusion Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationExclusionReason(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationExclusionReason(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATION_EXCLUSION_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83232' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Clinical Observation Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Clinical Observation Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Clinical Observation Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Clinical Observation Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(ClinicalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param clinicalObservation The receiving '<em><b>Clinical Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(ClinicalObservation clinicalObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.CLINICAL_OBSERVATION);
      try
      {
        VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.CLINICAL_OBSERVATION__CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalObservation, context) }),
             new Object [] { clinicalObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(ClinicalObservation) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(ClinicalObservation) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(ClinicalObservation clinicalObservation)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(86));
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
    return (GroupIdentifier) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(ClinicalObservation) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(ClinicalObservation) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(ClinicalObservation clinicalObservation)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(87));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(ClinicalObservation) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(ClinicalObservation) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(ClinicalObservation clinicalObservation)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(88));
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
    return (NonPerformanceReason) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(ClinicalObservation) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->any(true).oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(ClinicalObservation) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(ClinicalObservation clinicalObservation)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(89));
      try
      {
        GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
    return (EventSeverity) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(ClinicalObservation) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(ClinicalObservation) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(ClinicalObservation clinicalObservation)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(90));
      try
      {
        GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
    return (PlannedStudyDay) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(ClinicalObservation) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(ClinicalObservation) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(ClinicalObservation clinicalObservation)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(91));
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
    return (DataCollection) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(ClinicalObservation) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(ClinicalObservation) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(ClinicalObservation clinicalObservation)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(92));
      try
      {
        GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
    return (TimingReference) query.evaluate(clinicalObservation);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionReason(ClinicalObservation) <em>Get Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionReason(ClinicalObservation) <em>Get Exclusion Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(ClinicalObservation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionReason(ClinicalObservation clinicalObservation)
  {
    if (GET_EXCLUSION_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.CLINICAL_OBSERVATION, SdtmPackage.Literals.CLINICAL_OBSERVATION.getEAllOperations().get(93));
      try
      {
        GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
    return (ExclusionReason) query.evaluate(clinicalObservation);
  }

} // ClinicalObservationOperations