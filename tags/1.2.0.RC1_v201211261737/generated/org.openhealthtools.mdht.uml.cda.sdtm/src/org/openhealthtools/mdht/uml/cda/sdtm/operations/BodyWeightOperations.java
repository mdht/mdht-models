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

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyWeightOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightTemplateId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightTemplateId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.43')";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightTemplateId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightTemplateId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightTemplateId(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightClassCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightClassCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightClassCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightClassCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightClassCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightCodeP(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightCodeP(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightCodeP(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightCodeP(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightCodeP(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightId(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightId(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightMoodCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightMoodCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightMoodCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightMoodCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightMoodCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightValue(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightValue(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightValue(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightValue(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightValue(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightStatusCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightStatusCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightStatusCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightStatusCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightStatusCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightInterpretationCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightInterpretationCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightInterpretationCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightInterpretationCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightInterpretationCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightNonPerformanceReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightNonPerformanceReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightNonPerformanceReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightNonPerformanceReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightNonPerformanceReason(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightFastingAssociation(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightFastingAssociation(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightFastingAssociation(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightFastingAssociation(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightFastingAssociation(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightDataCollection(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightDataCollection(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightDataCollection(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightDataCollection(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightDataCollection(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightExclusionReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightExclusionReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightExclusionReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Exclusion Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightExclusionReason(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightExclusionReason(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHT_EXCLUSION_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateBodyWeightfastingAssociationTypeCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightfastingAssociationTypeCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateBodyWeightfastingAssociationTypeCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateBodyWeightfastingAssociationTypeCode(BodyWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param bodyWeight The receiving '<em><b>Body Weight</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateBodyWeightfastingAssociationTypeCode(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.BODY_WEIGHT);
      try
      {
        VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bodyWeight))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.BODY_WEIGHT__BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BodyWeightfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bodyWeight, context) }),
             new Object [] { bodyWeight }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(BodyWeight) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(BodyWeight)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(BodyWeight) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(BodyWeight)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(BodyWeight bodyWeight)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT, SdtmPackage.Literals.BODY_WEIGHT.getEAllOperations().get(65));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(bodyWeight);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(BodyWeight) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(BodyWeight)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(BodyWeight) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(BodyWeight)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(BodyWeight bodyWeight)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT, SdtmPackage.Literals.BODY_WEIGHT.getEAllOperations().get(66));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(bodyWeight);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionReason(BodyWeight) <em>Get Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(BodyWeight)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionReason(BodyWeight) <em>Get Exclusion Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(BodyWeight)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionReason(BodyWeight bodyWeight)
  {
    if (GET_EXCLUSION_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.BODY_WEIGHT, SdtmPackage.Literals.BODY_WEIGHT.getEAllOperations().get(67));
      try
      {
        GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
    return (ExclusionReason) query.evaluate(bodyWeight);
  }

} // BodyWeightOperations