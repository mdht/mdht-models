/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPlugin;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Location Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathLocationTypeOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathLocationTypeOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeTemplateId(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeTemplateId(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.8')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeTemplateId(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeTemplateId(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeTemplateId(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeClassCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeClassCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeClassCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeClassCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeClassCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeCodeP(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeMoodCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeMoodCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeMoodCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeMoodCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeCodeP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeCodeP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeCodeP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeCodeP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '58332-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeCode(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeMoodCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeValue(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeValue(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.114222.4.5.274' and (value.code = 'H-IN' or value.code = 'H-ER/OP' or value.code = 'H-DOA' or value.code = 'NH' or value.code = 'RES' or value.code = 'OTH')))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeValue(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeValue(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeValue(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathLocationTypeValueP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeValueP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathLocationTypeValueP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathLocationTypeValueP(DeathLocationType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathLocationType The receiving '<em><b>Death Location Type</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathLocationTypeValueP(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_LOCATION_TYPE);
      try
      {
        VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathLocationType))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathLocationTypeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathLocationType, context) }),
             new Object [] { deathLocationType }));
      }
       
      return false;
    }
    return true;
  }

} // DeathLocationTypeOperations