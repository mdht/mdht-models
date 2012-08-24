/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPlugin;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Visit</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalAdverseEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Adverse Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitConcommitantMedicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Concommitant Medication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitInclusionorExclusionCriteriaNotMet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Inclusionor Exclusion Criteria Not Met</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitSubstanceUseAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Substance Use Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySusceptibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitDrugAccountability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalAdverseEvents() <em>Get Human Clinical Adverse Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalVitalSigns() <em>Get Human Clinical Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getInclusionorExclusionCriteriaNotMets() <em>Get Inclusionor Exclusion Criteria Not Mets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getLaboratoryTestResults() <em>Get Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPhysicalExaminations() <em>Get Physical Examinations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySpecimen() <em>Get Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySusceptibility() <em>Get Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPharmacokineticConcentrationFinding() <em>Get Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getFindingAbout() <em>Get Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getDrugAccountability() <em>Get Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisitOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisitOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.18')";

  /**
   * The cached OCL invariant for the '{@link #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitTemplateId(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_TEMPLATE_ID,
             SdtmPlugin.INSTANCE.getString("VisitTemplateId"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

  /**
   * The cached OCL invariant for the '{@link #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitClassCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_CLASS_CODE,
             SdtmPlugin.INSTANCE.getString("VisitClassCode"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_CODE,
             SdtmPlugin.INSTANCE.getString("VisitCode"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitEffectiveTime(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_EFFECTIVE_TIME,
             SdtmPlugin.INSTANCE.getString("VisitEffectiveTime"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentEncounterMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitMoodCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_MOOD_CODE,
             SdtmPlugin.INSTANCE.getString("VisitMoodCode"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitText(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_TEXT,
             SdtmPlugin.INSTANCE.getString("VisitText"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitId(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_ID,
             SdtmPlugin.INSTANCE.getString("VisitId"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitHumanClinicalAdverseEvent(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Adverse Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitHumanClinicalAdverseEvent(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Adverse Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitHumanClinicalAdverseEvent(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Adverse Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitHumanClinicalAdverseEvent(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitHumanClinicalAdverseEvent(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_HUMAN_CLINICAL_ADVERSE_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitHumanClinicalAdverseEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Vital Sign) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitHumanClinicalVitalSign(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_HUMAN_CLINICAL_VITAL_SIGN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitHumanClinicalVitalSign", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitPlannedStudyDay(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitConcommitantMedicationAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Concommitant Medication Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitConcommitantMedicationAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitConcommitantMedicationAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Concommitant Medication Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitConcommitantMedicationAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitConcommitantMedicationAssociation(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION,
             SdtmPlugin.INSTANCE.getString("VisitConcommitantMedicationAssociation"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ECG Test Result) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitECGTestResult(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_ECG_TEST_RESULT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitECGTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitInclusionorExclusionCriteriaNotMet(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Inclusionor Exclusion Criteria Not Met</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitInclusionorExclusionCriteriaNotMet(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Inclusion or Exclusion Criteria Not Met) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitInclusionorExclusionCriteriaNotMet(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Inclusionor Exclusion Criteria Not Met</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitInclusionorExclusionCriteriaNotMet(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitInclusionorExclusionCriteriaNotMet(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitInclusionorExclusionCriteriaNotMet", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Laboratory Test Result</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non-human Laboratory Test Result) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Laboratory Test Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitLaboratoryTestResult(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_LABORATORY_TEST_RESULT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitLaboratoryTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Physical Examination Finding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitPhysicalExamination(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_PHYSICAL_EXAMINATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitPhysicalExamination", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitSubstanceUseAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Substance Use Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitSubstanceUseAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitSubstanceUseAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Substance Use Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitSubstanceUseAssociation(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitSubstanceUseAssociation(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_SUBSTANCE_USE_ASSOCIATION,
             SdtmPlugin.INSTANCE.getString("VisitSubstanceUseAssociation"),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Microbiology Specimen Finding))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitMicrobiologySpecimen(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_MICROBIOLOGY_SPECIMEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitMicrobiologySpecimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Microbiology Susceptibility))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitMicrobiologySusceptibility(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_MICROBIOLOGY_SUSCEPTIBILITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitMicrobiologySusceptibility", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pharmacokinetic Concentration Finding))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitPharmacokineticConcentrationFinding(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitPharmacokineticConcentrationFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Finding About))";

  /**
   * The cached OCL invariant for the '{@link #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitFindingAbout(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_FINDING_ABOUT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Drug Accountability) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitDrugAccountability(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_DRUG_ACCOUNTABILITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitDrugAccountability", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param visit The receiving '<em><b>Visit</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateVisitStudyDayPeriod(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.VISIT);
      try
      {
        VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(visit))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.VISIT__VISIT_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
             new Object [] { visit }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalAdverseEvents(Visit) <em>Get Human Clinical Adverse Events</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalAdverseEvents(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Adverse Event)).oclAsType(sdtm::Adverse Event)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalAdverseEvents(Visit) <em>Get Human Clinical Adverse Events</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalAdverseEvents(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<AdverseEvent> getHumanClinicalAdverseEvents(Visit visit)
  {
    if (GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(73));
      try
      {
        GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_ADVERSE_EVENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AdverseEvent> result = (Collection<AdverseEvent>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<AdverseEvent>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalVitalSigns(Visit) <em>Get Human Clinical Vital Signs</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalVitalSigns(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Vital Sign)).oclAsType(sdtm::Vital Sign)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalVitalSigns(Visit) <em>Get Human Clinical Vital Signs</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalVitalSigns(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<VitalSign> getHumanClinicalVitalSigns(Visit visit)
  {
    if (GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(74));
      try
      {
        GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<VitalSign> result = (Collection<VitalSign>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<VitalSign>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(Visit) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(Visit) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(Visit visit)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(75));
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
    return (PlannedStudyDay) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getECGTestResults(Visit) <em>Get ECG Test Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_ECG_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECG Test Result)).oclAsType(sdtm::ECG Test Result)";

  /**
   * The cached OCL query for the '{@link #getECGTestResults(Visit) <em>Get ECG Test Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ECG_TEST_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<ECGTestResult> getECGTestResults(Visit visit)
  {
    if (GET_ECG_TEST_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(76));
      try
      {
        GET_ECG_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_ECG_TEST_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ECG_TEST_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ECGTestResult> result = (Collection<ECGTestResult>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<ECGTestResult>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getInclusionorExclusionCriteriaNotMets(Visit) <em>Get Inclusionor Exclusion Criteria Not Mets</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusionorExclusionCriteriaNotMets(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Inclusion or Exclusion Criteria Not Met)).oclAsType(sdtm::Inclusion or Exclusion Criteria Not Met)";

  /**
   * The cached OCL query for the '{@link #getInclusionorExclusionCriteriaNotMets(Visit) <em>Get Inclusionor Exclusion Criteria Not Mets</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusionorExclusionCriteriaNotMets(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<InclusionorExclusionCriteriaNotMet> getInclusionorExclusionCriteriaNotMets(Visit visit)
  {
    if (GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(77));
      try
      {
        GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY = helper.createQuery(GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<InclusionorExclusionCriteriaNotMet> result = (Collection<InclusionorExclusionCriteriaNotMet>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<InclusionorExclusionCriteriaNotMet>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getLaboratoryTestResults(Visit) <em>Get Laboratory Test Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaboratoryTestResults(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_LABORATORY_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non-human Laboratory Test Result)).oclAsType(sdtm::Non-human Laboratory Test Result)";

  /**
   * The cached OCL query for the '{@link #getLaboratoryTestResults(Visit) <em>Get Laboratory Test Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaboratoryTestResults(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LABORATORY_TEST_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<NonhumanLaboratoryTestResult> getLaboratoryTestResults(Visit visit)
  {
    if (GET_LABORATORY_TEST_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(78));
      try
      {
        GET_LABORATORY_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_LABORATORY_TEST_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LABORATORY_TEST_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<NonhumanLaboratoryTestResult> result = (Collection<NonhumanLaboratoryTestResult>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<NonhumanLaboratoryTestResult>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPhysicalExaminations(Visit) <em>Get Physical Examinations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalExaminations(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_PHYSICAL_EXAMINATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Physical Examination Finding)).oclAsType(sdtm::Physical Examination Finding)";

  /**
   * The cached OCL query for the '{@link #getPhysicalExaminations(Visit) <em>Get Physical Examinations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalExaminations(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<PhysicalExaminationFinding> getPhysicalExaminations(Visit visit)
  {
    if (GET_PHYSICAL_EXAMINATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(79));
      try
      {
        GET_PHYSICAL_EXAMINATIONS__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PhysicalExaminationFinding> result = (Collection<PhysicalExaminationFinding>) query.evaluate(visit);
    return new BasicEList.UnmodifiableEList<PhysicalExaminationFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getMicrobiologySpecimen(Visit) <em>Get Microbiology Specimen</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicrobiologySpecimen(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_MICROBIOLOGY_SPECIMEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Microbiology Specimen Finding))->asSequence()->any(true).oclAsType(sdtm::Microbiology Specimen Finding)";

  /**
   * The cached OCL query for the '{@link #getMicrobiologySpecimen(Visit) <em>Get Microbiology Specimen</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicrobiologySpecimen(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  MicrobiologySpecimenFinding getMicrobiologySpecimen(Visit visit)
  {
    if (GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(80));
      try
      {
        GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY = helper.createQuery(GET_MICROBIOLOGY_SPECIMEN__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY);
    return (MicrobiologySpecimenFinding) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getMicrobiologySusceptibility(Visit) <em>Get Microbiology Susceptibility</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicrobiologySusceptibility(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Microbiology Susceptibility))->asSequence()->any(true).oclAsType(sdtm::Microbiology Susceptibility)";

  /**
   * The cached OCL query for the '{@link #getMicrobiologySusceptibility(Visit) <em>Get Microbiology Susceptibility</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicrobiologySusceptibility(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  MicrobiologySusceptibility getMicrobiologySusceptibility(Visit visit)
  {
    if (GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(81));
      try
      {
        GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY = helper.createQuery(GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY);
    return (MicrobiologySusceptibility) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getPharmacokineticConcentrationFinding(Visit) <em>Get Pharmacokinetic Concentration Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticConcentrationFinding(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pharmacokinetic Concentration Finding))->asSequence()->any(true).oclAsType(sdtm::Pharmacokinetic Concentration Finding)";

  /**
   * The cached OCL query for the '{@link #getPharmacokineticConcentrationFinding(Visit) <em>Get Pharmacokinetic Concentration Finding</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticConcentrationFinding(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PharmacokineticConcentrationFinding getPharmacokineticConcentrationFinding(Visit visit)
  {
    if (GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(82));
      try
      {
        GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY);
    return (PharmacokineticConcentrationFinding) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getFindingAbout(Visit) <em>Get Finding About</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindingAbout(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_FINDING_ABOUT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Finding About))->asSequence()->any(true).oclAsType(sdtm::Finding About)";

  /**
   * The cached OCL query for the '{@link #getFindingAbout(Visit) <em>Get Finding About</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindingAbout(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FINDING_ABOUT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  FindingAbout getFindingAbout(Visit visit)
  {
    if (GET_FINDING_ABOUT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(83));
      try
      {
        GET_FINDING_ABOUT__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUT__EOCL_QRY);
    return (FindingAbout) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getDrugAccountability(Visit) <em>Get Drug Accountability</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrugAccountability(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_DRUG_ACCOUNTABILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Drug Accountability))->asSequence()->any(true).oclAsType(sdtm::Drug Accountability)";

  /**
   * The cached OCL query for the '{@link #getDrugAccountability(Visit) <em>Get Drug Accountability</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrugAccountability(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DRUG_ACCOUNTABILITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DrugAccountability getDrugAccountability(Visit visit)
  {
    if (GET_DRUG_ACCOUNTABILITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(84));
      try
      {
        GET_DRUG_ACCOUNTABILITY__EOCL_QRY = helper.createQuery(GET_DRUG_ACCOUNTABILITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DRUG_ACCOUNTABILITY__EOCL_QRY);
    return (DrugAccountability) query.evaluate(visit);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(Visit) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(Visit)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(Visit) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(Visit)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(Visit visit)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(85));
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
    return (StudyDayPeriod) query.evaluate(visit);
  }

} // VisitOperations