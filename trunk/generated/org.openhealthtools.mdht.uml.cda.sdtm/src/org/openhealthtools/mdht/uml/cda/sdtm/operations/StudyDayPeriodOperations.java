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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Day Period</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyDayPeriodOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudyDayPeriodOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodTemplateId(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodTemplateId(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.70')";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodTemplateId(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodTemplateId(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodTemplateId(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodClassCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodClassCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodClassCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodClassCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodClassCode(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodCodeP(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodCodeP(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodCodeP(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodCodeP(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodCodeP(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodCode(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodMoodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodMoodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodMoodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodMoodCode(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodMoodCode(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudyDayPeriodValue(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodValue(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::IVL_INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudyDayPeriodValue(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudyDayPeriodValue(StudyDayPeriod, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studyDayPeriod The receiving '<em><b>Study Day Period</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudyDayPeriodValue(StudyDayPeriod studyDayPeriod, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_DAY_PERIOD);
      try
      {
        VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyDayPeriod))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_DAY_PERIOD__STUDY_DAY_PERIOD_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyDayPeriodValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyDayPeriod, context) }),
             new Object [] { studyDayPeriod }));
      }
       
      return false;
    }
    return true;
  }

} // StudyDayPeriodOperations