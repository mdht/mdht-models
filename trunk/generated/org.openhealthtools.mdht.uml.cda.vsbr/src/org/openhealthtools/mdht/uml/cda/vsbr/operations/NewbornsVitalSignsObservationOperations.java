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

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborns Vital Signs Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewbornsVitalSignsObservationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewbornsVitalSignsObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationTemplateId(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationTemplateId(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.46')";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationTemplateId(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationTemplateId(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationTemplateId(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationClassCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationClassCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationClassCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationClassCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationClassCode(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationMoodCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationMoodCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationMoodCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationMoodCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationMoodCode(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationCodeP(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationCodeP(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationCodeP(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationCodeP(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationCodeP(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '8339-4'))";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationCode(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationCode(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornsVitalSignsObservationValue(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationValue(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornsVitalSignsObservationValue(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornsVitalSignsObservationValue(NewbornsVitalSignsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param newbornsVitalSignsObservation The receiving '<em><b>Newborns Vital Signs Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornsVitalSignsObservationValue(NewbornsVitalSignsObservation newbornsVitalSignsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION);
      try
      {
        VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornsVitalSignsObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORNS_VITAL_SIGNS_OBSERVATION__NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornsVitalSignsObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornsVitalSignsObservation, context) }),
             new Object [] { newbornsVitalSignsObservation }));
      }
       
      return false;
    }
    return true;
  }

} // NewbornsVitalSignsObservationOperations