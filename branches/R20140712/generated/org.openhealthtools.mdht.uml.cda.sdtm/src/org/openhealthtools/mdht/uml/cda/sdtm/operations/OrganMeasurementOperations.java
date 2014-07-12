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

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Organ Measurement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementExclusionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getExclusionIndicator() <em>Get Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganMeasurementOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganMeasurementOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.50')";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementTemplateId(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementClassCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementId(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementMoodCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementValue(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementStatusCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementInterpretationCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementNonPerformanceReason(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementSpecimenInformation(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementExclusionIndicator(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementExclusionIndicator(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementExclusionIndicator(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementExclusionIndicator(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementExclusionIndicator(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_EXCLUSION_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementExclusionIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOrganMeasurementDataCollection(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
      try
      {
        VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(organMeasurement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
             new Object [] { organMeasurement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(OrganMeasurement) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(OrganMeasurement) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(OrganMeasurement organMeasurement)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(63));
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
    return (NonPerformanceReason) query.evaluate(organMeasurement);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(OrganMeasurement) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(OrganMeasurement) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(OrganMeasurement organMeasurement)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(64));
      try
      {
        GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
    return (SpecimenInformation) query.evaluate(organMeasurement);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionIndicator(OrganMeasurement) <em>Get Exclusion Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionIndicator(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionIndicator(OrganMeasurement) <em>Get Exclusion Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionIndicator(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_INDICATOR__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionIndicator(OrganMeasurement organMeasurement)
  {
    if (GET_EXCLUSION_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(65));
      try
      {
        GET_EXCLUSION_INDICATOR__EOCL_QRY = helper.createQuery(GET_EXCLUSION_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_INDICATOR__EOCL_QRY);
    return (ExclusionReason) query.evaluate(organMeasurement);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(OrganMeasurement) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(OrganMeasurement) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(OrganMeasurement)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(OrganMeasurement organMeasurement)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(66));
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
    return (DataCollection) query.evaluate(organMeasurement);
  }

} // OrganMeasurementOperations