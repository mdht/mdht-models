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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Systemor Organ Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodySystemorOrganClassOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodySystemorOrganClassOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassTemplateId(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassTemplateId(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.57')";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassTemplateId(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassTemplateId(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassTemplateId(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassClassCode(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassCodeP(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassCodeP(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassCodeP(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassCodeP(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassCodeP(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassCode(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassMoodCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassMoodCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassMoodCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassMoodCode(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassMoodCode(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodySystemorOrganClassValue(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassValue(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateBodySystemorOrganClassValue(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodySystemorOrganClassValue(BodySystemorOrganClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodySystemorOrganClass The receiving '<em><b>Body Systemor Organ Class</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodySystemorOrganClassValue(BodySystemorOrganClass bodySystemorOrganClass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS);
      try
      {
        VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodySystemorOrganClass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_SYSTEMOR_ORGAN_CLASS__BODY_SYSTEMOR_ORGAN_CLASS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodySystemorOrganClassValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodySystemorOrganClass, context) }),
             new Object [] { bodySystemorOrganClass }));
      }
       
      return false;
    }
    return true;
  }

} // BodySystemorOrganClassOperations