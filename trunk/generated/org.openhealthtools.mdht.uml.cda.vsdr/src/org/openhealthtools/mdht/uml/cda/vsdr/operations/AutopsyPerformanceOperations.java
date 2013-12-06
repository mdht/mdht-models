/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Performance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutopsyPerformanceOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutopsyPerformanceOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.2')";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceTemplateId(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceTemplateId(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceCodeP(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceEffectiveTime(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceValue(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceMoodCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceCodeP(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '21986-5' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceEffectiveTime(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceEffectiveTime(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceEffectiveTime(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceEffectiveTime(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceValue(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceMoodCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

  /**
   * The cached OCL invariant for the '{@link #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param autopsyPerformance The receiving '<em><b>Autopsy Performance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.AUTOPSY_PERFORMANCE);
      try
      {
        VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(autopsyPerformance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AutopsyPerformanceAutopsyPerformerAutopsyPerformerRole", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(autopsyPerformance, context) }),
             new Object [] { autopsyPerformance }));
      }
       
      return false;
    }
    return true;
  }

} // AutopsyPerformanceOperations