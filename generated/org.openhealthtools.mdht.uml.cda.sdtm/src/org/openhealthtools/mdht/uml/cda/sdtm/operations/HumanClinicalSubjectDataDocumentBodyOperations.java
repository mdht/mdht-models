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

import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Data Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubstanceUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Substance Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Protocol Deviation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Clinical Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Exposure Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getHumanClinicalSubjectDemographics() <em>Get Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getHumanClinicalVisits() <em>Get Human Clinical Visits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getHumanClinicalStudyArm() <em>Get Human Clinical Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubstanceUses() <em>Get Substance Uses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getDispositions() <em>Get Dispositions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getMedicalHistories() <em>Get Medical Histories</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getProtocolDeviations() <em>Get Protocol Deviations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getClinicalEvents() <em>Get Clinical Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubjectCharacteristic() <em>Get Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getPharmacokineticParameterFinding() <em>Get Pharmacokinetic Parameter Finding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDataDocumentBodyOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalSubjectDataDocumentBodyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyTemplateId(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyTemplateId(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.13')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyTemplateId(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyTemplateId(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.13')
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyTemplateId(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyClassCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyClassCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyClassCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyClassCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyClassCode(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyCode(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyCodeP(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyCodeP(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyCodeP(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyCodeP(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyCodeP(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyMoodCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyMoodCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyMoodCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyMoodCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyMoodCode(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Subject Demographics</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(sdtm::Human Clinical Subject Demographics) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Subject Demographics</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(sdtm::Human Clinical Subject Demographics) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Visit</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(sdtm::Visit) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Visit</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(sdtm::Visit) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyHumanClinicalVisit", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Study Arm</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Study Arm) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Study Arm</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Study Arm) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_STUDY_ARM,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyHumanClinicalStudyArm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubjectElement(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Element</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubjectElement(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Subject Element) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubjectElement(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Element</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubjectElement(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Subject Element) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodySubjectElement(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodySubjectElement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubstanceUse(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Substance Use</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubstanceUse(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::Substance Use) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubstanceUse(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Substance Use</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubstanceUse(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::Substance Use) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodySubstanceUse(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodySubstanceUse", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyDisposition(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Disposition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyDisposition(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Human Clinical Disposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyDisposition(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Disposition</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyDisposition(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::Human Clinical Disposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyDisposition(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyDisposition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Medical History</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Medical History Item) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Medical History</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Medical History Item) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyMedicalHistory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Protocol Deviation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Protocol Deviation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Protocol Deviation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Protocol Deviation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyProtocolDeviation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Clinical Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Clinical Event) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Clinical Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Clinical Event) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyClinicalEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyECGTestResult(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body ECG Test Result</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyECGTestResult(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ECG Test Result) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyECGTestResult(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body ECG Test Result</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyECGTestResult(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ECG Test Result) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyECGTestResult(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyECGTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Characteristic</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Subject Characteristic) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Characteristic</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Subject Characteristic) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodySubjectCharacteristic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Pharmacokinetic Parameter Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Pharmacokinetic Parameter Finding</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.->reject(isDefined('typeCode'))
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Exposure Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(substanceAdministration->one(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::Human Clinical Exposure)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Exposure Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.->reject(substanceAdministration->one(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::Human Clinical Exposure)))
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentBody, context) }),
             new Object [] { humanClinicalSubjectDataDocumentBody }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Subject Demographics</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(sdtm::Human Clinical Subject Demographics))->asSequence()->first().oclAsType(sdtm::Human Clinical Subject Demographics)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Subject Demographics</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(sdtm::Human Clinical Subject Demographics))->asSequence()->first().oclAsType(sdtm::Human Clinical Subject Demographics)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  HumanClinicalSubjectDemographics getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(74));
      try
      {
        GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY);
    return (HumanClinicalSubjectDemographics) query.evaluate(humanClinicalSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Visits</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_VISITS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(sdtm::Visit)).oclAsType(sdtm::Visit)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Visits</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_VISITS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(sdtm::Visit)).oclAsType(sdtm::Visit)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<Visit> getHumanClinicalVisits(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_HUMAN_CLINICAL_VISITS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(75));
      try
      {
        GET_HUMAN_CLINICAL_VISITS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_VISITS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_VISITS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<Visit> result = (Collection<Visit>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<Visit>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Study Arm</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Arm))->asSequence()->first().oclAsType(sdtm::Study Arm)";

  /**
   * The cached OCL query for the '{@link #getHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody) <em>Get Human Clinical Study Arm</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Arm))->asSequence()->first().oclAsType(sdtm::Study Arm)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  StudyArm getHumanClinicalStudyArm(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(76));
      try
      {
        GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_STUDY_ARM__EOCL_QRY);
    return (StudyArm) query.evaluate(humanClinicalSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getSubjectElements(HumanClinicalSubjectDataDocumentBody) <em>Get Subject Elements</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectElements(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_SUBJECT_ELEMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Subject Element)).oclAsType(sdtm::Subject Element)";

  /**
   * The cached OCL query for the '{@link #getSubjectElements(HumanClinicalSubjectDataDocumentBody) <em>Get Subject Elements</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectElements(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SUBJECT_ELEMENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Subject Element)).oclAsType(sdtm::Subject Element)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<SubjectElement> getSubjectElements(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_SUBJECT_ELEMENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(77));
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
    Collection<SubjectElement> result = (Collection<SubjectElement>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<SubjectElement>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getSubstanceUses(HumanClinicalSubjectDataDocumentBody) <em>Get Substance Uses</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstanceUses(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_SUBSTANCE_USES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::Substance Use)).oclAsType(sdtm::Substance Use)";

  /**
   * The cached OCL query for the '{@link #getSubstanceUses(HumanClinicalSubjectDataDocumentBody) <em>Get Substance Uses</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstanceUses(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SUBSTANCE_USES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::Substance Use)).oclAsType(sdtm::Substance Use)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<SubstanceUse> getSubstanceUses(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_SUBSTANCE_USES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(78));
      try
      {
        GET_SUBSTANCE_USES__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_USES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_USES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SubstanceUse> result = (Collection<SubstanceUse>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<SubstanceUse>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getDispositions(HumanClinicalSubjectDataDocumentBody) <em>Get Dispositions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDispositions(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_DISPOSITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Human Clinical Disposition)).oclAsType(sdtm::Human Clinical Disposition)";

  /**
   * The cached OCL query for the '{@link #getDispositions(HumanClinicalSubjectDataDocumentBody) <em>Get Dispositions</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDispositions(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DISPOSITIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Human Clinical Disposition)).oclAsType(sdtm::Human Clinical Disposition)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<HumanClinicalDisposition> getDispositions(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_DISPOSITIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(79));
      try
      {
        GET_DISPOSITIONS__EOCL_QRY = helper.createQuery(GET_DISPOSITIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DISPOSITIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<HumanClinicalDisposition> result = (Collection<HumanClinicalDisposition>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<HumanClinicalDisposition>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getMedicalHistories(HumanClinicalSubjectDataDocumentBody) <em>Get Medical Histories</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicalHistories(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_MEDICAL_HISTORIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Medical History Item)).oclAsType(sdtm::Medical History Item)";

  /**
   * The cached OCL query for the '{@link #getMedicalHistories(HumanClinicalSubjectDataDocumentBody) <em>Get Medical Histories</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicalHistories(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MEDICAL_HISTORIES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Medical History Item)).oclAsType(sdtm::Medical History Item)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<MedicalHistoryItem> getMedicalHistories(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_MEDICAL_HISTORIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(80));
      try
      {
        GET_MEDICAL_HISTORIES__EOCL_QRY = helper.createQuery(GET_MEDICAL_HISTORIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_HISTORIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicalHistoryItem> result = (Collection<MedicalHistoryItem>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<MedicalHistoryItem>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getProtocolDeviations(HumanClinicalSubjectDataDocumentBody) <em>Get Protocol Deviations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocolDeviations(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PROTOCOL_DEVIATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Protocol Deviation)).oclAsType(sdtm::Protocol Deviation)";

  /**
   * The cached OCL query for the '{@link #getProtocolDeviations(HumanClinicalSubjectDataDocumentBody) <em>Get Protocol Deviations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocolDeviations(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PROTOCOL_DEVIATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Protocol Deviation)).oclAsType(sdtm::Protocol Deviation)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<ProtocolDeviation> getProtocolDeviations(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_PROTOCOL_DEVIATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(81));
      try
      {
        GET_PROTOCOL_DEVIATIONS__EOCL_QRY = helper.createQuery(GET_PROTOCOL_DEVIATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROTOCOL_DEVIATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ProtocolDeviation> result = (Collection<ProtocolDeviation>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<ProtocolDeviation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getClinicalEvents(HumanClinicalSubjectDataDocumentBody) <em>Get Clinical Events</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClinicalEvents(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CLINICAL_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Clinical Event)).oclAsType(sdtm::Clinical Event)";

  /**
   * The cached OCL query for the '{@link #getClinicalEvents(HumanClinicalSubjectDataDocumentBody) <em>Get Clinical Events</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClinicalEvents(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CLINICAL_EVENTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Clinical Event)).oclAsType(sdtm::Clinical Event)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<ClinicalEvent> getClinicalEvents(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_CLINICAL_EVENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(82));
      try
      {
        GET_CLINICAL_EVENTS__EOCL_QRY = helper.createQuery(GET_CLINICAL_EVENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CLINICAL_EVENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ClinicalEvent> result = (Collection<ClinicalEvent>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<ClinicalEvent>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getECGTestResults(HumanClinicalSubjectDataDocumentBody) <em>Get ECG Test Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_ECG_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECG Test Result)).oclAsType(sdtm::ECG Test Result)";

  /**
   * The cached OCL query for the '{@link #getECGTestResults(HumanClinicalSubjectDataDocumentBody) <em>Get ECG Test Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getECGTestResults(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ECG_TEST_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECG Test Result)).oclAsType(sdtm::ECG Test Result)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<ECGTestResult> getECGTestResults(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_ECG_TEST_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(83));
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
    Collection<ECGTestResult> result = (Collection<ECGTestResult>) query.evaluate(humanClinicalSubjectDataDocumentBody);
    return new BasicEList.UnmodifiableEList<ECGTestResult>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getSubjectCharacteristic(HumanClinicalSubjectDataDocumentBody) <em>Get Subject Characteristic</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectCharacteristic(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_SUBJECT_CHARACTERISTIC__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Subject Characteristic))->asSequence()->first().oclAsType(sdtm::Subject Characteristic)";

  /**
   * The cached OCL query for the '{@link #getSubjectCharacteristic(HumanClinicalSubjectDataDocumentBody) <em>Get Subject Characteristic</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjectCharacteristic(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SUBJECT_CHARACTERISTIC__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Subject Characteristic))->asSequence()->first().oclAsType(sdtm::Subject Characteristic)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  SubjectCharacteristic getSubjectCharacteristic(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_SUBJECT_CHARACTERISTIC__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(84));
      try
      {
        GET_SUBJECT_CHARACTERISTIC__EOCL_QRY = helper.createQuery(GET_SUBJECT_CHARACTERISTIC__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_CHARACTERISTIC__EOCL_QRY);
    return (SubjectCharacteristic) query.evaluate(humanClinicalSubjectDataDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody) <em>Get Pharmacokinetic Parameter Finding</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding))->asSequence()->first().oclAsType(sdtm::Pharmacokinetic Parameter Finding)";

  /**
   * The cached OCL query for the '{@link #getPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody) <em>Get Pharmacokinetic Parameter Finding</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pharmacokinetic Parameter Finding))->asSequence()->first().oclAsType(sdtm::Pharmacokinetic Parameter Finding)
   * @param humanClinicalSubjectDataDocumentBody The receiving '<em><b>Human Clinical Subject Data Document Body</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PharmacokineticParameterFinding getPharmacokineticParameterFinding(HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody)
  {
    if (GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY.getEAllOperations().get(85));
      try
      {
        GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDING__EOCL_QRY);
    return (PharmacokineticParameterFinding) query.evaluate(humanClinicalSubjectDataDocumentBody);
  }

} // HumanClinicalSubjectDataDocumentBodyOperations