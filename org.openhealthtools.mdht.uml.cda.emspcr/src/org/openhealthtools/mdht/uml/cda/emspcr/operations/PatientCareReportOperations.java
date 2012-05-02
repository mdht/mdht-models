/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportHumanAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Human Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getBilling() <em>Get Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSection() <em>Get Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
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
   * isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN
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
   * isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
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
   * The cached OCL expression body for the '{@link #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

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
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
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
   * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
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
  protected static final String VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
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
            (Diagnostic.INFO,
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
   * The cached OCL expression body for the '{@link #validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives Section Entries Optional</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportAdvanceDirectivesSectionEntriesOptional"),
             new Object [] { patientCareReport }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

  /**
   * The cached OCL invariant for the '{@link #validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies Section Entries Optional</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
             EmspcrPlugin.INSTANCE.getString("PatientCareReportAllergiesSectionEntriesOptional"),
             new Object [] { patientCareReport }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional(PatientCareReport) <em>Get Advance Directives Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvanceDirectivesSectionEntriesOptional(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional(PatientCareReport) <em>Get Advance Directives Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvanceDirectivesSectionEntriesOptional(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(PatientCareReport patientCareReport)
  {
    if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(161));
      try
      {
        GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(PatientCareReport) <em>Get Allergies Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(PatientCareReport) <em>Get Allergies Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(PatientCareReport patientCareReport)
  {
    if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(162));
      try
      {
        GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (AllergiesSectionEntriesOptional) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getBilling(PatientCareReport) <em>Get Billing</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBilling(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_BILLING__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBilling))->asSequence()->first().oclAsType(emspcr::EMSBilling)";

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
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSBilling))->asSequence()->first().oclAsType(emspcr::EMSBilling)
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EMSBilling getBilling(PatientCareReport patientCareReport)
  {
    if (GET_BILLING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(163));
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
    return (EMSBilling) query.evaluate(patientCareReport);
  }

  /**
   * The cached OCL expression body for the '{@link #getSection(PatientCareReport) <em>Get Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection(PatientCareReport)
   * @generated
   * @ordered
   */
  protected static final String GET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescription))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescription)";

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
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(emspcr::EMSInjuryIncidentDescription))->asSequence()->first().oclAsType(emspcr::EMSInjuryIncidentDescription)
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EMSInjuryIncidentDescription getSection(PatientCareReport patientCareReport)
  {
    if (GET_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT, EmspcrPackage.Literals.PATIENT_CARE_REPORT.getEAllOperations().get(164));
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
    return (EMSInjuryIncidentDescription) query.evaluate(patientCareReport);
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
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1')
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

  /**
   * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsCode(PatientCareReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param patientCareReport The receiving '<em><b>Patient Care Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateGeneralHeaderConstraintsCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.PATIENT_CARE_REPORT);
      try
      {
        VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientCareReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE,
             EmspcrPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
             new Object [] { patientCareReport }));
      }
      return false;
    }
    return true;
  }

} // PatientCareReportOperations