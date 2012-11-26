/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

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

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Data Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodySubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanExposure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Exposure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyBodyWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyBodyWeightGain(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight Gain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyClinicalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Clinical Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Foodand Water Consumption</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Macroscopic Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Microscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyOrganMeasurement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Organ Measurement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPalpableMass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Palpable Mass</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyTumorFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Tumor Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanSubjectDemographics() <em>Get Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanDisposition() <em>Get Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanExposures() <em>Get Nonhuman Exposures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getBodyWeights() <em>Get Body Weights</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getBodyWeightGains() <em>Get Body Weight Gains</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getClinicalObservations() <em>Get Clinical Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getDeathDiagnosis() <em>Get Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getFoodandWaterConsumptions() <em>Get Foodand Water Consumptions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanLaboratoryTestResults() <em>Get Nonhuman Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getMacroscopicFindings() <em>Get Macroscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getMicroscopicFindingss() <em>Get Microscopic Findingss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getOrganMeasurements() <em>Get Organ Measurements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPalpableMasss() <em>Get Palpable Masss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPharmacokineticConcentrationFindings() <em>Get Pharmacokinetic Concentration Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPharmacokineticParameterFindings() <em>Get Pharmacokinetic Parameter Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getSubjectCharacteristics() <em>Get Subject Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getTumorFindings() <em>Get Tumor Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getVitalSigns() <em>Get Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDataDocumentBodyOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanSubjectDataDocumentBodyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyTemplateId(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyTemplateId(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.15')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyTemplateId(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyTemplateId(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyTemplateId(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyClassCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyClassCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyClassCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyClassCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyClassCode(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyCodeP(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyCodeP(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyCodeP(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyCodeP(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyCodeP(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyCode(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyMoodCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMoodCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyMoodCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMoodCode(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyMoodCode(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Subject Demographics</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(sdtm::Non-human Subject Demographics) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Subject Demographics</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Disposition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Non-human Disposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Disposition</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyNonhumanDisposition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodySubjectElement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Element</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodySubjectElement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Subject Element) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodySubjectElement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Element</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodySubjectElement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodySubjectElement(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodySubjectElement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanExposure(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Exposure</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanExposure(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::Non-human Exposure) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanExposure(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Exposure</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanExposure(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyNonhumanExposure(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyNonhumanExposure", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyBodyWeight(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyBodyWeight(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Body Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyBodyWeight(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyBodyWeight(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyBodyWeight(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyBodyWeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyBodyWeightGain(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight Gain</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyBodyWeightGain(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Body Weight Gain) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyBodyWeightGain(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight Gain</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyBodyWeightGain(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyBodyWeightGain(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyBodyWeightGain", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyClinicalObservation(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Clinical Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyClinicalObservation(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Clinical Observation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyClinicalObservation(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Clinical Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyClinicalObservation(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyClinicalObservation(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyClinicalObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Death Diagnosis</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Death Diagnosis) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Death Diagnosis</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyDeathDiagnosis", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Foodand Water Consumption</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Food and Water Consumption) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Foodand Water Consumption</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyFoodandWaterConsumption", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Laboratory Test Result</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Non-human Laboratory Test Result) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Laboratory Test Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Macroscopic Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Macroscopic Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Macroscopic Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyMacroscopicFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Microscopic Findings</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Microscopic Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Microscopic Findings</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyMicroscopicFindings", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyOrganMeasurement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Organ Measurement</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyOrganMeasurement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Organ Measurement) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyOrganMeasurement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Organ Measurement</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyOrganMeasurement(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyOrganMeasurement(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyOrganMeasurement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyPalpableMass(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Palpable Mass</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPalpableMass(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Palpable Mass) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyPalpableMass(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Palpable Mass</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPalpableMass(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyPalpableMass(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyPalpableMass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Concentration Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Pharmacokinetic Concentration Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Concentration Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Parameter Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Parameter Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Characteristic</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Subject Characteristic) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Characteristic</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodySubjectCharacteristic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyTumorFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Tumor Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyTumorFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Tumor Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyTumorFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Tumor Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyTumorFinding(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyTumorFinding(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyTumorFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyVitalSign(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Vital Sign</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyVitalSign(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Vital Sign) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyVitalSign(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Vital Sign</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyVitalSign(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyVitalSign(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyVitalSign", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentBodyECGTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body ECG Test Result</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyECGTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ECG Test Result) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentBodyECGTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body ECG Test Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNonhumanSubjectDataDocumentBodyECGTestResult(NonhumanSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param nonhumanSubjectDataDocumentBody The receiving '<em><b>Nonhuman Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNonhumanSubjectDataDocumentBodyECGTestResult(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentBodyECGTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentBody, context) }),
             new Object [] { nonhumanSubjectDataDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Subject Demographics</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(sdtm::Non-human Subject Demographics))->asSequence()->any(true).oclAsType(sdtm::Non-human Subject Demographics)";

  /**
   * The cached OCL query for the '{@link #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Subject Demographics</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonhumanSubjectDemographics getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(80));
      try
      {
        GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY = helper.createQuery(GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY);
    return (NonhumanSubjectDemographics) query.evaluate(nonhumanSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonhumanDisposition(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Disposition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanDisposition(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_NONHUMAN_DISPOSITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Non-human Disposition))->asSequence()->any(true).oclAsType(sdtm::Non-human Disposition)";

  /**
   * The cached OCL query for the '{@link #getNonhumanDisposition(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Disposition</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanDisposition(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NONHUMAN_DISPOSITION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonhumanDisposition getNonhumanDisposition(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_NONHUMAN_DISPOSITION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(81));
      try
      {
        GET_NONHUMAN_DISPOSITION__EOCL_QRY = helper.createQuery(GET_NONHUMAN_DISPOSITION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_DISPOSITION__EOCL_QRY);
    return (NonhumanDisposition) query.evaluate(nonhumanSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getSubjectElements(NonhumanSubjectDataDocumentBody) <em>Get Subject Elements</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectElements(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_SUBJECT_ELEMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Subject Element)).oclAsType(sdtm::Subject Element)";

  /**
   * The cached OCL query for the '{@link #getSubjectElements(NonhumanSubjectDataDocumentBody) <em>Get Subject Elements</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectElements(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SUBJECT_ELEMENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<SubjectElement> getSubjectElements(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_SUBJECT_ELEMENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(82));
      try
      {
        GET_SUBJECT_ELEMENTS__EOCL_QRY = helper.createQuery(GET_SUBJECT_ELEMENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_ELEMENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SubjectElement> result = (Collection<SubjectElement>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<SubjectElement>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getNonhumanExposures(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Exposures</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanExposures(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_NONHUMAN_EXPOSURES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::Non-human Exposure)).oclAsType(sdtm::Non-human Exposure)";

  /**
   * The cached OCL query for the '{@link #getNonhumanExposures(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Exposures</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanExposures(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NONHUMAN_EXPOSURES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<NonhumanExposure> getNonhumanExposures(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_NONHUMAN_EXPOSURES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(83));
      try
      {
        GET_NONHUMAN_EXPOSURES__EOCL_QRY = helper.createQuery(GET_NONHUMAN_EXPOSURES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_EXPOSURES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<NonhumanExposure> result = (Collection<NonhumanExposure>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<NonhumanExposure>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getBodyWeights(NonhumanSubjectDataDocumentBody) <em>Get Body Weights</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeights(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_WEIGHTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body Weight)).oclAsType(sdtm::Body Weight)";

  /**
   * The cached OCL query for the '{@link #getBodyWeights(NonhumanSubjectDataDocumentBody) <em>Get Body Weights</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeights(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_WEIGHTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<BodyWeight> getBodyWeights(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_BODY_WEIGHTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(84));
      try
      {
        GET_BODY_WEIGHTS__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_WEIGHTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<BodyWeight> result = (Collection<BodyWeight>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<BodyWeight>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getBodyWeightGains(NonhumanSubjectDataDocumentBody) <em>Get Body Weight Gains</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightGains(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_WEIGHT_GAINS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body Weight Gain)).oclAsType(sdtm::Body Weight Gain)";

  /**
   * The cached OCL query for the '{@link #getBodyWeightGains(NonhumanSubjectDataDocumentBody) <em>Get Body Weight Gains</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightGains(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_WEIGHT_GAINS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<BodyWeightGain> getBodyWeightGains(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_BODY_WEIGHT_GAINS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(85));
      try
      {
        GET_BODY_WEIGHT_GAINS__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHT_GAINS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_WEIGHT_GAINS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<BodyWeightGain> result = (Collection<BodyWeightGain>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<BodyWeightGain>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getClinicalObservations(NonhumanSubjectDataDocumentBody) <em>Get Clinical Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClinicalObservations(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CLINICAL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Clinical Observation)).oclAsType(sdtm::Clinical Observation)";

  /**
   * The cached OCL query for the '{@link #getClinicalObservations(NonhumanSubjectDataDocumentBody) <em>Get Clinical Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClinicalObservations(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CLINICAL_OBSERVATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<ClinicalObservation> getClinicalObservations(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_CLINICAL_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(86));
      try
      {
        GET_CLINICAL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CLINICAL_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CLINICAL_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ClinicalObservation> result = (Collection<ClinicalObservation>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<ClinicalObservation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getDeathDiagnosis(NonhumanSubjectDataDocumentBody) <em>Get Death Diagnosis</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathDiagnosis(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_DEATH_DIAGNOSIS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Death Diagnosis))->asSequence()->any(true).oclAsType(sdtm::Death Diagnosis)";

  /**
   * The cached OCL query for the '{@link #getDeathDiagnosis(NonhumanSubjectDataDocumentBody) <em>Get Death Diagnosis</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathDiagnosis(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DEATH_DIAGNOSIS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DeathDiagnosis getDeathDiagnosis(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_DEATH_DIAGNOSIS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(87));
      try
      {
        GET_DEATH_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_DEATH_DIAGNOSIS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_DIAGNOSIS__EOCL_QRY);
    return (DeathDiagnosis) query.evaluate(nonhumanSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentBody) <em>Get Foodand Water Consumptions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_FOODAND_WATER_CONSUMPTIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Food and Water Consumption)).oclAsType(sdtm::Food and Water Consumption)";

  /**
   * The cached OCL query for the '{@link #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentBody) <em>Get Foodand Water Consumptions</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<FoodandWaterConsumption> getFoodandWaterConsumptions(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(88));
      try
      {
        GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY = helper.createQuery(GET_FOODAND_WATER_CONSUMPTIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<FoodandWaterConsumption> result = (Collection<FoodandWaterConsumption>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<FoodandWaterConsumption>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Laboratory Test Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non-human Laboratory Test Result)).oclAsType(sdtm::Non-human Laboratory Test Result)";

  /**
   * The cached OCL query for the '{@link #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentBody) <em>Get Nonhuman Laboratory Test Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<NonhumanLaboratoryTestResult> getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(89));
      try
      {
        GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<NonhumanLaboratoryTestResult> result = (Collection<NonhumanLaboratoryTestResult>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<NonhumanLaboratoryTestResult>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getMacroscopicFindings(NonhumanSubjectDataDocumentBody) <em>Get Macroscopic Findings</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacroscopicFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_MACROSCOPIC_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Macroscopic Finding)).oclAsType(sdtm::Macroscopic Finding)";

  /**
   * The cached OCL query for the '{@link #getMacroscopicFindings(NonhumanSubjectDataDocumentBody) <em>Get Macroscopic Findings</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacroscopicFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MACROSCOPIC_FINDINGS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<MacroscopicFinding> getMacroscopicFindings(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_MACROSCOPIC_FINDINGS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(90));
      try
      {
        GET_MACROSCOPIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_MACROSCOPIC_FINDINGS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MACROSCOPIC_FINDINGS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MacroscopicFinding> result = (Collection<MacroscopicFinding>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<MacroscopicFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getMicroscopicFindingss(NonhumanSubjectDataDocumentBody) <em>Get Microscopic Findingss</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicroscopicFindingss(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_MICROSCOPIC_FINDINGSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Microscopic Finding)).oclAsType(sdtm::Microscopic Finding)";

  /**
   * The cached OCL query for the '{@link #getMicroscopicFindingss(NonhumanSubjectDataDocumentBody) <em>Get Microscopic Findingss</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMicroscopicFindingss(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MICROSCOPIC_FINDINGSS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<MicroscopicFinding> getMicroscopicFindingss(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_MICROSCOPIC_FINDINGSS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(91));
      try
      {
        GET_MICROSCOPIC_FINDINGSS__EOCL_QRY = helper.createQuery(GET_MICROSCOPIC_FINDINGSS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MICROSCOPIC_FINDINGSS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MicroscopicFinding> result = (Collection<MicroscopicFinding>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<MicroscopicFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getOrganMeasurements(NonhumanSubjectDataDocumentBody) <em>Get Organ Measurements</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganMeasurements(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_ORGAN_MEASUREMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Organ Measurement)).oclAsType(sdtm::Organ Measurement)";

  /**
   * The cached OCL query for the '{@link #getOrganMeasurements(NonhumanSubjectDataDocumentBody) <em>Get Organ Measurements</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganMeasurements(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ORGAN_MEASUREMENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<OrganMeasurement> getOrganMeasurements(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_ORGAN_MEASUREMENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(92));
      try
      {
        GET_ORGAN_MEASUREMENTS__EOCL_QRY = helper.createQuery(GET_ORGAN_MEASUREMENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ORGAN_MEASUREMENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<OrganMeasurement> result = (Collection<OrganMeasurement>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<OrganMeasurement>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPalpableMasss(NonhumanSubjectDataDocumentBody) <em>Get Palpable Masss</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPalpableMasss(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PALPABLE_MASSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Palpable Mass)).oclAsType(sdtm::Palpable Mass)";

  /**
   * The cached OCL query for the '{@link #getPalpableMasss(NonhumanSubjectDataDocumentBody) <em>Get Palpable Masss</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPalpableMasss(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PALPABLE_MASSS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<PalpableMass> getPalpableMasss(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_PALPABLE_MASSS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(93));
      try
      {
        GET_PALPABLE_MASSS__EOCL_QRY = helper.createQuery(GET_PALPABLE_MASSS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PALPABLE_MASSS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PalpableMass> result = (Collection<PalpableMass>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<PalpableMass>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentBody) <em>Get Pharmacokinetic Concentration Findings</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pharmacokinetic Concentration Finding)).oclAsType(sdtm::Pharmacokinetic Concentration Finding)";

  /**
   * The cached OCL query for the '{@link #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentBody) <em>Get Pharmacokinetic Concentration Findings</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<PharmacokineticConcentrationFinding> getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(94));
      try
      {
        GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PharmacokineticConcentrationFinding> result = (Collection<PharmacokineticConcentrationFinding>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<PharmacokineticConcentrationFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentBody) <em>Get Pharmacokinetic Parameter Findings</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding)).oclAsType(sdtm::Pharmacokinetic Parameter Finding)";

  /**
   * The cached OCL query for the '{@link #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentBody) <em>Get Pharmacokinetic Parameter Findings</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(95));
      try
      {
        GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PharmacokineticParameterFinding> result = (Collection<PharmacokineticParameterFinding>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<PharmacokineticParameterFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getSubjectCharacteristics(NonhumanSubjectDataDocumentBody) <em>Get Subject Characteristics</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectCharacteristics(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_SUBJECT_CHARACTERISTICS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Subject Characteristic)).oclAsType(sdtm::Subject Characteristic)";

  /**
   * The cached OCL query for the '{@link #getSubjectCharacteristics(NonhumanSubjectDataDocumentBody) <em>Get Subject Characteristics</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectCharacteristics(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SUBJECT_CHARACTERISTICS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<SubjectCharacteristic> getSubjectCharacteristics(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_SUBJECT_CHARACTERISTICS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(96));
      try
      {
        GET_SUBJECT_CHARACTERISTICS__EOCL_QRY = helper.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SubjectCharacteristic> result = (Collection<SubjectCharacteristic>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<SubjectCharacteristic>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getTumorFindings(NonhumanSubjectDataDocumentBody) <em>Get Tumor Findings</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTumorFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_TUMOR_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Tumor Finding)).oclAsType(sdtm::Tumor Finding)";

  /**
   * The cached OCL query for the '{@link #getTumorFindings(NonhumanSubjectDataDocumentBody) <em>Get Tumor Findings</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTumorFindings(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TUMOR_FINDINGS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<TumorFinding> getTumorFindings(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_TUMOR_FINDINGS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(97));
      try
      {
        GET_TUMOR_FINDINGS__EOCL_QRY = helper.createQuery(GET_TUMOR_FINDINGS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUMOR_FINDINGS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TumorFinding> result = (Collection<TumorFinding>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<TumorFinding>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getVitalSigns(NonhumanSubjectDataDocumentBody) <em>Get Vital Signs</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSigns(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_VITAL_SIGNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Vital Sign)).oclAsType(sdtm::Vital Sign)";

  /**
   * The cached OCL query for the '{@link #getVitalSigns(NonhumanSubjectDataDocumentBody) <em>Get Vital Signs</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSigns(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<VitalSign> getVitalSigns(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_VITAL_SIGNS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(98));
      try
      {
        GET_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<VitalSign> result = (Collection<VitalSign>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<VitalSign>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getECGTestResults(NonhumanSubjectDataDocumentBody) <em>Get ECG Test Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_ECG_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECG Test Result)).oclAsType(sdtm::ECG Test Result)";

  /**
   * The cached OCL query for the '{@link #getECGTestResults(NonhumanSubjectDataDocumentBody) <em>Get ECG Test Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(NonhumanSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ECG_TEST_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<ECGTestResult> getECGTestResults(NonhumanSubjectDataDocumentBody nonhumanSubjectDataDocumentBody)
  {
    if (GET_ECG_TEST_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(99));
      try
      {
        GET_ECG_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_ECG_TEST_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ECG_TEST_RESULTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ECGTestResult> result = (Collection<ECGTestResult>) query.evaluate(nonhumanSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<ECGTestResult>(result.size(), result.toArray());
  }

} // NonhumanSubjectDataDocumentBodyOperations