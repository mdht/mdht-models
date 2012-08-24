/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Care Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportHumanAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Human Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportBilling(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPastMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSocialHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPatientCareNarrative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSituationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSHumanAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Human Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getBilling() <em>Get Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSection() <em>Get Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSCurrentMedication() <em>Get EMS Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSCardiacArrestEvent() <em>Get EMS Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSAdvanceDirectives() <em>Get EMS Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSAllergiesAndAdverseReactionsSection() <em>Get EMS Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPastMedicalHistory() <em>Get EMS Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSocialHistory() <em>Get EMS Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPhysicalAssessmentSection() <em>Get EMS Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSMedicationsAdministeredSection() <em>Get EMS Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProceduresPerformedSection() <em>Get EMS Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPatientCareNarrative() <em>Get EMS Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSceneSection() <em>Get EMS Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispatchSection() <em>Get EMS Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispositionSection() <em>Get EMS Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPersonnelAdverseEventSection() <em>Get EMS Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProtocolSection() <em>Get EMS Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSResponseSection() <em>Get EMS Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSituationSection() <em>Get EMS Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSTimesSection() <em>Get EMS Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSVitalSignsSection() <em>Get EMS Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientCareReportOperations extends GeneralHeaderConstraintsOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatientCareReportOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportClassCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportClassCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CLASS_CODE,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportClassCode"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportMoodCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportMoodCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_MOOD_CODE,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportMoodCode"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCodeP(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportCodeP(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CODE_P,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportCodeP"),
             new Object [] { patientCareReport }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP", passToken);
        }
        passToken.add(patientCareReport);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientCareReport)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CODE,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportCode"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportVersionNumber(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_VERSION_NUMBER,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportVersionNumber"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportId(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ID,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportId"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Patient Care Report')";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportTitle(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportVersionNumber(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportTitle(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_TITLE,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportTitle"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportAuthor(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_AUTHOR,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportAuthor"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportRecordTarget(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RECORD_TARGET,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportRecordTarget"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportHumanAuthor(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_HUMAN_AUTHOR,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportHumanAuthor"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportBilling(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_BILLING,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportBilling"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSCurrentMedication(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSCurrentMedication"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSCardiacArrestEvent"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSAdvanceDirectives(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSAdvanceDirectives"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSAllergiesAndAdverseReactionsSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSPastMedicalHistory(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSPastMedicalHistory"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSSocialHistory(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSSocialHistory"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSPhysicalAssessmentSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSMedicationsAdministeredSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSProceduresPerformedSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSPatientCareNarrative(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSPatientCareNarrative"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSSceneSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_SCENE_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSSceneSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportComponentOf(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_COMPONENT_OF,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportComponentOf"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSDispatchSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSDispatchSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSDispositionSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSDispositionSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSPersonnelAdverseEventSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSPersonnelAdverseEventSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSProtocolSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSProtocolSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSResponseSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSResponseSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSSituationSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_SITUATION_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSSituationSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSTimesSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_TIMES_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSTimesSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSVitalSignsSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSVitalSignsSection"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportEMSHumanAuthorParticipation(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportEMSHumanAuthorParticipation"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportCustodian(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CUSTODIAN,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportCustodian"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportDocumentationOf(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_DOCUMENTATION_OF,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportDocumentationOf"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportRelatedDocument(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RELATED_DOCUMENT,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportRelatedDocument"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportRecordTarget(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportHumanAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Human Author</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportHumanAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportHumanAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Human Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportHumanAuthor(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportBilling(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Current Medication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Current Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSCurrentMedication(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Cardiac Arrest Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Cardiac Arrest Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Advance Directives</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Advance Directives</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSAdvanceDirectives(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Allergies And Adverse Reactions Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Allergies And Adverse Reactions Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Past Medical History</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Past Medical History</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPastMedicalHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Social History</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Social History</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSocialHistory(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Physical Assessment Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Physical Assessment Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Medications Administered Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Medications Administered Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Procedures Performed Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Procedures Performed Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Patient Care Narrative</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Patient Care Narrative</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPatientCareNarrative(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Scene Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Scene Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSceneSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportComponentOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Dispatch Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Dispatch Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSDispatchSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Disposition Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Disposition Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSDispositionSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Personnel Adverse Event Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Personnel Adverse Event Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSPersonnelAdverseEventSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Protocol Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Protocol Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSProtocolSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Response Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Response Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSResponseSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Situation Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Situation Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSSituationSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Times Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSTimesSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Times Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSTimesSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Vital Signs Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSVitalSignsSection(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportEMSHumanAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Human Author Participation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSHumanAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportEMSHumanAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Human Author Participation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportEMSHumanAuthorParticipation(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCustodian(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportDocumentationOf(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportRelatedDocument(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportParticipant(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportParticipant(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_PARTICIPANT,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportParticipant"),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getBilling(PatientCareReport) <em>Get Billing</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBilling(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_BILLING__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBillingSection))->asSequence()->any(true).oclAsType(emspcr::EMSBillingSection)";

  /**
   * The cached OCL query for the '{@link #getBilling(PatientCareReport) <em>Get Billing</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBilling(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BILLING__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSBillingSection getBilling(PatientCareReport patientCareReport)
  {
    if (GET_BILLING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(207));
      try
      {
        GET_BILLING__EOCL_QRY = helper.createQuery(GET_BILLING__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BILLING__EOCL_QRY);
    return (EMSBillingSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getSection(PatientCareReport) <em>Get Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescriptionSection))->asSequence()->any(true).oclAsType(emspcr::EMSInjuryIncidentDescriptionSection)";

  /**
   * The cached OCL query for the '{@link #getSection(PatientCareReport) <em>Get Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSInjuryIncidentDescriptionSection getSection(PatientCareReport patientCareReport)
  {
    if (GET_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(208));
      try
      {
        GET_SECTION__EOCL_QRY = helper.createQuery(GET_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SECTION__EOCL_QRY);
    return (EMSInjuryIncidentDescriptionSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSCurrentMedication(PatientCareReport) <em>Get EMS Current Medication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSCurrentMedication(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_CURRENT_MEDICATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCurrentMedicationSection))->asSequence()->any(true).oclAsType(emspcr::EMSCurrentMedicationSection)";

  /**
   * The cached OCL query for the '{@link #getEMSCurrentMedication(PatientCareReport) <em>Get EMS Current Medication</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSCurrentMedication(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_CURRENT_MEDICATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSCurrentMedicationSection getEMSCurrentMedication(PatientCareReport patientCareReport)
  {
    if (GET_EMS_CURRENT_MEDICATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(209));
      try
      {
        GET_EMS_CURRENT_MEDICATION__EOCL_QRY = helper.createQuery(GET_EMS_CURRENT_MEDICATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_CURRENT_MEDICATION__EOCL_QRY);
    return (EMSCurrentMedicationSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSCardiacArrestEvent(PatientCareReport) <em>Get EMS Cardiac Arrest Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSCardiacArrestEvent(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_CARDIAC_ARREST_EVENT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSCardiacArrestEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSCardiacArrestEventSection)";

  /**
   * The cached OCL query for the '{@link #getEMSCardiacArrestEvent(PatientCareReport) <em>Get EMS Cardiac Arrest Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSCardiacArrestEvent(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_CARDIAC_ARREST_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSCardiacArrestEventSection getEMSCardiacArrestEvent(PatientCareReport patientCareReport)
  {
    if (GET_EMS_CARDIAC_ARREST_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(210));
      try
      {
        GET_EMS_CARDIAC_ARREST_EVENT__EOCL_QRY = helper.createQuery(GET_EMS_CARDIAC_ARREST_EVENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_CARDIAC_ARREST_EVENT__EOCL_QRY);
    return (EMSCardiacArrestEventSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSAdvanceDirectives(PatientCareReport) <em>Get EMS Advance Directives</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSAdvanceDirectives(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_ADVANCE_DIRECTIVES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAdvanceDirectivesSection))->asSequence()->any(true).oclAsType(emspcr::EMSAdvanceDirectivesSection)";

  /**
   * The cached OCL query for the '{@link #getEMSAdvanceDirectives(PatientCareReport) <em>Get EMS Advance Directives</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSAdvanceDirectives(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_ADVANCE_DIRECTIVES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSAdvanceDirectivesSection getEMSAdvanceDirectives(PatientCareReport patientCareReport)
  {
    if (GET_EMS_ADVANCE_DIRECTIVES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(211));
      try
      {
        GET_EMS_ADVANCE_DIRECTIVES__EOCL_QRY = helper.createQuery(GET_EMS_ADVANCE_DIRECTIVES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_ADVANCE_DIRECTIVES__EOCL_QRY);
    return (EMSAdvanceDirectivesSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSAllergiesAndAdverseReactionsSection(PatientCareReport) <em>Get EMS Allergies And Adverse Reactions Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSAllergiesAndAdverseReactionsSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSAllergiesAndAdverseReactionsSection))->asSequence()->any(true).oclAsType(emspcr::EMSAllergiesAndAdverseReactionsSection)";

  /**
   * The cached OCL query for the '{@link #getEMSAllergiesAndAdverseReactionsSection(PatientCareReport) <em>Get EMS Allergies And Adverse Reactions Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSAllergiesAndAdverseReactionsSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSAllergiesAndAdverseReactionsSection getEMSAllergiesAndAdverseReactionsSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(212));
      try
      {
        GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EOCL_QRY);
    return (EMSAllergiesAndAdverseReactionsSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSPastMedicalHistory(PatientCareReport) <em>Get EMS Past Medical History</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPastMedicalHistory(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PAST_MEDICAL_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPastMedicalHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSPastMedicalHistorySection)";

  /**
   * The cached OCL query for the '{@link #getEMSPastMedicalHistory(PatientCareReport) <em>Get EMS Past Medical History</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPastMedicalHistory(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PAST_MEDICAL_HISTORY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSPastMedicalHistorySection getEMSPastMedicalHistory(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PAST_MEDICAL_HISTORY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(213));
      try
      {
        GET_EMS_PAST_MEDICAL_HISTORY__EOCL_QRY = helper.createQuery(GET_EMS_PAST_MEDICAL_HISTORY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PAST_MEDICAL_HISTORY__EOCL_QRY);
    return (EMSPastMedicalHistorySection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSSocialHistory(PatientCareReport) <em>Get EMS Social History</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSocialHistory(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_SOCIAL_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSocialHistorySection))->asSequence()->any(true).oclAsType(emspcr::EMSSocialHistorySection)";

  /**
   * The cached OCL query for the '{@link #getEMSSocialHistory(PatientCareReport) <em>Get EMS Social History</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSocialHistory(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_SOCIAL_HISTORY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSSocialHistorySection getEMSSocialHistory(PatientCareReport patientCareReport)
  {
    if (GET_EMS_SOCIAL_HISTORY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(214));
      try
      {
        GET_EMS_SOCIAL_HISTORY__EOCL_QRY = helper.createQuery(GET_EMS_SOCIAL_HISTORY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_SOCIAL_HISTORY__EOCL_QRY);
    return (EMSSocialHistorySection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSPhysicalAssessmentSection(PatientCareReport) <em>Get EMS Physical Assessment Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPhysicalAssessmentSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPhysicalAssessmentSection))->asSequence()->any(true).oclAsType(emspcr::EMSPhysicalAssessmentSection)";

  /**
   * The cached OCL query for the '{@link #getEMSPhysicalAssessmentSection(PatientCareReport) <em>Get EMS Physical Assessment Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPhysicalAssessmentSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSPhysicalAssessmentSection getEMSPhysicalAssessmentSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(215));
      try
      {
        GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PHYSICAL_ASSESSMENT_SECTION__EOCL_QRY);
    return (EMSPhysicalAssessmentSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSMedicationsAdministeredSection(PatientCareReport) <em>Get EMS Medications Administered Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSMedicationsAdministeredSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSMedicationsAdministeredSection))->asSequence()->any(true).oclAsType(emspcr::EMSMedicationsAdministeredSection)";

  /**
   * The cached OCL query for the '{@link #getEMSMedicationsAdministeredSection(PatientCareReport) <em>Get EMS Medications Administered Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSMedicationsAdministeredSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSMedicationsAdministeredSection getEMSMedicationsAdministeredSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(216));
      try
      {
        GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
    return (EMSMedicationsAdministeredSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSProceduresPerformedSection(PatientCareReport) <em>Get EMS Procedures Performed Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSProceduresPerformedSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProceduresPerformedSection))->asSequence()->any(true).oclAsType(emspcr::EMSProceduresPerformedSection)";

  /**
   * The cached OCL query for the '{@link #getEMSProceduresPerformedSection(PatientCareReport) <em>Get EMS Procedures Performed Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSProceduresPerformedSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSProceduresPerformedSection getEMSProceduresPerformedSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(217));
      try
      {
        GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PROCEDURES_PERFORMED_SECTION__EOCL_QRY);
    return (EMSProceduresPerformedSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSPatientCareNarrative(PatientCareReport) <em>Get EMS Patient Care Narrative</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPatientCareNarrative(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPatientCareNarrativeSection))->asSequence()->any(true).oclAsType(emspcr::EMSPatientCareNarrativeSection)";

  /**
   * The cached OCL query for the '{@link #getEMSPatientCareNarrative(PatientCareReport) <em>Get EMS Patient Care Narrative</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPatientCareNarrative(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSPatientCareNarrativeSection getEMSPatientCareNarrative(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(218));
      try
      {
        GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_QRY = helper.createQuery(GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PATIENT_CARE_NARRATIVE__EOCL_QRY);
    return (EMSPatientCareNarrativeSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSSceneSection(PatientCareReport) <em>Get EMS Scene Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSceneSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_SCENE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSceneSection))->asSequence()->any(true).oclAsType(emspcr::EMSSceneSection)";

  /**
   * The cached OCL query for the '{@link #getEMSSceneSection(PatientCareReport) <em>Get EMS Scene Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSceneSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_SCENE_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSSceneSection getEMSSceneSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_SCENE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(219));
      try
      {
        GET_EMS_SCENE_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_SCENE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_SCENE_SECTION__EOCL_QRY);
    return (EMSSceneSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSDispatchSection(PatientCareReport) <em>Get EMS Dispatch Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSDispatchSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_DISPATCH_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispatchSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispatchSection)";

  /**
   * The cached OCL query for the '{@link #getEMSDispatchSection(PatientCareReport) <em>Get EMS Dispatch Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSDispatchSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_DISPATCH_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSDispatchSection getEMSDispatchSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_DISPATCH_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(220));
      try
      {
        GET_EMS_DISPATCH_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_DISPATCH_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_DISPATCH_SECTION__EOCL_QRY);
    return (EMSDispatchSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSDispositionSection(PatientCareReport) <em>Get EMS Disposition Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSDispositionSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSDispositionSection))->asSequence()->any(true).oclAsType(emspcr::EMSDispositionSection)";

  /**
   * The cached OCL query for the '{@link #getEMSDispositionSection(PatientCareReport) <em>Get EMS Disposition Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSDispositionSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_DISPOSITION_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSDispositionSection getEMSDispositionSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_DISPOSITION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(221));
      try
      {
        GET_EMS_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_DISPOSITION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_DISPOSITION_SECTION__EOCL_QRY);
    return (EMSDispositionSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSPersonnelAdverseEventSection(PatientCareReport) <em>Get EMS Personnel Adverse Event Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPersonnelAdverseEventSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSPersonnelAdverseEventSection))->asSequence()->any(true).oclAsType(emspcr::EMSPersonnelAdverseEventSection)";

  /**
   * The cached OCL query for the '{@link #getEMSPersonnelAdverseEventSection(PatientCareReport) <em>Get EMS Personnel Adverse Event Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSPersonnelAdverseEventSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSPersonnelAdverseEventSection getEMSPersonnelAdverseEventSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(222));
      try
      {
        GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EOCL_QRY);
    return (EMSPersonnelAdverseEventSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSProtocolSection(PatientCareReport) <em>Get EMS Protocol Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSProtocolSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_PROTOCOL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSProtocolSection))->asSequence()->any(true).oclAsType(emspcr::EMSProtocolSection)";

  /**
   * The cached OCL query for the '{@link #getEMSProtocolSection(PatientCareReport) <em>Get EMS Protocol Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSProtocolSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_PROTOCOL_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSProtocolSection getEMSProtocolSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_PROTOCOL_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(223));
      try
      {
        GET_EMS_PROTOCOL_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_PROTOCOL_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_PROTOCOL_SECTION__EOCL_QRY);
    return (EMSProtocolSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSResponseSection(PatientCareReport) <em>Get EMS Response Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSResponseSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_RESPONSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSResponseSection))->asSequence()->any(true).oclAsType(emspcr::EMSResponseSection)";

  /**
   * The cached OCL query for the '{@link #getEMSResponseSection(PatientCareReport) <em>Get EMS Response Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSResponseSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_RESPONSE_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSResponseSection getEMSResponseSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_RESPONSE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(224));
      try
      {
        GET_EMS_RESPONSE_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_RESPONSE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_RESPONSE_SECTION__EOCL_QRY);
    return (EMSResponseSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSSituationSection(PatientCareReport) <em>Get EMS Situation Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSituationSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_SITUATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSSituationSection))->asSequence()->any(true).oclAsType(emspcr::EMSSituationSection)";

  /**
   * The cached OCL query for the '{@link #getEMSSituationSection(PatientCareReport) <em>Get EMS Situation Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSSituationSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_SITUATION_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSSituationSection getEMSSituationSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_SITUATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(225));
      try
      {
        GET_EMS_SITUATION_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_SITUATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_SITUATION_SECTION__EOCL_QRY);
    return (EMSSituationSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSTimesSection(PatientCareReport) <em>Get EMS Times Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSTimesSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_TIMES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSTimesSection))->asSequence()->any(true).oclAsType(emspcr::EMSTimesSection)";

  /**
   * The cached OCL query for the '{@link #getEMSTimesSection(PatientCareReport) <em>Get EMS Times Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSTimesSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_TIMES_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSTimesSection getEMSTimesSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_TIMES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(226));
      try
      {
        GET_EMS_TIMES_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_TIMES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_TIMES_SECTION__EOCL_QRY);
    return (EMSTimesSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getEMSVitalSignsSection(PatientCareReport) <em>Get EMS Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSVitalSignsSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_EMS_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSVitalSignsSection))->asSequence()->any(true).oclAsType(emspcr::EMSVitalSignsSection)";

  /**
   * The cached OCL query for the '{@link #getEMSVitalSignsSection(PatientCareReport) <em>Get EMS Vital Signs Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMSVitalSignsSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EMS_VITAL_SIGNS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EMSVitalSignsSection getEMSVitalSignsSection(PatientCareReport patientCareReport)
  {
    if (GET_EMS_VITAL_SIGNS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(227));
      try
      {
        GET_EMS_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_EMS_VITAL_SIGNS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EMS_VITAL_SIGNS_SECTION__EOCL_QRY);
    return (EMSVitalSignsSection) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1')";

  /**
   * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateGeneralHeaderConstraintsTemplateId(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(patientCareReport, context) }),
             new Object [] { patientCareReport }));
      }
       
      return false;
    }
    return true;
  }

} // PatientCareReportOperations