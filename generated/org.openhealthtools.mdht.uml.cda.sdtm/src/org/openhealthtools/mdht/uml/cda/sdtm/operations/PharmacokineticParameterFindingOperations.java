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
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pharmacokinetic Parameter Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PharmacokineticParameterFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PharmacokineticParameterFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingTemplateId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingTemplateId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.40')";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingTemplateId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingTemplateId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.40')
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingTemplateId(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingClassCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingClassCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingClassCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingClassCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingClassCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingId(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingId(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingMoodCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingMoodCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingMoodCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingMoodCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingMoodCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingStatusCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingStatusCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingStatusCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingStatusCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingStatusCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingValue(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingValue(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingValue(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingValue(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingValue(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingGroupIdentifier(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingGroupIdentifier(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingGroupIdentifier(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingGroupIdentifier(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingGroupIdentifier(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingSpecimenInformation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingSpecimenInformation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingSpecimenInformation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingSpecimenInformation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingSpecimenInformation(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingNonPerformanceReason(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingNonPerformanceReason(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingNonPerformanceReason(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingNonPerformanceReason(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingNonPerformanceReason(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingTimingReference(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingTimingReference(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingTimingReference(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingTimingReference(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingTimingReference(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(PharmacokineticParameterFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(PharmacokineticParameterFinding pharmacokineticParameterFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING);
      try
      {
        VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pharmacokineticParameterFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PHARMACOKINETIC_PARAMETER_FINDING__PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticParameterFinding, context) }),
             new Object [] { pharmacokineticParameterFinding }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(PharmacokineticParameterFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(PharmacokineticParameterFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(PharmacokineticParameterFinding pharmacokineticParameterFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING.getEAllOperations().get(64));
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
    return (GroupIdentifier) query.evaluate(pharmacokineticParameterFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(PharmacokineticParameterFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(PharmacokineticParameterFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->first().oclAsType(sdtm::Specimen Information)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(PharmacokineticParameterFinding pharmacokineticParameterFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING.getEAllOperations().get(65));
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
    return (SpecimenInformation) query.evaluate(pharmacokineticParameterFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(PharmacokineticParameterFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(PharmacokineticParameterFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(PharmacokineticParameterFinding pharmacokineticParameterFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING.getEAllOperations().get(66));
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
    return (NonPerformanceReason) query.evaluate(pharmacokineticParameterFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(PharmacokineticParameterFinding) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(PharmacokineticParameterFinding) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(PharmacokineticParameterFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->first().oclAsType(sdtm::Timing Reference)
   * @param pharmacokineticParameterFinding The receiving '<em><b>Pharmacokinetic Parameter Finding</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(PharmacokineticParameterFinding pharmacokineticParameterFinding)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING.getEAllOperations().get(67));
      try
      {
        GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
    return (TimingReference) query.evaluate(pharmacokineticParameterFinding);
  }

} // PharmacokineticParameterFindingOperations