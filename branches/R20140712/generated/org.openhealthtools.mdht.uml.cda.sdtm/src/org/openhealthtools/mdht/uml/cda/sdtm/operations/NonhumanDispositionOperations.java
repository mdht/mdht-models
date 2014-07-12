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

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanDispositionOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanDispositionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionTemplateId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionTemplateId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.25')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionTemplateId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionTemplateId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionTemplateId(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionClassCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionClassCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionClassCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionClassCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionClassCode(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionCode(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionEffectiveTime(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionEffectiveTime(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionEffectiveTime(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionEffectiveTime(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionEffectiveTime(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionId(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionId(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionMoodCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionMoodCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionMoodCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionMoodCode(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionMoodCode(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionStudyDayPeriod(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionStudyDayPeriod(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionStudyDayPeriod(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionStudyDayPeriod(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionStudyDayPeriod(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanDispositionPlannedStudyDay(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionPlannedStudyDay(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day))";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanDispositionPlannedStudyDay(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanDispositionPlannedStudyDay(NonhumanDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanDisposition The receiving '<em><b>Nonhuman Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanDispositionPlannedStudyDay(NonhumanDisposition nonhumanDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION);
      try
      {
        VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_DISPOSITION__NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanDispositionPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanDisposition, context) }),
             new Object [] { nonhumanDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(NonhumanDisposition) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(NonhumanDisposition) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(NonhumanDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(NonhumanDisposition nonhumanDisposition)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION, SdtmPackage.Literals.NONHUMAN_DISPOSITION.getEAllOperations().get(59));
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
    return (StudyDayPeriod) query.evaluate(nonhumanDisposition);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(NonhumanDisposition) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(NonhumanDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(NonhumanDisposition) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(NonhumanDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(NonhumanDisposition nonhumanDisposition)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_DISPOSITION, SdtmPackage.Literals.NONHUMAN_DISPOSITION.getEAllOperations().get(60));
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
    return (PlannedStudyDay) query.evaluate(nonhumanDisposition);
  }

} // NonhumanDispositionOperations