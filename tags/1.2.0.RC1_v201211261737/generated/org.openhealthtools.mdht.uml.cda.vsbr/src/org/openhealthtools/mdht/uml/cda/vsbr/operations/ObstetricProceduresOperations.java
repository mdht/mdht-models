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

import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obstetric Procedures</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObstetricProceduresOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObstetricProceduresOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateObstetricProceduresTemplateId(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresTemplateId(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.29')";

  /**
   * The cached OCL invariant for the '{@link #validateObstetricProceduresTemplateId(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresTemplateId(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.29')
   * @param obstetricProcedures The receiving '<em><b>Obstetric Procedures</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateObstetricProceduresTemplateId(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURES);
      try
      {
        VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(obstetricProcedures))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ObstetricProceduresTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(obstetricProcedures, context) }),
             new Object [] { obstetricProcedures }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateObstetricProceduresClassCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresClassCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateObstetricProceduresClassCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresClassCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param obstetricProcedures The receiving '<em><b>Obstetric Procedures</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateObstetricProceduresClassCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURES);
      try
      {
        VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(obstetricProcedures))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ObstetricProceduresClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(obstetricProcedures, context) }),
             new Object [] { obstetricProcedures }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateObstetricProceduresCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateObstetricProceduresCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param obstetricProcedures The receiving '<em><b>Obstetric Procedures</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateObstetricProceduresCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURES);
      try
      {
        VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(obstetricProcedures))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ObstetricProceduresCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(obstetricProcedures, context) }),
             new Object [] { obstetricProcedures }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateObstetricProceduresMoodCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresMoodCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateObstetricProceduresMoodCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresMoodCode(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param obstetricProcedures The receiving '<em><b>Obstetric Procedures</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateObstetricProceduresMoodCode(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURES);
      try
      {
        VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(obstetricProcedures))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ObstetricProceduresMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(obstetricProcedures, context) }),
             new Object [] { obstetricProcedures }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateObstetricProceduresValue(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresValue(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateObstetricProceduresValue(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateObstetricProceduresValue(ObstetricProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param obstetricProcedures The receiving '<em><b>Obstetric Procedures</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateObstetricProceduresValue(ObstetricProcedures obstetricProcedures, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURES);
      try
      {
        VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(obstetricProcedures))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OBSTETRIC_PROCEDURES__OBSTETRIC_PROCEDURES_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ObstetricProceduresValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(obstetricProcedures, context) }),
             new Object [] { obstetricProcedures }));
      }
       
      return false;
    }
    return true;
  }

} // ObstetricProceduresOperations