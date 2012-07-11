/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Attempted Vacuum Extraction</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction#validateAttemptedVacuumExtractionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction#validateAttemptedVacuumExtractionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction#validateAttemptedVacuumExtractionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction#validateAttemptedVacuumExtractionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction#validateAttemptedVacuumExtractionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttemptedVacuumExtractionOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttemptedVacuumExtractionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.11')";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.11')
   * @param attemptedVacuumExtraction The receiving '<em><b>Attempted Vacuum Extraction</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedVacuumExtractionTemplateId(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION);
      try
      {
        VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedVacuumExtraction))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedVacuumExtractionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedVacuumExtraction, context) }),
             new Object [] { attemptedVacuumExtraction }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param attemptedVacuumExtraction The receiving '<em><b>Attempted Vacuum Extraction</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedVacuumExtractionClassCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION);
      try
      {
        VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedVacuumExtraction))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedVacuumExtractionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedVacuumExtraction, context) }),
             new Object [] { attemptedVacuumExtraction }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param attemptedVacuumExtraction The receiving '<em><b>Attempted Vacuum Extraction</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedVacuumExtractionCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION);
      try
      {
        VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedVacuumExtraction))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedVacuumExtractionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedVacuumExtraction, context) }),
             new Object [] { attemptedVacuumExtraction }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param attemptedVacuumExtraction The receiving '<em><b>Attempted Vacuum Extraction</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedVacuumExtractionMoodCode(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION);
      try
      {
        VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedVacuumExtraction))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedVacuumExtractionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedVacuumExtraction, context) }),
             new Object [] { attemptedVacuumExtraction }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Attempted Vacuum Extraction Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param attemptedVacuumExtraction The receiving '<em><b>Attempted Vacuum Extraction</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAttemptedVacuumExtractionValue(AttemptedVacuumExtraction attemptedVacuumExtraction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ATTEMPTED_VACUUM_EXTRACTION);
      try
      {
        VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ATTEMPTED_VACUUM_EXTRACTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(attemptedVacuumExtraction))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ATTEMPTED_VACUUM_EXTRACTION__ATTEMPTED_VACUUM_EXTRACTION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AttemptedVacuumExtractionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(attemptedVacuumExtraction, context) }),
             new Object [] { attemptedVacuumExtraction }));
      }
       
      return false;
    }
    return true;
  }

} // AttemptedVacuumExtractionOperations