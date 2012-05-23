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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microbiology Specimen Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingBaselineIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingDerivedDataIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Derived Data Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getBaselineIndicator() <em>Get Baseline Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getDerivedDataIndicator() <em>Get Derived Data Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicrobiologySpecimenFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicrobiologySpecimenFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingTemplateId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingTemplateId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.38')";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingTemplateId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingTemplateId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.38')
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingTemplateId(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingClassCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingClassCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingClassCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingClassCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingClassCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingId(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingId(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingMethodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Method Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMethodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingMethodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Method Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMethodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingMethodCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingMoodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMoodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingMoodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMoodCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingMoodCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingStatusCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingStatusCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingStatusCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingStatusCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingStatusCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingValue(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingValue(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingValue(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingValue(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingValue(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingGroupIdentifier(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingGroupIdentifier(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingGroupIdentifier(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingGroupIdentifier(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingGroupIdentifier(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingNonPerformanceReason(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingNonPerformanceReason(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingNonPerformanceReason(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingNonPerformanceReason(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingNonPerformanceReason(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingSpecimenInformation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingSpecimenInformation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingSpecimenInformation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingSpecimenInformation(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingSpecimenInformation(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingBaselineIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingBaselineIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingBaselineIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Baseline Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingBaselineIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Baseline Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingBaselineIndicator(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_BASELINE_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingBaselineIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingDerivedDataIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingDerivedDataIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingDerivedDataIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Derived Data Indicator</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingDerivedDataIndicator(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Derived Data Indicator) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingDerivedDataIndicator(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDING_DERIVED_DATA_INDICATOR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingDerivedDataIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(MicrobiologySpecimenFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(MicrobiologySpecimenFinding microbiologySpecimenFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING);
      try
      {
        VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microbiologySpecimenFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MICROBIOLOGY_SPECIMEN_FINDING__MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySpecimenFinding, context) }),
             new Object [] { microbiologySpecimenFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(MicrobiologySpecimenFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(MicrobiologySpecimenFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(MicrobiologySpecimenFinding microbiologySpecimenFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING, SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING.getEAllOperations().get(67));
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
    return (GroupIdentifier) query.evaluate(microbiologySpecimenFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(MicrobiologySpecimenFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(MicrobiologySpecimenFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(MicrobiologySpecimenFinding microbiologySpecimenFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING, SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING.getEAllOperations().get(68));
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
    return (NonPerformanceReason) query.evaluate(microbiologySpecimenFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(MicrobiologySpecimenFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(MicrobiologySpecimenFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(MicrobiologySpecimenFinding microbiologySpecimenFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING, SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING.getEAllOperations().get(69));
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
    return (SpecimenInformation) query.evaluate(microbiologySpecimenFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getBaselineIndicator(MicrobiologySpecimenFinding) <em>Get Baseline Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_BASELINE_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)";

  /**
   * The cached OCL query for the '{@link #getBaselineIndicator(MicrobiologySpecimenFinding) <em>Get Baseline Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaselineIndicator(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BASELINE_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Baseline Indicator))->asSequence()->first().oclAsType(sdtm::Baseline Indicator)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BaselineIndicator getBaselineIndicator(MicrobiologySpecimenFinding microbiologySpecimenFinding)
  {
    if (GET_BASELINE_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING, SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING.getEAllOperations().get(70));
      try
      {
        GET_BASELINE_INDICATOR__EOCL_QRY = helper.createQuery(GET_BASELINE_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BASELINE_INDICATOR__EOCL_QRY);
    return (BaselineIndicator) query.evaluate(microbiologySpecimenFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDerivedDataIndicator(MicrobiologySpecimenFinding) <em>Get Derived Data Indicator</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DERIVED_DATA_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)";

  /**
   * The cached OCL query for the '{@link #getDerivedDataIndicator(MicrobiologySpecimenFinding) <em>Get Derived Data Indicator</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedDataIndicator(MicrobiologySpecimenFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DERIVED_DATA_INDICATOR__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Derived Data Indicator))->asSequence()->first().oclAsType(sdtm::Derived Data Indicator)
   * @param microbiologySpecimenFinding The receiving '<em><b>Microbiology Specimen Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedDataIndicator getDerivedDataIndicator(MicrobiologySpecimenFinding microbiologySpecimenFinding)
  {
    if (GET_DERIVED_DATA_INDICATOR__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING, SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING.getEAllOperations().get(71));
      try
      {
        GET_DERIVED_DATA_INDICATOR__EOCL_QRY = helper.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DERIVED_DATA_INDICATOR__EOCL_QRY);
    return (DerivedDataIndicator) query.evaluate(microbiologySpecimenFinding);
  }

} // MicrobiologySpecimenFindingOperations