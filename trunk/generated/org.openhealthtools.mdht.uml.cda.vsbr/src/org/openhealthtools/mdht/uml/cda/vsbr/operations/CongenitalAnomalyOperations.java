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

import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Congenital Anomaly</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyDownConfirmationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Down Confirmation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly#validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Chromosomal Disorder Confirmation Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CongenitalAnomalyOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CongenitalAnomalyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyTemplateId(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyTemplateId(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.19')";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyTemplateId(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyTemplateId(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyTemplateId(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyClassCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyClassCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyClassCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyClassCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyClassCode(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyMoodCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyMoodCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyMoodCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyMoodCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyMoodCode(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyCodeP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCodeP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyCodeP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCodeP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyCodeP(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '73780-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCode(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyCode(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyCodeVS(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code VS</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCodeVS(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '89369001' or value.code = '67531005' or value.code = '12770006' or value.code = '17190001' or value.code = '18735004' or value.code = '72951007' or value.code = '67341007' or value.code = '80281008' or value.code = '87979003' or value.code = '70156005' or value.code = '409709004' or value.code = '409709004' or value.code = '416010008' or value.code = '260413007'))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyCodeVS(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Code VS</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyCodeVS(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyCodeVS(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CODE_VS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyCodeVS", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyValue(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyValue(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '89369001' or value.code = '67531005' or value.code = '12770006' or value.code = '17190001' or value.code = '18735004' or value.code = '72951007' or value.code = '67341007' or value.code = '80281008' or value.code = '87979003' or value.code = '70156005' or value.code = '409709004' or value.code = '409709004' or value.code = '416010008' or value.code = '260413007')))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyValue(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyValue(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyValue(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyValueP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyValueP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyValueP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyValueP(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyValueP(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyDownConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Down Confirmation Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyDownConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyDownConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Down Confirmation Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyDownConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyDownConfirmationAssociation(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_DOWN_CONFIRMATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyDownConfirmationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Chromosomal Disorder Confirmation Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaly Chromosomal Disorder Confirmation Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(CongenitalAnomaly, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param congenitalAnomaly The receiving '<em><b>Congenital Anomaly</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(CongenitalAnomaly congenitalAnomaly, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALY);
      try
      {
        VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaly))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALY__CONGENITAL_ANOMALY_CHROMOSOMAL_DISORDER_CONFIRMATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomalyChromosomalDisorderConfirmationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaly, context) }),
             new Object [] { congenitalAnomaly }));
      }
       
      return false;
    }
    return true;
  }

} // CongenitalAnomalyOperations