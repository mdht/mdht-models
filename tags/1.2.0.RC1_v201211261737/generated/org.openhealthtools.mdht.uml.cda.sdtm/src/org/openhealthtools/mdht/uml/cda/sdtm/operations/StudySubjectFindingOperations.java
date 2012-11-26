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

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudySubjectFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.103')";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingTemplateId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingTemplateId(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingId(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingId(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingStatusCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingMethodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingMethodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingInterpretationCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingTargetSiteCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingTargetSiteCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingReferenceRangeAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Reference Range Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingReferenceRangeAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->one(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingReferenceRangeAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Reference Range Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingReferenceRangeAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingReferenceRangeAssociation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingReferenceRangeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingNonPerformanceReason(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingFastingAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingFastingAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingFastingAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingFastingAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingFastingAssociation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingFastingAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingToxicityAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingToxicityAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingToxicityAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingToxicityAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingToxicityAssociation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingGroupIdentifier(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingGroupIdentifier(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingSpecimenInformation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingSpecimenInformation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingResultCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingResultCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingResultCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingResultCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingResultCategoryAssociation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingResultSubCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingResultSubCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingResultSubCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingResultSubCategoryAssociation(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingResultSubCategoryAssociation(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((interpretationCode.oclIsUndefined() or interpretationCode.isNullFlavorUndefined()) implies (not interpretationCode.oclIsUndefined() and interpretationCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = interpretationCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.83'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN.CRT)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::PQR)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationreferenceRangeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingreferenceRangeAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::REFV)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingreferenceRangeAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingreferenceRangeAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingreferenceRangeAssociationTypeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingreferenceRangeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationfastingStatusClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationfastingStatusClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationfastingStatusCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationfastingStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationfastingStatusCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationfastingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationfastingStatusMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BN))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationfastingStatusValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationfastingStatusValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationfastingStatusValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationfastingStatusValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingfastingAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingfastingAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingfastingAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingfastingAssociationTypeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingfastingAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationtoxicityGradeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingtoxicityAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingtoxicityAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingtoxicityAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingtoxicityAssociationTypeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingtoxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultCategoryAssociationresultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultCategoryAssociationresultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultCategoryAssociationresultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultCategoryAssociationresultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultCategoryAssociationTypeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationTypeCode(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationTypeCode(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Result Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Result Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(StudySubjectFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectFinding The receiving '<em><b>Study Subject Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(StudySubjectFinding studySubjectFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING);
      try
      {
        VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_FINDING__STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectFindingresultSubCategoryAssociationResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectFinding, context) }),
             new Object [] { studySubjectFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(StudySubjectFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(StudySubjectFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(StudySubjectFinding studySubjectFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(100));
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
    return (NonPerformanceReason) query.evaluate(studySubjectFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(StudySubjectFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(StudySubjectFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(StudySubjectFinding studySubjectFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(101));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(studySubjectFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(StudySubjectFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(StudySubjectFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(StudySubjectFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(StudySubjectFinding studySubjectFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_FINDING, SdtmPackage.Literals.STUDY_SUBJECT_FINDING.getEAllOperations().get(102));
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
    return (SpecimenInformation) query.evaluate(studySubjectFinding);
  }

} // StudySubjectFindingOperations