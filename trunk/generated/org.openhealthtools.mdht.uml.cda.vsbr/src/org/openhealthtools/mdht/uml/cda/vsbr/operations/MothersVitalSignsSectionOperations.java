/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mothers Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionVitalSignsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Vital Signs Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#getVitalSignsObservations() <em>Get Vital Signs Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MothersVitalSignsSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MothersVitalSignsSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionTemplateId(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionTemplateId(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.9')";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionTemplateId(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionTemplateId(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionTemplateId(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionClassCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionClassCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionClassCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionClassCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionClassCode(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionMoodCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionMoodCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionMoodCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionMoodCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionMoodCode(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionCode(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionCode(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionCodeP(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionCodeP(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionCodeP(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionCodeP(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionCodeP(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionText(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionText(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionText(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionText(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionText(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMothersVitalSignsSectionVitalSignsObservation(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Vital Signs Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionVitalSignsObservation(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->select(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::VitalSignsObservation))->size() = 3";

  /**
   * The cached OCL invariant for the '{@link #validateMothersVitalSignsSectionVitalSignsObservation(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Vital Signs Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMothersVitalSignsSectionVitalSignsObservation(MothersVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param mothersVitalSignsSection The receiving '<em><b>Mothers Vital Signs Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMothersVitalSignsSectionVitalSignsObservation(MothersVitalSignsSection mothersVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION);
      try
      {
        VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mothersVitalSignsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MOTHERS_VITAL_SIGNS_SECTION__MOTHERS_VITAL_SIGNS_SECTION_VITAL_SIGNS_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MothersVitalSignsSectionVitalSignsObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mothersVitalSignsSection, context) }),
             new Object [] { mothersVitalSignsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getVitalSignsObservations(MothersVitalSignsSection) <em>Get Vital Signs Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSignsObservations(MothersVitalSignsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_VITAL_SIGNS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::VitalSignsObservation)).oclAsType(vsbr::VitalSignsObservation)";

  /**
   * The cached OCL query for the '{@link #getVitalSignsObservations(MothersVitalSignsSection) <em>Get Vital Signs Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSignsObservations(MothersVitalSignsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_OBSERVATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<VitalSignsObservation> getVitalSignsObservations(MothersVitalSignsSection mothersVitalSignsSection)
  {
    if (GET_VITAL_SIGNS_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION, VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION.getEAllOperations().get(62));
      try
      {
        GET_VITAL_SIGNS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<VitalSignsObservation> result = (Collection<VitalSignsObservation>) query.evaluate(mothersVitalSignsSection);
    return new BasicEList.UnmodifiableEList<VitalSignsObservation>(result.size(), result.toArray());
  }

} // MothersVitalSignsSectionOperations